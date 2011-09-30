/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 30 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.helpers.emf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

public class ExtensibleURIConverterImplURIMapHelper {
	
	/**
	 * fill the ExtensibleURIConverterImpl.URI_MAP with the file referenced by the system property "urimap.file.location"
	 * @param ignorePlatformResource if true, will not add in the map an entry key platform:/resource (useful if this entry is used by EcorePlugin.java instead)
	 */
	public static void fillMapFromSystemPropertyFile(boolean ignorePlatformResource){
		Properties props;
		if(ignorePlatformResource) {
			props = filterPlatformResource(getMapFromSystemProperty());
		}
		else{
			props = getMapFromSystemProperty();
		}
		for(Entry<Object, Object> entry : props.entrySet()){
			// TODO make sure to not add the same URI twice
			ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI(entry.getKey().toString()),
												   URI.createURI(entry.getValue().toString()));
		}
	}
	
	public static Properties getMapFromSystemProperty(){
		String fileLocation = System.getProperties().getProperty("urimap.file.location");
		if (fileLocation == null) return null;
		Properties props = new Properties();
		try {
			FileInputStream fis = new FileInputStream(fileLocation);
			props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	public static Properties filterPlatformResource(Properties originalProperties){
		if(originalProperties.containsKey("platform:/resource")){
			Properties props = new Properties();
			for(Entry<Object, Object> entry : props.entrySet()){
				if(!entry.getKey().equals("platform:/resource")  )
					props.put(entry.getKey(), entry.getValue());
			}
			return props;
		}
		else
			return originalProperties;
	}
	
	public static String getPlatformResource(Properties props){
		return props.get("platform:/resource").toString();
	}

}
