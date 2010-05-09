/*$Id : ILogoReferenceMapping.java v 1.3 May 8, 2010 9:17:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoReferenceMapping.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// A mapping from an identifier to something else. The
// &quot;something else&quot; is defined by subclasses
// of this interface. Implementors of such subclasses
// are used during the process of resolving references,
// where identifiers need to be mapped to other object.
//
// This interface must not be implemented by clients.
//
// @param <ReferenceType> the type of the reference this mapping points to.
public interface ILogoReferenceMapping<ReferenceType> {
	
	// Returns the identifier that is mapped.
	public String getIdentifier();
	
	// A mapping can have a warning attached that contains
	// additional information (e.g., when the mapping might
	// be wrong under specific conditions). The warning is
	// meant to be presented to the user together with the
	// mapping result.
	public String getWarning();
}
