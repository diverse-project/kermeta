/* $Id: KMMetaBuilder.java,v 1.6 2005-03-15 11:22:37 jpthibau Exp $
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

//	protected Hashtable allMetaClasses;
	protected Stack packageNamesStack;
	protected KermetaObject currentClassNode;
	
	
	public void ppPackage(KermetaUnit unit) {
		String currentpackageName=unit.getQualifiedName(unit.rootPackage);
		List packagesNames=new ArrayList();
		packagesNames.add(currentpackageName);
		this.packageNamesStack=new Stack();
		ppPackageContents(unit.rootPackage,currentpackageName);
		ppPackageImportedpackagess(unit,packagesNames);
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
	public Object visit(FAssignement node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRescue)
	 */
	public Object visit(FRescue node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
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
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallSuperOperation)
	 */
	public Object visit(FCallSuperOperation node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
		this.currentClassNode.getProperties().put("InstanceType",node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visit(FTypeVariableBinding node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		KermetaObject knode=Run.koFactory.createKermetaObject(Run.metametaClass);
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
		knode.getProperties().put("qualifiedName",qualifiedPrefix+node.getFName());
		Run.koFactory.getClassDefTable().put(qualifiedPrefix+node.getFName(),knode);

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
		KermetaObject knode=Run.koFactory.createKermetaObject(Run.metametaClass);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		this.currentClassNode=knode;
		String qualifiedPrefix="";
		Iterator it=this.packageNamesStack.iterator();
		while (it.hasNext())
			qualifiedPrefix=qualifiedPrefix.concat((String)it.next())+"::";
		knode.getProperties().put("qualifiedName",qualifiedPrefix+node.getFName());
		Run.koFactory.getClassDefTable().put(qualifiedPrefix+node.getFName(),knode);
		this.accept(node.getFInstanceType());
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 */
	public Object visit(FConditionnal node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visit(FFunctionType node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral)
	 */
	public Object visit(FIntegerLiteral node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaExpression)
	 */
	public Object visit(FLambdaExpression node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaParameter)
	 */
	public Object visit(FLambdaParameter node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLoop)
	 */
	public Object visit(FLoop node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		KermetaObject knode=Run.koFactory.createKermetaObject(Run.metametaClass);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		Hashtable properties=(Hashtable)this.currentClassNode.getProperties().get("FOwnedOperation");
		properties.put(node.getFName(),knode);
		knode.getProperties().put("container",this.currentClassNode);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visit(FParameter node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProductType)
	 */
	public Object visit(FProductType node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		KermetaObject knode=Run.koFactory.createKermetaObject(Run.metametaClass);
		Hashtable data=new Hashtable();
		data.put("kcoreObject",node);
		knode.setData(data);
		Hashtable properties=(Hashtable)this.currentClassNode.getProperties().get("FOwnedAttributes");
//		String nameFirstcharUp=node.getFName().substring(0,1).toUpperCase()+node.getFName().substring(1,node.getFName().length());
		properties.put(node.getFName(),knode);
		knode.getProperties().put("container",this.currentClassNode);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRaise)
	 */
	public Object visit(FRaise node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FSelfExpression)
	 */
	public Object visit(FSelfExpression node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FSelfType)
	 */
	public Object visit(FSelfType node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
	public Object visit(FStringLiteral node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
	public Object visit(FTypeLiteral node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
	public Object visit(FTypeVariable node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVariableDecl)
	 */
	public Object visit(FVariableDecl node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVoidLiteral)
	 */
	public Object visit(FVoidLiteral node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visit(FVoidType node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
	public Object visit(FCallFeature node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
	
	
	/**
	 * @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.FCallResult)
	 */
	public Object visit(FCallResult node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallVariable)
	 */
	public Object visit(FCallVariable node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
	}
	
    /**
     * FTag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FTag)
     */
    public Object visit(FTag node) {
		System.err.println("This kind of node should not be explored in metaclasses builder.");
		return null;
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

