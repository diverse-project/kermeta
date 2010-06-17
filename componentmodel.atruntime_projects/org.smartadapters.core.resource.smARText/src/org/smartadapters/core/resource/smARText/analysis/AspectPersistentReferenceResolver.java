/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class AspectPersistentReferenceResolver implements org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<org.smartadapters.core.Aspect, patternframework.PObject> {
	
	private IntraPatternResolverDelegate<org.smartadapters.core.Aspect, patternframework.PObject> delegate = new IntraPatternResolverDelegate<org.smartadapters.core.Aspect, patternframework.PObject>();
	
	public void resolve(java.lang.String identifier, org.smartadapters.core.Aspect container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<patternframework.PObject> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(patternframework.PObject element, org.smartadapters.core.Aspect container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
