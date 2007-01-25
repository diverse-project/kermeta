/* $Id: Ecore2KMPass1.java,v 1.7 2007-01-25 15:27:00 dtouzet Exp $
 * Project : Kermeta io
 * File : ECore2Kermeta.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 mai 2005
 * Author : Franck Fleurey
 */ 

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
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
		Package pack = unit.packageLookup(Ecore2KM.getQualifiedName(node));
		
		if (pack == null) {
			pack = unit.struct_factory.createPackage();
			
			pack.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );

			// FIXME : we have to test if URI is valid as a file path or not!
			// Was : pack.setUri(node.getNsURI());
			// node.getNsURI() is not always valid, so by default, we will take unit.getUri();
			pack.setUri(unit.getUri());
			unit.packages.put(Ecore2KM.getQualifiedName(node), pack);
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
		getTopPackage().getOwnedTypeDefinition().add(exporter.current_classdef);

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
    	// Special case of datatype used to represent type for TypeVariable:
    	// no corresponding datatype in the KM representation
    	if(node.getName().equals("_TypeVariableAlias_")) return null;
    	
    	// Create a primitive type
        PrimitiveType result = createPrimitiveTypeForEDataType(node);
        current_primitivetype = result;

        // BEGIN HORRIBLE TEMPORARY PATCH (the if)
        // This condition is used because we use the visitor for the definition of the type of model
        // elements, and sometimes, current package is null
        if (getTopPackage()!=null) {
        	getTopPackage().getOwnedTypeDefinition().add(result);
        }
    	unit.typeDefs.put(Ecore2KM.getQualifiedName(node), result);
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
	 * @param node
	 * @return
	 */
	
	
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
		// Special case of the "TypeVariableAlias" datatype that aims to represent, in the  Ecore file,
		// type of elements that are typed by a type variable:
		else if(etype.getName().equals("_TypeVariableAlias_")) {
			// Get the name of the type variable from node annotation
			EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE);
			String tVarName = ((EStringToStringMapEntryImpl) eAnnot.getDetails().get(0)).getTypedKey();
			
			boolean notFound = true;
			TypeVariable tVar = null;
			EList tVars = new BasicEList();
			String node_str = null;
			
			// Build list of visible type variables according to the type of node:
			// EStructuralFeature, EOperation or EParameter
			if(node instanceof EStructuralFeature) {
				// For an EStructuralFeature, visible TypeVariables are those declared by its
				// containing class
				EClass eCls = (EClass) node.eContainer();
				ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(eCls);
				tVars.addAll(cDef.getTypeParameter());
				
				node_str = "property";
			}
			else if(node instanceof EOperation) {
				// For an EOperation, visible TypeVariables are those declared: 1) by the operation
				// itself, 2) by the containing class (order is important)
				Operation op = (Operation) operations.get(node);
				tVars.addAll(op.getTypeParameter());
				
				EClass eCls = (EClass) node.eContainer();
				ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(eCls);
				tVars.addAll(cDef.getTypeParameter());
				
				node_str = "operation";
			}
			else if(node instanceof EParameter) {
				// For an EParameter, visible TypeVariables are those declared: 1) by the containing
				// operation, 2) by the containing class (order is important)
				EOperation eOp = (EOperation) node.eContainer();
				Operation op = (Operation) operations.get(eOp);
				tVars.addAll(op.getTypeParameter());
				
				EClass eCls = (EClass) node.eContainer().eContainer();
				ClassDefinition cDef = (ClassDefinition) eclassifier_typedefinition_map.get(eCls);
				tVars.addAll(cDef.getTypeParameter());
				
				node_str = "parameter";
			}

			// Iterate over collection of visible TypeVariables to find the first one which name
			// matches the name stored into the node annotation (tVarName)
			Iterator<TypeVariable> op_it = tVars.iterator();
			while(op_it.hasNext() && notFound) {
				tVar = op_it.next();
				if(tVar.getName().equals(tVarName))	notFound = false;
			}

			if(notFound) {
				// No matching type variable found: raise an exception
				throw new KM2ECoreConversionException(
						"Internal error of Ecore2KM conversion: no TypeVariable found for "
						+ node_str + " '" + node.getName() + "'.");
			}
			else {
				return tVar;
			}
		}
		else {
			def = unit.typeDefinitionLookup(Ecore2KM.getQualifiedName(etype));
		}
		
		if (def == null) {
			// Ignore ecore types : we cannot create a kermeta unit since the URI of the ecore metamodel
			// does not reflect a real path in the user file system. We will handle it separately
			// Try to find the given element in the loaded kermeta units
			// If not found, load a kermeta unit for the resource of the given element
			if (etype.eResource() != resource) {
				String etype_qname = Ecore2KM.getQualifiedName(etype);
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
			throw new KM2ECoreConversionException("Internal error of Ecore2KM conversion: type '" + Ecore2KM.getQualifiedName(etype) + "' not found." );

		// It can be a Type if the element is a EEnum (inherits datatype) or a EDatatype (inherits Type and TypeDefinition)
		if (def instanceof Type) {
			result = (Type)def;
		}
		else {
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
			throw new Error("Internal error of ecore2kermeta transfo: type " +
					"of '" + node.getName() + node.eClass().getName() + ":" + etype.getName() + "' not found " +
							"in Kermeta side");
		}
		return result;
	}
}
