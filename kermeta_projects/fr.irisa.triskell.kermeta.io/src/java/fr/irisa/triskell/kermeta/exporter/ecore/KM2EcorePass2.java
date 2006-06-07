/* $Id: KM2EcorePass2.java,v 1.14 2006-06-07 16:41:43 zdrey Exp $
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
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
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
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.utils.URIMapUtil;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * Exports KM or KMT to Ecore, pass 2.
 * This pass :
 * - Set the types of all the typed elements
 * - Convert non-compatible Ecore *typed* elements into annotations. Examples : 
 *    - the super types of operations
 *    - the type paramaters of operations and class definition
 * - Convert the opposite of properties
 * - Convert the body of derived properties
 *  
 */
public class KM2EcorePass2 extends KermetaOptimizedVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass2");
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	
	public	Package root_p;
	protected KM2Ecore ecoreExporter;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	protected ResourceSet ecoreResourceSet = null;
	
	/** Contains the string uris of the resources already saved during this pass */
	protected Hashtable<String, Resource> savedFiles = null;
	
	/** Contains the hashtable of KM2EcorePass1 */
	protected Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> kmt2ecoremapping;
	
	/**
	 * @param resource : the resource to populate
	 * @param mapping : the hashtable that contains the { Object, EObject } mappings
	 * @param anExporter : the km2ecore exporter; it contains a reference to the KermetaUnit of the Kmt file to
	 * convert.
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
		root_p = root_package;
		return accept(root_package);
	}
	
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		EClass newEClass=null;
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ node.getName());
		loggerTabs.increment();
		
		// Search the Eclass from previous pass
		newEClass = (EClass)kmt2ecoremapping.get(node);
		
		// Search the super types of EClass
		Iterator it = node.getSuperType().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEClass.getESuperTypes().add(o);
			else // FIXME When this case does occur?
				internalLog.warn(loggerTabs + "Problem : accept of a getFSuperType returned null : " + o);
		}
		
		// Visit TypeParameters (accept is called insite typeparamaterAnnotation)
		it = node.getTypeParameter().iterator();
		while(it.hasNext()) {
			// One annotation per type parameter
			TypeVariable tv = (TypeVariable)it.next();
			setTypeVariableAnnotation(tv, newEClass);
		}
		
		// Visit owned attributes
		it = node.getOwnedAttribute().iterator();
		while(it.hasNext()) { accept((EObject)it.next()); }

		// Visit owned operations
		it = node.getOwnedOperation().iterator();
		while(it.hasNext()) { accept((EObject)it.next()); }
		
		loggerTabs.decrement();
		return newEClass;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		EOperation newEOperation=null;
		//internalLog.debug(loggerTabs + "Visiting Operation: "+ node.getName());
		loggerTabs.increment();
		
		// search the EOperation from previous pass
		newEOperation = (EOperation)getEObjectForKMObject(node);
		// Parameters
		Iterator it = node.getOwnedParameter().iterator();
		while(it.hasNext()) { this.accept((EObject)it.next()); }
		
		// Return type
		if(node.getType() != null) {
			newEOperation.setEType((EClassifier)this.accept((EObject)node.getType()));
		}
		
		// -------------- Create annotations for Kermeta elements that are not ECORE-compatibles
		
		// Superoperation
		if (node.getSuperOperation() != null)
			setSuperOperationAnnotation(node.getSuperOperation(), newEOperation);

		it = node.getRaisedException().iterator();
		while (it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Class  anException = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
			setRaisedExceptionAnnotation(anException, newEOperation);
		}
		
		// TypeParameters
		it = node.getTypeParameter().iterator();
		while(it.hasNext()) {
			// use the KMTprettyPrinter to output in the annotation
			// one annotation per type parameter
			TypeVariable tv = (TypeVariable)it.next();
			setTypeVariableAnnotation(tv, newEOperation);			
		}
		
		loggerTabs.decrement();
		return newEOperation;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Parameter)
	 */
	public Object visitParameter(Parameter node) {
		//internalLog.debug(loggerTabs + "Visiting Parameter: "+ node.getName());
		loggerTabs.increment();
		// Search the EParameter from previous pass
		//EParameter newEParameter = (EParameter)kmt2ecoremapping.get(node);
		EParameter newEParameter = (EParameter)getEObjectForKMObject(node);
		// TODO If it is not found in kmt2ecoremapping?
		EClassifier type = (EClassifier)accept(node.getType());
		if(type == null)
		{   // Perhaps this type is in another resource?
			type = resolveETypeForEStructuralFeature(node);
		}
		newEParameter.setEType(type);
		//if (type == null) throw new KM2ECoreConversionException("FUCK");
		loggerTabs.decrement();
		return newEParameter;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Class)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		EClassifier newEClassifier=null;		
		
		newEClassifier = (EClassifier)kmt2ecoremapping.get(node.getTypeDefinition());
		if (newEClassifier ==  null)
		{	// maybe this is new reference to a primitive type or a class defined in another file
			// we do that here because we don't want to visit the whole FClass tree during the pass1 
			// only to retreive some references to String or Integer  
			String type_name = KMTHelper.getQualifiedName(node.getTypeDefinition());
			  
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				//internalLog.debug(loggerTabs + "Creating DataType: "+ node.getTypeDefinition().getName());
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
		// Handle the case of EObject from Ecore metamodel
		System.err.println(object_qname + "CLE : " + owning_typedef_qname + " - test in : " + ecoreExporter.getKermetaUnit().getUri());
		String ecoreDir = ecoreExporter.ecoreGenDirectory;
		if (ecoreDir == null)
			ecoreDir = ecoreExporter.getKermetaUnit().getUri().substring(0, ecoreExporter.getKermetaUnit().getUri().lastIndexOf("/"));
		EObject result = null;
		Resource depResource = null;
		
		ArrayList<KermetaUnit> allunits = new ArrayList<KermetaUnit>(ecoreExporter.getKermetaUnit().getAllImportedUnits());
		// Find in framework.km also -> its unit is not in imported units..
		//allunits.add(KermetaUnit.getStdLib());
		Iterator<KermetaUnit> allunits_it = allunits.iterator();
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
					// Does the searched type definition belong to??
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
					String savepath = path + "/" + kmpath.substring(kmpath.lastIndexOf("/"), kmpath.lastIndexOf(".km")) + ".ecore";
					
					// Does the searched type definition belong to Ecore metamodel?
					if (ku.rootPackage.getName().equals("ecore"))
					{   // FIXME : is there a better way to get ECORE URI???
						URI u = URI.createURI(KM2Ecore.ECORE_NSURI);
						depResource = ecoreResourceSet.getResource(u, true);
					}
					// Does the searched type definition belong to??
				/*	else if (ku.rootPackage.getName().equals("kermeta"))
					{
						System.out.println("KMFRAM: " );
						URI u = URI.createURI(ku.getUri());
						depResource = ecoreResourceSet.getResource(u, true);
					}*/
					// Else : create the ecore resource corresponding to kermeta unit on which
					else if (!savedFiles.containsKey(savepath))
					{	// Create the ecore resource corresponding to kermeta unit on which 
						depResource = writeEcore(ku, savepath, true);
					}
					else
					{
						depResource = savedFiles.get(savepath);
						try { depResource.load(null); }
						catch (IOException e) { e.printStackTrace(); }
					}
					result = depResource.getEObject("//"+ ecore_path);
				}// "Robustness" test? -> would occur if there was a new KermetaUnit kind
				else {
					throw new KM2ECoreConversionException("Handle for this kind of unit is not implemented : " + ku + "; " +
							"Please send an email to kermeta-developers :}");
				}
			}
		}
		return result;
	}
	
	
	/**
	 * Find the EClassifier of the specified <code>enode</code>
	 */
	protected EClassifier resolveETypeForEStructuralFeature(TypedElement node)
	{
		String type = KMTHelper.getTypeQualifiedName(node.getType());
		EClassifier result = (EClassifier)getEObjectForQualifiedName(type,type);
		return result;
	}
	
	public EClassifier getEObjectFromEcoreMetamodel(EStructuralFeature enode) {
		EClassifier etype = enode.getEType();
		return etype;
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature = null;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		// search the Eclass from previous pass
		newEStructuralFeature = (EStructuralFeature)kmt2ecoremapping.get(node);
		// If property is composite or derived we have to check the type (primitive type or not)
		if(ecoreExporter.isTypeValidForAttibute(node.getType()))
			newEAttribute = (EAttribute)newEStructuralFeature;
		else
			newEReference = (EReference)newEStructuralFeature;
		// Retrieve the opposite (only valable if node is a ereference)
		if(newEReference != null && node.getOpposite() != null)
			newEReference.setEOpposite((EReference)kmt2ecoremapping.get(node.getOpposite()));
		
		// Convert the bodies of derived properties
		if (node.isIsDerived()) {
			// DerivedProperty
			String getterBody = null; String setterBody = null;
			if (node.getGetterBody() != null) 
				getterBody = (String)new KM2KMTPrettyPrinter().accept(node.getGetterBody());
			else
				getterBody = propertyAccessor(node.getName(), "getter");
			
			if (! node.isIsReadOnly()) {
				if (node.getSetterBody() != null)
					setterBody = (String)new KM2KMTPrettyPrinter().accept(node.getSetterBody());
				else
					setterBody = propertyAccessor(node.getName(), "setter");
			}
			setDerivedPropertyAnnotation(node, newEStructuralFeature, getterBody, setterBody);
		}
		
		EClassifier type = (EClassifier)accept(node.getType());
		if(type == null)	
		{	// Perhaps this type is in another resource?
			type = resolveETypeForEStructuralFeature(node);
		}
		newEStructuralFeature.setEType(type);
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.StringLiteral)
	 */
	public Object visitStringLiteral(StringLiteral node) {
		internalLog.debug(loggerTabs + "Visiting StringLiteral: "+ node.getValue());		
		return node.getValue(); 
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeLiteral)
	 */
	public Object visitTypeLiteral(TypeLiteral node) {
		internalLog.debug(loggerTabs + "Visiting TypeLiteral");
		loggerTabs.increment();
		Object o = this.accept(node.getTyperef());
		loggerTabs.decrement();		
		return o;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeReference)
	 */
	public Object visitTypeReference(TypeReference node) {
		internalLog.debug(loggerTabs + "Visiting TypeReference: "+ node.getName());
		loggerTabs.increment();
		Object o = this.accept(node.getType());
		loggerTabs.decrement();	
	    return o;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visitVoidType(VoidType node) {
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node) {
		//internalLog.debug(loggerTabs + "Visiting PrimitiveType: "+ node.getName()+ " : "+ node.getInstanceType());
		//internalLog.debug(loggerTabs + "                       : "+ node);
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
	
	/** 
	 * @param name the name of the derived property
	 * @param acc_type the type  of the accessor ("getter"/"setter") 
	 */
	public String propertyAccessor(String name, String acc_type)
	{
		return "do\n" +
		"   //TODO: implement " + acc_type + "for derived property " + name + "\n" +
		"   raise kermeta::exceptions::NotImplementedException.new \n" +
		"end";
	}
	
	/*
	 * 
	 *  HELPER METHODS THAT SET THE ANNOTATIONS
	 * 
	 */
	/**
	 * Set the annotations corresponding to the bodies of a derived property
	 * Important note : we do not add those annotation in Ecore "generated metamodel"...
	 */
	protected void setDerivedPropertyAnnotation(Property node, EStructuralFeature newEStructuralFeature, String getterBody, String setterBody) 
	{
		// Do not handle the ecore metamodel case!
		// We know that : EStructuralFeature container type : EClass
		// EClass container type : EPackage.
/*		if (!((ENamedElement)newEStructuralFeature.eContainer().eContainer()).getName().equals("ecore"))
		{*/	
			if (! node.isIsReadOnly())
			{
				ecoreExporter.addAnnotation( 
						newEStructuralFeature,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY,
						KM2Ecore.KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_SETTERBODY,
						setterBody,
						null);
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
		}
/*	}*/
	
	public void setSuperOperationAnnotation(Operation superOperation, EOperation newEOperation) {
		ecoreExporter.addAnnotation( 
				newEOperation,
				KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION,
				KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS,
				KMTHelper.getQualifiedName(superOperation.getOwningClass()),
				(EObject)accept(superOperation));		
	}
	
	/**
	 * 
	 * @param anException
	 * @param newEOperation
	 */
	public void setRaisedExceptionAnnotation(fr.irisa.triskell.kermeta.language.structure.Class anException, EOperation newEOperation) {
		EClassifier exceptionEClassifier =  (EClassifier)accept(anException);
		ecoreExporter.addAnnotation( 
				newEOperation,
				KM2Ecore.KMT2ECORE_ANNOTATION_RAISEDEXCEPTION,
				KM2Ecore.KMT2ECORE_ANNOTATION_RAISEDEXCEPTION_DETAILS,
				KMTHelper.getQualifiedName(anException.getTypeDefinition()),
				exceptionEClassifier);		
	}

	/**
	 * Visit type parameters
	 * @param tv
	 * @param newEObject EClass or EOperation (thone only types concerned by type parameters)
	 */
	protected void setTypeVariableAnnotation(TypeVariable tv, EModelElement newEObject) {
		String typeParameterString = tv.getName();			
		if (tv.getSupertype() != null) 
			typeParameterString += " : " + new KM2KMTPrettyPrinter().accept(tv.getSupertype());
		ecoreExporter.addAnnotation( 
				newEObject,
				KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER,
				tv.getName(),
				typeParameterString,
				null);					
	}
}