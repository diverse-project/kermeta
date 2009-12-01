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
 * 				Extern version for the 'interpreted' Mode
 * 
 */

package org.kermeta.language.mdk.externs.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;


public class Properties {

	/**
	 * Get the properties like a Hashtable: keys are the keys from the property file
	 * 
	 * @param self
	 * @param param0
	 * @return
	 */
	public static RuntimeObject getProperties(RuntimeObject self, RuntimeObject param0) {
		
		java.lang.String file_path = getFilePath(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0));
		
		GenericTypeDefinition mapClassDef  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::utils::Hashtable");
    	
	    GenericTypeDefinition stringClassDef  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::String");
	    fr.irisa.triskell.kermeta.language.structure.Class stringClass = StructureFactory.eINSTANCE.createClass();
	    stringClass.setTypeDefinition(stringClassDef);
	    
	    GenericTypeDefinition stringClassDef2  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::String");
	    fr.irisa.triskell.kermeta.language.structure.Class stringClass2 = StructureFactory.eINSTANCE.createClass();
	    stringClass2.setTypeDefinition(stringClassDef2);

	    
	    fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding4map1 = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    tvBinding4map1.setType(stringClass);
	    tvBinding4map1.setVariable( (TypeVariable) mapClassDef.getTypeParameter().get(0) );
	    
	    fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding4map2 = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    tvBinding4map2.setType(stringClass2);
	    tvBinding4map2.setVariable( (TypeVariable) mapClassDef.getTypeParameter().get(1) );
	    
	    fr.irisa.triskell.kermeta.language.structure.Class mapClass = StructureFactory.eINSTANCE.createClass();
	    mapClass.setTypeDefinition(mapClassDef);
	    mapClass.getTypeParamBinding().add(tvBinding4map1);
	    mapClass.getTypeParamBinding().add(tvBinding4map2);
	    
	    RuntimeObject metaclassRO = self.getFactory().getMemory().getRuntimeObjectForFObject(mapClass);
    	RuntimeObject emptyMapRO = new RuntimeObjectImpl(self.getFactory(), metaclassRO);
   	
    	Hashtable<RuntimeObject, RuntimeObject> ht = new Hashtable<RuntimeObject, RuntimeObject>();
		
		java.util.Properties props = getPropertiesInternal(file_path);
		for(Entry<Object, Object> prop : props.entrySet()) {
			if( prop.getValue() instanceof java.lang.String) {
				java.lang.String str = (java.lang.String) prop.getValue();
				if( !str.equals("") ) {
					System.err.println(str);
					RuntimeObject key = self.getFactory().createObjectFromClassName("kermeta::standard::String");
					fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(key, prop.getKey().toString());
					
					RuntimeObject value_str = self.getFactory().createObjectFromClassName("kermeta::standard::String");
					fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(value_str, str);
					
					ht.put(key, value_str);
				}
			}
		}
    	
    	
    	emptyMapRO.setPrimitiveType(RuntimeObject.HASHTABLE_VALUE);
    	emptyMapRO.setJavaNativeObject(ht);

    	return emptyMapRO;
	}
	
	private static java.util.Properties getPropertiesInternal(java.lang.String file_path) {
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
	
	/*************************************************************/
	/*************************************************************/
	/*************************************************************/
	public static String getFilePath(String filename) {
		java.lang.String fname = getOSFileLocation(filename);
		
		java.lang.String filePath = fname;
		
		if ( fname.startsWith("platform:/resource") ) {
    		java.lang.String platformFname = fname.replace("platform:/resource", "");
    		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path(platformFname) );
    		filePath = folder.getLocation().toString();
    	}
		
		File file = new File(filePath.replace("file://", "").replace("file:/", ""));
		if ( file.exists() ) {
			return filePath.replace("file://", "").replace("file:/", "");
		} else {
			System.err.println(filename + " not found !");
			return "";
		}
    }

	/**
     * 
     * @param fileEclipsePath
     * @return
     */
    private static java.lang.String getOSFileLocation(java.lang.String fileEclipsePath) {
    	// FIXME CF Here we did the assumption that the path is absolute (towards the Eclipse workspace) !
    	// We should here recalculate the path of the file if filePath is a relative path !
    	java.lang.String filePath = cleanIfNecessaryPath(fileEclipsePath);

    	//convert windows delimiter into /
    	filePath = filePath.replaceAll("\\\\", "/");
    	
    	return filePath;
    }
    
    private static java.lang.String cleanIfNecessaryPath(java.lang.String resourcePath) {
		// deal with windows \\ delimiter
		java.lang.String unifiedSepratorResourcePath = resourcePath.replaceAll("\\\\", "/");
		
		java.lang.String cleanPath = unifiedSepratorResourcePath;
		if ( unifiedSepratorResourcePath.matches("platform:/resource.*") ) {
			URI uri = URI.createURI(unifiedSepratorResourcePath);
			URIConverter converter = new ExtensibleURIConverterImpl();
			uri = converter.normalize(uri);
			cleanPath = uri.toString();
		}
		return cleanPath;
	}

}
