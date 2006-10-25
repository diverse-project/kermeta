/* $Id: OperationHelper.java,v 1.1 2006-10-25 08:25:59 dvojtise Exp $
 * Project   : Kermeta 
 * File      : OperationHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 25 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;

/**
 * this class proposes various helper functions that applies to ClassDefinition in the Kermeta model
 *
 */
public class OperationHelper {
	
	// ---------------------------------
	// Functions relative to Contraints
	// ---------------------------------
	/**
	 * Get a PreCondition by its name in Operation op
	 * @param op
	 * @param name
	 * @return
	 */
	public static Constraint getPreConditionByName(Operation op, String name) {
		EList preConds = op.getPre();
		for (int i=0; i<preConds.size(); i++) {
			Constraint pre = (Constraint) preConds.get(i);
			if(pre.getName().equals(name))
				return pre;
		}
		return null;
	}
	
	
	/**
	 * Get a PostCondition by its name in Operation op
	 * @param op
	 * @param name
	 * @return
	 */
	public static Constraint getPostConditionByName(Operation op, String name) {
		EList postConds = op.getPost();
		for (int i=0; i<postConds.size(); i++) {
			Constraint post = (Constraint) postConds.get(i);
			if(post.getName().equals(name))
				return post;
		}
		return null;
	}
	
	
	/**
	 * Get a PostCondition by its name in Operation op and its superoperations
	 * @param op
	 * @param name
	 * @return
	 */
	public static Constraint findPostConditionByName(Operation op, String name) {
		Constraint result = getPostConditionByName(op, name);
		if (result != null) return result;
		
		Operation superOp = op.getSuperOperation();
		if(superOp != null) {
			result = findPostConditionByName(superOp, name);
			if(result != null) return result;
		}
		return null;
	}
	
	/**
	 * Get a PreCondition by its name in Operation op and its superoperations
	 * @param op
	 * @param name
	 * @return
	 */
	public static Constraint findPreConditionByName(Operation op, String name) {
		Constraint result = getPreConditionByName(op, name);
		if (result != null) return result;
		
		Operation superOp = op.getSuperOperation();
		if(superOp != null) {
			result = findPreConditionByName(superOp, name);
			if(result != null) return result;
		}
		return null;
	}
}
