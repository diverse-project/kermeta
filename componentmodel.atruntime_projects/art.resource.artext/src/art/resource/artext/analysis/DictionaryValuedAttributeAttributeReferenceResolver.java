package art.resource.artext.analysis;

public class DictionaryValuedAttributeAttributeReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.instance.DictionaryValuedAttribute, art.type.Dictionary> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.instance.DictionaryValuedAttribute, art.type.Dictionary> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.instance.DictionaryValuedAttribute, art.type.Dictionary>();
	
	public void resolve(java.lang.String identifier, art.instance.DictionaryValuedAttribute container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.type.Dictionary> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.Dictionary element, art.instance.DictionaryValuedAttribute container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
