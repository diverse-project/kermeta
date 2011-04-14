/* $Id: KermetaMarker.java 13575 2010-11-23 17:22:46Z hrambelo $
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 7 sept. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.utils.error.report.eclipse.art2.impl.Art2ComponentEclipseErrorReport;
import org.eclipse.ui.PlatformUI;

/**
 * Helper class to add markers to text files
 */
public class KermetaMarker {
	
	/**
	 * The marker type : must correspond to the type that is declared in the
	 * extension "org.eclipse.core.resources.markers" in
	 * fr.irisa.triskell.kermeta/plugin.xml (super
	 * type="org.eclipse.core.resources.problemmarker")
	 */
	protected static String getMarkerType() {
		return IMarker.PROBLEM;
	}

	/**
	 * Mark file resource on error
	 * @param file the file resource to be marked
	 * @param message the error message
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 * @throws CoreException if something goes wrong, the exception thrown
	 */
	private void markError(IFile file, String message, int charStart,
			int charStop) throws CoreException {

		if (file == null){
			return;
		}
		IMarker[] markers;
		markers = file.findMarkers(IMarker.PROBLEM, false, IResource.DEPTH_ZERO);
		boolean found = false ;
		//if a marker already exists at this position with the begining of the error message then just complete the message
		for (IMarker marker : markers) {
			String msg = (String) marker.getAttribute(IMarker.MESSAGE);
			int start = (Integer) marker.getAttribute(IMarker.CHAR_START); 
			//TODO better solution is to clear all loader marker before parsing
			if(message.contains(msg) && start == charStart ){
				marker.setAttribute(IMarker.MESSAGE, message);
				found = true;
				break;
			}
		}
		//if no marker similar to the text already exists then mark
		if(!found){
			mark(file, message, IMarker.SEVERITY_ERROR, charStart, charStop);
		}
	}

	/**
	 * Mark file resource on warning
	 * @param file the file resource to be marked
	 * @param message the warning message
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 * @throws CoreException if something goes wrong, the exception thrown
	 */
	private void markWarning(IFile file, String message, int charStart,
			int charStop) throws CoreException {
		if (file == null){
			return;
		}
		mark(file, message, IMarker.SEVERITY_WARNING, charStart, charStop);
	}
	
	/**
	 * Mark file resource according to error severity
	 * @param file the file resource to be marked
	 * @param message the error message
	 * @param severity the error severity
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 * @throws CoreException if something goes wrong, the exception thrown
	 */
	protected void mark(IFile file, String message, int severity, int charStart, int charStop) throws CoreException {
		//System.out.println("MARK :" + file.getFullPath().toOSString());
		/*HashMap<String, java.lang.Object> datas = new HashMap<String, java.lang.Object>();
		datas.put(IMarker.MESSAGE, message);
		datas.put(IMarker.SEVERITY, severity);
		
		
		if (charStart < 0){
			System.out.println("CHAR SHOUD BE MARK AT < 0 " + charStart);
			datas.put(IMarker.CHAR_START, charStart);
		}
		else{
			System.out.println("CHAR SHOUD BE MARK AT " + charStart);
			datas.put(IMarker.CHAR_START, 0);
		}

		if (charStop < 0){
			System.out.println("CHAR SHOUD BE MARK TILL < 0 " + charStart);
			datas.put(IMarker.CHAR_END, charStop);
		}
		else{
			System.out.println("CHAR SHOUD BE MARK AT " + charStart);
			datas.put(IMarker.CHAR_END, 0);
		}
		
		MarkerUtilities.createMarker(file, datas, getMarkerType());*/
		org.eclipse.core.resources.IMarker marker = file.createMarker(getMarkerType());
		marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, severity);
		marker.setAttribute(org.eclipse.core.resources.IMarker.MESSAGE, message);
		//marker.setAttribute(org.eclipse.core.resources.IMarker.LINE_NUMBER, 2);
		
		if(charStart < 0 ){
			marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, 0);
		}else {
			marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, charStart);
		}
		
		if (charStop < 0) {
			marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, 1);
		}else {
			marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, charStop);
		}
	}

	/**
	 * Refresh the markers on file resource
	 * @param file the file resource to be marked
	 * @param message the error message
	 * @param severity the error severity
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 */
	public void refreshMarkers(IFile file, String message, String groupId, Severity severity, int charStart, int charEnd){
		final Severity s = severity;
		final IFile f = file; 
		final String msg =message;
		final int start = charStart;
		final int end = charEnd;
		final String group = groupId;
		PlatformUI.getWorkbench().getDisplay().asyncExec(new java.lang.Runnable() {
			public void run() {
				try {
					if (s == Severity.ERROR) {
						markError(f, msg, start , end);
					}
					if (s == Severity.FATAL) {
						markError(f, msg, start , end);
					}
					if (s == Severity.OK) {
						clearMarkers(f, msg, group);
					}
					if (s == Severity.WARNING) {
						markWarning(f, msg, start , end);
					}
				} catch (CoreException e) {
					//e.printStackTrace();
				}
			}
			});
	}
	
	/**
	 * Clear previous marker in the given file; in the texteditor, markers
	 * display messages/warning/errors icons at begining of lines in the text
	 * editors and underline elements that are concerned by those messages (for
	 * example, invalid calls).
	 */
	protected void clearMarkers(IFile file, String message, String groupId) {
		try {
			if (file == null){
				return;
			}
			if (groupId.contains("loader")||groupId.contains("Loader")){
				file.deleteMarkers(getMarkerType(), false, IResource.DEPTH_INFINITE);
				return;
			}
			IMarker[] markers;
			markers = file.findMarkers(IMarker.PROBLEM, false, IResource.DEPTH_ZERO);
			for (IMarker marker : markers) {
				String msg = (String) marker.getAttribute(IMarker.MESSAGE);
				if (msg.equals(message)){
					marker.delete();
				}
			}
		} catch (Exception ex) {
			//ex.printStackTrace();
		}
	}
}
