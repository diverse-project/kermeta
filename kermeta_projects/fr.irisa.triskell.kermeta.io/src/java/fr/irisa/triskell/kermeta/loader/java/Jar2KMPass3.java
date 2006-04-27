/* $Id: Jar2KMPass3.java,v 1.2 2006-04-27 06:31:18 dvojtise Exp $
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

import java.lang.reflect.Method;
import java.util.Enumeration;


import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 *  Jar2KM PASS 3 : creates almost every features and links for classes except opposites
 *  This includes :
 *  	inheritance, attributes, references, operation
 * The entire structure should be build at the end of this pass
 * 
 * Except :
 * For ops : body / abstract / superOp
 * For props : opposites / accessors
 */
public class Jar2KMPass3 extends Jar2KMPass {

	public Jar2KMPass3(JarUnit builder) {
		super(builder);
	}

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
				processInheritance(currentClassDef, currentClass);
				processAttributes(currentClassDef, currentClass);
				processOperations(currentClassDef, currentClass);
			} catch (ClassNotFoundException e) {
				internalLog.error("ClassNotFound in jar "+builder.platformURI.toFileString() +" looking for "+javaQualifiedName ,e);
				
			}    		
    	}
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
	public void processAttributes(ClassDefinition classDef, Class c){
		//TODO
	}

	public void processOperations(ClassDefinition classDef, Class c){
		Method[] methods = c.getDeclaredMethods();
		for (int i = 0 ; i < methods.length; i++){
			//	Create the operation:
			builder.current_operation = builder.struct_factory.createOperation();
			//builder.storeTrace(builder.current_operation, node);
			
			// Name
			// TODO must deal with duplicate operation name 
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
			// ownedParameter added while visiting  containement
			java.lang.reflect.Type[] paramTypes = methods[i].getGenericParameterTypes();
			for (int j = 0 ; j < paramTypes.length; j++){
				// TODO
				//	Create the parameter :
				Parameter res = builder.struct_factory.createParameter();
//				 return type : try to see if it is a collection
				if(paramTypes[j] instanceof Class){
					Class paramClassType = (Class)paramTypes[j];
					if(paramClassType.isArray()){
					//builder.storeTrace(res, node);
						// Name
						res.setName(paramClassType.getName());
						// isOrdered :
						res.setIsOrdered(true);
						// isUnique :
						res.setIsUnique(false);
						// upper :
						res.setUpper(-1);
						// lower :
						res.setLower(0);
						// type :
						String typeName = getQualifiedName(paramClassType);
						typeName = typeName.substring(0, typeName.length()-2); //
						res.setType(getTypeByID(typeName));
					}
					else{
						res.setName(paramClassType.getName());
						// isOrdered :
						res.setIsOrdered(false);
						// isUnique :
						res.setIsUnique(false);
						// upper :
						res.setUpper(1);
						// lower :
						res.setLower(0);
						// type :
						res.setType(getTypeByID(getQualifiedName(paramClassType)));
					}
				}
				else{
					// TODO must deal with GenericArrayType, ParameterizedType, TypeVariable<D>, WildcardType
				}
				// Operation:
				builder.current_operation.getOwnedParameter().add(res);
			}
		}
	}
}
