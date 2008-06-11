

/*$Id: RequireResolver.java,v 1.3 2008-06-11 15:17:03 ftanguy Exp $
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
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
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
			
			String uri = null;	
			if ( s.matches("http.+") )
				uri = s;
			else {
				String cleanedRequire = cleanRequireValue(s);
			
				if ( cleanedRequire.equals("kermeta") ) {
					uri = cleanedRequire;
				} else {
					/*
					 * 
					 * Take care about relative path.
					 * 
					 */
					if ( ! cleanedRequire.startsWith("platform:/") 
						&& ! cleanedRequire.startsWith("file:") ) {
						int index = kermetaUnit.getUri().lastIndexOf("/");
						String path = kermetaUnit.getUri().substring(0, index);
						uri = path + "/" + cleanedRequire;
					} else
						uri = cleanedRequire;
				}
			}

			Require require = null;
			
			try {
				URI emfURI = URI.createURI( uri );
				emfURI = EcoreHelper.getCanonicalURI(emfURI);
				uri = emfURI.toString();

				/*
				 * 
				 * Getting the require corresponfing to the URI.
				 * 
				 */
				for ( Require r : kermetaUnit.getModelingUnit().getRequires() )
					if ( r.getUri().equals(s) )
						require = r;
				
				/*
				 * 
				 * Checking if the required file exists. Try to create an input stream on it that launches an IOException if the file does ont exist.
				 * 
				 */
				if ( uri.startsWith("platform:/resource") || uri.startsWith("platform:/plugin") ) {
					URIConverter converter = new URIConverterImpl();
					converter.createInputStream( emfURI ).close();
				} else if ( ! uri.equals("kermeta") && ! EMFRegistryHelper.isRegistered(uri) )
					throw new IOException("The file " + uri + " does not exist.");
				
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


