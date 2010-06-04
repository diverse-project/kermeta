/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IArtextTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public art.resource.artext.IArtextTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public art.resource.artext.IArtextTokenResolver createCollectInTokenResolver(String featureName);
}
