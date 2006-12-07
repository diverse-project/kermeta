/* $Id: KermetaIcons.java,v 1.2 2006-12-07 13:45:55 ftanguy Exp $
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
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import fr.irisa.triskell.kermeta.KermetaConstants;

public class KermetaIcons {
	
	// TODO : do not set a relative path -> find the absolute one through Plugin. bundles bidules
	// public static Image INSTANCE = ImageDescriptor.createFromFile(KermetaIcons.class, "platform:/plugin/fr.irisa.triskell.kermeta.runner/icons/instance.png").createImage();
	//public static Image INSTANCE = ImageDescriptor.createFromFile(KermetaIcons.class, "platform:/resource/fr.irisa.triskell.kermeta.runner/icons/instance.png").createImage();
	//public Image property; = ImageDescriptor.createFromFile(KermetaIcons.class, "platform:/plugin/fr.irisa.triskell.kermeta.runner/icons/property.png").createImage();
	
	public URL pluginURL;
	public Hashtable<String, Image> icons;
	/**
	 * Create a 
	 * @param url
	 */
	public KermetaIcons(URL url)
	{
		pluginURL = url;
		icons = new Hashtable<String, Image>();
		try {
			// do it for all the icons...
			Image icon_folder = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/folder.gif")).createImage();
			Image icon_file = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/kermeta.png")).createImage();			
			Image icon_project = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/project.gif")).createImage();
			Image icon_logo = ImageDescriptor.createFromURL(new URL(pluginURL, "/images/kermeta_logo.gif")).createImage();
			icons.put(KermetaConstants.FOLDER, icon_folder); // instance
			icons.put(KermetaConstants.FILE, icon_file);
			icons.put(KermetaConstants.PROJECT, icon_project);
			icons.put(KermetaConstants.KLOGO, icon_logo);
			
		} catch (MalformedURLException e) { e.printStackTrace(); }
		
	}
	
	public Image get(String path)
	{
		return (Image)icons.get(path);
	}
}
