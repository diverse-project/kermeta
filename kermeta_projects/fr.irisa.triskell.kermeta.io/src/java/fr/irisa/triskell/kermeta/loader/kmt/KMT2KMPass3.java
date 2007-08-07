/* $Id: KMT2KMPass3.java,v 1.21 2007-08-07 13:35:22 ftanguy Exp $
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

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

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
import fr.irisa.triskell.kermeta.ast.QualifiedID;
import fr.irisa.triskell.kermeta.ast.ReadOnlyModifier;
import fr.irisa.triskell.kermeta.ast.Type;
import fr.irisa.triskell.kermeta.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.ast.UsingStmt;
import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


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
	
	/** used to say if the currentclass is an aspect, this info cannot be stored 
	 * directly in the class since the aspect comes from another kmt file
	 */
	private boolean currentClassIsAspect = false;	

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2KMPass3");

	/**
	 * @param builder
	 */
	public KMT2KMPass3(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
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
		context.current_class.setIsAbstract(true);
		return super.beginVisit(abstractModifier);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		context.pushContext();
		try {
			context.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
			context.current_class.getName();
		} catch (Exception e) {
			context.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
		}
		currentClassIsAspect = KermetaASTHelper.isAnAspect(classDecl);
		internalLog.debug(context.current_class.getName() + " isAspect="+currentClassIsAspect + " from " +builder.getUri());
//		 add type variables to the context
		Iterator tvs = context.current_class.getTypeParameter().iterator();
		while(tvs.hasNext()) context.addTypeVar((TypeVariable)tvs.next());
		
		context.current_class.setIsAbstract(false); // false by default
		
		// super types - should be classes
		if (classDecl.getSuperTypes() != null) {
			ASTNode[] supertypes = classDecl.getSuperTypes().getChildren();
			for(int i=0; i<supertypes.length; i++) {
				//System.out.println(builder.current_class.getFName() +" Node in super type : " + supertypes[i].getClass().getName());
				if (supertypes[i] instanceof Type) {
					fr.irisa.triskell.kermeta.language.structure.Type supertype = KMT2KMTypeBuilder.process(context, (Type)supertypes[i], builder);
					//System.out.println(builder.current_class.getFName() + " Found a super type : " + supertype.getFName() + " : " + supertype.getClass().getName());
					if (!(supertype instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
						if  (!(supertype instanceof VirtualType)) {
							//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' - A class can only inherit from classes and/or virtual types ("+supertype+" is neither).",(KermetaASTNode)supertypes[i]));
							builder.error("PASS 3 : Class '"+ context.current_class.getName()+"' - A class can only inherit from classes and/or virtual types ("+supertype+" is neither).", (KermetaASTNode)supertypes[i]);
							return false;
						}
					}
					EList tmpsts = context.current_class.getSuperType();
					for(int a=0;a<tmpsts.size();a++) {
						if (((fr.irisa.triskell.kermeta.language.structure.Class)tmpsts.get(a)).getTypeDefinition() 
								== ((fr.irisa.triskell.kermeta.language.structure.Class)supertype).getTypeDefinition()) {
							//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' - A class can only inherit once from another.",(KermetaASTNode)supertypes[i]));
							builder.error("PASS 3 : Class '"+context.current_class.getName()+"' - A class can only inherit once from another.", (KermetaASTNode)supertypes[i]);
							return false;
						}
					}
					context.current_class.getSuperType().add(supertype);
				}
			}
		} else {
			
			String qualifiedName = NamedElementHelper.getQualifiedName( context.current_class );
			if ( ! qualifiedName.matches("kermeta::reflection.+") 
					&& ! qualifiedName.equals("kermeta::language::structure::Object")
					&& ! qualifiedName.equals("kermeta::language::structure::KMStructureVisitable")
					&& ! qualifiedName.equals("kermeta::language::behavior::KMExpressionVisitable")) {
				ClassDefinition supertypeDefinition = (ClassDefinition) builder.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object");
				if ( supertypeDefinition == null )
					builder.error("Missing the statement : require kermeta");
				fr.irisa.triskell.kermeta.language.structure.Class superclass = StructureFactory.eINSTANCE.createClass();
				superclass.setTypeDefinition( supertypeDefinition );
				context.current_class.getSuperType().add( superclass );
			}
		}
		return super.beginVisit(classDecl);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		context.popContext();
		super.endVisit(classDecl);
	}
	
	
	/*
	 * *******************************************************
	 *                  BUILD MODEL TYPE
	 * *******************************************************
	 */
	public boolean beginVisit(ModelTypeDecl modelTypeDecl) {
		ModelType thisMT = (ModelType) builder.getModelElementByNode(modelTypeDecl);
		ASTNode[] included = modelTypeDecl.getIncluded().getChildren();
		for (int i=0; i < included.length ; i++) {
			if (included[i] instanceof QualifiedID) {
				String qid = this.qualifiedIDAsString((QualifiedID) included[i]);
				TypeDefinition referredTD = builder.getTypeDefinitionByName(qid);
				if (null == referredTD) {
					//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Type definition not found : " + qid, (KermetaASTNode) included[i]));
					builder.error("PASS 3 : Type definition not found : " + qid);
					return false;
				}
				if ((referredTD instanceof GenericTypeDefinition) && !((GenericTypeDefinition) referredTD).getTypeParameter().isEmpty()) {
					//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Generic type definitions are not permitted in model types", (KermetaASTNode) included[i]));
					builder.error("PASS 3 : Generic type definitions are not permitted in model types");
					return false;
				} else {
					thisMT.getIncludedTypeDefinition().add(referredTD);
				}
			}
		}
//		builder.current_modeltype = (ModelTypeDefinition)builder.getModelElementByNode(modelTypeDecl);
////		 add type variables to the context
//		Iterator tvs = builder.current_modeltype.getTypeParameter().iterator();
//		while(tvs.hasNext()) builder.addTypeVar((TypeVariable)tvs.next());
		
		return super.beginVisit(modelTypeDecl);
	}
	
	public void endVisit(ModelTypeDecl modelTypeDecl) {
		//loader.popContext(builder);
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
		context.pushContext();
		// Create the operation:

		context.current_operation = StructureFactory.eINSTANCE.createOperation();
		builder.storeTrace(context.current_operation, operation);
		// Name
		context.current_operation.setName(getTextForID(operation.getName()));
		if (operation.getTypeRef() != null) {
			// isOrdered :
			context.current_operation.setIsOrdered(isOrdered(operation.getTypeRef()));
			// isUnique :
			context.current_operation.setIsUnique(isUnique(operation.getTypeRef()));
			// upper :
			context.current_operation.setUpper(getUpper(operation.getTypeRef()));
			// lower :
			context.current_operation.setLower(getLower(operation.getTypeRef()));
		}
		internalLog.debug("visiting operation " +getTextForID(operation.getName()));
		// checks that the class do not have an op with the same name yet
		fr.irisa.triskell.kermeta.language.structure.Operation existingOperation =  ClassDefinitionHelper.getOperationByName(context.current_class, context.current_operation.getName());
		if (existingOperation != null) {
			//if the operation is from an aspect class and its signature is the same, we need to continue 
			if(currentClassIsAspect){
				// if they have the same signature
				if(haveSameTypeSignature(operation, existingOperation)){
					// register the existing operation with this astnode
					builder.storeTrace(existingOperation, operation);
					aspectNodes.add(operation);
					return super.beginVisit(operation);
				}
				else{
//					 otherwise this is an error
					//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definitions of operation '"+builder.current_operation.getName()+"' with different signatures.",operation ));
					String message = "PASS 3 : Class '" + context.current_class.getName() 
														+ "' duplicate definitions of operation '" 
														+ context.current_operation.getName() 
														+ "' with different signatures.";
					builder.error(message, context.current_operation);
					return false;
				}
			}
			else {
				// otherwise this is an error
				//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definition of operation '"+builder.current_operation.getName()+"'.",operation));
				String message = "PASS 3 : Class '" + context.current_class.getName() 
													+ "' duplicate definition of operation '" 
													+ context.current_operation.getName() 
													+ "'.";
				builder.error(message, context.current_operation);
				return false;
			}
		}
		if (ClassDefinitionHelper.getPropertyByName(context.current_class, context.current_operation.getName()) != null) {
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' contains both an operation and a property named '"+builder.current_operation.getName()+"'.",operation));
			String message = "PASS 3 : Class '" + context.current_class.getName() 
												+ "' contains both an operation and a property named '" 
												+ context.current_operation.getName() 
												+ "'.";
			builder.error(message, context.current_operation);
			return false;
		}
		
		// owningClass :
		context.current_class.getOwnedOperation().add(context.current_operation);
		return super.beginVisit(operation);
	}
	
	/**
	 * Check that the propose operation have the same signature
	 * 
	 * @param astOperation
	 * @param modelOperation
	 * @return
	 */
	private boolean haveSameTypeSignature(Operation astOperation, fr.irisa.triskell.kermeta.language.structure.Operation modelOperation) {
		// check return type
		// DVK: maybe I should use the type equality checker insead of a simple name comparison ...
		if(!TypeHelper.getName(getFType(astOperation.getTypeRef())).equals(TypeHelper.getName(modelOperation.getType())))
		{
			return false;
		}
		// check parameters
		int nbParameters = astOperation.getParams() != null ? astOperation.getParams().getChildCount() : 0;
		if(nbParameters != modelOperation.getOwnedParameter().size()) return false;
		for(int i = 0; i < nbParameters; i++){
			Param param = (Param)astOperation.getParams().getChild(i);
			fr.irisa.triskell.kermeta.language.structure.Type astParamType = getFType(param.getTypeRef());
			//Type type  = getFType(astOperation.getParams().getChild(i));
			Parameter modelParam = (Parameter)modelOperation.getOwnedParameter().get(i);
			if(!TypeHelper.getName(astParamType).equals(TypeHelper.getName(modelParam.getType()))){
				return false;
			}
		}
		return true;
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		if (operation.getTypeRef() != null) {
			// type :
			context.current_operation.setType(getFType(operation.getTypeRef()));
		}
		// Exceptions
		if (operation.getExceptions() != null) {
			ASTNode[] exceptions = operation.getExceptions().getChildren();
			for(int i=0; i<exceptions.length; i++) {
				if (exceptions[i] instanceof Type) {
					context.current_operation.getRaisedException().add(KMT2KMTypeBuilder.process(context, (Type)exceptions[i], builder));
				}
			}
		}
		context.popContext();
		context.current_operation = null;
		super.endVisit(operation);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeVarDecl)
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		TypeVariable tv;
		
		if (context.current_operation == null) {
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
			if (KMT2KMTypeBuilder.process(context, typeVarDecl.getSupertype(), builder) instanceof ModelType) {
				//tv = builder.struct_factory.createModelTypeVariable();
			//	builder.messages.addMessage(new KMTUnitLoadError("Unable to create type variable '" + name + "': no model-type variables on operations", typeVarDecl));
				builder.error("Unable to create type variable '" + name + "': no model-type variables on operations");
				return false;
			} else {
				tv = StructureFactory.eINSTANCE.createObjectTypeVariable();
			}
			tv.setName(name);
			// check that another param with the same name does not exist yet
			EList other_params = context.current_operation.getTypeParameter();
			for (int i=0; i<other_params.size(); i++) {
				if (((TypeVariable)other_params.get(i)).getName().equals(name)) {
					//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Parametric operation '" + builder.current_operation.getName() + "' already contains a type parameter named '"+name+"'.",typeVarDecl));
					builder.error("PASS 3 : Parametric operation '" + context.current_operation.getName() + "' already contains a type parameter named '"+name+"'.");
					return false;
				}
			}
			// add the parameter to the operation
			context.current_operation.getTypeParameter().add(tv);
			builder.storeTrace(tv, typeVarDecl);
			//tv.setSupertype(KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder));

			
		}
		
		if (!(tv instanceof ModelTypeVariable)) {
			tv.setSupertype(KMT2KMTypeBuilder.process(context, typeVarDecl.getSupertype(), builder));
		}
		// in both cases the variable should be added to the context
		context.addTypeVar(tv);
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Param)
	 */
	public boolean beginVisit(Param param) {
		if(aspectNodes.contains(param.getParent().getParent())){
			// the operation defining these parameters is an aspect
			// simply ignore these param
			return false;
		}
		// Create the parameter and adds it to the current op
		Parameter parameter = StructureFactory.eINSTANCE.createParameter();
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
		if ( getFType( param.getTypeRef() ) == null )
			getFType( param.getTypeRef() );
		parameter.setType(getFType(param.getTypeRef()));
		
		// check that another param with the same name does not exist yet
		EList other_params = context.current_operation.getOwnedParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((Parameter)other_params.get(i)).getName().equals(parameter.getName())) {
				//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Operation '" + builder.current_operation.getName() + "' already contains a parameter named '"+parameter.getName()+"'.",param));
				builder.error("PASS 3 : Operation '" + context.current_operation.getName() + "' already contains a parameter named '"+parameter.getName()+"'.");
				return false;
			}
		}
		
		// ownedOperation
		context.current_operation.getOwnedParameter().add(parameter);
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
		context.current_property = StructureFactory.eINSTANCE.createProperty();
		builder.storeTrace(context.current_property, property);
		// Name
		context.current_property.setName(getTextForID(property.getName()));
		// isOrdered :
		context.current_property.setIsOrdered(isOrdered(property.getTypeRef()));
		// isUnique :
		context.current_property.setIsUnique(isUnique(property.getTypeRef()));
		// upper :
		context.current_property.setUpper(getUpper(property.getTypeRef()));
		// lower :
		context.current_property.setLower(getLower(property.getTypeRef()));
		// type :
			
		if ( context.current_property.getName().equals("grounded") )
			System.out.println();
			
		context.current_property.setType(getFType(property.getTypeRef()));
		// is readonly, false by default
		context.current_property.setIsReadOnly(false);
		
	/*	if (ClassDefinitionHelper.getPropertyByName(context.current_class, context.current_property.getName()) != null) {
			//	if the property is from an aspect class and its signature is the same, we should continue but reuse the existing one 
			if(currentClassIsAspect &&
					haveSameTypeSignature(property, ClassDefinitionHelper.getPropertyByName(context.current_class, context.current_property.getName()))){
					return super.beginVisit(property);
				}
				else{
					//	 otherwise this is an error
			
					//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definition of property '"+builder.current_property.getName()+"'.",property));
					builder.error("PASS 3 : Class '"+context.current_class.getName()+"' duplicate definition of property '"+context.current_property.getName()+"'.", context.current_class);
					return false;
			}
		}*/
		
		// checks that the class do not have an op with the same name yet
		if (ClassDefinitionHelper.getOperationByName(context.current_class, context.current_property.getName()) != null) {
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Class '"+builder.current_class.getName()+"' contains both an operation and a property named '"+builder.current_property.getName()+"'.",property));
			builder.error("PASS 3 : Class '"+context.current_class.getName()+"' contains both an operation and a property named '"+context.current_property.getName()+"'.");
			return false;
		}
		
		// owningClass
		context.current_class.getOwnedAttribute().add(context.current_property);
		return super.beginVisit(property);
	}

	/**
	 * Check that the propose operation have the same signature
	 * 
	 * @param astOperation
	 * @param modelOperation
	 * @return
	 */
	private boolean haveSameTypeSignature(Property astProperty, fr.irisa.triskell.kermeta.language.structure.Property modelProperty) {
		// check return type
		// DVK: maybe I should use the type equality checker insead of a simple name comparison ...
		if(!TypeHelper.getName(getFType(astProperty.getTypeRef())).equals(TypeHelper.getName(modelProperty.getType())))
		{
			return false;
		}		
		return true;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Property)
	 */
	public void endVisit(Property property) {
		context.current_property = null;
		super.endVisit(property);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PropertyKind)
	 */
	public boolean beginVisit(PropertyKind propertyKind) {
		if (propertyKind.getText().equals("attribute")) {
			context.current_property.setIsDerived(false);
			context.current_property.setIsComposite(true);
		}
		else if (propertyKind.getText().equals("reference")) {
			context.current_property.setIsDerived(false);
			context.current_property.setIsComposite(false);
		}
		else if (propertyKind.getText().equals("property")) {
			context.current_property.setIsDerived(true);
			context.current_property.setIsComposite(false);
		}
		return super.beginVisit(propertyKind);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ReadOnlyModifier)
	 */
	public boolean beginVisit(ReadOnlyModifier readOnlyModifier) {
		context.current_property.setIsReadOnly(true);
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
		context.current_enum = (Enumeration)builder.getModelElementByNode(enumDecl);
		return super.beginVisit(enumDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumLiteral)
	 */
	public boolean beginVisit(EnumLiteral enumLiteral) {
		EnumerationLiteral lit = StructureFactory.eINSTANCE.createEnumerationLiteral();
		lit.setName(getTextForID(enumLiteral.getName()));
		builder.storeTrace(lit, enumLiteral);
		context.current_enum.getOwnedLiteral().add(lit);
		return super.beginVisit(enumLiteral);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.DataTypeDecl)
	 */
	public boolean beginVisit(DataTypeDecl node) {
		PrimitiveType pt = (PrimitiveType)builder.getModelElementByNode(node);
		pt.setInstanceType(KMT2KMTypeBuilder.process(context, node.getInstanceClass(), builder));
		return false;
	}

	/**
	 * @see KermetaASTNodeVisitor#beginVisit(UsingStmt)
	 */
	public boolean beginVisit(UsingStmt usingStmt) {
		String u = qualifiedIDAsString(usingStmt.getName());
		if (builder.getPackages(u).size() == 0) {
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 3 : Wrong using - package '"+u+"' does not exist", usingStmt));
			builder.error("PASS 3 : Wrong using - package '"+u+"' does not exist", usingStmt);
			return false;
		}
		return super.beginVisit(usingStmt);
	}
	
	
}
