package art.resource.artext.analysis;

public class TypedElementTypeReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.TypedElement, art.DataType> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.TypedElement, art.DataType> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.TypedElement, art.DataType>();
	
	public void resolve(java.lang.String identifier, art.TypedElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.DataType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.DataType element, art.TypedElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
