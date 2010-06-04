/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextTokenResolverFactory implements org.smartadapters.core.resource.smARText.ISmARTextTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver> featureName2CollectInTokenResolver;
	private static org.smartadapters.core.resource.smARText.ISmARTextTokenResolver defaultResolver = new org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public SmARTextTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver>();
		registerTokenResolver("T_INSTANCE_STATE", new org.smartadapters.core.resource.smARText.analysis.SmARTextT_INSTANCE_STATETokenResolver());
		registerTokenResolver("T_PORT_KIND", new org.smartadapters.core.resource.smARText.analysis.SmARTextT_PORT_KINDTokenResolver());
		registerTokenResolver("T_IMPLEM", new org.smartadapters.core.resource.smARText.analysis.SmARTextT_IMPLEMTokenResolver());
		registerTokenResolver("T_OPTIONAL", new org.smartadapters.core.resource.smARText.analysis.SmARTextT_OPTIONALTokenResolver());
		registerTokenResolver("MULTIPLICITY", new org.smartadapters.core.resource.smARText.analysis.SmARTextMULTIPLICITYTokenResolver());
		registerTokenResolver("STRING_LITERAL", new org.smartadapters.core.resource.smARText.analysis.SmARTextSTRING_LITERALTokenResolver());
		registerTokenResolver("TXTID", new org.smartadapters.core.resource.smARText.analysis.SmARTextTXTIDTokenResolver());
		registerTokenResolver("TEXT", new org.smartadapters.core.resource.smARText.analysis.SmARTextTEXTTokenResolver());
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.smartadapters.core.resource.smARText.ISmARTextTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.smartadapters.core.resource.smARText.ISmARTextTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver> resolverMap, java.lang.String key, org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
