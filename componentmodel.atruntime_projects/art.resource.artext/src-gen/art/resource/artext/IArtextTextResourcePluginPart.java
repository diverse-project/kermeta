/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

// This interface is extended by all other EMFText runtime
// API interfaces for generated components. It provides
// access to the plug-in meta information.
public interface IArtextTextResourcePluginPart {
	
	// Returns a meta information object for the language plug-in
	// that contains this part.
	public art.resource.artext.mopp.ArtextMetaInformation getMetaInformation();
}
