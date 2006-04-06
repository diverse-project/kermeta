package fr.irisa.triskell.kermeta.graphicaleditor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.topcased.modeler.ImageRegistry;

/**
 * Handle image
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class StructureImageRegistry {

	public static String BUNDLE = "fr.irisa.triskell.kermeta.graphicaleditor.images";

	/**
	 * The constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructureImageRegistry() {
		// do nothing
	}

	/**
	 * Clients should not dispose the Image returned.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param key  the key (one of the constants defined in this class)
	 * @return the Image associated with the given key
	 * @generated
	 */
	public static Image getImage(String key) {
		return ImageRegistry.getInstance()
				.get(StructurePlugin.getDefault().getBundle(),
						getImageLocation(key));
	}

	/**
	 * Return the image location
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param key  the key
	 * @return the ImageDescriptor associated with the given key
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(String key) {
		try {
			return ImageRegistry.getInstance().getDescriptor(
					StructurePlugin.getDefault().getBundle(),
					getImageLocation(key));
		} catch (MissingResourceException mre) {
			return null;
		}
	}

}
