/* $Id: Jar2KMPass3.java,v 1.18 2008-04-28 11:50:15 ftanguy Exp $
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
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
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

	private ClassLoader classLoader;
	
	private JarCache jarCache;
	
	private LoadingContext context = new LoadingContext();
	
	public Jar2KMPass3(KermetaUnit builder, ClassLoader classLoader, JarCache jarCache) {
		super(builder);
		this.classLoader = classLoader;
		this.jarCache = jarCache;
	}

	/** list of all the operations created during this phase. This is used by the fix to quickly navigate throught them */
	private Vector<Operation> allOperations = new Vector<Operation>();
	
	/** This Hashtable is used to retreive implementations of a given operation 
	 * This list only the direct implementations
	 */
	private Hashtable<Operation,Vector<Operation>> operationsChildren =  new Hashtable<Operation,Vector<Operation>>();
	
	@Override
	public void process() {
		if ( classLoader == null ) 
			return;	// load has failed : do nothing
		Set <TypeDefinition> typeDefinitions = KermetaUnitHelper.getInternalTypeDefinitions(builder);
    	processedJavaClasses = 0;
    	int nbJavaClassesToProcess = typeDefinitions.size();
    	int stoponcount = 300;
    	/*try {
			System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
    	for ( TypeDefinition typeDefinition : typeDefinitions ) {
    		String typeQualifiedName = NamedElementHelper.getQualifiedName(typeDefinition);
    		String javaQualifiedName = typeQualifiedName.replaceAll("::",".");
    		TypeDefinition currentTypeDefinition = builder.getTypeDefinitionByQualifiedName(typeQualifiedName);
    		if ( currentTypeDefinition instanceof ClassDefinition ) {
	    		ClassDefinition currentClassDef = (ClassDefinition) currentTypeDefinition;
    			try {
					Class currentClass = classLoader.loadClass(javaQualifiedName);
					currentClassDef.setIsAbstract(Modifier.isAbstract(currentClass.getModifiers()));
					processInheritance(currentClassDef, currentClass);
					processAttributes(currentClassDef, currentClass);
					processOperations(currentClassDef, currentClass);
					processConstructors(currentClassDef, currentClass);
					internalLog.debug("processed java classes : " + processedJavaClasses++ +"/"+nbJavaClassesToProcess);
					if(processedJavaClasses%200 == 0) System.gc();
				/*	try {
						if(processedJavaClasses>stoponcount)	{
							System.in.read(); 
							stoponcount+=50;
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
				} catch (ClassNotFoundException e) {
					internalLog.error("ClassNotFound in jar "+builder.getUri() +" looking for "+javaQualifiedName ,e);
					
				}    		
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
				HashSet<Operation> conflictingOperations = findConflictingOperations(op, null);
				if(conflictingOperations.size()!=0){
					// for each of the operations in conflict: rename them (and their whole implementation tree)
					// except the operation without parameter
					Integer i = 1;					
					renameOperationTree(op, calculateOperationPostFix(op, i++));
					Iterator<Operation> conlictingOpIt = conflictingOperations.iterator();
					while(conlictingOpIt.hasNext()){
						Operation conflictingOp = conlictingOpIt.next();
						if(conflictingOp.getOwnedParameter().size()>0){
							if(conflictingOp.getName().contains("_")){
								internalLog.debug("strange renaming an operation allready containing _ ; will rename " + conflictingOp.getOwningClass().getName() + "."  + conflictingOp.getName());

								HashSet<Operation> conflictingOperations_bis = findConflictingOperations(op, null);
							}
							renameOperationTree(conflictingOp, calculateOperationPostFix(conflictingOp, i++));
						}
					}
				}
			}

			// In kermeta the return type must be invariant too
			// reuse the top level return type for every methods
			fixReturnTypeOnChildren(this.getTopOperation(op),this.getTopOperation(op).getType());
		}
	}

	/**
	 * determine the strategy for the postfix of the given operation
	 * can be a simple number increment in case of many multiple parameter, or simplyt the name of the type of the parameter
	 * @param op
	 * @param integer
	 * @return
	 */
	private String calculateOperationPostFix(Operation op, Integer integer) {
		StringBuffer result = new StringBuffer("_");
		if(op.getOwnedParameter().size() > 2){
			// default strategy use a number because there are too much parameters ...
			result.append((integer).toString());
		}
		else {
			// try to use parameter type names
			Iterator it = op.getOwnedParameter().iterator();
			while(it.hasNext()){
				Parameter parameter = (Parameter)it.next();
				Type pt = parameter.getType();
				
				String paramTName =TypeHelper.getName(pt);
				if(parameter.getUpper()!=1) 
					paramTName+="s"; // this is a collection, add a "s" to the end of the typename
				if(paramTName.equals("UnknownJavaObject")){
					// retreive the original name
					if (pt instanceof fr.irisa.triskell.kermeta.language.structure.Class)
					{
						ClassImpl fClass = (ClassImpl)pt;
						paramTName = getUnderlyingJavaTypeName(fClass);
						
						result.append(paramTName.substring(paramTName.lastIndexOf(":")+1));
					}
					else {
						// not possible to use param type name
						// reset post fix to number
						result = new StringBuffer("_").append((integer).toString());
						break; // forget about other params if any
					}
				}
				else result.append(paramTName);
			}
		}
		return result.toString();
	}

	private String getUnderlyingJavaTypeName(fr.irisa.triskell.kermeta.language.structure.Class p) {
		Iterator<Tag> it = p.getTag().iterator();
		while(it.hasNext()){
			Tag tag = it.next();
			if (tag.getName().equals(Jar2KMPass.IS_PROXY_FOR_JAVA_TYPE)) 
				return tag.getValue();
		}
		return "";
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
	private HashSet<Operation> findConflictingOperations(Operation op, ClassDefinition cd) throws Exception {
		if (cd == null) cd = op.getOwningClass();
		Operation topOperation = this.getTopOperation(op);
		HashSet<Operation> result = new HashSet<Operation>();
		Iterator<Operation> itOp = cd.getOwnedOperation().iterator();
		while(itOp.hasNext()){
			Operation testedOp = getTopOperation(itOp.next());
			if(testedOp != topOperation && testedOp.getName().equals(topOperation.getName())) {
				if (!result.contains(testedOp)) result.add(testedOp);
			}
		}
		Iterator<fr.irisa.triskell.kermeta.language.structure.Type> superClassesIt = cd.getSuperType().iterator();
		while(superClassesIt.hasNext()){
			Type superType = (Type)(superClassesIt.next());
			superType = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) superType);

			if(superType instanceof fr.irisa.triskell.kermeta.language.structure.Class){
				TypeDefinition superTypeDef = ((fr.irisa.triskell.kermeta.language.structure.Class)superType).getTypeDefinition();
				if(superTypeDef instanceof ClassDefinition)
					result.addAll(findConflictingOperations(topOperation, (ClassDefinition)superTypeDef));
				else{
					internalLog.debug("don't know what to do with unsupported TypeDefinition " + superTypeDef.getName());
				}
			}
			else{
				internalLog.debug("don't know what to do with unsupported Type " + superType);
			}
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
							Parameter param1 = itParam1.next();
							Parameter param2 =itParam2.next();
							Type t1 = param1.getType();
							Type t2 = param2.getType();
							if(!(t1 == null && t2 == null)){
								if(!TypeEqualityChecker.equals(t1,t2)) 
									allParamsAreTheSame= false;
							}
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
			
			Object cdef;
			Iterator<fr.irisa.triskell.kermeta.language.structure.Type> superClassesIt = cd.getSuperType().iterator();
			while(superClassesIt.hasNext()){
				fr.irisa.triskell.kermeta.language.structure.Type type = superClassesIt.next();
				if(type instanceof fr.irisa.triskell.kermeta.language.structure.Class){
					// ignore primitive types
					cdef = ((fr.irisa.triskell.kermeta.language.structure.Class)type).getTypeDefinition();
					result = findSuperOperation(op, (ClassDefinition)cdef);
				}
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
		// if in the end there is no inheritance add the one to kermeta::standard::Object
		// (either because it inherits from nothing or because it may inherit from a definition not imported due to the filters
		if (classDef.getSuperType().size() == 0) {
			// automatically add inheritance of Object
			internalLog.debug(c.getCanonicalName()+ " inherits from kermeta::language::structure::Object");
			Type parentType = getTypeByID("kermeta::language::structure::Object");
			classDef.getSuperType().add(parentType);
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
				Property res = StructureFactory.eINSTANCE.createProperty();
				
				jarCache.putField(res, fields[i],i);
				
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
				context.current_operation = StructureFactory.eINSTANCE.createOperation();
				//				 Name
				// duplicate operation name treatment will be done during next pass 
				context.current_operation.setName("initialize");
				
				jarCache.putConstructor(context.current_operation, constructors[i],i);
			
				//	 return type : the type of the class itself in order to ease the writing
				context.current_operation.setIsOrdered(false);
				context.current_operation.setIsUnique(false);
				context.current_operation.setUpper(1);
				context.current_operation.setLower(0);
				context.current_operation.setType(getTypeByID(getQualifiedName(c)));
				
				// owningClass :
				classDef.getOwnedOperation().add(context.current_operation);
				allOperations.add(context.current_operation);
				
				// intialize the body to a dummy expression, the interpreter must know how to deal with this kind of Java object
				// DVK builder.current_operation.setBody(ExpressionParser.parse(builder, "        raise kermeta::exceptions::NotImplementedException.new"));				
				
//				 ownedParameter added while visiting  containement
				java.lang.reflect.Type[] paramTypes = constructors[i].getGenericParameterTypes();
				for (int j = 0 ; j < paramTypes.length; j++){
					//	Create the parameter :
					Parameter res = StructureFactory.eINSTANCE.createParameter();
					// Name
					res.setName("param"+(j+1));
					//	return type : try to see if it is a collection
					if(paramTypes[j] instanceof Class){
						Class paramClassType = (Class)paramTypes[j];
						setTypeFromClass(res, paramClassType);
					}
					else if(paramTypes[j] instanceof ParameterizedType){
						ParameterizedType pt = (ParameterizedType)paramTypes[j];
						Class rawType = (Class)pt.getRawType();
						setTypeFromClass(res, rawType);
						java.lang.reflect.Type[] typeArguments =pt.getActualTypeArguments();
						for( int k = 0; k <typeArguments.length; k++ ){
						//	res.getContainedType().add();
							// TODO deal with typeargument
						}
					}
					else if(paramTypes[j] instanceof GenericArrayType){					
						//internalLog.debug("must deal with GenericArrayType");
						GenericArrayType returnType = (GenericArrayType)paramTypes[j];
						res.setIsOrdered(true);
						res.setIsUnique(false);
						res.setUpper(-1);
						res.setLower(0);
						// type :		
						String typeName = getQualifiedName(returnType.getGenericComponentType());
						// TODO deal with TypeVariable
						res.setType(getTypeByID(typeName));
					}
					else{
						// TODO must deal with GenericArrayType, TypeVariable<D>, WildcardType
						assert(false);
					}
					// Operation:
					context.current_operation.getOwnedParameter().add(res);
				}
				//	this is a constructor add a tag so the interpreter can recognize it and work with it
				Tag t = KermetaModelHelper.Tag.create(INITOPERATION_TAG_NAME, c.getName());
				context.current_operation.getOwnedTags().add(t);
				
				t = KermetaModelHelper.Tag.create(JAVAOPERATION_TAG_NAME, c.getName());
				context.current_operation.getOwnedTags().add(t);
			}
		}
	}


	/** deal with array type so it creates the correct multiplicity
	 * 
	 * @param param
	 * @param paramClassType
	 */
	private void setTypeFromClass(Parameter param, Class paramClassType) {
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
			// create it only if public and not synthetic (ie. introduced by the compiler
			if(Modifier.isPublic(methods[i].getModifiers()) && !methods[i].isSynthetic()){
				//	Create the operation:
				context.current_operation = StructureFactory.eINSTANCE.createOperation();
				//builder.storeTrace(builder.current_operation, node);
				
				jarCache.putMethod(context.current_operation, methods[i],i);
				
				// Name
				// duplicate operation name treatment will be done during next pass 
				context.current_operation.setName(methods[i].getName());
				
				// return type : try to see if it is a collection
				java.lang.reflect.Type t = methods[i].getGenericReturnType();
				if(t instanceof Class){
					Class returnType = (Class)t;
					if(returnType.isArray()){
						context.current_operation.setIsOrdered(true);
						context.current_operation.setIsUnique(false);
						context.current_operation.setUpper(-1);
						context.current_operation.setLower(0);
					
						// type :		
						String typeName = getQualifiedName(returnType);
						typeName = typeName.substring(0, typeName.length()-2); // removes the trailing []
						context.current_operation.setType(getTypeByID(typeName));
					}
					else{
						context.current_operation.setIsOrdered(false);
						context.current_operation.setIsUnique(false);
						context.current_operation.setUpper(1);
						context.current_operation.setLower(0);
					
						// type :				
						context.current_operation.setType(getTypeByID(getQualifiedName(returnType)));
					}
				}
				else if(t instanceof GenericArrayType){					
					//internalLog.debug("must deal with GenericArrayType");
					GenericArrayType returnType = (GenericArrayType)t;
					context.current_operation.setIsOrdered(true);
					context.current_operation.setIsUnique(false);
					context.current_operation.setUpper(-1);
					context.current_operation.setLower(0);
					// type :		
					String typeName = getQualifiedName(returnType.getGenericComponentType());
					// TODO deal with TypeVariable
					context.current_operation.setType(getTypeByID(typeName));
				}
				else if(t instanceof ParameterizedType){
					//	TODO must deal with ParameterizedType
					internalLog.warn("must deal with ParameterizedType");
				}
				else if(t instanceof TypeVariable){
					//	TODO must deal with TypeVariable<D>
					internalLog.warn("must deal with TypeVariable");
				}
				else if(t instanceof WildcardType){
					//	TODO must deal with WildcardType
					internalLog.warn("must deal with WildcardType");
				}
				else {
					internalLog.error("don't know how to deal with unexpected type");
				}
				if(Modifier.isAbstract(methods[i].getModifiers())){
					context.current_operation.setIsAbstract(true);
				}
				else {
					context.current_operation.setIsAbstract(false);
					// not abstract but no behavior in kermeta, fill it with a dummy body
					// that raises a NotImplemented exception
					// DVK not necessary because I've fixed the interpreter to automatically raise this exception in this situation ...
					//		this save precious memory when loading large jar
					// builder.current_operation.setBody(ExpressionParser.parse(builder, "        raise kermeta::exceptions::NotImplementedException.new"));
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
				classDef.getOwnedOperation().add(context.current_operation);
				allOperations.add(context.current_operation);
				// ownedParameter added while visiting  containement
				java.lang.reflect.Type[] paramTypes = methods[i].getGenericParameterTypes();
				for (int j = 0 ; j < paramTypes.length; j++){
					//	Create the parameter :
					Parameter res = StructureFactory.eINSTANCE.createParameter();
					// Name
					res.setName("param"+(j+1));
					//	return type : try to see if it is a collection
					if(paramTypes[j] instanceof Class){
						Class paramClassType = (Class)paramTypes[j];
						setTypeFromClass(res, paramClassType);
					}
					else if(paramTypes[j] instanceof ParameterizedType){
						ParameterizedType pt = (ParameterizedType)paramTypes[j];
						Class rawType = (Class)pt.getRawType();
						setTypeFromClass(res, rawType);
						java.lang.reflect.Type[] typeArguments =pt.getActualTypeArguments();
						for( int k = 0; k <typeArguments.length; k++ ){
						//	res.getContainedType().add();
							// TODO deal with typeargument
						}
					}
					else if(paramTypes[j] instanceof GenericArrayType){					
						//internalLog.debug("must deal with GenericArrayType");
						GenericArrayType returnType = (GenericArrayType)paramTypes[j];
						res.setIsOrdered(true);
						res.setIsUnique(false);
						res.setUpper(-1);
						res.setLower(0);
						// type :		
						String typeName = getQualifiedName(returnType.getGenericComponentType());
						// TODO deal with TypeVariable
						res.setType(getTypeByID(typeName));
					}
					else{
						// TODO must deal with GenericArrayType, TypeVariable<D>, WildcardType
						assert(false);
					}
					// Operation:
					context.current_operation.getOwnedParameter().add(res);
					
				}
				// tag the operation with the java name
				Tag tag = KermetaModelHelper.Tag.create(JAVAOPERATION_TAG_NAME, methods[i].getName());
				context.current_operation.getOwnedTags().add(tag);
			}
		}
	}
}
