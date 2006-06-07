/* $Id: KM2EcorePass1.java,v 1.17 2006-06-07 16:41:43 zdrey Exp $
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

import javax.sound.midi.SysexMessage;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
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
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * Exports KM or KMT to Ecore.
 * Pass one fills the km2ecoremapping hashtable.
 */
public class KM2EcorePass1 extends KermetaOptimizedVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass1");
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	
	/** The root package */
	public	Package root_p;
	
	/** The name of the currently visited element */
	protected String current_name;
	/** The path of the currently visited package. Used to set the nsUri of packages (ie "//foo/bar") */
	protected String current_ppath;
	/** The enumeration that is currently visited */
	protected EEnum current_eenum;
	
	
	protected KM2Ecore ecoreExporter;
	protected KM2KMTPrettyPrinter prettyPrinter;
	
	
	/** The resource to populate */
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
		// PrettyPrinter that will convert the operation body into a String that will be stored as an Ecore
		// annotation since ecore metamodel does not contains a behavior.
		prettyPrinter = new KM2KMTPrettyPrinter();
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(Package root_package) {
		root_p = root_package;
		current_ppath = "";
		return accept(root_package);
	}
	
	/**
	 * Convert kermeta Package into ecore EPackage, and the nested packages of given
	 * package as well.
	 */
	public Object visitPackage(Package node) {
		current_name = node.getName();
		internalLog.debug(loggerTabs + "Visiting Package: "+ current_name);
		loggerTabs.increment();
		
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setNsPrefix(current_name);
		newEPackage.setNsURI(ecoreResource.getURI().toString() + (node==root_p?"":"#/") + current_ppath);
		newEPackage.setName(current_name);
		
		// Visit the tags of package and convert them into EAnnotations
		setTagAnnotations(node, newEPackage);
		
		if (ecoreExporter.tracer != null)
		    ecoreExporter.tracer.addMappingTrace(node,newEPackage,node.getName() + " is mapped to " + newEPackage.getName());

		// Visit the nested packages
		Iterator it = node.getNestedPackage().iterator();
		while(it.hasNext()) {
			Package next = (Package)it.next();
			current_ppath += "/" + next.getName();
			newEPackage.getESubpackages().add(accept(next));
			int cl = current_ppath.length();
			current_ppath = current_ppath.substring(0, cl - next.getName().length()-1);
		}
		
		// Visit the type definitions
		it = node.getOwnedTypeDefinition().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEPackage.getEClassifiers().add(o);
			else
				throw new KM2ECoreConversionException("A type definition in package '"+node.getName() + "' could not be resolved (" + o + ")");
		}
		// Add the created package into the ecoreResource (we just need to add the 
		// root package). EPackage is Ecore metamodel root ("Model object") in our case, 
		// and all the ecore elements have a direct or undirect containment relationship 
		// with EPackages. And we only need to add the root elements to the resource contents.
		ecoreResource.getContents().add(newEPackage);
		// Add the created EPackage to km2ecoremapping
		km2ecoremapping.put(node,newEPackage);
		loggerTabs.decrement();
		return newEPackage;
	}
	
	/** 
	 * Converts a kermeta ClassDefinition into EClass
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		EClass newEClass=null;
		current_name = node.getName();
		//internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ current_name);
		loggerTabs.increment();
		
		try{
			newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName(current_name);
			newEClass.setAbstract(node.isIsAbstract());
			
			if (ecoreExporter.tracer != null) // null if user did not want a serializ. of trace
			    ecoreExporter.tracer.addMappingTrace(node,newEClass, node.getName() + " is mapped to " + newEClass.getName());
			
			// Create annotations for Comments
			setTagAnnotations((NamedElement)node, (EModelElement)newEClass);
			
			// Owned Attributes
			Iterator it = node.getOwnedAttribute().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEStructuralFeatures().add(o);
				else
					throw new KM2ECoreConversionException("An attribute in class definition '"+node.getName() + "' could not be resolved");
			}
			
			// Owned operations
			it = node.getOwnedOperation().iterator();
			while(it.hasNext()) {
				Object o = accept((EObject)it.next());
				if (o != null)
					newEClass.getEOperations().add(o);
				else
					throw new KM2ECoreConversionException("An operation in package '"+node.getName() + "' could not be resolved");				
			}
			
			// Create an annotation to hold the operation inv	
			Iterator itinv = node.getInv().iterator();
			while(itinv.hasNext()){
				String invString = (String)prettyPrinter.accept((Constraint)itinv.next());
				ecoreExporter.addAnnotation( 
					newEClass,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_INV_DETAILS,
					invString,
					null);
			}
			// Add the created EPackage to km2ecoremapping
			km2ecoremapping.put(node,newEClass);
		}
		catch(Exception e)
		{
			internalLog.error("Visiting ClassDefinition: "+ current_name + ", Exception: " + e.getMessage() ,e);
			e.printStackTrace();
		}
		loggerTabs.decrement();
		return newEClass;
	}
	
	/**
	 * Convert Enumeration into EEnumeration.
	 * 
	 * Note : in kermeta metamodel, Enumeration inherits DataType which inherits
	 * TypeDefinition.
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node) {
		EEnum newEEnum = EcoreFactory.eINSTANCE.createEEnum();
		newEEnum.setName(node.getName());
		newEEnum.setInstanceClass(null);
		newEEnum.setInstanceClassName(null);
		newEEnum.setSerializable(true); // this property does not exist in kermeta Enumeration...
		// set the current_eenum for the visit of the related EnumLiterals
		current_eenum = newEEnum;
		// Awful cast : we KNOW that type of object is EnumerationLiteral
		for (Object o : node.getOwnedLiteral()) { this.accept((EnumerationLiteral)o); }
		return newEEnum;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumerationLiteral(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral node) {
		EEnumLiteral lit = EcoreFactory.eINSTANCE.createEEnumLiteral();
		lit.setName(node.getName());
		current_eenum.getELiterals().add(lit);
		lit.setValue(current_eenum.getELiterals().size()-1);
		return lit;
	}
	
	/** Define the annotation for the Tags associated to the given node 
	 * @param node the kermeta node that contains the tags to convert into ecore annotations 
	 * @param newEModelElement the ecore element that corresponds to the given kermeta node 
	 */
	protected void setTagAnnotations(NamedElement node, EModelElement newEModelElement) {
		Iterator it = node.getTag().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEModelElement.getEAnnotations().add(o);
			else
				throw new KM2ECoreConversionException("A tag in '"+node.getName() + "' could not be resolved");				
		}
	}

	/**
	 * Convert an kermeta Operation into EOperation
	 */
	public Object visitOperation(Operation node) {
		current_name = node.getName();
		internalLog.debug(loggerTabs + "Visiting Operation: "+ current_name);
		loggerTabs.increment();
		
		EOperation newEOperation = EcoreFactory.eINSTANCE.createEOperation();
		newEOperation.setName(current_name);
		
		// Create an annotation to hold the isAbstract boolean
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
			// (if "typedef" is false, then it means that prettyPrinter is not in typdef
			// context, so it will prettyPrint visited node accordingly)
			prettyPrinter.setTypedef(false);
			String bodyString = (String)prettyPrinter.accept(node.getBody());
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
			String preString = (String)prettyPrinter.accept((Constraint)itpre.next());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_PRE_DETAILS,
					preString,
					null);
		}
			
		// Create an annotation to hold the operation post
		Iterator itpost = node.getPost().iterator();
		while(itpost.hasNext()){
			String postString = (String)prettyPrinter.accept((Constraint)itpost.next());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_POST_DETAILS,
					postString,
					null);
		}
		
		// Annotations
		Iterator it = node.getTag().iterator();
		setTagAnnotations(node, newEOperation);
		
		newEOperation.setOrdered(node.isIsOrdered());
		newEOperation.setUnique(node.isIsUnique());
		newEOperation.setLowerBound(node.getLower());
		if (node.getUpper() == 0) System.err.println("Upper is O!!!!!!!!!!!!");
		newEOperation.setUpperBound(node.getUpper());
		
		// Parameters
		it = node.getOwnedParameter().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEOperation.getEParameters().add(o);
			else
				throw new KM2ECoreConversionException("A tag in '"+node.getName() + "' could not be resolved");				
		}
		
		km2ecoremapping.put(node,newEOperation);
		loggerTabs.decrement();
		return newEOperation;
	}

	/**
	 * Convert Parameter into EParameter
	 */
	public Object visitParameter(Parameter node) {
		internalLog.debug(loggerTabs + "Visiting Parameter: "+ node.getName());
		loggerTabs.increment();
		
		EParameter newEParameter = EcoreFactory.eINSTANCE.createEParameter();
		// Was node.getName(), but this removes the necessary "~" for protecting keywords
		newEParameter.setName(KMTHelper.getMangledIdentifier(node.getName()));
		newEParameter.setLowerBound(node.getLower());
		newEParameter.setUpperBound(node.getUpper());
		newEParameter.setOrdered(node.isIsOrdered());
		newEParameter.setUnique(node.isIsUnique());
		
		km2ecoremapping.put(node,newEParameter);
		loggerTabs.decrement();
		return newEParameter;
	}
	
	/**
	 * Convert Property into an EStructuralFeature. More specifically, 
	 * if the Propety type is a primitive type, the ecore converted element will
	 * be an EAttribute, otherwise it will be an EReference.
	 */
	public Object visitProperty(Property node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature = null;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		
		// If this is composite we have to check the type
		// same for derived properties, it may have to be an attribute
		if(ecoreExporter.isTypeValidForAttibute(node.getType())){//attribute
			newEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
			newEStructuralFeature = newEAttribute;
			newEAttribute.setID(node.isIsID());				
		}
		else 
		{ 	// not an attribute => reference 
			newEReference =EcoreFactory.eINSTANCE.createEReference();
			newEStructuralFeature = newEReference;
		}
		
		// If the EStructuralFeature that is created is an EReference
		boolean isContainment = node.isIsComposite() || node.isIsDerived();
		if (newEReference!= null)
		{
			newEReference.setContainment(isContainment);
		}
		else
		{
			if (ecoreExporter.isTypeValidForAttibute(node.getType()) && isContainment == false){
				//	attribute
				ecoreExporter.messages.addWarning(
						"The reference to type '"+ KMTHelper.getTypeQualifiedName(node.getType()) + 
						"' needs to be translated into an Ecore data type and then must be put into an EAttribute.\n"
						,node);
			}
			// Add an Annotation so that it will be correctly back translated to km.
			ecoreExporter.addAnnotation( 
					newEAttribute,
					KM2Ecore.KMT2ECORE_ANNOTATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_ISCOMPOSITE_DETAILS,
					isContainment?"true":"false",
					null);
		}
		
		// Set the new StructuralFeature values
		newEStructuralFeature.setName(node.getName());
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
		// newEStructuralFeature.setDefaultValue() -> no default value
		
		km2ecoremapping.put(node,newEStructuralFeature);
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}

     /**
     * Tag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object visitTag(Tag node) {
    	EAnnotation newEAnnotation=null;
		current_name = node.getName();
		
		newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		newEAnnotation.setSource(KM2Ecore.KMT2ECORE_ANNOTATION);
		newEAnnotation.getDetails().put(current_name, KMTHelper.formatTagValue(node.getValue()));
		
		km2ecoremapping.put(node,newEAnnotation);
		return newEAnnotation;
    }
    
    
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node) {
		
		internalLog.debug(loggerTabs + "Visiting PrimitiveType: "+ node.getName() + "; instance:"+ node.getInstanceType());
		String type_name = KMTHelper.getTypeQualifiedName(node.getInstanceType());
		EClassifier newEClassifier = EcoreFactory.eINSTANCE.createEDataType();
		newEClassifier.setName(node.getName());
		if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
			newEClassifier.setInstanceClassName(KM2Ecore.primitive_types_mapping.get(type_name));
		}
		// Give a default class...
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
