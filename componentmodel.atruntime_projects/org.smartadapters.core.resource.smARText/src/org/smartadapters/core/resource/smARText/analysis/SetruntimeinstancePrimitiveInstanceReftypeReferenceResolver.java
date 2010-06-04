/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class SetruntimeinstancePrimitiveInstanceReftypeReferenceResolver implements org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.type.ComponentType> {
	
	private PIDResolverDelegate<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.type.ComponentType> delegate = new PIDResolverDelegate<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.type.ComponentType>();
	
	public void resolve(java.lang.String identifier, org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<pattern.art.type.ComponentType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.ComponentType element, org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
