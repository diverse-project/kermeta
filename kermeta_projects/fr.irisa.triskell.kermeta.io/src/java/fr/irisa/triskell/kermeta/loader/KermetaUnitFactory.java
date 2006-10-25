/* $Id: KermetaUnitFactory.java,v 1.22 2006-10-25 08:25:45 dvojtise Exp $
 * Project: Kermeta.io
 * File: KermetaUnitFactory.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: 10 févr. 2005
 * Authors: Franck FLEUREY (ffleurey@irisa.fr)
 */

package fr.irisa.triskell.kermeta.loader;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.loader.ecore.KMLoaderModuleECore;
import fr.irisa.triskell.kermeta.loader.emfatic.KMLoaderModuleEmfatic;
import fr.irisa.triskell.kermeta.loader.java.KMLoaderModuleJar;
import fr.irisa.triskell.kermeta.loader.km.KMLoaderModuleKM;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMLoaderModuleMCT;


/**
 * This class is used to provide the LoaderModule that are able to crea KermetaUnit 
 * from various formats.
 * Supported formats are : kmt, km, emf, ecore, jar
 */
public class KermetaUnitFactory {
    
	protected static KermetaUnitFactory defaultLoader;
	/** Contains the qualified ids that are allowed to follow a "require"*/
	private static ArrayList<String> allowedQualifiedIDs ;
	public static ArrayList<String> getAllowedQualifiedIDs() 
	{
		if (allowedQualifiedIDs == null)
		{
			allowedQualifiedIDs = new ArrayList<String>();
			allowedQualifiedIDs.add("kermeta"); 
			allowedQualifiedIDs.add("java_rt_jar");
		}
		return allowedQualifiedIDs;
	}
	
	public static KermetaUnitFactory getDefaultLoader() {
		if (defaultLoader == null) {
			defaultLoader = new KermetaUnitFactory();
			defaultLoader.loadModules.put("emf",   new KMLoaderModuleEmfatic());
			defaultLoader.loadModules.put("km",    new KMLoaderModuleKM());
			defaultLoader.loadModules.put("kmt",   new KMLoaderModuleMCT());
			defaultLoader.loadModules.put("ecore", new KMLoaderModuleECore());
			defaultLoader.loadModules.put("jar",   new KMLoaderModuleJar());
		}
		return defaultLoader;
	}
    
    
    /**
     * The MetaCore load modules indexed by the file 
     * extention they are able to load
     */
    protected Hashtable<String,KermetaLoaderModule> loadModules;
    
    /**
     * Loaded units are kept in order to avoid loading twice the
     * same program
     */
    protected Hashtable<String,KermetaUnit> loadedUnits;
    
    /**
     * MetaCore Path entries 
     */
    protected Hashtable kmPath;
    
    
    //protected static KermetaUnit standard_lib;
    
    
    /**
     * The constructor
     */
    public KermetaUnitFactory() {
        super();
        loadModules = new Hashtable<String,KermetaLoaderModule>();
        loadedUnits = new Hashtable<String,KermetaUnit>();
        kmPath = new Hashtable();
    }
    
    public KermetaUnit createKermetaUnit(String uri) {
        Hashtable packages;
        if (StdLibKermetaUnitHelper.STD_LIB_URI != null) {
            packages = StdLibKermetaUnitHelper.getKermetaUnit().packages;
        }
        else {
            packages = new Hashtable();
        }
        return createKermetaUnit(uri, packages);
    }
    
    /**
     * Create a kermeta unit (without loading it?)
     * @param uri
     * @return
     */
    public KermetaUnit createKermetaUnit(String uri, Hashtable packages) {
    	
        KermetaUnit.internalLog.debug("ASK UNIT " + uri);
    	
    	// TODO : reslove URI if it is not
    	KermetaUnit result = null;
    	
    	// resolve the URI if it is in the KMPath
    	if (kmPath.containsKey(uri)) uri = (String)kmPath.get(uri);
    	    	
    	// check if it is the stdlib
    	if (uri.equals("kermeta")) {
    	    if (StdLibKermetaUnitHelper.STD_LIB_URI == null) {
    	        KermetaUnit.internalLog.error("  **** CRITICAL : Cannot find kermeta standard library");
    	        KermetaUnit.internalLog.error("  **** CRITICAL : Please update KermetaUnit.STD_LIB_URI variable");
    	    }
    	    uri = StdLibKermetaUnitHelper.STD_LIB_URI;
    	    //if (standard_lib != null) return standard_lib;
    	}
    	else if (uri.equals("java_rt_jar")){
    		// if this is java declaration that are required
    		String javahome = System.getProperty("java.home");
    		javahome = javahome.replace("\\", "/");
    		uri = "file:/"+javahome+"/lib/rt.jar";
    	}
    	// resolve uri
    	URI u = URI.createURI(uri);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(".")));    			
    	}
    	 
    
    	// return the unit if it already exists
    	if (loadedUnits.containsKey(u.toString())) return (KermetaUnit)loadedUnits.get(u.toString());
    	
    	
    	// check that the unit exist
    	if (u.isFile()) // this is a local file URI
    	{
    	    File unitFile;
    	    unitFile= new File(u.toFileString());
	    	if (!unitFile.exists())
	    	{
	    	    KermetaLoaderError klerr = new KermetaLoaderError("Cannot create UNIT "+u + " (file not found)");
	    	    KermetaUnit.internalLog.error("Cannot create UNIT "+u + " (file not found)", klerr);
	    	    throw klerr;
	    	}	
	    }
    	KermetaUnit.internalLog.info("CREATE UNIT " + u.toString());
    	
    	// Create the appropriate Unit using the loader registerered for the file extension
    	
    	KermetaLoaderModule loader = null;
    	if (u.fileExtension() != null) 
        	loader = (KermetaLoaderModule)loadModules.get(u.fileExtension());
    	
    	// In case file loading fails, tests whether the uri is registered into the EMF regitry
    	if(loader == null) {
    		if(Registry.INSTANCE.containsKey(uri)) {
    			loader = (KermetaLoaderModule)loadModules.get("ecore");
    		}
    	}
    	
        if (loader == null) {
            KermetaLoaderError klerr = new KermetaLoaderError("Invalid require : '"+u + "' is not a valid use for require");
    	    throw klerr;
        }
        result = loader.createKermetaUnit(u.toString(), packages);
        loadedUnits.put(u.toString(), result);
        //if (std) standard_lib = result;
    	return result;
    }
    
    /**
     * Removes the current defaultLoader so the next cal to getDefaultLoader 
     * will create a new one
     */
    public static void resetDefaultLoader()
    {
        if (defaultLoader != null) defaultLoader.loadModules.clear();
        defaultLoader = null;
    }
    /**
     * 
     */
    public void unloadAll() {
    	StdLibKermetaUnitHelper.unloadStdLib();
    	loadedUnits.clear();
    	KMUnit.clearRessourceSet();
    }
    
    public void unload(String uri) {
        throw new Error("Unload units is NOT IMPLEMENTED");
    	//if (loadedUnits.containsKey(uri))  loadedUnits.remove(uri);
    }

}
