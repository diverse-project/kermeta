/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class CoreT_IMPLEMTokenResolver implements org.smartadapters.core.resource.core.ICoreTokenResolver {
	
	private org.smartadapters.core.resource.core.analysis.CoreDefaultTokenResolver defaultTokenResolver = new org.smartadapters.core.resource.core.analysis.CoreDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("true")) return "bundle";
		else return "memory";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.smartadapters.core.resource.core.ICoreTokenResolveResult result) {
		result.setResolvedToken(lexem.equals("bundle"));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
