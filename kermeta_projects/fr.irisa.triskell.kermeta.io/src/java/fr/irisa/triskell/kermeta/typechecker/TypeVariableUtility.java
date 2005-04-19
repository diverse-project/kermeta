/* $Id: TypeVariableUtility.java,v 1.1 2005-04-19 08:55:08 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : TypeVariableUtility.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2005
* Author : Franck Fleurey
* Description :
*    This class allows computing the least derived type admitable
*  	 for a type variable
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeVariableUtility {

	public static FType getLeastDerivedAdmissibleType(FType ptype) {
		FType result = ptype;
		while(result instanceof FTypeVariable) {
			FTypeVariable tv = (FTypeVariable)result;
			if (tv.getFSupertype() != null) result = PrimitiveTypeResolver.getResolvedType(tv.getFSupertype());
			else result = ((SimpleType)TypeCheckerContext.ObjectType).getType();
		}
		return result;
	}

}
