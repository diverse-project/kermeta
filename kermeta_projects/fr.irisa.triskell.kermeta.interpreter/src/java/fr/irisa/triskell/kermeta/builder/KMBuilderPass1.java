/* $Id: KMBuilderPass1.java,v 1.19 2005-05-12 08:19:46 zdrey Exp $
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
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
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

    // The KermetaUnit for which this builder will construct a Runtime representation
    protected KermetaUnit unit = null;
    
    protected RuntimeMemory memory;
    // The facade loader
    protected RuntimeLoader runtimeLoader;
    // The runtime object factory; a simple reference to the factory stored in the runtimeLoader
    private RuntimeObjectFactory roFactory;
    
	public KMBuilderPass1(KermetaUnit pUnit, RuntimeLoader pLoader) {
		super();
		this.unit = pUnit;
		this.runtimeLoader = pLoader;
		this.memory = runtimeLoader.getRuntimeMemory();
		this.roFactory = runtimeLoader.getRuntimeMemory().getROFactory();
	}
    
    
    /**
     * Non-recursive method to get a property in a given classDef
     * @param classDef
     * @param propertyName
     * @return
     */
	public static FProperty findProperty(FClassDefinition classDef,String propertyName) {
		Iterator it=classDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals(propertyName))
				return property;
		}
		return null;
	}
	
	
	
	/**
	 * Create a RuntimeObject corresponding to the FProperty given as argument
	 * @param property
	 * @return
	 */
	public RuntimeObject createPropertyNode(FProperty property)
	{
	    // Create the meta class of the type FProperty
		RuntimeObject result;
		RuntimeObjectFactory roFactory = memory.getROFactory();
		RuntimeObject propertyMetaclass=(RuntimeObject)roFactory.getClassDefTable().get("kermeta::reflection::Property");
		result=new RuntimeObject(propertyMetaclass.getFactory(),propertyMetaclass);
		result.setData(new Hashtable());
		result.getData().put("kcoreObject",property);
		
		// Set the properties of the type FProperty
		if (property.isFIsComposite())
			result.getProperties().put("isComposite",Boolean.TRUE);
		
		if (property.isFIsDerived())
			result.getProperties().put("isDerived",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		if (property.isFIsReadOnly())
			result.getProperties().put("isReadOnly",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);

		if (property.getFOpposite()!=null)
		{
			FProperty opposite=property.getFOpposite();
			RuntimeObject oppositeNode=new RuntimeObject(propertyMetaclass.getFactory(),propertyMetaclass);
			oppositeNode.setData(new Hashtable());
			oppositeNode.getData().put("kcoreObject",opposite);
			result.getProperties().put("opposite",oppositeNode);
			oppositeNode.getProperties().put("opposite",result);
			oppositeNode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(opposite.getFName(),roFactory));
			oppositeNode.getProperties().put("upper",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(opposite.getFUpper(),roFactory));
			oppositeNode.getProperties().put("lower",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(opposite.getFLower(),roFactory));
		}
		
		// Set the "basic properties"
		FClass fclass=(FClass)property.getFType();
		String qn=KMReflect.getQualifiedName((FNamedElement)fclass.getFClassDefinition());
		RuntimeObject type=(RuntimeObject)roFactory.getClassDefTable().get(qn);
		result.getProperties().put("type",type);
		result.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(property.getFName(),roFactory));
		result.getProperties().put("upper",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(property.getFUpper(),roFactory));
		result.getProperties().put("lower",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(property.getFLower(),roFactory));
		
		// Set the slight more complex properties ???
//		TODO manage opposites in a second pass of KMBuilder ?
	/*	if (property.getFOpposite() != null)
			result.getProperties().put("opposite",property.getFOpposite().getFName());
		if (property.isFIsDerived()) {
			if (property.getFGetterbody() != null)
				result.getProperties().put("getterBody",this.accept(property.getFGetterbody()));
			if (! property.isFIsReadOnly()) {
				if (property.getFSetterbody() != null)
					result.getProperties().put("setterBody",this.accept(property.getFSetterbody()));
			}
		}
		*/
		
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
		reflectivecollectionMetaclass=(RuntimeObject)memory.getROFactory().getTypeDefinitionByName("kermeta::language::reflective_collections::ReflectiveCollection");
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
		RuntimeObjectFactory roFactory = memory.getROFactory();
		RuntimeObject pMetaclass=(RuntimeObject)roFactory.getClassDefTable().get("kermeta::reflection::Package");
		FClassDefinition packClassDef=((FClass)pMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=runtimeLoader.createROFromClassDef(p,pMetaclass);
		knode.getProperties().put("ownedTypeDefinition",Collection.createCollection((RuntimeObject)roFactory.getClassDefTable().get("kermeta::language::structure::Type")));
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::Assignement");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("left",this.accept(node.getFTarget()));
		knode.getProperties().put("right",this.accept(node.getFValue()));
		knode.getProperties().put("op",(node.isFIsCast())?"?":":");
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::Block");
		FClassDefinition blockClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::Rescue");
		FClassDefinition rescueClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
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
		RuntimeObject ronode= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(node.isFValue(),roFactory);
		memory.getCorrespondanceTable().put(node,ronode);
		return ronode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallSuperOperation)
	 * 
	 */
	public Object visit(FCallSuperOperation node) {
	    RuntimeObjectFactory roFactory = memory.getROFactory();
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallSuperOperation");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		if (node.getFParameters().size()> 0) {
			RuntimeObject callExprMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
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
	 * A FClass is visited only when we visit a parametric class, or the type of a variable
	 * declaration, of the type of a parameter (when creating an instance of a parametric class)
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node)
	{   
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::Class");
		// Create the runtimeObject corresponding to the class Class
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",getQualifiedName(node.getFClassDefinition()));
		this.currentFClassNode=knode;
		
		// If the given class is a parametric class, then, we bind the parameters
		if (node.getFTypeParamBinding().size() > 0)
		{
		    // Get class definition of the class Class
			FClassDefinition classClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			FProperty typeParamBinding=null;
			Iterator it=classClassDef.getFOwnedAttributes().iterator();
			// Get the property "typeParamBinding" of class Class ...
			while(it.hasNext())
			{
			    
				FProperty property=(FProperty)it.next();
				if (property.getFName().equals("typeParamBinding"))
					typeParamBinding=property;
			}
			// ... In order to create the property "typeParamBinding"
			RuntimeObject types =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(typeParamBinding));
			knode.getProperties().put("typeParamBinding",types);
			this.currentTypesList=types;
			ppTypesNode(node.getFTypeParamBinding());
		}
		// If the given class is not a parametric class
/*		else
		{
		    
		}
	*/
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visit(FTypeVariableBinding node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::TypeVariableBinding");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("type",this.accept(node.getFType()));
		return knode;
	}
	
	/** 
	 * Create the RuntimeObject corresponding to the fClassDefinition <code>node</code>?
	 * 
	 * @return null
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node)
	{
		//System.out.println("Visiting class definition "+node.getFName());
	    
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::Class");
		FClassDefinition nodeClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject objectMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::Object");
		FClassDefinition objectClassDef=((FClass)objectMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		
		// Affect currentClassNode
		this.currentClassNode=knode;
		String qualifiedName=KMReflect.getQualifiedName(node);
		
		// Add the class definition the the class def table of RuntimeObjectFactory
		roFactory.getClassDefTable().put(qualifiedName,knode);
		RuntimeObject owningPackage=(RuntimeObject)this.packagesStack.peek();
		ReflectiveCollection.add((RuntimeObject)owningPackage.getProperties().get("ownedTypeDefinition"),knode);

		// Set the RuntimeObject representation of the classDef properties
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
		while(it.hasNext())
		{
		    
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
		
		// Add RuntimeObject equivalents of isAbstract, name, and typeParamBinding properties
		if (node.isFIsAbstract())
			properties.put("isAbstract",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.FALSE);
		else properties.put("isAbstract",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		properties.put("name",node.getFName());
		
		if (node.getFTypeParameter().size() > 0)
			properties.put("typeParameter",ppTypeVariableDeclaration(node.getFTypeParameter()));

		// Add ownedAttribute property : create a RuntimeObject repr. the (Reflective) 
		// collection of attributes for this classDef
		properties.put("ownedAttribute", ReflectiveCollection.createReflectiveCollection(
		        knode,
		        createPropertyNode(ownedAttribute)));
		
		ppCRSeparatedNode(node.getFOwnedAttributes());

		// Idem, for ownedOperation
		properties.put("ownedOperation", ReflectiveCollection.createReflectiveCollection(
		        knode,
		        createPropertyNode(ownedOperation)));
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::PrimitiveType");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::Conditionnal");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
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
			RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::Enumeration");
			FClassDefinition enumerationClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
			knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
			knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
			FProperty ownedLiteral=findProperty(enumerationClassDef,"ownedLiteral");
			RuntimeObject literals =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedLiteral));
			knode.getProperties().put("ownedLiteral",literals);
			this.currentEnumeration=literals;
			ppCRSeparatedNode(node.getFOwnedLiteral());
			roFactory.getClassDefTable().put(qname,knode);
		}
		else
			knode=(RuntimeObject)roFactory.getClassDefTable().get(qname);
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::structure::EnumerationLiteral");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		RuntimeObject literalsList=this.currentEnumeration;
		ReflectiveCollection.add(literalsList,knode);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visit(FFunctionType node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::structure::FunctionType");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("left",this.accept(node.getFLeft()));
		knode.getProperties().put("right",this.accept(node.getFRight()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral)
	 */
	public Object visit(FIntegerLiteral node) {
		RuntimeObject knode= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFValue(),roFactory);
		memory.getCorrespondanceTable().put(node,knode);
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::JavaStaticCall");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("Jclass",node.getFJclass());
		knode.getProperties().put("Jmethod",node.getFJmethod());
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::LambdaExpression");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::LambdaParameter");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::Loop");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("initialization",this.accept(node.getFInitiatization()));
		knode.getProperties().put("stopCondition",this.accept(node.getFStopCondition()));
		knode.getProperties().put("body",this.accept(node.getFBody()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node)
	{
		//System.out.println("Visiting Operation "+node.getFName());
	    // Create the RuntimeObject for the FOperation type
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::Operation");
		FClassDefinition nodeClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		this.currentOperationNode=knode;
		
		// Create the RuntimeObject operation equivalent of the visited FOperation
		// and at it to the collection of operation for the currently visited ClassDefinition
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::Parameter");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		RuntimeObject paramList=this.currentParamList;
		ReflectiveCollection.add(paramList,knode);
		return null;
	}
	
	public RuntimeObject ppTypeFromMultiplicityElement(FMultiplicityElement elem) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::MultiplicityElement");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(elem,nodeMetaclass);
		knode.getProperties().put("lower",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(elem.getFLower(),roFactory));
		knode.getProperties().put("upper",fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(elem.getFUpper(),roFactory));
		knode.getProperties().put("isOrdered",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(elem.isFIsOrdered(),roFactory));
		knode.getProperties().put("isUnique",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(elem.isFIsUnique(),roFactory));
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::structure::ProductType");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		RuntimeObject productMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::reflection::ProductType");
		FClassDefinition productClassDef=((FClass)productMetaclass.getData().get("kcoreObject")).getFClassDefinition();
		FProperty type=findProperty(productClassDef,"type");
		RuntimeObject types =ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(type));
		knode.getProperties().put("type",types);
		this.currentTypesList=types;
		ppTypesNode(node.getFType());
		return knode;
	}
	
	/**
	 * FIXME : Why do we not use the createPropertyNode method?
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node)
	{
	    // Get the RuntimeObject repr. of The type FProperty
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::structure::Property");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		
		// Set the RuntimeObject equivalents of the Properties of the FProperty type
		if (node.isFIsComposite())
			knode.getProperties().put("isComposite",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		if (node.isFIsDerived())
			knode.getProperties().put("isDerived",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		if (node.isFIsReadOnly())
			knode.getProperties().put("isReadOnly",fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.TRUE);
		
		// Set the "type" of FProperty
		RuntimeObject ro_type = (RuntimeObject)this.accept(node.getFType());
		knode.getProperties().put("type",ro_type);
		
		knode.getProperties().put("upper", fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFUpper(), roFactory));
		knode.getProperties().put("lower", fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFLower(), roFactory));
		knode.getProperties().put("name", fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
		
		//		TODO manage opposites in a second pass of KMBuilder ?
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
		// Add the RuntimeObject of the visited Property to the list of runtime-properties of
		// the currently visited classDefinition
		RuntimeObject opList=(RuntimeObject)this.currentClassNode.getProperties().get("ownedAttribute");
		ReflectiveCollection.add(opList,knode);
		
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRaise)
	 */
	public Object visit(FRaise node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::Raise");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("raise",this.accept(node.getFExpression()));
		return knode;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FSelfExpression)
	 */
	public Object visit(FSelfExpression node) {
		return memory.selfINSTANCE;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FSelfType)
	 */
	public Object visit(FSelfType node) {
		return memory.selfINSTANCE;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
	public Object visit(FStringLiteral node) {
	    RuntimeObject rnode = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFValue(),roFactory);
	    memory.getCorrespondanceTable().put(node,rnode);
		return rnode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
	public Object visit(FTypeLiteral node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::TypeLiteral");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("typeref",this.accept(node.getFTyperef()));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::TypeReference");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("type",ppTypeFromMultiplicityElement(node));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
	public Object visit(FTypeVariable node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::structure::TypeVariable");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVariableDecl)
	 */
	public Object visit(FVariableDecl node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::VariableDecl");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
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
		return memory.voidINSTANCE;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visit(FVoidType node) {
		return memory.voidINSTANCE;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
	public Object visit(FCallFeature node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallFeature");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		if (node.getFTarget() != null)
			knode.getProperties().put("target",this.accept(node.getFTarget()));
		else knode.getProperties().put("target",memory.selfINSTANCE);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
		if (node.getFParameters().size()> 0) {
			RuntimeObject exprCallMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallResult");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		return knode;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallVariable)
	 */
	public Object visit(FCallVariable node)
	{
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallVariable");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
		
		// If variable has parameters
		if (node.getFParameters().size()> 0)
		{
			RuntimeObject exprCallMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::behavior::CallExpression");
			FClassDefinition callExprClassDef=((FClass)nodeMetaclass.getData().get("kcoreObject")).getFClassDefinition();

			// parameters is a property of any CallExpression - here, recursive search of this prop.
			FProperty parameters=unit.findPropertyByName(callExprClassDef,"parameters");
			// parameters is null?
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
		RuntimeObject nodeMetaclass=(RuntimeObject)roFactory.getTypeDefinitionByName("kermeta::language::structure::Tag");
		RuntimeObject knode=runtimeLoader.createROFromClassDef(node,nodeMetaclass);
		knode.getProperties().put("name",fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFName(),roFactory));
		knode.getProperties().put("value",node.getFValue());
        return knode;
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

