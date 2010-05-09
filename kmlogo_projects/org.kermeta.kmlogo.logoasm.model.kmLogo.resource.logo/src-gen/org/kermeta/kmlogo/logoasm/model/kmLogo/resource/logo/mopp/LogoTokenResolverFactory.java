/*$Id : LogoTokenResolverFactory.java v 1.3 May 8, 2010 9:17:55 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoTokenResolverFactory.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoTokenResolverFactory implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> featureName2CollectInTokenResolver;
	private static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver defaultResolver = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver();
	
	public LogoTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver>();
		registerTokenResolver("INTEGER", new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoINTEGERTokenResolver());
		registerTokenResolver("TEXT", new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoTEXTTokenResolver());
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver> resolverMap, java.lang.String key, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
