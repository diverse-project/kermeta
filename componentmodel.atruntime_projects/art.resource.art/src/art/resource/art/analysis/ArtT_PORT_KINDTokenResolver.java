package art.resource.art.analysis;

public class ArtT_PORT_KINDTokenResolver implements art.resource.art.IArtTokenResolver {
	
	private art.resource.art.analysis.ArtDefaultTokenResolver defaultTokenResolver = new art.resource.art.analysis.ArtDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("client")) return "required";
		else return "provided";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.art.IArtTokenResolveResult result) {
		if (lexem.equals("provided")) result.setResolvedToken("server");
		else result.setResolvedToken("client");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
