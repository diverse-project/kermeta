/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.analysis;

public class AbstractPortServiceReferenceResolver implements art.resource.art.IArtReferenceResolver<art.type.AbstractPort, art.type.Service> {
	
	private art.resource.art.analysis.ArtDefaultResolverDelegate<art.type.AbstractPort, art.type.Service> delegate = new art.resource.art.analysis.ArtDefaultResolverDelegate<art.type.AbstractPort, art.type.Service>();
	
	public void resolve(java.lang.String identifier, art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.art.IArtReferenceResolveResult<art.type.Service> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.Service element, art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
