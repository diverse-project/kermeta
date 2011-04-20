package org.kermeta.utils.error.report.eclipse.api;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;

public interface Reporter {
	
	public static final String KERMETA_PROBLEM_MARKER = "org.kermeta.utils.error.report.eclipse.Kermeta2ProblemMarker";
	
	public void reportProblem(URL theConcernedFile, String message, Integer lineNumber, Integer beginChar, Integer endChar);
	public void flushAllKermetaProblemMarkers(URL theConcernedFile) throws CoreException;
	public void flushAllMarkers(URL theConcernedFile ) throws CoreException;

}
