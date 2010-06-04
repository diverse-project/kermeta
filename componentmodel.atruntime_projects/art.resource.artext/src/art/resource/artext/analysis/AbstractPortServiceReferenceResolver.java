/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.analysis;

public class AbstractPortServiceReferenceResolver implements art.resource.artext.IArtextReferenceResolver<art.type.AbstractPort, art.type.Service> {
	
	private art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.type.AbstractPort, art.type.Service> delegate = new art.resource.artext.analysis.ArtextDefaultResolverDelegate<art.type.AbstractPort, art.type.Service>();
	
	public void resolve(java.lang.String identifier, art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final art.resource.artext.IArtextReferenceResolveResult<art.type.Service> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art.type.Service element, art.type.AbstractPort container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
