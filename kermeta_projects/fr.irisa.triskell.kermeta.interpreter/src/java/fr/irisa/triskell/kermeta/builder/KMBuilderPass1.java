/* $Id: KMBuilderPass1.java,v 1.1 2005-03-22 12:56:08 jpthibau Exp $
 * Project : Kermeta (First iteration)
 * File : KM2KMTPrettyPrinter.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 * Description :
 * 	Prints a kermeta model into a human-readable form (which is KMT)
 * 
 * 
*/
package fr.irisa.triskell.kermeta.builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.reflect.KMReflect;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.structure.*;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;



/**
 *
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
		}
		FClass fclass=(FClass)property.getFType();
		String qn=KMReflect.getQualifiedName((FNamedElement)fclass.getFClassDefinition());
		RuntimeObject type=(RuntimeObject)Run.koFactory.getClassDefTable().get(qn);
//		RuntimeObject type=(RuntimeObject)Run.koFactory.getClassDefTable().get(KMReflect.getQualifiedName((FNamedElement)property.getFType()));
		result.getProperties().put("type",type);
		return result;
	}

//	protected Hashtable allMetaClasses;
//	protected Hashtable allClasses;
	protected Stack packagesStack;
	protected RuntimeObject currentClassNode;
	protected RuntimeObject currentOperationNode;
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
		RuntimeObject pMetaclass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::reflection::Package");
		FClassDefinition packClassDef=(FClassDefinition)pMetaclass.getData().get("FClassDefinition");
		RuntimeObject pNode=new RuntimeObject(pMetaclass.getFactory(),pMetaclass);//.instanciate(KMReflect.allAttributes(pMetaclass));
		Hashtable data=new Hashtable();
		data.put("kcoreObject",p);
		pNode.setData(data);
		pNode.getProperties().put("ownedTypeDefinition",Collection.createCollection((RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::language::structure::Type")));
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
		pNode.getProperties().put("nestedPackage",ReflectiveCollection.createReflectiveCollection(pNode,createPropertyNode(nestedPackage)));
		if (! this.packagesStack.isEmpty())
			pNode.getProperties().put("container",this.packagesStack.peek());
		this.packagesStack.push(pNode);
		ppCRSeparatedNode(p.getFNestedPackage());
		pNode.getProperties().put("ownedTypeDefinition",ReflectiveCollection.createReflectiveCollection(pNode,createPropertyNode(ownedTypeDefinition)));
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
		String left = this.accept(node.getFTarget()).toString();
		String right = this.accept(node.getFValue()).toString();
		String op = (node.isFIsCast())?"?":":";
		return left + " " + op + "= " + right;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {
		String result = "do\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFStatement());
		popPrefix();
		Iterator it = node.getFRescueBlock().iterator();
		while(it.hasNext()) {
			result += getPrefix() + this.accept((FRescue)it.next()) + "\n";
		}
		result += getPrefix() + "end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRescue)
	 */
	public Object visit(FRescue node) {
		String result = "rescue";
		if (node.getFExceptionName() != null) {
			result += "(" + node.getFExceptionName() + " : " + this.accept(node.getFExceptionType()) + ")";
		}
		result += "\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFBody());
		popPrefix();
		return result;
	}
	
	public void ppCRSeparatedNode(EList expressions) {
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			this.accept((EObject)it.next());
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral)
	 */
	public Object visit(FBooleanLiteral node) {
		return ""+node.isFValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallSuperOperation)
	 */
	public Object visit(FCallSuperOperation node) {
		String result = "super(";
		result += ppCRSeparatedNode(node.getFParameters());
		result += ")";
		return result;
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
		String qname = getQualifiedName(node.getFClassDefinition());
		String name = ppIdentifier(node.getFClassDefinition().getFName());
		String result = ppTypeName(qname, name);
		if (node.getFTypeParamBinding().size() > 0) {
			result += "<" + ppCRSeparatedNode(node.getFTypeParamBinding()) + ">";
		}
		return result;
	}
	
	protected String ppTypeName(String qname, String name) {
		String result = "";
		if (qname.equals(current_pname + "::" + name)) result += name;
		else {
			for(int i=0; i<usings.size(); i++) {
				if (qname.equals(usings.get(i) + "::" + name)) {
					result += name;
					break;
				}
			}
			if (qname.startsWith(root_pname))
				result += qname.substring(root_pname.length() + 2);
		}
		if (result.equals("")) result += qname;
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visit(FTypeVariableBinding node) {
		return this.accept(node.getFType());
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Class");
		FClassDefinition nodeClassDef=(FClassDefinition)nodeMetaclass.getData().get("FClassDefinition");
		RuntimeObject objectMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Object");
		FClassDefinition objectClassDef=(FClassDefinition)objectMetaclass.getData().get("FClassDefinition");
		RuntimeObject knode=nodeMetaclass.getFactory().createClassFromClassDefinition(nodeMetaclass);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
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
		RuntimeObject test=Boolean.TRUE;
		if (node.isFIsAbstract())
			properties.put("isAbstract",Boolean.FALSE);
		else properties.put("isAbstract",Boolean.TRUE);
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
		if (typedef == true) {
			typedef = false;
			String result = "alias " + node.getFName() + " : " + this.accept(node.getFInstanceType()) + ";";
			typedef = true;
			return result;
		}
		else {
			String qname = getQualifiedName(node);
			String name = ppIdentifier(node.getFName());
			String result = ppTypeName(qname, name);
			return result;
		}
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
		String result = "if " + this.accept(node.getFCondition()) + " then\n";
		pushPrefix();
		if (node.getFThenBody() != null) result += getPrefix() + this.accept(node.getFThenBody()) + "\n";
		popPrefix();
		if (node.getFElseBody() != null) {
			result += getPrefix() + "else\n";
			pushPrefix();
			result +=  getPrefix() + this.accept(node.getFElseBody()) + "\n";
			popPrefix();
		}
		result += getPrefix() + "end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration node) {
		if (typedef == true) {
			typedef = false;
			String result = "enumeration " + ppIdentifier(node.getFName()) + "\n";
			result += getPrefix() + "{\n";
			pushPrefix();
			result += ppCRSeparatedNode(node.getFOwnedLiteral());
			popPrefix();
			result += getPrefix() + "}";
			typedef = true;
			return result;
		}
		else {
			String qname = getQualifiedName(node);
			String name = ppIdentifier(node.getFName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral node) {
		return ppIdentifier(node.getFName()) + ";";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visit(FFunctionType node) {
		return "< " + this.accept(node.getFLeft()) + "->" + this.accept(node.getFRight()) + " >";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral)
	 */
	public Object visit(FIntegerLiteral node) {
		return "" + node.getFValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
		String result = "extern " + node.getFJclass() + "." + ppIdentifier(node.getFJmethod()) + "(";
		result += ppCRSeparatedNode(node.getFParameters());
		result += ")";
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaExpression)
	 */
	public Object visit(FLambdaExpression node) {
		String result = "function {";
		System.out.println("nodes:"+node.getFParameters());
		result += ppCRSeparatedNode(node.getFParameters());
		result += " | ";
		pushPrefix();
		result += this.accept(node.getFBody());
		popPrefix();
		result += "}";
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaParameter)
	 */
	public Object visit(FLambdaParameter node) {
		String result = ppIdentifier(node.getFName());
		if (node.getFType() != null) {
			result += " : " + this.accept(node.getFType());
		}
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLoop)
	 */
	public Object visit(FLoop node) {
		String result = "from " ; 
		result += this.accept(node.getFInitiatization()) + "\n";
		result += getPrefix() + "until " + this.accept(node.getFStopCondition()) + "\n";
		result += getPrefix() +"loop\n";
		pushPrefix();
		result += this.accept(node.getFBody());
		popPrefix();
		result += getPrefix() +"end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		RuntimeObject nodeMetaclass=(RuntimeObject)Run.koFactory.getTypeDefinitionByName("kermeta::reflection::Operation");
		FClassDefinition nodeClassDef=(FClassDefinition)nodeMetaclass.getData().get("FClassDefinition");
		RuntimeObject knode=nodeMetaclass.getFactory().createClassFromClassDefinition(nodeMetaclass);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		this.currentOperationNode=knode;
		RuntimeObject opList=(RuntimeObject)this.currentClassNode.getProperties().get("ownedOperation");
		ReflectiveCollection.add(opList,knode);
		Hashtable properties=knode.getProperties();
		FProperty ownedParameter=null;
		Iterator it=nodeClassDef.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			FProperty property=(FProperty)it.next();
			if (property.getFName().equals("ownedParameter"))
				ownedParameter=property;
		}
		properties.put("name",node.getFName());
		if (node.getFTypeParameter().size() > 0)
			properties.put("typeParamBinding",ppTypeVariableDeclaration(node.getFTypeParameter()));
		properties.put("FOwnedParameter",ReflectiveCollection.createReflectiveCollection(knode,createPropertyNode(ownedParameter)));	
		ppCRSeparatedNode(node.getFOwnedParameter());
		if(node.getFType() != null)
			properties.put("type",ppTypeFromMultiplicityElement(node));
	
		if (node.getFSuperOperation() != null) {
			properties.put("SuperOperation",ppIdentifier(getQualifiedName(node.getFSuperOperation().getFOwningClass())));
		}
		if (node.getFRaisedException().size() > 0) {
			properties.put("raisedException",ppCRSeparatedNode(node.getFRaisedException()));
		}
		if (node.getFBody() != null) {
			properties.put("FBody",ReflectiveCollection.createReflectiveCollection(nodeMetaclass,Run.koFactory.getTypeDefinitionByName("kermeta::language::structure::Instruction")));	
			this.accept(node.getFBody());
		}
		else if (node.isFIsAbstract())
			properties.put("isAbstract",Boolean.TRUE);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visit(FParameter node) {
		return ppIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
	}
	
	public String ppTypeFromMultiplicityElement(FMultiplicityElement elem) {
		String result = "";
		if (elem.getFUpper() != 1) {
			if (elem.isFIsOrdered()) {
				if (!elem.isFIsUnique()) result +="seq ";
			}
			else {
				if (elem.isFIsUnique()) result +="set ";
				else result +="bag ";
			}
		}
		result += this.accept(elem.getFType());
		if (elem.getFLower() != 0 || elem.getFUpper() != 1) {
			result += "[" + elem.getFLower() + "..";
			result += (elem.getFUpper()<0)?"*":""+elem.getFUpper();
			result += "]";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage node) {
		String result = "package " + ppIdentifier(node.getFName()) + "\n";
		result += getPrefix() + "{\n";
		String old_cname = current_pname;
		current_pname = getQualifiedName(node);
		pushPrefix();
		result += ppCRSeparatedNode(node.getFOwnedTypeDefinition());
		result += ppCRSeparatedNode(node.getFNestedPackage());
		popPrefix();
		current_pname = old_cname;
		result += getPrefix() + "}\n";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProductType)
	 */
	public Object visit(FProductType node) {
		String result = "[" + ppCRSeparatedNode(node.getFType()) + "]";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		String result = "";
		if (node.isFIsComposite()) result += "attribut ";
		else if (node.isFIsDerived()) result += "property ";
		else result += "reference ";
		if (node.isFIsReadOnly()) result += "readonly ";
		result += ppIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getFOpposite() != null) result += "#" + ppIdentifier(node.getFOpposite().getFName());
		if (node.isFIsDerived()) {
			pushPrefix();
			result += "\n" + getPrefix() + "getter is " ;
			if (node.getFGetterbody() != null) result += this.accept(node.getFGetterbody());
			else {
				result += "do\n";
				pushPrefix();
				result += getPrefix() + "//TODO: implement getter for derived property " + node.getFName() + "\n"; 
				popPrefix();
				result += getPrefix() + "end";
			}
			if (! node.isFIsReadOnly()) {
				result += "\n" + getPrefix() + "setter is ";
				if (node.getFGetterbody() != null) result += this.accept(node.getFSetterbody());
				else {
					result += "do\n";
					pushPrefix();
					result += getPrefix() + "//TODO: implement setter for derived property " + node.getFName() + "\n"; 
					popPrefix();
					result += getPrefix() + "end";
				}
			}
			popPrefix();
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRaise)
	 */
	public Object visit(FRaise node) {
		return "raise " + this.accept(node.getFExpression());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FSelfExpression)
	 */
	public Object visit(FSelfExpression node) {
		return "self";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FSelfType)
	 */
	public Object visit(FSelfType node) {
		return "Self";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
	public Object visit(FStringLiteral node) {
		return "\"" + node.getFValue() +"\""; //TODO : escape characters ?
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
	public Object visit(FTypeLiteral node) {
		return this.accept(node.getFTyperef());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
		return ppTypeFromMultiplicityElement(node);
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
	public Object visit(FTypeVariable node) {
		return ppIdentifier(node.getFName());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVariableDecl)
	 */
	public Object visit(FVariableDecl node) {
		String result = "var " + ppIdentifier(node.getFIdentifier()) + " : " + this.accept(node.getFType());
		if (node.getFInitialization() != null)
			result += " init " + this.accept(node.getFInitialization());
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVoidLiteral)
	 */
	public Object visit(FVoidLiteral node) {
		return "void";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visit(FVoidType node) {
		return "Void";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
	public Object visit(FCallFeature node) {
		String result = "";
		if (node.getFTarget() != null) result += this.accept(node.getFTarget());
		else result += "self";
		result += "." + ppIdentifier(node.getFName());
		if (node.getFParameters().size()> 0) {
			result += "(" + ppCRSeparatedNode(node.getFParameters()) + ")";
		}
		return result;
	}
	
	
	
	/**
	 * @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.FCallResult)
	 */
	public Object visit(FCallResult node) {
		return "result";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallVariable)
	 */
	public Object visit(FCallVariable node) {
		String result = ppIdentifier(node.getFName());
		if (node.getFParameters().size()> 0) {
			result += "(" + ppCRSeparatedNode(node.getFParameters()) + ")";
		}
		return result;
	}
	
    /**
     * FTag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FTag)
     */
    public Object visit(FTag node) {
        String result = "";
        //result = "@pre : \"" + node.getFValue() + "\"";
        result = "/*{"+node.getFName()+"}*/\r\n"+ node.getFValue() + "\n";
        return result;
    }
    
	protected String prefix = "";
	
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
	public ArrayList getImports() {
		return imports;
	}
	/**
	 * @return Returns the usings.
	 */
	public ArrayList getUsings() {
		return usings;
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

