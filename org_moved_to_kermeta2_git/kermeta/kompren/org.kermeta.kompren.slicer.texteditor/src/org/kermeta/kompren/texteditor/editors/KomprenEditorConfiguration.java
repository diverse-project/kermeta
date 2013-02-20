package org.kermeta.kompren.texteditor.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class KomprenEditorConfiguration extends TextSourceViewerConfiguration {

	private ColorManager colorManager;
	private KomprenEditor theEditor;
	
	// Create a new editor configuration.
	//
	// @param editor
	// @param colorManager
	///
	public KomprenEditorConfiguration(final KomprenEditor editor, final ColorManager colorManager) {
		super();
		this.theEditor = editor;
		this.colorManager = colorManager;
	}
	
	
	@Override
	public IContentAssistant getContentAssistant(final ISourceViewer sourceViewer) {
		// Create content assistant
	   ContentAssistant assistant = new ContentAssistant();
	   
	   // Create content assistant processor
	   IContentAssistProcessor processor = new KomprenContentAssistProcessor(theEditor);
	   
	   // Set this processor for each supported content type
	   assistant.setContentAssistProcessor(processor, IDocument.DEFAULT_CONTENT_TYPE);
	   assistant.enableAutoActivation(true);
	   assistant.setAutoActivationDelay(400);
	   assistant.enableAutoInsert(true);
	   assistant.setRepeatedInvocationMode(true);
	   assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
	   assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
	         
	   // Return the content assistant   
	   return assistant;
	}
	

	@Override
	public IPresentationReconciler getPresentationReconciler(final ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		ScannerBasedDamagerRepairer repairer = new ScannerBasedDamagerRepairer(getScanner());
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}
	
	
	// @param fileExtension
	// @return
	protected KomprenTokenScanner getScanner() {
		return new KomprenScanner(colorManager,theEditor);
	}
	
	
	@Override
	public ITextHover getTextHover(final ISourceViewer sourceViewer, final String contentType) {
		if(theEditor.getFile()==null)
			return null;
		return new EditorTextHover(theEditor);
	}
}
