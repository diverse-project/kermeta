/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class LogoProposalPostProcessor {
	
	public java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal> process(java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
