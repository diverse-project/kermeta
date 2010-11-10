/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import smartadapters4ART.resource.smARText.analysis.utils.PIDResolverDelegate;

public class SetruntimeNodeNodeToSetReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<smartadapters4ART.adaptations.SetruntimeNode, art_relaxed.distrib_relaxed.Node> {
	
	private PIDResolverDelegate<smartadapters4ART.adaptations.SetruntimeNode, art_relaxed.distrib_relaxed.Node> delegate = new PIDResolverDelegate<smartadapters4ART.adaptations.SetruntimeNode, art_relaxed.distrib_relaxed.Node>();
	
	public void resolve(java.lang.String identifier, smartadapters4ART.adaptations.SetruntimeNode container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.distrib_relaxed.Node> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.distrib_relaxed.Node element, smartadapters4ART.adaptations.SetruntimeNode container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
