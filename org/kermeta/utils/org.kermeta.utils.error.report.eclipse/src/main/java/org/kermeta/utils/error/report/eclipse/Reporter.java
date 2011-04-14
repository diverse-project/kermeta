package org.kermeta.utils.error.report.eclipse;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.utils.error.report.eclipse.internal.KermetaReporter;

public class Reporter implements org.kermeta.utils.error.report.eclipse.api.Reporter {

	@Override
	public void flushAllKermetaProblemMarkers(URL theConcernedFile) throws CoreException {
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(cleanString(theConcernedFile));
		file.deleteMarkers(KERMETA_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);		
	}

	@Override
	public void flushAllMarkers(URL theConcernedFile) throws CoreException {
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(cleanString(theConcernedFile));
		file.deleteMarkers(null, true, IResource.DEPTH_INFINITE);		
	}

	@Override
	public void reportProblem(URL theConcernedFile, String message, Integer lineNumber, Integer beginChar, Integer endChar) {
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(cleanString(theConcernedFile));
		KermetaReporter.addMarker(KERMETA_PROBLEM_MARKER,file,message,lineNumber,beginChar,endChar);
	}

	private String cleanString(URL toClean) {
		String cleanString = toClean.toString();
		if (cleanString.startsWith("file://")) {
			cleanString = cleanString.replaceFirst("file://", "");
		}
		cleanString = cleanString.replaceFirst(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), "");
		return cleanString;
	}
}

