/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IKpCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
