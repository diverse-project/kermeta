/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * The KpTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class KpTokenResolverFactory implements org.kermeta.kp.editor.IKpTokenResolverFactory {
	
	private java.util.Map<String, org.kermeta.kp.editor.IKpTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.kermeta.kp.editor.IKpTokenResolver> featureName2CollectInTokenResolver;
	private static org.kermeta.kp.editor.IKpTokenResolver defaultResolver = new org.kermeta.kp.editor.analysis.KpDefaultTokenResolver();
	
	public KpTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.kermeta.kp.editor.IKpTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.kermeta.kp.editor.IKpTokenResolver>();
		registerTokenResolver("TEXT", new org.kermeta.kp.editor.analysis.KpTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new org.kermeta.kp.editor.analysis.KpQUOTED_34_34TokenResolver());
	}
	
	public org.kermeta.kp.editor.IKpTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kermeta.kp.editor.IKpTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.kermeta.kp.editor.IKpTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.kermeta.kp.editor.IKpTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kermeta.kp.editor.IKpTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kermeta.kp.editor.IKpTokenResolver internalCreateResolver(java.util.Map<String, org.kermeta.kp.editor.IKpTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.kermeta.kp.editor.IKpTokenResolver> resolverMap, String key, org.kermeta.kp.editor.IKpTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
