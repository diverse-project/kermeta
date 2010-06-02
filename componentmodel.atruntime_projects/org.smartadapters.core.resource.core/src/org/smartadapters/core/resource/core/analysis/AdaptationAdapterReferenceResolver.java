/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class AdaptationAdapterReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<org.smartadapters.core.Adaptation, org.smartadapters.core.Adapter> {
	
	private org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<org.smartadapters.core.Adaptation, org.smartadapters.core.Adapter> delegate = new org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<org.smartadapters.core.Adaptation, org.smartadapters.core.Adapter>();
	
	public void resolve(java.lang.String identifier, org.smartadapters.core.Adaptation container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<org.smartadapters.core.Adapter> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.smartadapters.core.Adapter element, org.smartadapters.core.Adaptation container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
