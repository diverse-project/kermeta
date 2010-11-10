/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextTokenResolverFactory implements smartadapters4ART.resource.smARText.ISmARTextTokenResolverFactory {
	
	private java.util.Map<String, smartadapters4ART.resource.smARText.ISmARTextTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, smartadapters4ART.resource.smARText.ISmARTextTokenResolver> featureName2CollectInTokenResolver;
	private static smartadapters4ART.resource.smARText.ISmARTextTokenResolver defaultResolver = new smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public SmARTextTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, smartadapters4ART.resource.smARText.ISmARTextTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, smartadapters4ART.resource.smARText.ISmARTextTokenResolver>();
		registerTokenResolver("T_INSTANCE_STATE", new smartadapters4ART.resource.smARText.analysis.SmARTextT_INSTANCE_STATETokenResolver());
		registerTokenResolver("T_PORT_KIND", new smartadapters4ART.resource.smARText.analysis.SmARTextT_PORT_KINDTokenResolver());
		registerTokenResolver("T_IMPLEM", new smartadapters4ART.resource.smARText.analysis.SmARTextT_IMPLEMTokenResolver());
		registerTokenResolver("MULTIPLICITY", new smartadapters4ART.resource.smARText.analysis.SmARTextMULTIPLICITYTokenResolver());
		registerTokenResolver("STRING_LITERAL", new smartadapters4ART.resource.smARText.analysis.SmARTextSTRING_LITERALTokenResolver());
		registerTokenResolver("TXTID", new smartadapters4ART.resource.smARText.analysis.SmARTextTXTIDTokenResolver());
		registerTokenResolver("TEXT", new smartadapters4ART.resource.smARText.analysis.SmARTextTEXTTokenResolver());
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected smartadapters4ART.resource.smARText.ISmARTextTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private smartadapters4ART.resource.smARText.ISmARTextTokenResolver internalCreateResolver(java.util.Map<String, smartadapters4ART.resource.smARText.ISmARTextTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, smartadapters4ART.resource.smARText.ISmARTextTokenResolver> resolverMap, String key, smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
