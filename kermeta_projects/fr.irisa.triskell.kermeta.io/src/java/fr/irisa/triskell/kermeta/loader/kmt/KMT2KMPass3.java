/* $Id: KMT2KMPass3.java,v 1.11 2006-12-07 08:08:03 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass3.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 2, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * Description :
 * 	4th pass for the construct kcore representation of 
 *  a Kermeta program, 
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.AbstractModifier;
import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.EnumLiteral;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.OperationBody;
import fr.irisa.triskell.kermeta.ast.Param;
import fr.irisa.triskell.kermeta.ast.Property;
import fr.irisa.triskell.kermeta.ast.PropertyBody;
import fr.irisa.triskell.kermeta.ast.PropertyKind;
import fr.irisa.triskell.kermeta.ast.ReadOnlyModifier;
import fr.irisa.triskell.kermeta.ast.Type;
import fr.irisa.triskell.kermeta.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.ast.UsingStmt;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;


/**
 * @author Franck Fleurey
 * 
 * PASS 3 :
 *  - the usings are checked
 *  - The entire structure should be build at the end of this pass
 *  
 * Except :
 * For ops : body / abstract / superOp
 * For props : opposites / accessors
 * 
 */
public class KMT2KMPass3 extends KMT2KMPass {
	
	/**
	 * @param builder
	 */
	public KMT2KMPass3(KermetaUnit builder) {
		super(builder);
	}
	
	/*
	* *******************************************************
	*                  BUILD CLASSES
	* *******************************************************
	*/

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.AbstractModifier)
	 */
	public boolean beginVisit(AbstractModifier abstractModifier) {
		builder.current_class.setIsAbstract(true);
		return super.beginVisit(abstractModifier);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		builder.pushContext();
		builder.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
//		 add type variables to the context
		Iterator tvs = builder.current_class.getTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((TypeVariable)tvs.next());
		
		builder.current_class.setIsAbstract(false); // false by default
		
		// super types - should be classes
		if (classDecl.getSuperTypes() != null) {
			ASTNode[] supertypes = classDecl.getSuperTypes().getChildren();
			for(int i=0; i<supertypes.length; i++) {
				//System.out.println(builder.current_class.getFName() +" Node in super type : " + supertypes[i].getClass().getName());
				if (supertypes[i] instanceof Type) {
					fr.irisa.triskell.kermeta.language.structure.Type supertype = KMT2KMTypeBuilder.process((Type)supertypes[i], builder);
					//System.out.println(builder.current_class.getFName() + " Found a super type : " + supertype.getFName() + " : " + supertype.getClass().getName());
					if (!(supertype instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
						if  (!(supertype instanceof VirtualType)) {
							builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' - A class can only inherit from classes and/or virtual types ("+supertype+" is neither).",(KermetaASTNode)supertypes[i]));
							return false;
						}
					}
					EList tmpsts = builder.current_class.getSuperType();
					for(int a=0;a<tmpsts.size();a++) {
						if (((fr.irisa.triskell.kermeta.language.structure.Class)tmpsts.get(a)).getTypeDefinition() 
								== ((fr.irisa.triskell.kermeta.language.structure.Class)supertype).getTypeDefinition()) {
							builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' - A class can only inherit once from another.",(KermetaASTNode)supertypes[i]));
							return false;
						}
					}
					builder.current_class.getSuperType().add(supertype);
				}
			}
		}
		
		return super.beginVisit(classDecl);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		builder.popContext();
		super.endVisit(classDecl);
	}
	
	
	/*
	 * *******************************************************
	 *                  BUILD MODEL TYPE
	 * *******************************************************
	 */
	public boolean beginVisit(ModelTypeDecl modelTypeDecl) {
		builder.pushContext();
		builder.current_modeltype = (ModelTypeDefinition)builder.getModelElementByNode(modelTypeDecl);
//		 add type variables to the context
		Iterator tvs = builder.current_modeltype.getTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((TypeVariable)tvs.next());
		
		return super.beginVisit(modelTypeDecl);
	}
	
	public void endVisit(ModelTypeDecl modelTypeDecl) {
		builder.popContext();
		super.endVisit(modelTypeDecl);
	}
	
	/*
	* *******************************************************
	*                  BUILD OPERATION
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		builder.pushContext();
		// Create the operation:
		builder.current_operation = builder.struct_factory.createOperation();
		builder.storeTrace(builder.current_operation, operation);
		// Name
		builder.current_operation.setName(getTextForID(operation.getName()));
		if (operation.getTypeRef() != null) {
			// isOrdered :
			builder.current_operation.setIsOrdered(isOrdered(operation.getTypeRef()));
			// isUnique :
			builder.current_operation.setIsUnique(isUnique(operation.getTypeRef()));
			// upper :
			builder.current_operation.setUpper(getUpper(operation.getTypeRef()));
			// lower :
			builder.current_operation.setLower(getLower(operation.getTypeRef()));
		}
		// checks that the class do not have an op with the same name yet
		if (ClassDefinitionHelper.getOperationByName(builder.current_class, builder.current_operation.getName()) != null) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definition of operation '"+builder.current_operation.getName()+"'.",operation));
			return false;
		}
		if (ClassDefinitionHelper.getPropertyByName(builder.current_class, builder.current_operation.getName()) != null) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' contains both an operation and a property named '"+builder.current_operation.getName()+"'.",operation));
			return false;
		}
		
		// owningClass :
		builder.current_class.getOwnedOperation().add(builder.current_operation);
		return super.beginVisit(operation);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		if (operation.getTypeRef() != null) {
			// type :
			builder.current_operation.setType(getFType(operation.getTypeRef()));
		}
		// Exceptions
		if (operation.getExceptions() != null) {
			ASTNode[] exceptions = operation.getExceptions().getChildren();
			for(int i=0; i<exceptions.length; i++) {
				if (exceptions[i] instanceof Type) {
					builder.current_operation.getRaisedException().add(KMT2KMTypeBuilder.process((Type)exceptions[i], builder));
				}
			}
		}
		builder.popContext();
		builder.current_operation = null;
		super.endVisit(operation);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeVarDecl)
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		TypeVariable tv;
		if (builder.current_operation == null) {
			// it is a type variable for a class. the object already exists but
			// the supertype needs to be set
			tv = (TypeVariable)builder.getModelElementByNode(typeVarDecl);
		}
		else {
			// it is a new type variable for an operation. needs to create it
			
			// create the parameter
			String name = getTextForID(typeVarDecl.getName());
			// If it has a supertype that is a model type, then we need to create a modeltypeVar.
			// Otherwise create an ObjectTypeVariable
			if (KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder) instanceof ModelType) {
				//tv = builder.struct_factory.createModelTypeVariable();
				builder.messages.addMessage(new KMTUnitLoadError("Unable to create type variable '" + name + "': no model-type variables on operations", typeVarDecl));
				return false;
			} else {
				tv = builder.struct_factory.createObjectTypeVariable();
			}
			tv.setName(name);
			// check that another param with the same name does not exist yet
			EList other_params = builder.current_operation.getTypeParameter();
			for (int i=0; i<other_params.size(); i++) {
				if (((TypeVariable)other_params.get(i)).getName().equals(name)) {
					builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Parametric operation '" + builder.current_operation.getName() + "' already contains a type parameter named '"+name+"'.",typeVarDecl));
					return false;
				}
			}
			// add the parameter to the operation
			builder.current_operation.getTypeParameter().add(tv);
			builder.storeTrace(tv, typeVarDecl);
			//tv.setSupertype(KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder));

			
		}
		
		if (!(tv instanceof ModelTypeVariable)) {
			tv.setSupertype(KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder));
		}
		// in both cases the variable should be added to the context
		builder.addTypeVar(tv);
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Param)
	 */
	public boolean beginVisit(Param param) {
		// Create the parameter and adds it to the current op
		Parameter parameter = builder.struct_factory.createParameter();
		builder.storeTrace(parameter, param);
		// Name
		parameter.setName(getTextForID(param.getName()));
		// isOrdered :
		parameter.setIsOrdered(isOrdered(param.getTypeRef()));
		// isUnique :
		parameter.setIsUnique(isUnique(param.getTypeRef()));
		// upper :
		parameter.setUpper(getUpper(param.getTypeRef()));
		// lower :
		parameter.setLower(getLower(param.getTypeRef()));
		// type :
		parameter.setType(getFType(param.getTypeRef()));
		
		// check that another param with the same name does not exist yet
		EList other_params = builder.current_operation.getOwnedParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((Parameter)other_params.get(i)).getName().equals(parameter.getName())) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Operation '" + builder.current_operation.getName() + "' already contains a parameter named '"+parameter.getName()+"'.",param));
				return false;
			}
		}
		
		// ownedOperation
		builder.current_operation.getOwnedParameter().add(parameter);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationBody)
	 */
	public boolean beginVisit(OperationBody operationBody) {
		// to avoid visiting the whole tree
		return false;
	}
	/*
	* *******************************************************
	*                  BUILD PROPERTY
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Property)
	 */
	public boolean beginVisit(Property property) {
		// Create the parameter and adds it to the current op
		builder.current_property = builder.struct_factory.createProperty();
		builder.storeTrace(builder.current_property, property);
		// Name
		builder.current_property.setName(getTextForID(property.getName()));
		// isOrdered :
		builder.current_property.setIsOrdered(isOrdered(property.getTypeRef()));
		// isUnique :
		builder.current_property.setIsUnique(isUnique(property.getTypeRef()));
		// upper :
		builder.current_property.setUpper(getUpper(property.getTypeRef()));
		// lower :
		builder.current_property.setLower(getLower(property.getTypeRef()));
		// type :
		builder.current_property.setType(getFType(property.getTypeRef()));
		// is readonly, false by default
		builder.current_property.setIsReadOnly(false);
		
		if (ClassDefinitionHelper.getPropertyByName(builder.current_class, builder.current_property.getName()) != null) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definition of property '"+builder.current_property.getName()+"'.",property));
			return false;
		}
		
		// checks that the class do not have an op with the same name yet
		if (ClassDefinitionHelper.getOperationByName(builder.current_class, builder.current_property.getName()) != null) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' contains both an operation and a property named '"+builder.current_property.getName()+"'.",property));
			return false;
		}
		
		// owningClass
		builder.current_class.getOwnedAttribute().add(builder.current_property);
		return super.beginVisit(property);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Property)
	 */
	public void endVisit(Property property) {
		builder.current_property = null;
		super.endVisit(property);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PropertyKind)
	 */
	public boolean beginVisit(PropertyKind propertyKind) {
		if (propertyKind.getText().equals("attribute")) {
			builder.current_property.setIsDerived(false);
			builder.current_property.setIsComposite(true);
		}
		else if (propertyKind.getText().equals("reference")) {
			builder.current_property.setIsDerived(false);
			builder.current_property.setIsComposite(false);
		}
		else if (propertyKind.getText().equals("property")) {
			builder.current_property.setIsDerived(true);
			builder.current_property.setIsComposite(false);
		}
		return super.beginVisit(propertyKind);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ReadOnlyModifier)
	 */
	public boolean beginVisit(ReadOnlyModifier readOnlyModifier) {
		builder.current_property.setIsReadOnly(true);
		return super.beginVisit(readOnlyModifier);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PropertyBody)
	 */
	public boolean beginVisit(PropertyBody propertyBody) {
//		 to avoid visiting the whole tree
		return false;
	}
	/*
	* *******************************************************
	*                  BUILD ENNUMERATIONS
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumDecl)
	 */
	public boolean beginVisit(EnumDecl enumDecl) {
		builder.current_enum = (Enumeration)builder.getModelElementByNode(enumDecl);
		return super.beginVisit(enumDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumLiteral)
	 */
	public boolean beginVisit(EnumLiteral enumLiteral) {
		EnumerationLiteral lit = builder.struct_factory.createEnumerationLiteral();
		lit.setName(getTextForID(enumLiteral.getName()));
		builder.storeTrace(lit, enumLiteral);
		builder.current_enum.getOwnedLiteral().add(lit);
		return super.beginVisit(enumLiteral);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.DataTypeDecl)
	 */
	public boolean beginVisit(DataTypeDecl node) {
		PrimitiveType pt = (PrimitiveType)builder.getModelElementByNode(node);
		pt.setInstanceType(KMT2KMTypeBuilder.process(node.getInstanceClass(), builder));
		return false;
	}

	/**
	 * @see KermetaASTNodeVisitor#beginVisit(UsingStmt)
	 */
	public boolean beginVisit(UsingStmt usingStmt) {
		String u = qualifiedIDAsString(usingStmt.getName());
		if (builder.getPackages().containsKey(u) == false) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Wrong using - package '"+u+"' does not exist", usingStmt));
			return false;
		}
		return super.beginVisit(usingStmt);
	}
	
	
}
