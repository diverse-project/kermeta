/* $Id: ECore2Kermeta.java,v 1.17 2006-04-19 12:23:54 dvojtise Exp $
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
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ECore2Kermeta extends EcoreVisitor {

	// some value used to tune the transformation
	public static boolean isQuickFixEnabled = false;  // globally enable or disable the quickfixes
	public static boolean isMethodPropertyNameOverlapSafe = true;
	public static String methodRenamePrefix = "op_";
	public static String methodRenamePostfix = "";
	public static boolean isMethodNameOverlapSafe = true;
	// to differenciate the owner of a "KermetaTypeParameter" annotation -> either an EClass or an EOperation
	// since the info. is not contained in this annotation
	public boolean isClassTypeOwner = true;
	
	/** mapping between EOpretaions and FOperations     */
	protected Hashtable<EOperation, Operation> operations;
	
	public static void loadunit(EcoreUnit unit) {
		try {
			//		 load ressource
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
			Resource resource = resource_set.getResource(URI.createURI(unit.getUri()), true);
			loadunit(unit, resource);
		} catch (Throwable e) {
			unit.messages.addError("Error loading ECore model " + unit.getUri() + " : " + e, null);
			KermetaUnit.internalLog.error("Error loading ECore model " + unit.getUri() + " : " + e, e);
		}
	}
	
	public static void loadunit(EcoreUnit unit, Resource resource) {
		try {
			ECore2Kermeta visitor = new ECore2Kermeta(unit, resource);
			// pre-create types
			TreeIterator it = resource.getAllContents();
			while(it.hasNext()) {
				EObject obj = (EObject)it.next();
				if (obj instanceof EClass) {
					visitor.types.put(obj, unit.struct_factory.createClassDefinition());
				}
				else if (obj instanceof EEnum) {
					visitor.types.put(obj, unit.struct_factory.createEnumeration());
					
				}
				else if (obj instanceof EDataType) {
					visitor.types.put(obj, unit.struct_factory.createPrimitiveType());
					
				}
			}
			// visit the metamodel
			Iterator pkgs = resource.getContents().iterator();
			while(pkgs.hasNext()) {
				EObject obj = (EObject)pkgs.next();
				if (obj instanceof EPackage) {
					visitor.accept(obj);
				}
			}
			
			// Once the all metamodel is converted, we can set the details, that is, visit the operations
			// and set their corresponding super operations.
			Iterator<EOperation> ops = visitor.operations.keySet().iterator(); 
			while (ops.hasNext())
			{
				EOperation node = ops.next(); 
//				has the operation an "implicit" super operation (not defined in the KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS...)?
				// FIXME This slows the conversion...
				visitor.current_op = visitor.operations.get(node);
				// it could have been resolved from the EAnnotation visit
				if (visitor.current_op.getSuperOperation()==null)
				{
					EOperation superop = visitor.findSuperOperation(node);
					if (superop != null) visitor.current_op.setSuperOperation(visitor.operations.get(superop));
				}
			}
			
		} catch (Throwable e) {
			unit.messages.addError("Error loading ECore model " + unit.getUri() + " : " + e, null);
			KermetaUnit.internalLog.error("Error loading ECore model " + unit.getUri() + " : " + e, e);
		}
		
	}
	
	protected EcoreUnit unit;
	protected Resource resource;
	
	/**
	 * @param unit
	 */
	
	private ECore2Kermeta(EcoreUnit unit, Resource resource) {
		super();
		this.unit = unit;
		this.resource = resource;
		this.operations = new Hashtable();
	}
	
	
	// table of types : EType -> TypeDefinition
	protected Hashtable types = new Hashtable();
	
	protected Hashtable classes = new Hashtable();
	
	protected Stack current_pack = new Stack();
	protected ClassDefinition current_classdef;
	protected Enumeration current_enum;
	protected Operation current_op;
	
	protected Package getCurrentPackage() {
		if (current_pack.size() == 0) return null;
		return (Package)current_pack.peek();
	}
	
	protected Type getFTypeForEType(EClassifier etype) {
		
		TypeDefinition def = null;
		
		if (etype == null) {
			def = unit.typeDefinitionLookup("kermeta::standard::Void");
		}
		
		if (def == null) {
			
			if (etype.eResource() != resource) {
				def = unit.typeDefinitionLookup(getQualifiedName(etype));
				if (def == null) {
					// import the unit
					unit.importedUnits.add(new EcoreUnit(etype.eResource(), unit.packages));
				}
				def = unit.typeDefinitionLookup(getQualifiedName(etype));
			}
			else {
				def = (TypeDefinition)types.get(etype);
			}
			
		}
		
		if (def == null) return null;
		if (def instanceof Type) return (Type)def;
		
		ClassDefinition cd = (ClassDefinition)def;
		
		fr.irisa.triskell.kermeta.language.structure.Class fc = (fr.irisa.triskell.kermeta.language.structure.Class)classes.get(cd);
		if (fc == null) {
			fc = unit.struct_factory.createClass();
			fc.setTypeDefinition(cd);
			classes.put(cd, fc);
		}
		return fc;
	}
	
	protected void acceptList(EList l) {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			EObject o = (EObject)it.next();
			this.accept(o);
		}
	}
	
	public Object visit(EPackage node) {
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
		
		current_pack.pop();
		
		return pack;
	}
	
	public Object visit(EClass node) {
		isClassTypeOwner = true;

		// but still set its values ...
		current_classdef = (ClassDefinition)types.get(node);
		current_classdef.setName(node.getName());
		current_classdef.setIsAbstract(node.isAbstract() || node.isInterface());
		
		TypeDefinition td = unit.typeDefinitionLookup(getQualifiedName(node));
		if (td != null) {			
			if(((ENamedElement)node.eContainer()).getName().equals("ecore")){
				// ignore duplicate definition due to the ecore reflexivity
				KermetaUnit.internalLog.warn("Ignore duplicate definition of ecore type "+ getQualifiedName(node));			
				unit.messages.addWarning("Ignore duplicate definition of ecore Type " + getQualifiedName(node), null);
				
			}
			else{
				KermetaUnit.internalLog.error("Duplicate definition of type "+ getQualifiedName(node));			
				unit.messages.addError("Duplicate definition of type " + getQualifiedName(node), td);
				// however add it, but this will never be allowed to run ...
				getCurrentPackage().getOwnedTypeDefinition().add(current_classdef);
			}
		}
		else{
				
			getCurrentPackage().getOwnedTypeDefinition().add(current_classdef);
		}
		
		// set super types
		Iterator it = node.getESuperTypes().iterator();
		while (it.hasNext()) {
			EClassifier st = (EClassifier)it.next();
			Type t = getFTypeForEType(st);
			if (t == null || !(t instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				throw new Error("Internal error of ecore2kermeta transfo : supertypes of class " + getQualifiedName(node) + " : "+ getQualifiedName(st) +" not found");
			}
			current_classdef.getSuperType().add(t);
		}
		// Class annotations
		acceptList(node.getEAnnotations());
		
		// properties and operations:
		acceptList(node.getEStructuralFeatures());
		acceptList(node.getEOperations());
		
		unit.typeDefs.put(getQualifiedName(node), current_classdef);
		
		return current_classdef;
	}
	
	public Object visit(EAttribute node) {
		Property prop = unit.struct_factory.createProperty();
		
		prop.setName(node.getName());
		prop.setIsComposite(true);
		
		prop.setIsOrdered(node.isOrdered());
		prop.setIsUnique(node.isUnique());
		prop.setUpper(node.getUpperBound());
		prop.setLower(node.getLowerBound());
		
		prop.setDefault(node.getDefaultValueLiteral());
		
		prop.setIsDerived(node.isDerived());
		prop.setIsID(node.isID());
		
		prop.setOwningClass(current_classdef);
		
		Type t = getFTypeForEType(node.getEType());
		if (t == null) {
			throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " : "+ getQualifiedName(node.getEType()) + " not found");
		}
		prop.setType(t);
		
		return prop;
	}
	
	/**
	 * Properties indexed by their qualified names
	 * used to set opposites
	 */
	private Hashtable properties = new Hashtable();
	
	public Object visit(EReference node) {
		Property prop = (Property)properties.get(getQualifiedName(node));
		if (prop == null) {
			prop = unit.struct_factory.createProperty();
			properties.put(getQualifiedName(node), prop);
		}
		
		prop.setName(node.getName());
		prop.setIsComposite(node.isContainment());
		
		prop.setIsOrdered(node.isOrdered());
		prop.setIsUnique(node.isUnique());
		prop.setUpper(node.getUpperBound());
		prop.setLower(node.getLowerBound());
		
		prop.setDefault(node.getDefaultValueLiteral());
		
		prop.setIsDerived(node.isDerived());
		prop.setIsID(false);
		
		prop.setOwningClass(current_classdef);
		
		Type t = getFTypeForEType(node.getEType());
		if (t == null) {
			throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " not found");
		}
		prop.setType(t);
		
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
	
	public Object visit(EOperation node) {
		// FIXME : handle super operations
		// FIXME : handle raised exceptions
		isClassTypeOwner = false;
		current_op = unit.struct_factory.createOperation();
		current_op.setName(node.getName());
		
		current_op.setIsOrdered(node.isOrdered());
		current_op.setIsUnique(node.isUnique());
		current_op.setUpper(node.getUpperBound());
		current_op.setLower(node.getLowerBound());
		
		Type t = getFTypeForEType(node.getEType());
		if (t == null) {
			throw new Error("Internal error of ecore2kermeta transfo : type of operation " + getQualifiedName(node) + " not found");
		}
		current_op.setType(t);
		
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
		operations.put(node, current_op);
		
		acceptList(node.getEParameters());
		
		
		// put the parameters and the parameters types in the current context so the operation body that is
		// hosted in the operation annotation can be parsed and type checked correctly.
		unit.pushContext();
		// add type variable
		Iterator tvs = current_op.getTypeParameter().iterator();
		while(tvs.hasNext()) unit.addTypeVar((TypeVariable)tvs.next());
		// add parameters
		Iterator params = current_op.getOwnedParameter().iterator();
		while(params.hasNext()) unit.addSymbol(new KMSymbolParameter((Parameter)params.next()));
	
		acceptList(node.getEAnnotations());
		unit.popContext();
		
		return current_op;
	}
	
	/**
	 * Search if a super operation of the given operation exists in the super classes of the operation owning  class
	 * @param node
	 * @return false if a super operation was not found, true otherwise 
	 */
	protected EOperation findSuperOperation(EOperation node)
	{
		EOperation result = null; 
		EClass owningclass = node.getEContainingClass();
		
		//Iterator it = owningclass.getESuperTypes().iterator();
		result = findOperationInSuperTypes(owningclass.getESuperTypes(), node);
		return result;
	}
	
	/**
	 * Recursive method that searches the most appropriated super operation, by parsing the super
	 * types "increasingly" (if inherited operation is not found in the super types, search in the super
	 * types of the super types :p)
	 * @param supertypes
	 * @param node
	 * @return
	 */
	protected EOperation findOperationInSuperTypes(List supertypes, EOperation node)
	{
		EOperation result = null;
		Iterator it = supertypes.iterator();
		while (it.hasNext() && result == null)
		{
			EClass next = (EClass)it.next();
			
			// Get all the operations, find the one that has the same signature as the given operation
			EList operations = next.getEOperations();
			Iterator<EOperation> itop = operations.iterator(); 
			while (itop.hasNext() && result == null)
			{
				EOperation op = itop.next();
				if (op.getName().equals(node.getName()) && op != node && node.getEContainingClass()!=op.getEContainingClass())
					result = op;
			}
		}
		if (result == null)
		{
			it = supertypes.iterator();
			while (it.hasNext())
			{
				List next = ((EClass)it.next()).getESuperTypes();
				result =  findOperationInSuperTypes(next, node);
			}
		}
		return result;
	}
	
	public Object visit(EParameter node) {
		Parameter param = unit.struct_factory.createParameter();
		param.setName(node.getName());
		
		param.setIsOrdered(node.isOrdered());
		param.setIsUnique(node.isUnique());
		param.setUpper(node.getUpperBound());
		param.setLower(node.getLowerBound());
		
		param.setOperation(current_op);
		
		Type t = getFTypeForEType(node.getEType());
		if (t == null) {
			throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " not found");
		}
		param.setType(t);
		current_op.getOwnedParameter().add(param);
		return param;
	}
	
	public Object visit(EEnum node) {
		current_enum = (Enumeration)types.get(node);
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
	
    public Object visit(EDataType node) {
        PrimitiveType ptype = (PrimitiveType)types.get(node);
        
        ptype.setName(node.getName());
        
        
        TypeDefinition td = unit.typeDefinitionLookup(getQualifiedName(node));
		if (td != null) {
			// duplicate, this DataType was already defined
			if(((ENamedElement)node.eContainer()).getName().equals("ecore")){
				// ignore duplicate definition due to the ecore reflexivity
				KermetaUnit.internalLog.warn("Ignore duplicate definition of DataType "+ getQualifiedName(node));
				unit.messages.addWarning("Ignore duplicate definition of ecore DataType " + getQualifiedName(node), null);
				return ptype;
			}
		}
        String type_name = node.getInstanceClassName();
  
        if (primitive_types_mapping.containsKey(type_name)) {
        	type_name = (String)primitive_types_mapping.get(type_name);
        }
        TypeDefinition type = unit.typeDefinitionLookup(type_name);
        if (type == null) {
        	unit.messages.addWarning("cannot find instance class " + type_name + " for primitive type " + getQualifiedName(node) + " (replaced by Object)", null);
        	type = KermetaUnit.getStdLib().typeDefinitionLookup("kermeta::language::structure::Object");
        }
        
        Type iType = null;
        if (type instanceof Type) {
        	iType = (Type)type;
        }
        if (iType == null) {
        	
        	if (!(type instanceof ClassDefinition)) {
        		throw new Error("INTERNAL ERROR : type should be a ClassDefinition, not a " + type.getClass().getName());
        	}
        	
        	ClassDefinition cd = (ClassDefinition)type;
        	
        	fr.irisa.triskell.kermeta.language.structure.Class fc = (fr.irisa.triskell.kermeta.language.structure.Class)classes.get(cd);
        	if (fc == null) {
        		fc = unit.struct_factory.createClass();
        		fc.setTypeDefinition(cd);
        		classes.put(cd, fc);
        	}
        	iType = fc;
        }
        
        ptype.setInstanceType(iType);
        
        getCurrentPackage().getOwnedTypeDefinition().add(ptype);
        unit.typeDefs.put(getQualifiedName(node), ptype);
        return ptype;
    }
	
	/**
	 * annotation.getSource() => "kermeta" if the ann. is intended to be owned by kermeta code
	 * annotation.getDetails() => hashtable, with { "body" : <body_content> } for body operations
	 */
	public Object visit(EAnnotation node)
	{	
		String result = "";
		if (node.getDetails().containsKey(KM2Ecore.KMT2ECORE_ANNOTATION_BODY_DETAILS))
		{	
			result = (String)node.getDetails().get(KM2Ecore.KMT2ECORE_ANNOTATION_BODY_DETAILS);
			// Set the context necessary for the operation to be parsed properly (at least, put the parameters
			// in the symbol list.
			
			// Parse and inject
			this.current_op.setBody(ExpressionParser.parse(unit, result));
		}
		
		else if (node.getSource().equals(KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER))
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
		else if (node.getSource().equals(KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS))
		{
			result = (String)node.getDetails().get(KM2Ecore.KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS);
			// Set the context necessary for the operation to be parsed properly (at least, put the parameters
			// in the symbol list.
			
			// Parse and inject
			this.current_op.setSuperOperation((Operation)ExpressionParser.parse(unit, result));
		}
		return result;
	}
	
	protected static Hashtable primitive_types_mapping;
	
	static {
		primitive_types_mapping = new Hashtable();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("java.lang.Integer", 	"kermeta::standard::Integer");
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.String", 	"kermeta::standard::String");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
	}
	
	public String getQualifiedName(ENamedElement e) {
		if (e.eContainer() instanceof ENamedElement) 
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
	
	public void getSymbols(KermetaUnit builder)
	{
		builder.pushContext();
		// add type variable
		Iterator tvs = builder.current_operation.getTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((TypeVariable)tvs.next());
		// add parameters
		Iterator params = builder.current_operation.getOwnedParameter().iterator();
		while(params.hasNext()) builder.addSymbol(new KMSymbolParameter((Parameter)params.next()));
		builder.popContext();
	}
}

