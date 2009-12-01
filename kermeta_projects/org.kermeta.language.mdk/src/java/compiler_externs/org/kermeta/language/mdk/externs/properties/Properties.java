/* $Id: Properties.java, cfaucher Exp $
 * Project: org.kermeta.language.mdk
 * File: Properties.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: December 1, 2009
 * Authors:
 * 		Cyril Faucher <cyril.faucher@gmail.com>
 * 
 * Desciprion:
 * 				Extern version for the 'compiled' Mode
 * 
 */

package org.kermeta.language.mdk.externs.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;


public class Properties {
	
	/**
	 * Get the properties like a Hashtable: keys are the keys from the property file
	 * 
	 * @param file_path
	 * @return
	 */
	public static kermeta.utils.Hashtable<java.lang.String, java.lang.String> getProperties(String file_path) {
		
		ExtensibleURIConverterImpl converter = new ExtensibleURIConverterImpl();
		file_path = converter.normalize(URI.createURI(file_path)).toFileString();
		
		kermeta.utils.Hashtable<java.lang.String, java.lang.String> map = kermeta.utils.UtilsFactory.eINSTANCE.createHashtable();
		
		java.util.Properties props = getPropertiesInternal(file_path);
		for(Entry<Object, Object> prop : props.entrySet()) {
			if( prop.getValue() instanceof java.lang.String) {
				java.lang.String str = (java.lang.String) prop.getValue();
				if( !str.equals("") ) {
					map.put(prop.getKey().toString(), str);
				}
			}
		}
		
		return map;
	}
	
	private static java.util.Properties getPropertiesInternal(String file_path) {
		// Read properties file
	    java.util.Properties properties = new java.util.Properties();
	    
	    try {
	        properties.load(new FileInputStream(file_path));
	    } catch (FileNotFoundException e) {
	    	properties = null;
	    	System.err.println("The Property file has not found: " + file_path);
	    } catch (IOException e) {
		}
	    
	    return properties;
	}

}
