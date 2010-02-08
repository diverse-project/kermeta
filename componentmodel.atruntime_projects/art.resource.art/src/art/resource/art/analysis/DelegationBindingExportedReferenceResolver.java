/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.analysis;

public class DelegationBindingExportedReferenceResolver implements art.resource.art.IArtReferenceResolver<art.instance.DelegationBinding, art.type.AbstractPort> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.DelegationBinding, art.type.AbstractPort> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.DelegationBinding, art.type.AbstractPort>();
	
	public void resolve(java.lang.String identifier, art.instance.DelegationBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.type.AbstractPort> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.AbstractPort element, art.instance.DelegationBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
