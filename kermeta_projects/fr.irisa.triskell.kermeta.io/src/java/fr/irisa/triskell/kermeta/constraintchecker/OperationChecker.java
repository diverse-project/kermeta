/* $Id: OperationChecker.java,v 1.33 2008-04-28 11:50:11 ftanguy Exp $
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

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.loader.java.Jar2KMPass;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 * Defaults : some comparison tests need to be done using KM2KMTPrettyPrinter..
 * This is not the most efficient way but there is no other.
 * (but simpler to test the types conformity)
 * We also have to discuss if some constraints are more type-checking related or not
 * Principle : the check stops as soon as a constraint is violated.
 * TODO : the operation checking does not handle yet the verification of producttypes. (isn't it the
 * role of the TypeEqualityChecker?)
 */
public class OperationChecker extends AbstractChecker {

	protected TypeEqualityChecker typeEqualityChecker;
	protected ClassDefinition classDefinition;
	protected Operation operation;
	public static final String OPCONS = "Violated constraint: "; 
 
	
	public OperationChecker(KermetaUnit unit, 
			Object operation, 
			Object context)
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
		if (operation.getName()!=null) {
			result = checkOperationIsUnique(operation) &&
				checkReturnType(operation) &&
				checkOperationSignature(operation) &&
				checkOperationIsAbstract(operation);
		}
		else return Boolean.FALSE;
		return new Boolean(result);
	}

	/** 
	 * Constraint: redefinition must be invariant
	 * 
	 * @return true if operation signature is conform to 
	 * super operations if they exist.
	 */
	private boolean checkOperationSignature(Operation operation) {
		if ( operation.getSuperOperation() != null )
			return checkParameters(operation, operation.getSuperOperation()) &&
				checkTypeParameters(operation, operation.getSuperOperation()) &&
				checkReturnType(operation, operation.getSuperOperation());
		return true;
	}
	
	/**
	 * Constraints:
	 *   - if Operation.isAbstract==true then Operation.body==void
	 * @param operation the operation to check
	 * @return true if operation is abstract and does not have a body, false otherwise
	 */
	private boolean checkOperationIsAbstract(Operation operation)
	{
		// null body is not empty body
		boolean result = ((operation.isIsAbstract() && operation.getBody() == null
				)||(operation.isIsAbstract() == false && operation.getBody() != null));
		
		if (!result) {
			KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject( operation );
			if ( ! kermetaUnit.getUri().matches(".+\\.jar") ) {				
				ClassDefinition classDefinition = (ClassDefinition) operation.eContainer();
				String e = "In Class Definition " + classDefinition.getName() + " : " + operation.getName()+ 
					": [ isAbstract : " +  operation.isIsAbstract() + " ]" + 
				    " and [ body : " +  operation.getBody() + " ] are " + " uncompatible.";
				addProblem(ERROR, e, operation);
			}
		}
		return result;
	}
	
	enum ErrorType {
		LOWER_ERROR, UPPER_ERROR, RETURNED_TYPE, NONE
	}
		
	/** 
	 * 
	 * @return
	 */
	private boolean checkOperationIsUnique(Operation operation)
	{
		List <Operation> ops = KermetaModelHelper.ClassDefinition.getAllOperations(classDefinition);
		for (Operation op : ops) {

			if ( op != operation ) { 
			
				if (op.getName().equals(operation.getName()) && operation.getSuperOperation()==null) {
					
					ClassDefinition possibleBaseClass = (ClassDefinition) op.eContainer();
					
					/*
					 * 
					 * Special case when the class definition is an aspect.
					 * 
					 */
					if ( classDefinition.isIsAspect() && (classDefinition != possibleBaseClass) ) {
					
						boolean error = false;
						ErrorType type = ErrorType.NONE;
						// Checking abstract
						boolean isAbstract = (op.isIsAbstract() && operation.isIsAbstract()) ||
									(op.isIsAbstract() && ! operation.isIsAbstract())
								|| 	(! op.isIsAbstract() && operation.isIsAbstract());
								/*||	OperationHelper.isOverloadable(op) && ! operation.isIsAbstract()
								||	OperationHelper.isOverloadable(operation) && ! op.isIsAbstract();*/
						if ( ! isAbstract )
							error = true;
						
						if ( ! error ) {
							// Checking the returned type
							error = ! TypeEqualityChecker.equals(operation.getType(), op.getType());
							if ( error )
								type = ErrorType.RETURNED_TYPE;
							else {
								if ( ! (operation.getUpper() == op.getUpper()) ) {
									error = true;
									type = ErrorType.UPPER_ERROR;
								}
								if ( ! error && operation.getLower() != op.getLower() ) {
									error = true;
									type = ErrorType.LOWER_ERROR;
								}
							}
						}
						// Checking the parameter's type
						if ( ! error )
							error = ! checkParameters(operation, op);
						
						if ( error ) {
							KermetaUnit distantUnit = KermetaUnitHelper.getKermetaUnitFromObject(op);
							String message = "";
							if ( distantUnit != null ) {
								KM2KMTPrettyPrinter printer = new KM2KMTPrettyPrinter();
								message = "Operation " + operation.getName() + " is already implemented in " + distantUnit.getUri() + "\n\n";
								message += printer.ppSimplifiedFOperation(operation) + " does not matched with " + printer.ppSimplifiedFOperation(op);
							} else
								message = "Operation " + operation.getName() + " is already implemented elsewhere.";
							
							if ( type == ErrorType.LOWER_ERROR )
								message += "\nThe lower bound differs.";
							else if ( type == ErrorType.UPPER_ERROR )
								message += "\nThe upper bound differs.";
							else if ( type == ErrorType.RETURNED_TYPE )
								message += "\nThe returned type differs.";
							
							addProblem(ERROR, message, operation);
							return false;
						}
					} else {
						KermetaUnit distantUnit = KermetaUnitHelper.getKermetaUnitFromObject(op);
						String message = "Operation " + operation.getName() + " is already implemented in the superclass " + op.getOwningClass().getName() + " in the file " + distantUnit.getUri() + ".";
						addProblem(ERROR, message, operation);
					}
											
					// if superOperation is null, perhaps it however exists in the implicit inherited Object?
					// ex: Boolean does not inherit explicitely Object.
					/*if ( ! ClassDefinitionHelper.getAllBaseClasses(possibleBaseClass).contains(classDefinition) 
							&& !NamedElementHelper.getQualifiedName(op.getOwningClass()).equals("kermeta::language::structure::Object")) {
						addProblem(ERROR, "Class '"+classDefinition.getName()+"' " +
								"duplicate definition of operation '"+operation.getName()+"'.",operation);
						return false;
					}*/
				} else if (op.getName().equals(operation.getName()) ) {
					boolean error = ! checkParameters(operation, op);
					if ( error ) {
						error = checkParameters(operation, op);
						KermetaUnit distantUnit = KermetaUnitHelper.getKermetaUnitFromObject(op);
						String message = "";
						if ( distantUnit != null ) {
							KM2KMTPrettyPrinter printer = new KM2KMTPrettyPrinter();
							message = "Operation " + operation.getName() + " is already implemented in " + distantUnit.getUri() + "\n\n";
							message += printer.ppSimplifiedFOperation(operation) + " does not matched with " + printer.ppSimplifiedFOperation(op);
						} else
							message = "Operation " + operation.getName() + " is already implemented elsewhere.";
						
						addProblem(ERROR, message, operation);
						return false;
					}
				}
					
			}
		}
		return true;
	}
	
	/**
	 * 
	 * Checking that parameters from op1 are typed the same way in op2.
	 * 
	 * @param op1
	 * @param op2
	 * @return true or false wether an error has been found.
	 */
	/*private boolean checkParameters(Operation op1, Operation op2) {
		boolean error = false;
		Iterator <Parameter> iterator1 = op1.getOwnedParameter().iterator();
		Iterator <Parameter> iterator2 = op2.getOwnedParameter().iterator();
		while ( ! error && iterator1.hasNext() && iterator2.hasNext() ) {
			Parameter parameter1 = iterator1.next();
			Parameter parameter2 = iterator2.next();
			if ( ! (parameter2.getType() instanceof ObjectTypeVariable) ) {
				error = ! TypeEqualityChecker.equals(parameter1.getType(), parameter2.getType());
				// If there is an error, it is maybe because types come from aspect. Let's take one more shot.
				if ( error ) {
				//	TypeEqualityChecker.equals(parameter1.getType(), parameter2.getType());
					if ( parameter1.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class ) {
						
						ClassDefinition cd1 = TypeHelper.getClassDefinition(parameter1.getType());
						ClassDefinition cd2 = TypeHelper.getClassDefinition(parameter2.getType());
						
						if ( ClassDefinitionHelper.getAllBaseClasses(cd1).contains(cd2) )
							error = false;
						
					} else if ( parameter1.getType() instanceof PrimitiveType ) {
						
					}
				}
			}
		}
		return error;
	}*/
	
	private boolean checkReturnType(Operation operation) {
		boolean result = ReturnTypeChecker.typeCheckExpression(operation);
		if ( ! result ){
			if(KermetaModelHelper.Tag.getTag(classDefinition,Jar2KMPass.JARUNIT_TAG_NAME) == null)
				builder.error("In class definition " + NamedElementHelper.getQualifiedName(classDefinition) + ", the result variable has not been correctly set in operation " + operation.getName() + ".", operation);
		}
		return result; 
	}
	
	/**
	 * 
	 * Check if one operation with the same name, same parameters, same returned type and abstract exist in base classes.
	 * 
	 * @param operation
	 * @param classDefinition
	 * @return
	 */
/*	private boolean checkAspectOperation(Operation operation) {
		Set <Operation> ops = ClassDefinitionHelper.getAllOperations(classDefinition);
		for (Operation op : ops) {
			if ( operation != op ) {		
				
				if ( operation.getName().equals(op.getName()) )
					return false;

				ClassDefinition possibleBaseClass = (ClassDefinition) op.eContainer();
				Set<TypeDefinition> baseClasses = ClassDefinitionHelper.getAllBaseClasses(classDefinition);
				if ( baseClasses.contains(possibleBaseClass) ) {
					boolean isAbstract = checkOperationIsAbstract(op);
					
					
					
					return checkOperationIsAbstract(op) && ! checkOperationSignature(operation);
				}
			}
		}
		return false;
	}*/
	
/*	private boolean isOperationAspectOverloadingCorrect(Operation operation, Operation operationToCompare) {

		ClassDefinition possibleBaseClass = (ClassDefinition) operationToCompare.eContainer();
		Set<TypeDefinition> baseClasses = ClassDefinitionHelper.getAllBaseClasses(classDefinition);
		if ( baseClasses.contains(possibleBaseClass) ) {
	
			///if ( checkOperationIsAbstract() )
			
			/*if ( 
					// checking if abstract
					operationToCompare.isIsAbstract() 
					// check the name
					&& operationToCompare.getName().equals(operation.getName()) 
					// Check the returned type
					&& TypeEqualityChecker.equals( operationToCompare.getType(), operation.getType() ) ) {
					
				for ( Parameter currentParameter : (List<Parameter>) operationToCompare.getOwnedParameter() ) {
					Parameter parameter = OperationHelper.getParameter(operation, currentParameter.getName());
					if ( ! TypeEqualityChecker.equals(parameter.getType(), currentParameter.getType()) )
						return false;
				}
					
				return true;
					
			}
			
		}
		return false;
	}*/
	
	/**
	 * Compare the parameter types of op1 and op2, return true if they are identical,
	 * false otherwise 
	 */
	protected boolean checkParameters(Operation op1, Operation op2)
	{
		boolean isConform = true; int ind2 = 0;
		String message = "";
		List<Parameter> params1 = op1.getOwnedParameter();
		List<Parameter> params2 = op2.getOwnedParameter();
		// first : do we have the same number of params?
		if (params1.size() != params2.size()) 
		{
			message = "'"+op1.getName()+"' and '" + op2.getName() + "' do not have the same number of parameters.";  
			isConform = false;
		}
		else
		{
			Iterator<Parameter> it1 = params1.iterator();
			// The parameters are assumed to be put in the right order
			// We stop as soon as we find a non conform parameter.
			while (it1.hasNext() && isConform==true)
			{
				Parameter next = it1.next();
				Type typeA = next.getType(); 
				Type typeB = params2.get(ind2).getType();
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
				else if (typeA instanceof PrimitiveType && typeB instanceof Class ) {
					Type t = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) typeA);
					isConform = isConformType((ClassImpl)t, (ClassImpl)typeB);
				} else if ( typeA instanceof Class && typeB instanceof PrimitiveType) {
					Type t = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) typeB);
					isConform = isConformType((ClassImpl)typeA, (ClassImpl)t);
				} else {
					// Until we know the type politics, conformity will be true.
					isConform = true;
				}
				ind2 += 1;
			}
			message = "'" +op1.getOwningClass().getName()+"."+ op1.getName() + "' is not well redefined : parameters " + pprinter.ppComaSeparatedNodes(op1.getOwnedParameter())
			+ " (expected [" + pprinter.ppComaSeparatedNodes(op2.getOwnedParameter()) + "]";
		}
		if (isConform==false) 
			addProblem(ERROR, message, op1);
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
		String message = op1.getName() + " is not well redefined : type parameters : " + pprinter.ppComaSeparatedNodes(op1.getTypeParameter());
		if (!isConform) 
			addProblem(ERROR, message, op1);
		return isConform;
	}
	
	/**
	 * Check if the type variables are declared the same way 
	 * (including : if they have a super type, is it the same?)
	 * (called by checkTypeParameters) 
	 */
	protected boolean checkTypeVariables(TypeVariable tv1, TypeVariable tv2) {
		boolean isConform = false;
		Type t1 = tv1.getSupertype();
		Type t2 = tv2.getSupertype();
		// (null value is not included in equals() operation cases.)
		if (t1!=null && t2!=null)
			isConform = isConformType(t1, t2);
		else isConform = (t1==null && t2==null);
		return isConform;
	}
	
	/**
	 * There are some "defaults" in the metamodel :
	 * Concrete Syntax and Semantic do not exactly map : the implicit type is Void
	 * if the user omits it syntactically, but in the serialized model, when not explicit, in
	 * the text (kmt), this type is not provided either.
	 * 
	 * -> a Rule : the return type of a redefined operation can be 
	 * 
	 *      A <|-- B and op() : X is contained in A, and B redefined op(), so that
	 *      op() : Y  
	 * 
	 * */
	protected boolean checkReturnType(Operation op1, Operation op2)
	{
		boolean isConform = true;
		String message = op1.getOwningClass().getName()+"." + op1.getName() + ": The return type ";
		Type t1 = op1.getType(); Type t2 = op2.getType();
		if (isVoidType(t1) && isVoidType(t2)) isConform = true;
		// See version 1.21, this piece of code has been added for overloading operations.
		// There is no overloading anymore, we just disable this code for the moment.
		/*else if ((isVoidType(t1) && !isVoidType(t2)) || (!isVoidType(t1) && isVoidType(t2))){
			// as kermeta is invariant, the return type mus be the same even if one of them is Void (which is usually conform to everything)
			message += " uses incompatible return types ";
			isConform = false;
		}*/
		// else if (op1.getType()==null && op2.getType()==null)  isConform = true; 
		else if (op1.getType()==null || op2==null || op2.getType()==null) 
		{
			if (op1.getType()==null) message+="of " + NamedElementHelper.getQualifiedName(op1);
			else message+="of " + NamedElementHelper.getQualifiedName(op2);
			message += " is null : " + new KM2KMTPrettyPrinter().accept(op1.getType()==null?op2:op1);
			isConform = false;
		}
		else if (t1 instanceof TypeVariable && t2 instanceof TypeVariable) {// TypeVariable?
			isConform = checkTypeVariables((TypeVariable)op1.getType(), (TypeVariable)op2.getType());
			if(!isConform) message += " uses incompatible typeVariables ";
		} else if ( ! (t1 instanceof TypeVariable) && ! (t2 instanceof TypeVariable) ){
			
			if ( op1.getType() instanceof PrimitiveType )
				t1 = (Class) KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) op1.getType() );
			
			if ( op2.getType() instanceof PrimitiveType )
				t2 = (Class) KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) op2.getType() );
			
			isConform = isConformType(t1, t2);
			if ( ! isConform )
				message += " is not the same than in " + op2.getOwningClass().getName() + "." + op2.getName() + ".";
			
		}
			
		if (!isConform) 
			builder.error(message, op1);
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
	
	public boolean isConformType(Type supertype, Type thistype)
	{
		// commented call does not work since the typedefs may be not registered in the same place in memory........hem
		// boolean isConform = thisclass.getTypeDefinition().equals(superclass.getTypeDefinition());
		if (supertype instanceof ClassImpl && thistype instanceof ClassImpl)
		{
			ClassImpl superclass = (ClassImpl)supertype; ClassImpl thisclass = (ClassImpl)thistype;
			String classname = NamedElementHelper.getQualifiedName(thisclass.getTypeDefinition());
			String superclassname = NamedElementHelper.getQualifiedName(superclass.getTypeDefinition());
			return superclassname.equals(classname);
		}
		return TypeEqualityChecker.equals(supertype, thistype);
	}
}
