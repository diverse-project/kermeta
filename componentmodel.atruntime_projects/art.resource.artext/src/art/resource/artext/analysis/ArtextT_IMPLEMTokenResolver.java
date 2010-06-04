package art.resource.artext.analysis;

public class ArtextT_IMPLEMTokenResolver implements art.resource.artext.IArtextTokenResolver {
	
	private art.resource.artext.analysis.ArtextDefaultTokenResolver defaultTokenResolver = new art.resource.artext.analysis.ArtextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value.toString().equals("true")) return "bundle";
		else return "memory";
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.IArtextTokenResolveResult result) {
		result.setResolvedToken(lexem.equals("bundle"));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
