/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SmARTextProposalPostProcessor {
	
	public java.util.List<smartadapters4ART.resource.smARText.ui.SmARTextCompletionProposal> process(java.util.List<smartadapters4ART.resource.smARText.ui.SmARTextCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
