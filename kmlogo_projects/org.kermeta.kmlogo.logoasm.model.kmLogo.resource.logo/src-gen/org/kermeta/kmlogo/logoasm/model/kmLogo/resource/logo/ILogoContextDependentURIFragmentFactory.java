/*$Id : ILogoContextDependentURIFragmentFactory.java v 1.3 May 8, 2010 9:17:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoContextDependentURIFragmentFactory.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// An interface for factories to create instances of org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoContextDependentURIFragment.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public interface ILogoContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> {
	
	// Create a new instance of the org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoContextDependentURIFragment interface.
	//
	// @param identifier the identifier that references an org.eclipse.emf.ecore.EObject
	// @param container the object that contains the reference
	// @param reference the reference itself
	// @param positionInReference the position of the identifier (if the reference is multiple)
	// @param proxy the proxy that will be resolved later to the actual org.eclipse.emf.ecore.EObject
	// @return
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy);
}
