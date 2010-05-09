/*$Id : ILogoOptionProvider.java v 1.3 May 8, 2010 9:17:05 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoOptionProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// Implementors of this interface can provide options that
// are used when resources are loaded.
public interface ILogoOptionProvider {
	
	// The name of the attribute of the default_load_options
	// extension point that specifies to which resources an
	// option provider applies.
	public static final String CS_NAME = "csName";
	
	// Returns a map of options. The keys are the names of the
	// options, the values are arbitrary object that provide
	// additional information or logic for the option.
	public java.util.Map<?,?> getOptions();
}
