/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IKpResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.kermeta.kp.editor.IKpTextResource getResource();
	
}
