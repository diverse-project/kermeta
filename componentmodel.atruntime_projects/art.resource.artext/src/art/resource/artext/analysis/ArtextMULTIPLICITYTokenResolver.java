package art.resource.artext.analysis;

public class ArtextMULTIPLICITYTokenResolver implements art.resource.artext.IArtextTokenResolver {
	
	private art.resource.artext.analysis.ArtextDefaultTokenResolver defaultTokenResolver = new art.resource.artext.analysis.ArtextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (((Integer)value) < 0) return "*";
		else return value.toString();
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.IArtextTokenResolveResult result) {
		if (lexem.equals("*")) result.setResolvedToken(-1);
		else result.setResolvedToken(Integer.parseInt(lexem));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
