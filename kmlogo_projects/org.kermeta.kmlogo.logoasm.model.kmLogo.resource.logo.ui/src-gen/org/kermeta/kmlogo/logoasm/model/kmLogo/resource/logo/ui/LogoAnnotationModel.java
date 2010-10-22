/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

public class LogoAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel implements org.eclipse.jface.text.source.IAnnotationModel {
	
	public LogoAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoMarkerAnnotation(marker);
	}
	
}
