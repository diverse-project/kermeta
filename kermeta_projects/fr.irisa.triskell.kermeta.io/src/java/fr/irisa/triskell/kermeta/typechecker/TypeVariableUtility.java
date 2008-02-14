/* $Id: TypeVariableUtility.java,v 1.7 2008-02-14 07:13:16 uid21732 Exp $
* Project : Kermeta (First iteration)
* File : TypeVariableUtility.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2005
* Author : Franck Fleurey
* Description :
*    This class allows computing the least derived type admitable
*  	 for a type variable
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class TypeVariableUtility {

	public static fr.irisa.triskell.kermeta.language.structure.Type getLeastDerivedAdmissibleType(fr.irisa.triskell.kermeta.language.structure.Type ptype) {
		fr.irisa.triskell.kermeta.language.structure.Type result = ptype;
		if (result instanceof VirtualType) {
			//Can't do this statically for a VirtualType!
			result = ((SimpleType)TypeCheckerContext.ObjectType).getType();
		}
		while(result instanceof ObjectTypeVariable) {
			ObjectTypeVariable tv = (ObjectTypeVariable)result;
			if (tv.getSupertype() != null) {
				result = tv.getSupertype();
				if ( result instanceof PrimitiveType )
					result = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) result );
			} else 
				result = ((SimpleType)TypeCheckerContext.ObjectType).getType();
		}
		while (result instanceof ModelTypeVariable) {
			ModelTypeVariable mtv = (ModelTypeVariable) result;
			//This line is probably useless - can't imagine a modeltypevariable using an alias as its supertype...
			result = mtv.getSupertype();
			if ( result instanceof PrimitiveType )
				result = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) result );
		}
		return result;
	}

}
