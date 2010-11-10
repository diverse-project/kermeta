/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import smartadapters4ART.resource.smARText.analysis.utils.IntraPatternResolverDelegate;

public class AbstractPortServiceReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<art_relaxed.type_relaxed.AbstractPort, art_relaxed.type_relaxed.Service> {
	
	private IntraPatternResolverDelegate<art_relaxed.type_relaxed.AbstractPort, art_relaxed.type_relaxed.Service> delegate = new IntraPatternResolverDelegate<art_relaxed.type_relaxed.AbstractPort, art_relaxed.type_relaxed.Service>();
	
	public void resolve(java.lang.String identifier, art_relaxed.type_relaxed.AbstractPort container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.type_relaxed.Service> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.type_relaxed.Service element, art_relaxed.type_relaxed.AbstractPort container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
