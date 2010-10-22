/**
 * <copyright>
 * </copyright>
 *
 * 
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
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCodeCompletionHelper helper = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCodeCompletionHelper();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoProposalPostProcessor proposalPostProcessor = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoProposalPostProcessor();
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal> finalProposalList = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal>();
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.ILogoBracketHandler bracketHandler = editor.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
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
