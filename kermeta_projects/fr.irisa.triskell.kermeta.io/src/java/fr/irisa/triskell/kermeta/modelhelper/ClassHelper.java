/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ClassHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 oct. 2009
* Authors : dvojtise
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

public class ClassHelper {
	
	/**
	 * Returns all the conformant types for the class c (including c itself)
	 * @param c
	 * @return
	 */
	public static List<Type> allSuperTypes(Class c) {
		List<Type> result = new ArrayList<Type>();
		result.add(c);
		// get all super types of direct supertypes
		for (Object super_type : ((ClassDefinition) c.getTypeDefinition()).getSuperType()) {
			// get the super type
			Class direct_st = (Class)super_type;
			// propagate type variables
			direct_st = (Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			List<Type> sts = allSuperTypes(direct_st);
			for ( int i=0; i<sts.size(); i++ ) {
				if ( ! result.contains(sts.get(i)) ) 
					result.add( sts.get(i) );
			}
		}
		// Add the type object which is implicitly a super type of every type
		/*Class object = (Class)((SimpleType)TypeCheckerContext.ObjectType).type;
		if ( ! TypeEqualityChecker.equals(c, object) && ! result.contains(object) )
		    result.add(object);
		    */
		return result;
	}
}
