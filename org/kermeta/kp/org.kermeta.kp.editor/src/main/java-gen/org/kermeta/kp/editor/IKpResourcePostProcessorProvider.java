/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IKpResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.kermeta.kp.editor.IKpResourcePostProcessor getResourcePostProcessor();
	
}
