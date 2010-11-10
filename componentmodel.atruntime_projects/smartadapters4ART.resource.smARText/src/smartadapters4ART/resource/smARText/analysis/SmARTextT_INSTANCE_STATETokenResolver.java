/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

public class SmARTextT_INSTANCE_STATETokenResolver implements smartadapters4ART.resource.smARText.ISmARTextTokenResolver {
	
	private smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver defaultTokenResolver = new smartadapters4ART.resource.smARText.analysis.SmARTextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("OFF")) return "#OFF";
		else return "#ON";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, smartadapters4ART.resource.smARText.ISmARTextTokenResolveResult result) {
		if (lexem.equals("#ON")) result.setResolvedToken("ON");
		else result.setResolvedToken("OFF");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
