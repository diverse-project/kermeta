/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class LogoExpectedBooleanTerminal extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAbstractExpectedElement {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal booleanTerminal;
	
	public LogoExpectedBooleanTerminal(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof LogoExpectedBooleanTerminal) {
			return getFeature().equals(((LogoExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
