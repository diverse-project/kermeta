/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.analysis;

public class DictionaryValuedAttributeAttributeReferenceResolver implements org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<pattern.art.instance.DictionaryValuedAttribute, pattern.art.type.Dictionary> {
	
	private IntraPatternResolverDelegate<pattern.art.instance.DictionaryValuedAttribute, pattern.art.type.Dictionary> delegate = new IntraPatternResolverDelegate<pattern.art.instance.DictionaryValuedAttribute, pattern.art.type.Dictionary>();
	
	public void resolve(java.lang.String identifier, pattern.art.instance.DictionaryValuedAttribute container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<pattern.art.type.Dictionary> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.Dictionary element, pattern.art.instance.DictionaryValuedAttribute container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
