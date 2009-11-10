package art.resource.art.analysis;

public class ArtMULTIPLICITYTokenResolver implements art.resource.art.IArtTokenResolver {
	
	private art.resource.art.analysis.ArtDefaultTokenResolver defaultTokenResolver = new art.resource.art.analysis.ArtDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (((Integer)value) < 0) return "*";
		else return value.toString();
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.art.IArtTokenResolveResult result) {
		if (lexem.equals("*")) result.setResolvedToken(-1);
		else result.setResolvedToken(Integer.parseInt(lexem));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
