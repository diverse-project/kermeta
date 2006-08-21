package fr.irisa.triskell.kermeta.builders;

import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.compilationunit.CompilationUnitManager;;

public class KermetaProjectBuilder extends IncrementalProjectBuilder {

	//protected CompilationUnitManager compileManager; 
	
	public KermetaProjectBuilder() 
	{
		super();
		// Create the compilation unit manager
		//compileManager = new CompilationUnitManager();
	}
	
	class DeltaVisitor implements IResourceDeltaVisitor {
		/**
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			if (delta.getKind() == IResourceDelta.ADDED)
				checkResource(resource);
			else if (delta.getKind() == IResourceDelta.REMOVED)
			{ // handle removed resource 
			}
			else if (delta.getKind() == IResourceDelta.CHANGED)
			{
				// handle changed resource (when user saves, we arrive here)
				checkResource(resource);
			}
			//return true to continue visiting children.
			return true;
		}
		
		
	}

	class ResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkResource(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	class XMLErrorHandler extends DefaultHandler {
		
		private IFile file;

		public XMLErrorHandler(IFile file) {
			this.file = file;
		}

		private void addMarker(SAXParseException e, int severity) {
			KermetaProjectBuilder.this.addMarker(file, e.getMessage(), e
					.getLineNumber(), severity);
		}

		public void error(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void fatalError(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void warning(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_WARNING);
		}
	}

	public static final String BUILDER_ID = "fr.irisa.triskell.kermeta.kermetaProjectBuilder";

	private static final String MARKER_TYPE = "fr.irisa.triskell.kermeta.kermetaProblem";

	private SAXParserFactory parserFactory;

	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			//System.out.println("full build: " );
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			//System.out.println("delta: " + delta);
			if (delta == null) {
				//System.out.println("fbuild? " + kind);
				fullBuild(monitor);
			} else {
				//System.out.println("ibuild? " + kind);
				incrementalBuild(delta, monitor);
			}
		}
		return new IProject[] { getProject() };
	}

	/** (was parseXML in the example)
	 * */
	void checkResource(IResource resource) {
		//String extension = resource.getFileExtension();
		if (resource instanceof IFile && resource.getName().endsWith(".kmt")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
// ex:			XMLErrorHandler reporter = new XMLErrorHandler(file);
			try {
				
// ex:			getParser().parse(file.getContents(), reporter);
			} catch (Exception e1) {
			}
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			//System.out.println("Full Build!!! : " + getProject());
			getProject().accept(new ResourceVisitor());
		} catch (CoreException e) {
		}
	}
/*
	private SAXParser getParser() throws ParserConfigurationException,
			SAXException {
		if (parserFactory == null) {
			parserFactory = SAXParserFactory.newInstance();
		}
		return parserFactory.newSAXParser();
	}
*/
	
	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new DeltaVisitor());
		// delta.getResource().getRawLocation();
	}

	/** (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#startupOnInitialize()
	 */
	protected void startupOnInitialize() {
		// Auto-generated method stub
		super.startupOnInitialize();
	}

	/** (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		
		super.setInitializationData(config, propertyName, data);
	}
	
	/** 
	 * This method has a duplicate here : EditorReconcilingStrategy.parse in fr.irisa.triskell.kermeta.texteditor
	 * project
	 * Compile the file (previously saved)
	 * @return a KermetaUnit
	 */
	protected KermetaUnit compile(IFile file)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
        deleteMarkers(file);
        try {
        	// Create the CompilationUnit for the given file
/*        	if (compileManager.exists(file.getFullPath().toString()))
        	{
        		//System.err.println("IFile has a resource!");
        	}*/
	        //file.getFullPath().toString();
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error ", e);
        	if (result == null) {
        		e.printStackTrace();
        		return null;
        	}
        	else if (!result.messages.unitHasError)
        		result.messages.addMessage(new KMUnitError("INTERNAL ERROR : " + e, null, null));
        }
        // createMarkers(file)
        return result;
    }
	
	
}
