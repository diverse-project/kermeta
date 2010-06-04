/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText;

// Implementors of this interface can provide a post-processor
// for text resources.
public interface ISmARTextResourcePostProcessorProvider {
	
	// Returns the processor that shall be called after text
	// resource are successfully parsed.
	public org.smartadapters.core.resource.smARText.ISmARTextResourcePostProcessor getResourcePostProcessor();
}
