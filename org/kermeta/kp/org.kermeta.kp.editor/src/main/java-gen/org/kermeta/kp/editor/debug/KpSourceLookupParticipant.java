/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.debug;

public class KpSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.kermeta.kp.editor.debug.KpStackFrame) {
			org.kermeta.kp.editor.debug.KpStackFrame frame = (org.kermeta.kp.editor.debug.KpStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
