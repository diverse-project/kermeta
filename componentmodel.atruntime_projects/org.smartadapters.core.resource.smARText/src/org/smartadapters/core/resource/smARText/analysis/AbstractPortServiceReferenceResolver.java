/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class AbstractPortServiceReferenceResolver implements org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<pattern.art.type.AbstractPort, pattern.art.type.Service> {
	
	private IntraPatternResolverDelegate<pattern.art.type.AbstractPort, pattern.art.type.Service> delegate = new IntraPatternResolverDelegate<pattern.art.type.AbstractPort, pattern.art.type.Service>();
	
	public void resolve(java.lang.String identifier, pattern.art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<pattern.art.type.Service> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.Service element, pattern.art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
