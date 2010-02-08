/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art;

// Implementors of this interface can provide a post-processor
// for text resources.
public interface IArtResourcePostProcessorProvider {
	
	// Returns the processor that shall be called after text
	// resource are successfully parsed.
	public art.resource.art.IArtResourcePostProcessor getResourcePostProcessor();
}
