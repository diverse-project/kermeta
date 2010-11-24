/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptTokenResolverFactory implements org.kermeta.kp.editor.IKptTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.kermeta.kp.editor.IKptTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.kermeta.kp.editor.IKptTokenResolver> featureName2CollectInTokenResolver;
	private static org.kermeta.kp.editor.IKptTokenResolver defaultResolver = new org.kermeta.kp.editor.analysis.KptDefaultTokenResolver();
	
	public KptTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<java.lang.String, org.kermeta.kp.editor.IKptTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<java.lang.String, org.kermeta.kp.editor.IKptTokenResolver>();
		registerTokenResolver("NSURI", new org.kermeta.kp.editor.analysis.KptNSURITokenResolver());
		registerTokenResolver("TEXT", new org.kermeta.kp.editor.analysis.KptTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new org.kermeta.kp.editor.analysis.KptQUOTED_34_34TokenResolver());
	}
	
	public org.kermeta.kp.editor.IKptTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kermeta.kp.editor.IKptTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.kermeta.kp.editor.IKptTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.kermeta.kp.editor.IKptTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kermeta.kp.editor.IKptTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kermeta.kp.editor.IKptTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.kermeta.kp.editor.IKptTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.kermeta.kp.editor.IKptTokenResolver> resolverMap, java.lang.String key, org.kermeta.kp.editor.IKptTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
