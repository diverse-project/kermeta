/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface ISmARTextTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public org.smartadapters.core.resource.smARText.ISmARTextTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public org.smartadapters.core.resource.smARText.ISmARTextTokenResolver createCollectInTokenResolver(String featureName);
}
