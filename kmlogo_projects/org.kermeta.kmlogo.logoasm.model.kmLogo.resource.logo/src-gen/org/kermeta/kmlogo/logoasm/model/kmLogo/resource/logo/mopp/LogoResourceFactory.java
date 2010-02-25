/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public LogoResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResource(uri);
	}
}
