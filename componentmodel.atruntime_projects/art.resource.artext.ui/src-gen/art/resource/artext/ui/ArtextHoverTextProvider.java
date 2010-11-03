/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.ui;

public class ArtextHoverTextProvider implements art.resource.artext.IArtextHoverTextProvider {
	
	private art.resource.artext.ui.ArtextDefaultHoverTextProvider defaultProvider = new art.resource.artext.ui.ArtextDefaultHoverTextProvider();
	
	public java.lang.String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
