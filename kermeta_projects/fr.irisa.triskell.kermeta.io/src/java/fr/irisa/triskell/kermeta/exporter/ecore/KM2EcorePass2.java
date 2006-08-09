/* $Id: KM2EcorePass2.java,v 1.20 2006-08-09 14:54:12 zdrey Exp $
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

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
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
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
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
		
		// Search the Eclass from the pass 1
		newEClass = (EClass)getEObjectForKMObject(node);
		
		// Search the super types of EClass
		for ( Object next : node.getSuperType()) {
			Object o = accept((Type)next);
			if (o != null)
				newEClass.getESuperTypes().add(o);
			else // FIXME When this case does occur?
				throw new KM2ECoreConversionException( "Problem : accept of a getFSuperType on '"+ node.getName()+ "' returned null -- " + next);
		}
		
		// Visit TypeParameters - One annotation per type parameter
		for ( Object tv : node.getTypeParameter() ) {
			setTypeVariableAnnotation((TypeVariable)tv, newEClass);
		}
		
		// Visit owned attributes
		for (Object next : node.getOwnedAttribute() ) { accept((EObject)next); }

		// Visit owned operations
		for (Object next : node.getOwnedOperation() ) { accept((EObject)next); }
		
		loggerTabs.decrement();
		return newEClass;
	}
	
	/**
	 * @see KermetaOptimizedVisitor#visitOperation(Operation)
	 */
	public Object visitOperation(Operation node) {
		EOperation newEOperation=null;
		internalLog.debug(loggerTabs + "Visiting Operation: "+ node.getName());
		loggerTabs.increment();
		
		// Search the EOperation from pass 1
		newEOperation = (EOperation)getEObjectForKMObject(node);
		
		if (newEOperation == null)
			throw new KM2ECoreConversionException("KM2Ecore exception : could not find" 
					+ " an operation with this qualified name :\n    "
					+ KMTHelper.getQualifiedName(node));
		// Parameters
		for ( Object next : node.getOwnedParameter() ) { this.accept((EObject)next); }
		
		// Return type (it can be null)
		if(node.getType() != null) {
			newEOperation.setEType((EClassifier)this.accept((EObject)node.getType()));
		}
		
		// -------------- Create annotations for Kermeta elements that are not ECORE-compatibles
		
		// Superoperation
		if (node.getSuperOperation() != null)
			setSuperOperationAnnotation(node.getSuperOperation(), newEOperation);

		// Raised exceptions
		for ( Object next : node.getRaisedException() )
		{
			fr.irisa.triskell.kermeta.language.structure.Class anException = (fr.irisa.triskell.kermeta.language.structure.Class)next;
			setRaisedExceptionAnnotation(anException, newEOperation);
		}
		
		// TypeParameters : create one annotation per type parameter 
		for ( Object next : node.getTypeParameter() )
		{
			setTypeVariableAnnotation((TypeVariable)next, newEOperation);			
		}
		
		loggerTabs.decrement();
		return newEOperation;
	}
	
	/**
	 * @see KermetaOptimizedVisitor#visitParameter(Parameter)
	 */
	public Object visitParameter(Parameter node) {
		// Search the EParameter from previous pass 1, then set its type
		EParameter newEParameter = (EParameter)getEObjectForKMObject(node);
		EClassifier type = (EClassifier)accept(node.getType());
		if (type == null ) // null type forbidden for parameter type
			throw new KM2ECoreConversionException( 
			"Problem : type not found for a parameter '"+ node.getName()+ "' in operation : " +
			KMTHelper.getQualifiedName(node.getOperation()));
		newEParameter.setEType(type);
		return newEParameter;
	}
	
	/**
	 * @see KermetaOptimizedVisitor#visitClass(fr.irisa.triskell.kermeta.language.structure.Class)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node)
	{
		// Find the class from pass 1
		EClassifier newEClassifier = (EClassifier)kmt2ecoremapping.get(node.getTypeDefinition());
		// Is it an external type?
		if (newEClassifier == null) newEClassifier = getEObjectForType(node);
		
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature = null;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		// search the Eclass from previous pass
		newEStructuralFeature = (EStructuralFeature)getEObjectForKMObject(node);
		// If property is composite or derived we have to check the type (primitive type or not)
		if(ecoreExporter.isTypeValidForEAttibute(node.getType()))
			newEAttribute = (EAttribute)newEStructuralFeature;
		else
			newEReference = (EReference)newEStructuralFeature;
		// Retrieve the opposite (only valable if node is a ereference)
		if(newEReference != null && node.getOpposite() != null)
			newEReference.setEOpposite((EReference)getEObjectForKMObject(node.getOpposite()));
		
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
		if (type == null )
			// null type forbidden for parameter type
			throw new KM2ECoreConversionException( 
			"Problem : type not found for a property '"+ node.getName()+ "' in class definition : " +
			KMTHelper.getQualifiedName(node.getOwningClass()));
		newEStructuralFeature.setEType(type);
		loggerTabs.decrement();		
		return newEStructuralFeature;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.StringLiteral)
	 */
	public Object visitStringLiteral(StringLiteral node) {
		return node.getValue(); 
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeLiteral)
	 */
	public Object visitTypeLiteral(TypeLiteral node) {
		return this.accept(node.getTyperef());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeReference)
	 */
	public Object visitTypeReference(TypeReference node) {
		return this.accept(node.getType());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visitVoidType(VoidType node) { return null; }
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node)
	{ 
		return getEObjectForKMObject(node);
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPrimitiveType(PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node)
	{
		return getEObjectForKMObject(node);
	}
	
	/**
	 * Find the EObject in the km2ecore mapping hashtable. If not found, than try to 
	 * find it in the resources that depend on the km file that is being converted.
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
			if (obj instanceof Parameter) // This case should not occur
				result = getEObjectForParameter((Parameter)obj);
			if (obj instanceof Type)
				result = getEObjectForType((Type)obj);
		}
		return result;
	}
	
	/**
	 * Find the EClassifier of the specified <code>enode</code>
	 */
	protected EClassifier getEObjectForType(Type node)
	{ 
		// Get the type and short_types
		String qtype = KMTHelper.getTypeQualifiedName(node);
		if (qtype.equals(""))
		{
			ecoreExporter.getKermetaUnit().messages.addWarning("The kind of type " + node.getClass() + 
					"is not handled yet. Kept to 'kermeta::standard::Object' until handled.", node);
			qtype = "kermeta::standard::Object";
		}
		return (EClassifier)getEObjectForQualifiedName(qtype,qtype);
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
		EObject result = null;
		Resource depResource = null;
		String ecore_path = object_qname.contains(":")?object_qname.substring(object_qname.indexOf(":")+2):object_qname;
		ecore_path = ecore_path.replaceAll("::", "/");
		// Is there an available list or ecore dependencies ?
		if (ecoreExporter.ecoreFileList.size()>0)
		{
			Iterator<String> it = ecoreExporter.ecoreFileList.iterator();
			while (it.hasNext() && result==null)
			{
				String ustr = it.next();
				// load the corresponding resource
				URI u = URIMapUtil.resolveURI("/resource/" + ustr, "platform:/");
				depResource = ecoreResourceSet.getResource(u, true);
				result = (EObject)depResource.getEObject("//" + ecore_path);
			}
		}
		// Take a look in framework. FIXME : require kermeta is not mandatory anymore in 
		// kermeta files, so if user did not put it, it is not in imported units, so we
		// have to handle specially dependency with kermeta framework here:
		String framework_ecore_path = KermetaUnit.STD_LIB_URI.substring(0, KermetaUnit.STD_LIB_URI.lastIndexOf(".km")) + ".ecore";
		// This file exists in Kermeta distribution, so we point to it :
		depResource = ecoreResourceSet.getResource(URI.createURI(framework_ecore_path), true);
		result = depResource.getEObject("//" + ecore_path);
		// If object was not found in the available list of ecore dependencies, create those
		// dependencies
		ArrayList<KermetaUnit> allunits = new ArrayList<KermetaUnit>();
		allunits.addAll(ecoreExporter.getKermetaUnit().getAllImportedUnits());
		Iterator<KermetaUnit> allunits_it = allunits.iterator();
		
		while (allunits_it.hasNext() && result==null)
		{
			KermetaUnit ku = allunits_it.next();
			// If the given type definition is contained in current unit
			if (ku.typeDefs.containsKey(owning_typedef_qname))
			{
				if (ku instanceof EcoreUnit)
				{
					// Does the searched type definition belong to??
					URI u = URI.createURI(ku.getUri());
					depResource = ecoreResourceSet.getResource(u, true);
					result = depResource.getEObject("//" + ecore_path);
				}
				// If KMUnit, it means that the underlying resource if a .km file,
				// then we have to convert it in an .ecore file!.
				else if (!ku.getUri().equals(KermetaUnit.STD_LIB_URI) 
						&& (ku instanceof KMUnit || ku instanceof KMTUnit))
				{
					String kmpath = ku.getUri();
					// Define the path in which the dependent unit will be saved
					String savepath = ecoreExporter.ecoreGenDirectory + 
					"/" + kmpath.substring(kmpath.lastIndexOf("/"), kmpath.lastIndexOf(".km")) + ".ecore";
					
					// Does the searched type definition belong to Ecore metamodel?
					if (ku.rootPackage.getName().equals("ecore"))
					{   // FIXME : is there a better way to get ECORE URI???
						URI u = URI.createURI(KM2Ecore.ECORE_NSURI);
						depResource = ecoreResourceSet.getResource(u, true);
					}
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
		// We know that : EStructuralFeature container type : EClass
		// EClass container type : EPackage.
		if (! node.isIsReadOnly())
		{
			ecoreExporter.addAnnotation( 
					newEStructuralFeature,
					KM2Ecore.ANNOTATION_DERIVEDPROPERTY,
					KM2Ecore.ANNOTATION_DERIVEDPROPERTY_SETTERBODY,
					setterBody,
					null);
		}
		ecoreExporter.addAnnotation( 
				newEStructuralFeature,
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY,
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_GETTERBODY,
				getterBody,
				null);
		ecoreExporter.addAnnotation( 
				newEStructuralFeature,
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY,
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_ISREADONLY,
				new Boolean(node.isIsReadOnly()).toString(),
				null);
	}
	
	
	public void setSuperOperationAnnotation(Operation superOperation, EOperation newEOperation) {
		ecoreExporter.addAnnotation( 
				newEOperation,
				KM2Ecore.ANNOTATION,
				KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS,
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
				KM2Ecore.ANNOTATION_RAISEDEXCEPTION,
				KM2Ecore.ANNOTATION_RAISEDEXCEPTION_DETAILS,
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
				KM2Ecore.ANNOTATION_TYPEPARAMETER,
				tv.getName(),
				typeParameterString,
				null);					
	}
}