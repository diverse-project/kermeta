/* $Id: ECore2KMPass1.java,v 1.4 2006-07-19 12:31:09 zdrey Exp $
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
import java.util.List;
import java.util.Stack;

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
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ECore2KMPass1 extends EcoreVisitor {

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
	
	protected Stack<Package> current_pack = new Stack<Package>();
	protected Ecore2KM exporter;
	protected Enumeration current_enum;
	protected PrimitiveType current_primitivetype;
	
	/**
	 * @param unit
	 */
	public ECore2KMPass1(Ecore2KM exporter) {
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
		Package pack = unit.packageLookup(Ecore2KM.getQualifiedName(node));
		if (pack == null) {
			pack = unit.struct_factory.createPackage();
			pack.setName(node.getName());
			pack.setUri(node.getNsURI());
			if (getCurrentPackage() != null)
				pack.setNestingPackage(getCurrentPackage());
			else
				unit.rootPackage = pack;
			unit.packages.put(Ecore2KM.getQualifiedName(node), pack);
			
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
		exporter.current_classdef = createClassDefinitionForEClass(node);
		
		TypeDefinition td = unit.typeDefinitionLookup(Ecore2KM.getQualifiedName(node));
		
		// Return a typedef if the element is not contained in ecore metamodel.
		isEcoreType = ((ENamedElement)node.eContainer()).getName().equals("ecore");
		if (td != null && isEcoreType) {
			// Ignore duplicate definition due to the ecore reflexivity
			exporter.current_classdef = (ClassDefinition)td;
			unit.messages.addWarning("Ignore duplicate definition of ecore Type " + Ecore2KM.getQualifiedName(node), td);
			return td;
		}
		
		// Should we ignore the ecore metamodel types?
		getCurrentPackage().getOwnedTypeDefinition().add(exporter.current_classdef);

		// Add the type defs in the unit 
		unit.typeDefs.put(Ecore2KM.getQualifiedName(node), exporter.current_classdef);
		
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
			Property oprop = (Property)properties.get(Ecore2KM.getQualifiedName(node.getEOpposite()));
			if ( oprop == null) {
				oprop = unit.struct_factory.createProperty();
				properties.put(Ecore2KM.getQualifiedName(node.getEOpposite()), oprop);
			}
			prop.setOpposite(oprop);
		}
		return prop;
	}
	
	/** This is a method shared by the visit methods of EAttribute and EReference. Sets
	 * all the properties of the resulting node, including the type. */
	protected Property createPropertyFromEStructuralFeature(EStructuralFeature node)
	{
		Property prop = (Property)properties.get(Ecore2KM.getQualifiedName(node));
		if (prop == null) {
			prop = unit.struct_factory.createProperty();
			properties.put(Ecore2KM.getQualifiedName(node), prop);
		}
		exporter.current_prop = prop;
		prop.setName(node.getName());
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
		exporter.current_op.setName(node.getName());
		exporter.current_op.setIsOrdered(node.isOrdered());
		exporter.current_op.setIsUnique(node.isUnique());
		exporter.current_op.setLower(node.getLowerBound());
		exporter.current_op.setUpper(node.getUpperBound());
		
		if (Ecore2KM.isQuickFixEnabled)
		{
			// Quickfix to handle operation named like properties
			if (Ecore2KM.isMethodPropertyNameOverlapSafe)
			{
				Property prop = unit.getPropertyByName(exporter.current_classdef, exporter.current_op.getName());
				if (prop != null) {
					String newName = Ecore2KM.methodRenamePrefix + exporter.current_op.getName() +Ecore2KM.methodRenamePostfix;
					unit.messages.addWarning("Quickfix used to rename duplicate operation due to a the property with the same name: " + exporter.current_op.getName() + " renamed into " + newName, null);		        	
				
					exporter.current_op.setName(newName);
				}
			}
			// Quickfix to avoid two operations with the same name
			if (Ecore2KM.isMethodNameOverlapSafe)
			{
				Operation op = unit.getOperationByName(exporter.current_classdef, exporter.current_op.getName());        	
				int i = 2;
				String newName;
				while (op != null) {
					newName = exporter.current_op.getName() + i;
					unit.messages.addWarning("Quickfix used to rename duplicate operation: " + exporter.current_op.getName() + " renamed into " + newName, null);		        	
					exporter.current_op.setName(newName);
					op = unit.getOperationByName(exporter.current_classdef, exporter.current_op.getName());
				}
			}
		}
		exporter.current_op.setOwningClass(exporter.current_classdef);		
		return exporter.current_op;
	}
	
	public Object visit(EEnum node) {
		if (eclassifier_typedefinition_map.containsKey(node)) current_enum = (Enumeration)eclassifier_typedefinition_map.get(node);
		else { 
			current_enum = unit.struct_factory.createEnumeration();
			eclassifier_typedefinition_map.put(node, current_enum);
		}
		current_enum.setName(node.getName());
		getCurrentPackage().getOwnedTypeDefinition().add(current_enum);
		acceptList(node.getELiterals());
		unit.typeDefs.put(Ecore2KM.getQualifiedName(node), current_enum);
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
        // elements, and sometimes, current package is null
        if (getCurrentPackage()!=null)
        {
        	getCurrentPackage().getOwnedTypeDefinition().add(result);
        }
    	unit.typeDefs.put(Ecore2KM.getQualifiedName(node), result);
        // END HORRIBLE TEMPORARY PATCH
        return result;
    }
	
	/**
	 * annotation.getSource() => "kermeta" if the ann. is intended to be owned by kermeta code
	 * annotation.getDetails() => hashtable, with { "body" : <body_content> } for body operations
	 * This visit method only handle the details of EAnnotations that could be shared by any
	 */
	public Object visit(EAnnotation node)
	{	
		String result = "";
		if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS))
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
		ClassDefinition result = (ClassDefinition)eclassifier_typedefinition_map.get(node);
		if (result == null)
		{
			result = unit.struct_factory.createClassDefinition();
			result.setName(node.getName());
			result.setIsAbstract(node.isAbstract() || node.isInterface());
			eclassifier_typedefinition_map.put(node, result);
		}
		return result;
	}
	
	
	/** Return the package currently visited */
	protected Package getCurrentPackage() {
		if (current_pack.size() == 0) return null;
		return (Package)current_pack.peek();
	}
	
	public List<TypeVariable> createTypeParametersFromEAnnotation(EAnnotation node)
	{
		List<TypeVariable> params = new ArrayList<TypeVariable>();
		if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER))
		{	
			for (Object oname : node.getDetails().keySet())
			{
				String name = (String)oname;
				TypeVariable tv = unit.struct_factory.createTypeVariable();
				tv.setName(name);
				params.add(tv);
			} 
		}
		return params;
	}

}

