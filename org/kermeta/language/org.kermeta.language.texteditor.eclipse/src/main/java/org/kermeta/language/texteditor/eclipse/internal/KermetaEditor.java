package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.ui.editors.text.TextEditor;

public class KermetaEditor extends TextEditor {

	private KermetaColorManager colorManager;
	
	public KermetaEditor(){
		super();
		colorManager = new KermetaColorManager();

		setSourceViewerConfiguration(new KermetaEditorConfiguration(this, colorManager));
		setDocumentProvider(new org.eclipse.ui.editors.text.TextFileDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	
}
