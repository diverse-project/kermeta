package org.kermeta.slf4j.eclipse.ui;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.slf4j.eclipse";

	// The shared instance
	private static Activator plugin;
	
	public static final String LOG4JCONFIGDEFAULTLOCATION_IN_METADATA = "/.metadata/kermeta_log4j_configuration.xml";
	
	/**
	 * The constructor
	 */
	public Activator() {
		
	}

	/** simple file copy */
	protected void copyFile(File inputFile, File outputFile) throws IOException{
		
	    FileReader in = new FileReader(inputFile);
	    FileWriter out = new FileWriter(outputFile);
	    int c;

	    while ((c = in.read()) != -1)
	      out.write(c);
	    in.close();
	    out.close();		  
	}
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		// make sure to copy the default log4j configuration file into .metadata directory
		try {
			URL url = getBundle().getEntry("/kermeta_log4j_configuration.xml");
			File logConfigurationFile = new File(FileLocator.toFileURL(url).getFile());
			File metadatalogConfigurationFile = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + LOG4JCONFIGDEFAULTLOCATION_IN_METADATA);
			if (logConfigurationFile.exists() && ! metadatalogConfigurationFile.exists())
    		{
				copyFile(logConfigurationFile, metadatalogConfigurationFile);
    		}
			
		} catch (Exception e) {
			System.err.print("Not able to copy kermeta_log4j_configuration.xml in .metadata directory "+ e.getMessage() +"\n");
			// don't worry about that, the log4j will simply use its default configuration
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		if ( plugin == null ) 
			plugin = new Activator();
		return plugin;
	}

}
