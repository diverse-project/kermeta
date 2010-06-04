/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class SmARTextTXTIDTokenResolver implements org.smartadapters.core.resource.smARText.ISmARTextTokenResolver {
	
	private org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver defaultTokenResolver = new org.smartadapters.core.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		result = '<' + result + '>';
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result) {
		assert lexem.charAt(0) == '<';
		assert lexem.charAt(lexem.length() - 1) == '>';
		lexem = lexem.substring(1, lexem.length() - 1);
		result.setResolvedToken(lexem);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
