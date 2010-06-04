package art.resource.artext.analysis;

public class TypeGroupTypesReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.group.TypeGroup, art.type.ComponentType> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.group.TypeGroup, art.type.ComponentType> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.group.TypeGroup, art.type.ComponentType>();
	
	public void resolve(java.lang.String identifier, art.group.TypeGroup container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.type.ComponentType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.ComponentType element, art.group.TypeGroup container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
