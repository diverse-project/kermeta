/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import org.eclipse.emf.ecore.EObject;

import smartadapters4ART.resource.smARText.analysis.utils.PIDResolverDelegate;

public class ScopedInstantiationPointcutElementsReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<smartadapters4ART.ScopedInstantiation, art_relaxed.AspectModelElement> {
	
	private PIDResolverDelegate<EObject, art_relaxed.AspectModelElement> delegate = new PIDResolverDelegate<EObject, art_relaxed.AspectModelElement>();
	
	public void resolve(java.lang.String identifier, smartadapters4ART.ScopedInstantiation container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.AspectModelElement> result) {
		EObject root = container;
		while (root.eContainer() != null) root = root.eContainer();
		delegate.resolve(identifier, root, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.AspectModelElement element, smartadapters4ART.ScopedInstantiation container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
