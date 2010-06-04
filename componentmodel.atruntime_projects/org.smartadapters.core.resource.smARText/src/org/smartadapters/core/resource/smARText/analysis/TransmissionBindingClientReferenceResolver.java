/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

import pattern.art.instance.ComponentInstance;
import pattern.art.type.AbstractPort;



public class TransmissionBindingClientReferenceResolver implements org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort> {
	
	private IntraPatternResolverDelegate<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort> delegate = new IntraPatternResolverDelegate<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort>();
	
	public void resolve(java.lang.String identifier, pattern.art.instance.TransmissionBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<pattern.art.type.AbstractPort> result) {
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
