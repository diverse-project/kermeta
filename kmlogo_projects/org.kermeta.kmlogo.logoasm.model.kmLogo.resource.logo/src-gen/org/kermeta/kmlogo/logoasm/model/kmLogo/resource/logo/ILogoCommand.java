/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface ILogoCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
