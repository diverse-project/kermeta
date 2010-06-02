/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class AbstractPortServiceReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<pattern.art.type.AbstractPort, pattern.art.type.Service> {
	
	private org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<pattern.art.type.AbstractPort, pattern.art.type.Service> delegate = new org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<pattern.art.type.AbstractPort, pattern.art.type.Service>();
	
	public void resolve(java.lang.String identifier, pattern.art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.type.Service> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.Service element, pattern.art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
