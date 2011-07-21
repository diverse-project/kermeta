/* $Id: KermetaEditorConfiguration.java 13210 2010-10-27 16:27:58Z hrambelo $
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 *           Francois Fouquet 
 */
package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;
import org.kermeta.language.texteditor.eclipse.internal.autocompletion.KermetaContentAssistProcessor;

public class KermetaEditorConfiguration extends TextSourceViewerConfiguration {

	private org.kermeta.language.texteditor.eclipse.internal.KermetaColorManager colorManager;
	private org.kermeta.language.texteditor.eclipse.internal.KermetaEditor theEditor;
	
	// Create a new editor configuration.
	//
	// @param editor
	// @param colorManager
	///
	public KermetaEditorConfiguration(org.kermeta.language.texteditor.eclipse.internal.KermetaEditor editor, org.kermeta.language.texteditor.eclipse.internal.KermetaColorManager colorManager) {
		this.theEditor = editor;
		this.colorManager = colorManager;
	}
	
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		
		// Create content assistant
	   ContentAssistant assistant = new ContentAssistant();
	   
	   // Create content assistant processor
	   IContentAssistProcessor processor = new KermetaContentAssistProcessor(theEditor);
	   
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

	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		
		
		ScannerBasedDamagerRepairer repairer = new ScannerBasedDamagerRepairer(getScanner());
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}
	
	// @param fileExtension
	// @return
	protected org.kermeta.language.texteditor.eclipse.internal.KermetaTokenScanner getScanner() {
		return new org.kermeta.language.texteditor.eclipse.internal.KermetaScanner(colorManager,theEditor);
	}
	
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		if ( theEditor.getFile() == null )
			return null;
		return new EditorTextHover(theEditor);
	}
	
}
