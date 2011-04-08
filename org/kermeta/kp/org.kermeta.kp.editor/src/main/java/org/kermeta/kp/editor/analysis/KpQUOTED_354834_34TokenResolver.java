/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.analysis;

public class KpQUOTED_354834_34TokenResolver implements org.kermeta.kp.editor.IKpTokenResolver {
	
	private org.kermeta.kp.editor.analysis.KpDefaultTokenResolver defaultTokenResolver = new org.kermeta.kp.editor.analysis.KpDefaultTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = defaultTokenResolver.deResolve(value, feature, container);
		result += "\"";
		result = "#0\"" + result;
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kp.editor.IKpTokenResolveResult result) {
		lexem = lexem.substring(3);
		lexem = lexem.substring(0, lexem.length() - 1);
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
