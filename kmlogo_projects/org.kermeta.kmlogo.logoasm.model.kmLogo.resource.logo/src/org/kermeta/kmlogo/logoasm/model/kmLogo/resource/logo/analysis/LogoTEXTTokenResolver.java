/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis;

public class LogoTEXTTokenResolver implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver defaultTokenResolver = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
