/*$Id : ILogoResourcePostProcessorProvider.java v 1.3 May 8, 2010 9:17:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoResourcePostProcessorProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// Implementors of this interface can provide a post-processor
// for text resources.
public interface ILogoResourcePostProcessorProvider {
	
	// Returns the processor that shall be called after text
	// resource are successfully parsed.
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoResourcePostProcessor getResourcePostProcessor();
}
