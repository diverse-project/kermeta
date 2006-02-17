/* $Id: ECore2Kermeta.java,v 1.10 2006-02-17 10:48:01 zdrey Exp $
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
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
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
    protected Hashtable operations;
	
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
					visitor.types.put(obj, unit.struct_factory.createFClassDefinition());
				}
				else if (obj instanceof EEnum) {
					visitor.types.put(obj, unit.struct_factory.createFEnumeration());

				}
				else if (obj instanceof EDataType) {
					visitor.types.put(obj, unit.struct_factory.createFPrimitiveType());

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
			// visit the EAnnotations of the metamodel
			Iterator ops = visitor.operations.entrySet().iterator();
			while(ops.hasNext()) {
				Map.Entry op_entry = (Map.Entry)ops.next();
			    EOperation eop = (EOperation)op_entry.getKey();
			    visitor.current_op = (FOperation)op_entry.getValue();
			    if (eop.getEAnnotation(KM2Ecore.KMT2ECORE_ANNOTATION)!=null)
			        visitor.accept(eop.getEAnnotation(KM2Ecore.KMT2ECORE_ANNOTATION));
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
    
    // table of types : EType -> FTypeDefinition
    protected Hashtable types = new Hashtable();
    
    protected Hashtable classes = new Hashtable();
    
    protected Stack current_pack = new Stack();
    protected FClassDefinition current_classdef;
    protected FEnumeration current_enum;
    protected FOperation current_op;
    
    protected FPackage getCurrentPackage() {
    	if (current_pack.size() == 0) return null;
        return (FPackage)current_pack.peek();
    }
    
    protected FType getFTypeForEType(EClassifier etype) {
    	
    	FTypeDefinition def = null;
    	
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
	    		def = (FTypeDefinition)types.get(etype);
	    	}
	    	
    	}
    	
    	if (def == null) return null;
    	if (def instanceof FType) return (FType)def;
    	
    	FClassDefinition cd = (FClassDefinition)def;
    	
    	FClass fc = (FClass)classes.get(cd);
    	if (fc == null) {
    		fc = unit.struct_factory.createFClass();
    		fc.setFClassDefinition(cd);
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
        FPackage pack = unit.packageLookup(getQualifiedName(node));
        if (pack == null) {
            pack = unit.struct_factory.createFPackage();
            pack.setFName(getEscapedName(node));
            pack.setFUri(node.getNsURI());
            if (getCurrentPackage() != null)
                pack.setFNestingPackage(getCurrentPackage());
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
        FTypeDefinition td = unit.typeDefinitionLookup(getQualifiedName(node));
        if (td != null) {
            unit.messages.addError("Duplicate definition of type " + getQualifiedName(node), td);
        }
        
        current_classdef = (FClassDefinition)types.get(node);
        current_classdef.setFName(getEscapedName(node));
        current_classdef.setFIsAbstract(node.isAbstract() || node.isInterface());
        
        getCurrentPackage().getFOwnedTypeDefinition().add(current_classdef);
        
        // set super types
        Iterator it = node.getESuperTypes().iterator();
        while (it.hasNext()) {
        	EClassifier st = (EClassifier)it.next();
            FType t = getFTypeForEType(st);
            if (t == null || !(t instanceof FClass)) {
                throw new Error("Internal error of ecore2kermeta transfo : supertypes of class " + getQualifiedName(node) + " : "+ getQualifiedName(st) +" not found");
            }
            current_classdef.getFSuperType().add(t);
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
       FProperty prop = unit.struct_factory.createFProperty();
       
       prop.setFName(getEscapedName(node));
       prop.setFIsComposite(true);
       
       prop.setFIsOrdered(node.isOrdered());
       prop.setFIsUnique(node.isUnique());
       prop.setFUpper(node.getUpperBound());
       prop.setFLower(node.getLowerBound());
       
       prop.setFDefault(node.getDefaultValueLiteral());
       
       prop.setFIsDerived(node.isDerived());
       prop.setFIsID(node.isID());
       
       prop.setFOwningClass(current_classdef);
       
       FType t = getFTypeForEType(node.getEType());
       if (t == null) {
           throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " : "+ getQualifiedName(node.getEType()) + " not found");
       }
       prop.setFType(t);
       
       return prop;
    }
    
    /**
     * Properties indexed by their qualified names
     * used to set opposites
     */
    private Hashtable properties = new Hashtable();
    
    public Object visit(EReference node) {
        FProperty prop = (FProperty)properties.get(getQualifiedName(node));
        if (prop == null) {
            prop = unit.struct_factory.createFProperty();
            properties.put(getQualifiedName(node), prop);
        }
        
        prop.setFName(getEscapedName(node));
        prop.setFIsComposite(node.isContainment());
        
        prop.setFIsOrdered(node.isOrdered());
        prop.setFIsUnique(node.isUnique());
        prop.setFUpper(node.getUpperBound());
        prop.setFLower(node.getLowerBound());
        
        prop.setFDefault(node.getDefaultValueLiteral());
        
        prop.setFIsDerived(node.isDerived());
        prop.setFIsID(false);
        
        prop.setFOwningClass(current_classdef);
        
        FType t = getFTypeForEType(node.getEType());
        if (t == null) {
            throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " not found");
        }
        prop.setFType(t);
        
        if (node.getEOpposite() != null) {
            FProperty oprop = (FProperty)properties.get(getQualifiedName(node.getEOpposite()));
            if ( oprop == null) {
                oprop = unit.struct_factory.createFProperty();
                properties.put(getQualifiedName(node.getEOpposite()), oprop);
            }
            prop.setFOpposite(oprop);
        }
        
        return prop;
    }
   
    public Object visit(EOperation node) {
        // FIXME : handle super operations
    	// FIXME : handle raised exceptions
    	isClassTypeOwner = false;
    	current_op = unit.struct_factory.createFOperation();
    	current_op.setFName(getEscapedName(node));
  
    	current_op.setFIsOrdered(node.isOrdered());
        current_op.setFIsUnique(node.isUnique());
        current_op.setFUpper(node.getUpperBound());
        current_op.setFLower(node.getLowerBound());
        
        FType t = getFTypeForEType(node.getEType());
        if (t == null) {
            throw new Error("Internal error of ecore2kermeta transfo : type of operation " + getQualifiedName(node) + " not found");
        }
        current_op.setFType(t);
        
        if (isQuickFixEnabled)
        {
        	// Quickfix to handle operation named like properties
        	if (isMethodPropertyNameOverlapSafe)
        	{
        		FProperty prop = unit.getPropertyByName(current_classdef, current_op.getFName());
        		if (prop != null) {
        			current_op.setFName(methodRenamePrefix + current_op.getFName() +methodRenamePostfix);
        		}
        	}
        	// Quickfix to avoid two operations with the same name
        	if (isMethodNameOverlapSafe)
        	{
        		FOperation op = unit.getOperationByName(current_classdef, current_op.getFName());        	
	        	int i = 2;
	        	while (op != null) {
	        		current_op.setFName(current_op.getFName() + i);
	        		op = unit.getOperationByName(current_classdef, current_op.getFName());
	        	}
        	}
        }
        current_op.setFOwningClass(current_classdef);
        operations.put(node, current_op);
        
        acceptList(node.getEAnnotations());
        
        acceptList(node.getEParameters());
    	
        return current_op;
    }
    
    public Object visit(EParameter node) {
    	FParameter param = unit.struct_factory.createFParameter();
    	param.setFName(getEscapedName(node));
       
        param.setFIsOrdered(node.isOrdered());
        param.setFIsUnique(node.isUnique());
        param.setFUpper(node.getUpperBound());
        param.setFLower(node.getLowerBound());
        
        param.setFOperation(current_op);
        
        FType t = getFTypeForEType(node.getEType());
        if (t == null) {
            throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " not found");
        }
        param.setFType(t);
        return param;
    }
    
    
    public Object visit(EEnum node) {
        current_enum = (FEnumeration)types.get(node);
        current_enum.setFName(getEscapedName(node));
        getCurrentPackage().getFOwnedTypeDefinition().add(current_enum);
        acceptList(node.getELiterals());
        unit.typeDefs.put(getQualifiedName(node), current_enum);
        return current_enum;
    }
    public Object visit(EEnumLiteral node) {
    	FEnumerationLiteral lit = unit.struct_factory.createFEnumerationLiteral();
    	lit.setFEnumeration(current_enum);
    	lit.setFName(getEscapedName(node));
    	return lit;
    }
    
    public Object visit(EDataType node) {
        FPrimitiveType ptype = (FPrimitiveType)types.get(node);
        
        ptype.setFName(getEscapedName(node));
        
        String type_name = node.getInstanceClassName();
  
        if (primitive_types_mapping.containsKey(type_name)) {
        	type_name = (String)primitive_types_mapping.get(type_name);
        }
        FTypeDefinition type = unit.typeDefinitionLookup(type_name);
        if (type == null) {
        	unit.messages.addWarning("cannot find instance class " + type_name + " for primitive type " + getQualifiedName(node) + " (replaced by Object)", null);
        	type = KermetaUnit.getStdLib().typeDefinitionLookup("kermeta::language::structure::Object");
        }
        
        FType iType = null;
        if (type instanceof FType) {
        	iType = (FType)type;
        }
        if (iType == null) {
        	
        	if (!(type instanceof FClassDefinition)) {
        		throw new Error("INTERNAL ERROR : type should be a FClassDefinition, not a " + type.getClass().getName());
        	}
        	
        	FClassDefinition cd = (FClassDefinition)type;
        	
        	FClass fc = (FClass)classes.get(cd);
        	if (fc == null) {
        		fc = unit.struct_factory.createFClass();
        		fc.setFClassDefinition(cd);
        		classes.put(cd, fc);
        	}
        	iType = fc;
        }
        
        ptype.setFInstanceType(iType);
        
        getCurrentPackage().getFOwnedTypeDefinition().add(ptype);
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
    	    // Parse and inject
    	    this.current_op.setFBody(ExpressionParser.parse(unit, result));
    	}
    	
    	else if (node.getSource().equals(KM2Ecore.KMT2ECORE_ANNOTATION_TYPEPARAMETER))
    	{
    		
    		EMap map = node.getDetails();
    		List<FTypeVariable> params = new ArrayList<FTypeVariable>();
    		Iterator<String> it = map.keySet().iterator();
    		while (it.hasNext())
    		{
    			String name = it.next();
    			FTypeVariable tv = unit.struct_factory.createFTypeVariable();
    			tv.setFName(name);
    			params.add(tv);
    		} 
    		// for current_class - add the parameter to the class
    		if (isClassTypeOwner==true) current_classdef.getFTypeParameter().addAll(params);
    		// for current_op
    		else current_op.getFTypeParameter().addAll(params);
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
            return getQualifiedName((ENamedElement)e.eContainer()) + "::" + getEscapedName(e);
        else return getEscapedName(e);
    }
    
    public String getEscapedName(ENamedElement e)
    {
        return KMTHelper.getMangledIdentifier(e.getName());
    }
    
}
