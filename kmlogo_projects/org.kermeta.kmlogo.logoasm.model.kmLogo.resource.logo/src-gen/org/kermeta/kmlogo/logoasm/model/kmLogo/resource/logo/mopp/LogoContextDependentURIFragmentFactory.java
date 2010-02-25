/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class LogoContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public LogoContextDependentURIFragmentFactory(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
