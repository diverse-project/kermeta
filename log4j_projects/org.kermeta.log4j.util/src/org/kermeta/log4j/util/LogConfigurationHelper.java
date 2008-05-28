/* $Id: LogConfigurationHelper.java,v 1.2 2008-05-28 13:33:20 dvojtise Exp $
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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.LogFactoryImpl;

/**
 * Some usefull methods relative to configuration of log4j
 * @author dvojtise
 */
public class LogConfigurationHelper {

	static private boolean isLog4JConfigured=false; 
	
	/**
	 * <code>DefaultKermetaConfigurationFilePropertyName</code> = "kermeta.log4j.configurationfile.name"
	 * This is the default property which must contain the file name of the Log4J configuration.
	 */
	final static public String DefaultKermetaConfigurationFilePropertyName="kermeta.log4j.configurationfile.name";
    
	/**
	 * @param configurationFilePropertyName name of a property that contains the configuration file name
	 * Configure the log4J system using the value defined by the given property
	 */
	static public void configureLog4JLogger(String configurationFilePropertyName)
	{
	    String filePath = "";
    	File logConfigurationFile;

		org.apache.log4j.Logger logger=null;
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
                	org.apache.log4j.Logger.getRootLogger().warn("Unable to retreive CanonicalPath of "+propertyValue);             		
                }
    		}
    	}
    	if( filePath =="")
    	{
    		org.apache.log4j.BasicConfigurator.configure();
    		org.apache.log4j.Logger.getRootLogger().warn("not able to retrieve log4jconfiguration file; check the system property "+ configurationFilePropertyName+ "=\""+propertyValue +"\""); 
    		org.apache.log4j.Logger.getRootLogger().warn("using default log4j configuration (ie. all messages on the console)");
    	}
    	else
    	{
    		org.apache.log4j.xml.DOMConfigurator.configure(filePath);
    		org.apache.log4j.Logger.getRootLogger().info("log4j "+ (isLog4JConfigured ? "(re)" : "") + "configured with "+filePath);
    	}
    	isLog4JConfigured = true;
	}
	/**
	 * @param configurationFilePropertyName name of a property that contains the configuration file name
	 * @param loggerName name of a logger inside the configuration
	 * @return a Logger
	 * Retreives a logger
	 * Eventually configures the log system according to the given system property
	 * !!! if it was already configured and you want to change it, you must call configureLogger explicitly  
	 */
	static public Log getLogger(String configurationFilePropertyName, String loggerName)
	{	
		String logClassName = null;
		try {
            logClassName = System.getProperty(LogFactoryImpl.LOG_PROPERTY);
        } catch (SecurityException e) {
            ;
        }
	    Log logger=null;
	    try{
	    	if (!isLog4JConfigured) configureLog4JLogger(DefaultKermetaConfigurationFilePropertyName);
	    	// log4j seems ok, configure apache.commons.logging with log4j 
	    	System.setProperty(LogFactoryImpl.LOG_PROPERTY, "org.apache.commons.logging.impl.Log4JLogger");
	    }catch(java.lang.LinkageError le){
	    	// conflict in log4j.jar in this platform
	    	// fall back to original stantard logger or SimpleLog
	    	if((logClassName != null && logClassName.equals("org.apache.commons.logging.impl.Log4JLogger")) || logClassName == null){
				System.setProperty(LogFactoryImpl.LOG_PROPERTY, "org.apache.commons.logging.impl.SimpleLog");
				//System.setProperty(LogFactoryImpl.LOG_PROPERTY, "org.apache.commons.logging.impl.Jdk14Logger");
	    	}

	    }
		logger = LogFactory.getLog(loggerName);
		/*logger=org.apache.log4j.Logger.getLogger(loggerName);
		if (logger == null)
		{
		    logger = Logger.getRootLogger();
			logger.warn("unable to retreive logger for " + loggerName + "; using Root logger instead");
		}*/
		return logger; 
	}
	
	/**
	 * @param loggerName name of a logger inside the configuration
	 * @return a logger
	 * If the logger systeme was not configured it configures it with the one defined by the DefaultKermetaConfigurationFilePropertyName system property
	 * If possible use a log4j logger, if not, fall back using apache.commons fallback logger
	 * @see  <code>DefaultKermetaConfigurationFilePropertyName</code>
	 */
	static public Log getLogger(String loggerName)
	{
	    return getLogger(DefaultKermetaConfigurationFilePropertyName, loggerName);		
	}
    /**
     * @return Returns the isConfigured.
     */
    public static boolean isLog4JConfigured() {
        return isLog4JConfigured;
    }
}
