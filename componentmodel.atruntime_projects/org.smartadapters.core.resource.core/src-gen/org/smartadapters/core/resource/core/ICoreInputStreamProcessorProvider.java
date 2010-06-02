/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core;

// Implementors of this interface can provide InputStreamProcessors. These
// processors can be used to pre-process input stream before a text resource
// is actually lexed and parsed. This can be for example useful to do an
// encoding conversion.
//
public interface ICoreInputStreamProcessorProvider {
	
	// Return a processor for the given input stream.
	//
	// @param inputStream the actual stream that provides the content of a resource
	// @return a processor that pre-processes the input stream
	public org.smartadapters.core.resource.core.mopp.CoreInputStreamProcessor getInputStreamProcessor(java.io.InputStream inputStream);
}
