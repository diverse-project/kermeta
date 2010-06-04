/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText;

// An IReferenceResolverSwitch is a object that holds references to multiple
// other reference resolvers and delegates requests to the appropriate resolver.
public interface ISmARTextReferenceResolverSwitch extends org.smartadapters.core.resource.smARText.ISmARTextConfigurable {
	
	// Attempts to resolve a reference string fuzzy (returning objects that do not match exactly).
	//
	// @param identifier The identifier for the reference.
	// @param container The object that contains the reference.
	// @param reference The reference that points to the target of the reference.
	// @param result an object to store the result of the resolve operation.
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.smartadapters.core.resource.smARText.ISmARTextReferenceResolveResult<org.eclipse.emf.ecore.EObject> result);
}
