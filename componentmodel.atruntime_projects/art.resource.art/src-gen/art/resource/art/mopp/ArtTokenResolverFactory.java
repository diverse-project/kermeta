/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

public class ArtTokenResolverFactory implements art.resource.art.IArtTokenResolverFactory {
	
	private java.util.Map<java.lang.String, art.resource.art.IArtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, art.resource.art.IArtTokenResolver> featureName2CollectInTokenResolver;
	private static art.resource.art.IArtTokenResolver defaultResolver = new art.resource.art.analysis.ArtDefaultTokenResolver();
	
	public ArtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, art.resource.art.IArtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, art.resource.art.IArtTokenResolver>();
		registerTokenResolver("STRING_LITERAL", new art.resource.art.analysis.ArtSTRING_LITERALTokenResolver());
		registerTokenResolver("T_INSTANCE_STATE", new art.resource.art.analysis.ArtT_INSTANCE_STATETokenResolver());
		registerTokenResolver("T_PORT_KIND", new art.resource.art.analysis.ArtT_PORT_KINDTokenResolver());
		registerTokenResolver("T_IMPLEM", new art.resource.art.analysis.ArtT_IMPLEMTokenResolver());
		registerTokenResolver("T_OPTIONAL", new art.resource.art.analysis.ArtT_OPTIONALTokenResolver());
		registerTokenResolver("MULTIPLICITY", new art.resource.art.analysis.ArtMULTIPLICITYTokenResolver());
		registerTokenResolver("TEXT", new art.resource.art.analysis.ArtTEXTTokenResolver());
	}
	
	public art.resource.art.IArtTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public art.resource.art.IArtTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, art.resource.art.IArtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, art.resource.art.IArtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected art.resource.art.IArtTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private art.resource.art.IArtTokenResolver internalCreateResolver(java.util.Map<java.lang.String, art.resource.art.IArtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, art.resource.art.IArtTokenResolver> resolverMap, java.lang.String key, art.resource.art.IArtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
