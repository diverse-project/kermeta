/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class SetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.CompositeInstance> {
	
	private PIDResolverDelegate<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.CompositeInstance> delegate = new PIDResolverDelegate<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.CompositeInstance>();
	
	public void resolve(java.lang.String identifier, org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.instance.CompositeInstance> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.instance.CompositeInstance element, org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
