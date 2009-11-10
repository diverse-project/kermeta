package art.resource.art.analysis;

public class TransmissionBindingClientReferenceResolver implements art.resource.art.IArtReferenceResolver<art.instance.TransmissionBinding, art.type.Port> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.TransmissionBinding, art.type.Port> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.TransmissionBinding, art.type.Port>();
	
	public void resolve(java.lang.String identifier, art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.type.Port> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.Port element, art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
