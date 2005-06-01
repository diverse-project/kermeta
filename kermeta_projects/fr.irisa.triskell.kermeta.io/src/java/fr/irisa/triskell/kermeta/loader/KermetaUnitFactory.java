/* $Id : $
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader;

import java.io.File;
import java.util.Hashtable;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.loader.ecore.KMLoaderModuleECore;
import fr.irisa.triskell.kermeta.loader.emfatic.KMLoaderModuleEmfatic;
import fr.irisa.triskell.kermeta.loader.km.KMLoaderModuleKM;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMLoaderModuleMCT;

import org.apache.log4j.Logger;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KermetaUnitFactory {
    
	protected static KermetaUnitFactory defaultLoader;
	
	public static KermetaUnitFactory getDefaultLoader() {
		if (defaultLoader == null) {
			defaultLoader = new KermetaUnitFactory();
			defaultLoader.loadModules.put("emf", new KMLoaderModuleEmfatic());
			defaultLoader.loadModules.put("km", new KMLoaderModuleKM());
			defaultLoader.loadModules.put("kmt", new KMLoaderModuleMCT());
			defaultLoader.loadModules.put("ecore", new KMLoaderModuleECore());
		}
		return defaultLoader;
	}
    
    
    /**
     * The MetaCore load modules indexed by the file 
     * extention they are able to load
     */
    protected Hashtable loadModules;
    
    /**
     * Loaded units are kept in order to avoid loading twice the
     * same program
     */
    protected Hashtable loadedUnits;
    
    /**
     * MetaCore Path entries 
     */
    protected Hashtable kmPath;
    
    
    //protected static KermetaUnit standard_lib;
    
    
    /**
     * The cnstroctor
     */
    public KermetaUnitFactory() {
        super();
        loadModules = new Hashtable();
        loadedUnits = new Hashtable();
        kmPath = new Hashtable();
    }
    
    public KermetaUnit createKermetaUnit(String uri) {
        Hashtable packages;
        if (KermetaUnit.STD_LIB_URI != null) {
            packages = KermetaUnit.getStdLib().packages;
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
    	
    	boolean std = false;
    	
    	// check if it is the stdlib
    	if (uri.equals("kermeta")) {
    	    if (KermetaUnit.STD_LIB_URI == null) {
    	        KermetaUnit.internalLog.error("  **** CRITICAL : Cannot find kermeta standard library");
    	        KermetaUnit.internalLog.error("  **** CRITICAL : Please update KermetaUnit.STD_LIB_URI variable");
    	    }
    	    std = true;
    	    uri = KermetaUnit.STD_LIB_URI;
    	    //if (standard_lib != null) return standard_lib;
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
        if (loader == null) {
        	// TODO : generate an error
            KermetaUnit.internalLog.error("TODO: manage this error : loader is null for UNIT "+u);
        	//result.error.add(new KMUnitError("Unable to load resource " + uri + " : no loader registered.", null));
        	//return result;
        }
        result = loader.createKermetaUnit(u.toString(), packages);
        loadedUnits.put(u.toString(), result);
        //if (std) standard_lib = result;
    	return result;
    }
    
    
    
    /*
     * TODO : Gestion des URI
     * 
     * J'ai remis l'ancienne version qui apparement ne marche pas sous windows
     * car les changemement fait par jean-phillipe font que ca ne marche plus du tout 
     * lorsque les uri commence par platform:, http: ou tout autre chose que file:
     * En plus ca ne marche pas sous linux.
     * Il y a probablement quelque chose a ameliorer ici pour résoudre les problème
     * de compatibilité d'OS. Cela dit il faut s'appuier sur la gestion d'URI de Eclipse
     * qui si je ne me trompe pas marche bien sous linux et windows.
     * 
     * J'ai remis ci-dessous le code de JP
     */
    
    /*
    public KermetaUnit createKermetaUnit(String uri) {
    	
    	//System.out.println("ASK UNIT " + uri);
    	
    	// TODO : reslove URI if it is not
    	KermetaUnit result = null;
    	
    	// resolve the URI if it is in the KMPath
    	if (kmPath.containsKey(uri)) uri = (String)kmPath.get(uri);
    	
    	// resolve uri
    	if (uri.startsWith("file:"))
    		uri=uri.substring(5,uri.length());
    	URI u = URI.createFileURI(uri);
    	if (u.isRelative()) {
    	//	URIConverter c = new URIConverterImpl();
    	//	u = u.resolve(c.normalize(URI.createURI(".")));
    		u=UserDirURI.createURI(u);
    	}
    	
    
    	// return the unit if it already exists
    	if (loadedUnits.containsKey(u.toString())) return (KermetaUnit)loadedUnits.get(u.toString());
    	
    	//System.out.println("CREATE UNIT " + u.toString());
    	
    	// Create the appropriate Unit using the loader registerered for the file extension
    	
    	KermetaLoaderModule loader = null;
    	if (u.fileExtension() != null) 
        	loader = (KermetaLoaderModule)loadModules.get(u.fileExtension());
        if (loader == null) {
            	System.err.println("TODO: manage this error : loader is null !");
        	// TODO : generate an error
        	//result.error.add(new KMUnitError("Unable to load resource " + uri + " : no loader registered.", null));
        	//return result;
        }
        result = loader.createKermetaUnit("file:"+u.toFileString().replaceAll("\\\\","/"));
        loadedUnits.put(u.toString(), result);
    	return result;
    }
    */
    
    
    public void unloadAll() {
        KermetaUnit.unloadStdLib();
    	loadedUnits.clear();
    	KMUnit.clearRessourceSet();
    }
    
    public void unload(String uri) {
        throw new Error("Unload units is NOT IMPLEMENTED");
    	//if (loadedUnits.containsKey(uri))  loadedUnits.remove(uri);
    }

}
