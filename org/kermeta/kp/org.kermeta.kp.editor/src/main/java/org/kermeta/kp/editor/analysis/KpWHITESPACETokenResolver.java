/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.analysis;

public class KpWHITESPACETokenResolver implements org.kermeta.kp.editor.IKpTokenResolver {
	
	private org.kermeta.kp.editor.analysis.KpDefaultTokenResolver defaultTokenResolver = new org.kermeta.kp.editor.analysis.KpDefaultTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kp.editor.IKpTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
