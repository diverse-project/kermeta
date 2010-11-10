/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ISmARTextCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
