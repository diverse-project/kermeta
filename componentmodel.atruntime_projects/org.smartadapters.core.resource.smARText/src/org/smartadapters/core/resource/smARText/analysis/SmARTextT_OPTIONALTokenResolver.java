/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class SmARTextT_OPTIONALTokenResolver implements org.smartadapters.core.resource.smARText.ISmARTextTokenResolver {
	
	private org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver defaultTokenResolver = new org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("true")) return " optional";
		else return "";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result) {
		result.setResolvedToken(lexem.equals("optional"));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
