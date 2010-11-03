/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ArtextResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new art.resource.artext.mopp.ArtextResource(uri);
	}
	
}
