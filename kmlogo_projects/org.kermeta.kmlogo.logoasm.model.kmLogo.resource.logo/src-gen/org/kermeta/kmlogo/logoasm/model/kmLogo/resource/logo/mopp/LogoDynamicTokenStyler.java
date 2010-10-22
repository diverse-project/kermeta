/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle getDynamicTokenStyle(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken token, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
