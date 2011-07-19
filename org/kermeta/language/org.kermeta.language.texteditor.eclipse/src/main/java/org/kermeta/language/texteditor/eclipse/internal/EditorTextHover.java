package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.texteditor.MarkerUtilities;

public class EditorTextHover implements ITextHover {

	private KermetaEditor textEditor;

	public EditorTextHover(KermetaEditor editor) {
		super();
		textEditor = editor;
	}
	
	private IFile getFile() {
		return ((IFileEditorInput) textEditor.getEditorInput()).getFile();
	}

	
	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {

		try {
			IMarker[] markers = getFile().findMarkers(/*KermetaMarkersHelper.getMarkerType()*/IMarker.PROBLEM, true, 2);
			for (int i=0; i<markers.length; i++) {
				int start = MarkerUtilities.getCharStart(markers[i]);
				int end = MarkerUtilities.getCharEnd(markers[i]);
				int offset = hoverRegion.getOffset();
				if (offset >= start && offset <=end) return MarkerUtilities.getMessage(markers[i]);
			}
		} catch (CoreException e) {
			//TexteditorPlugin.pluginLog.warn("error computing hover info", e);
			System.err.println("error computing hover info : " + e.getMessage());
		}
		
		/*
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
		*/
		/*
		if ( modelRef != null ) {
			EObject o = modelRef.getRefObject();
			TextHoverLabelProvider provider = new TextHoverLabelProvider();
			return (String) provider.accept(o);
		} else {
			return null;
		}*/
		
		return null;
	
	}

	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

}
