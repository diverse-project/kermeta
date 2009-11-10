package art.resource.art.ui;

public class ArtCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private art.resource.art.ui.ArtEditor editor;
	
	public ArtCompletionProcessor(art.resource.art.ui.ArtEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		art.resource.art.IArtTextResource textResource = (art.resource.art.IArtTextResource) resource;
		String content = viewer.getDocument().get();
		art.resource.art.mopp.ArtCodeCompletionHelper helper = new art.resource.art.mopp.ArtCodeCompletionHelper();
		java.util.Collection<String> proposals = helper.computeCompletionProposals(textResource.getMetaInformation(), content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.size()];
		int i = 0;
		for (String proposal : proposals) {
			org.eclipse.jface.text.contentassist.IContextInformation info = new org.eclipse.jface.text.contentassist.ContextInformation(proposal, proposal);
			String contentBefore = content.substring(0, offset);
			String insertString = art.resource.art.util.ArtStringUtil.getMissingTail(contentBefore, proposal);
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(insertString, offset, 0, insertString.length(), null, proposal, info, proposal);
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
