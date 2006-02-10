/* $Id: KM2EcorePass1.java,v 1.3 2006-02-10 14:12:06 zdrey Exp $
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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 * Pass one fills the km2ecoremapping hashtable.
 */
public class KM2EcorePass1 extends KermetaVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass1");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	public	FPackage root_p;
	protected String current_pname;
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	protected KM2Ecore ecoreExporter;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	protected Hashtable<FObject,EObject> km2ecoremapping;
	
	
	/**
	 * @param resource : the resource to populate
	 * @param mapping : Hastable containing the newly created object mapping
	 */
	public KM2EcorePass1(Resource resource, Hashtable<FObject,EObject> mapping, KM2Ecore anEcoreExporter) {
		ecoreResource = resource;
		km2ecoremapping = mapping;
		ecoreExporter = anEcoreExporter;
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(FPackage root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		root_p = root_package;
		
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
		km2ecoremapping.put(p,newEPackage);
		if (ecoreExporter.tracer != null)
		    ecoreExporter.tracer.addMappingTrace(p,newEPackage,p.getFName() + " is mapped to " + newEPackage.getName());
		

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
			km2ecoremapping.put(node,newEClass);
			if (ecoreExporter.tracer != null) // null if user did not want a serializ. of trace
			    ecoreExporter.tracer.addMappingTrace(node,newEClass,node.getFName() + " is mapped to " + newEClass.getName());
			
			
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
		km2ecoremapping.put(node,newEOperation);
		
		
		// do as much as possible right now
		// create an annotation to hold the isAbstract boolean
		// TODO : what is the default value abstract or not ? in which case we do not need to add the annotation
		//		current version of ecore2kmt says : not abstract and creates an empty body
		if (node.isFIsAbstract()) { 
			Boolean b = new Boolean(node.isFIsAbstract());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_ISABSTRACT_DETAILS,
					b.toString(),
					null);	
		}
		
		// Create an annotation to hold the operation body
		if (node.getFBody() != null) {
			String bodyString = (String)new KM2KMTPrettyPrinter().accept(node.getFBody());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_BODY_DETAILS,
					bodyString,
					null);	
		}
		
		// Annotations
		Iterator it = node.getFTag().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEOperation.getEAnnotations().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a getFTag returned null !");				
		}
		
		newEOperation.setOrdered(node.isFIsOrdered());
		newEOperation.setUnique(node.isFIsUnique());
		newEOperation.setLowerBound(node.getFLower());
		newEOperation.setUpperBound(node.getFUpper());
		
		
		// Parameters
		it = node.getFOwnedParameter().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEOperation.getEParameters().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a getFOwnedParameter returned null !");				
		}
		
		loggerTabs.decrement();
		return newEOperation;
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visit(FParameter node) {
		internalLog.debug(loggerTabs + "Visiting Parameter: "+ node.getFName());
		loggerTabs.increment();
		
		EParameter newEParameter = EcoreFactory.eINSTANCE.createEParameter();
//		KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node)
		
		newEParameter.setName(node.getFName());
		ecoreResource.getContents().add(newEParameter);
		km2ecoremapping.put(node,newEParameter);
		newEParameter.setLowerBound(node.getFLower());
		newEParameter.setUpperBound(node.getFUpper());
		newEParameter.setOrdered(node.isFIsOrdered());
		newEParameter.setUnique(node.isFIsUnique());
		
		loggerTabs.decrement();
		return newEParameter;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getFName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature;
		
		if (node.isFIsComposite() || node.isFIsDerived())
		{	// if this is composite we have to check the type
			// same for derived properties, it may have to be an attribute
			if(ecoreExporter.isTypeValidForAttibute(node.getFType())){//attribute
				EAttribute newEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
				newEStructuralFeature = newEAttribute;
				newEAttribute.setID(node.isFIsID());				
			}
			else 
			{ 	// not an attribute => reference 
				EReference newEReference =EcoreFactory.eINSTANCE.createEReference();
				newEStructuralFeature = newEReference;	
				newEReference.setContainment(true);
				
			}
		}
		else { 
			// reference 
			EReference newEReference =EcoreFactory.eINSTANCE.createEReference();
			newEStructuralFeature = newEReference;
				
			newEReference.setContainment(false);
			
		}
		
		// common part for both Attributes and References
		newEStructuralFeature.setName(node.getFName());
		ecoreResource.getContents().add(newEStructuralFeature);
		km2ecoremapping.put(node,newEStructuralFeature);
		
		// set as much attributes as possible
		newEStructuralFeature.setDerived(node.isFIsDerived());
		if (node.isFIsDerived()){
			newEStructuralFeature.setTransient(true);
			newEStructuralFeature.setVolatile(true);
		}
		newEStructuralFeature.setChangeable(!node.isFIsReadOnly());				
		newEStructuralFeature.setOrdered(node.isFIsOrdered());
		newEStructuralFeature.setUnique(node.isFIsUnique());

		newEStructuralFeature.setLowerBound(node.getFLower());
		newEStructuralFeature.setUpperBound(node.getFUpper());
		
		newEStructuralFeature.setDefaultValueLiteral(node.getFDefault());
     
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
		newEAnnotation.setSource(KM2Ecore.KMT2ECORE_ANNOTATION); // TODO put this string in a constant
		newEAnnotation.getDetails().put(current_pname, node.getFValue());
		ecoreResource.getContents().add(newEAnnotation);
		km2ecoremapping.put(node,newEAnnotation);

		loggerTabs.decrement();
		return newEAnnotation;
    }
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(FPrimitiveType)
	 */
	public Object visit(FPrimitiveType node) {
		internalLog.debug(loggerTabs + "Visiting FPrimitiveType: "+ node.getFName());
		String type_name = KMTHelper.getTypeQualifiedName(node.getFInstanceType());
		EClassifier newEClassifier=null;
		internalLog.debug(loggerTabs + "Creating DataType: "+ node.getFName());
		newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
		newEClassifier.setName(node.getFName());
		 
		if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
			newEClassifier.setInstanceClassName(KM2Ecore.primitive_types_mapping.get(type_name));
		}
		else {
			newEClassifier.setInstanceClassName("java.lang.Object");
			ecoreExporter.addAnnotation( 
					newEClassifier,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_PRIMITIVETYPEALIAS,
					type_name,
					null);
		}
		km2ecoremapping.put(node,newEClassifier);
		return newEClassifier;
	}
	
		
}
