/*$Id : ILogoHoverTextProvider.java v 1.3 May 8, 2010 9:17:02 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoHoverTextProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

public interface ILogoHoverTextProvider {
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object);
}
