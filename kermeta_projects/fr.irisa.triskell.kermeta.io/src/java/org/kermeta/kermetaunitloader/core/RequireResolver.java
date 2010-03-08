

/*$Id: RequireResolver.java,v 1.6 2008-09-08 09:09:55 dvojtise Exp $
* Project : org.kermeta.io.loader
* File : 	RequireResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.kermetaunitloader.core;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Require;

public class RequireResolver  {

	public static void resolve(KermetaUnit kermetaUnit) {
				
		
		for ( String s : kermetaUnit.getRequires() ) {
			Require require = null;
			/*
			 * 
			 * Getting the require corresponding to the URI.
			 * 
			 */
			for ( Require r : kermetaUnit.getModelingUnit().getRequires() )
				if ( r.getUri().equals(s) )
					require = r;
			
			try {
				String uri = null;	
				if ( s.matches("http.+") )
					uri = s;
				else {
					String cleanedRequire = cleanRequireValue(s);
				
					if ( cleanedRequire.equals("kermeta") || cleanedRequire.equals("java_rt_jar")) {
						uri = cleanedRequire;
					}else if (cleanedRequire.endsWith("/") || cleanedRequire.endsWith("\\")) {
						// this is probably a malformed URI or a registered URI
						uri = cleanedRequire;
					}else if(cleanedRequire.endsWith(":")){
						
						uri = cleanedRequire;
						if(! EMFRegistryHelper.isRegistered(uri) )
							throw new IOException("The file " + uri + " does not exist.");
						
					}else if(cleanedRequire.contains(":")){
						
						uri = cleanedRequire;
						//if(! EMFRegistryHelper.isRegistered(uri) )
						//	throw new IOException("The file " + uri + " does not exist.");
						
					}
					else {
					
						/*
						 * 
						 * Take care about relative path.
						 * 
						 */
						if ( ! cleanedRequire.startsWith("platform:\\\\/") 
							&& ! cleanedRequire.startsWith("file:") ) {
							int index = kermetaUnit.getUri().lastIndexOf("/");
							String path = kermetaUnit.getUri().substring(0, index);
							uri = path + "/" + cleanedRequire;
						} else
							uri = cleanedRequire;
					}
				}
	
				
				URI emfURI = URI.createURI( uri );
				emfURI = EcoreHelper.getCanonicalURI(emfURI);
				uri = emfURI.toString();

				
				
				/*
				 * 
				 * Checking if the required file exists. or is registered
				 * 
				 */
				if(! EMFRegistryHelper.isRegistered(uri)){
					URIConverter converter = new ExtensibleURIConverterImpl();
					if ( uri.startsWith("platform:/") ){
						if ( uri.startsWith("platform:/lookup/") ){
							// search in resource first, if not found, search in plugin
							// DVK: a better version would be to take into account the global context, 
							// and not search in the user workspace if we are running a file from a plugin
							//  unfortunately this is impossible now, unless we correctly separate the interpreter context between executions
							// try in workspace
							String newUri = uri.replaceAll("platform:/lookup/", "platform:/resource/");
							emfURI = URI.createURI( newUri );
							emfURI = EcoreHelper.getCanonicalURI(emfURI);
							if(! converter.exists(emfURI, null) ) {
								newUri = uri.replaceAll("platform:/lookup/", "platform:/plugin/");
								emfURI = URI.createURI( newUri );
								emfURI = EcoreHelper.getCanonicalURI(emfURI);
								if(! converter.exists(emfURI, null) ) {
									throw new IOException("The file " + uri + " does not exist. \n(neither in resource, nor in plugin)");
								}
							}	
							// ok no exception, completly switch to the new uri
							uri = newUri;
						}
						else if(! converter.exists(emfURI, null) ) 
							throw new IOException("The file " + uri + " does not exist.");						
					} else 
						if ( ! uri.equals("kermeta")  && ! uri.equals("java_rt_jar"))
							throw new IOException("The file " + uri + " does not exist.");
				}
				/*
				 * 
				 * If no error, then we can create a link between the require and the kermeta unit to import.
				 * 
				 */
				KermetaUnit unitToImport = IOPlugin.getDefault().getKermetaUnit(uri);
				/*
				 * TODO create a warning when there are requires for the same file.
				 */
				kermetaUnit.getImportedKermetaUnits().add( unitToImport );
										
				KermetaUnitRequire kuRequire = IoFactory.eINSTANCE.createKermetaUnitRequire();
				kuRequire.setKermetaUnit(unitToImport);
				kuRequire.setRequire(require);
				kermetaUnit.getKermetaUnitRequires().add( kuRequire );

			} catch (URIMalformedException e) {
			
				e.printStackTrace();
			
			} catch (NotRegisteredURIException e) {
				kermetaUnit.error(e.getMessage(), require);
			} catch ( IOException e ) {
				kermetaUnit.error(e.getMessage(), require );
			} catch (Throwable t){
				t.printStackTrace();
			}
			

		}
		
	}

	private static String cleanRequireValue(String value) {
		String cleanedRequire = value.replaceAll("\"", "");
		if ( cleanedRequire.startsWith("./") )
			cleanedRequire = cleanedRequire.substring(2, cleanedRequire.length());		
		return cleanedRequire;
	}
	
}


