/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

// A representation for a range in a document where a structural feature (e.g.,
// a reference) is expected.
public class SmARTextExpectedStructuralFeature extends org.smartadapters.core.resource.smARText.mopp.SmARTextAbstractExpectedElement {
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	private String tokenName;
	
	public SmARTextExpectedStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName) {
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
		if (o instanceof SmARTextExpectedStructuralFeature) {
			return this.feature.equals(((SmARTextExpectedStructuralFeature) o).feature);
		}
		return false;
	}
}
