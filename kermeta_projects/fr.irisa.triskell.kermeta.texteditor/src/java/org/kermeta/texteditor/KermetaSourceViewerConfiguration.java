

/*$Id: KermetaSourceViewerConfiguration.java,v 1.4 2008-04-28 11:51:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaSourceViewerConfiguration.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.kermeta.texteditor.completion.KermetaContentAssistProcessor;
import org.kermeta.texteditor.completion.RequireContentAssistProcessor;
import org.kermeta.texteditor.completion.TagContentAssistProcessor;
import org.kermeta.texteditor.completion.UsingContentAssistProcessor;
import org.kermeta.texteditor.scanners.KermetaCommentScanner;
import org.kermeta.texteditor.scanners.KermetaScanner;
import org.kermeta.texteditor.scanners.KermetaTagScanner;


public class KermetaSourceViewerConfiguration extends SourceViewerConfiguration {

	private KermetaTextEditor editor = null;
	
	public KermetaSourceViewerConfiguration(KermetaTextEditor editor) {
		this.editor = editor;
	}
	
	private KermetaTagScanner tagScanner;
	private KermetaCommentScanner commentScanner;
	private KermetaScanner kermetaScanner;

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { 
				IDocument.DEFAULT_CONTENT_TYPE, 
				KermetaPartitionScanner.REQUIRE,
				KermetaPartitionScanner.COMMENT, 
				KermetaPartitionScanner.TAG, 
				//KermetaPartitionScanner.BLOCK, 
				//KermetaPartitionScanner.OPERATION,
				KermetaPartitionScanner.USING,
				KermetaPartitionScanner.CLASS_DECLARATION
		};
	}
	
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer( getKermetaTagScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.TAG);
		reconciler.setRepairer(dr, KermetaPartitionScanner.TAG);
		
		dr = new DefaultDamagerRepairer( getKermetaCommentScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.COMMENT);
		reconciler.setRepairer(dr, KermetaPartitionScanner.COMMENT);

		/*dr = new DefaultDamagerRepairer( getKermetaScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.OPERATION);
		reconciler.setRepairer(dr, KermetaPartitionScanner.OPERATION);
		
		dr = new DefaultDamagerRepairer( getKermetaScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.BLOCK);
		reconciler.setRepairer(dr, KermetaPartitionScanner.BLOCK);		*/
		
		dr = new DefaultDamagerRepairer( getKermetaScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.USING);
		reconciler.setRepairer(dr, KermetaPartitionScanner.USING);		
		
		dr = new DefaultDamagerRepairer( getKermetaScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.REQUIRE);
		reconciler.setRepairer(dr, KermetaPartitionScanner.REQUIRE);	
		
		dr = new DefaultDamagerRepairer( getKermetaScanner() );
		reconciler.setDamager(dr, KermetaPartitionScanner.CLASS_DECLARATION);
		reconciler.setRepairer(dr, KermetaPartitionScanner.CLASS_DECLARATION);		
				
		dr = new DefaultDamagerRepairer( getKermetaScanner() );
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}
	
	private KermetaTagScanner getKermetaTagScanner() {
		if (tagScanner == null)
			tagScanner = new KermetaTagScanner();
		return tagScanner;
	}
	
	private KermetaCommentScanner getKermetaCommentScanner() {
		if (commentScanner == null)
			commentScanner = new KermetaCommentScanner();
		return commentScanner;
	}
	
	private KermetaScanner getKermetaScanner() {
		if (kermetaScanner == null)
			kermetaScanner = new KermetaScanner();
		return kermetaScanner;
	}
	
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
	    if ( editor.getFile() == null )
	    	return null;
		
		ContentAssistant assistant = new ContentAssistant();
	    
	    IContentAssistProcessor kermetaProcessor = new KermetaContentAssistProcessor(editor, sourceViewer);
	    assistant.setContentAssistProcessor(kermetaProcessor, IDocument.DEFAULT_CONTENT_TYPE);
	    	    
	    IContentAssistProcessor tagContentAssistProcessor = new TagContentAssistProcessor();
	    assistant.setContentAssistProcessor(tagContentAssistProcessor, KermetaPartitionScanner.TAG);
	    
	    IContentAssistProcessor usingContentAssistProcessor = new UsingContentAssistProcessor(editor);
	    assistant.setContentAssistProcessor(usingContentAssistProcessor, KermetaPartitionScanner.USING);

	    IContentAssistProcessor requireContentAssistProcessor = new RequireContentAssistProcessor(editor.getFile());
	    assistant.setContentAssistProcessor(requireContentAssistProcessor, KermetaPartitionScanner.REQUIRE);

	 //   IContentAssistProcessor blockContentAssistProcessor = new BlockContentAssistProcessor();
	  //  assistant.setContentAssistProcessor(blockContentAssistProcessor, KermetaPartitionScanner.BLOCK);

	    assistant.enableAutoActivation(true);
	    assistant.setAutoActivationDelay(400);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
	   /*
		assistant.addCompletionListener( 
			new ICompletionListener() {

				public void assistSessionEnded(ContentAssistEvent event) {}

				public void assistSessionStarted(ContentAssistEvent event) {}

				public void selectionChanged(final ICompletionProposal proposal, boolean smartToggle) {
					UIJob job = new UIJob("") {
						public IStatus runInUIThread(IProgressMonitor monitor) {
							String s = proposal.getDisplayString();
							Object modelElement = null;
							
							if ( s.matches(".+from.+") ) {
								String[] splits = s.split("from");
								String qualifiedName = splits[1].trim();
								ClassDefinition cdef = (ClassDefinition) editor.getKermetaUnit().getTypeDefinitionByName(qualifiedName);
																
								String featureName = splits[0].split(":")[0].replace("(...)", "").trim();
								/*
								 * 
								 * Can be an operation or a property.
								 * 
								 */
								/*modelElement = ClassDefinitionHelper.findOperationByName(cdef, featureName);
								if ( modelElement == null )
									modelElement = ClassDefinitionHelper.findPropertyByName(cdef, featureName);
							}
							
			                if(modelElement != null) {
			                	for ( KermetaEditorEventListener listener : TexteditorPlugin.getDefault().kermetaEditorEventListeners )
				    				listener.contentAssistSelectionChanged(modelElement);
			                }
							
							return Status.OK_STATUS;
						}
					};
					job.schedule();
				}
			
			}
		);*/
		
		return assistant;		
	}
	
	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		if ( editor.getFile() == null )
			return null;
        ReconcilingStrategy strategy = new ReconcilingStrategy(editor);
        MonoReconciler reconciler = new MonoReconciler(strategy,false);        
        return reconciler;
	}
		
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		if ( editor.getFile() == null )
			return null;
		return new EditorTextHover(editor);
	}
	/*@Override
	public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
		MultiPassContentFormatter formatter = new MultiPassContentFormatter(getConfiguredDocumentPartitioning(sourceViewer), IDocument.DEFAULT_CONTENT_TYPE);
//		ContentFormatter formatter = new ContentFormatter();
	   
	    KermetaFormattingStrategy formattingStrategy = new KermetaFormattingStrategy();
	    formatter.setMasterStrategy( formattingStrategy );
	    
	    RequireFormattingStrategy requireStrategy = new RequireFormattingStrategy();
	    formatter.setSlaveStrategy( requireStrategy, KermetaPartitionScanner.REQUIRE );

	    return formatter;
	}*/
	
	/*@Override
	public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
		IAutoEditStrategy[] strategies = new IAutoEditStrategy[2];
		strategies[0] = new DefaultIndentLineAutoEditStrategy();
		strategies[1] = new KermetaIndentStrategy();
		return strategies;
		//return super.getAutoEditStrategies(sourceViewer, contentType);
	}*/
}


