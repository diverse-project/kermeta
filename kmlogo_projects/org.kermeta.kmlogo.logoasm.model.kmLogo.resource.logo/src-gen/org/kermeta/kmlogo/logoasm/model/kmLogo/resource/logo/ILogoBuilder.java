/*$Id : ILogoBuilder.java v 1.3 May 8, 2010 9:17:05 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoBuilder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

public interface ILogoBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
