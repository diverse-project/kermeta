/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptTokenResolverFactory implements org.kermeta.kp.editor.IKptTokenResolverFactory {
	
	private java.util.Map<String, org.kermeta.kp.editor.IKptTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.kermeta.kp.editor.IKptTokenResolver> featureName2CollectInTokenResolver;
	private static org.kermeta.kp.editor.IKptTokenResolver defaultResolver = new org.kermeta.kp.editor.analysis.KptDefaultTokenResolver();
	
	public KptTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.kermeta.kp.editor.IKptTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.kermeta.kp.editor.IKptTokenResolver>();
		registerTokenResolver("QUOTED_34_34", new org.kermeta.kp.editor.analysis.KptQUOTED_34_34TokenResolver());
	}
	
	public org.kermeta.kp.editor.IKptTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kermeta.kp.editor.IKptTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.kermeta.kp.editor.IKptTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.kermeta.kp.editor.IKptTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kermeta.kp.editor.IKptTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kermeta.kp.editor.IKptTokenResolver internalCreateResolver(java.util.Map<String, org.kermeta.kp.editor.IKptTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.kermeta.kp.editor.IKptTokenResolver> resolverMap, String key, org.kermeta.kp.editor.IKptTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
