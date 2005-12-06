/* $Id: RunnerIcons.java,v 1.1 2005-12-06 18:53:15 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RunnerIcons.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Dec 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * not sure it is the tidiest way to get images...
 */
public class RunnerIcons {

	// TODO : do not set a relative path -> find the absolute one through Plugin. bundles bidules
   // public static Image INSTANCE = ImageDescriptor.createFromFile(RunnerIcons.class, "platform:/plugin/fr.irisa.triskell.kermeta.runner/icons/instance.png").createImage();
	//public static Image INSTANCE = ImageDescriptor.createFromFile(RunnerIcons.class, "platform:/resource/fr.irisa.triskell.kermeta.runner/icons/instance.png").createImage();
	//public Image property; = ImageDescriptor.createFromFile(RunnerIcons.class, "platform:/plugin/fr.irisa.triskell.kermeta.runner/icons/property.png").createImage();
    
    public URL pluginURL;
    public Hashtable icons;
    /**
     * Create a 
     * @param url
     */
    public RunnerIcons(URL url)
    {
    	pluginURL = url;
    	icons = new Hashtable();
    	try {
    		// do it for all the icons...
			Image icon_i = ImageDescriptor.createFromURL(new URL(pluginURL, "/icons/instance.png")).createImage();
			Image icon_p = ImageDescriptor.createFromURL(new URL(pluginURL, "/icons/property.png")).createImage();
			Image icon_l = ImageDescriptor.createFromURL(new URL(pluginURL, "/icons/local.png")).createImage();
			icons.put(RunnerConstants.IVALUE_NA, icon_i); // instance
			icons.put(RunnerConstants.IVALUE_SET, icon_p); // property
			icons.put(RunnerConstants.IVALUE_PRIMITIVE, icon_l);
		} catch (MalformedURLException e) { e.printStackTrace(); }
    	
    }
    
    public Image get(String path)
    {
    	return (Image)icons.get(path);
    }
}
