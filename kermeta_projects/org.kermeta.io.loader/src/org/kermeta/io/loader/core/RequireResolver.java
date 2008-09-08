

/*$Id: RequireResolver.java,v 1.6 2008-09-08 09:09:55 dvojtise Exp $
* Project : org.kermeta.io.loader
* File : 	RequireResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.core;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl; // will need to switch to ExtendibleURIConverterImpl when will we definetly switch to eclipse 3.4 or above
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Require;

public class RequireResolver implements ILoadingAction {

	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		
		KermetaUnit kermetaUnit = datas.getKermetaUnit();
		
		for ( String s : kermetaUnit.getRequires() ) {
			Require require = null;
			/*
			 * 
			 * Getting the require corresponfing to the URI.
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
					URIConverter converter = new URIConverterImpl();
					if ( uri.startsWith("platform:/") ){
						try{ // as we cannot use exist with previous eclipse version try to open and close the file, if an error occurs, then it probably don't exists ...
							converter.createInputStream( emfURI ).close();
						}
						catch(Throwable t){
							throw new IOException("The file " + uri + " does not exist.");
						}
						/* this code can work only with eclise 3.4
						if(! converter.exists(emfURI, null) ) 
							throw new IOException("The file " + uri + " does not exist.");
						*/						
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

	private String cleanRequireValue(String value) {
		String cleanedRequire = value.replaceAll("\"", "");
		if ( cleanedRequire.startsWith("./") )
			cleanedRequire = cleanedRequire.substring(2, cleanedRequire.length());		
		return cleanedRequire;
	}
	
}


