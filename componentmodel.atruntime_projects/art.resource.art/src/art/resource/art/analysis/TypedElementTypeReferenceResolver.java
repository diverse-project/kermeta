package art.resource.art.analysis;

public class TypedElementTypeReferenceResolver implements art.resource.art.IArtReferenceResolver<art.TypedElement, art.DataType> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.TypedElement, art.DataType> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.TypedElement, art.DataType>();
	
	public void resolve(java.lang.String identifier, art.TypedElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.DataType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.DataType element, art.TypedElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
