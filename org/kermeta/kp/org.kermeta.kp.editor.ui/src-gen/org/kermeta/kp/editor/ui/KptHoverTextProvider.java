/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

public class KptHoverTextProvider implements org.kermeta.kp.editor.IKptHoverTextProvider {
	
	private org.kermeta.kp.editor.ui.KptDefaultHoverTextProvider defaultProvider = new org.kermeta.kp.editor.ui.KptDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
