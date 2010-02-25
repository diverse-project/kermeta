/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// An element that is expected at a given position in a resource
// stream.
public interface ILogoExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement follower);
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement> getFollowers();
}
