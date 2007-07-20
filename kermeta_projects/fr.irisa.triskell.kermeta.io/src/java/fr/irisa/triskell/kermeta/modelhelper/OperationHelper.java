/* $Id: OperationHelper.java,v 1.2 2007-07-20 15:08:10 ftanguy Exp $
 * Project   : Kermeta 
 * File      : OperationHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 25 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.typechecker.TypeConformanceChecker;

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
	
	public static Parameter getParameter(Operation op, String parameterName) {
		for ( Parameter p : (List<Parameter>) op.getOwnedParameter() ) {
			if ( p.getName().equals(parameterName) )
				return p;
		}
		return null;
	}

	static public boolean isOverloadable(Operation operation) {
		if ( operation.getOwnedTag() != null ) {
			for ( Tag tag : (List<Tag>) operation.getOwnedTag() ) {
				if ( tag.getName() != null )
					if ( tag.getName().equals("overloadable") && tag.getValue().equals("true") )
						return true;
			}
		}
		return false;
	}
	
	static public boolean operationsSignatureEqualityChecker(Operation op1, Operation op2) {
		boolean result = op1.getName().equals( op2.getName() );
		if ( result )
			result = TypeConformanceChecker.conforms(op1.getType(), op2.getType());
		if ( result )
			result = op1.getOwnedParameter().size() == op2.getOwnedParameter().size();
		if ( result ) {
			Iterator <Parameter> it1 = op1.getOwnedParameter().iterator();
			Iterator <Parameter> it2 = op2.getOwnedParameter().iterator();
			while ( result && it1.hasNext() && it2.hasNext() ) {
				Parameter param1 = it1.next();
				Parameter param2 = it2.next();
				result = TypeConformanceChecker.conforms(param1.getType(), param2.getType());
			}
		}
		return result;
	}
	
	static public List <Constraint> getAllPre(Operation operation) {
		/*
		 * 
		 * Looking in the hierarchy.
		 * 
		 */
		List <Constraint> preConditions = new ArrayList <Constraint> ();
		Operation currentOperation = operation;
		while ( currentOperation != null ) {
			preConditions.addAll( currentOperation.getPre() );
			currentOperation = currentOperation.getSuperOperation();
		}
		/*
		 * 
		 * Looking in the base classes.
		 * 
		 */
		ClassDefinition classDefinition = (ClassDefinition) operation.getOwningClass();
		if ( ! classDefinition.getBaseAspects().isEmpty() ) {
			Set <TypeDefinition> baseClasses = ClassDefinitionHelper.getAllBaseClasses( classDefinition );
			for ( TypeDefinition typeDefinition : baseClasses ) {
				if ( typeDefinition instanceof ClassDefinition ) {
					ClassDefinition baseClass = (ClassDefinition) typeDefinition;
					Operation matchedOperation = ClassDefinitionHelper.getLocalMatchingOperation(baseClass, operation);
					if ( matchedOperation != null )
						preConditions.addAll( matchedOperation.getPre() );
				}
			}
		}	
		/*
		 * 
		 * Looking in the aspects classes.
		 * 
		 */
		if ( ! classDefinition.getAspects().isEmpty() ) {
			Set <TypeDefinition> aspectClasses = ClassDefinitionHelper.getAllAspectClasses( classDefinition );
			for ( TypeDefinition typeDefinition : aspectClasses ) {
				if ( typeDefinition instanceof ClassDefinition ) {
					ClassDefinition aspectClass = (ClassDefinition) typeDefinition;
					if ( aspectClass != classDefinition ) {
						Operation matchedOperation = ClassDefinitionHelper.getLocalMatchingOperation(aspectClass, operation);
						if ( matchedOperation != null )
							preConditions.addAll( matchedOperation.getPre() );
					}
				}
			}
		}	
		return preConditions;
	}
	
	static public List <Constraint> getAllPost(Operation operation) {
		/*
		 * 
		 * Looking in the hierarchy.
		 * 
		 */
		List <Constraint> postConditions = new ArrayList <Constraint> ();
		Operation currentOperation = operation;
		while ( currentOperation != null ) {
			postConditions.addAll( currentOperation.getPost() );
			currentOperation = currentOperation.getSuperOperation();
		}
		/*
		 * 
		 * Looking in the base classes.
		 * 
		 */
		ClassDefinition classDefinition = (ClassDefinition) operation.getOwningClass();
		if ( ! classDefinition.getBaseAspects().isEmpty() ) {
			Set <TypeDefinition> baseClasses = ClassDefinitionHelper.getAllBaseClasses( classDefinition );
			for ( TypeDefinition typeDefinition : baseClasses ) {
				if ( typeDefinition instanceof ClassDefinition ) {
					ClassDefinition baseClass = (ClassDefinition) typeDefinition;
					Operation matchedOperation = ClassDefinitionHelper.getLocalMatchingOperation(baseClass, operation);
					if ( matchedOperation != null )
						postConditions.addAll( matchedOperation.getPost() );
				}
			}
		}	
		/*
		 * 
		 * Looking in the aspects classes.
		 * 
		 */
		if ( ! classDefinition.getAspects().isEmpty() ) {
			Set <TypeDefinition> aspectClasses = ClassDefinitionHelper.getAllAspectClasses( classDefinition );
			for ( TypeDefinition typeDefinition : aspectClasses ) {
				if ( typeDefinition instanceof ClassDefinition ) {
					ClassDefinition aspectClass = (ClassDefinition) typeDefinition;
					Operation matchedOperation = ClassDefinitionHelper.getLocalMatchingOperation(aspectClass, operation);
					if ( matchedOperation != null )
						postConditions.addAll( matchedOperation.getPre() );
				}
			}
		}	
		return postConditions;
	}
	
}
