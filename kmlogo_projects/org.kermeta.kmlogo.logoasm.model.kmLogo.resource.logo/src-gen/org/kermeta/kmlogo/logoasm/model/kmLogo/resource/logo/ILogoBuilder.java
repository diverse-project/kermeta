/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

public interface ILogoBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
