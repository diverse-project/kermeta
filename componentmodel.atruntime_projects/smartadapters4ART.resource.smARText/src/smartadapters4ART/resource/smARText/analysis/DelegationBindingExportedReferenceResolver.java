/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import smartadapters4ART.resource.smARText.analysis.utils.IntraPatternResolverDelegate;

public class DelegationBindingExportedReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<art_relaxed.instance_relaxed.DelegationBinding, art_relaxed.type_relaxed.AbstractPort> {
	
	private IntraPatternResolverDelegate<art_relaxed.instance_relaxed.DelegationBinding, art_relaxed.type_relaxed.AbstractPort> delegate = new IntraPatternResolverDelegate<art_relaxed.instance_relaxed.DelegationBinding, art_relaxed.type_relaxed.AbstractPort>();
	
	public void resolve(java.lang.String identifier, art_relaxed.instance_relaxed.DelegationBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.type_relaxed.AbstractPort> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.type_relaxed.AbstractPort element, art_relaxed.instance_relaxed.DelegationBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
