/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface IArtCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
