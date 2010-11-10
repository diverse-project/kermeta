/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SmARTextResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextResource(uri);
	}
	
}
