/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class PRolePlayerReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<patternframework.PRole, patternframework.PObject> {
	
	private org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<patternframework.PRole, patternframework.PObject> delegate = new org.smartadapters.core.resource.core.analysis.CoreDefaultResolverDelegate<patternframework.PRole, patternframework.PObject>();
	
	public void resolve(java.lang.String identifier, patternframework.PRole container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<patternframework.PObject> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(patternframework.PObject element, patternframework.PRole container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
