/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// Implementors of this interface can provide a post-processor
// for text resources.
public interface ILogoResourcePostProcessorProvider {
	
	// Returns the processor that shall be called after text
	// resource are successfully parsed.
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoResourcePostProcessor getResourcePostProcessor();
}
