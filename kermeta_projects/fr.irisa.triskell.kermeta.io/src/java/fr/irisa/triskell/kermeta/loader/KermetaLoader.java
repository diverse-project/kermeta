/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader;

import java.util.Hashtable;


import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.loader.emfatic.KMLoaderModuleEmfatic;
import fr.irisa.triskell.kermeta.loader.km.KMLoaderModuleMCore;
import fr.irisa.triskell.kermeta.loader.kmt.KMLoaderModuleMCT;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KermetaLoader {

	protected static KermetaLoader defaultLoader;
	
	public static KermetaLoader getDefaultLoader() {
		if (defaultLoader == null) {
			defaultLoader = new KermetaLoader();
			defaultLoader.loadModules.put("emf", new KMLoaderModuleEmfatic());
			defaultLoader.loadModules.put("mcore", new KMLoaderModuleMCore());
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
    protected Hashtable metaCorePath;
    
    
    /**
     * The cnstroctor
     */
    public KermetaLoader() {
        super();
        loadModules = new Hashtable();
        loadedUnits = new Hashtable();
        metaCorePath = new Hashtable();
    }
    
    
    
    public KermetaUnit load(String uri) {
    	KermetaUnit result = new KermetaUnit();
    	load(uri, result);
        return result;
    }
    
    public KermetaUnit load(String uri, KermetaUnit result) {
    	if (uri == null) {
    		result.error.add(new KMUnitError("Unable to load resource " + uri + " : no loader registered.", null));
    		return result;
    	}
    	if (loadedUnits.containsKey(uri)) return (KermetaUnit)loadedUnits.get(uri);
    	result.setUri(uri);
        if (metaCorePath.containsKey(uri)) uri = (String)metaCorePath.get(uri);
        URI u = URI.createURI(uri);
        KermetaLoaderModule loader = null;
        if (u.fileExtension() != null) 
        	loader = (KermetaLoaderModule)loadModules.get(u.fileExtension());
        if (loader == null) {
        	result.error.add(new KMUnitError("Unable to load resource " + uri + " : no loader registered.", null));
        }
        else loader.load(result, uri);
        return result;
    	
    }
    
    
    public void unload(String uri) {
    	if (loadedUnits.containsKey(uri))  loadedUnits.remove(uri);
    }

}
