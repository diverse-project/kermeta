/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

public class KpAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public KpAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new org.kermeta.kp.editor.ui.KpMarkerAnnotation(marker);
	}
	
}
