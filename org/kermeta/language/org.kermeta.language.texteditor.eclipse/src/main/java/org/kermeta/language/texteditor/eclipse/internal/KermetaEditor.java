package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IFileEditorInput;
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

	@Override
	protected void firePropertyChange(int property) {
		super.firePropertyChange(property);
		if (property == KermetaEditor.PROP_DIRTY) {
			if (! this.isDirty()) {
				Activator.getDefault().dirtyFiles.remove(((IFileEditorInput)this.getEditorInput()).getFile());
				Activator.getDefault().containmentFiles.remove(((IFileEditorInput)this.getEditorInput()).getFile());
			} else {
				Activator.getDefault().dirtyFiles.put(((IFileEditorInput)this.getEditorInput()).getFile(),null);
				Activator.getDefault().containmentFiles.put(((IFileEditorInput)this.getEditorInput()).getFile(),null);
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
