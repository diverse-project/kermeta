package art.resource.artext.analysis;

public class ArtextT_PORT_KINDTokenResolver implements art.resource.artext.IArtextTokenResolver {
	
	private art.resource.artext.analysis.ArtextDefaultTokenResolver defaultTokenResolver = new art.resource.artext.analysis.ArtextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("client")) return "required";
		else return "provided";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.IArtextTokenResolveResult result) {
		if (lexem.equals("provided")) result.setResolvedToken("server");
		else result.setResolvedToken("client");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
