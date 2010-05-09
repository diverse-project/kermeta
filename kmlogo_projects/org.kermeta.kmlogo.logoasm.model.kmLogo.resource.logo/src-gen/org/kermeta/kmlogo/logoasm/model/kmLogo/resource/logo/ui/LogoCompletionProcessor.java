/*$Id : LogoCompletionProcessor.java v 1.3 May 8, 2010 9:18:15 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoCompletionProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

public class LogoCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoEditor editor;
	
	public LogoCompletionProcessor(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource textResource = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource) resource;
		String content = viewer.getDocument().get();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoCodeCompletionHelper helper = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoCodeCompletionHelper();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoCompletionProposal[] proposals = helper.computeCompletionProposals(textResource, content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.length];
		int i = 0;
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoCompletionProposal proposal : proposals) {
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
