/* $Id: KermetaIcons.java,v 1.5 2007-07-24 13:46:39 ftanguy Exp $
 * Project   : fr.irisa.triskell.kermeta (First iteration)
 * File      : KermetaIcons.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 14, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * This class is used as an images registry.
 * It automatically loads some images in the initialize method and provides
 * a getImage method to access to image corresponding to the given path.
 * 
 * @author ftanguy
 *
 */
public class KermetaIcons {

	/**
	 * This class is a singleton.
	 */
	static private KermetaIcons instance = null;
	
	/**
	 * We need to access to images in the plugin hierarchy. This URL will help us.
	 */
	static final private URL pluginURL = KermetaPlugin.getDefault().getBundle().getEntry("/");
	
	/**
	 * This is the icons registry : a name corresponds to an image.
	 */
	private Hashtable<String, Image> icons = new Hashtable<String, Image>();
	
	/**
	 * A private constructor which just call an initialize method. 
	 *
	 */
	private KermetaIcons() {
		initialize();
	}
	
	/**
	 * Loads some images whose name come from KermetaConstants class.
	 *
	 */
	private void initialize() {
		try {
			Image icon_folder = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/folder.gif")).createImage();
			Image icon_file = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/kermeta.png")).createImage();			
			Image icon_project = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/project.gif")).createImage();
			Image icon_logo = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/kermeta_logo.gif")).createImage();
			Image icon_ecoreModelFile = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/EcoreModelFile.gif")).createImage();
			Image icon_generatedPackage = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/generated_package.gif")).createImage();
			icons.put(KermetaConstants.FOLDER, icon_folder); // instance
			icons.put(KermetaConstants.FILE, icon_file);
			icons.put(KermetaConstants.PROJECT, icon_project);
			icons.put(KermetaConstants.KLOGO, icon_logo);
			icons.put(KermetaConstants.IMG_ECORE_FILE, icon_ecoreModelFile);
			icons.put(KermetaConstants.IMG_GENERATED_PACKAGE, icon_generatedPackage);
		} catch (MalformedURLException e) { 
			e.printStackTrace(); 
		}	
	}
	
	/**
	 * 
	 * @param path
	 * @return
	 */
	static public Image get(String path) {
		if ( instance == null )
			instance = new KermetaIcons();
		return (Image)instance.icons.get(path);
	}
}
