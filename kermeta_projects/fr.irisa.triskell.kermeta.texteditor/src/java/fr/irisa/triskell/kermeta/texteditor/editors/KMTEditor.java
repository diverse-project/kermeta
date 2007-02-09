/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.*;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.outline.KermetaOutline;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMTEditor extends TextEditor implements KermetaUnitInterest {
	
	protected KermetaUnit mcunit; 
	protected KermetaOutline outline;
	
	private File file = null;
	private KermetaProject project;
	
	private KermetaWorkspace workspace = KermetaWorkspace.getInstance();
	private ProjectionSupport projectionSupport;
	public ProjectionAnnotationModel annotationModel;
	
	/**
	 * Constructor
	 */
	public KMTEditor() {
		super();
		setSourceViewerConfiguration(new EditorConfiguration(this));
		TexteditorPlugin.getDefault().setEditor(this);
	}
	
	
	public void createPartControl(Composite parent) {
	    super.createPartControl(parent);
	    ProjectionViewer viewer =(ProjectionViewer)getSourceViewer();

	    projectionSupport = new ProjectionSupport(viewer,getAnnotationAccess(),getSharedColors());
	    projectionSupport.install();

	    //turn projection mode on
	    viewer.doOperation(ProjectionViewer.TOGGLE);

	    annotationModel = viewer.getProjectionAnnotationModel();
	}
	
	public ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler,
					getOverviewRuler(), isOverviewRulerVisible(), styles);

	   // ensure decoration support has been created and configured.
	   getSourceViewerDecorationSupport(viewer);

	   return viewer;
	}
	
	private KermetaProject getProject() {
		if ( project == null )
			project = KermetaWorkspace.getInstance().getKermetaProject( getFile().getProject() );
		return project;
	}
	
    public IFile getFile()
    {
    	
    	if(getEditorInput() instanceof IFileEditorInput)
        {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile();
        } else
        {
            return null;
        }
    }
    
    public Object getAdapter(Class type) {
    	   if (type == IContentOutlinePage.class) {
    	     // Installing Outline
    	     if (outline == null) outline = new KermetaOutline(this);
    	       return outline;                       
    	   }
    	   return super.getAdapter(type);
    	  }
	
	/**********************************
	 * 			ACTIONS
	 **********************************/
	
	private static final String RESOURCE_BUNDLE= "org.eclipse.ui.editors.text.TextEditorMessages";
	private static ResourceBundle fgResourceBundle= ResourceBundle.getBundle(RESOURCE_BUNDLE);

	protected void createActions() {
		super.createActions();
			
		IAction a= new TextOperationAction(fgResourceBundle, "ContentAssistProposal.", this, ISourceViewer.CONTENTASSIST_PROPOSALS); 
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("ContentAssistProposal", a); 
		
		a= new TextOperationAction(fgResourceBundle, "ContentAssistTip.", this, ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION); 
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
		setAction("ContentAssistTip", a); 
		
	}


	/**
	 * @return Returns the mcunit.
	 */
	public KermetaUnit getMcunit() {
		return mcunit;
	}
	/**
	 * @param mcunit The mcunit to set.
	 */
	protected void setMcunit(KMTUnit mcunit) {
		this.mcunit = mcunit;
		KermetaMarkersHelper.clearMarkers( getFile() );	
		KermetaMarkersHelper.createMarkers( getFile(), mcunit);
		if (outline != null)
			outline.update();
	}
	
	public void setFocus() {
		super.setFocus();
		
		
		
		//Shell theShell = new Shell();
    	//MessageDialog.openInformation(theShell,"setFocus","setFocus");
    	
		Iterator it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
		while(it.hasNext())
		{
			KermetaEditorEventListener listener = (KermetaEditorEventListener)it.next();
			listener.unitGotFocus(this);
		}
	}
	
	public fr.irisa.triskell.kermeta.language.structure.Object getFObjectForNode(KermetaASTNode node) {
        
        KermetaASTNode currentNode = node;
        fr.irisa.triskell.kermeta.language.structure.Object result = null;

        
        while (result == null && currentNode != null) {
            
            result = (fr.irisa.triskell.kermeta.language.structure.Object)this.mcunit.getModelElementByNode(currentNode);
            
            currentNode = (KermetaASTNode)currentNode.getParent();
            
        }
        return result;
    }

	
	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	/*public File getKPMFile() {
		if ( file == null) {
			file = getProject().getFile(getFile());
		}
		return file;
	}*/
	
	/*public KermetaWorkspace getWorkspace() {
		return workspace;
	}*/
	
	public KermetaUnit getUnit() {
		return mcunit;
	}
	
	public String getFileContent() {
		if ( getSourceViewer() == null )
			return null;
		else
			return getSourceViewer().getDocument().get();	
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Accessors		//
	//////////////////////////////////
	//////////////////////////////////
	
	public void updateKermetaUnit(KermetaUnit unit) {
		setMcunit( (KMTUnit) unit);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		KermetaWorkspace.getInstance().undeclareInterest(this);
	}

	@Override
	protected void performSave(boolean overwrite, IProgressMonitor progressMonitor) {
		KermetaWorkspace.getInstance().changer( this );
		super.performSave(overwrite, progressMonitor);
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		KMTEditor editor = this;
		KermetaWorkspace.getInstance().declareInterest(editor);
	}
	
}
