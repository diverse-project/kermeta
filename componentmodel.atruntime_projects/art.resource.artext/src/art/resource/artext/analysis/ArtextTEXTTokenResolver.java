package art.resource.artext.analysis;

public class ArtextTEXTTokenResolver implements art.resource.artext.IArtextTokenResolver {
	
	private art.resource.artext.analysis.ArtextDefaultTokenResolver defaultTokenResolver = new art.resource.artext.analysis.ArtextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		if (result == null || result == "") result = "NO_IDENTIFIER";
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.IArtextTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
