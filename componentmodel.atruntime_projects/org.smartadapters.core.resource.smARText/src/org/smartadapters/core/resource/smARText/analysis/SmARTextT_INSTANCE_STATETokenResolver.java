/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class SmARTextT_INSTANCE_STATETokenResolver implements org.smartadapters.core.resource.smARText.ISmARTextTokenResolver {
	
	private org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver defaultTokenResolver = new org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("OFF")) return "#OFF";
		else return "#ON";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result) {
		if (lexem.equals("#ON")) result.setResolvedToken("ON");
		else result.setResolvedToken("OFF");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
