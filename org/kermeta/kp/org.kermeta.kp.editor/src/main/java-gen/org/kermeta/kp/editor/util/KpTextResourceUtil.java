/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.util;

/**
 * Class KpTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * org.kermeta.kp.editor.util.KpResourceUtil.
 */
public class KpTextResourceUtil {
	
	@Deprecated	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(org.eclipse.core.resources.IFile file) {
		return org.kermeta.kp.editor.util.KpResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.kermeta.kp.editor.util.KpResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.kermeta.kp.editor.util.KpResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static org.kermeta.kp.editor.mopp.KpResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.kermeta.kp.editor.util.KpResourceUtil.getResource(uri, options);
	}
	
}
