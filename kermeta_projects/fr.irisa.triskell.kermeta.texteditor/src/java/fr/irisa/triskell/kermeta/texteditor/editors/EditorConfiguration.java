/* $Id: EditorConfiguration.java,v 1.20 2007-06-27 14:43:04 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : EditorConfiguration.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 jan. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.completion.EditorCompletion;
import fr.irisa.triskell.kermeta.texteditor.completion.KermetaCompletionListener;
import fr.irisa.triskell.kermeta.texteditor.scanners.KMTCommentScanner;
import fr.irisa.triskell.kermeta.texteditor.scanners.KMTStringScanner;
import fr.irisa.triskell.kermeta.texteditor.scanners.KMTTagScanner;

/**
 * @author Franck Fleurey
 * 
 * The class that instanciates/sets all the classes necessary to manage the source-view,
 * (like automatic completion (EditorCompletion), syntactic coloration (EditorScanner), etc.)
 */
public class EditorConfiguration extends SourceViewerConfiguration {

	private KMTEditor editor;
	private EditorScanner scanner;
	private EditorTextHover texthover;
	public static Color DEFAULT_TAG_COLOR= new Color(Display.getCurrent(), new RGB(0, 0, 100));

	static private EditorCompletion editorCompletion;

	private IPreferenceStore preferences = TexteditorPlugin.getDefault().getPreferenceStore();
	
	
	public EditorConfiguration(KMTEditor editor) {
		this.editor = editor;
		scanner = new EditorScanner();
		scanner.setDefaultReturnToken(new Token(new TextAttribute(DEFAULT_TAG_COLOR)));
		texthover = new EditorTextHover(editor);
	}

	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return TexteditorPlugin.KMT_PARTITIONING;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
				KMTPartitionScanner.KMT_COMMENT,
				KMTPartitionScanner.KMT_TAG,
				IDocument.DEFAULT_CONTENT_TYPE			// Contenu par d�faut (pour nous : code)
		};
	}
	
	/**
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(ISourceViewer)
	 * Define reconciler for MyEditor
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		
		PresentationReconciler reconciler= new PresentationReconciler();
		reconciler.setDocumentPartitioning( getConfiguredDocumentPartitioning(sourceViewer) );

		
	/*	DefaultDamagerRepairer dr = new DefaultDamagerRepairer( new KMTCodeScanner(editor.getUnit()) );
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		
		
		//PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		
		dr = new DefaultDamagerRepairer( new KMTTagScanner() );
		reconciler.setDamager(dr, KMTRuleBasedPartitionScanner.KMT_Comment );
		reconciler.setRepairer(dr, KMTRuleBasedPartitionScanner.KMT_Comment );*/
		
		/*DefaultDamagerRepairer dr = new DefaultDamagerRepairer( new KMTTagScanner() );
		reconciler.setDamager(dr, KMTPartitionScanner.KMT_TAG);
		reconciler.setRepairer(dr, KMTPartitionScanner.KMT_TAG);
		
		dr = new DefaultDamagerRepairer( new KMTCommentScanner() );
		reconciler.setDamager(dr, KMTPartitionScanner.KMT_COMMENT);
		reconciler.setRepairer(dr, KMTPartitionScanner.KMT_COMMENT);*/
		
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer( new EditorScanner() );
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
	
		dr = new DefaultDamagerRepairer( new KMTStringScanner() );
		reconciler.setDamager(dr, KMTPartitionScanner.KMT_STRING);
		reconciler.setRepairer(dr, KMTPartitionScanner.KMT_STRING);
		
		dr = new DefaultDamagerRepairer( new KMTTagScanner() );
		reconciler.setDamager(dr, KMTPartitionScanner.KMT_TAG);
		reconciler.setRepairer(dr, KMTPartitionScanner.KMT_TAG);
		
		dr = new DefaultDamagerRepairer( new KMTCommentScanner() );
		reconciler.setDamager(dr, KMTPartitionScanner.KMT_COMMENT);
		reconciler.setRepairer(dr, KMTPartitionScanner.KMT_COMMENT);
		
		return reconciler;
	}
		
	/**
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getContentAssistant(org.eclipse.jface.text.source.ISourceViewer)
	 * Set the editor completion manager
	 */
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant = new ContentAssistant();
		editorCompletion = new EditorCompletion();
		editor.setEditorCompletion( editorCompletion );
		assistant.addCompletionListener( new KermetaCompletionListener(editorCompletion) );
		assistant.setContentAssistProcessor(editorCompletion, IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		int value = preferences.getInt("contentAssistantActivation");
		if ( value == 0 ) {
			preferences.setValue("contentAssistantActivation", 300);
			value = 300;
		}
		assistant.setAutoActivationDelay(value);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		return assistant;
	}

	
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		IReconcilingStrategy reconcilingStrategy = new TypecheckingStrategy( editor );
		MonoReconciler reconciler = new MonoReconciler(reconcilingStrategy, false);
		int value = preferences.getInt("reconcilingActivation");
		if ( value == 0 ) {
			preferences.setValue("reconcilingActivation", 600);
			value = 600;
		}
		reconciler.setDelay(value);
		return reconciler;
	}
	
	/**
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getTextHover(ISourceViewer, String)
	 */
   public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType)
    {
        return texthover;
    }
	
    /** @see org.eclipse.jface.text.source.SourceViewerConfiguration#getTextHover(ISourceViewer, String) */
   public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType, int stateMask)
    {
    	return texthover;
    }
	 
   
   static public EditorCompletion getEditorCompletion() {
	   return editorCompletion;
   }
	 
}
