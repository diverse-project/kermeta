/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

public class ArtResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ArtResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new art.resource.art.mopp.ArtResource(uri);
	}
}
