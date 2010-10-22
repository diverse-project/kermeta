/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

public class LogoSequence extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement {
	
	public LogoSequence(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoStringUtil.explode(getChildren(), " ");
	}
	
}
