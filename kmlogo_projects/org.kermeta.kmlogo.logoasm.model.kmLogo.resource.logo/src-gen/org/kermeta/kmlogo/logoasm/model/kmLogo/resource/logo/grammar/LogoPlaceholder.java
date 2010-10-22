/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class LogoPlaceholder extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal {
	
	private final String tokenName;
	
	public LogoPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
