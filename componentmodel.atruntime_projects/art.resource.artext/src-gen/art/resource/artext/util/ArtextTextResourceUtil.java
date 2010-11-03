/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.util;

/**
 * Class TextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 */
public class ArtextTextResourceUtil {
	
	public static art.resource.artext.mopp.ArtextResource getResource(org.eclipse.core.resources.IFile file) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(),true), true);
		return (art.resource.artext.mopp.ArtextResource) csResource;
	}
	
	public static art.resource.artext.mopp.ArtextResource getResource(java.io.File file) {
		return getResource(file, null);
	}
	
	public static art.resource.artext.mopp.ArtextResource getResource(java.io.File file, java.util.Map<?,?> options) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		if (options != null) {
			rs.getLoadOptions().putAll(options);
		}
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createFileURI(file.getAbsolutePath()), true);
		return (art.resource.artext.mopp.ArtextResource) csResource;
	}
}
