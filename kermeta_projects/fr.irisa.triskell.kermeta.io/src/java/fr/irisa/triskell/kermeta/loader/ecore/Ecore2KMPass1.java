/* $Id: Ecore2KMPass1.java,v 1.10 2007-07-03 11:44:38 dvojtise Exp $
 * Project : Kermeta io
 * File : ECore2Kermeta.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 mai 2005
 * Author : Franck Fleurey
 */ 

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author Franck Fleurey
 */
public class Ecore2KMPass1 extends EcoreVisitor {

	// to differenciate the owner of a "KermetaTypeParameter" annotation -> either an EClass or an EOperation
	// since the info. is not contained in this annotation
	public boolean isClassTypeOwner = true;
	public boolean isEcoreType      = false;
	
	/** Unit corresponding to the EcoreUnit of the Ecore file to convert */
	protected EcoreUnit unit;
	/** The resource inside which the converted file will be saved */
	protected Resource resource;
	/** dictionary of { EOperation : Operation } */
	protected Hashtable<EOperation, Operation> operations;
	/** dictionary of types : { EClassifier : TypeDefinition } - EObject is put, but real type of stored 
	 * instances inherits EClassifier - we avoid cast syntax...*/
	protected Hashtable<EClassifier, TypeDefinition> eclassifier_typedefinition_map;
	protected Hashtable<EDataType, PrimitiveType> datatypes;
	/** dictionary of classdefinitions : { ClassDefinition : Class } */
	protected Hashtable<ClassDefinition, fr.irisa.triskell.kermeta.language.structure.Class> classes;
	/** Properties indexed by their qualified names used to set opposites */
	protected Hashtable<String, Property> properties;
	
	protected Stack<Package> packagesStack = new Stack<Package>();
	protected Ecore2KM exporter;
	protected Enumeration current_enum;
	protected PrimitiveType current_primitivetype;
	
	/**
	 * @param unit
	 */
	public Ecore2KMPass1(Ecore2KM exporter) {
		super();
		this.unit = exporter.unit;
		this.resource = exporter.resource;
		this.operations = new Hashtable<EOperation, Operation>();
		this.eclassifier_typedefinition_map = new Hashtable<EClassifier, TypeDefinition>();
		this.datatypes = new Hashtable<EDataType, PrimitiveType>();
		this.classes = new Hashtable<ClassDefinition, fr.irisa.triskell.kermeta.language.structure.Class>();
		this.properties = new Hashtable<String, Property>();
		this.exporter = exporter;
	}
	
	/** Visit EPackage : visit the owned classifiers and the sub packages */
	public Object visit(EPackage node) 
	{
		Package pack = unit.packageLookup( EcoreHelper.getQualifiedName(node));
		
		if (pack == null) {
			pack = unit.struct_factory.createPackage();
			
			pack.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );

			// FIXME : we have to test if URI is valid as a file path or not!
			// Was : pack.setUri(node.getNsURI());
			// node.getNsURI() is not always valid, so by default, we will take unit.getUri();
			pack.setUri(unit.getUri());
			unit.packages.put(EcoreHelper.getQualifiedName(node), pack);
		}

		if (getTopPackage() != null) pack.setNestingPackage(getTopPackage());
		else unit.rootPackage = pack;
		
		packagesStack.push(pack);
		
		acceptList(node.getEAnnotations());
		acceptList(node.getEClassifiers());
		acceptList(node.getESubpackages());
		
		packagesStack.pop();
		
		return pack;
	}
	
	/** Visit an EClass and convert it in a ClassDefinition*/
	public Object visit(EClass node) {
		isClassTypeOwner = true;
		exporter.current_classdef = createClassDefinitionForEClass(node);
		
		TypeDefinition td = unit.typeDefinitionLookup(EcoreHelper.getQualifiedName(node));
		
		// Return a typedef if the element is not contained in ecore metamodel.
		isEcoreType = ((ENamedElement)node.eContainer()).getName().equals("ecore");
		
		if (td != null && isEcoreType) {
			
			boolean oneIsAspect = false;
			if(td instanceof ClassDefinition){
				if(((ClassDefinition)td).isIsAspect()){
					oneIsAspect = true;
				}
			}
			if(!oneIsAspect){
				// Ignore duplicate definition due to the ecore reflexivity
				exporter.current_classdef = (ClassDefinition)td;
				unit.messages.addWarning("Ignore duplicate definition of ecore Type " + EcoreHelper.getQualifiedName(node), td);
				
				return td;
			}
			else {
				// ignore it too, but this times this is because this is an aspect
				return td;
			}
				
		}
		
		// Should we ignore the ecore metamodel types?
		getTopPackage().getOwnedTypeDefinition().add(exporter.current_classdef);

		// Add the type defs in the unit 
		unit.typeDefs.put(EcoreHelper.getQualifiedName(node), exporter.current_classdef);

		acceptList(((EClass)node).getEStructuralFeatures());
		acceptList(((EClass)node).getEOperations());
		
		return exporter.current_classdef;
	}
	
	/** Visit an EAttribute and convert it in a Property. Also set its type; 
	 * so, this method is supposed to be called after the visit of ETypes.
	 * Note : an EAttribute has no opposite. */
	public Object visit(EAttribute node) {
		// Create the property
		Property prop = createPropertyFromEStructuralFeature(node);
		
		// EAttribute specific values
		prop.setIsID(node.isID());
		// Composite? -> we get an annotation if there is one, otherwise by default it is composite.
		boolean isc = true;
		EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION);
		if(eAnnot != null) {
			if (eAnnot.getDetails().containsKey(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS)) {
				String res = (String)eAnnot.getDetails().get(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS);
				isc = Boolean.valueOf(res);
			}
		}
		prop.setIsComposite(isc);
		return prop;
	}
	
	/** Visit an EReference and convert it in a Property, with opposite if necessary. Also set
	 * its type. So, this method is supposed to be called after the visit of ETypes. */
	public Object visit(EReference node) {
		Property prop = createPropertyFromEStructuralFeature(node);
		// EReference specific values
		prop.setIsID(false);
		prop.setIsComposite(node.isContainment());
		// Set the opposite of this property
		if (node.getEOpposite() != null) {
			Property oprop = (Property)properties.get(EcoreHelper.getQualifiedName(node.getEOpposite()));
			if ( oprop == null) {
				oprop = unit.struct_factory.createProperty();
				properties.put(EcoreHelper.getQualifiedName(node.getEOpposite()), oprop);
			}
			prop.setOpposite(oprop);
		}
		return prop;
	}
	
	/** This is a method shared by the visit methods of EAttribute and EReference. Sets
	 * all the properties of the resulting node, including the type. */
	protected Property createPropertyFromEStructuralFeature(EStructuralFeature node)
	{
		Property prop = (Property)properties.get(EcoreHelper.getQualifiedName(node));
		if (prop == null) {
			prop = unit.struct_factory.createProperty();
			properties.put(EcoreHelper.getQualifiedName(node), prop);
		}
		exporter.current_prop = prop;
		
		prop.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		prop.setIsOrdered(node.isOrdered());
		prop.setIsUnique(node.isUnique());
		prop.setUpper(node.getUpperBound());
		prop.setLower(node.getLowerBound());
		prop.setDefault(node.getDefaultValueLiteral());
		prop.setIsDerived(node.isDerived());
		prop.setOwningClass(exporter.current_classdef);
		
		return prop;
	}
	
	/** Converts an EOperation into kermeta type Operation. This method constructs the Operation
	 *  and sets its type. */
	public Object visit(EOperation node) {
		isClassTypeOwner = false;
		exporter.current_op = unit.struct_factory.createOperation();
		operations.put(node, exporter.current_op);
		
		exporter.current_op.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		exporter.current_op.setIsOrdered(node.isOrdered());
		exporter.current_op.setIsUnique(node.isUnique());
		exporter.current_op.setLower(node.getLowerBound());
		exporter.current_op.setUpper(node.getUpperBound());
		
		exporter.current_op.setOwningClass(exporter.current_classdef);		
		return exporter.current_op;
	}
	
	public Object visit(EEnum node) {
		if (eclassifier_typedefinition_map.containsKey(node))
			current_enum = (Enumeration)eclassifier_typedefinition_map.get(node);
		else { 
			current_enum = unit.struct_factory.createEnumeration();
			eclassifier_typedefinition_map.put(node, current_enum);
		}
		
		current_enum.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		getTopPackage().getOwnedTypeDefinition().add(current_enum);
		acceptList(node.getELiterals());
		unit.typeDefs.put(EcoreHelper.getQualifiedName(node), current_enum);
		return current_enum;
	}
	
	public Object visit(EEnumLiteral node) {
		EnumerationLiteral lit = unit.struct_factory.createEnumerationLiteral();
		lit.setEnumeration(current_enum);
		lit.setName(node.getName());
		return lit;
	}
	
	/** Create a primitive type for given datatype */
    public Object visit(EDataType node) {
    	// Special case of datatype used to represent type for TypeVariable/FunctionType:
    	// no corresponding datatype in the KM representation
    	if(node.getName().equals(KM2Ecore.KERMETA_TYPES)) return null;
    	
    	// Create a primitive type
        PrimitiveType result = createPrimitiveTypeForEDataType(node);
        current_primitivetype = result;

        // BEGIN HORRIBLE TEMPORARY PATCH (the if)
        // This condition is used because we use the visitor for the definition of the type of model
        // elements, and sometimes, current package is null
        if (getTopPackage()!=null) {
        	getTopPackage().getOwnedTypeDefinition().add(result);
        }
    	unit.typeDefs.put(EcoreHelper.getQualifiedName(node), result);
        // END HORRIBLE TEMPORARY PATCH

    	return result;
    }
	
	/**
	 * annotation.getSource() => "kermeta" or "kermeta.<smthg>" if the ann. is intended to be owned by kermeta code
	 * annotation.getDetails() => hashtable, with { "body" : <body_content> } for body operations
	 * This visit method only handle the details of EAnnotations that could be shared by any
	 */
	public Object visit(EAnnotation node) {	
		String result = "";
		// node.getSource() == "kermeta"
		if(node.getSource().equals(KM2Ecore.ANNOTATION)) {
			for (Object next :  node.getDetails().keySet()) {
				String crtKey = (String) next;
				result = (String)node.getDetails().get(crtKey);
				Tag tag = unit.struct_factory.createTag();
				tag.setName(crtKey);
				tag.setValue(result);
				fr.irisa.triskell.kermeta.language.structure.Object o = getObjectForEModelElement(node.getEModelElement()); 
				if (o!=null) o.getTag().add(tag);
			}
		}
		// node.getSource() == "kermeta.req"
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_REQUIRE)) {
			for (Object next :  node.getDetails().keySet()) {
				String uri = (String) next;
				KermetaUnit requiredUnit = null; 
				requiredUnit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
				requiredUnit.load();
				unit.importedUnits.add( requiredUnit );
			}
		}
		return result;
	}

	
	/** This is AWFUL */
	public fr.irisa.triskell.kermeta.language.structure.Object getObjectForEModelElement(EModelElement element)
	{
		fr.irisa.triskell.kermeta.language.structure.Object result =  null; 
		if (element instanceof EPackage) result = getTopPackage();
		if (element instanceof EClassifier) {
			// I wish we could select {e| e instanceof EDatatype } more easily EDataTypes...
			result = eclassifier_typedefinition_map.get(element)!=null?eclassifier_typedefinition_map.get(element):datatypes.get(element);
		}
		if (element instanceof EStructuralFeature)	result = exporter.current_prop;
		if (element instanceof EOperation) result = operations.get(element);
		return result;
	}
	
	public String getURI(ENamedElement e){
		if (e.eResource() != null) return e.eResource().getURI().toFileString();		
		if (e.eContainer() instanceof ENamedElement) 
			return getURI((ENamedElement)e.eContainer()) + "/" + e.getName();
		else return "";
	}
	
	/**
	 * Create a primitive type for given datatype.
	 * Doesn't set yet the instance class name of the primitive type (done
	 * in Ecore2KMPass2)
	 *  */
	public PrimitiveType createPrimitiveTypeForEDataType(EDataType etype) 
	{
		PrimitiveType result = datatypes.get(etype);
		if (result == null)
		{
			result = unit.struct_factory.createPrimitiveType();
			result.setName(etype.getName());
			datatypes.put(etype, result);
		}
		return result; 
	}
	
	/** Get and complete the classDefinition equivalence for the given eclass */
	public ClassDefinition createClassDefinitionForEClass(EClass node)
	{	
		ClassDefinition result = (ClassDefinition)eclassifier_typedefinition_map.get(node);
		if (result == null)
		{
			result = unit.struct_factory.createClassDefinition();
			
			result.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
			
			result.setIsAbstract(node.isAbstract() || node.isInterface());
			eclassifier_typedefinition_map.put(node, result);
		}
		return result;
	}
	
	
	/** Return the package currently visited */
	protected Package getTopPackage() {
		if (packagesStack.size() == 0) return null;
		return (Package)packagesStack.peek();
	}
	
	
	/**
	 * Get the kermeta type corresponding to this EType.
	 * 
	 * This method is called from Ecore2KMPass2 and Ecore2KMPass3 that both refer to Ecore2Pass1.
	 * It is defined here for factorization purposes.
	 * 
	 * @param etype the EType to be transformed
	 * @param node  is only used to get the node for which this class was called
	 * @return
	 */
	protected Type createTypeForEClassifier(EClassifier etype, ENamedElement node) {
		Type result = null;
		TypeDefinition def = null;
		
		if (etype == null) { 
			def = StdLibKermetaUnitHelper.getKermetaUnit().typeDefinitionLookup("kermeta::standard::Void");
		}
		
		// Special case of the "KermetaTypeAlias" datatype that aims to represent, in the Ecore file,
		// type of elements that are typed by a type variable/ function type:
		else if(etype.getName().equals(KM2Ecore.KERMETA_TYPES)) {
			// Compute list of visible type variables (depends on node type)
			ArrayList<TypeVariable> tVars = getVisibleTypeVariables(node);

			// Type corresponds to a TypeVariable
			if(node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE) != null) {
				// Get the name of the type variable from node annotation
				EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE);
				String tVarName = ((EStringToStringMapEntryImpl) eAnnot.getDetails().get(0)).getTypedKey();

				TypeVariable tVar = getTypeVariableByName(tVarName, tVars);
				
				// No matching type variable found: raise an exception
				if(tVar == null) {
					String node_str = null;
					if(node instanceof EStructuralFeature) {
						node_str = "property";
					}
					else if(node instanceof EOperation) {
						node_str = "operation";
					}
					else if(node instanceof EParameter) {
						node_str = "parameter";
					}

					throw new KM2ECoreConversionException(
							"Internal error of Ecore2KM conversion: no TypeVariable found for "
							+ node_str + " '" + node.getName() + "'.");
				}
				else {
					return tVar;
				}
			}
			// Type corresponds to a FunctionType
			else if(node.getEAnnotation(KM2Ecore.ANNOTATION_FUNCTIONTYPE) != null) {
				// Get FunctionType annotation
				EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_FUNCTIONTYPE);
				EMap map = eAnnot.getDetails();
				
				// Allocate a new FunctionType model element
				FunctionType fctType = unit.struct_factory.createFunctionType();
				
				// Set left part of function type (ie function parameters)
				// FunctionType has a signe parameter => left is a 'Type'
				String l_qName = null;
				if(map.size() == 2) {
					l_qName = ((EStringToStringMapEntryImpl) map.get(0)).getTypedValue();
					fctType.setLeft( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
				}
				// FunctionType has several parameters => left is a ProductType
				else {
					// Create a new  ProductType element
					ProductType pdtType = unit.struct_factory.createProductType();
					// Set left part to this new ProductType
					fctType.setLeft(pdtType);

					// Iterate over function type parameters
					for(int i=0; i<map.size()-1; i++) {
						l_qName = ((EStringToStringMapEntryImpl) map.get(i)).getTypedValue();
						pdtType.getType().add( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
					}
				}
				
				// Set right part of function type (function result)
				String r_qName = ((EStringToStringMapEntryImpl) map.get(map.size()-1)).getTypedValue();
				fctType.setRight( getTypeHierarchyFromQualifiedName(r_qName, tVars) );
				
				return fctType;
			}
		}
		else {
			def = unit.typeDefinitionLookup(EcoreHelper.getQualifiedName(etype));
		}
		
		if (def == null) {
			// Ignore ecore types : we cannot create a kermeta unit since the URI of the ecore metamodel
			// does not reflect a real path in the user file system. We will handle it separately
			// Try to find the given element in the loaded kermeta units
			// If not found, load a kermeta unit for the resource of the given element
			if (etype.eResource() != resource) {
				String etype_qname = EcoreHelper.getQualifiedName(etype);
				// We create EcoreUnit this way (not using the KermetaUnitFactory) because
				// this unit is not related to a real file in the user file system
				// note: unit.packages argument: the list of found packages is added to this [main unit] hashtable.
				EcoreUnit dep_unit = new EcoreUnit(etype.eResource(), unit.packages);
				dep_unit.load();
				unit.importedUnits.add(dep_unit);
				def = dep_unit.typeDefs.get(etype_qname);
			}
			else
				def = (TypeDefinition)eclassifier_typedefinition_map.get(etype)!=null?
						eclassifier_typedefinition_map.get(etype):datatypes.get(etype); // this does the same as unit.typeDefinitionLookUp
		}

		if (def == null)
			throw new KM2ECoreConversionException("Internal error of Ecore2KM conversion: type '" + EcoreHelper.getQualifiedName(etype) + "' not found." );

		// It can be a Type if the element is a EEnum (inherits datatype) or a EDatatype (inherits Type and TypeDefinition)
		if (def instanceof Type) {
			result = (Type)def;
		}
		else {
			// Otherwise it is always a ClassDefinition
			ClassDefinition cd = (ClassDefinition)def;
			fr.irisa.triskell.kermeta.language.structure.Class fc = unit.struct_factory.createClass();
			fc.setTypeDefinition(cd);
			result = fc;
		}
		// Type should never be null
		if (result == null) {
			throw new Error("Internal error of ecore2kermeta transfo: type " +
					"of '" + node.getName() + node.eClass().getName() + ":" + etype.getName() + "' not found " +
							"in Kermeta side");
		}
		return result;
	}


	/**
	 * Visit a TypeParameter ('kermeta.typeParameter') EAnnotation.
	 * Such EAnnotation is supposed to be attached to either an EClass or an EOperation.
	 * @param node
	 * @return
	 */
	public Object visitTypeParameterAnnotation(EAnnotation node) {
		List<TypeVariable> params = new ArrayList<TypeVariable>();

		for (Object next :  node.getDetails().keySet()) {
			String name = (String)next;
			TypeVariable tv = unit.struct_factory.createObjectTypeVariable(); 
			tv.setName(name);
			// detail can be " A : Anothertype" -> means that A must inherit Anothertype
			String detail = (String)node.getDetails().get(name); 
			if (detail.indexOf(":")>0) {
				detail = detail.replaceAll(" ", ""); // strip spaces
				String str_cdef = detail.substring(detail.indexOf(":")+1);
				ClassDefinition cdef = (ClassDefinition)unit.typeDefinitionLookup(str_cdef);
				fr.irisa.triskell.kermeta.language.structure.Class type = 
					StructureFactory.eINSTANCE.createClass();
		        type.setTypeDefinition((ClassDefinition)cdef);
				tv.setSupertype(type);
			}
			params.add(tv);
		} 

		// for current_class - add the parameter to the class
		if(node.getEModelElement() instanceof EClass) {
			exporter.current_classdef.getTypeParameter().addAll(params);
		}
		// for current_op
		else {
			exporter.current_op.getTypeParameter().addAll(params);
		}
		return null;
	}


	/**
	 * This method computes the list of type variables that are visible for the provided
	 * model element (EStructuralFeature/EParameter/EOperation/EClass).
	 * @param node - any model element from which type variables can be visible
	 * @return     - list of visible type variables
	 */
	public ArrayList<TypeVariable> getVisibleTypeVariables(ENamedElement node) {
		// Build list of visible type variables according to the type of node:
		// EStructuralFeature, EOperation or EParameter
		ArrayList<TypeVariable> tVars = new ArrayList<TypeVariable>();

		// For an EStructuralFeature, visible TypeVariables are those declared by its
		// containing class
		if(node instanceof EStructuralFeature) {
			EClass eCls = (EClass) node.eContainer();
			ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(eCls);
			tVars.addAll(cDef.getTypeParameter());
		}
		// For an EOperation, visible TypeVariables are those declared: 1) by the operation
		// itself, 2) by the containing class (order is important)
		else if(node instanceof EOperation) {
			Operation op = (Operation) operations.get(node);
			tVars.addAll(op.getTypeParameter());
			
			EClass eCls = (EClass) node.eContainer();
			ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(eCls);
			tVars.addAll(cDef.getTypeParameter());
		}
		// For an EParameter, visible TypeVariables are those declared: 1) by the containing
		// operation, 2) by the containing class (order is important)
		else if(node instanceof EParameter) {
			EOperation eOp = (EOperation) node.eContainer();
			Operation op = (Operation) operations.get(eOp);
			tVars.addAll(op.getTypeParameter());
			
			EClass eCls = (EClass) node.eContainer().eContainer();
			ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(eCls);
			tVars.addAll(cDef.getTypeParameter());
		}
		// For an EClass, visible TypeVariables are those declared by the class itself
		else if(node instanceof EClass) {
			ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(node);
			tVars.addAll(cDef.getTypeParameter());
		}
		
		return tVars;
	}
	

	///////////////////////////////////////////////////////////////////////////////////////////
	// TYPE VARIABLE BINDINGS specific methods:
	//   - analyseQualifiedName
	//   - getTypeFromName
	//   - getTypeVariableByName
	//   - getTypeHierarchyFromQualifiedName
	///////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * This method analyses the qualified name in order to identify both the Type represented
	 * by the qualified name and its eventual list of type parameters (encoded as qualified
	 * names).
	 * @param qName  - qualified name to analyse
	 * @param tVars  - list of visible type variables
	 * @param params - identified list of type parameters (should be empty at method call)
	 * @return       - type corresponding to the provided qualified name (null if not found)
	 */
	protected Type analyseQualifiedName(
			String qName,
			ArrayList<TypeVariable> tVars,
			ArrayList<String> params) {

		// Init result type
		Type result = null;
		
		
		// First character of qualified name is '<'
		// => Qualified name represents a FunctionType
		if(qName.charAt(0) == '<') {
			result = unit.struct_factory.createFunctionType();
			
			String signature = qName.substring(1, qName.length()-2).trim();
			
			int pdtTypes = 0;
			int parTypes = 0;
			boolean leftIsPdt = signature.charAt(0) == '[';
			boolean parsingMainArrow = false;
			boolean parsingArrow = false;
			boolean mainArrowParsed = false;
			StringBuffer crtName = new StringBuffer();
			for(int i=0; i<signature.length(); i++) {
				char c = signature.charAt(i);
				
				if(c == ',') {
					if(mainArrowParsed) {
						if(pdtTypes == 0 && parTypes == 0) {
							params.add(crtName.toString().trim());
							crtName = new StringBuffer();
						}
						else {
							crtName.append(c);
						}
					}
					else {
						if(leftIsPdt) {
							if(pdtTypes == 1 && parTypes == 0) {
								params.add(crtName.toString().trim());
								crtName = new StringBuffer();
							}
							else {
								crtName.append(c);
							}
						}
						else {
							if(pdtTypes == 0 && parTypes == 0) {
								params.add(crtName.toString().trim());
								crtName = new StringBuffer();
							}
							else {
								crtName.append(c);
							}
						}
					}
				}
				else if(c == '[') {
					pdtTypes++;
					if(i > 0) crtName.append(c);
				}
				else if(c == ']') {
					pdtTypes--;
					if(mainArrowParsed || pdtTypes > 0) crtName.append(c);
				}
				else if(c == '<') {
					parTypes++;
					crtName.append(c);
				}
				else if(c == '>') {
					if(parsingMainArrow) {
						parsingMainArrow = false;
						mainArrowParsed = true;
					}
					else if(parsingArrow) {
						parsingArrow = false;
						crtName.append(c);
					}
					else {
						parTypes--;
						crtName.append(c);
					}
				}
				else if(c == '-') {
					if(pdtTypes == 0 && parTypes == 0) {
						parsingMainArrow = true;
						params.add(crtName.toString().trim());
						crtName = new StringBuffer();
					}
					else {
						parsingArrow = true;
						crtName.append(c);
					}
				}
				else {
					crtName.append(c);
				}
			}
			// Add last recognized type to the list
			params.add(crtName.toString().trim());
		}

		// String "::" only appears if the qualified name contains any package name
		// => Qualified name includes some packages names
		else if(qName.indexOf("::") != -1) {
			String packName = null;
			String typeName = null;
			
			// String "<" only appears if the type has some type parameters
			// Identified type has no type parameters
			if(qName.indexOf("<") == -1) {
				packName = qName.substring(0, qName.lastIndexOf("::"));
				typeName = qName.substring(qName.lastIndexOf("::") + 2);
			}
			// Qualified name includes some type parameters
			else {
				// 'shortQName' corresponds to packages and type name, without any type parameter
				String shortQName = qName.substring(0, qName.indexOf("<"));
				packName = shortQName.substring(0, shortQName.lastIndexOf("::"));
				typeName = shortQName.substring(shortQName.lastIndexOf("::") + 2);
				
				// Type parameters analysis:
				// 'paramsStr' corresponds to the type parameters substring
				String paramsStr = qName.substring(qName.indexOf("<")+1, qName.lastIndexOf(">"));
				StringBuffer crtName = new StringBuffer();
				// Counter for currently opened type parameters lists
				int n = 0;
				for(int i=0; i<paramsStr.length(); i++) {
					char c = paramsStr.charAt(i);
					if(c == ',') {
						if(n == 0) {
							params.add(crtName.toString().trim());
							crtName = new StringBuffer();
						}
						else {
							crtName.append(c);
						}
					}
					else if(c == '<') {
						n++;
						crtName.append(c);
					}
					else if(c == '>') {
						n--;
						crtName.append(c);
					}
					else {
						crtName.append(c);
					}
				}
				// Add last recognized type to the list
				params.add(crtName.toString().trim());
			}
			
			if(packName.length() == 0) {
				result = getTypeVariableByName(typeName.toString(), tVars);
			}
			else {
				Package pack = unit.packages.get(packName.toString());
				if(pack == null) {
					result = null;
				}
				else {
					result = getTypeFromName(pack, typeName.toString());
				}
			}
		}
		
		// Qualified name includes no package name
		// Type must be a TypeVariable, and cannot have any type parameter
		else {
			result = getTypeVariableByName(qName, tVars);
		}
		
		return result;
	}


	/**
	 * This method returns a type from a given package and a type name.
	 * In case the type corresponds to a ClassDefinition, the method allocates and
	 * returns a new Class that points to this ClassDefinition.
	 * @param pack  - package in which the type is searched
	 * @param tName - name of the searched type
	 * @return      - found type (can be either a Class or a PrimitiveType)
	 */
	protected Type getTypeFromName(Package pack, String tName) {
		Type result = null;
		
		// Search for typeDef from name in pack
		boolean found = false;
		TypeDefinition tDef = null;
		Iterator<TypeDefinition> it = pack.getOwnedTypeDefinition().iterator();
		while(it.hasNext() && !found) {
			tDef = it.next();
			if(tDef.getName().equals(tName)) found = true;
		}
		if(! found) return null;
		
		// Found typeDef is a ClassDefinition: returned value is a newly allocated class
		// that points to this ClassDefinition
		if(tDef instanceof GenericTypeDefinition) {
			fr.irisa.triskell.kermeta.language.structure.Class newClass =
				unit.struct_factory.createClass();
			newClass.setTypeDefinition((GenericTypeDefinition) tDef);
			result = newClass;
		}
		// Found TypeDef is a PrimitiveType
		else if(tDef instanceof PrimitiveType) {
			result = (PrimitiveType) tDef;
		}
		
		return result;
	}


	/**
	 * This method searches a type variable from its name in the provided list of type
	 * variables.
	 * @param tvName - name of searched type variable
	 * @param tVars  - list of visible type variables
	 * @return       - found type variable (null if not found)
	 */
	protected TypeVariable getTypeVariableByName(String tvName, ArrayList<TypeVariable> tVars) {
		TypeVariable tv = null;
		Iterator<TypeVariable> it = tVars.iterator();
		while(it.hasNext()) {
			tv = it.next();
			if(tv.getName().equals(tvName)) return tv;
		}
		return null;
	}


	/**
	 * This method returns the type hierarchy that corresponds to the provided qualified name.
	 * In case the main type has type variable bindings, the method recursively runs to resolve
	 * the type and type variable of these bindings.
	 * @param qName - qualified name of the type to return
	 * @param tVars - list of visible type variables
	 * @return      - type element corresponding to the provided qualified name
	 */
	protected Type getTypeHierarchyFromQualifiedName(String qName, ArrayList tVars) {
		Type result = null;
		
		// Init list used to contain type parameters of identified types
		ArrayList<String> params = new ArrayList<String>();
		result = analyseQualifiedName(qName, tVars, params);
		
		// Returned type is a ParameterizedType:
		// Set type variable bindings of the ParameterizdType
		if(result instanceof ParameterizedType) {
			ParameterizedType paraType = (ParameterizedType) result;
			TypeVariableBinding tvBinding = null;
			int i = 0;
			for(Object next : params) {
				String tVarName = (String) next;
				tvBinding = unit.struct_factory.createTypeVariableBinding();
			
				// Set binding variable
				tvBinding.setVariable( (TypeVariable) paraType.getTypeDefinition().getTypeParameter().get(i) );
			
				// Set binding type
				tvBinding.setType(getTypeHierarchyFromQualifiedName(tVarName, tVars));
			
				// Add binding to bindings list
				paraType.getTypeParamBinding().add(tvBinding);
				i++;
			}
		}
		// Returned type is a FunctionType:
		// Set parameters (left and right properties) of the FunctionType
		else if(result instanceof FunctionType) {
			FunctionType fctType = (FunctionType) result;
			
			// Set left part of function type (ie function parameters)
			// FunctionType has a signe parameter => left is a 'Type'
			String l_qName = null;
			if(params.size() == 2) {
				l_qName = params.get(0);
				fctType.setLeft( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
			}
			// FunctionType has several parameters => left is a ProductType
			else {
				// Create a new  ProductType element
				ProductType pdtType = unit.struct_factory.createProductType();
				// Set left part to this new ProductType
				fctType.setLeft(pdtType);

				// Iterate over function type parameters
				for(int i=0; i<params.size()-1; i++) {
					l_qName = params.get(i);
					pdtType.getType().add( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
				}
			}

			// Set right part of function type (function result)
			String r_qName = params.get(params.size()-1);
			fctType.setRight( getTypeHierarchyFromQualifiedName(r_qName, tVars) );
		}
		
		return result;
	}
}
