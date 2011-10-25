/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

/**
 * A provider for annotation models.
 */
public interface IKpAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel();
	
}
