/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// A representation for a range in a document where a structural feature (e.g.,
// a reference) is expected.
public class LogoExpectedStructuralFeature extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAbstractExpectedElement {
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	private String tokenName;
	
	public LogoExpectedStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName) {
		super();
		this.feature = feature;
		this.tokenName = tokenName;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
	public java.lang.String toString() {
		return "EFeature " + feature.getEContainingClass().getName() + "." + feature.getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof LogoExpectedStructuralFeature) {
			return this.feature.equals(((LogoExpectedStructuralFeature) o).feature);
		}
		return false;
	}
}
