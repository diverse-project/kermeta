/* $Id: EditorTextHover.java,v 1.8 2008-06-24 11:49:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : EditorTextHover.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 feb. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package org.kermeta.texteditor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;
import fr.irisa.triskell.traceability.helper.Tracer;


/**
 * @author Franck Fleurey
 */
public class EditorTextHover implements ITextHover {//, ITextHoverExtension, IInformationControlCreator {

	private KermetaTextEditor textEditor;
	
	//////////////////////////
	//////////////////////////
	//		Constructor		//
	//////////////////////////
	//////////////////////////	
	public EditorTextHover(KermetaTextEditor editor) {
		super();
		textEditor = editor;		
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Constructor		//
	//////////////////////////////////
	//////////////////////////////////

	private KermetaUnit getKermetaUnit() {
		return textEditor.getKermetaUnit();
	}
	
	private IFile getFile() {
		return ((IFileEditorInput) textEditor.getEditorInput()).getFile();
	}
	
   /* public IInformationControlCreator getHoverControlCreator() {
        return this;
    }
    
    public IInformationControl createInformationControl(Shell parent) {
        KermetaInformationControl result = new KermetaInformationControl(parent);
        return result; 
    }*/
    
    KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
    
	/**
	 * @see org.eclipse.jface.text.ITextHover#getHoverInfo(org.eclipse.jface.text.ITextViewer, org.eclipse.jface.text.IRegion)
	 * @returns the String that appears in the popup bubble on an element focused
	 * by the cursor. 
	 */
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		
		try {
			IMarker[] markers = getFile().findMarkers(KermetaMarkersHelper.getMarkerType(), true, 2);
			for (int i=0; i<markers.length; i++) {
				int start = MarkerUtilities.getCharStart(markers[i]);
				int end = MarkerUtilities.getCharEnd(markers[i]);
				int offset = hoverRegion.getOffset();
				if (offset >= start && offset <=end) return MarkerUtilities.getMessage(markers[i]);
			}
		} catch (CoreException e) {
			TexteditorPlugin.pluginLog.warn("error computing hover info", e);
		}
		
		Tracer tracer = null;
		if ( getKermetaUnit() != null )
			tracer = getKermetaUnit().getTracer();
		if(tracer == null) 
			return null; // ignore hover if there is no tracer (this may occur if the load of the unit failed due to an internal error)
		
		// find the best Model Reference for the given region
		TextReference textRef = tracer.getShortestContainingTextReference(hoverRegion.getOffset(), hoverRegion.getLength(), getKermetaUnit().getUri());
		if(textRef == null) return null; // nothing to be presented in the hover
		ModelReference modelRef =ModelReferenceHelper.getOneNextReference(textRef);
		
		// Notify other plugin of this event
		for ( KermetaEditorEventListener listener :TexteditorPlugin.getDefault().kermetaEditorEventListeners ) {
			try {
				if(modelRef.getRefObject() instanceof Object)
					listener.textHoverCalled((Object) modelRef.getRefObject());
			} catch ( Exception e ) {
				TexteditorPlugin.pluginLog.error("Not able to notify one of the kermetaEditorEventListeners", e);
			}
		}
		
		if ( modelRef != null ) {
			EObject o = modelRef.getRefObject();
			TextHoverLabelProvider provider = new TextHoverLabelProvider();
			return (String) provider.accept(o);
		} else
			return null;
	}

	/**
	 * @see org.eclipse.jface.text.ITextHover#getHoverRegion(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

}
