/* $Id: KM2EcorePass2.java,v 1.37 2007-07-17 15:55:29 cfaucher Exp $
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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
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
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreUnit;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
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
	protected Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> km2ecoremapping;
	/** Contains the list of ClassDefinition that "have passed" pass 2*/
	protected ArrayList<ClassDefinition> pass2done_mapping;

	
	/**
	 * @param resource : the resource to populate
	 * @param mapping : the hashtable that contains the { Object, EObject } mappings
	 * @param anExporter : the km2ecore exporter; it contains a reference to the KermetaUnit of the Kmt file to
	 * convert.
	 */
	public KM2EcorePass2(Resource resource, Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> mapping, KM2Ecore anEcoreExporter) {
		ecoreResource = resource;
		ecoreResourceSet = resource.getResourceSet();
		km2ecoremapping = mapping;	
		ecoreExporter = anEcoreExporter;
		savedFiles = new Hashtable<String, Resource>();
		pass2done_mapping = new ArrayList<ClassDefinition>();
	}
	

	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(Package root_package) {
		root_p = root_package;
		return accept(KermetaUnit.getRootPackageForSerialization(root_p));
	}


	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		EClass newEClass = null;
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ node.getName());
		loggerTabs.increment();
		
		// Search the Eclass from the pass 1
		newEClass = (EClass) km2ecoremapping.get(node);

		// Search the super types of EClass
		for(Object next : node.getSuperType()) {
			Type t = (Type) next;
			Object o = accept(t); 
			if(o != null) {
				// Add type to supertypes list
				newEClass.getESuperTypes().add((EClass) o);

				// In case type has type variable bindings, add a superclass bindings annotation
				// to generated EClass
				if(t instanceof ParameterizedType) {
					ParameterizedType pType = (ParameterizedType) t;
					if(! pType.getTypeParamBinding().isEmpty())
						setSuperclassTypeVariableBindingsAnnotation(pType, newEClass);
				}
			}
			else
				// FIXME When this case does occur?
				throw new KM2ECoreConversionException( "Problem : accept of a getSuperType on '"+ node.getName()+ "' returned null -- " + next);
		}

		// Visit owned attributes
		for(Property next : node.getOwnedAttribute()) { accept(next); }
		// Visit owned operations
		for(Operation next : node.getOwnedOperation()) { accept(next); }
		
		// Visit type parameters in order to fix the type parameter's super type
		for(TypeVariable next : node.getTypeParameter()) {
			setTypeParameterSuperType(next);
		}
		
		loggerTabs.decrement();
		return newEClass;
	}
	

	/**
	 * @see KermetaOptimizedVisitor#visitOperation(Operation)
	 */
	public Object visitOperation(Operation node) {
		internalLog.debug(loggerTabs + "Visiting Operation: "+ node.getName());
		loggerTabs.increment();
		
		// Search the EOperation from pass 1
		EOperation newEOperation = getEObjectForOperation(node);
		
		if (newEOperation == null)
			throw new KM2ECoreConversionException("KM2Ecore exception : could not find" 
					+ " an operation with this qualified name :\n    "
					+ NamedElementHelper.getQualifiedName(node));
		// Parameters
		for ( Object next : node.getOwnedParameter() ) { this.accept((EObject)next); }


		///////////////////////////////////////////////////////////////////////////////////
		// Return type (it can be null)
		Type opType = node.getType();
		if(opType instanceof ObjectTypeVariable || opType instanceof FunctionType) {
			// Deprecated since EMF2.3
			// If type of operation is a kermeta special type, set its type to the "_KermataSpecialTypesAlias_" 
			// datatype created during first pass
			//newEOperation.setEType(ecoreExporter.kermetaTypesAlias);

			// Add ObjectTypeVariable to EOperation
			if(opType instanceof ObjectTypeVariable) {
				newEOperation.setEGenericType((EGenericType) accept(opType));
			}
			else {
				setFunctionTypeAnnotation((FunctionType) opType, newEOperation);
			}
		}
		else {
			if(opType != null) {
				newEOperation.setEType((EClassifier) this.accept((EObject) opType));
				
				if(opType instanceof ParameterizedType) {
					setTypeVariableBindingsAnnotation((ParameterizedType) opType, newEOperation);
				}
			}
		}

		
		//////////////////////////////////////////////////////////////////////////////////
		// ------- Create annotations for Kermeta elements that are not Ecore-compatibles
		
		// Superoperation
		if (node.getSuperOperation() != null)
			setSuperOperationAnnotation(node.getSuperOperation(), newEOperation);

		// Raised exceptions
		for ( Object next : node.getRaisedException() )
		{
			fr.irisa.triskell.kermeta.language.structure.Class anException = (fr.irisa.triskell.kermeta.language.structure.Class)next;
			setRaisedExceptionAnnotation(anException, newEOperation);
		}
		
		// Visit type parameters in order to fix the type parameter's super type
		for(TypeVariable next : node.getTypeParameter()) {
			setTypeParameterSuperType(next);
		}
		
		loggerTabs.decrement();
		return newEOperation;
	}
	

	/**
	 * @see KermetaOptimizedVisitor#visitParameter(Parameter)
	 */
	public Object visitParameter(Parameter node) {
		// Search the EParameter from previous pass 1, then set its type
		EParameter newEParameter = getEObjectForParameter(node);
		
		EClassifier type = null; 

		///////////////////////////////////////////////////////////////////////////////////
		// Return type (it can NOT be null)
		Type paramType = node.getType(); 
		if(paramType instanceof TypeVariable || paramType instanceof FunctionType) {
			// Deprecated since EMF2.3
			// If type of parameter is a kermeta special type, set its type to the "_KermataSpecialTypesAlias_" 
			// datatype created during first pass
			//type = ecoreExporter.kermetaTypesAlias; 

			// Add ObjectTypeVariable to EParameter
			if(paramType instanceof ObjectTypeVariable) {
				newEParameter.setEGenericType((EGenericType) accept(paramType));
			}
			else {
				setFunctionTypeAnnotation((FunctionType) paramType , newEParameter);
			}
		}
		else {
			type = (EClassifier)accept(paramType);

			if (type == null ) { 
				// null type forbidden for parameter type
				throw new KM2ECoreConversionException( 
				"Problem : type not found for a parameter '"+ node.getName()+ "' in operation : " +
				NamedElementHelper.getQualifiedName(node.getOperation()));
			}
			else {
				if(paramType instanceof ParameterizedType) {
					setTypeVariableBindingsAnnotation((ParameterizedType) paramType, newEParameter);
				}
			}
			newEParameter.setEType(type);
		}

		return newEParameter;
	}
	

	/**
	 * @see KermetaOptimizedVisitor#visitClass(fr.irisa.triskell.kermeta.language.structure.Class)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node)
	{
		// Find the class from pass 1
		EClassifier newEClassifier = (EClassifier)km2ecoremapping.get(node.getTypeDefinition());
		
		if (newEClassifier ==  null)
		{	// maybe this is new reference to a primitive type or a class defined in another file
			// we do that here because we don't want to visit the whole FClass tree during the pass1 
			// only to retreive some references to String or Integer  
			String type_name = NamedElementHelper.getMangledQualifiedName(node.getTypeDefinition());
			  
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				//internalLog.debug(loggerTabs + "Creating DataType: "+ node.getTypeDefinition().getName());
				type_name = (String)KM2Ecore.primitive_types_mapping.get(type_name);
				// we need to create a new datatype for it and connect it to the root package
				newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
				newEClassifier.setName(node.getTypeDefinition().getName());
				newEClassifier.setInstanceClassName(type_name);
				EPackage root_EPackage = (EPackage)km2ecoremapping.get(root_p);
				root_EPackage.getEClassifiers().add(newEClassifier);
				km2ecoremapping.put(node.getTypeDefinition(),newEClassifier);
			}
		}
		// Is it an external type?
		if (newEClassifier == null) newEClassifier = getEObjectForType(node);
		
		
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
	 * @see KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public Object visitProperty(Property node) {
		internalLog.debug(loggerTabs + "Visiting Property: "+ node.getName());
		loggerTabs.increment();
		
		EStructuralFeature newEStructuralFeature = null;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		// search the Eclass from previous pass
		newEStructuralFeature = (EStructuralFeature)getEObjectForProperty(node);
		
		// If property is composite or derived we have to check the type (primitive type or not)
		if(ecoreExporter.isPropertyValidForEAttribute(node))
			newEAttribute = (EAttribute)newEStructuralFeature;
		else
			newEReference = (EReference)newEStructuralFeature;
		// Retrieve the opposite (only valable if node is a ereference)
		if(newEReference != null && node.getOpposite() != null)
			newEReference.setEOpposite((EReference)getEObjectForProperty(node.getOpposite()));
		
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
		
		EClassifier type = null;

		
		///////////////////////////////////////////////////////////////////////////////////
		// Return type (it can NOT be null)
		Type propType = node.getType();
		if(propType instanceof TypeVariable || propType instanceof FunctionType) {
			// Deprecated since EMF2.3
			// If type of property is a kermeta special type, set its type to the "_KermataSpecialTypesAlias_" 
			// datatype created during first pass
			//type = ecoreExporter.kermetaTypesAlias; 

			// Add ObjectTypeVariable to EStructuralFeature
			if(propType instanceof ObjectTypeVariable) {
				newEStructuralFeature.setEGenericType((EGenericType) accept(propType));
				//newEStructuralFeature.setEGenericType(EcoreFactory.eINSTANCE.createEGenericType());
				//newEStructuralFeature.getEGenericType().setETypeParameter((ETypeParameter) km2ecoremapping.get(propType));
			}
			else {
				setFunctionTypeAnnotation((FunctionType) propType, newEStructuralFeature);
			}
		}
		else {
			type = (EClassifier)accept(propType);
			if (type == null ) {
				// null type forbidden for parameter type
				throw new KM2ECoreConversionException( 
				"Problem : type not found for a property '"+ node.getName()+ "' in class definition : " +
				NamedElementHelper.getQualifiedName(node.getOwningClass()));
			}
			else {
				if(propType instanceof ParameterizedType) {
					setTypeVariableBindingsAnnotation((ParameterizedType) propType, newEStructuralFeature);
				}
			}
			newEStructuralFeature.setEType(type);
		}

		loggerTabs.decrement();		
		return newEStructuralFeature;
	}
	
	
	/**
	 * @see KermetaOptimizedVisitor#visitObjectTypeVariable(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable)
	 */
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		EGenericType newEGenericType = EcoreFactory.eINSTANCE.createEGenericType();
		newEGenericType.setETypeParameter((ETypeParameter) km2ecoremapping.get(node));
		
		return newEGenericType;
	}
	

	/**
	 * @see KermetaOptimizedVisitor#visitStringLiteral(fr.irisa.triskell.kermeta.language.structure.StringLiteral)
	 */
	public Object visitStringLiteral(StringLiteral node) {
		return node.getValue(); 
	}
	

	/**
	 * @see KermetaOptimizedVisitor#visitTypeLiteral(fr.irisa.triskell.kermeta.language.structure.TypeLiteral)
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
	 * TODO!
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFunctionType(fr.irisa.triskell.kermeta.language.structure.FunctionType)
	 */
	public Object visitFunctionType(FunctionType node) {
		return this.accept(node.getRight());
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visitVoidType(VoidType node) { return null; }
	
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitType(fr.irisa.triskell.kermeta.language.structure.Type)
	 */
	public Object visitType(Type node) {
		internalLog.info("TODO : this type is not properly handled : " + node);
		Object result = km2ecoremapping.get(node);
		if (result == null) result = getEObjectForType(node);
		return result;
	}


	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node)
	{ 
		Object eenum = km2ecoremapping.get(node);
		if( eenum == null) eenum = getEObjectForType(node); 
		return eenum ;
	}
	

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPrimitiveType(PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node)
	{
		String type_name = NamedElementHelper.getMangledQualifiedName(node);
		EClassifier newEClassifier = (EClassifier)km2ecoremapping.get(node);
		if (newEClassifier ==  null)
		{
			if (KM2Ecore.primitive_types_mapping.containsKey(type_name)) {
				internalLog.debug(loggerTabs + "Creating DataType: "+ node.getName());
				type_name = (String)KM2Ecore.primitive_types_mapping.get(type_name);
				// we need to create a new datatype for it and connect it to the root package
				newEClassifier  = EcoreFactory.eINSTANCE.createEDataType();
				newEClassifier.setName(node.getName());
				newEClassifier.setInstanceClassName(type_name);
				EPackage root_EPackage = (EPackage)km2ecoremapping.get(root_p);
				root_EPackage.getEClassifiers().add(newEClassifier);
				km2ecoremapping.put(node,newEClassifier);
			}
		}
		if (newEClassifier==null) newEClassifier = getEObjectForType(node);
		return newEClassifier;
	}
	

	/**
	 * Find the EClassifier of the specified <code>enode</code>
	 */
	protected EClassifier getEObjectForType(Type node)
	{ 
		// Get the type and short_types
		String qtype = TypeHelper.getMangledQualifiedName(node);
		if (qtype.equals("") || node instanceof FunctionType || node instanceof TypeVariable)
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
	protected EOperation getEObjectForOperation(Operation node)
	{
		if (km2ecoremapping.containsKey(node))
			return (EOperation) km2ecoremapping.get(node);
		else
			return (EOperation)getEObjectForQualifiedName(
					NamedElementHelper.getMangledQualifiedName(node),
					NamedElementHelper.getMangledQualifiedName(node.getOwningClass()));
	}
	

	protected EStructuralFeature getEObjectForProperty(Property node)
	{
		if (km2ecoremapping.containsKey(node))
			return (EStructuralFeature) km2ecoremapping.get(node);
		else
			return (EStructuralFeature)getEObjectForQualifiedName(
					NamedElementHelper.getMangledQualifiedName(node),
					NamedElementHelper.getMangledQualifiedName(node.getOwningClass()));
	}
	

	protected EParameter getEObjectForParameter(Parameter node)
	{
		if (km2ecoremapping.containsKey(node))
			return (EParameter) km2ecoremapping.get(node);
		else
			return (EParameter)getEObjectForQualifiedName(
					NamedElementHelper.getMangledQualifiedName(node),
					NamedElementHelper.getMangledQualifiedName(node.getOperation().getOwningClass()));
	}


	/**
	 * @param object_qname the qualified name (in kermeta::format) of the object we are looking for 
	 * @param owning_typedef_qname the owning typedefinition to which the object belongs or is related to
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
		String framework_ecore_path = StdLibKermetaUnitHelper.STD_LIB_URI.substring(0, StdLibKermetaUnitHelper.STD_LIB_URI.lastIndexOf(".km")) + ".ecore";
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
				else if (!ku.getUri().equals(StdLibKermetaUnitHelper.STD_LIB_URI) 
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
	// FIXME (Fran�ois) I am not sure that this method should be here. I copied this method in KM2Ecore class as a
	// a static class.
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
	 * @param node
	 * @param newEStructuralFeature
	 * @param getterBody
	 * @param setterBody
	 */
	protected void setDerivedPropertyAnnotation(Property node, EStructuralFeature newEStructuralFeature, String getterBody, String setterBody)  {
		// We know that : EStructuralFeature container type : EClass
		// EClass container type : EPackage.
		if (! node.isIsReadOnly()) {
			ecoreExporter.addAnnotation( 
					newEStructuralFeature,
					KM2Ecore.ANNOTATION_DERIVEDPROPERTY_SETTER,
					KM2Ecore.ANNOTATION_BODY_DETAILS,
					setterBody,
					null);
		}
		
		ecoreExporter.addAnnotation( 
				newEStructuralFeature,
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_GETTER,
				KM2Ecore.ANNOTATION_BODY_DETAILS,
				getterBody,
				null);
		
		ecoreExporter.addAnnotation( 
				newEStructuralFeature,
				KM2Ecore.ANNOTATION,
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_ISREADONLY_DETAILS,
				new Boolean(node.isIsReadOnly()).toString(),
				null);
	}
	

	/**
	 * @param superOperation
	 * @param newEOperation
	 */
	public void setSuperOperationAnnotation(Operation superOperation, EOperation newEOperation) {
		ecoreExporter.addAnnotation( 
				newEOperation,
				KM2Ecore.ANNOTATION,
				KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS,
				NamedElementHelper.getMangledQualifiedName(superOperation.getOwningClass()),
				(EObject)accept(superOperation));		
	}
	
	
	/**
	 * @param anException
	 * @param newEOperation
	 */
	public void setRaisedExceptionAnnotation(fr.irisa.triskell.kermeta.language.structure.Class anException, EOperation newEOperation) {
		EClassifier exceptionEClassifier =  (EClassifier)accept(anException);
		ecoreExporter.addConstraintAnnotation( 
				newEOperation,
				KM2Ecore.ANNOTATION_RAISEDEXCEPTION,
				NamedElementHelper.getMangledQualifiedName(anException.getTypeDefinition()), // Only decorative info, currently useless
				NamedElementHelper.getMangledQualifiedName(anException.getTypeDefinition()), // Idem
				exceptionEClassifier);		
	}


	/**
	 * Visit type parameters
	 * @param tv
	 * @param newEObject EClass or EOperation (thone only types concerned by type parameters)
	 */
	protected void setTypeParameterAnnotation(TypeVariable tv, EModelElement newEObject) {
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

	
	/**
	 * This method aims to add a type variable annotation to a ETypedElement (EStructuralFeature/
	 * EOperation/EParameter) which kermeta type is a type variable.
	 * It saves the qualified name of type variable.
	 * @param qName  - qualified name of the kermeta specific type
	 * @param newElt - newly allocated element corresponding to this type
	 */
	protected void setTypeVariableAnnotation(String qName, ETypedElement newElt) {
		ecoreExporter.addAnnotation( 
				newElt,
				KM2Ecore.ANNOTATION_TYPEVARIABLE,
				qName,
				qName,
				null);
	}


	/**
	 * This method aims to add a function type annotation to a ETypedElement (EStructuralFeature/
	 * EOperation/EParameter) which kermeta type is a function type.
	 * It saves the signature of the function type.
	 * @param fType  - function type to be saved
	 * @param newElt - newly allocated element corresponding to this type
	 */
	protected void setFunctionTypeAnnotation(FunctionType fType, ETypedElement newElt) {
		Type leftType = fType.getLeft();
		Type rightType = fType.getRight();
		
		// Build list of function parameters
		ArrayList<Type> params = new ArrayList<Type>(); 
		if(leftType instanceof ProductType) {
			params.addAll( ((ProductType) leftType).getType() );
		}
		else {
			params.add(leftType);
		}
		
		int i = 0;
		String qName = null;
		
		// Save function parameters intio annotation
		Type t = null;
		for(Object next : params) {
			t = (Type) next;
			qName = (String) new KM2KMTPrettyPrinter().accept(t);
			
			ecoreExporter.addAnnotation( 
					newElt,
					KM2Ecore.ANNOTATION_FUNCTIONTYPE,
					String.valueOf(i),
					qName,
					null);
			
			i++;
		}
		
		// Save function return type into annotation
		qName = (String) new KM2KMTPrettyPrinter().accept(rightType);
		ecoreExporter.addAnnotation( 
				newElt,
				KM2Ecore.ANNOTATION_FUNCTIONTYPE,
				String.valueOf(i),
				qName,
				null);
	}


	/**
	 * This method adds the type variable bindings annotation to the generated ETypedElement
	 * (EStructuralFeature/EOperation/EParameter).
	 *  The annotation details map will contain an entry for each binding of the typed
	 *  element.
	 * @param paramType - parameterized type
	 * @param newElt    - newly allocated element corresponding to this type
	 */
	protected void setTypeVariableBindingsAnnotation(ParameterizedType paramType, ETypedElement newElt) {
		String qName = null;
		Type bindingType = null;
		
		// Counter used to fill in the key field of the annotation details map
		int i = 0;
		
		// Iterate over bindings of the type
		for(Object next : paramType.getTypeParamBinding()) {
			TypeVariableBinding binding = (TypeVariableBinding) next;
			
			bindingType = binding.getType(); 
			
			// Get qualified name of binding type according to its type
			// Binding type is a parameterized type (=> a class)
			if(bindingType instanceof ParameterizedType) {
				qName = (String) new KM2KMTPrettyPrinter().accept((ParameterizedType) binding.getType());
			}
			// Binding type is a data type (=> a primitive type)
			else if(bindingType instanceof DataType) {
				qName = ((DataType) bindingType).getName();
			}
			// Binding type is a parameterized type variable
			else if(bindingType instanceof TypeVariable) {
				qName = ((TypeVariable) bindingType).getName();
			}
			
			// Add annotation for current binding
			ecoreExporter.addAnnotation(
					newElt,
					KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS,
					String.valueOf(i),
					qName,
					null);
			
			// Increment counter
			i++;
		}
	}


	/**
	 * This method adds the current EClass a TypeVariableBinding annotation that saves
	 * information about the 'ptype' parameterized supertype of the class.   
	 * @param pType     - parameterized supertype of visited class
	 * @param newEClass - newly generated EClass
	 */
	protected void setSuperclassTypeVariableBindingsAnnotation(ParameterizedType pType, EClass newEClass) {
		// Get qualified name of supertype
		String qName = (String) new KM2KMTPrettyPrinter().accept(pType);
		
		// Add supertype binding annotation
		ecoreExporter.addAnnotation(
				newEClass,
				KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS,
				qName,
				qName,
				null);
	}
	
	/**
	 * 
	 * @param node
	 */
	protected void setTypeParameterSuperType(TypeVariable next) {	
		// Add type to supertypes list
		// FIXME CF We must choose the common super type
		if(next.getSupertype() != null) {
			Type t = (Type) next.getSupertype();
			Object o = accept(t); 
			if(o != null) {
				if(o instanceof EClass) {
					EGenericType newEGenericTypeForSuperType = EcoreFactory.eINSTANCE.createEGenericType();
					newEGenericTypeForSuperType.setEClassifier((EClass) o);
					((ETypeParameter) km2ecoremapping.get(next)).getEBounds().add(newEGenericTypeForSuperType);
				}
				
				if(o instanceof EGenericType) {
					((ETypeParameter) km2ecoremapping.get(next)).getEBounds().add((EGenericType) o);
				}
			}
		}
	}
	
}