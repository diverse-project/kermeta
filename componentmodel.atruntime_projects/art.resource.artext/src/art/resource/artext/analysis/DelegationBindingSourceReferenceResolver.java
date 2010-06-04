/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.analysis;

public class DelegationBindingSourceReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.instance.DelegationBinding, art.type.AbstractPort> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.instance.DelegationBinding, art.type.AbstractPort> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.instance.DelegationBinding, art.type.AbstractPort>();
	
	public void resolve(java.lang.String identifier, art.instance.DelegationBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.type.AbstractPort> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.AbstractPort element, art.instance.DelegationBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
