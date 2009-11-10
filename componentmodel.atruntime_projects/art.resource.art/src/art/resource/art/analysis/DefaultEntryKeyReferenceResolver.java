package art.resource.art.analysis;

public class DefaultEntryKeyReferenceResolver implements art.resource.art.IArtReferenceResolver<art.instance.DefaultEntry, art.type.DictionaryDefaultValue> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.DefaultEntry, art.type.DictionaryDefaultValue> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.DefaultEntry, art.type.DictionaryDefaultValue>();
	
	public void resolve(java.lang.String identifier, art.instance.DefaultEntry container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.type.DictionaryDefaultValue> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.DictionaryDefaultValue element, art.instance.DefaultEntry container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
