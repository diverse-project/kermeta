package org.kermeta.kompren.texteditor.editors;

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
	private KomprenEditor textEditor;

	
	public EditorTextHover(final KomprenEditor editor) {
		super();
		textEditor = editor;
	}
	
	
	private IFile getFile() {
		return ((IFileEditorInput)textEditor.getEditorInput()).getFile();
	}

	
	@Override
	public String getHoverInfo(final ITextViewer textViewer, final IRegion hoverRegion) {
		try{
			final IMarker[] markers = getFile().findMarkers(IMarker.PROBLEM, true, 2);

			for (int i=0; i<markers.length; i++) {
				int start = MarkerUtilities.getCharStart(markers[i]);
				int end = MarkerUtilities.getCharEnd(markers[i]);
				int offset = hoverRegion.getOffset();
				
				if(offset >= start && offset <=end) 
					return MarkerUtilities.getMessage(markers[i]);
			}
		}catch(CoreException e) {
			System.err.println("error computing hover info : " + e.getMessage());
		}
		
		return null;
	}

	
	
	@Override
	public IRegion getHoverRegion(final ITextViewer textViewer, final int offset) {
		return new Region(offset, 0);
	}
}
