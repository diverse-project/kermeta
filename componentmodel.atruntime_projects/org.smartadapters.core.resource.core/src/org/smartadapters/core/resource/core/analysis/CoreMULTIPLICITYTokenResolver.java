/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class CoreMULTIPLICITYTokenResolver implements org.smartadapters.core.resource.core.ICoreTokenResolver {
	
	private org.smartadapters.core.resource.core.analysis.CoreDefaultTokenResolver defaultTokenResolver = new org.smartadapters.core.resource.core.analysis.CoreDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (((Integer)value) < 0) return "*";
		else return value.toString();
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.smartadapters.core.resource.core.ICoreTokenResolveResult result) {
		if (lexem.equals("*")) result.setResolvedToken(-1);
		else result.setResolvedToken(Integer.parseInt(lexem));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
