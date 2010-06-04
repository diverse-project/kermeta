package art.resource.artext.analysis;

public class ComponentTypeGroupsReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.type.ComponentType, art.group.TypeGroup> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.type.ComponentType, art.group.TypeGroup> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.type.ComponentType, art.group.TypeGroup>();
	
	public void resolve(java.lang.String identifier, art.type.ComponentType container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.group.TypeGroup> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.group.TypeGroup element, art.type.ComponentType container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
