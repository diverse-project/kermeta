/*******************************************************************************
 * $Id: KmImageRegistry.java,v 1.4 2008-02-14 15:53:46 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.topcased.modeler.ImageRegistry;

import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;

/**
 * Handle image
 *
 * @generated
 */
public final class KmImageRegistry {

	/**
	 * The bundle id of the images
	 * @generated
	 */
	public static final String BUNDLE = "fr.irisa.triskell.kermeta.graphicaleditor.cd.images";

	/**
	 * The constructor
	 *
	 * @generated
	 */
	private KmImageRegistry() {
		// do nothing
	}

	/**
	 * Clients should not dispose the Image returned.
	 *
	 * @param key  the key (one of the constants defined in this class)
	 * @return the Image associated with the given key
	 * @generated
	 */
	public static Image getImage(String key) {
		return ImageRegistry.getInstance().get(
				KmPlugin.getDefault().getBundle(), getImageLocation(key));
	}

	/**
	 * Return the image location
	 *
	 * @param key  the key
	 * @return the Image location associated with the given key
	 * @throws MissingResourceException if the image doesn't exist
	 * @generated
	 */
	private static String getImageLocation(String key)
			throws MissingResourceException {
		return ResourceBundle.getBundle(BUNDLE).getString(key);
	}

	/**
	 * Build an image descriptor for the given key
	 *
	 * @param key  the key
	 * @return the ImageDescriptor associated with the given key
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(String key) {
		try {
			return ImageRegistry.getInstance().getDescriptor(
					KmPlugin.getDefault().getBundle(), getImageLocation(key));
		} catch (MissingResourceException mre) {
			return null;
		}
	}

}
