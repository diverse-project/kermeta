package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.builder.eclipse.KermetaBuilderEventListener;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.texteditor.eclipse.internal.autocompletion.BracketInserter;
import org.kermeta.language.texteditor.eclipse.internal.outline.KermetaOutline;


public class KermetaEditor extends TextEditor implements  KermetaBuilderEventListener {

	private KermetaColorManager colorManager;
	private BracketInserter fBracketInserter= null;
	private KermetaOutline outline;
	
	public KermetaEditor(){
		super();
		colorManager = new KermetaColorManager();

		setSourceViewerConfiguration(new KermetaEditorConfiguration(this, colorManager));
		setDocumentProvider(new org.eclipse.ui.editors.text.TextFileDocumentProvider());
		
	}
	// Added by Suresh for the Outline
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)) {
			if (outline == null) {
				outline = new KermetaOutline(this);
				//outline.update();
				org.kermeta.language.builder.eclipse.Activator.getDefault().registerListener(this);
			}
			return outline;
		}
		return super.getAdapter(adapter);
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
		org.kermeta.language.builder.eclipse.Activator.getDefault().unregisterListener(this);
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
	@Override
	public void projectCompiled(IProject project, ModelingUnit lastCompiledKm) {
		// TODO Need to check if file belongs to project than update
		System.out.println("Project Compiled: " +  project.getName());
		outline.update(lastCompiledKm);
		/*
		Job job = new Job("Outline") {		
			@Override
			protected IStatus run(IProgressMonitor arg0) {
				outline.update();
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		*/		
	}
}
