/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class TypedElementTypeReferenceResolver implements org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<pattern.art.TypedElement, pattern.art.DataType> {
	
	private IntraPatternResolverDelegate<pattern.art.TypedElement, pattern.art.DataType> delegate = new IntraPatternResolverDelegate<pattern.art.TypedElement, pattern.art.DataType>();
	
	public void resolve(java.lang.String identifier, pattern.art.TypedElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<pattern.art.DataType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.DataType element, pattern.art.TypedElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
