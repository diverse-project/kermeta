package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.texteditor.eclipse.internal.autocompletion.BracketInserter;

public class KermetaEditor extends TextEditor {

	private KermetaColorManager colorManager;
	private BracketInserter fBracketInserter= null;
	
	public KermetaEditor(){
		super();
		colorManager = new KermetaColorManager();

		setSourceViewerConfiguration(new KermetaEditorConfiguration(this, colorManager));
		setDocumentProvider(new org.eclipse.ui.editors.text.TextFileDocumentProvider());
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ISourceViewer sourceViewer= getSourceViewer();
		fBracketInserter = new BracketInserter(sourceViewer);
		if (sourceViewer instanceof ITextViewerExtension)
			((ITextViewerExtension) sourceViewer).prependVerifyKeyListener(fBracketInserter);
	}

	public void dispose() {
		colorManager.dispose();
		ISourceViewer sourceViewer= getSourceViewer();
		if (sourceViewer instanceof ITextViewerExtension)
			((ITextViewerExtension) sourceViewer).removeVerifyKeyListener(fBracketInserter);	
		super.dispose();
	}

	@Override
	protected void firePropertyChange(int property) {
		super.firePropertyChange(property);
		if (property == KermetaEditor.PROP_DIRTY) {
			if (! this.isDirty()) {
				KermetaBuilder.getDefault().setDirty(getFile(), false);
				Activator.getDefault().dirtyFilesContainment.remove(getFile());
			} else {
				KermetaBuilder.getDefault().setDirty(getFile(), true);
				Activator.getDefault().dirtyFilesContainment.put(getFile(),new String());
			}
		}
	}
	
    public IFile getFile() {
    	if( getEditorInput() instanceof IFileEditorInput ) {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile();
        }
    	return null;
    }
}
