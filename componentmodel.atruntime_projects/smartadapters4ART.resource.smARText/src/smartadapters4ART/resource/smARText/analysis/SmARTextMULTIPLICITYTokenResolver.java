/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

public class SmARTextMULTIPLICITYTokenResolver implements smartadapters4ART.resource.smARText.ISmARTextTokenResolver {
	
	private smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver defaultTokenResolver = new smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (((Integer)value) < 0) return "*";
		else return value.toString();
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, smartadapters4ART.resource.smARText.ISmARTextTokenResolveResult result) {
		if (lexem.equals("*")) result.setResolvedToken(-1);
		else result.setResolvedToken(Integer.parseInt(lexem));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
