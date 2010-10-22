/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

public class LogoContainment extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal {
	
	public LogoContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
