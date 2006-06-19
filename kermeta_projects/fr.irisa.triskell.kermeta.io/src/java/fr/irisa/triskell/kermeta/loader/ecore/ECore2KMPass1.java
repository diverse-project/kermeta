/* $Id: ECore2KMPass1.java,v 1.1 2006-06-19 13:41:05 zdrey Exp $
 * Project : Kermeta (First iteration)
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

import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ECore2KMPass1 extends EcoreVisitor {

	// Some values used to tune the transformation
	public static boolean isQuickFixEnabled = false;  // globally enable or disable the quickfixes
	public static boolean isMethodPropertyNameOverlapSafe = true;
	public static String methodRenamePrefix = "op_";
	public static String methodRenamePostfix = "";
	public static boolean isMethodNameOverlapSafe = true;
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
	protected Hashtable<EClassifier, TypeDefinition> types;
	protected Hashtable<EDataType, PrimitiveType> datatypes;
	/** dictionary of classdefinitions : { ClassDefinition : Class } */
	protected Hashtable<ClassDefinition, fr.irisa.triskell.kermeta.language.structure.Class> classes;
	/** Properties indexed by their qualified names used to set opposites */
	protected Hashtable<String, Property> properties;
	
	/** reference to element currently visited */
	protected Property current_prop;
	protected Stack<Package> current_pack = new Stack<Package>();
	protected ClassDefinition current_classdef;
	protected Enumeration current_enum;
	protected Operation current_op;
	protected PrimitiveType current_primitivetype;
	
	/**
	 * @param unit
	 */
	public ECore2KMPass1(EcoreUnit unit, Resource resource) {
		super();
		this.unit = unit;
		this.resource = resource;
		this.operations = new Hashtable<EOperation, Operation>();
		this.types = new Hashtable<EClassifier, TypeDefinition>();
		this.datatypes = new Hashtable<EDataType, PrimitiveType>();
		this.classes = new Hashtable<ClassDefinition, fr.irisa.triskell.kermeta.language.structure.Class>();
		this.properties = new Hashtable<String, Property>();
	}
	
	/** Visit EPackage : visit the owned classifiers and the sub packages */
	public Object visit(EPackage node) 
	{
		Package pack = unit.packageLookup(getQualifiedName(node));
		
		if (pack == null) {
			pack = unit.struct_factory.createPackage();
			pack.setName(node.getName());
			pack.setUri(node.getNsURI());
			if (getCurrentPackage() != null)
				pack.setNestingPackage(getCurrentPackage());
			else
				unit.rootPackage = pack;
			unit.packages.put(getQualifiedName(node), pack);
		}
		
		current_pack.push(pack);
		
		acceptList(node.getEClassifiers());
		acceptList(node.getESubpackages());
		acceptList(node.getEAnnotations());
		
		current_pack.pop();
		
		return pack;
	}
	
	/** Visit an EClass and convert it in a ClassDefinition*/
	public Object visit(EClass node) {
		isClassTypeOwner = true;
		current_classdef = createClassDefinitionForEClass(node);
		
		TypeDefinition td = unit.typeDefinitionLookup(getQualifiedName(node));
		
		// Return a typedef if the element is not contained in ecore metamodel.
		isEcoreType = ((ENamedElement)node.eContainer()).getName().equals("ecore");
		if (td != null && isEcoreType) {
			// Ignore duplicate definition due to the ecore reflexivity
			current_classdef = (ClassDefinition)td;
			unit.messages.addWarning("Ignore duplicate definition of ecore Type " + getQualifiedName(node), td);
			return td;
		}
		
		// Should we ignore the ecore metamodel types?
		getCurrentPackage().getOwnedTypeDefinition().add(current_classdef);

		// Add the type defs in the unit 
		unit.typeDefs.put(getQualifiedName(node), current_classdef);
		
		acceptList(((EClass)node).getEStructuralFeatures());
		acceptList(((EClass)node).getEOperations());
		acceptList(((EClass)node).getEAnnotations());
		
		return current_classdef;
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
		String isComposite_ann = node.getEAnnotation(KM2Ecore.ANNOTATION)!=null?
				(String)this.accept(node.getEAnnotation(KM2Ecore.ANNOTATION)):"true";
		boolean isc = (isComposite_ann.equals("false"))?false:true;
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
			Property oprop = (Property)properties.get(getQualifiedName(node.getEOpposite()));
			if ( oprop == null) {
				oprop = unit.struct_factory.createProperty();
				properties.put(getQualifiedName(node.getEOpposite()), oprop);
			}
			prop.setOpposite(oprop);
		}
		return prop;
	}
	
	/** This is a method shared by the visit methods of EAttribute and EReference. Sets
	 * all the properties of the resulting node, including the type. */
	protected Property createPropertyFromEStructuralFeature(EStructuralFeature node)
	{
		Property prop = (Property)properties.get(getQualifiedName(node));
		if (prop == null) {
			prop = unit.struct_factory.createProperty();
			properties.put(getQualifiedName(node), prop);
		}
		current_prop = prop;
		prop.setName(node.getName());
		prop.setIsOrdered(node.isOrdered());
		prop.setIsUnique(node.isUnique());
		prop.setUpper(node.getUpperBound());
		prop.setLower(node.getLowerBound());
		prop.setDefault(node.getDefaultValueLiteral());
		prop.setIsDerived(node.isDerived());
		prop.setOwningClass(current_classdef);
		
		return prop;
	}
	
	/** Converts an EOperation into kermeta type Operation. This method constructs the Operation
	 *  and sets its type. */
	public Object visit(EOperation node) {
		isClassTypeOwner = false;
		current_op = unit.struct_factory.createOperation();
		operations.put(node, current_op);
		current_op.setName(node.getName());
		current_op.setIsOrdered(node.isOrdered());
		current_op.setIsUnique(node.isUnique());
		current_op.setLower(node.getLowerBound());
		current_op.setUpper(node.getUpperBound());
		
		if (isQuickFixEnabled)
		{
			// Quickfix to handle operation named like properties
			if (isMethodPropertyNameOverlapSafe)
			{
				Property prop = unit.getPropertyByName(current_classdef, current_op.getName());
				if (prop != null) {
					String newName = methodRenamePrefix + current_op.getName() +methodRenamePostfix;
					unit.messages.addWarning("Quickfix used to rename duplicate operation due to a the property with the same name: " + current_op.getName() + " renamed into " + newName, null);		        	
				
					current_op.setName(newName);
				}
			}
			// Quickfix to avoid two operations with the same name
			if (isMethodNameOverlapSafe)
			{
				Operation op = unit.getOperationByName(current_classdef, current_op.getName());        	
				int i = 2;
				String newName;
				while (op != null) {
					newName = current_op.getName() + i;
					unit.messages.addWarning("Quickfix used to rename duplicate operation: " + current_op.getName() + " renamed into " + newName, null);		        	
					current_op.setName(newName);
					op = unit.getOperationByName(current_classdef, current_op.getName());
				}
			}
		}
		
		current_op.setOwningClass(current_classdef);		
		return current_op;
	}
	
	public Object visit(EEnum node) {
		if (types.containsKey(node)) current_enum = (Enumeration)types.get(node);
		else { 
			current_enum = unit.struct_factory.createEnumeration();
			types.put(node, current_enum);
		}
		current_enum.setName(node.getName());
		getCurrentPackage().getOwnedTypeDefinition().add(current_enum);
		acceptList(node.getELiterals());
		unit.typeDefs.put(getQualifiedName(node), current_enum);
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
    	// Create a primitive type
        PrimitiveType result = createPrimitiveTypeForEDataType(node);
        current_primitivetype = result;
        // BEGIN HORRIBLE TEMPORARY PATCH (the if)
        // This condition is used because we use the visitor for the definition of the type of model
        // elements.
        if (getCurrentPackage()!=null)
        {
        	getCurrentPackage().getOwnedTypeDefinition().add(result);
        }
    	unit.typeDefs.put(getQualifiedName(node), result);
        // END HORRIBLE TEMPORARY PATCH
        return result;
    }
	
	public Type createInstanceTypeForTypeDefinition(TypeDefinition type) {
		Type iType = null;
		// Translation : if type is a DataType or an Enumeration (those
		// types implement both Type and TypeDefinition
        if (type instanceof Type) { iType = (Type)type; }
        else if (type instanceof ClassDefinition)
        { 
        	ClassDefinition cd = (ClassDefinition)type;
        	fr.irisa.triskell.kermeta.language.structure.Class fc = 
        		(fr.irisa.triskell.kermeta.language.structure.Class)classes.get(cd);
        	if (fc == null) {
        		fc = unit.struct_factory.createClass();
        		fc.setTypeDefinition(cd);
        		classes.put(cd, fc);
        	}
        	iType = fc;
        }
        else
        {	throw new Error("INTERNAL ERROR : type should be a ClassDefinition, not a " + type.getClass().getName());}
    	
        if (type==null) throw new KM2ECoreConversionException("Ecore2KM exception : instance type is null for '" + type.getName() + "'");
        return iType;
	}

	/**
	 * annotation.getSource() => "kermeta" if the ann. is intended to be owned by kermeta code
	 * annotation.getDetails() => hashtable, with { "body" : <body_content> } for body operations
	 */
	public Object visit(EAnnotation node)
	{	
		String result = "";
		// This condition : EOperation (operation) and EClass (ClassDefinition) are concerned
		if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER))
		{	
			EMap map = node.getDetails();
			List<TypeVariable> params = new ArrayList<TypeVariable>();
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext())
			{
				String name = it.next();
				TypeVariable tv = unit.struct_factory.createTypeVariable();
				tv.setName(name);
				params.add(tv);
			} 
			// for current_class - add the parameter to the class
			if (isClassTypeOwner==true) current_classdef.getTypeParameter().addAll(params);
			// for current_op
			else current_op.getTypeParameter().addAll(params);
		}
		else if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS))
		{
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS);
		}
		// Create a Tag for given EAnnotation if its type is kdoc
		else if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_KDOC_DETAILS))
		{
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_KDOC_DETAILS);
			Tag tag = unit.struct_factory.createTag();
			tag.setName(KM2Ecore.ANNOTATION_KDOC_DETAILS);
			tag.setValue(result);
			fr.irisa.triskell.kermeta.language.structure.Object o = getObjectForEModelElement(node.getEModelElement()); 
			if (o!=null) o.getTag().add(tag);
		}
		return result;
	}
	
	/** This is AWFUL */
	public fr.irisa.triskell.kermeta.language.structure.Object getObjectForEModelElement(EModelElement element)
	{
		fr.irisa.triskell.kermeta.language.structure.Object result =  null; 
		if (element instanceof EPackage) result = getCurrentPackage();
		if (element instanceof EClassifier)
		{// I wish we could select {e| e instanceof EDatatype } more easily EDataTypes...
			result = types.get(element)!=null?types.get(element):datatypes.get(element);
		}
		if (element instanceof EStructuralFeature)	result = current_prop;
		if (element instanceof EOperation) result = operations.get(element);
		return result;
	}
	
	protected static Hashtable<String, String> primitive_types_mapping;
	
	static {
		primitive_types_mapping = new Hashtable<String, String>();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("java.lang.Integer", 	"kermeta::standard::Integer");
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.String", 	"kermeta::standard::String");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
	}
	
	public String getQualifiedName(ENamedElement e) {
		if (e.eContainer()!=null && e.eContainer() instanceof ENamedElement) 
			return getQualifiedName((ENamedElement)e.eContainer()) + "::" + e.getName();
		else return e.getName();
	}
	
	public String getURI(ENamedElement e){
		if (e.eResource() != null) return e.eResource().getURI().toFileString();		
		if (e.eContainer() instanceof ENamedElement) 
			return getURI((ENamedElement)e.eContainer()) + "/" + e.getName();
		else return "";
	}
	
	public String getEscapedName(ENamedElement e)
	{
		return KMTHelper.getMangledIdentifier(e.getName());
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
		ClassDefinition result = (ClassDefinition)types.get(node);
		if (result == null)
		{
			result = unit.struct_factory.createClassDefinition();
			result.setName(node.getName());
			result.setIsAbstract(node.isAbstract() || node.isInterface());
			types.put(node, result);
		}
		return result;
	}
	
	
	/** Return the package currently visited */
	protected Package getCurrentPackage() {
		if (current_pack.size() == 0) return null;
		return (Package)current_pack.peek();
	}
	
	/** Get the kermeta type corresponding to this EType */
	protected Type createTypeForEClassifier(EClassifier etype, ENamedElement node) {
		Type result = null;
		TypeDefinition def = null;
		if (etype == null)
		{ 
			def = KermetaUnit.getStdLib().typeDefinitionLookup("kermeta::standard::Void");
		}
		else def = unit.typeDefinitionLookup(getQualifiedName(etype));
		if (def == null) {
			// Ignore ecore types : we cannot create a kermeta unit since the URI of the ecore metamodel
			// does not reflect a real path in the user file system. We will handle it separately
			// Try to find the given element in the loaded kermeta units
			// If not found, load a kermeta unit for the resource of the given element
			if (etype.eResource() != resource)
			{
				String etype_qname = getQualifiedName(etype);
				String dep_uri = etype.eResource().getURI().toString();
				// We create EcoreUnit this way (not using the KermetaUnitFactory) because
				// this unit is not related to a real file in the user file system
				EcoreUnit dep_unit = new EcoreUnit(etype.eResource(), new Hashtable());
				dep_unit.load();
				unit.importedUnits.add(dep_unit);
				def = dep_unit.typeDefs.get(etype_qname);
			}
			else
				def = (TypeDefinition)types.get(etype)!=null?types.get(etype):datatypes.get(etype); // this does the same as unit.typeDefinitionLookUp
		}
		
		if (def == null) throw new KM2ECoreConversionException("Internal error of Ecore2KM conversion : type '" + getQualifiedName(etype) + "' not found." );
		// It can be a Type if the element is a EEnum (inherits datatype) or a EDatatype (inherits Type and TypeDefinition)
		if (def instanceof Type)
			result = (Type)def;
		else
		{
			// Otherwise it is always a ClassDefinition
			ClassDefinition cd = (ClassDefinition)def;
			fr.irisa.triskell.kermeta.language.structure.Class fc = classes.get(cd);
			if (fc == null) {
				fc = unit.struct_factory.createClass();
				fc.setTypeDefinition(cd);
				classes.put(cd, fc);
			}
			result = fc;
		}
		// Type should never be null
		if (result == null) {
			throw new Error("Internal error of ecore2kermeta transfo : type " +
					"of '" + node.getName() + node.eClass().getName() + ":" + etype.getName() + "' not found " +
							"in Kermeta side");
		}
		return result;
	}

}

