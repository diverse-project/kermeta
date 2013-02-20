package org.kermeta.utils.error.report.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;

public class KermetaReporter {
	
	public static void addMarker(String Marker,IFile file, String message, Integer lineNumber, Integer beginChar, Integer endChar) {
		try {
			IMarker marker = file.createMarker(Marker);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.CHAR_START, beginChar);
			marker.setAttribute(IMarker.CHAR_END, endChar);
		} catch (CoreException e) {
		}
	}	
}
