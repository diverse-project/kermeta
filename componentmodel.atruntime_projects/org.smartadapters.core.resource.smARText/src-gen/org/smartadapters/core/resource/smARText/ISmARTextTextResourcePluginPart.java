/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText;

// This interface is extended by all other EMFText runtime
// API interfaces for generated components. It provides
// access to the plug-in meta information.
public interface ISmARTextTextResourcePluginPart {
	
	// Returns a meta information object for the language plug-in
	// that contains this part.
	public org.smartadapters.core.resource.smARText.mopp.SmARTextMetaInformation getMetaInformation();
}
