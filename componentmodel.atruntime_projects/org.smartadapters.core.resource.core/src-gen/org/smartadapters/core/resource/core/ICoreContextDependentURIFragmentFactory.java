/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core;

// An interface for factories to create instances of org.smartadapters.core.resource.core.ICoreContextDependentURIFragment.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public interface ICoreContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> {
	
	// Create a new instance of the org.smartadapters.core.resource.core.ICoreContextDependentURIFragment interface.
	//
	// @param identifier the identifier that references an org.eclipse.emf.ecore.EObject
	// @param container the object that contains the reference
	// @param reference the reference itself
	// @param positionInReference the position of the identifier (if the reference is multiple)
	// @param proxy the proxy that will be resolved later to the actual org.eclipse.emf.ecore.EObject
	// @return
	public org.smartadapters.core.resource.core.ICoreContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy);
}
