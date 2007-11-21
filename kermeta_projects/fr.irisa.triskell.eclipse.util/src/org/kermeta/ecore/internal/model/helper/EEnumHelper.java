

/*$Id: EEnumHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EEnumHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.internal.model.helper;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcoreFactory;

public class EEnumHelper {

	/**
	 * Creates an enumeration with the given name.
	 * 
	 * @param name the name of the enumeration.
	 * @return an instance of EEnum
	 */
	static public EEnum create(String name) {
		return create(name, null, null);
	}
	
	/**
	 * 
	 * Creates an enumeration with the given name and the given instance class name.
	 * 
	 * @param name the name of the enumeration.
	 * @param instanceClassName the instance class name the data type refers to.
	 * @return an instance of EEnum
	 */
	static public EEnum create(String name, String instanceClassName) {
		return create(name, instanceClassName, null);
	}
	
	/**
	 * 
	 * Creates an enumeration with the given name.
	 * 
	 * @param name the name of the enumeration.
	 * @param isSerializable a boolean stating wether the enumeration can be serialized or not.
	 * @return an instance of EEnum
	 */
	static public EEnum create(String name, Boolean isSerializable) {
		return create(name, null, isSerializable);
	}
	
	/**
	 * 
	 * Creates an enumeration with the given name and the given instance class name.
	 * 
	 * @param name the name of the enumeration.
	 * @param instanceClassName the instance class name the data type refers to.
	 * @param isSerializable a boolean stating wether the enumeration can be serialized or not.
	 * @return an instance of EEnum
	 */
	static public EEnum create(String name, String instanceClassName, Boolean isSerializable) {
		EEnum enumeration = EcoreFactory.eINSTANCE.createEEnum();
		enumeration.setName( name );
		if ( instanceClassName != null )
			enumeration.setInstanceClassName( instanceClassName );
		if ( isSerializable != null )
			enumeration.setSerializable( isSerializable );
		return enumeration;
	}
	
}


