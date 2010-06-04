package art.resource.artext.analysis;

public class InstanceGroupInstancesReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.group.InstanceGroup, art.instance.ComponentInstance> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.group.InstanceGroup, art.instance.ComponentInstance> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.group.InstanceGroup, art.instance.ComponentInstance>();
	
	public void resolve(java.lang.String identifier, art.group.InstanceGroup container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.instance.ComponentInstance> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.instance.ComponentInstance element, art.group.InstanceGroup container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
