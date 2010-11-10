/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.ui;

public class SmARTextHoverTextProvider implements smartadapters4ART.resource.smARText.ISmARTextHoverTextProvider {
	
	private smartadapters4ART.resource.smARText.ui.SmARTextDefaultHoverTextProvider defaultProvider = new smartadapters4ART.resource.smARText.ui.SmARTextDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
