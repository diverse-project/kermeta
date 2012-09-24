/* $Id:$ 
 * Creation : 22 dec. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.helper.tests.utils;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

import scala.collection.Iterator;

public class ModelingUnitUtil extends ModelingUnitBaseUtil {

	public static ModelingUnit loadModelingUnit(String filePath) throws IOException, URISyntaxException{
    	if(filePath.endsWith(".km")){
    		return loadModelingUnitFromKm(filePath);
    	}
    	if(filePath.endsWith(".kmt")){
    		return loadModelingUnitFromKMT(filePath);
    	}
    	return null;
    }
	
    public static ModelingUnit loadModelingUnitFromKMT(String kmtFilePath) throws IOException, URISyntaxException{
    
    	KMTparser parser = new KMTparser();		
		Iterator<String> src = scala.io.Source.fromFile( new java.io.File(kmtFilePath.replaceFirst("file:/", "")),
				"UTF8").getLines();

		StringBuffer buf = new StringBuffer();
		while (src.hasNext()) {
			buf.append(src.next() + "\n");
		}


		ModelingUnit mu = parser.load(FileHelpers.StringToURL(kmtFilePath), buf.toString(), new StdioSimpleMessagingSystem() );

		return mu;
    }

}
