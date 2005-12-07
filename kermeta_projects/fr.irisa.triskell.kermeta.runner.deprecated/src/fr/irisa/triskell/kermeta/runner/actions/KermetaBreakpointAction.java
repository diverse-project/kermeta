/* $Id: KermetaBreakpointAction.java,v 1.2 2005-12-07 15:49:58 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaBreakpointAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 25, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.actions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.AbstractMarkerAnnotationModel;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.IUpdate;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaBreakpoint;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugModelPresentation;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
import fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.Type;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.traceability.helper.Tracer;
//import fr.irisa.triskell.kermeta.texteditor.editors.Editor;

/**
 * Action that is executed when user added a breakpoint
 * (a strong copy/paste : see org.eclipse.ui.editor.MarkerRulerAction)
 */
public class KermetaBreakpointAction extends Action implements IUpdate {

	
	private IVerticalRulerInfo ruler;
	private ITextEditor textEditor;
	private List markers;
	
	private String addLabel;
	private String removeLabel;
	
	public KermetaBreakpointAction(ITextEditor editor, IVerticalRulerInfo r) {
		ruler = r;
		textEditor = editor;
		addLabel = "Add Breakpoint"; 
		removeLabel = "Remove Breakpoint";
	}
	
	/** 
	 * @return the resource for which to create the marker or <code>null</code>
	 */
	protected IResource getResource() {
		IEditorInput input= textEditor.getEditorInput();
		IResource resource= (IResource) input.getAdapter(IFile.class);
		if (resource == null) {
			resource= (IResource) input.getAdapter(IResource.class);
		}		
		return resource;
	}
	
	/**
	 * Checks whether a position includes the ruler's line of activity.
	 *
	 * @param position the position to be checked
	 * @param document the document the position refers to
	 * @return <code>true</code> if the line is included by the given position
	 */
	protected boolean includesRulerLine(Position position, IDocument document) {
		if (position != null) {
			try {
				int markerLine= document.getLineOfOffset(position.getOffset());
				int line= ruler.getLineOfLastMouseButtonActivity();
				if (line == markerLine) {
					return true;
				}
			} catch (BadLocationException x) {
			}
		}
		return false;
	}
	
	/**
	 * @return this action's vertical ruler
	 */
	protected IVerticalRulerInfo getVerticalRulerInfo() {
		return ruler;
	}
	
	/**
	 * @return this action's editor
	 */
	protected ITextEditor getTextEditor() {
		return textEditor;
	}
	
	/**
	 * @return the marker annotation model of the editor's input.
	 */
	protected AbstractMarkerAnnotationModel getAnnotationModel() {
		IDocumentProvider provider= textEditor.getDocumentProvider();
		IAnnotationModel model= provider.getAnnotationModel(textEditor.getEditorInput());
		if (model instanceof AbstractMarkerAnnotationModel) {
			return (AbstractMarkerAnnotationModel) model;
		}
		return null;
	}
	
	/**
	 * @return the document of the editor's input
	 */
	protected IDocument getDocument() {
		IDocumentProvider provider= textEditor.getDocumentProvider();
		return provider.getDocument(textEditor.getEditorInput());
	}
	
	/**
	 * @see IUpdate#update()
	 */
	public void update() {
		markers= getMarkers();
		setText(markers.isEmpty() ? addLabel : removeLabel);
	}
	
	/**
	 * @see Action#run()
	 */
	public void run() {
		if (markers.isEmpty()) {
			addMarker();
		} else {
			removeMarkers(markers);
		}
	}
	
	protected List getMarkers() {
		
		List breakpoints= new ArrayList();
		
		IResource resource= getResource();
		IDocument document= getDocument();
		AbstractMarkerAnnotationModel model= getAnnotationModel();
		
		if (model != null) {
			try {
				
				IMarker[] markers= null;
				if (resource instanceof IFile)
					markers= resource.findMarkers(KermetaBreakpoint.BREAKPOINT_MARKER, true, IResource.DEPTH_INFINITE);
				else {
					IWorkspaceRoot root= ResourcesPlugin.getWorkspace().getRoot();
					markers= root.findMarkers(KermetaBreakpoint.BREAKPOINT_MARKER, true, IResource.DEPTH_INFINITE);
				}
				
				if (markers != null) {
					IBreakpointManager breakpointManager= DebugPlugin.getDefault().getBreakpointManager();
					for (int i= 0; i < markers.length; i++) {
						IBreakpoint breakpoint= breakpointManager.getBreakpoint(markers[i]);
						if (breakpoint != null && breakpointManager.isRegistered(breakpoint)) {
							Position pos = model.getMarkerPosition(markers[i]); 
							if (includesRulerLine(pos, document))
								breakpoints.add(markers[i]);
						}
					}
				}
			} catch (CoreException x) {
				// RunnerPlugin.log(IStatus.ERROR, "Unexpected getMarkers error", x);
				RunnerPlugin.log(x);
			}
		}
		return breakpoints;
	}
	
	protected void addMarker() {		
		try {
			IDocument document= getDocument();
			int rulerLine = getVerticalRulerInfo().getLineOfLastMouseButtonActivity();
			
			int lineNumber = rulerLine + 1;
			if (lineNumber < 0)
				return;
			//just to validate it
			document.getLineInformation(lineNumber - 1);
			IEditorInput editorInput= getTextEditor().getEditorInput();			
			final IResource resource = (IResource)editorInput.getAdapter(IResource.class);
			
			/*		if (resource == null)
			 throw new CoreException(PydevDebugPlugin.makeStatus(IStatus.ERROR, "Could not find resource to create marker on", null));
			 */
			final Map map = new HashMap();
			
			String functionName = getFunctionAboveLine(document, lineNumber-1);

			map.put(IMarker.TEXT, "what's the text");
			map.put(IMarker.MESSAGE, "what's the message");
			map.put(IMarker.LINE_NUMBER, new Integer(lineNumber));
			map.put(IBreakpoint.ENABLED, new Boolean(true));
			map.put(IBreakpoint.ID, KermetaDebugModelPresentation.KERMETA_DEBUG_MODEL_ID);
			if (functionName != null)
				map.put(KermetaBreakpoint.FUNCTION_NAME_PROP, functionName);

			/*if (functionName != null)
			 map.put(KermetaBreakpoint.FUNCTION_NAME_PROP, functionName);*/
			
			IWorkspaceRunnable r= new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					IMarker marker= resource.createMarker(KermetaBreakpoint.BREAKPOINT_MARKER);
					marker.setAttributes(map);
					KermetaBreakpoint br = new KermetaBreakpoint();
					br.setMarker(marker);
					IBreakpointManager breakpointManager= DebugPlugin.getDefault().getBreakpointManager();
					breakpointManager.addBreakpoint(br);
				}
			};
			
			resource.getWorkspace().run(r, null);
		} catch (BadLocationException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param document
	 * @param lineNumber
	 * @return
	 */
	private String getFunctionAboveLine(IDocument document, int lineNumber) {
		if (!(textEditor instanceof Editor))
			return null;
		KMTUnit mcunit = (KMTUnit)((Editor)textEditor).getMcunit();
		// Copied from EditorTextHover class
		if (mcunit != null && mcunit.getMctAST() != null) {
		    CompUnit unit = mcunit.getMctAST();
		    int [] interval = getCharAtLine(mcunit, lineNumber); 
		    KermetaASTNode astnode = 
		    (KermetaASTNode)unit.getNodeAt(interval[0], interval[1]);
		    //KermetaASTNode astnode = unit.
		    // TexteditorPlugin.pluginLog.info(" * unit -> " + unit);
		    if (astnode != null) {
		        //TexteditorPlugin.pluginLog.info(" * astnode -> " + astnode);
		        FObject fobj = ((Editor)textEditor).getFObjectForNode(astnode);

		        // Notify other plugin of this event
		        Iterator it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
				while(it.hasNext())
				{
					KermetaEditorEventListener listener = (KermetaEditorEventListener)it.next();
					listener.textHoverCalled(fobj);
				}
		        //TexteditorPlugin.pluginLog.info(" * fobj -> " + fobj);
		        if (fobj instanceof FExpression)
		        {
		            FExpression fexp = (FExpression)fobj;
	            	FObject fdef = null;
		            // Find the tag of the FCallFeature definition!
		            if (fexp instanceof FCallFeature)
		            {
		            	FCallFeature feature = (FCallFeature)fexp;
		        	    if (feature.getFStaticOperation() != null)
		        	        fdef = feature.getFStaticOperation();
		        	    if (feature.getFStaticProperty() != null)
		        	        fdef = feature.getFStaticProperty();
		        	    else 
		        	        fdef = feature;
		        	    return (String)new KM2KMTPrettyPrinter().accept(fdef);
		            }
		            /*
		            if (fexp.getFStaticType() != null) {
		                Type t = new SimpleType(fexp.getFStaticType());
		                //TexteditorPlugin.pluginLog.info(" * Type -> " + t);
		                // return the source code representation or the signature
		                // of the element pointed by the cursor
		                return (String)new KM2KMTPrettyPrinter().accept(fobj);//+ " : " + t;
		            }*/
		        }
		        else if(fobj instanceof FClass){
					FClass aClass = (FClass)fobj;
					return KMTHelper.getQualifiedName(aClass.getFClassDefinition());
		        }
		        
		    }
		}
		return null;

	}

	/** 
	 * We suppose that "0" is not a valid character number, 
	 * @param unit
	 * @param line
	 * @return an array of 2 int : begin char and end char
	 */
	private int[] getCharAtLine(KMTUnit unit, int line)
	{
		// Get start char at the given line
		int c; int bchar = 0; int echar = 0; int iline = 1;
        try
        {
            InputStream in = new URIConverterImpl( ).createInputStream(URI.createURI(unit.getUri()));
            while ((c = in.read()) != -1 && iline<=line) {
                bchar += 1;
                if (c=='\n') iline += 1;
            }
            // now get the end char of the found line:
            if (iline == line && c != -1)
            	while ((c = in.read()) != '\n') echar += 1;
            in.close();
        } catch (IOException e) { e.printStackTrace(); }
		return new int[] { bchar, echar };
	}

	
	
	protected void removeMarkers(List markers) {
		IBreakpointManager breakpointManager= DebugPlugin.getDefault().getBreakpointManager();
		try {
			Iterator e= markers.iterator();
			while (e.hasNext()) {
				IBreakpoint breakpoint= breakpointManager.getBreakpoint((IMarker) e.next());
				breakpointManager.removeBreakpoint(breakpoint, true);
			}
		} catch (CoreException e) {
			RunnerPlugin.log(e);
		}
	}
}
