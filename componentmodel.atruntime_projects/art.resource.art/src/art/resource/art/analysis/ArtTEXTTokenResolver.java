package art.resource.art.analysis;

public class ArtTEXTTokenResolver implements art.resource.art.IArtTokenResolver {
	
	private art.resource.art.analysis.ArtDefaultTokenResolver defaultTokenResolver = new art.resource.art.analysis.ArtDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		if (result == null || result == "") result = "NO_IDENTIFIER";
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.art.IArtTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
