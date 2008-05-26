/* $Id: LogConfigurationHelper.java,v 1.1 2008-05-26 14:53:44 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.model
 * File       : LogConfigurationHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Some usefull methods relative to configuration of log4j
 */
package org.kermeta.log4j.util;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Some usefull methods relative to configuration of log4j
 * @author dvojtise
 */
public class LogConfigurationHelper {

	static private boolean isConfigured=false; 
	
	/**
	 * <code>DefaultKermetaConfigurationFilePropertyName</code> = "kermeta.log4j.configurationfile.name"
	 * This is the default property which must contain the file name of the Log4J configuration.
	 */
	final static public String DefaultKermetaConfigurationFilePropertyName="kermeta.log4j.configurationfile.name";
    
	/**
	 * @param configurationFilePropertyName name of a property that contains the configuration file name
	 * Configure the log4J system using the value defined by the given property
	 */
	static public void configureLogger(String configurationFilePropertyName)
	{
	    String filePath = "";
    	File logConfigurationFile;

		Logger logger=null;
    	// try to find the given property.
    	String propertyValue = System.getProperty(configurationFilePropertyName);
    	if (propertyValue != null && propertyValue.length() > 0)
    	{
    	    logConfigurationFile = new File(propertyValue);  
    	    if (logConfigurationFile.exists())
    		{
    	        try {
                    filePath = logConfigurationFile.getCanonicalPath();
                } catch (IOException e) {
                    Logger.getRootLogger().warn("Unable to retreive CanonicalPath of "+propertyValue);             		
                }
    		}
    	}
    	if( filePath =="")
    	{
    		org.apache.log4j.BasicConfigurator.configure();
    		Logger.getRootLogger().warn("not able to retrieve log4jconfiguration file; check the system property "+ configurationFilePropertyName+ "=\""+propertyValue +"\""); 
    		Logger.getRootLogger().warn("using default configuration (ie. all messages on the console)");
    	}
    	else
    	{
    		org.apache.log4j.xml.DOMConfigurator.configure(filePath);
    		Logger.getRootLogger().info("log4j "+ (isConfigured ? "(re)" : "") + "configured with "+filePath);
    	}
		isConfigured = true;
	}
	/**
	 * @param configurationFilePropertyName name of a property that contains the configuration file name
	 * @param loggerName name of a logger inside the configuration
	 * @return a Logger
	 * Retreives a logger
	 * Eventually configures the log system according to the given system property
	 * !!! if it was already configured and you want to change it, you must call configureLogger explicitly  
	 */
	static public Logger getLogger(String configurationFilePropertyName, String loggerName)
	{	
	    Logger logger=null;
		if (!isConfigured) configureLogger(DefaultKermetaConfigurationFilePropertyName);
		logger=Logger.getLogger(loggerName);
		if (logger == null)
		{
		    logger = Logger.getRootLogger();
			logger.warn("unable to retreive logger for " + loggerName + "; using Root logger instead");
		}
		return logger; 
	}
	
	/**
	 * @param loggerName name of a logger inside the configuration
	 * @return a logger
	 * If the logger systeme was not configured it configures it with the one defined by the DefaultKermetaConfigurationFilePropertyName system property
	 * 
	 * @see  <code>DefaultKermetaConfigurationFilePropertyName</code>
	 */
	static public Logger getLogger(String loggerName)
	{
	    return getLogger(DefaultKermetaConfigurationFilePropertyName, loggerName);		
	}
    /**
     * @return Returns the isConfigured.
     */
    public static boolean isConfigured() {
        return isConfigured;
    }
}
