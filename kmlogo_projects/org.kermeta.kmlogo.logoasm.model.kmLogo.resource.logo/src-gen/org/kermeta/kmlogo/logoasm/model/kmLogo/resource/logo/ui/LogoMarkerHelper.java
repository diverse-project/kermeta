/*$Id : LogoMarkerHelper.java v 1.3 May 8, 2010 9:18:19 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoMarkerHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

// Helper class to add markers to test files based on EMF's <code>org.eclipse.emf.ecore.resource.Resource.org.eclipse.emf.ecore.resource.Resource.Diagnostic</code>.
// If a resource contains <code>org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextDiagnostic</code>s it uses the more precise information of
// this extended diagnostic type.
public class LogoMarkerHelper {
	
	public static final String MARKER_TYPE = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.PLUGIN_ID + ".problem";
	
	// Marks a file with markers.
	//
	// @param resource The resource that is the file to mark.
	// @throws org.eclipse.core.runtime.CoreException
	public static void mark(org.eclipse.emf.ecore.resource.Resource resource) throws org.eclipse.core.runtime.CoreException {
		if (resource == null) {
			return;
		}
		org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getURI().toPlatformString(true));
		//URI might not point at a platform file
		if (file == null) {
			return;
		}
		createMarkersFromDiagnostics(resource, file, resource.getErrors(), org.eclipse.core.resources.IMarker.SEVERITY_ERROR);
		createMarkersFromDiagnostics(resource, file, resource.getWarnings(), org.eclipse.core.resources.IMarker.SEVERITY_WARNING);
	}
	
	private static void createMarkersFromDiagnostics(org.eclipse.emf.ecore.resource.Resource resource, org.eclipse.core.resources.IFile file, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics, int markerSeverity) throws org.eclipse.core.runtime.CoreException {
		
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic diagnostic : diagnostics) {
			try {
				org.eclipse.core.resources.IMarker marker = file.createMarker(MARKER_TYPE);
				marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, markerSeverity);
				marker.setAttribute(org.eclipse.core.resources.IMarker.MESSAGE, diagnostic.getMessage());
				if (diagnostic instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextDiagnostic) {
					org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextDiagnostic textDiagnostic = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextDiagnostic) diagnostic;
					marker.setAttribute(org.eclipse.core.resources.IMarker.LINE_NUMBER, textDiagnostic.getLine());
					marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, textDiagnostic.getCharStart());
					marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, textDiagnostic.getCharEnd() + 1);
				}
				else {
					marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, 0);
					marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, 1);
				}
			} catch (org.eclipse.core.runtime.CoreException ce) {
				if (ce.getMessage().matches("Marker.*not found.")) {
					// ignore
				} else {
					ce.printStackTrace();
				}
			}
		}
	}
	
	// Removes all markers from a given resource.
	//
	// @param resource The resource where to delete markers from.
	//
	// @throws org.eclipse.core.runtime.CoreException
	public static void unmark(org.eclipse.emf.ecore.resource.Resource resource) throws org.eclipse.core.runtime.CoreException {
		org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getURI().toPlatformString(true));
		if (file != null) {
			file.deleteMarkers(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoMarkerHelper.MARKER_TYPE, false, org.eclipse.core.resources.IResource.DEPTH_ZERO);
		}
	}
}
