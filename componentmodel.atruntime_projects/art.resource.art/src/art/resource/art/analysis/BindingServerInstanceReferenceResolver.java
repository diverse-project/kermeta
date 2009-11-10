package art.resource.art.analysis;

public class BindingServerInstanceReferenceResolver implements art.resource.art.IArtReferenceResolver<art.instance.Binding, art.instance.ComponentInstance> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.Binding, art.instance.ComponentInstance> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.Binding, art.instance.ComponentInstance>();
	
	public void resolve(java.lang.String identifier, art.instance.Binding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.instance.ComponentInstance> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.instance.ComponentInstance element, art.instance.Binding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
