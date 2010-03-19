package org.kermeta.slf4j.eclipse;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.slf4j.eclipse.preferences.PreferenceConstants;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.slf4j.eclipse.plugin";

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
			configureLog4JLogger(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + LOG4JCONFIGDEFAULTLOCATION_IN_METADATA);
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
	
	/**
	 * @param configurationFileName name of a property file 
	 * Configure the log4J system using this file
	 * If null  or empty string then it will use the plugin preferences
	 */
	public void configureLog4JLogger(String configurationFileName)
	{
	    String filePath = "";
	  	File logConfigurationFile;
	
			String propertyValue =  configurationFileName;
			
			
		if(configurationFileName == null || configurationFileName.length() > 0){
		
			try{
				if(Platform.isRunning()){
		        	// ignore preference if eclipse platform is not running
					if (propertyValue == null || propertyValue.length() == 0){
						// system property not set, use plugin preferences
						IPreferenceStore store = Activator.getDefault().getPreferenceStore();
						propertyValue = store.getString(PreferenceConstants.P_LOG4JXMLPATH);
					}
				}
			} catch(java.lang.NoClassDefFoundError e){
				// ignore, we are probably running in standalone mode
			}
		}
	  	if (propertyValue != null && propertyValue.length() > 0)
	  	{
	  	    logConfigurationFile = new File(propertyValue);  
	  	    if (logConfigurationFile.exists())
	  		{
	  	        try {
	                  filePath = logConfigurationFile.getCanonicalPath();
	              } catch (IOException e) {
	              	org.apache.log4j.Logger.getRootLogger().warn("Unable to retreive CanonicalPath of "+propertyValue);             		
	              }
	  		}
	  	}
	  	if( filePath =="")
	  	{
	  		org.apache.log4j.BasicConfigurator.configure();
	  		org.apache.log4j.Logger.getRootLogger().warn("not able to retrieve log4jconfiguration file; "+propertyValue ); 
	  		org.apache.log4j.Logger.getRootLogger().warn("using default log4j configuration (ie. all messages on the console)");
	  	}
	  	else
	  	{
	  		org.apache.log4j.xml.DOMConfigurator.configure(filePath);
	  		org.apache.log4j.Logger.getRootLogger().info("log4j "+ (isLog4JConfigured ? "(re)" : "") + "configured with "+filePath);
	  	}
	  	isLog4JConfigured = true;
	}
	private boolean isLog4JConfigured=false; 

}
