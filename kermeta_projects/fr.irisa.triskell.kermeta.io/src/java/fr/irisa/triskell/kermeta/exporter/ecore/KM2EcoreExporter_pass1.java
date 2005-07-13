/* $Id: KM2EcoreExporter_pass1.java,v 1.1 2005-07-13 15:33:20 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KM2EcoreExporter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 11 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Exports KM or KMT to Ecore. 
 */
package fr.irisa.triskell.kermeta.exporter.ecore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass7;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 */
public class KM2EcoreExporter_pass1 extends KermetaVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass1");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	protected Hashtable kmt2ecoremapping;
	
	
	/**
	 * @param resource : the resource to populate
	 * @param mapping : Hastable containing the newly created object mapping
	 */
	public KM2EcoreExporter_pass1(Resource resource, Hashtable mapping) {
		ecoreResource = resource;
		kmt2ecoremapping = mapping;
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(FPackage root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		
		return accept(root_package);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage p) {
		current_pname = p.getFName();
		internalLog.debug(loggerTabs + "Visiting Package: "+ current_pname);
		loggerTabs.increment();
		
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setName(current_pname);
		ecoreResource.getContents().add(newEPackage);
		kmt2ecoremapping.put(p,newEPackage);
		

		Iterator it = p.getFNestedPackage().iterator();
		while(it.hasNext()) {
			newEPackage.getESubpackages().add(accept((EObject)it.next()));
		}
		
		
		it = p.getFOwnedTypeDefinition().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEPackage.getEClassifiers().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a OwnedTypeDefinition returned null !"); 
				
		}

		loggerTabs.decrement();
		return newEPackage;
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		EClass newEClass=null;
		current_pname = node.getFName();
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ current_pname);
		loggerTabs.increment();
		
		try{
			newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName(current_pname);
			ecoreResource.getContents().add(newEClass);
			kmt2ecoremapping.put(node,newEClass);
			
			// do as much as possible right now
			
			// Abstract
			if (node.isFIsAbstract()) newEClass.setAbstract(true);
			newEClass.setAbstract(false);
			
			// Annotations
			Iterator it = node.getFTag().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEAnnotations().add(o);
				else
					internalLog.warn(loggerTabs + "accept of a getFTag returned null !");				
			}
			
			// owned Attributes
			it = node.getFOwnedAttributes().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEStructuralFeatures().add(o);
				else
					internalLog.warn(loggerTabs + "accept of a getFOwnedAttributes returned null !");
			}
			
			// owned operations
			it = node.getFOwnedOperation().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEOperations().add(o);
				else
					internalLog.warn(loggerTabs + "accept of a getFOwnedOperation returned null !");				
			}
		
	/*	if (node.getFTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += ">";
		}
		if (node.getFSuperType().size() > 0) {
			result += " inherits ";
			result += ppComaSeparatedNodes(node.getFSuperType());
		}
		*/
		}
		catch(Exception e)
		{
			internalLog.error("Visiting ClassDefinition: "+ current_pname + ", Exception: " + e.getMessage() ,e);
		}
		loggerTabs.decrement();
		return newEClass;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		EOperation newEOperation=null;
		current_pname = node.getFName();
		internalLog.debug(loggerTabs + "Visiting Operation: "+ current_pname);
		loggerTabs.increment();
		
		newEOperation = EcoreFactory.eINSTANCE.createEOperation();
		newEOperation.setName(current_pname);
		ecoreResource.getContents().add(newEOperation);
		kmt2ecoremapping.put(node,newEOperation);
		
		// TODO implement the content of this Operation
		/*
		String result = ppTags(node.getFTag());
		if (node.getFSuperOperation() != null) result += "method ";
		else result += "operation ";
		result += KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += ">";
		}
		result += "(";
		result += ppComaSeparatedNodes(node.getFOwnedParameter());
		result += ")";
		if(node.getFType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
	
		if (node.getFSuperOperation() != null) {
			result += " from " + KMTHelper.getMangledIdentifier(KMTHelper.getQualifiedName(node.getFSuperOperation().getFOwningClass()));
		}
		if (node.getFRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getFRaisedException());
		}
		if (node.getFBody() != null) {
			result += " is\n";
			pushPrefix();
			result += getPrefix() + this.accept(node.getFBody());
			popPrefix();
		}
		else if (node.isFIsAbstract()) result += " is abstract";
		else {
			result += " is do\n";
			pushPrefix();
			result += getPrefix() + "//TODO: implement operation " + node.getFName() + "\n"; 
			popPrefix();
			result += getPrefix() + "end";
		}
		*/
		loggerTabs.decrement();
		return newEOperation;
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getFName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature;
		
		if (node.isFIsComposite())
		{
			//attribute
			EAttribute newEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
			newEStructuralFeature = newEAttribute;
		}
		else { 
			// reference 
			EReference newEReference =EcoreFactory.eINSTANCE.createEReference();
			newEStructuralFeature = newEReference;
		}
		
		// common part for both Attributes and References
		newEStructuralFeature.setName(node.getFName());
		ecoreResource.getContents().add(newEStructuralFeature);
		kmt2ecoremapping.put(node,newEStructuralFeature);
		
		// set as much attributes as possible
		newEStructuralFeature.setDerived(node.isFIsDerived());
		newEStructuralFeature.setChangeable(!node.isFIsReadOnly());
		
		
		
		/*
	    
		result += KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getFOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getFOpposite().getFName());
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
		}*/
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}

     /**
     * FTag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FTag)
     */
    public Object visit(FTag node) {
    	EAnnotation newEAnnotation=null;
		current_pname = node.getFName();
		internalLog.debug(loggerTabs + "Visiting Tag: "+ current_pname);
		loggerTabs.increment();
		
		newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		newEAnnotation.setSource("KerMeta"); // TODO put this string in a constant
		newEAnnotation.getDetails().put(current_pname, node.getFValue());
		ecoreResource.getContents().add(newEAnnotation);
		kmt2ecoremapping.put(node,newEAnnotation);

		loggerTabs.decrement();
		return newEAnnotation;
    }
}
