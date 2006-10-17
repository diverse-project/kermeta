/* $Id: TypeVariableUtility.java,v 1.3 2006-10-17 09:15:16 cfaucher Exp $
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

import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeVariableUtility {

	public static Type getLeastDerivedAdmissibleType(Type ptype) {
		Type result = ptype;
		while(result instanceof TypeVariable) {
			TypeVariable tv = (TypeVariable)result;
			if (tv.getSupertype() != null) result = PrimitiveTypeResolver.getResolvedType(tv.getSupertype());
			else result = ((SimpleType)TypeCheckerContext.ObjectType).getType();
		}
		return result;
	}

}
