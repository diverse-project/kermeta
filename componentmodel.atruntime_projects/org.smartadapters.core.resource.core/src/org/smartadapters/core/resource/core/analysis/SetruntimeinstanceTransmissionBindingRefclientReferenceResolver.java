/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class SetruntimeinstanceTransmissionBindingRefclientReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort> {
	
	private PIDResolverDelegate<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort> delegate = new PIDResolverDelegate<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort>();
	
	public void resolve(java.lang.String identifier, org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.type.AbstractPort> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.AbstractPort element, org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
