/* $Id: OperationChecker.java,v 1.1 2006-03-08 17:17:25 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : OperationChecker.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 juil. 2005
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 * Description : 
 */

/**
 * This package contains some constraint checking tools
 */
package fr.irisa.triskell.kermeta.graphicaleditor.utils;

import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 *
 * Defaults : some comparison tests need to be done using KM2KMTPrettyPrinter..
 * This is not the most efficient way but there is no other.
 * (but simpler to test the types conformity)
 * We also have to discuss if some constraints are more type-checking related or not
 */
public class OperationChecker extends AbstractChecker {

	protected TypeEqualityChecker typeEqualityChecker;
	protected ClassDefinition classDefinition;
	protected Operation operation;
 
	
	public OperationChecker(KermetaUnit unit, 
			fr.irisa.triskell.kermeta.language.structure.Object operation, 
			fr.irisa.triskell.kermeta.language.structure.Object context)
	{
		super(unit, operation, context);
		classDefinition = (ClassDefinition)context;
		
	}
	
	/**
	 * @param context The context of constraint checking, ClassDefinition for the operation
	 * case. Visitor gives it.
	 * @return
	 */
	public boolean check()
	{
		boolean result = false;
		result =
			checkOperationIsUnique() &&
			checkOperationSignature() &&
			checkOperationIsAbstract();
		return result;
	}

	/** 
	 * Constraint: redefinition must be invariant
	 * @return true if operation signature is conform to 
	 * super operations if they exist.
	 */
	public boolean checkOperationSignature()
	{
		boolean result = false;
		List ops = builder.getAllOperations(classDefinition);
		Iterator<Operation> it = ops.iterator();
		while (it.hasNext())
		{
			Operation next = it.next();
			// If there is a super operation of the given operation
			if (next.getName().equals(operation.getName()))
			{
				result = checkParameters(operation, next) &&
						 checkTypeParameters(operation, next) &&
						 checkReturnType(operation, next);
			}
		}
		return result;
	}
	
	/**
	 * Constraint: if Operation.isAbstract==true then Operation.body==void
	 * @param operation the operation to check
	 * @return true if operation is abstract and does not have a body, false otherwise
	 */
	public boolean checkOperationIsAbstract()
	{
		// null body is not empty body
		return ((operation.isIsAbstract() && operation.getBody()==null
				)||(operation.isIsAbstract() == false && operation.getBody()!=null));
	}
	
	public boolean checkOperationIsUnique()
	{
		boolean result = true;
		// An operation cannot be defined twice in the same class
		if (builder.getOperationByName(classDefinition, operation.getName()) != null) {
			builder.messages.addMessage(new KMUnitMessage("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definition of operation '"+builder.current_operation.getName()+"'.",operation));
			result = false;
		}
		return result;
	}
	
	/**
	 * Compare the parameter types of op1 and op2, return true if they are identical,
	 * false otherwise 
	 */
	protected boolean checkParameters(Operation op1, Operation op2)
	{
		boolean isConform = true; int ind2 = 0;
		List<Parameter> params1 = op1.getOwnedParameter();
		List<Parameter> params2 = op2.getOwnedParameter();
		// first : do we have the same number of params?
		if (params1.size() != params2.size()) return false;
		else
		{
			Iterator<Parameter> it1 = params1.iterator();
			// The parameters are assumed to be put in the right order
			// We stop as soon as we find a non conform parameter.
			while (it1.hasNext() && isConform==true)
			{
				Parameter next = it1.next();
				isConform = TypeEqualityChecker.equals(next.getType(), params2.get(ind2).getType());
				ind2 += 1;
			}
		}
		return isConform;
	}
	
	protected boolean checkTypeParameters(Operation op1, Operation op2)
	{
		boolean isConform = true; int ind2 = 0;
		List<TypeVariable> params1 = op1.getTypeParameter();
		List<TypeVariable> params2 = op2.getTypeParameter();
		// first : do we have the same number of params?
		if (params1.size() != params2.size()) return false;
		else
		{
			Iterator<TypeVariable> it1 = params1.iterator();
			// The parameters are assumed to be put in the right order
			// We stop as soon as we find a non conform parameter.
			while (it1.hasNext() && isConform==true)
			{
				TypeVariable next = it1.next();
				checkTypeVariables(next, params2.get(ind2));
				ind2 += 1;
			}
		}
		return isConform;
	}
	
	/**
	 * Check if the type variables are declared the same way 
	 * (including : if they have a super type, is it the same?)
	 * (called by checkTypeParameters) 
	 */
	protected boolean checkTypeVariables(TypeVariable tv1, TypeVariable tv2) {
		boolean isConform = false;
		fr.irisa.triskell.kermeta.language.structure.Type t1 = tv1.getSupertype();
		fr.irisa.triskell.kermeta.language.structure.Type t2 = tv2.getSupertype();
		// (null value is not included in equals() operation cases.)
		if (t1!=null && t2!=null) isConform = TypeEqualityChecker.equals(t1, t2);
		else if (t1==null && t2==null) isConform = true;
		else isConform = false;
		return isConform;
	}
	
	/** Just to have a pretty check<blah>*/
	protected boolean checkReturnType(Operation op1, Operation op2)
	{
		return TypeEqualityChecker.equals(op1.getType(),op2.getType());
	}
	
	
}
