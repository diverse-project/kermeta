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
public class KpProposalPostProcessor {
	
	public java.util.List<org.kermeta.kp.editor.ui.KpCompletionProposal> process(java.util.List<org.kermeta.kp.editor.ui.KpCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
