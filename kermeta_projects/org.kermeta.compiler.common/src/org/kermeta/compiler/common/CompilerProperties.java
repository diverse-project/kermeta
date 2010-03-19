package org.kermeta.compiler.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CompilerProperties {
	
	public final static Logger internalLog = LoggerFactory.getLogger("KermetaCompiler");
	
	// Used in the *.compiler.properties file
	public final static String PLUGIN_ID = "plugin_id";
	public final static String COPYRIGHT_HEADER = "copyright_header";
	public final static String BUNDLE_VERSION = "bundle_version";
	public final static String REQUIRE_BUNDLE = "require_bundles";
	public final static String UNZIP_EXTERNS = "unzip_externs";
	public final static String ENABLE_EMF_LOAD_INITIALIZATION = "enable_emf_load_initialization";
	public final static String MAIN_OPERATIONS = "main_operations";
	public final static String RUNNER_SRC_DIR = "runner_src_dir";
	//
	
	private String file_path;
	
	public CompilerProperties(String file_path) {
		this.file_path = file_path;
	}
	
	public Properties getProperties() {
		// Read properties file.
	    Properties properties = new Properties();
	    
	    try {
	        properties.load(new FileInputStream(file_path));
	    } catch (FileNotFoundException e) {
	    	internalLog.debug("The properties file " + file_path + " has not been found or not defined, the default compilation parameters will be applied");
	    	properties = null;
	    } catch (IOException e) {
		}
	    
	    return properties;
	}

}
