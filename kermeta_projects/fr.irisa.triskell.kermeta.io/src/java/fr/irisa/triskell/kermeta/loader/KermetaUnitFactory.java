/* $Id : $
 * Created on 10 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader;

import java.util.Hashtable;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.loader.emfatic.KMLoaderModuleEmfatic;
import fr.irisa.triskell.kermeta.loader.km.KMLoaderModuleMCore;
import fr.irisa.triskell.kermeta.loader.kmt.KMLoaderModuleMCT;


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
			defaultLoader.loadModules.put("km", new KMLoaderModuleMCore());
			defaultLoader.loadModules.put("kmt", new KMLoaderModuleMCT());
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
    
    
    /**
     * The cnstroctor
     */
    public KermetaUnitFactory() {
        super();
        loadModules = new Hashtable();
        loadedUnits = new Hashtable();
        kmPath = new Hashtable();
    }
    
    /**
     * Create a kermeta unit (without loading it?)
     * @param uri
     * @return
     */
    public KermetaUnit createKermetaUnit(String uri) {
    	
    	//System.out.println("ASK UNIT " + uri);
    	
    	// TODO : reslove URI if it is not
    	KermetaUnit result = null;
    	
    	// resolve the URI if it is in the KMPath
    	if (kmPath.containsKey(uri)) uri = (String)kmPath.get(uri);
    	
    	// resolve uri
    	URI u = URI.createURI(uri);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(".")));    			
    	}
    	
    
    	// return the unit if it already exists
    	if (loadedUnits.containsKey(u.toString())) return (KermetaUnit)loadedUnits.get(u.toString());
    	
    	//System.out.println("CREATE UNIT " + u.toString());
    	
    	// Create the appropriate Unit using the loader registerered for the file extension
    	
    	KermetaLoaderModule loader = null;
    	if (u.fileExtension() != null) 
        	loader = (KermetaLoaderModule)loadModules.get(u.fileExtension());
        if (loader == null) {
        	// TODO : generate an error
        	//result.error.add(new KMUnitError("Unable to load resource " + uri + " : no loader registered.", null));
        	//return result;
        }
        result = loader.createKermetaUnit(u.toString());
        loadedUnits.put(u.toString(), result);
    	return result;
    }
    
    public void unloadAll() {
    	loadedUnits.clear();
    }
    
    public void unload(String uri) {
    	if (loadedUnits.containsKey(uri))  loadedUnits.remove(uri);
    }

}
