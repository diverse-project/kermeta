/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

public class SmARTextT_IMPLEMTokenResolver implements smartadapters4ART.resource.smARText.ISmARTextTokenResolver {
	
	private smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver defaultTokenResolver = new smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("true")) return "bundle";
		else return "memory";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, smartadapters4ART.resource.smARText.ISmARTextTokenResolveResult result) {
		result.setResolvedToken(lexem.equals("bundle"));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
