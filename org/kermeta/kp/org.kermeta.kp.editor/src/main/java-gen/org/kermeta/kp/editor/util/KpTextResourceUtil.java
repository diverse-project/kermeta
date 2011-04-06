/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.util;

/**
 * Class TextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 */
public class KpTextResourceUtil {
	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(/*org.eclipse.core.resources.IFile file*/) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource csResource = null;//rs.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(),true), true);
		return (org.kermeta.kp.editor.mopp.KpResource) csResource;
	}
	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(java.io.File file) {
		return getResource(file, null);
	}
	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(java.io.File file, java.util.Map<?,?> options) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		if (options != null) {
			rs.getLoadOptions().putAll(options);
		}
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createFileURI(file.getAbsolutePath()), true);
		return (org.kermeta.kp.editor.mopp.KpResource) csResource;
	}
}
