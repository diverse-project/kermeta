package org.kermeta.kompren.texteditor.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;

public class KomprenEditor extends TextEditor {

	private ColorManager colorManager;

	public KomprenEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new KomprenEditorConfiguration(this, colorManager));
		setDocumentProvider(new TextFileDocumentProvider());
	}
	
	
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	
    public IFile getFile() {
    	if(getEditorInput() instanceof IFileEditorInput)
            return ((IFileEditorInput)getEditorInput()).getFile();
    	return null;
    }
}
