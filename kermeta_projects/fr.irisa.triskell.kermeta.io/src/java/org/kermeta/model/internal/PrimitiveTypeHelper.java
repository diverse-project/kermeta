

/*$Id: PrimitiveTypeHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	PrimitiveTypeHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;

public class PrimitiveTypeHelper {

	/**
	 * 
	 * Creates a primitive type with the given name.
	 * 
	 * @param name
	 * @return
	 */
	static public PrimitiveType create(String name) {
		return create(name, null);
	}
	
	/**
	 * 
	 * Creates a primitive type with the given name and the given type.
	 * 
	 * @param name
	 * @param type
	 * @return
	 */
	static public PrimitiveType create(String name, Type type) {
		PrimitiveType primitiveType = StructureFactory.eINSTANCE.createPrimitiveType();
		primitiveType.setName(name);
		if ( type != null )
			primitiveType.setInstanceType(type);
		return primitiveType;
	}
	
	/**
	 * return the first non PrimitiveType for the given type following the instanceType link
	 * note: doesn't check for inconsistent model (ie. loop ...)
	 * @param inputtype
	 * @return
	 */
	public static Type resolvePrimitiveType(PrimitiveType inputType) {
		Type result = inputType;
		while(result instanceof PrimitiveType){
			result = ((PrimitiveType)result).getInstanceType();
		}
		return result;
	}
}


