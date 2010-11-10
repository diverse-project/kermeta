/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import smartadapters4ART.resource.smARText.analysis.utils.IntraPatternResolverDelegate;
import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.type_relaxed.AbstractPort;


public class TransmissionBindingClientReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<art_relaxed.instance_relaxed.TransmissionBinding, art_relaxed.type_relaxed.AbstractPort> {
	
	private IntraPatternResolverDelegate<art_relaxed.instance_relaxed.TransmissionBinding, art_relaxed.type_relaxed.AbstractPort> delegate = new IntraPatternResolverDelegate<art_relaxed.instance_relaxed.TransmissionBinding, art_relaxed.type_relaxed.AbstractPort>();
	
	public void resolve(java.lang.String identifier, art_relaxed.instance_relaxed.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.type_relaxed.AbstractPort> result) {
		
		ComponentInstance c = (ComponentInstance)container.eContainer();

		for (AbstractPort p : c.getType().getPort()) {
			if (p.getName().equals(identifier)) {
				result.addMapping(identifier, p);
				break;
			}
		}
	}
	
	public java.lang.String deResolve(art_relaxed.type_relaxed.AbstractPort element, art_relaxed.instance_relaxed.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
