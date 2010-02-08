/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.analysis;

import art.instance.ComponentInstance;
import art.type.AbstractPort;

public class TransmissionBindingClientReferenceResolver implements art.resource.art.IArtReferenceResolver<art.instance.TransmissionBinding, art.type.AbstractPort> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.TransmissionBinding, art.type.AbstractPort> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.instance.TransmissionBinding, art.type.AbstractPort>();
	
	public void resolve(java.lang.String identifier, art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.type.AbstractPort> result) {
		ComponentInstance c = (ComponentInstance)container.eContainer();

		for (AbstractPort p : c.getType().getPort()) {
			if (p.getName().equals(identifier)) {
				result.addMapping(identifier, p);
				break;
			}
		}
	}
	
	public java.lang.String deResolve(art.type.AbstractPort element, art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
