/* $Id: KMBuilderPass1.java,v 1.13 2005-04-26 09:45:25 jpthibau Exp $
 * Project : Kermeta (First iteration)
 * File : KM2KMTPrettyPrinter.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
*/
package fr.irisa.triskell.kermeta.builder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.ast.Selftype;
import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.reflect.KMReflect;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.structure.*;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;



/**
 * Builds the RuntimeObject representation of the program that must be executed
 */
public class KMBuilderPass1 extends KermetaVisitor {

/*	public static RuntimeObject createCollection() {
		RuntimeObject result;
		RuntimeObject collectionMetaclass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::standard::Collection");
		result=new RuntimeObject(collectionMetaclass.getFactory(),collectionMetaclass);
		result.setData(new Hashtable());
		result.getData().put("CollectionArrayList",new ArrayList());
		return result;
	}*/
	
/*	public KMBuilderPass1() {
		super();
	}*/
	public static FProperty findProperty(FClassDefinition classDef,String propertyName) {
		Iterator it=classDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals(propertyName))
				return property;
		}
		return null;
	}
	
	public static RuntimeObject createPropertyNode(FProperty property) {
		RuntimeObject result;
		RuntimeObject propertyMetaclass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::reflection::Property");
		result=new RuntimeObject(propertyMetaclass.getFactory(),propertyMetaclass);
		result.setData(new Hashtable());
		result.getData().put("propertyDefinition",property);
		if (property.isFIsComposite())
			result.getProperties().put("isComposite",Boolean.TRUE);
		if (property.getFOpposite()!=null) {
			FProperty opposite=property.getFOpposite();
			RuntimeObject oppositeNode=new RuntimeObject(propertyMetaclass.getFactory(),propertyMetaclass);
			oppositeNode.setData(new Hashtable());
			oppositeNode.getData().put("propertyDefinition",opposite);
			result.getProperties().put("opposite",oppositeNode);
			oppositeNode.getProperties().put("opposite",result);
			oppositeNode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(opposite.getFName(),Run.koFactory));
			oppositeNode.getProperties().put("upper",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(opposite.getFUpper(),Run.koFactory));
			oppositeNode.getProperties().put("lower",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(opposite.getFLower(),Run.koFactory));
		}
		FClass fclass=(FClass)property.getFType();
		String qn=KMReflect.getQualifiedName((FNamedElement)fclass.getFClassDefinition());
		RuntimeObject type=(RuntimeObject)Run.koFactory.getClassDefTable().get(qn);
//		RuntimeObject type=(RuntimeObject)Run.koFactory.getClassDefTable().get(KMReflect.getQualifiedName((FNamedElement)property.getFType()));
		result.getProperties().put("type",type);
		result.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(property.getFName(),Run.koFactory));
		result.getProperties().put("upper",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(property.getFUpper(),Run.koFactory));
		result.getProperties().put("lower",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(property.getFLower(),Run.koFactory));
		return result;
	}

//	protected Hashtable allMetaClasses;
//	protected Hashtable allClasses;
	protected Stack packagesStack,blocksStack;
	
	/**
	 * - currentClassNode : the RO corresponding to the currently visited FClassDefinition
	 * - currentOperationNode : the RO corresponding to the currently visited FOperation
	 * - currentFClassNode : the RO corresponding to the current FClass visited (i.e when visiting
	 * a return type, getting the metaclass that it defines)
	 * - etc.
	 * */
	protected RuntimeObject currentClassNode,currentOperationNode,currentFClassNode,currentParamList,currentEnumeration,currentTypesList;
	protected RuntimeObject reflectivecollectionMetaclass;
	protected KermetaUnit currentUnit;
	
	protected boolean typedef = false;
	
	public void ppPackage(KermetaUnit unit) {
		this.currentUnit=unit;
		reflectivecollectionMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::reflective_collections::ReflectiveCollection");
		String currentpackageName=unit.getQualifiedName(unit.rootPackage);
		List packagesNames=new ArrayList();
		packagesNames.add(currentpackageName);
		this.packagesStack=new Stack();
		ppPackageContents(unit.rootPackage);
		ppPackageImportedpackagess(unit,packagesNames);
	}

	public void ppPackageImportedpackagess(KermetaUnit unit,List packagesNames) {
		Iterator it = unit.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			String iuName=iu.getQualifiedName(iu.rootPackage);
			if ( !packagesNames.contains(iuName)) {
				packagesNames.add(iuName);
				this.packagesStack=new Stack();
				ppPackageContents(iu.rootPackage);
				ppPackageImportedpackagess(iu,packagesNames);
			}
		}
	}

	public void ppPackageContents(FPackage p) {
		String packageqn=getQualifiedName(p);
		if (packageqn.startsWith("kermeta::")
			&& ! packageqn.equals("kermeta::interpreter"))
			return; //do not explore metaclasses packages
		RuntimeObject pMetaclass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::reflection::Package");
		FClassDefinition packClassDef=((FClass)pMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(p,pMetaclass);
		knode.getProperties().put("ownedTypeDefinition",Collection.createCollection((RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::language::structure::Type")));
		FProperty nestedPackage=null;
		FProperty ownedTypeDefinition=null;
		Iterator it=packClassDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals("nestedPackage"))
				nestedPackage=property;
			if (property.getFName().equals("ownedTypeDefinition"))
				ownedTypeDefinition=property;
		}
		knode.getProperties().put("nestedPackage",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(nestedPackage)));
		if (! this.packagesStack.isEmpty())
			knode.getProperties().put("container",this.packagesStack.peek());
		this.packagesStack.push(knode);
		ppCRSeparatedNode(p.getFNestedPackage());
		knode.getProperties().put("ownedTypeDefinition",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedTypeDefinition)));
		ppCRSeparatedNode(p.getFOwnedTypeDefinition());
		this.packagesStack.pop();
	}
	
	protected String ppIdentifier(String id) {
		if (id == null) return id;
		if (SimpleKWList.getInstance().isKeyword(id))
			return "~" + id;
		else return id;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
	public Object visit(FAssignement node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::Assignement");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("left",this.accept(node.getFTarget()));
		knode.getProperties().put("right",this.accept(node.getFValue()));
		knode.getProperties().put("op",(node.isFIsCast())?"?":":");
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::Block");
		FClassDefinition blockClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		FProperty statement=findProperty(blockClassDef,"statement");
		FProperty rescueBlock=findProperty(blockClassDef,"rescueBlock");
		RuntimeObject statements =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(statement));
		knode.getProperties().put("statement",statements);
		this.blocksStack.push(statements);
		ppStatementNode(node.getFStatement());
		knode.getProperties().put("statement",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(rescueBlock)));
		Iterator it = node.getFRescueBlock().iterator();
		while(it.hasNext()) {
			this.accept((FRescue)it.next());
		}
		this.blocksStack.pop();
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRescue)
	 */
	public Object visit(FRescue node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::Rescue");
		FClassDefinition rescueClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		if (node.getFExceptionName() != null) {
			knode.getProperties().put(node.getFExceptionName(),this.accept(node.getFExceptionType()));
		}
		FProperty body=findProperty(rescueClassDef,"body");
		knode.getProperties().put("body",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(body)));
		ppStatementNode(node.getFBody());
		return knode;
	}
	
	public void ppCRSeparatedNode(EList expressions) {
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			this.accept((EObject)it.next());
		}
	}
	
	public void ppStatementNode(EList expressions) {
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			RuntimeObject statement=(RuntimeObject)this.accept((EObject)it.next());
			RuntimeObject currentBlock=(RuntimeObject)this.blocksStack.peek();
			ReflectiveCollection.add(currentBlock,statement);
		}
	}

	public void ppTypesNode(EList expressions) {
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			RuntimeObject type=(RuntimeObject)this.accept((EObject)it.next());
			RuntimeObject productType=this.currentTypesList;
			ReflectiveCollection.add(productType,type);
		}
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral)
	 */
	public Object visit(FBooleanLiteral node) {
	    RuntimeObject ronode;
	    if (node.isFValue())
			ronode = fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE;
			
		else ronode = fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.FALSE;
		Run.correspondanceTable.put(node,ronode);
		return ronode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallSuperOperation)
	 */
	public Object visit(FCallSuperOperation node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallSuperOperation");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		if (node.getFParameters().size()> 0) {
			RuntimeObject callExprMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
			FClassDefinition callExprClassDef=((FClass)callExprMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty parameters=findProperty(callExprClassDef,"parameters");
			RuntimeObject parametersNode=ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(parameters));
			knode.getProperties().put("parameters",parametersNode);
			this.currentParamList=parametersNode;
			ppCRSeparatedNode(node.getFParameters());
		}
		return knode;
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Class");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",getQualifiedName(node.getFClassDefinition()));
		this.currentFClassNode=knode;
		if (node.getFTypeParamBinding().size() > 0) {
			FClassDefinition classClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty typeParamBinding=null;
			Iterator it=classClassDef.getFOwnedAttributes().iterator();
			while(it.hasNext()) {
				FProperty property=(FProperty)it.next();
				if (property.getFName().equals("typeParamBinding"))
					typeParamBinding=property;
			}
			RuntimeObject types =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(typeParamBinding));
			knode.getProperties().put("typeParamBinding",types);
			this.currentTypesList=types;
			ppTypesNode(node.getFTypeParamBinding());
		}
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visit(FTypeVariableBinding node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::TypeVariableBinding");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("type",this.accept(node.getFType()));
		return knode;
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
//		System.out.println("Visiting class definition "+node.getFName());
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Class");
		FClassDefinition nodeClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject objectMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Object");
		FClassDefinition objectClassDef=((FClass)objectMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		this.currentClassNode=knode;
		String qualifiedName=KMReflect.getQualifiedName(node);
		Run.koFactory.getClassDefTable().put(qualifiedName,knode);
		RuntimeObject owningPackage=(RuntimeObject)this.packagesStack.peek();
		ReflectiveCollection.add((RuntimeObject)owningPackage.getProperties().get("ownedTypeDefinition"),knode);

		Hashtable properties=knode.getProperties();
		FProperty tag=null;
		Iterator it=objectClassDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals("tag"))
				tag=property;
		}
		FProperty ownedAttribute=null;
		FProperty ownedOperation=null;
		FProperty typeParamBinding=null;
		it=nodeClassDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals("ownedAttribute"))
				ownedAttribute=property;
			if (property.getFName().equals("ownedOperation"))
				ownedOperation=property;
			if (property.getFName().equals("typeParamBinding"))
				typeParamBinding=property;
		}
		properties.put("tag",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(tag)));	
		// Get the pre Annotation of this class 
		if (node.getFTag().size()>0)
		{
		    FTag[] pretagArray = this.getFTagsByName(node.getFTag(), KMT2KMPass.PRE_TAGNAME);
		    for (int i=0; i< pretagArray.length && pretagArray[i]!=null; i++)
		    {
		        this.accept((EObject)pretagArray[i]);
		    }
		}
		RuntimeObject test=fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE;
		if (node.isFIsAbstract())
			properties.put("isAbstract",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.FALSE);
		else properties.put("isAbstract",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		properties.put("name",node.getFName());
		if (node.getFTypeParameter().size() > 0)
			properties.put("typeParamBinding",ppTypeVariableDeclaration(node.getFTypeParameter()));

		properties.put("ownedAttribute",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedAttribute)));	
		ppCRSeparatedNode(node.getFOwnedAttributes());

		properties.put("ownedOperation",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedOperation)));
		ppCRSeparatedNode(node.getFOwnedOperation());

		// Get post annotations
		if (node.getFTag().size()>0)
		{
		    // get post annotation
		    FTag[] posttagArray = this.getFTagsByName(node.getFTag(), KMT2KMPass.POST_TAGNAME);
		    for (int i=0; i< posttagArray.length && posttagArray[i]!=null; i++)
		    {
		        this.accept(posttagArray[i]);
		    }
		}
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visit(FPrimitiveType node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::PrimitiveType");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		knode.getProperties().put("instanceType",node.getFInstanceType());
		return knode;
	}
	
	public String ppTypeVariableDeclaration(EList tparams) {
		String result = "";
		Iterator it = tparams.iterator();
		while (it.hasNext()) {
			FTypeVariable node = (FTypeVariable)it.next();
			result += ppIdentifier(node.getFName());
			if (node.getFSupertype() != null) result += " : " + this.accept(node.getFSupertype());
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 */
	public Object visit(FConditionnal node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::Conditionnal");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("condition",this.accept(node.getFCondition()));
		if (node.getFThenBody() != null)
			knode.getProperties().put("thenBody",this.accept(node.getFThenBody()));
		if (node.getFElseBody() != null)
			knode.getProperties().put("elseBody",this.accept(node.getFElseBody()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration node) {
		RuntimeObject knode;
		String qname = getQualifiedName(node);
		if (typedef == true) {
			RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Enumeration");
			FClassDefinition enumerationClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
			knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
			FProperty ownedLiteral=findProperty(enumerationClassDef,"ownedLiteral");
			RuntimeObject literals =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedLiteral));
			knode.getProperties().put("ownedLiteral",literals);
			this.currentEnumeration=literals;
			ppCRSeparatedNode(node.getFOwnedLiteral());
			Run.koFactory.getClassDefTable().put(qname,knode);
		}
		else
			knode=(RuntimeObject)Run.koFactory.getClassDefTable().get(qname);
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::EnumerationLiteral");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		RuntimeObject literalsList=this.currentEnumeration;
		ReflectiveCollection.add(literalsList,knode);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visit(FFunctionType node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::FunctionType");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("left",this.accept(node.getFLeft()));
		knode.getProperties().put("right",this.accept(node.getFRight()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral)
	 */
	public Object visit(FIntegerLiteral node) {
		RuntimeObject knode= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFValue(),Run.koFactory);
		Run.correspondanceTable.put(node,knode);
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::JavaStaticCall");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("Jclass",node.getFJclass());
		knode.getProperties().put("Jmethod",node.getFJmethod());
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
			FClassDefinition callExprClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty parameters=findProperty(callExprClassDef,"parameters");
			RuntimeObject parametersNode=ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(parameters));
			knode.getProperties().put("parameters",parametersNode);
			this.currentParamList=parametersNode;
			ppCRSeparatedNode(node.getFParameters());
		}
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaExpression)
	 */
	public Object visit(FLambdaExpression node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::LambdaExpression");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
			FClassDefinition callExprClassDef=((FClass)exprCallMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty parameters=findProperty(callExprClassDef,"parameters");
			RuntimeObject parametersNode=ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(parameters));
			knode.getProperties().put("parameters",parametersNode);
			this.currentParamList=parametersNode;
			ppCRSeparatedNode(node.getFParameters());
		}
		knode.getProperties().put("body",this.accept(node.getFBody()));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaParameter)
	 */
	public Object visit(FLambdaParameter node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::LambdaParameter");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		if (node.getFType() != null) {
			knode.getProperties().put("type",this.accept(node.getFType()));
		}
		RuntimeObject paramList=this.currentParamList;
		ReflectiveCollection.add(paramList,knode);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLoop)
	 */
	public Object visit(FLoop node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::Loop");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("initialization",this.accept(node.getFInitiatization()));
		knode.getProperties().put("stopCondition",this.accept(node.getFStopCondition()));
		knode.getProperties().put("body",this.accept(node.getFBody()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		//System.out.println("Visiting Operation "+node.getFName());
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Operation");
		FClassDefinition nodeClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		this.currentOperationNode=knode;
		RuntimeObject opList=(RuntimeObject)this.currentClassNode.getProperties().get("ownedOperation");
		ReflectiveCollection.add(opList,knode);
		Hashtable properties=knode.getProperties();
		FProperty ownedParameter=null;
		FProperty raisedException=null;
		Iterator it=nodeClassDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals("ownedParameter"))
				ownedParameter=property;
			if (property.getFName().equals("raisedException"))
				raisedException=property;
		}
		properties.put("name",node.getFName());
		if (node.getFTypeParameter().size() > 0)
			properties.put("typeParameter",ppTypeVariableDeclaration(node.getFTypeParameter()));
		RuntimeObject parametersNode=ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedParameter));
		properties.put("ownedParameter",parametersNode);	
		this.currentParamList=parametersNode;
		ppCRSeparatedNode(node.getFOwnedParameter());
		if(node.getFType() != null)
		{    
		    properties.put("type",ppTypeFromMultiplicityElement(node));
		}
		else
		{
		    //properties.put("type", );
		}
		if (node.getFSuperOperation() != null) {
			properties.put("SuperOperation",getQualifiedName(node.getFSuperOperation().getFOwningClass())+"::"+node.getFSuperOperation().getFName());
		}
		if (node.getFRaisedException().size() > 0) {
			properties.put("raisedException",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(raisedException)));
			ppCRSeparatedNode(node.getFRaisedException());
		}
		if (node.getFBody() != null) {
			this.blocksStack=new Stack();
			properties.put("body",this.accept(node.getFBody()));
		}
		else if (node.isFIsAbstract())
			properties.put("isAbstract",Boolean.TRUE);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visit(FParameter node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Parameter");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		RuntimeObject paramList=this.currentParamList;
		ReflectiveCollection.add(paramList,knode);
		return null;
	}
	
	public RuntimeObject ppTypeFromMultiplicityElement(FMultiplicityElement elem) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::MultiplicityElement");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(elem,nodeMetaclass);
		knode.getProperties().put("lower",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(elem.getFLower(),Run.koFactory));
		knode.getProperties().put("upper",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(elem.getFUpper(),Run.koFactory));
		knode.getProperties().put("isOrdered",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(elem.isFIsOrdered()));
		knode.getProperties().put("isUnique",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(elem.isFIsUnique()));
		RuntimeObject result = (RuntimeObject)this.accept(elem.getFType());
		knode.getProperties().put("type",result);
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage node) {
		ppPackageContents(node);
/*		String result = "package " + ppIdentifier(node.getFName()) + "\n";
		result += getPrefix() + "{\n";
		String old_cname = current_pname;
		current_pname = getQualifiedName(node);
		pushPrefix();
		result += ppCRSeparatedNode(node.getFOwnedTypeDefinition());
		result += ppCRSeparatedNode(node.getFNestedPackage());
		popPrefix();
		current_pname = old_cname;
		result += getPrefix() + "}\n";*/
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProductType)
	 */
	public Object visit(FProductType node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::ProductType");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		RuntimeObject productMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::ProductType");
		FClassDefinition productClassDef=((FClass)productMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		FProperty type=findProperty(productClassDef,"type");
		RuntimeObject types =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(type));
		knode.getProperties().put("type",types);
		this.currentTypesList=types;
		ppTypesNode(node.getFType());
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::Property");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		if (node.isFIsComposite())
			knode.getProperties().put("icComposite",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		if (node.isFIsDerived())
			knode.getProperties().put("icDerived",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		if (node.isFIsReadOnly())
			knode.getProperties().put("icReadOnly",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		knode.getProperties().put("name",ppTypeFromMultiplicityElement(node));
//TODO manage opposites in a second pass of KMBuilder ?
		if (node.getFOpposite() != null)
			knode.getProperties().put("opposite",node.getFOpposite().getFName());
		if (node.isFIsDerived()) {
			if (node.getFGetterbody() != null)
				knode.getProperties().put("getterBody",this.accept(node.getFGetterbody()));
			if (! node.isFIsReadOnly()) {
				if (node.getFSetterbody() != null)
					knode.getProperties().put("setterBody",this.accept(node.getFSetterbody()));
			}
		}
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRaise)
	 */
	public Object visit(FRaise node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::Raise");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("raise",this.accept(node.getFExpression()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FSelfExpression)
	 */
	public Object visit(FSelfExpression node) {
		return Run.selfINSTANCE;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FSelfType)
	 */
	public Object visit(FSelfType node) {
		return Run.selfINSTANCE;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
	public Object visit(FStringLiteral node) {
	    RuntimeObject rnode = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFValue(),Run.koFactory);
		Run.correspondanceTable.put(node,rnode);
		return rnode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
	public Object visit(FTypeLiteral node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::TypeLiteral");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("typeref",this.accept(node.getFTyperef()));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::TypeReference");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("type",ppTypeFromMultiplicityElement(node));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
	public Object visit(FTypeVariable node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::TypeVariable");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVariableDecl)
	 */
	public Object visit(FVariableDecl node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::VariableDecl");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("identifier",node.getFIdentifier());
		knode.getProperties().put("type",this.accept(node.getFType()));
		if (node.getFInitialization() != null)
			knode.getProperties().put("initialization",this.accept(node.getFInitialization()));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVoidLiteral)
	 */
	public Object visit(FVoidLiteral node) {
	    
		return Run.voidINSTANCE;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visit(FVoidType node) {
		return Run.voidINSTANCE;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
	public Object visit(FCallFeature node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallFeature");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		if (node.getFTarget() != null)
			knode.getProperties().put("target",this.accept(node.getFTarget()));
		else knode.getProperties().put("target",Run.selfINSTANCE);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
			FClassDefinition callExprClassDef=((FClass)exprCallMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty parameters=findProperty(callExprClassDef,"parameters");
			RuntimeObject parametersNode=ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(parameters));
			knode.getProperties().put("parameters",parametersNode);
			this.currentParamList=parametersNode;
			ppCRSeparatedNode(node.getFParameters());
		}
		return knode;
	}
	
	
	
	/**
	 * @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.FCallResult)
	 */
	public Object visit(FCallResult node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallResult");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallVariable)
	 */
	public Object visit(FCallVariable node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallVariable");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
			FClassDefinition callExprClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty parameters=findProperty(callExprClassDef,"parameters");
			RuntimeObject parametersNode=ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(parameters));
			knode.getProperties().put("parameters",parametersNode);
			this.currentParamList=parametersNode;
			ppCRSeparatedNode(node.getFParameters());
		}
		return knode;
	}
	
    /**
     * FTag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FTag)
     */
    public Object visit(FTag node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::Tag");
		RuntimeObject knode=KMMetaBuilder.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),Run.koFactory));
		knode.getProperties().put("value",node.getFValue());
        return knode;
    }
    
/*	protected String prefix = "";
	
	protected String getPrefix() {
		return prefix;
	}
	
	protected void pushPrefix() {
		prefix = prefix + "\t";
	}
	
	protected void popPrefix() {
		prefix = prefix.substring(1);
	}
	/**
	 * @return Returns the imports.
	 */
/*	public ArrayList getImports() {
//		return imports;
		return null;
	}
	/**
	 * @return Returns the usings.
	 */
/*	public ArrayList getUsings() {
//		return usings;
		return null;
	}
	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
	public String getQualifiedName(FNamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + ppIdentifier(element.getFName());
		else return element.getFName();
	}
	
	/**
	 * Get a list of tag which name is <code>name</code>
	 * Later, we will think about the relevance of having not unique tags (depends on how we handle
	 * code documentation => extern system, or integrated?)
	 */
	public FTag[] getFTagsByName(EList ftagList, String name)
	{
	    Iterator it = ftagList.iterator();
	    FTag[] result_tagArray = new FTag[10];
	    int i = 0;
	    while (it.hasNext())
	    {
	        FTag tag = (FTag)it.next();
	        if (tag.getFName().equals(name))
	        {
	            result_tagArray[i] = tag;
	            i++;
	        }
	    }
	    return result_tagArray;
	}
	
}

