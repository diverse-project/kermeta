/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface ICoreCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
