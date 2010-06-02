/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

import pattern.art.instance.ComponentInstance;
import pattern.art.type.AbstractPort;



public class TransmissionBindingClientReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort> {
	
	private org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort> delegate = new org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort>();
	
	public void resolve(java.lang.String identifier, pattern.art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.type.AbstractPort> result) {
		ComponentInstance c = (ComponentInstance)container.eContainer();

		for (AbstractPort p : c.getType().getPort()) {
			if (p.getName().equals(identifier)) {
				result.addMapping(identifier, p);
				break;
			}
		}
	}
	
	public java.lang.String deResolve(pattern.art.type.AbstractPort element, pattern.art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
