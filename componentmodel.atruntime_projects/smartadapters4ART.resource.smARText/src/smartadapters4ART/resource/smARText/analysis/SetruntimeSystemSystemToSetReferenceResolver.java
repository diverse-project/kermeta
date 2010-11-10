/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import smartadapters4ART.resource.smARText.analysis.utils.PIDResolverDelegate;

public class SetruntimeSystemSystemToSetReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<smartadapters4ART.adaptations.SetruntimeSystem, art_relaxed.System> {
	
	private PIDResolverDelegate<smartadapters4ART.adaptations.SetruntimeSystem, art_relaxed.System> delegate = new PIDResolverDelegate<smartadapters4ART.adaptations.SetruntimeSystem, art_relaxed.System>();
	
	public void resolve(java.lang.String identifier, smartadapters4ART.adaptations.SetruntimeSystem container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.System> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.System element, smartadapters4ART.adaptations.SetruntimeSystem container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
