package art.resource.art.analysis;

public class ArtT_OPTIONALTokenResolver implements art.resource.art.IArtTokenResolver {
	
	private art.resource.art.analysis.ArtDefaultTokenResolver defaultTokenResolver = new art.resource.art.analysis.ArtDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("true")) return " optional";
		else return "";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.art.IArtTokenResolveResult result) {
		result.setResolvedToken(lexem.equals("optional"));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
