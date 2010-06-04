package art.resource.artext.analysis;

public class ComponentInstanceGroupsReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.instance.ComponentInstance, art.group.InstanceGroup> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.instance.ComponentInstance, art.group.InstanceGroup> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.instance.ComponentInstance, art.group.InstanceGroup>();
	
	public void resolve(java.lang.String identifier, art.instance.ComponentInstance container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.group.InstanceGroup> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.group.InstanceGroup element, art.instance.ComponentInstance container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
