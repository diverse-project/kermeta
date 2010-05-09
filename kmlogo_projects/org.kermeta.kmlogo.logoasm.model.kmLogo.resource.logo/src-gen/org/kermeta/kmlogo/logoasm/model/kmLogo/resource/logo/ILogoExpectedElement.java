/*$Id : ILogoExpectedElement.java v 1.3 May 8, 2010 9:17:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoExpectedElement.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// An element that is expected at a given position in a resource
// stream.
public interface ILogoExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement follower);
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement> getFollowers();
}
