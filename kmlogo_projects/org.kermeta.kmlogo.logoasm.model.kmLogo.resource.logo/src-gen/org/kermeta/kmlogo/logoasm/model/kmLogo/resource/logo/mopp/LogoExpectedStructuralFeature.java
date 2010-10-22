/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class LogoExpectedStructuralFeature extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAbstractExpectedElement {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder placeholder;
	
	public LogoExpectedStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof LogoExpectedStructuralFeature) {
			return getFeature().equals(((LogoExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
