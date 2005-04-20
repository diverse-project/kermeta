/* $Id: InheritanceSearch.java,v 1.2 2005-04-20 23:58:21 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : InheritanceSearchUtilities.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2005
* Author : Franck Fleurey
* Description :
*   Some utilities to collect inherited features
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class InheritanceSearch {

	
	/**
	 * Returns all the conformant types for the class c (including c itself)
	 * @param c
	 * @return
	 */
	public static ArrayList allSuperTypes(FClass c) {
		ArrayList result = new ArrayList();
		result.add(c);
		// get all super types of direct supertypes
		Iterator it = c.getFClassDefinition().getFSuperType().iterator();
		while(it.hasNext()) {
			// get the super type
			FClass direct_st = (FClass)it.next();
			// propagate type variables
			direct_st = (FClass)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			ArrayList sts = allSuperTypes(direct_st);
			for(int i=0; i<sts.size(); i++) {
				if (!result.contains(sts.get(i))) result.add(sts.get(i));
			}
		}
		// Add the type object which is implicitly a super type of every type
		FClass object = (FClass)((SimpleType)TypeCheckerContext.ObjectType).type;
		if (! TypeEqualityChecker.equals(c, object) && !result.contains(object)) {
		    result.add(object);
		}
		return result;
	}
	
	/**
	 * Get the Callable operations on class c
	 * @param c
	 * @return
	 */
	public static ArrayList callableOperations(FClass c) {
		ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		
		Iterator it = allTypes.iterator();
		while (it.hasNext()) {
			FClass fclass = (FClass)it.next();
			Iterator ops = fclass.getFClassDefinition().getFOwnedOperation().iterator();
			// Add all operations
			while (ops.hasNext()) {
				FOperation op = (FOperation)ops.next();
				result.add(new CallableOperation(op,fclass));
			}
			// Remove hiden definition.
			// It should keep only one method per operation
			ops = ((ArrayList)result.clone()).iterator();
			while (ops.hasNext()) {
				CallableOperation op = (CallableOperation)ops.next();
				result = removeAllCallableSuperOperation(result, allSuperOperations(op.getOperation()));
			}
		}
		return result;
	}
	
	
	/**
	 * Get the callable Properties on class c
	 * @param c
	 * @return
	 */
	public static ArrayList callableProperties(FClass c) {
	    ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		
		Iterator it = allTypes.iterator();
		while (it.hasNext()) {
			FClass fclass = (FClass)it.next();
			Iterator ops = fclass.getFClassDefinition().getFOwnedAttributes().iterator();
			// Add all operations
			while (ops.hasNext()) {
				FProperty prop = (FProperty)ops.next();
				result.add(new CallableProperty(prop,fclass));
			}
		}
		return result;
	}
	
	private static ArrayList allSuperOperations(FOperation op) {
		ArrayList result = new ArrayList();
		if (op.getFSuperOperation() != null) {
			result.addAll(allSuperOperations(op.getFSuperOperation()));
		}
		return result;
	}
	
	private static ArrayList removeAllCallableSuperOperation(ArrayList ops, ArrayList supers) {
		ArrayList result = new ArrayList();
		Iterator it = ops.iterator();
		while(it.hasNext()) {
			CallableOperation co = (CallableOperation)it.next();
			if (!supers.contains(co.getOperation())) {
				result.add(co);
			}
		}
		return result;
	}

}
