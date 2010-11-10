/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

import smartadapters4ART.resource.smARText.analysis.utils.PIDResolverDelegate;

public class SetruntimeinstancePrimitiveInstanceReftypeReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance, art_relaxed.type_relaxed.ComponentType> {
	
	private PIDResolverDelegate<smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance, art_relaxed.type_relaxed.ComponentType> delegate = new PIDResolverDelegate<smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance, art_relaxed.type_relaxed.ComponentType>();
	
	public void resolve(java.lang.String identifier, smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.type_relaxed.ComponentType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.type_relaxed.ComponentType element, smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
