/* $Id: KMMetaBuilder.java,v 1.3 2005-03-11 08:36:07 jpthibau Exp $
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
import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.structure.*;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;



/**
 *
 */
public class KMMetaBuilder extends KermetaVisitor {

	protected Hashtable allMetaClasses;
	protected Stack packageNamesStack;
	protected KermetaObject currentClassNode;
	
	
	public Hashtable ppPackage(KermetaUnit unit) {
		allMetaClasses=new Hashtable();
		String currentpackageName=unit.getQualifiedName(unit.rootPackage);
		List packagesNames=new ArrayList();
		packagesNames.add(currentpackageName);
		this.packageNamesStack=new Stack();
		ppPackageContents(unit.rootPackage,currentpackageName);
		ppPackageImportedpackagess(unit,packagesNames);
		return allMetaClasses;
	}

	public void ppPackageImportedpackagess(KermetaUnit unit,List packagesNames) {
		Iterator it = unit.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			String iuName=iu.getQualifiedName(iu.rootPackage);
			if ( !packagesNames.contains(iuName)) {
				packagesNames.add(iuName);
				this.packageNamesStack=new Stack();
				ppPackageContents(iu.rootPackage,iuName);
				ppPackageImportedpackagess(iu,packagesNames);
			}
		}
	}

	public void ppPackageContents(FPackage p,String packageName) {
		this.packageNamesStack.push(packageName);
		ppCRSeparatedNode(p.getFOwnedTypeDefinition());
		ppCRSeparatedNode(p.getFNestedPackage());
		this.packageNamesStack.pop();
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
/*	public Object visit(FAssignement node) {
		String left = this.accept(node.getFTarget()).toString();
		String right = this.accept(node.getFValue()).toString();
		String op = (node.isFIsCast())?"?":":";
		return left + " " + op + "= " + right;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
/*	public Object visit(FBlock node) {
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
/*	public Object visit(FRescue node) {
		String result = "rescue";
		if (node.getFExceptionName() != null) {
			result += "(" + node.getFExceptionName() + " : " + this.accept(node.getFExceptionType()) + ")";
		}
		result += "\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFBody());
		popPrefix();
		return result;
	}*/
	
	public void ppCRSeparatedNode(EList expressions) {
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			this.accept((EObject)it.next());
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral)
	 */
/*	public Object visit(FBooleanLiteral node) {
		return ""+node.isFValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallSuperOperation)
	 */
/*	public Object visit(FCallSuperOperation node) {
		String result = "super(";
		result += ppComaSeparatedNodes(node.getFParameters());
		result += ")";
		return result;
	}
	
	public String ppComaSeparatedNodes(EList expressions) {
		String result = "";
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			EObject o = (EObject)it.next();
			result += this.accept(o);
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
		this.currentClassNode.getProperties().put("InstanceType",node);
		return null;
	}
	
/*	protected String ppTypeName(String qname, String name) {
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
/*	public Object visit(FTypeVariableBinding node) {
		return this.accept(node.getFType());
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		KermetaObject knode=Run.kermetaObjectFactory.createKermetaObject(Run.interpreter);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		knode.getProperties().put("FOwnedAttributes",new Hashtable());
		knode.getProperties().put("FOwnedOperation",new Hashtable());
		this.currentClassNode=knode;
		String qualifiedPrefix="";
		Iterator it=this.packageNamesStack.iterator();
		while (it.hasNext())
			qualifiedPrefix=qualifiedPrefix.concat((String)it.next())+"::";
		this.allMetaClasses.put(qualifiedPrefix+node.getFName(),knode);

		// Get the pre Annotation of this class 
		if (node.getFTag().size()>0)
		{
		    FTag[] pretagArray = this.getFTagsByName(node.getFTag(), KMT2KMPass.PRE_TAGNAME);
		    for (int i=0; i< pretagArray.length && pretagArray[i]!=null; i++)
		    {
		        this.accept((EObject)pretagArray[i]);
		    }
		}
		
		
		ppCRSeparatedNode(node.getFOwnedAttributes());
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
		KermetaObject knode=Run.kermetaObjectFactory.createKermetaObject(Run.interpreter);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		this.currentClassNode=knode;
		String qualifiedPrefix="";
		Iterator it=this.packageNamesStack.iterator();
		while (it.hasNext())
			qualifiedPrefix=qualifiedPrefix.concat((String)it.next())+"::";
		this.allMetaClasses.put(qualifiedPrefix+node.getFName(),knode);
		this.accept(node.getFInstanceType());
		return null;
	}
	
/*	public String ppTypeVariableDeclaration(EList tparams) {
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
/*	public Object visit(FConditionnal node) {
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
/*	public Object visit(FEnumeration node) {
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
/*	public Object visit(FEnumerationLiteral node) {
		return ppIdentifier(node.getFName()) + ";";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
/*	public Object visit(FFunctionType node) {
		return "< " + this.accept(node.getFLeft()) + "->" + this.accept(node.getFRight()) + " >";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral)
	 */
/*	public Object visit(FIntegerLiteral node) {
		return "" + node.getFValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
/*	public Object visit(FJavaStaticCall node) {
		String result = "extern " + node.getFJclass() + "." + ppIdentifier(node.getFJmethod()) + "(";
		result += ppComaSeparatedNodes(node.getFParameters());
		result += ")";
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaExpression)
	 */
/*	public Object visit(FLambdaExpression node) {
		String result = "function {";
		System.out.println("nodes:"+node.getFParameters());
		result += ppComaSeparatedNodes(node.getFParameters());
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
/*	public Object visit(FLambdaParameter node) {
		String result = ppIdentifier(node.getFName());
		if (node.getFType() != null) {
			result += " : " + this.accept(node.getFType());
		}
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLoop)
	 */
/*	public Object visit(FLoop node) {
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
		KermetaObject knode=Run.kermetaObjectFactory.createKermetaObject(Run.interpreter);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		Hashtable properties=(Hashtable)this.currentClassNode.getProperties().get("FOwnedOperation");
		properties.put(node.getFName(),knode);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
/*	public Object visit(FParameter node) {
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
/*	public Object visit(FPackage node) {
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
/*	public Object visit(FProductType node) {
		String result = "[" + ppComaSeparatedNodes(node.getFType()) + "]";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		KermetaObject knode=Run.kermetaObjectFactory.createKermetaObject(Run.interpreter);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		Hashtable properties=(Hashtable)this.currentClassNode.getProperties().get("FOwnedAttributes");
		String nameFirstcharUp=node.getFName().substring(0,1).toUpperCase()+node.getFName().substring(1,node.getFName().length());
		properties.put(nameFirstcharUp,knode);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRaise)
	 */
/*	public Object visit(FRaise node) {
		return "raise " + this.accept(node.getFExpression());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FSelfExpression)
	 */
/*	public Object visit(FSelfExpression node) {
		return "self";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FSelfType)
	 */
/*	public Object visit(FSelfType node) {
		return "Self";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
/*	public Object visit(FStringLiteral node) {
		return "\"" + node.getFValue() +"\""; //TODO : escape characters ?
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
/*	public Object visit(FTypeLiteral node) {
		return this.accept(node.getFTyperef());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
/*	public Object visit(FTypeReference node) {
		return ppTypeFromMultiplicityElement(node);
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
/*	public Object visit(FTypeVariable node) {
		return ppIdentifier(node.getFName());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVariableDecl)
	 */
/*	public Object visit(FVariableDecl node) {
		String result = "var " + ppIdentifier(node.getFIdentifier()) + " : " + this.accept(node.getFType());
		if (node.getFInitialization() != null)
			result += " init " + this.accept(node.getFInitialization());
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVoidLiteral)
	 */
/*	public Object visit(FVoidLiteral node) {
		return "void";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
/*	public Object visit(FVoidType node) {
		return "Void";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
/*	public Object visit(FCallFeature node) {
		String result = "";
		if (node.getFTarget() != null) result += this.accept(node.getFTarget());
		else result += "self";
		result += "." + ppIdentifier(node.getFName());
		if (node.getFParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getFParameters()) + ")";
		}
		return result;
	}
	
	
	
	/**
	 * @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.FCallResult)
	 */
/*	public Object visit(FCallResult node) {
		return "result";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallVariable)
	 */
/*	public Object visit(FCallVariable node) {
		String result = ppIdentifier(node.getFName());
		if (node.getFParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getFParameters()) + ")";
		}
		return result;
	}
	
    /**
     * FTag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FTag)
     */
 /*   public Object visit(FTag node) {
        String result = "";
        //result = "@pre : \"" + node.getFValue() + "\"";
        result = "/*{"+node.getFName()+"}*//*\r\n"+ node.getFValue() + "\n";
        return result;
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
		return imports;
	}
	/**
	 * @return Returns the usings.
	 */
/*	public ArrayList getUsings() {
		return usings;
	}
	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
/*	public String getQualifiedName(FNamedElement element) {
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

