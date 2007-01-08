/* $Id: RunnerIcons.java,v 1.2 2007-01-08 17:20:04 ftanguy Exp $
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

    public URL pluginURL;
    public Hashtable <String, Image> icons = new Hashtable <String, Image> ();
    /**
     * Create a 
     * @param url
     */
    public RunnerIcons(URL url) {
    	pluginURL = url;
    	try {
    		Image icon_i = ImageDescriptor.createFromURL(new URL(pluginURL, "/icons/instance.png")).createImage();
			Image icon_p = ImageDescriptor.createFromURL(new URL(pluginURL, "/icons/property.png")).createImage();
			Image icon_l = ImageDescriptor.createFromURL(new URL(pluginURL, "/icons/local.png")).createImage();
			icons.put(RunnerConstants.IVALUE_NA, icon_i); // instance
			icons.put(RunnerConstants.IVALUE_SET, icon_p); // property
			icons.put(RunnerConstants.IVALUE_PRIMITIVE, icon_l);
		} catch (MalformedURLException e) { 
			e.printStackTrace(); 
		}
    }
    
    public Image get(String path) {
    	return (Image) icons.get(path);
    }
}
