package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.kermeta.language.builder.eclipse.KermetaBuilder;

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
