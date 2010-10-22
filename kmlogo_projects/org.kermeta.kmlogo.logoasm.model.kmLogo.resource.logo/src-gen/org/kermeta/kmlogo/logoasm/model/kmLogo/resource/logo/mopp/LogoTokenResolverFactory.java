/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoTokenResolverFactory implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolverFactory {
	
	private java.util.Map<String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> featureName2CollectInTokenResolver;
	private static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver defaultResolver = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver();
	
	public LogoTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver>();
		registerTokenResolver("INTEGER", new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoINTEGERTokenResolver());
		registerTokenResolver("TEXT", new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoTEXTTokenResolver());
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver internalCreateResolver(java.util.Map<String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> resolverMap, String key, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
