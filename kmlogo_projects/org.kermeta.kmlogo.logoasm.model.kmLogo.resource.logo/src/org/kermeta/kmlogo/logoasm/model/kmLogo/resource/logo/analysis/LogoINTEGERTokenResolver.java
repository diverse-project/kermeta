/**
 * <copyright>
 * </copyright>
 *
 * 
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
