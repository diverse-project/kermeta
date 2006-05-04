/* $Id: KM2EcorePass1.java,v 1.11 2006-05-04 15:26:22 jmottu Exp $
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
//import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
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
	public	Package root_p;
	protected String current_pname;
	protected String current_ppath;
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	protected KM2Ecore ecoreExporter;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	protected Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> km2ecoremapping;
	
	
	/**
	 * @param resource : the resource to populate
	 * @param mapping : Hastable containing the newly created object mapping
	 */
	public KM2EcorePass1(Resource resource, Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> mapping, KM2Ecore anEcoreExporter) {
		ecoreResource = resource;
		km2ecoremapping = mapping;
		ecoreExporter = anEcoreExporter;
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(Package root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		root_p = root_package;
		current_ppath = "";
		return accept(root_package);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visit(Package p) {
		current_pname = p.getName();
		internalLog.debug(loggerTabs + "Visiting Package: "+ current_pname);
		loggerTabs.increment();
		
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setNsPrefix(current_pname);
		newEPackage.setNsURI(ecoreExporter.getKermetaUnit().getUri() + (p==root_p?"":"#/") + current_ppath);
		newEPackage.setName(current_pname);
		ecoreResource.getContents().add(newEPackage);
		km2ecoremapping.put(p,newEPackage);
		if (ecoreExporter.tracer != null)
		    ecoreExporter.tracer.addMappingTrace(p,newEPackage,p.getName() + " is mapped to " + newEPackage.getName());
		

		Iterator it = p.getNestedPackage().iterator();
		while(it.hasNext()) {
			Package next = (Package)it.next();
			current_ppath += "/" + next.getName();
			newEPackage.getESubpackages().add(accept(next));
			int cl = current_ppath.length();
			current_ppath = current_ppath.substring(0, cl - next.getName().length()-1);
		}
		
		
		it = p.getOwnedTypeDefinition().iterator();
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visit(ClassDefinition node) {
		EClass newEClass=null;
		current_pname = node.getName();
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ current_pname);
		loggerTabs.increment();
		
		try{
			newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName(current_pname);
			ecoreResource.getContents().add(newEClass);
			km2ecoremapping.put(node,newEClass);
			if (ecoreExporter.tracer != null) // null if user did not want a serializ. of trace
			    ecoreExporter.tracer.addMappingTrace(node,newEClass,node.getName() + " is mapped to " + newEClass.getName());
			
			
			// do as much as possible right now
			
			// Abstract
			if (node.isIsAbstract()) newEClass.setAbstract(true);
			newEClass.setAbstract(false);
			
			// Annotations
			Iterator it = node.getTag().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEAnnotations().add(o);
				else
					internalLog.warn(loggerTabs + "accept of a getFTag returned null !");				
			}
			
			// owned Attributes
			it = node.getOwnedAttribute().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEStructuralFeatures().add(o);
				else
					internalLog.warn(loggerTabs + "accept of a getFOwnedAttributes returned null !");
			}
			
			// owned operations
			it = node.getOwnedOperation().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEOperations().add(o);
				else
					internalLog.warn(loggerTabs + "accept of a getFOwnedOperation returned null !");				
			}
			
			// Create an annotation to hold the operation inv	
			Iterator itinv = node.getInv().iterator();
			while(itinv.hasNext()){
				String invString = (String)new KM2KMTPrettyPrinter().accept((Constraint)itinv.next());
				ecoreExporter.addAnnotation( 
					newEClass,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_INV_DETAILS,
					invString,
					null);
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
	public Object visit(Operation node) {
		EOperation newEOperation=null;
		current_pname = node.getName();
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
		if (node.isIsAbstract()) { 
			Boolean b = new Boolean(node.isIsAbstract());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_ISABSTRACT_DETAILS,
					b.toString(),
					null);	
		}
		
		// Create an annotation to hold the operation body
		if (node.getBody() != null) {
			String bodyString = (String)new KM2KMTPrettyPrinter().accept(node.getBody());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_BODY_DETAILS,
					bodyString,
					null);	
		}
		
		// Create an annotation to hold the operation pre	
		Iterator itpre = node.getPre().iterator();
		while(itpre.hasNext()){
			String preString = (String)new KM2KMTPrettyPrinter().accept((Constraint)itpre.next());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_PRE_DETAILS,
					preString,
					null);
		}
			
		// Create an annotation to hold the operation post
		Iterator itpost = node.getPre().iterator();
		while(itpost.hasNext()){
			String postString = (String)new KM2KMTPrettyPrinter().accept((Constraint)itpost.next());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_POST_DETAILS,
					postString,
					null);
		}
		
		// Annotations
		Iterator it = node.getTag().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEOperation.getEAnnotations().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a getFTag returned null !");				
		}
		
		newEOperation.setOrdered(node.isIsOrdered());
		newEOperation.setUnique(node.isIsUnique());
		newEOperation.setLowerBound(node.getLower());
		newEOperation.setUpperBound(node.getUpper());
		
		
		// Parameters
		it = node.getOwnedParameter().iterator();
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Parameter)
	 */
	public Object visit(Parameter node) {
		internalLog.debug(loggerTabs + "Visiting Parameter: "+ node.getName());
		loggerTabs.increment();
		
		EParameter newEParameter = EcoreFactory.eINSTANCE.createEParameter();
//		KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node)
		
		// Was node.getName(), but this removes the necessary "~" for protecting keywords
		newEParameter.setName(KMTHelper.getMangledIdentifier(node.getName()));
		ecoreResource.getContents().add(newEParameter);
		km2ecoremapping.put(node,newEParameter);
		newEParameter.setLowerBound(node.getLower());
		newEParameter.setUpperBound(node.getUpper());
		newEParameter.setOrdered(node.isIsOrdered());
		newEParameter.setUnique(node.isIsUnique());
		
		loggerTabs.decrement();
		return newEParameter;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visit(Property node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature;
		
		if (node.isIsComposite() || node.isIsDerived())
		{	// if this is composite we have to check the type
			// same for derived properties, it may have to be an attribute
			if(ecoreExporter.isTypeValidForAttibute(node.getType())){//attribute
				EAttribute newEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
				newEStructuralFeature = newEAttribute;
				newEAttribute.setID(node.isIsID());				
			}
			else 
			{ 	// not an attribute => reference 
				EReference newEReference =EcoreFactory.eINSTANCE.createEReference();
				newEStructuralFeature = newEReference;	
				newEReference.setContainment(true);
				
			}
		}
		else { 
			if (ecoreExporter.isTypeValidForAttibute(node.getType())){
				// Ecore primitive types cannot be EReference we need to translate it into EAttribute
				// even if the notion of containment is not respected
				//	attribute
				ecoreExporter.messages.addWarning("The reference to type "+ KMTHelper.getTypeQualifiedName(node.getType()) +" need to be translated into an Ecore data type and then must be put into an EAttribute.\n"+ 
						"A roundtrip back to kermeta will not produce your original file.\n"+
						"Please consider using attribute instead of reference.",node);
				KermetaUnit.internalLog.warn("a reference to type "+ KMTHelper.getTypeQualifiedName(node.getType()) +" need to be translated into an Ecore data type and must be put into an EAttribute.\n"+ 
						"a roundtrip back to kermeta will not produce your original file.", null);
				EAttribute newEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
				newEStructuralFeature = newEAttribute;
				newEAttribute.setID(node.isIsID());
			}
			else {
				// reference 
				EReference newEReference =EcoreFactory.eINSTANCE.createEReference();
				newEStructuralFeature = newEReference;
					
				newEReference.setContainment(false);
			}
			
		}
		
		// common part for both Attributes and References
		newEStructuralFeature.setName(node.getName());
		ecoreResource.getContents().add(newEStructuralFeature);
		km2ecoremapping.put(node,newEStructuralFeature);
		
		// set as much attributes as possible
		newEStructuralFeature.setDerived(node.isIsDerived());
		if (node.isIsDerived()){
			newEStructuralFeature.setTransient(true);
			newEStructuralFeature.setVolatile(true);
		}
		newEStructuralFeature.setChangeable(!node.isIsReadOnly());				
		newEStructuralFeature.setOrdered(node.isIsOrdered());
		newEStructuralFeature.setUnique(node.isIsUnique());

		newEStructuralFeature.setLowerBound(node.getLower());
		newEStructuralFeature.setUpperBound(node.getUpper());
		
		newEStructuralFeature.setDefaultValueLiteral(node.getDefault());
     
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}

     /**
     * Tag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object visit(Tag node) {
    	EAnnotation newEAnnotation=null;
		current_pname = node.getName();
		internalLog.debug(loggerTabs + "Visiting Tag: "+ current_pname);
		loggerTabs.increment();
		
		newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		newEAnnotation.setSource(KM2Ecore.KMT2ECORE_ANNOTATION); // TODO put this string in a constant
		newEAnnotation.getDetails().put(current_pname, node.getValue());
		ecoreResource.getContents().add(newEAnnotation);
		km2ecoremapping.put(node,newEAnnotation);

		loggerTabs.decrement();
		return newEAnnotation;
    }
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(PrimitiveType)
	 */
	public Object visit(PrimitiveType node) {
		internalLog.debug(loggerTabs + "Visiting PrimitiveType: "+ node.getName());
		String type_name = KMTHelper.getTypeQualifiedName(node.getInstanceType());
		EClassifier newEClassifier=null;
		internalLog.debug(loggerTabs + "Creating DataType: "+ node.getName());
		newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
		newEClassifier.setName(node.getName());
		 
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
