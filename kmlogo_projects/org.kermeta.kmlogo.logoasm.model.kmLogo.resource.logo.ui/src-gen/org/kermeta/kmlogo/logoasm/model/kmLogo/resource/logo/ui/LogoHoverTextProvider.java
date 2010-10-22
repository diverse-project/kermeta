/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

public class LogoHoverTextProvider implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoHoverTextProvider {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoDefaultHoverTextProvider defaultProvider = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
