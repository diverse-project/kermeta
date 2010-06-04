/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class DefaultEntryKeyReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<pattern.art.instance.DefaultEntry, pattern.art.type.DictionaryDefaultValue> {
	
	private IntraPatternResolverDelegate<pattern.art.instance.DefaultEntry, pattern.art.type.DictionaryDefaultValue> delegate = new IntraPatternResolverDelegate<pattern.art.instance.DefaultEntry, pattern.art.type.DictionaryDefaultValue>();
	
	public void resolve(java.lang.String identifier, pattern.art.instance.DefaultEntry container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.type.DictionaryDefaultValue> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.DictionaryDefaultValue element, pattern.art.instance.DefaultEntry container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
