/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextTokenResolverFactory implements art.resource.artext.IArtextTokenResolverFactory {
	
	private java.util.Map<java.lang.String, art.resource.artext.IArtextTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, art.resource.artext.IArtextTokenResolver> featureName2CollectInTokenResolver;
	private static art.resource.artext.IArtextTokenResolver defaultResolver = new art.resource.artext.analysis.ArtextDefaultTokenResolver();
	
	public ArtextTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<java.lang.String, art.resource.artext.IArtextTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<java.lang.String, art.resource.artext.IArtextTokenResolver>();
		registerTokenResolver("STRING_LITERAL", new art.resource.artext.analysis.ArtextSTRING_LITERALTokenResolver());
		registerTokenResolver("T_INSTANCE_STATE", new art.resource.artext.analysis.ArtextT_INSTANCE_STATETokenResolver());
		registerTokenResolver("T_PORT_KIND", new art.resource.artext.analysis.ArtextT_PORT_KINDTokenResolver());
		registerTokenResolver("T_IMPLEM", new art.resource.artext.analysis.ArtextT_IMPLEMTokenResolver());
		registerTokenResolver("MULTIPLICITY", new art.resource.artext.analysis.ArtextMULTIPLICITYTokenResolver());
		registerTokenResolver("TEXT", new art.resource.artext.analysis.ArtextTEXTTokenResolver());
	}
	
	public art.resource.artext.IArtextTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public art.resource.artext.IArtextTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, art.resource.artext.IArtextTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, art.resource.artext.IArtextTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected art.resource.artext.IArtextTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private art.resource.artext.IArtextTokenResolver internalCreateResolver(java.util.Map<java.lang.String, art.resource.artext.IArtextTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, art.resource.artext.IArtextTokenResolver> resolverMap, java.lang.String key, art.resource.artext.IArtextTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
