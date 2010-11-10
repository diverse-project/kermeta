/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * Helper class to add markers to text files based on EMF's
 * <code>org.eclipse.emf.ecore.resource.Resource.Diagnostic</code>. If a resource
 * contains
 * <code>smartadapters4ART.resource.smARText.ISmARTextTextDiagnostic</code>s it
 * uses the more precise information of this extended diagnostic type.
 */
public class SmARTextMarkerHelper {
	
	/**
	 * The extension id of the custom marker type that is used by this text resource.
	 */
	public static final String MARKER_TYPE = smartadapters4ART.resource.smARText.mopp.SmARTextPlugin.PLUGIN_ID + ".problem";
	/**
	 * The total number of markers per file is restricted with this constant.
	 * Restriction is needed because the performance of Eclipse decreases drastically
	 * if large amounts of markers are added to files.
	 */
	public static int MAXIMUM_MARKERS = 500;
	
	/**
	 * Marks a file with markers.
	 * 
	 * @param resource The resource that is the file to mark.
	 * @param diagnostic The diagnostic with information for the marker.
	 */
	public static void mark(org.eclipse.emf.ecore.resource.Resource resource, final smartadapters4ART.resource.smARText.ISmARTextTextDiagnostic diagnostic) {
		if (resource == null || !org.eclipse.core.runtime.Platform.isRunning()) {
			return;
		}
		String platformString = resource.getURI().toPlatformString(true);
		if (platformString == null) {
			return;
		}
		final org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		// URI might not point at a platform file
		if (file == null) {
			return;
		}
		new org.eclipse.core.runtime.jobs.Job("marking") {
			@Override			
			protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
				createMarkerFromDiagnostic(file, diagnostic);
				return org.eclipse.core.runtime.Status.OK_STATUS;
			}
		}.schedule();
	}
	
	private static void createMarkerFromDiagnostic(org.eclipse.core.resources.IFile file, final smartadapters4ART.resource.smARText.ISmARTextTextDiagnostic diagnostic) {
		try {
			if (file.findMarkers(MARKER_TYPE, false, org.eclipse.core.resources.IResource.DEPTH_ZERO).length >= MAXIMUM_MARKERS) {
				return;
			}
			
			org.eclipse.core.resources.IMarker marker = file.createMarker(MARKER_TYPE);
			if (diagnostic.getProblem().getType() == smartadapters4ART.resource.smARText.SmARTextEProblemType.ERROR) {
				marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, org.eclipse.core.resources.IMarker.SEVERITY_ERROR);
			}
			else {
				marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, org.eclipse.core.resources.IMarker.SEVERITY_WARNING);
			}
			marker.setAttribute(org.eclipse.core.resources.IMarker.MESSAGE, diagnostic.getMessage());
			smartadapters4ART.resource.smARText.ISmARTextTextDiagnostic textDiagnostic = (smartadapters4ART.resource.smARText.ISmARTextTextDiagnostic) diagnostic;
			marker.setAttribute(org.eclipse.core.resources.IMarker.LINE_NUMBER, textDiagnostic.getLine());
			marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, textDiagnostic.getCharStart());
			marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, textDiagnostic.getCharEnd() + 1);
			java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextQuickFix> quickFixes = textDiagnostic.getProblem().getQuickFixes();
			java.util.Collection<Object> sourceIDs = new java.util.ArrayList<Object>();
			if (quickFixes != null) {
				for (smartadapters4ART.resource.smARText.ISmARTextQuickFix quickFix : quickFixes) {
					if (quickFix != null) {
						sourceIDs.add(quickFix.getContextAsString());
					}
				}
			}
			if (!sourceIDs.isEmpty()) {
				marker.setAttribute(org.eclipse.core.resources.IMarker.SOURCE_ID, smartadapters4ART.resource.smARText.util.SmARTextStringUtil.explode(sourceIDs, "|"));
			}
		} catch (org.eclipse.core.runtime.CoreException ce) {
			if (ce.getMessage().matches("Marker.*not found.")) {
				// ignore
			} else {
				smartadapters4ART.resource.smARText.mopp.SmARTextPlugin.logError("Error marking resource:", ce);
			}
		}
	}
	
	/**
	 * Removes all markers from a given resource.
	 * 
	 * @param resource The resource where to delete markers from
	 */
	public static void unmark(org.eclipse.emf.ecore.resource.Resource resource) {
		if (resource == null || !org.eclipse.core.runtime.Platform.isRunning()) {
			return;
		}
		String platformString = resource.getURI().toPlatformString(true);
		if (platformString == null) {
			return;
		}
		final org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		if (file == null) {
			return;
		}
		new org.eclipse.core.runtime.jobs.Job("unmarking") {
			@Override			
			protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
				try {
					file.deleteMarkers(MARKER_TYPE, false, org.eclipse.core.resources.IResource.DEPTH_ZERO);
				} catch (org.eclipse.core.runtime.CoreException ce) {
					if (ce.getMessage().matches("Marker.*not found.")) {
						// ignore
					} else {
						smartadapters4ART.resource.smARText.mopp.SmARTextPlugin.logError("Error marking resource:", ce);
					}
				}
				return org.eclipse.core.runtime.Status.OK_STATUS;
			}
		}.schedule();
	}
}
