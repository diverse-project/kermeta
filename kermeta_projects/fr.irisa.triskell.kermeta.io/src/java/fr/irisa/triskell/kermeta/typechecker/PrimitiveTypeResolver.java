/* $Id: PrimitiveTypeResolver.java,v 1.5 2008-01-02 10:28:31 vmahe Exp $
* Project : Kermeta (First iteration)
* File : PrimitiveTypeResolver.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2005
* Author : Franck Fleurey
* Description :
*    This is a utility class to resolve primitive types
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class PrimitiveTypeResolver {

	/**
	 * Return the instance type of a primitive type
	 * @param ptype an fr.irisa.triskell.kermeta.language.structure.Type
	 * @return the non-primitive type ptype stands for
	 */
	public static Type getResolvedType(Type ptype) {
		Type result = ptype;
		while(result instanceof PrimitiveType) {
			result = ((PrimitiveType)result).getInstanceType();
		}
		return result;
	}
	
}
