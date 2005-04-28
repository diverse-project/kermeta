/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EditorConfiguration extends SourceViewerConfiguration {

	private Editor editor;
	private EditorScanner scanner;
	private EditorTextHover texthover;
	public static Color DEFAULT_TAG_COLOR= new Color(Display.getCurrent(), new RGB(0, 0, 100));

	public EditorConfiguration(Editor editor) {
		this.editor = editor;
		scanner = new EditorScanner();
		scanner.setDefaultReturnToken(new Token(new TextAttribute(DEFAULT_TAG_COLOR)));
		texthover = new EditorTextHover(editor);
	}

	/**
	 * Define reconciler for MyEditor
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
		reconciler.setDamager(new EditorPresentationDamager(), IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}
	
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant = new ContentAssistant();
		assistant.setContentAssistProcessor(new EditorCompletion(editor), IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		return assistant;
	}
	

	/**
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		MonoReconciler reconciler = new MonoReconciler(new EditorReconcilingStrategy(editor),false);
		reconciler.setDelay(500);
		return reconciler;
	}
	
    public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType)
    {
        return texthover;
    }
	
	 public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType, int stateMask)
     {
        return texthover;
     }
	 
	 
}
