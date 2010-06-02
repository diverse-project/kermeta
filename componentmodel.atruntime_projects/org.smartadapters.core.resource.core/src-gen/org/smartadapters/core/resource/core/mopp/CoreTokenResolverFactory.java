/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreTokenResolverFactory implements org.smartadapters.core.resource.core.ICoreTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.smartadapters.core.resource.core.ICoreTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.smartadapters.core.resource.core.ICoreTokenResolver> featureName2CollectInTokenResolver;
	private static org.smartadapters.core.resource.core.ICoreTokenResolver defaultResolver = new org.smartadapters.core.resource.core.analysis.CoreDefaultTokenResolver();
	
	public CoreTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, org.smartadapters.core.resource.core.ICoreTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, org.smartadapters.core.resource.core.ICoreTokenResolver>();
		registerTokenResolver("T_INSTANCE_STATE", new org.smartadapters.core.resource.core.analysis.CoreT_INSTANCE_STATETokenResolver());
		registerTokenResolver("T_PORT_KIND", new org.smartadapters.core.resource.core.analysis.CoreT_PORT_KINDTokenResolver());
		registerTokenResolver("T_IMPLEM", new org.smartadapters.core.resource.core.analysis.CoreT_IMPLEMTokenResolver());
		registerTokenResolver("T_OPTIONAL", new org.smartadapters.core.resource.core.analysis.CoreT_OPTIONALTokenResolver());
		registerTokenResolver("MULTIPLICITY", new org.smartadapters.core.resource.core.analysis.CoreMULTIPLICITYTokenResolver());
		registerTokenResolver("STRING_LITERAL", new org.smartadapters.core.resource.core.analysis.CoreSTRING_LITERALTokenResolver());
		registerTokenResolver("TEXT", new org.smartadapters.core.resource.core.analysis.CoreTEXTTokenResolver());
	}
	
	public org.smartadapters.core.resource.core.ICoreTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.smartadapters.core.resource.core.ICoreTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.smartadapters.core.resource.core.ICoreTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.smartadapters.core.resource.core.ICoreTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.smartadapters.core.resource.core.ICoreTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.smartadapters.core.resource.core.ICoreTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.smartadapters.core.resource.core.ICoreTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.smartadapters.core.resource.core.ICoreTokenResolver> resolverMap, java.lang.String key, org.smartadapters.core.resource.core.ICoreTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
