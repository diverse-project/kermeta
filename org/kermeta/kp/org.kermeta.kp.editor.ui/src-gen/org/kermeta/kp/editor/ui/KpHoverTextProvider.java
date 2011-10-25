/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

public class KpHoverTextProvider implements org.kermeta.kp.editor.IKpHoverTextProvider {
	
	private org.kermeta.kp.editor.ui.KpDefaultHoverTextProvider defaultProvider = new org.kermeta.kp.editor.ui.KpDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
