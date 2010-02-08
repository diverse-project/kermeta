/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IArtTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public art.resource.art.IArtTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public art.resource.art.IArtTokenResolver createCollectInTokenResolver(String featureName);
}
