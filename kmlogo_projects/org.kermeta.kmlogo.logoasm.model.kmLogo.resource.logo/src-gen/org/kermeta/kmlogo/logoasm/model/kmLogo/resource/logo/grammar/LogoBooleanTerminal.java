/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class LogoBooleanTerminal extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public LogoBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
