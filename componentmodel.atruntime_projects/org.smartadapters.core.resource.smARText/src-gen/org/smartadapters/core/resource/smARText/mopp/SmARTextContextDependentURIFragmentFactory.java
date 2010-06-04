/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class SmARTextContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.smartadapters.core.resource.smARText.ISmARTextContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public SmARTextContextDependentURIFragmentFactory(org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.smartadapters.core.resource.smARText.ISmARTextReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
