

/*$Id: EDataTypeHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EDataTypeHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.internal.model.helper;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcoreFactory;

public class EDataTypeHelper {

	static private final String DEFAULT_INSTANCE_CLASS_NAME = "java.lang.Object";
	
	/**
	 * Creates a data type with the given name.
	 * 
	 * @param name the name of the data type.
	 * @return an instance of EDataType
	 */
	static public EDataType create(String name) {
		return create(name, DEFAULT_INSTANCE_CLASS_NAME, null);
	}
	
	/**
	 * 
	 * Creates a data type with the given name and the given instance class name.
	 * 
	 * @param name the name of the data type.
	 * @param instanceClassName the instance class name the data type refers to.
	 * @return an instance of EDataType
	 */
	static public EDataType create(String name, String instanceClassName) {
		if ( instanceClassName == null )
			instanceClassName = DEFAULT_INSTANCE_CLASS_NAME;
		return create(name, instanceClassName, null);
	}
	
	/**
	 * 
	 * Creates a data type with the given name and the given instance class name.
	 * 
	 * @param name the name of the data type.
	 * @param instanceClassName the instance class name the data type refers to.
	 * @param isSerializable a boolean stating wether the data type can be serialized or not.
	 * @return an instance of EDataType
	 */
	static public EDataType create(String name, String instanceClassName, Boolean isSerializable) {
		EDataType datatype = EcoreFactory.eINSTANCE.createEDataType();
		datatype.setName(name);
		
		if ( instanceClassName != null )
			datatype.setInstanceClassName(instanceClassName);
		
		if ( isSerializable != null )
			datatype.setSerializable(isSerializable);
		return datatype;
	}
	
}


