/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IArtextCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
