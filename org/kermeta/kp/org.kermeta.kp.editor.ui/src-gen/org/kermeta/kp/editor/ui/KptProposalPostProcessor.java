/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class KptProposalPostProcessor {
	
	public java.util.List<org.kermeta.kp.editor.ui.KptCompletionProposal> process(java.util.List<org.kermeta.kp.editor.ui.KptCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
