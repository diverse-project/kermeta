/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.debug;

public interface IKpDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.kermeta.kp.editor.debug.KpDebugMessage message);
}
