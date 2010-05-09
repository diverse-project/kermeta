/*$Id : LogoAbstractExpectedElement.java v 1.3 May 8, 2010 9:17:58 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoAbstractExpectedElement.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
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
