/* $Id: PrimitiveTypeResolver.java,v 1.1 2005-04-19 08:55:09 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : PrimitiveTypeResolver.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2005
* Author : Franck Fleurey
* Description :
*    This is a utility class to resolve primitive types
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class PrimitiveTypeResolver {

	/**
	 * Return the instance type of a primitive type
	 * @param ptype an FType
	 * @return the non-primitive type ptype stands for
	 */
	public static FType getResolvedType(FType ptype) {
		FType result = ptype;
		while(result instanceof FPrimitiveType) {
			result = ((FPrimitiveType)result).getFInstanceType();
		}
		return result;
	}
	
}
