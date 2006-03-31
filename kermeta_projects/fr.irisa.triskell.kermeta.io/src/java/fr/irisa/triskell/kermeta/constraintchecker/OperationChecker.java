/* $Id: OperationChecker.java,v 1.2 2006-03-31 17:12:52 zdrey Exp $
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
package fr.irisa.triskell.kermeta.constraintchecker;

import java.util.Iterator;
import java.util.List;

import sun.management.counter.Units;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.TypeConformanceChecker;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * Defaults : some comparison tests need to be done using KM2KMTPrettyPrinter..
 * This is not the most efficient way but there is no other.
 * (but simpler to test the types conformity)
 * We also have to discuss if some constraints are more type-checking related or not
 * Principle : the check stops as soon as a constraint is violated.
 */
public class OperationChecker extends AbstractChecker {

	protected TypeEqualityChecker typeEqualityChecker;
	protected ClassDefinition classDefinition;
	protected Operation operation;
	public static final String OPCONS = "Violated constraint: "; 
 
	
	public OperationChecker(KermetaUnit unit, 
			fr.irisa.triskell.kermeta.language.structure.Object operation, 
			fr.irisa.triskell.kermeta.language.structure.Object context)
	{
		super(unit, operation, context);
		this.classDefinition = (ClassDefinition)context;
		this.operation = (Operation)operation;
		
	}
	
	/**
	 * @param context The context of constraint checking, ClassDefinition for the operation
	 * case. Visitor gives it.
	 * @return
	 */
	public Boolean check()
	{
		boolean result = false;
		if (operation.getName()!=null)
			result =
			checkOperationIsUnique() &&
			checkOperationSignature() &&
			checkOperationIsAbstract();
		else return Boolean.FALSE;
		return new Boolean(result);
	}

	/** 
	 * Constraint: redefinition must be invariant
	 * 
	 * @return true if operation signature is conform to 
	 * super operations if they exist.
	 */
	public boolean checkOperationSignature()
	{
		boolean result = false;
		Object found = null;
		// Get all operations, including the inherited ones
		Operation next = operation.getSuperOperation();
		if (next!=null)
		{
			result = checkParameters(operation, next) &&
			checkTypeParameters(operation, next) &&
			checkReturnType(operation, next);
		}
		return result;
	}
	
	/**
	 * Constraints:
	 *   - if Operation.isAbstract==true then Operation.body==void
	 * @param operation the operation to check
	 * @return true if operation is abstract and does not have a body, false otherwise
	 */
	public boolean checkOperationIsAbstract()
	{
		// null body is not empty body
		boolean result = ((operation.isIsAbstract() && operation.getBody()==null
				)||(operation.isIsAbstract() == false && operation.getBody()!=null));
		if (!result) 
		{
			String e = operation.getName()+ 
				": [ isAbstract : " +  operation.isIsAbstract() + " ]" + 
			    " and [ body : " +  operation.getBody() + " ] are " + " uncompatible.";
			addProblem(ERROR, e, operation);
		}
		return result;
	}
	
	public boolean checkOperationIsUnique()
	{
		boolean result = true;
		int number_of_duplicate = 0;
		List<Operation> ops = builder.getAllOperations(classDefinition);
		for (Operation op : ops) {
			if (op.getName().equals(operation.getName()) && operation.getSuperOperation()==null)
			{
				// if superOperation is null, perhaps it however exists in the implicit inherited Object?
				// ex: Boolean does not inherit explicitely Object.
				if (!KMTHelper.getQualifiedName(op.getOwningClass()).equals("kermeta::reflection::Object"))
					number_of_duplicate += 1;
			}
		}
		// An operation cannot be defined twice in the same class
		if (number_of_duplicate > 1) {
			addProblem(ERROR, "Class '"+classDefinition.getName()+"' " +
					"duplicate definition of operation '"+operation.getName()+"'.",operation);
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
				fr.irisa.triskell.kermeta.language.structure.Type typeA = next.getType(); 
				fr.irisa.triskell.kermeta.language.structure.Type typeB = params2.get(ind2).getType();
				if (typeA instanceof TypeVariable && typeB instanceof TypeVariable) // TypeVariable?
				{
					isConform = checkTypeVariables((TypeVariable)typeA, (TypeVariable)typeB);
				}
				else if (typeA instanceof ClassImpl &&  typeB instanceof ClassImpl)
				{
					// TypeEqualityChecker.equals is not correct, since typeA and typeB are != in memory
					//isConform = (((ClassImpl)typeA).getTypeDefinition().equals(((ClassImpl)typeB).getTypeDefinition()));
					isConform = isConformType((ClassImpl)typeA, (ClassImpl)typeB);
				}
				else
				{
					// Until we know the type politics, conformity will be true.
					isConform = true;
				}
				ind2 += 1;
			}
		}
		
		String message = op1.getName() + " is not well redefined : " + pprinter.ppComaSeparatedNodes(op1.getOwnedParameter())
		+ "(expected [" + pprinter.ppComaSeparatedNodes(op2.getOwnedParameter()) + "]";
		if (isConform==false) addProblem(ERROR, message, op1);
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
		String message = op1.getName() + " has wrong type parameters : " + pprinter.ppComaSeparatedNodes(op1.getTypeParameter());
		if (!isConform) addProblem(ERROR, message, op1);
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
		else isConform = (t1==null && t2==null);
		return isConform;
	}
	
	/**
	 * There are some "defaults" in the metamodel :
	 * Concrete Syntax and Semantic do not exactly map. This is ok, but 
	 * we have to study the particular case of a typed element which type is Void :
	 * is it also "implicitely" Void if, in the model[serialization] it is not set?
	 * */
	protected boolean checkReturnType(Operation op1, Operation op2)
	{
		boolean isConform = true;
		String message = op1.getOwningClass().getName()+"." + op1.getName() + ": ReturnType ";
		Type t1 = op1.getType(); Type t2 = op2.getType();
		if (isVoidType(t1) && isVoidType(t2)) isConform = true;
		// else if (op1.getType()==null && op2.getType()==null)  isConform = true; 
		else if (op1.getType()==null || op2==null || op2.getType()==null) 
		{
			message += " is null";
			isConform = false;
		}
		else if (t1 instanceof TypeVariable && t2 instanceof TypeVariable) // TypeVariable?
			isConform = checkTypeVariables((TypeVariable)op1.getType(), (TypeVariable)op2.getType());
		else if (t1 instanceof ClassImpl && t2 instanceof ClassImpl)
		{
			isConform = isConformType((ClassImpl)t1, (ClassImpl)t2);
		}
		else // FIXME!!! we have to decide which philosophy has to be used for return types !!
		{	// kermeta::standard::~Void != Void ???
			// isConform = TypeEqualityChecker.equals(op1.getType(),op2.getType());
			// isConform = TypeConformanceChecker.conforms(op1.getType(),op2.getType());
			// TypeEqualityChecker.equals is not correct, since typeA and typeB are != in memory
			//isConform = (((ClassImpl)t1).getTypeDefinition().equals(((ClassImpl)t2).getTypeDefinition()));
		}
		if (op1.getType()!=null && op1.getType()!=null)
			message += "<"+pprinter.accept(op1.getType()) + "> != <" + pprinter.accept(op2.getType())+">"
			+ op1.getType() + "!=" + op2.getType() + "op1:" + op1.getName();
		if (!isConform) addProblem(ERROR, message, op1);
		return isConform;
	}
	
	
	/**
	 * This is a dirty patch because "null"/unexisting type is VoidType by default
	 */
	public boolean isVoidType(Type type)
	{
		if (type == null) return true;
		if (type instanceof ClassImpl) 
			 return ((ClassImpl)type).getTypeDefinition().getName().equals("Void");
		if (type instanceof VoidType) return true;
		return false;
	}
	
	public boolean isConformType(ClassImpl superclass, ClassImpl thisclass)
	{
		boolean isConform = thisclass.getTypeDefinition().equals(superclass.getTypeDefinition());
		String classname = KMTHelper.getQualifiedName(thisclass.getTypeDefinition());
		String superclassname = KMTHelper.getQualifiedName(superclass.getTypeDefinition());
		//if (((ClassDefinition)builder.typeDefinitionLookup(classname)).getSuperType() instanceof ClassImpl)
			
		// -> FIXME : I am tired now -- writing constraints in java is not that practical.
		return true;
	}
	
}
