/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IArtextResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public art.resource.artext.IArtextResourcePostProcessor getResourcePostProcessor();
	
}
