/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

public class LogoChoice extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement {
	
	public LogoChoice(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoStringUtil.explode(getChildren(), "|");
	}
	
}
