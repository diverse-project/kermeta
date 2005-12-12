/* $Id: KM2EcorePass2.java,v 1.2 2005-12-12 07:32:22 dvojtise Exp $
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.behavior.FStringLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeReference;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 */
public class KM2EcorePass2 extends KermetaVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass2");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	public	FPackage root_p;
	protected String current_pname;
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	protected KM2Ecore ecoreExporter;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	// mapping to look for ecore objects created during pass1
	protected Hashtable kmt2ecoremapping;
	
	/**
	 * @param resource : the resource to populate
	 */
	public KM2EcorePass2(Resource resource, Hashtable mapping, KM2Ecore anEcoreExporter) {
		ecoreResource = resource;
		kmt2ecoremapping = mapping;	
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		EClass newEClass=null;
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ node.getFName());
		loggerTabs.increment();
		
		
		// search the Eclass from previous pass
		newEClass = (EClass)kmt2ecoremapping.get(node);
		
		Iterator it = node.getFSuperType().iterator();
		if (it.hasNext()) internalLog.debug(loggerTabs + "Supertypes: ");
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEClass.getESuperTypes().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a getFSuperType returned null !"); 
				
		}
		
		// deal with TypeParameters
		it = node.getFTypeParameter().iterator();
		while(it.hasNext()) {
			// use the KMTprettyPrinter to output in the annotation
			// one annotation per type parameter
			FTypeVariable tv = (FTypeVariable)it.next();
			String typeParameterString = tv.getFName();			
			if (tv.getFSupertype() != null) typeParameterString += " : " + new KM2KMTPrettyPrinter().accept(tv.getFSupertype());
			ecoreExporter.addAnnotation( 
					newEClass,
					KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER,
					tv.getFName(),
					typeParameterString,
					null);						
		}
		
		//		 owned Attributes
		it = node.getFOwnedAttributes().iterator();
		while(it.hasNext()) {
			accept((EObject)it.next());
		}
		//		 owned operations
		it = node.getFOwnedOperation().iterator();
		while(it.hasNext()) {
			 accept((EObject)it.next());				
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
		
		//		 search the EOperation from previous pass
		newEOperation = (EOperation)kmt2ecoremapping.get(node);
		
		// Parameters
		Iterator it = node.getFOwnedParameter().iterator();
		while(it.hasNext()) {
			accept((EObject)it.next());				
		}
		
		// Return type
		if(node.getFType() != null) {
			newEOperation.setEType((EClassifier)accept((EObject)node.getFType()));
		}
		
		// superoperation
		if (node.getFSuperOperation() != null)
		{
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS,
					KMTHelper.getQualifiedName(node.getFSuperOperation().getFOwningClass()),
					(EObject)accept(node.getFSuperOperation()));
			
		}

		it = node.getFRaisedException().iterator();
		while (it.hasNext()) {
			FClass  anException = (FClass)it.next();
			EClassifier exceptionEClassifier =  (EClassifier)accept(anException);
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION_RAISEDEXCEPTION,
					KM2Ecore.KMT2ECORE_ANNOTATION_RAISEDEXCEPTION_DETAILS,
					KMTHelper.getQualifiedName(anException.getFClassDefinition()),
					exceptionEClassifier);
		}
		
		//		 deal with TypeParameters
		it = node.getFTypeParameter().iterator();
		while(it.hasNext()) {
			// use the KMTprettyPrinter to output in the annotation
			// one annotation per type parameter
			FTypeVariable tv = (FTypeVariable)it.next();
			String typeParameterString = tv.getFName();			
			if (tv.getFSupertype() != null) typeParameterString += " : " + new KM2KMTPrettyPrinter().accept(tv.getFSupertype());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER,
					tv.getFName(),
					typeParameterString,
					null);						
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
		
		//		 search the EOperation from previous pass
		EParameter newEParameter = (EParameter)kmt2ecoremapping.get(node);
		
		newEParameter.setEType(	(EClassifier)accept(node.getFType()));
		
		loggerTabs.decrement();
		return newEParameter;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
		EClassifier newEClassifier=null;		
		internalLog.debug(loggerTabs + "Visiting Class: "+ node.getFName() + "->"+node.getFClassDefinition().getFName());
		loggerTabs.increment();
		
		newEClassifier = (EClassifier)kmt2ecoremapping.get(node.getFClassDefinition());
		if (newEClassifier ==  null)
		{	// maybe this is new reference to a primitive type or a class defined in another file
			// we do that here because we don't want to visit the whole FClass tree during the pass1 
			// only to retreive some references to String or Integer  
			String type_name = KMTHelper.getQualifiedName(node.getFClassDefinition());
			  
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				internalLog.debug(loggerTabs + "Creating DataType: "+ node.getFClassDefinition().getFName());
				type_name = (String)KM2Ecore.primitive_types_mapping.get(type_name);
				// we need to create a new datatype for it and connect it to the root package
				newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
				newEClassifier.setName(node.getFClassDefinition().getFName());
				newEClassifier.setInstanceClassName(type_name);
				EPackage root_EPackage = (EPackage)kmt2ecoremapping.get(root_p);
				root_EPackage.getEClassifiers().add(newEClassifier);
				kmt2ecoremapping.put(node.getFClassDefinition(),newEClassifier);
			}
		}
		if (node.getFTypeParamBinding().size() > 0) {
			// we must deal with binding : 
			// TODO find a correct ecore representation for class binding 
			/*if (node.getFTypeParamBinding().size() > 0) {
				result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
			}*/
			internalLog.info("TODO: deal with parametrized classes");
		}
		
		loggerTabs.decrement();
		return newEClassifier;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getFName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		// search the Eclass from previous pass
		newEStructuralFeature = (EStructuralFeature)kmt2ecoremapping.get(node);
		
		if (node.isFIsComposite() )
		{
			
			if (node.getFOpposite() != null)
			{	// if it has an opposite, this cannot be an EAttribute
				newEReference = (EReference)newEStructuralFeature;
			}
			else
			{
				//attribute
				newEAttribute = (EAttribute)newEStructuralFeature;
			}						
		}
		else { 
			// reference 
			newEReference = (EReference)newEStructuralFeature;
			
		}
		if(newEReference != null)
		{
			if (node.getFOpposite() != null) 
			{   // retreive the opposite
				newEReference.setEOpposite((EReference)kmt2ecoremapping.get(node.getFOpposite()));
			}
			
		}
		if (node.isFIsDerived()) {
			internalLog.warn(loggerTabs + "TODO: derived property not implemented yet ");
			//			 DerivedProperty
			ecoreExporter.addAnnotation( 
						newEStructuralFeature,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_ISDERIVED,
						new Boolean(true).toString(),
						null);
			String getterBody;
			if (node.getFGetterbody() != null) 
				getterBody = (String)new KM2KMTPrettyPrinter().accept(node.getFGetterbody());
			else
			{
				getterBody = "do\n";
				getterBody += "   //TODO: implement getter for derived property " + node.getFName() + "\n"; 
				getterBody += "end";
			}
			ecoreExporter.addAnnotation( 
					newEStructuralFeature,
					KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
					KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_GETTERBODY,
					getterBody,
					null);
			ecoreExporter.addAnnotation( 
					newEStructuralFeature,
					KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
					KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_ISREADONLY,
					new Boolean(node.isFIsReadOnly()).toString(),
					null);
			if (! node.isFIsReadOnly()) {
				String setterBody;
				
				if (node.getFSetterbody() != null) 
					setterBody = (String)new KM2KMTPrettyPrinter().accept(node.getFSetterbody());
				else {
					setterBody = "do\n";
					setterBody += "   //TODO: implement getter for derived property " + node.getFName() + "\n"; 
					setterBody += "end";
				}
				ecoreExporter.addAnnotation( 
						newEStructuralFeature,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_SETTERBODY,
						setterBody,
						null);
			}
			/*	    
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
		}
		
		//newEStructuralFeature.setEType((EClassifier)kmt2ecoremapping.get(node.getFType()));
		EClassifier type = (EClassifier)accept(node.getFType());
		if(type != null)
			newEStructuralFeature.setEType(type);
		else
			internalLog.debug(loggerTabs + "type of this property is null/void");
		
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
	public Object visit(FStringLiteral node) {
		internalLog.debug(loggerTabs + "Visiting FStringLiteral: "+ node.getFValue());		
		return node.getFValue(); 
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
	public Object visit(FTypeLiteral node) {
		internalLog.debug(loggerTabs + "Visiting FTypeLiteral");
		loggerTabs.increment();
		Object o = this.accept(node.getFTyperef());
		loggerTabs.decrement();		
		return o;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
		internalLog.debug(loggerTabs + "Visiting FTypeReference: "+ node.getFName());
		loggerTabs.increment();
		Object o = this.accept(node.getFType());
		loggerTabs.decrement();	
	    return o;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visit(FVoidType node) {
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(FPrimitiveType)
	 */
	public Object visit(FPrimitiveType node) {
		internalLog.debug(loggerTabs + "Visiting FPrimitiveType: "+ node.getFName()+ " "+ KMTHelper.getQualifiedName(node));
		internalLog.debug(loggerTabs + "                       : "+ node);
		
		String type_name = KMTHelper.getQualifiedName(node);
		EClassifier newEClassifier=null; 
		newEClassifier = (EClassifier)kmt2ecoremapping.get(node);
		if (newEClassifier ==  null)
		{
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				internalLog.debug(loggerTabs + "Creating DataType: "+ node.getFName());
				type_name = (String)KM2Ecore.primitive_types_mapping.get(type_name);
				// we need to create a new datatype for it and connect it to the root package
				newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
				newEClassifier.setName(node.getFName());
				newEClassifier.setInstanceClassName(type_name);
				EPackage root_EPackage = (EPackage)kmt2ecoremapping.get(root_p);
				root_EPackage.getEClassifiers().add(newEClassifier);
				kmt2ecoremapping.put(node,newEClassifier);
			}
		}
		return newEClassifier;
	}
}
