package org.kermeta.utils.systemservices.eclipse.internal;

import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.reference.FileReference;
import org.kermeta.utils.systemservices.api.reference.ModelReference;
import org.kermeta.utils.systemservices.api.reference.Reference;
import org.kermeta.utils.systemservices.api.reference.TextReference;
import org.kermeta.utils.systemservices.eclipse.api.Activator;
import org.kermeta.utils.systemservices.eclipse.api.EclipseMessagingSystem;

public class EclipseReporter {
	
	public static final String PROBLEM_MARKER_ID = "org.kermeta.utils.system.eclipse.ProblemMarker";
	
	protected MessagingSystem ms;
	
	public EclipseReporter(EclipseMessagingSystem eclipseMessagingSystem) {
		ms = eclipseMessagingSystem;
	}

	public void addMarker( int markerSeverity, Reference ref, String msg){
		if(ref instanceof TextReference){
			try {
				IFile iFile = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(cleanString(((TextReference)ref).getFileURL()));			
				addMarker(markerSeverity, PROBLEM_MARKER_ID, iFile,msg, ((TextReference) ref).getBeginLine(), ((TextReference) ref).getBeginOffset(), ((TextReference) ref).getEndOffset());
				ms.log(Kind.DevDEBUG, "File marked ("+iFile+")", Activator.PLUGIN_ID);
			} catch (Exception e) {
				ms.log(Kind.DevERROR, "Failed to mark TextFile ("+((TextReference)ref).getFileURL().getPath()+")", Activator.PLUGIN_ID, e);
			}
		}
		else if(ref instanceof FileReference){
			
		}
		else if(ref instanceof ModelReference){
			
		}
	}
	
	public void addMarker(int markerSeverity, String Marker,IFile file, String message, Integer lineNumber, Integer beginChar, Integer endChar) {
		try {
			IMarker marker = file.createMarker(Marker);
			marker.setAttribute(IMarker.MESSAGE, message != null ? message : "<null>");
			marker.setAttribute(IMarker.SEVERITY, markerSeverity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.CHAR_START, beginChar);
			marker.setAttribute(IMarker.CHAR_END, endChar);
		} catch (CoreException e) {
			ms.log(Kind.DevERROR, "Failed to mark TextFile", Activator.PLUGIN_ID, e);
		}
	}
	public void addMarker(int markerSeverity, String Marker,IFile file, String message) {
		try {
			IMarker marker = file.createMarker(Marker);
			marker.setAttribute(IMarker.MESSAGE, message != null ? message : "<null>");
			marker.setAttribute(IMarker.SEVERITY, markerSeverity);			
		} catch (CoreException e) {
			ms.log(Kind.DevERROR, "Failed to mark TextFile", Activator.PLUGIN_ID, e);
		}
	}
	
	private String cleanString(URL toClean) {
		String cleanString = toClean.toString();
		if (cleanString.startsWith("file://")) {
			cleanString = cleanString.replaceFirst("file://", "");
		}
		cleanString = cleanString.replaceFirst(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), "");
		return cleanString;
	}

	public void flushProblem(String problemGroup) {
		try {
			IResource file = ResourcesPlugin.getWorkspace().getRoot();		
			file.deleteMarkers(PROBLEM_MARKER_ID, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			ms.log(Kind.DevERROR, "Failed to flush markers for group "+problemGroup, Activator.PLUGIN_ID, e);
		}	
	}
}