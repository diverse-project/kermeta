/* $Id: KermetaUnitStore.java,v 1.1.2.1 2008-12-31 15:15:00 dvojtise Exp $
* Project : IO
* File : KermetaUnitStorer.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 30/12/2008
* Author : Didier vojtisek
*/ 
package org.kermeta.io.cachemanager;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kermetaunitloader.AbstractLoader;
import org.kermeta.kermetaunitloader.LoaderFactory;
import org.kermeta.kermetaunitloader.core.EmptyKermetaUnitBuilder;
import org.kermeta.loader.FrameworkMapping;
import org.kermeta.loader.LoadingOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.cache.utilities.WeakReferenceMapCache;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;



/**
 * This class implement a store for KermetaUnit
 * This allows to retrieve KermetaUnit from their names or to load a new one
 * It uses a cache for best performance/memory 
 */
public class KermetaUnitStore  
{ 
	final static public Logger internalLog = LoggerFactory.getLogger("KermetaUnitStore");
	protected int nbInCache = 0;
	HashSet<String> unitList = new HashSet<String>();
	protected final WeakReferenceMapCache<String, KermetaUnit> kermetaUnitCache = new WeakReferenceMapCache<String, KermetaUnit>();
	
	protected HashMap<String, Object> loadingOptions = new HashMap<String, Object>();
	
	/**
	 * Create a store with specific loading options
	 * @param loadingOptions
	 */
	public KermetaUnitStore(HashMap<String, Object> loadingOptions) {
		super();
		this.loadingOptions = loadingOptions;
	}

	//protected final Hashtable<String, KermetaUnit> kermetaUnitCache = new Hashtable<String, KermetaUnit>();
	/**
	 * Get a kermetaUnit for this URI
	 * Will load it if necessary
	 * @param uri
	 * @return
	 * @throws URIMalformedException
	 * @throws NotRegisteredURIException
	 */
	public KermetaUnit get(String uri) throws URIMalformedException, NotRegisteredURIException {
		return get(uri, new HashMap<String, Object>());
	}
	
	public KermetaUnit get(String uri, HashMap<String, Object> additionalLoadingOptions) throws URIMalformedException, NotRegisteredURIException {
		assert( uri != null );

		String kermetaUnitURI = uri;

		String uriMapped = FrameworkMapping.mapping.get(kermetaUnitURI);
		if ( uriMapped != null )
			kermetaUnitURI = uriMapped;
		String frameworkUri = IOPlugin.getFrameWorkURI();
		if ( uri.equals("kermeta") ) {
			kermetaUnitURI = frameworkUri;
		} 
		else if ( uri.equals("java_rt_jar") ) {
			// if this is java declaration that are required
			String javahome = System.getProperty("java.home");
			javahome = javahome.replace("\\", "/");
			kermetaUnitURI = "file:/"+javahome+"/lib/rt.jar";
		}

		if ( 	! kermetaUnitURI.matches("platform:/plugin/.+") 
				&& 	! kermetaUnitURI.matches("platform://plugin/.+")
				&& 	! kermetaUnitURI.matches("platform:/resource/.+") 
				&&	! kermetaUnitURI.matches("http://.+")  
				&&	! kermetaUnitURI.matches("jar:file:.+")
				&&	! kermetaUnitURI.matches("file:.+") )
			throw new URIMalformedException( uri );
		
		KermetaUnit kermetaUnit = find(kermetaUnitURI);
		if ( kermetaUnit == null ) {
			
			/* make sure the framework is loaded first */
			
			if(find(frameworkUri) == null && !kermetaUnitURI.equals(frameworkUri)){				
				HashMap<String, Object> options = new HashMap<String, Object>();
				options.putAll(loadingOptions);
				options.put(LoadingOptions.FRAMEWORK_LOADING, true);
				AbstractLoader loader = LoaderFactory.getDefault().getLoader(frameworkUri, options, this);
				KermetaUnit frameworkKermetaUnit = loader.getLoadedUnit();
				kermetaUnitCache.put(frameworkUri, frameworkKermetaUnit);
				loader.load();
			}
			/*
			 * Create the EmptyUnit then load it the Kermeta Unit in this store. 
			 */	
			HashMap<String, Object> options = new HashMap<String, Object>();
			options.putAll(loadingOptions);
			if(additionalLoadingOptions != null)
				options.putAll(additionalLoadingOptions);
			AbstractLoader loader = LoaderFactory.getDefault().getLoader(kermetaUnitURI, options, this);
			kermetaUnit = loader.getLoadedUnit(); // at this step the unit is still empty, but we need to add it to the store in case it is required during the load process
			// add the unit in the cache
			kermetaUnitCache.put(kermetaUnitURI, kermetaUnit);
			// really load the unit content (except if the don't load existing option is set (for example when merging in memory)
			if(options.get(LoadingOptions.DONT_LOAD_EXISTING_RESOURCE) == null || !((Boolean)options.get(LoadingOptions.DONT_LOAD_EXISTING_RESOURCE)))
				loader.load();
		} 
		return kermetaUnit;
	}
	
	/**
	 * Try to find the Unit in the currently available Units
	 * (they may have been garbage collected if not used by anyone)
	 * @param uri
	 * @return
	 */
	public KermetaUnit find(String uri) {
		String realURI = FrameworkMapping.mapping.get(uri);
		if ( realURI == null )
			realURI = uri;
		
		if ( realURI.equals("kermeta") )
			realURI = IOPlugin.getFrameWorkURI();
		
		return kermetaUnitCache.get(realURI);
	}
	
	synchronized public void unload(String uri) {

		String realURI = FrameworkMapping.mapping.get(uri);
		if ( realURI == null )
			realURI = uri;
		
		if ( realURI.equals("kermeta") )
			realURI = IOPlugin.getFrameWorkURI();
		
		KermetaUnit kermetaUnit = kermetaUnitCache.get(realURI);
		if ( kermetaUnit != null ) {
			kermetaUnitCache.remove(realURI);			
		}
	}
	/**
	 * Returns the currently known KermetaUnits
	 * Note: keeping this collection will prevent the garbage collection
	 * @return
	 */
	public synchronized EList<KermetaUnit> getKermetaUnits() {
		BasicEList<KermetaUnit> result = new BasicEList<KermetaUnit>();
		int currentcount = 0;
		HashSet<String> currentunitList = new HashSet<String>();
		for ( KermetaUnit current : kermetaUnitCache.values() ) {
			if(!result.contains(current)){
				result.add(current);
				currentcount++;
				currentunitList.add(current.getUri());
			}
		}
		if (! currentunitList.containsAll(unitList)){
			HashSet<String> diff = (HashSet<String>) unitList.clone();
			diff.removeAll(currentunitList);
			internalLog.debug("   some elements in cache have been removed " +nbInCache +"->" +currentcount);
		}
		unitList = currentunitList;
		nbInCache = currentcount;
		return result;
	}
	
	public void clear(){
		this.kermetaUnitCache.clear();
	}
} 

