/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class ArtContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements art.resource.art.IArtContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final art.resource.art.IArtReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public ArtContextDependentURIFragmentFactory(art.resource.art.IArtReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public art.resource.art.IArtContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new art.resource.art.mopp.ArtContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public art.resource.art.IArtReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
