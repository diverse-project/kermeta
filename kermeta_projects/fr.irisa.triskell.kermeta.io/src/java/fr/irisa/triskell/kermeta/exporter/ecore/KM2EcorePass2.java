/* $Id: KM2EcorePass2.java,v 1.10 2006-05-03 20:50:16 dvojtise Exp $
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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreUnit;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.utils.URIMapUtil;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 */
public class KM2EcorePass2 extends KermetaVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass2");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	public	Package root_p;
	protected String current_pname;
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	protected KM2Ecore ecoreExporter;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	protected ResourceSet ecoreResourceSet = null;
	
	/** Contains the string uris of the resources already saved during this pass */
	protected Hashtable<String, Resource> savedFiles = null;
	
	// mapping to look for ecore objects created during pass1
	protected Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> kmt2ecoremapping;
	
	/**
	 * @param resource : the resource to populate
	 */
	public KM2EcorePass2(Resource resource, Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> mapping, KM2Ecore anEcoreExporter) {
		ecoreResource = resource;
		ecoreResourceSet = resource.getResourceSet();
		kmt2ecoremapping = mapping;	
		ecoreExporter = anEcoreExporter;
		savedFiles = new Hashtable<String, Resource>();
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(Package root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		root_p = root_package;
		
		return accept(root_package);
	}
	
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visit(ClassDefinition node) {
		EClass newEClass=null;
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ node.getName());
		loggerTabs.increment();
		
		
		// search the Eclass from previous pass
		newEClass = (EClass)kmt2ecoremapping.get(node);
		
		Iterator it = node.getSuperType().iterator();
		if (it.hasNext()) internalLog.debug(loggerTabs + "Supertypes: ");
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEClass.getESuperTypes().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a getFSuperType returned null !"); 
				
		}
		
		// deal with TypeParameters
		it = node.getTypeParameter().iterator();
		while(it.hasNext()) {
			// use the KMTprettyPrinter to output in the annotation
			// one annotation per type parameter
			TypeVariable tv = (TypeVariable)it.next();
			String typeParameterString = tv.getName();			
			if (tv.getSupertype() != null) typeParameterString += " : " + new KM2KMTPrettyPrinter().accept(tv.getSupertype());
			ecoreExporter.addAnnotation( 
					newEClass,
					KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER,
					tv.getName(),
					typeParameterString,
					null);						
		}
		
		//		 owned Attributes
		it = node.getOwnedAttribute().iterator();
		while(it.hasNext()) {
			accept((EObject)it.next());
		}
		//		 owned operations
		it = node.getOwnedOperation().iterator();
		while(it.hasNext()) {
			 accept((EObject)it.next());				
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
		
		// search the EOperation from previous pass // FIXME : sometimes newEOperation is not found!!!
		//newEOperation = (EOperation)kmt2ecoremapping.get(node);
		newEOperation = (EOperation)getEObjectForKMObject(node);
		// Parameters
		Iterator it = node.getOwnedParameter().iterator();
		while(it.hasNext()) {
			accept((EObject)it.next());				
		}
		
		// Return type
		if(node.getType() != null) {
			newEOperation.setEType((EClassifier)accept((EObject)node.getType()));
		}
		
		// superoperation
		if (node.getSuperOperation() != null)
		{
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION,
					KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS,
					KMTHelper.getQualifiedName(node.getSuperOperation().getOwningClass()),
					
					(EObject)accept(node.getSuperOperation()));
			
		}

		it = node.getRaisedException().iterator();
		while (it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Class  anException = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
			EClassifier exceptionEClassifier =  (EClassifier)accept(anException);
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION_RAISEDEXCEPTION,
					KM2Ecore.KMT2ECORE_ANNOTATION_RAISEDEXCEPTION_DETAILS,
					KMTHelper.getQualifiedName(anException.getTypeDefinition()),
					exceptionEClassifier);
		}
		
		//		 deal with TypeParameters
		it = node.getTypeParameter().iterator();
		while(it.hasNext()) {
			// use the KMTprettyPrinter to output in the annotation
			// one annotation per type parameter
			TypeVariable tv = (TypeVariable)it.next();
			String typeParameterString = tv.getName();			
			if (tv.getSupertype() != null) typeParameterString += " : " + new KM2KMTPrettyPrinter().accept(tv.getSupertype());
			ecoreExporter.addAnnotation( 
					newEOperation,
					KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER,
					tv.getName(),
					typeParameterString,
					null);						
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
		
		//		 search the EParameter from previous pass
		EParameter newEParameter = (EParameter)getEObjectForKMObject(node);
		// If it is not found in kmt2ecoremapping?
		
		newEParameter.setEType(	(EClassifier)accept(node.getType()));
		
		loggerTabs.decrement();
		return newEParameter;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Class)
	 */
	public Object visit(fr.irisa.triskell.kermeta.language.structure.Class node) {
		EClassifier newEClassifier=null;		
		internalLog.debug(loggerTabs + "Visiting Class: "+ node.getName() + "->"+node.getTypeDefinition().getName());
		loggerTabs.increment();
		
		newEClassifier = (EClassifier)kmt2ecoremapping.get(node.getTypeDefinition());
		if (newEClassifier ==  null)
		{	// maybe this is new reference to a primitive type or a class defined in another file
			// we do that here because we don't want to visit the whole FClass tree during the pass1 
			// only to retreive some references to String or Integer  
			String type_name = KMTHelper.getQualifiedName(node.getTypeDefinition());
			  
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				internalLog.debug(loggerTabs + "Creating DataType: "+ node.getTypeDefinition().getName());
				type_name = (String)KM2Ecore.primitive_types_mapping.get(type_name);
				// we need to create a new datatype for it and connect it to the root package
				newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
				newEClassifier.setName(node.getTypeDefinition().getName());
				newEClassifier.setInstanceClassName(type_name);
				EPackage root_EPackage = (EPackage)kmt2ecoremapping.get(root_p);
				root_EPackage.getEClassifiers().add(newEClassifier);
				kmt2ecoremapping.put(node.getTypeDefinition(),newEClassifier);
			}
		}
		if (node.getTypeParamBinding().size() > 0) {
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
	 * Find the EObject in the km2ecore mapping hashtable. If not found, than try to calculate it.
	 * 
	 * @param obj
	 * @return
	 */
	protected EObject getEObjectForKMObject(fr.irisa.triskell.kermeta.language.structure.Object obj)
	{
		EObject result = null;
		result = kmt2ecoremapping.get(obj);
		// If we did not find the mapped EObject, than find it in depending resources.
		if (result==null)
		{
			if (obj instanceof Operation)
				result = getEObjectForOperation((Operation)obj);
			if (obj instanceof Property)
				result = getEObjectForProperty((Property)obj);
			if (obj instanceof Parameter)
				result = getEObjectForParameter((Parameter)obj);
		}
		return result;
	}

	/**
	 * @param node the node from Kermeta for which we want the corresponding Ecore mapping (usually,
	 * we look for a Type or an Operation -- NamedElement) 
	 * @return
	 */
	protected EObject getEObjectForOperation(Operation node)
	{
		return getEObjectForQualifiedName(
				KMTHelper.getQualifiedName(node),
				KMTHelper.getQualifiedName(node.getOwningClass()));
	}
	
	protected EObject getEObjectForProperty(Property node)
	{
		return getEObjectForQualifiedName(
				KMTHelper.getQualifiedName(node),
				KMTHelper.getQualifiedName(node.getOwningClass()));
	}
	
	protected EObject getEObjectForParameter(Parameter node)
	{
		return getEObjectForQualifiedName(
				KMTHelper.getQualifiedName(node),
				KMTHelper.getQualifiedName(node.getOperation().getOwningClass()));
	}
	
	/**
	 * @param object_qname the qualified name (in kermeta::format) of the object we are looking for 
	 * @param ecore_path the path of the object in "emf" representation <code>//Bla/foo/eobject_name</code>
	 * @param owning_classdef the owning classdefinition to which the object belongs or is related to
	 * 
	 * @return
	 */
	protected EObject getEObjectForQualifiedName(String object_qname, String owning_typedef_qname)
	{

		String ecoreDir = ecoreExporter.ecoreGenDirectory;
		if (ecoreDir == null)
			ecoreDir = ecoreExporter.getKermetaUnit().getUri().substring(0, ecoreExporter.getKermetaUnit().getUri().lastIndexOf("/"));
		EObject result = null;
		Resource depResource = null;
		Iterator<KermetaUnit> allunits_it = ecoreExporter.getKermetaUnit().getAllImportedUnits().iterator();
		while (allunits_it.hasNext() && result==null)
		{
			KermetaUnit ku = allunits_it.next();
			String ecore_path = object_qname.contains(":")?object_qname.substring(object_qname.indexOf(":")+2):object_qname;
			ecore_path = ecore_path.replaceAll("::", "/");
			// We are looking from an object given its key, (it is redundant but avoids
			// conflicts if "duplicate" loads in memory)
			if (ku.typeDefs.containsKey(owning_typedef_qname))
			{	// KermetaUnit type is EcoreUnit, if the underlying loaded resource was an .ecore file  
				if (ku instanceof EcoreUnit)
				{
					URI u = URI.createURI(ku.getUri());
					depResource = ecoreResourceSet.getResource(u, true);
					result = depResource.getEObject("//" + ecore_path);
				}
				// If KMUnit, it means that the underlying resource if a .km file,
				// then we have to convert it in an .ecore file!
				else if (ku instanceof KMUnit || ku instanceof KMTUnit)
				{
					// Get the directory where main resource is located
					String path = ecoreDir; //ecoreResource.getURI().toString();
					String kmpath = ku.getUri();
					String savepath = path.substring(0, path.lastIndexOf("/")) + kmpath.substring(kmpath.lastIndexOf("/"), kmpath.lastIndexOf(".km")) + ".ecore";
					// Create the ecore resource corresponding to kermeta unit on which 
					if (!savedFiles.containsKey(savepath))
						// Create the ecore resource corresponding to kermeta unit on which 
						depResource = writeEcore(ku, savepath, true);
					else
					{
						depResource = savedFiles.get(savepath);
						try { depResource.load(null); }
						catch (IOException e) { e.printStackTrace(); }
					}
					
					result = depResource.getEObject("//"+ ecore_path);
				}
			}
		}
		return result;
	}
	
	
	/**
	 * Find the EClassifier of the specified <code>enode</code>
	 * */
	protected EClassifier resolveETypeForEStructuralFeature(Property node, EStructuralFeature enode, String ecoreDir)
	{
		EClassifier result = null;
		// Find the unit from which given class come from.
		List allunits = ecoreExporter.getKermetaUnit().getAllImportedUnits();
		// The resource where to find the external type -- TODO : store loaded resources.
		Resource depResource;
		String type = KMTHelper.getTypeQualifiedName(node.getType());
		String short_type = type.contains(":")?type.substring(type.indexOf(":")+2):type;
		EObject etype = null;
		// We are looking for the type given its qualified name "type", which corresponding
		// TypeDefinition exists and which qualified would be "type" (since TypeQualifiedName is the
		// TypeDefinition qualified name provided the type has got a type definition (not the case 
		// of function types for example...)
		result = (EClassifier)getEObjectForQualifiedName(type,type);
		return result;
	}
	
	/**
	 * Try to find the EClassifier corresponding to the given structure feature.
	 * The principle is as following : 
	 * - if the user chose the "Generate all files" option, then all the dependencies for
	 * the file to convert will be generated in the specified directory
	 * - if the user unchecked the "Generate all files" options, then he will have to specify 
	 * manually which dependencies he wants to use. However, if an element was not found in the user dependencies,
	 * the required dependencies will be generated in the base directory that user first specified in the first wizard
	 * dialog.
	 * (Note : this is not a recursive operation)
	 * @param classDefinition
	 * @param ecoreDir the directory where to generate the ecore dependencies. If ecoreList is null,
	 * it must be set, otherwise it must be null.
	 * @param  ecoreList the list of ecore dependencies that user manually specified. If it is
	 * set, then ecoreDir must be null.
	 */
	protected void resolveETypeForEStructuralFeature(Property node, EStructuralFeature enode, String ecoreDir, List<String> ecoreList) {
		// robustness test -- may be removed later.
		EClassifier etype = null;
		//assert(ecoreDir!=null && ecoreList.size()>0);
		if (ecoreDir != null) etype = resolveETypeForEStructuralFeature(node, enode, ecoreDir);
		// If ecoreDir is null, and ecoreList as well, generate by default in currentDir!
		else if (ecoreList==null)
		{
			String ecoreDefaultDir = ecoreExporter.getKermetaUnit().getUri().substring(0, ecoreExporter.getKermetaUnit().getUri().lastIndexOf("/"));
			etype = resolveETypeForEStructuralFeature(node, enode, ecoreDefaultDir);
		}
		else if (ecoreList!=null) etype = resolveETypeForEStructuralFeature(node, enode, ecoreList);
		// If user did not provide neither an dir for generated ecore or a list of existing ecore, 
		// set an ecore gen dir by default.
		
		enode.setEType(etype);
	}
	
	
	/** 
	 * Try to find the searched types in the given ecoreList. 
	**/
	protected EClassifier resolveETypeForEStructuralFeature(Property node, EStructuralFeature enode, List<String> ecoreList)
	{
		// Get the type and short_types
		String type = KMTHelper.getTypeQualifiedName(node.getType());
		String short_type = type.contains(":")?type.substring(type.indexOf(":")+2):type;
		short_type = short_type.replaceAll("::", "/");
		
		EClassifier result = null;
		Resource depResource = null;
		Iterator<String> it = ecoreList.iterator();
		while (it.hasNext() && result==null)
		{
			String ustr = it.next();
			// load the corresponding resource
			URI u = URIMapUtil.resolveURI("/resource/" + ustr, "platform:/");
			depResource = ecoreResourceSet.getResource(u, true);
			result = (EClassifier)depResource.getEObject("//" + short_type);
		}
		// if we did not find the type in the user defined resources, than, try to generate
		// the required resources. This is not a recursive call!!
		if (result == null)
		{ 
			result = resolveETypeForEStructuralFeature(node, enode, ecoreResource.getURI().toString());
		}
		return result;
	}
	//

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visit(Property node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		// search the Eclass from previous pass
		newEStructuralFeature = (EStructuralFeature)kmt2ecoremapping.get(node);
		
		if (node.isIsComposite() || node.isIsDerived())
		{	// if this is composite we have to check the type
			// same for derived properties, it may have to be an attribute
			if(ecoreExporter.isTypeValidForAttibute(node.getType())){
				//attribute
				newEAttribute = (EAttribute)newEStructuralFeature;
			}
			else
			{	// a reference
				newEReference = (EReference)newEStructuralFeature;			
			}						
		}
		else { 
			if (ecoreExporter.isTypeValidForAttibute(node.getType())){
				// Ecore primitive types cannot be EReference we need to translate it into EAttribute
				// even if the notion of containment is not respected
				//	attribute
				newEAttribute = (EAttribute)newEStructuralFeature;
				//KermetaUnit.internalLog.warn("reference to type "+ node.getType() +" need to be translated into an Ecore data type and must be put into an EAttribute.\n"+ 
		    	//			"a roundtrip back to kermeta will not produce your original file.", null);
				
			}
			else {
					// 	reference 
				newEReference = (EReference)newEStructuralFeature;
			}
		}
		if(newEReference != null)
		{
			if (node.getOpposite() != null) 
			{   // retreive the opposite
				newEReference.setEOpposite((EReference)kmt2ecoremapping.get(node.getOpposite()));
			}
			
		}
		if (node.isIsDerived()) {
			internalLog.warn(loggerTabs + "TODO: derived property not implemented yet ");			
			//			 DerivedProperty
			ecoreExporter.addAnnotation( 
						newEStructuralFeature,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_ISDERIVED,
						new Boolean(true).toString(),
						null);
			String getterBody;
			if (node.getGetterBody() != null) 
				getterBody = (String)new KM2KMTPrettyPrinter().accept(node.getGetterBody());
			else
			{
				getterBody = "do\n";
				getterBody += "   //TODO: implement getter for derived property " + node.getName() + "\n";
				getterBody += "   raise kermeta::exceptions::NotImplementedException.new \n";
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
					new Boolean(node.isIsReadOnly()).toString(),
					null);
			if (! node.isIsReadOnly()) {
				String setterBody;
				
				if (node.getSetterBody() != null) 
					setterBody = (String)new KM2KMTPrettyPrinter().accept(node.getSetterBody());
				else {
					setterBody = "do\n";
					setterBody += "   //TODO: implement getter for derived property " + node.getName() + "\n";
					setterBody += "   raise kermeta::exceptions::NotImplementedException.new \n";
					setterBody += "end";
				}
				ecoreExporter.addAnnotation( 
						newEStructuralFeature,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_SETTERBODY,
						setterBody,
						null);
			}
		}
		
		//newEStructuralFeature.setEType((EClassifier)kmt2ecoremapping.get(node.getFType()));
		EClassifier type = (EClassifier)accept(node.getType());
		if(type != null)
		{
			newEStructuralFeature.setEType(type);
		}
		else
		{
			// Perhaps this type is in another resource?
			internalLog.debug(loggerTabs + "type of this property is null/void");
			resolveETypeForEStructuralFeature(node, newEStructuralFeature, ecoreExporter.getEcoreGenDirectory(), ecoreExporter.getEcoreFileList());
		}
		
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.StringLiteral)
	 */
	public Object visit(StringLiteral node) {
		internalLog.debug(loggerTabs + "Visiting StringLiteral: "+ node.getValue());		
		return node.getValue(); 
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeLiteral)
	 */
	public Object visit(TypeLiteral node) {
		internalLog.debug(loggerTabs + "Visiting TypeLiteral");
		loggerTabs.increment();
		Object o = this.accept(node.getTyperef());
		loggerTabs.decrement();		
		return o;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeReference)
	 */
	public Object visit(TypeReference node) {
		internalLog.debug(loggerTabs + "Visiting TypeReference: "+ node.getName());
		loggerTabs.increment();
		Object o = this.accept(node.getType());
		loggerTabs.decrement();	
	    return o;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visit(VoidType node) {
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(PrimitiveType)
	 */
	public Object visit(PrimitiveType node) {
		internalLog.debug(loggerTabs + "Visiting PrimitiveType: "+ node.getName()+ " "+ KMTHelper.getQualifiedName(node));
		internalLog.debug(loggerTabs + "                       : "+ node);
		
		String type_name = KMTHelper.getQualifiedName(node);
		EClassifier newEClassifier=null; 
		newEClassifier = (EClassifier)kmt2ecoremapping.get(node);
		if (newEClassifier ==  null)
		{
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				internalLog.debug(loggerTabs + "Creating DataType: "+ node.getName());
				type_name = (String)KM2Ecore.primitive_types_mapping.get(type_name);
				// we need to create a new datatype for it and connect it to the root package
				newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
				newEClassifier.setName(node.getName());
				newEClassifier.setInstanceClassName(type_name);
				EPackage root_EPackage = (EPackage)kmt2ecoremapping.get(root_p);
				root_EPackage.getEClassifiers().add(newEClassifier);
				kmt2ecoremapping.put(node,newEClassifier);
			}
		}
		return newEClassifier;
	}
	
	/**
	 * Write ecore : launches the KM2Ecore exporter and save it in "file"
	 * TODO Since this method is called in JunitTestSuite, in Kermeta2EcoreWizard, and many other
	 * files, it should be shared elsewhere... 
	 * @param builder
	 * @param file
	 * @param overwrite overxrite file if already exists
	 * @return the resource that hosts the wanted ecore file
	 */
	public Resource writeEcore(KermetaUnit builder, String file, boolean overwrite)
	{   
	    // Create Ecore structure
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    URI u = URI.createURI(file);
    	KermetaUnit.internalLog.info("URI created for model to save : "+u);
    	URIConverter c = new URIConverterImpl();
    	u = c.normalize(u);
    	Resource resource = ecoreResourceSet.createResource(u);
	    // KMT2ECORE
	    KM2Ecore exporter;
	    exporter = new KM2Ecore(resource, builder);
		exporter.exportPackage(builder.rootPackage);
	    // Save Ecore structure	
		try {
			// TODO : test if file exists!! -> u.toFileString() reutrns null :(
			if (overwrite==true)
				resource.save(null);
			savedFiles.put(file, resource); // add the file so that we avoid re-save of resources
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: "+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource (" + file + "), due to Exception: ", e);
		}

		return resource;
	}
}