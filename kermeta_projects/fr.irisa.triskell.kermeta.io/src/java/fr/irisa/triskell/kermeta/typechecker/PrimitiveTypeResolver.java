/* $Id: PrimitiveTypeResolver.java,v 1.2 2006-03-03 15:22:18 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
//import fr.irisa.triskell.kermeta.language.structure.FType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class PrimitiveTypeResolver {

	/**
	 * Return the instance type of a primitive type
	 * @param ptype an fr.irisa.triskell.kermeta.language.structure.Type
	 * @return the non-primitive type ptype stands for
	 */
	public static fr.irisa.triskell.kermeta.language.structure.Type getResolvedType(fr.irisa.triskell.kermeta.language.structure.Type ptype) {
		fr.irisa.triskell.kermeta.language.structure.Type result = ptype;
		while(result instanceof PrimitiveType) {
			result = ((PrimitiveType)result).getInstanceType();
		}
		return result;
	}
	
}
