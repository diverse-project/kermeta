/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class LogoAbstractExpectedElement implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement {
	
	private java.util.Set<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement> followers = new java.util.LinkedHashSet<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement>();
	
	public LogoAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement> getFollowers() {
		return followers;
	}
	
}
