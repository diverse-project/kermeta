/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.analysis;

public class BindingServerInstanceReferenceResolver implements org.smartadapters.core.resource.core.ICoreReferenceResolver<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance> {
	
	private IntraPatternResolverDelegate<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance> delegate = new IntraPatternResolverDelegate<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance>();
	
	public void resolve(java.lang.String identifier, pattern.art.instance.Binding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.smartadapters.core.resource.core.ICoreReferenceResolveResult<pattern.art.instance.ComponentInstance> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(pattern.art.instance.ComponentInstance element, pattern.art.instance.Binding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
