/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class ValuedAttributeAttributeReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<pattern.art.instance.ValuedAttribute, pattern.art.type.BasicAttribute> {
	
	private IntraPatternResolverDelegate<pattern.art.instance.ValuedAttribute, pattern.art.type.BasicAttribute> delegate = new IntraPatternResolverDelegate<pattern.art.instance.ValuedAttribute, pattern.art.type.BasicAttribute>();
	
	public void resolve(java.lang.String identifier, pattern.art.instance.ValuedAttribute container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.type.BasicAttribute> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.type.BasicAttribute element, pattern.art.instance.ValuedAttribute container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
