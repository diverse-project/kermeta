/* $Id: Jar2KMPass3.java,v 1.4 2006-08-09 13:44:38 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.io
 * File : Jar2KMPass3.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 avr. 2006
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.loader.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;


import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 *  Jar2KM PASS 4 : 
 *  build the superOp link, + build the operations table, that allow to retreive all operations for a given signature in a class, its super or children classes 
 *  TODO : build the opposites association
 *  TODO : look for derived property (ie. set get methods
 * 
 * Except :
 * For ops : body / abstract / superOp
 * For props : opposites / accessors
 */
public class Jar2KMPass3 extends Jar2KMPass {

	public Jar2KMPass3(JarUnit builder) {
		super(builder);
	}

	/** list of all the operations created during this phase. This is used by the fix to quickly navigate throught them */
	private Vector<Operation> allOperations = new Vector<Operation>();
	
	/** This Hashtable is used to retreive implementations of a given operation 
	 * This list only the direct implementations
	 */
	private Hashtable<Operation,Vector<Operation>> operationsChildren =  new Hashtable<Operation,Vector<Operation>>();
	
	@Override
	public void process() {
		if (builder.cl==null) return;	// load has failed : do nothing
    	Enumeration<String> typeQualifiedNames = builder.typeDefs.keys();
    	while(typeQualifiedNames.hasMoreElements()){
    		String typeQualifiedName = typeQualifiedNames.nextElement();
    		String javaQualifiedName = typeQualifiedName.replaceAll("::",".");
    		ClassDefinition currentClassDef = (ClassDefinition)builder.typeDefs.get(typeQualifiedName);
    		try {
				Class currentClass = builder.cl.loadClass(javaQualifiedName);
				currentClassDef.setIsAbstract(Modifier.isAbstract(currentClass.getModifiers()));
				processInheritance(currentClassDef, currentClass);
				processAttributes(currentClassDef, currentClass);
				processOperations(currentClassDef, currentClass);
				processConstructors(currentClassDef, currentClass);
			} catch (ClassNotFoundException e) {
				internalLog.error("ClassNotFound in jar "+builder.platformURI.toFileString() +" looking for "+javaQualifiedName ,e);
				
			}    		
    	}
    	// TODO for each of the operations try to fix its name so they becomes uniques according to Kermeta constraints
    	try {
			fixOperations();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	/**
	 * This method processes the operations according to Kermeta constraints
	 * @throws Exception 
	 *
	 */
	private void fixOperations() throws Exception {
		// for each of the operations, 
		Iterator<Operation> it = this.allOperations.iterator();
		while(it.hasNext()){
			Operation op = it.next();
			Operation superOp = findSuperOperation(op, null);
			if(superOp != null){
				// set the superOperation if applicable
				op.setSuperOperation(superOp);
				// build the childrenHashtable
				Vector<Operation> children = operationsChildren.get(superOp);
				if(children == null) {
					children = new Vector<Operation>();
					operationsChildren.put(superOp,children);
				}
				children.add(op);
			}
		}
		//	for each of the operations
		it = this.allOperations.iterator();
		while(it.hasNext()){
			// apply renaming rules if needed
			Operation op = it.next();
			if (op.getOwnedParameter().size() > 0){
				// only operations with parameter are renamed 
				// look for operations with the same name but with a different 
				// signature in the inheritance tree
				Vector<Operation> conflictingOperations = findConflictingOperations(op, null);
				if(conflictingOperations.size()!=0){
					// for each of the operations in conflict: rename them (and their whole implementation tree)
					// except the operation without parameter
					Integer i = 1;
					renameOperationTree(op, "_"+(i++).toString());
					Iterator<Operation> conlictingOpIt = conflictingOperations.iterator();
					while(conlictingOpIt.hasNext()){
						Operation conflictingOp = conlictingOpIt.next();
						if(conflictingOp.getOwnedParameter().size()>0){
							renameOperationTree(conflictingOp, "_"+(i++).toString());
						}
					}
				}
			}

			// In kermeta the return type must be invariant too
			// reuse the top level return type for every methods
			fixReturnTypeOnChildren(this.getTopOperation(op),this.getTopOperation(op).getType());
		}
	}

	/** recursively change the return type on this operation and all its methods
	 * 
	 * @param operation
	 * @param type
	 */
	private void fixReturnTypeOnChildren(Operation operation, Type type) {
		operation.setType(type);
		Vector<Operation> ops = this.operationsChildren.get(operation);
		if(ops == null) return;
		Iterator<Operation> childrenIt = ops.iterator();
		while(childrenIt.hasNext()){
			fixReturnTypeOnChildren(childrenIt.next(), type);
		}
	}


	/** 
	 * Calculate the list of other operation that conflicts with this one.
	 * This look into the current ClassDefiniton put also in the parents
	 * The returned list only return the topMost operation of each of the confliction operation
	 * if the searched ClassDefinition is not set, it looks into the owner ClassDefinition of this Operation
	 * @param operation
	 * @param default class definition
	 * @return
	 * @throws Exception 
	 */
	private Vector<Operation> findConflictingOperations(Operation op, ClassDefinition cd) throws Exception {
		if (cd == null) cd = op.getOwningClass();
		Operation topOperation = this.getTopOperation(op);
		Vector<Operation> result = new Vector<Operation>();
		Iterator<Operation> itOp = cd.getOwnedOperation().iterator();
		while(itOp.hasNext()){
			Operation testedOp = getTopOperation(itOp.next());
			if(testedOp != topOperation && testedOp.getName().equals(topOperation.getName())) {
				if (!result.contains(testedOp)) result.add(testedOp);
			}
		}
		Iterator<fr.irisa.triskell.kermeta.language.structure.Class> superClassesIt = cd.getSuperType().iterator();
		while(superClassesIt.hasNext()){
			ClassDefinition superClassDef = (ClassDefinition)superClassesIt.next().getTypeDefinition();
			result.addAll(findConflictingOperations(topOperation, superClassDef));
		}
		return result;
	}

	/**
	 * rename the operation and its whole implementation tree
	 * if the post fix is not null then it is used, otherwise it use the Type name as the postfix
	 * @param op
	 * @throws Exception 
	 */
	private void renameOperationTree(Operation op, String postfix) throws Exception {
		// find the topmost operation, 
		Operation topOperation = getTopOperation(op);
		// then rename it and all its implementation methods
		StringBuffer newName;
		if(postfix == null){
			newName = new StringBuffer(topOperation.getName());
			Iterator<Parameter> itParams = topOperation.getOwnedParameter().iterator();
			while(itParams.hasNext()){
				Type t = itParams.next().getType();
				String typename = "ErrorGettingTypeName";
				if (t instanceof fr.irisa.triskell.kermeta.language.structure.Class){
					fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)t;
					typename = c.getTypeDefinition().getName();
				}
				else if (t instanceof PrimitiveType){
					typename = ((PrimitiveType)t).getName();
				}
				newName.append("_");			
				newName.append(typename);
			}
		}
		else newName = new StringBuffer(topOperation.getName()+postfix);
		renameOperationAndChildren(topOperation, newName.toString());
	}

	private Operation getTopOperation(Operation op) throws Exception {
		Operation topOperation = op;
		while(topOperation.getSuperOperation() != null ) {
			if(topOperation.getSuperOperation() == op) 
				throw new Exception("runtime error : loop in the superOperation of "+op.getOwningClass().getName()+"."+op.getName());
			topOperation = topOperation.getSuperOperation();
		}
		return topOperation;
	}

	/** 
	 * recursivly rename this operation and its children
	 * @param operation
	 * @param newName
	 */
	private void renameOperationAndChildren(Operation operation, String newName) {
		operation.setName(newName);
		Vector<Operation> ops = this.operationsChildren.get(operation);
		if(ops == null) return;
		Iterator<Operation> childrenIt = ops.iterator();
		while(childrenIt.hasNext()){
			renameOperationAndChildren(childrenIt.next(), newName);
		}
	}

	/**
	 * retrieves an operation in the hierarchy tree with a signature that is compatible with this  operation
	 * start to look in this ClassDef if defined. If not defined, look into the operation owner parents.
	 * @param op
	 * @param cd
	 * @return the parent operation
	 */
	private Operation findSuperOperation(Operation op, ClassDefinition cd) {
		boolean found = false;
		Operation result = null;
		if(cd != null){ 		
			Iterator<Operation> it = cd.getOwnedOperation().iterator();
			while(it.hasNext() && !found){
				Operation newOp = it.next();
				if(newOp != op && op.getName().equals(newOp.getName())){
					 // check that they have the same parameter signature
					boolean allParamsAreTheSame = true;
					if(op.getOwnedParameter().size() == newOp.getOwnedParameter().size()){
						Iterator<Parameter> itParam1 = op.getOwnedParameter().iterator();
						Iterator<Parameter> itParam2 = newOp.getOwnedParameter().iterator();
						while(itParam1.hasNext()){
							Type t1 = itParam1.next().getType();
							Type t2 = itParam2.next().getType();
							if(!TypeEqualityChecker.equals(t1,t2)) allParamsAreTheSame= false;
							// TODO check the special case of UnknownJavaClass
						}
					} else allParamsAreTheSame= false;
					if ( allParamsAreTheSame){
						found = true;
						result = newOp;
					}
				}
			}
		}
		else cd = op.getOwningClass();
		if(! found){
			// try in the parents
			Iterator<fr.irisa.triskell.kermeta.language.structure.Class> superClassesIt = cd.getSuperType().iterator();
			while(superClassesIt.hasNext()){
				result = findSuperOperation(op, (ClassDefinition)superClassesIt.next().getTypeDefinition());
			}
		}
		return result;
	}

	public void processInheritance(ClassDefinition classDef, Class c){
		Class theSuperClass = c.getSuperclass();
		if (theSuperClass != null){
			internalLog.debug(c.getCanonicalName()+ " inherits from " + theSuperClass.getCanonicalName());
			//TypeDefinition parentTypeDef = builder.typeDefs.get(getQualifiedName(theSuperClass));
			TypeDefinition parentTypeDef = builder.getTypeDefinitionByName(getQualifiedName(theSuperClass));
		    if(parentTypeDef != null){ // ignore inheritance of object outside of the scope of this jar or dependencies
				Type parentType = getTypeByID(getQualifiedName(theSuperClass));
				internalLog.debug("so "+classDef.getName()+ " inherits from " + parentTypeDef.getName());				
				classDef.getSuperType().add(parentType);
			}
		}
	}
	
	/**
	 * process the fields of the given class in order to create the kermeta properties
	 * @param classDef
	 * @param c
	 */
	public void processAttributes(ClassDefinition classDef, Class c){
		Field[] fields = c.getDeclaredFields();
		for (int i = 0 ; i < fields.length; i++){
			// create it only if public
			if(Modifier.isPublic(fields[i].getModifiers())){
				//	Create the Property:
				Property res = builder.struct_factory.createProperty();
				// name :
				res.setName(fields[i].getName());
				// default : (no default for a reference)
				// TODO
				res.setDefault(null);
				// isComposite : 
				// TODO
				res.setIsComposite(false);
				
				// isDerived : (field cannot be derived, only java op can generate derived property
				res.setIsDerived(false);
				// isID :
				res.setIsID(false);
				// isReadOnly :
				res.setIsReadOnly(false);
				
				java.lang.reflect.Type t = fields[i].getGenericType();
				if(t instanceof Class){
					Class theType = (Class)t;
					if(theType.isArray()){
						res.setIsOrdered(true);
						res.setIsUnique(false);
						res.setUpper(-1);
						res.setLower(0);
						// type : 
						String typeName = getQualifiedName(theType);
						typeName = typeName.substring(0, typeName.length()-2); // removes the trailing []
						res.setType(getTypeByID(typeName));
					}
					else{
						res.setIsOrdered(false);
						res.setIsUnique(false);
						res.setUpper(1);
						res.setLower(0);
						// type : (A datatype)
						res.setType(getTypeByID(getQualifiedName(theType)));
					}
				}
				// opposite :
				// Don't know if it is possible to know if there is an opposite ...
				
				// owningClass :
				classDef.getOwnedAttribute().add(res);
			}
		}
	}


	public void processConstructors(ClassDefinition classDef, Class c) {
		Constructor[] constructors = c.getConstructors();
		for (int i = 0 ; i < constructors.length; i++){
			// create it only if public
			if(Modifier.isPublic(constructors[i].getModifiers())){
				// Create the operation:
				builder.current_operation = builder.struct_factory.createOperation();
				//				 Name
				// duplicate operation name treatment will be done during next pass 
				builder.current_operation.setName("initialize");
			
				//	 return type : the type of the class itself in order to ease the writing
				builder.current_operation.setIsOrdered(false);
				builder.current_operation.setIsUnique(false);
				builder.current_operation.setUpper(1);
				builder.current_operation.setLower(0);
				builder.current_operation.setType(getTypeByID(getQualifiedName(c)));
				
				// owningClass :
				classDef.getOwnedOperation().add(builder.current_operation);
				allOperations.add(builder.current_operation);
				
				// intialize the body to a dummy expression, the interpreter must know how to deal with this kind of Java object
				builder.current_operation.setBody(ExpressionParser.parse(builder, "        raise kermeta::exceptions::NotImplementedException.new"));
				
//				 ownedParameter added while visiting  containement
				java.lang.reflect.Type[] paramTypes = constructors[i].getGenericParameterTypes();
				for (int j = 0 ; j < paramTypes.length; j++){
					//	Create the parameter :
					Parameter res = builder.struct_factory.createParameter();
					// Name
					res.setName("param"+(j+1));
					//	return type : try to see if it is a collection
					if(paramTypes[j] instanceof Class){
						Class paramClassType = (Class)paramTypes[j];
						setMultiplicityFromClass(res, paramClassType);
					}
					else if(paramTypes[j] instanceof ParameterizedType){
						ParameterizedType pt = (ParameterizedType)paramTypes[j];
						Class rawType = (Class)pt.getRawType();
						setMultiplicityFromClass(res, rawType);
						java.lang.reflect.Type[] typeArguments =pt.getActualTypeArguments();
						for( int k = 0; k <typeArguments.length; k++ ){
						//	res.getContainedType().add();
							// TODO deal with typeargument
						}
					}
					else{
						// TODO must deal with GenericArrayType, TypeVariable<D>, WildcardType
						assert(false);
					}
					// Operation:
					builder.current_operation.getOwnedParameter().add(res);
				}
			}
		}
	}


	/** deal with array type so it creates the correct multiplicity
	 * 
	 * @param param
	 * @param paramClassType
	 */
	private void setMultiplicityFromClass(Parameter param, Class paramClassType) {
		if(paramClassType.isArray()){
		//builder.storeTrace(res, node);
			// isOrdered :
			param.setIsOrdered(true);
			// isUnique :
			param.setIsUnique(false);
			// upper :
			param.setUpper(-1);
			// lower :
			param.setLower(0);
			// type :
			String typeName = getQualifiedName(paramClassType);
			typeName = typeName.substring(0, typeName.length()-2); //
			param.setType(getTypeByID(typeName));
		}
		else{
			// isOrdered :
			param.setIsOrdered(false);
			// isUnique :
			param.setIsUnique(false);
			// upper :
			param.setUpper(1);
			// lower :
			param.setLower(0);
			// type :
			param.setType(getTypeByID(getQualifiedName(paramClassType)));
		}
	}
	
	
	
	public void processOperations(ClassDefinition classDef, Class c){
		Method[] methods = c.getDeclaredMethods();
		for (int i = 0 ; i < methods.length; i++){
			// create it only if public
			if(Modifier.isPublic(methods[i].getModifiers())){
				//	Create the operation:
				builder.current_operation = builder.struct_factory.createOperation();
				//builder.storeTrace(builder.current_operation, node);
				
				// Name
				// duplicate operation name treatment will be done during next pass 
				builder.current_operation.setName(methods[i].getName());
				
				// return type : try to see if it is a collection
				java.lang.reflect.Type t = methods[i].getGenericReturnType();
				if(t instanceof Class){
					Class returnType = (Class)t;
					if(returnType.isArray()){
						builder.current_operation.setIsOrdered(true);
						builder.current_operation.setIsUnique(false);
						builder.current_operation.setUpper(-1);
						builder.current_operation.setLower(0);
					
						// type :		
						String typeName = getQualifiedName(returnType);
						typeName = typeName.substring(0, typeName.length()-2); // removes the trailing []
						builder.current_operation.setType(getTypeByID(typeName));
					}
					else{
						builder.current_operation.setIsOrdered(false);
						builder.current_operation.setIsUnique(false);
						builder.current_operation.setUpper(1);
						builder.current_operation.setLower(0);
					
						// type :				
						builder.current_operation.setType(getTypeByID(getQualifiedName(returnType)));
					}
				}
				else{
					//TODO must deal with GenericArrayType, ParameterizedType, TypeVariable<D>, WildcardType
				}
				if(Modifier.isAbstract(methods[i].getModifiers())){
					builder.current_operation.setIsAbstract(true);
				}
				else {
					builder.current_operation.setIsAbstract(false);
					// not abstract but no behavior in kermeta, fill it with a dummy body
					// that raises a NotImplemented exception
					builder.current_operation.setBody(ExpressionParser.parse(builder, "        raise kermeta::exceptions::NotImplementedException.new"));
				}
					
				// Exceptions
				/*if (node.getExceptions() != null) {
					ASTNode[] exceptions = node.getExceptions().getChildren();
					for(int i=0; i<exceptions.length; i++) {
						if (exceptions[i] instanceof QualifiedID) {
							builder.current_operation.getRaisedException().add(getFTypeByID((QualifiedID)exceptions[i]));
						}
					}
				}*/
				// owningClass :
				classDef.getOwnedOperation().add(builder.current_operation);
				allOperations.add(builder.current_operation);
				// ownedParameter added while visiting  containement
				java.lang.reflect.Type[] paramTypes = methods[i].getGenericParameterTypes();
				for (int j = 0 ; j < paramTypes.length; j++){
					//	Create the parameter :
					Parameter res = builder.struct_factory.createParameter();
					// Name
					res.setName("param"+(j+1));
					//	return type : try to see if it is a collection
					if(paramTypes[j] instanceof Class){
						Class paramClassType = (Class)paramTypes[j];
						setMultiplicityFromClass(res, paramClassType);
					}
					else if(paramTypes[j] instanceof ParameterizedType){
						ParameterizedType pt = (ParameterizedType)paramTypes[j];
						Class rawType = (Class)pt.getRawType();
						setMultiplicityFromClass(res, rawType);
						java.lang.reflect.Type[] typeArguments =pt.getActualTypeArguments();
						for( int k = 0; k <typeArguments.length; k++ ){
						//	res.getContainedType().add();
							// TODO deal with typeargument
						}
					}
					else{
						// TODO must deal with GenericArrayType, TypeVariable<D>, WildcardType
						assert(false);
					}
					// Operation:
					builder.current_operation.getOwnedParameter().add(res);
				}
			}
		}
	}
}
