/*$Id : LogoINTEGERTokenResolver.java v 1.3 May 8, 2010 9:16:33 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoINTEGERTokenResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis;

public class LogoINTEGERTokenResolver implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver defaultTokenResolver = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
