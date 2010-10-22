/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

public class LogoUIMetaInformation extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation {
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoHoverTextProvider();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoImageProvider getImageProvider() {
		return org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoImageProvider.INSTANCE;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager createColorManager() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTe
	 * xtResource,
	 * org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager)
	 * instead.
	 */
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoTokenScanner createTokenScanner(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoTokenScanner createTokenScanner(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager colorManager) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoTokenScanner(resource, colorManager);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoCodeCompletionHelper();
	}
	
}
