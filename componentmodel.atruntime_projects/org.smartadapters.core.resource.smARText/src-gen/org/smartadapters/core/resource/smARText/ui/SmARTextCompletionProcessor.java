/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.ui;

public class SmARTextCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.smartadapters.core.resource.smARText.ui.SmARTextEditor editor;
	
	public SmARTextCompletionProcessor(org.smartadapters.core.resource.smARText.ui.SmARTextEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		org.smartadapters.core.resource.smARText.ISmARTextTextResource textResource = (org.smartadapters.core.resource.smARText.ISmARTextTextResource) resource;
		String content = viewer.getDocument().get();
		org.smartadapters.core.resource.smARText.mopp.SmARTextCodeCompletionHelper helper = new org.smartadapters.core.resource.smARText.mopp.SmARTextCodeCompletionHelper();
		org.smartadapters.core.resource.smARText.mopp.SmARTextCompletionProposal[] proposals = helper.computeCompletionProposals(textResource, content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.length];
		int i = 0;
		for (org.smartadapters.core.resource.smARText.mopp.SmARTextCompletionProposal proposal : proposals) {
			String proposalString = proposal.getInsertString();
			String prefix = proposal.getPrefix();
			org.eclipse.jface.text.contentassist.IContextInformation info = new org.eclipse.jface.text.contentassist.ContextInformation(proposalString, proposalString);
			int begin = offset - prefix.length();
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, prefix.length(), proposalString.length(), null, proposalString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
