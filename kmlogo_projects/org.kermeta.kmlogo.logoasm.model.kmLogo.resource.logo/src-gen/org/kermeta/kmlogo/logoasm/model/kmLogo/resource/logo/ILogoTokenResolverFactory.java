/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface ILogoTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver createCollectInTokenResolver(String featureName);
}
