/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class LogoAbstractExpectedElement implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoPair<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoPair<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public LogoAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoPair<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoPair<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
