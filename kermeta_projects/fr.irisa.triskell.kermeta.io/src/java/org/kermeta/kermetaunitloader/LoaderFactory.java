/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	LoaderFactory.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 févr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.kermetaunitloader;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.kermetaunitloader.core.EmptyKermetaUnitBuilder;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class LoaderFactory {

	public AbstractLoader getLoader(String uriString, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		URI uri = URI.createURI(uriString);
		return getLoader(uri, null, store);
	}
	public AbstractLoader getLoader(String uriString, Map<String, Object> options, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		URI uri = URI.createURI(uriString);
		return getLoader(uri, options, store);
	}
	public AbstractLoader getLoader(URI uri, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		return getLoader(uri, null, store);
	}
	
	/**
	 * 
	 * @param uri
	 * @param options
	 * @param store that should be used for required unit during the load process
	 * @return
	 * @throws NotRegisteredURIException 
	 * @throws URIMalformedException 
	 */
	public AbstractLoader getLoader(URI uri, Map<String, Object> options, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		/*
		 * Getting the loader corresponding to the file extension.
		 */
		String extension = uri.fileExtension();
		if ( extension == null )
			return new EcoreResourceLoader(uri.toString(), options, store);
		else if ( extension.equals("kmt") )
			return new KMTFileLoader(uri.toString(), options, store);
		else if ( extension.equals("km") )
			return new KMFileLoader(uri.toString(), options, store);
		else if ( extension.equals("ecore") )
			return new EcoreResourceLoader(uri.toString(), options, store);
		else if ( extension.equals("memory") )
			// we deal with a unit in memory, loader know only about creating an empty one, the user is responsible for filling this unit with real content
			return new EmptyKermetaUnitBuilder(uri.toString());
		else {
			// We are in the case with an unknown extension or an URI
			// we suppose that this is a registered Ecore
			return new EcoreResourceLoader(uri.toString(), options, store);
		}
	}
	
	protected LoaderFactory(){		
	}
	protected static LoaderFactory instance =  new LoaderFactory();
	public static LoaderFactory getDefault(){
		return instance;
	}
	
}
