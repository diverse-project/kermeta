/* $Id: RuntimeMemoryLoader.java,v 1.15 2006-10-27 08:27:32 dvojtise Exp $
* Project : kermeta.interpreter
* File : RuntimeMemoryLoader.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1 / INRIA
* ----------------------------------------------------------------------------
* Creation date : 12 mai 2005
* Authors : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.builder;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
 class RuntimeMemoryLoader {
    
    protected KermetaUnit unit;
    protected RuntimeMemory memory;
    
    /** Properties hashtable : { qualified_name : RuntimeObject } */
    private Hashtable<String, RuntimeObject> properties;
    
    // mapping kcoreObject -> RuntimeObject
    private Hashtable<fr.irisa.triskell.kermeta.language.structure.Object, RuntimeObject> objects;
    // mapping qualified_name -> RuntimeObject (TypeDefinition)
    /** TypeDefinition hashtable : { qualified_name : RuntimeObject } */
    private Hashtable<String, RuntimeObject> typeDefinitions;
    
    /**
     * Constructor
     */
    protected RuntimeMemoryLoader(KermetaUnit unit, RuntimeMemory memory) {
        super();
        properties = new Hashtable<String, RuntimeObject>();
        this.unit = unit;
        this.memory = memory;
        objects = new Hashtable<fr.irisa.triskell.kermeta.language.structure.Object, RuntimeObject>();
        typeDefinitions = new Hashtable<String, RuntimeObject>();
    }
    
    protected void init() {
        _1_loadTypes();
        _2_initializeMemory();
        _3_createRuntimeObjects();
    }
    
    public int getNumberOfObjectCached() {
        return objects.size();
    }
    
    
    protected RuntimeObject getTypeDefinitionFromQualifiedName(String qname) {
        RuntimeObject result = (RuntimeObject)typeDefinitions.get(qname);
        // should never happen robustness
        if (result == null) {
            throw new Error("INTERNAL ERROR (when trying to load the runtime memory): unable to find type " + qname );
        }
        
        // The type is not loaded yet as a runtime object
        if (!result.isFrozen()) {
            getOrCreateRuntimeObject((fr.irisa.triskell.kermeta.language.structure.Object)result.getData().get("kcoreObject"));
        }
        
        return result;
    }
    
    protected RuntimeObject getRuntimeObjectForFObject(fr.irisa.triskell.kermeta.language.structure.Object object) {
        //System.err.println("getRuntimeObjectForFObject, objects size = " + objects.size());
        return getOrCreateRuntimeObject(object);
    }
    
    public void clearFObjectFromCache(fr.irisa.triskell.kermeta.language.structure.Object object)
    {
        objects.remove(object);
    }
    
    
    /**
     * Pre-create runtime objects for type definitions
     */
    private void _1_loadTypes() {
        for (Package p : unit.packages.values()) {
            // For each type definition, create the associated RuntimeObject
            for (Object tnext : p.getOwnedTypeDefinition()) {
            	// TypeDefinition can be a ClassDefinition or a ModelTypeDefinition
                TypeDefinition td = (TypeDefinition)tnext;
                RuntimeObject ro =  new KCoreRuntimeObject(memory.getROFactory(), null, td);
                typeDefinitions.put(NamedElementHelper.getQualifiedName(td), ro);
                objects.put(td, ro);
                // If the type definition is a *classDefinition* than, create the complete runtime object, for the 
                // class definition itself, AND for all its properties.
                if (td instanceof ClassDefinition) {
                    for (Object pnext : ((ClassDefinition)td).getOwnedAttribute())
                    {
                        Property prop = (Property)pnext;
                        RuntimeObject ro_prop = new KCoreRuntimeObject(memory.getROFactory(), null, prop);
                        //ro_prop.getData().put("kcoreObject", prop);
                        properties.put(NamedElementHelper.getQualifiedName(prop), ro_prop);
                        objects.put(prop, ro_prop);
                    }
                }
            }
        }
    }
    
    private void _2_initializeMemory() {
        // Intialize the class Class
    	fr.irisa.triskell.kermeta.language.structure.Class fclass=unit.struct_factory.createClass();
		fclass.setTypeDefinition(
		  (ClassDefinition)unit.getTypeDefinitionByName("kermeta::language::structure::Class"));
	    memory.getROFactory().setClassClassFromFClass(fclass);
	    // Initialize singletons
        memory.createSingletons(unit);
    }
    
    /**
     * Create all runtime objects and fill correspondance table
     */
    private void _3_createRuntimeObjects() {
        for (Object next : unit.packages.values()) {
            getOrCreateRuntimeObject((fr.irisa.triskell.kermeta.language.structure.Object)next);
        }
    }
    
    public void loadKCoreRuntimeObject(KCoreRuntimeObject run_obj) {
        if (run_obj.isLoaded()) return;
        run_obj.setLoaded(true);
        fr.irisa.triskell.kermeta.language.structure.Object kcoreObject = run_obj.getKcoreObject();
        
//      set kcoreObject
        //run_obj.getData().put("kcoreObject", kcoreObject);
		
        // set the class definition
        RuntimeObject classdef = getConcreteTypeDefinitionByName(kcoreObject);
		// set the meta-class
		run_obj.setMetaclass( memory.getROFactory().getClassForClassDefinition(classdef) );
		
		// set the container
		run_obj.setContainer( getOrCreateRuntimeObject((fr.irisa.triskell.kermeta.language.structure.Object)kcoreObject.eContainer()) );
		
		// set properties
		for (Object next : kcoreObject.eClass().getEAllAttributes())
		{
			EAttribute att = (EAttribute)next;
			if (att.getUpperBound() == 1) {
				// it is a single primitive value
				if (kcoreObject.eGet(att) != null) {
				    String property_name = normalizePropertyname(att);
				    Object value = kcoreObject.eGet(att);
				    // Map primitive types
				    if (value instanceof Boolean) {
				        run_obj.getProperties().put(property_name, memory.getRuntimeObjectForBoolean(((Boolean)value).booleanValue()));
				    }
				    else if (kcoreObject.eGet(att) instanceof java.lang.Integer) {
				        run_obj.getProperties().put(property_name, Integer.create(((java.lang.Integer)value).intValue(), memory.getROFactory()));
				    }
				    else if (kcoreObject.eGet(att) instanceof java.lang.String) {
				        run_obj.getProperties().put(property_name, fr.irisa.triskell.kermeta.runtime.basetypes.String.create( (java.lang.String)value, memory.getROFactory() ));
				    }
				    else {
				        throw new Error("Kermeta loader error : mapping of primitive type " + value.getClass() + " not implemented");
				    }
				}
			}
			else {
				// it is a collection of primitive values
				System.out.println(att.getName() + " : " + kcoreObject.eGet(att).getClass().getName());
				throw new Error("Kermeta loader error : collection of primitive values not Implemented !!");
				//TODO : implement that
			}
		}
		// set references
		for (Object next : kcoreObject.eClass().getEAllReferences())
		{
			EReference ref = (EReference)next;
			if (ref.getUpperBound() == 1) {
				// it is a single object
				if (kcoreObject.eGet(ref) != null)
				    run_obj.getProperties().put(normalizePropertyname(ref), getOrCreateRuntimeObject((fr.irisa.triskell.kermeta.language.structure.Object)kcoreObject.eGet(ref)));
			}
			else {
				// it is a collection of objects
				if (kcoreObject.eGet(ref) != null) {
				    RuntimeObject list;
				    if (ref.isOrdered()) {
				    	String refQualifiedName = getEQualifiedName(ref);
				    	RuntimeObject property_ro = (RuntimeObject)properties.get(refQualifiedName);
				    	if(property_ro == null){
				    		KermetaUnit.internalLog.error(refQualifiedName + " not found in properties !");
				    		KermetaUnit.internalLog.error(properties.toString());
				    	}
				        list = ReflectiveSequence.createReflectiveSequence(run_obj, property_ro);
				    }
				    else {
				        list = ReflectiveCollection.createReflectiveCollection(run_obj, (RuntimeObject)properties.get(getEQualifiedName(ref)));
				    }
				    // System.out.println(ref.getName() + " : " + eo.eGet(ref).getClass().getName());
					EList values = (EList)kcoreObject.eGet(ref);
					ArrayList ftm_values = new ArrayList();
					for (int i=0; i<values.size(); i++) {
					    Collection.add(list, getOrCreateRuntimeObject((fr.irisa.triskell.kermeta.language.structure.Object)values.get(i)));
					}
					run_obj.getProperties().put(normalizePropertyname(ref), list);
				}
			}
		}
		run_obj.setFrozen(true);
	}

	
	private RuntimeObject getOrCreateRuntimeObject(fr.irisa.triskell.kermeta.language.structure.Object kcoreObject) {
	    // return void if null
		if (kcoreObject == null) return memory.voidINSTANCE;
		// Get it if it exists
		if (objects.containsKey(kcoreObject)) return (KCoreRuntimeObject)objects.get(kcoreObject);
		// Create the object
		RuntimeObject result;
		if (kcoreObject instanceof TypeDefinition) {
		    result = (RuntimeObject)typeDefinitions.get(NamedElementHelper.getQualifiedName((TypeDefinition)kcoreObject));
		}
		else if (kcoreObject instanceof Property) result = (RuntimeObject)properties.get(NamedElementHelper.getQualifiedName((Property)kcoreObject));
		else result = new KCoreRuntimeObject(memory.getROFactory(), null, kcoreObject);
		
		// This is an error
		if (result == null) {
			KermetaUnit.internalLog.error("Memory loader internal error : runtime object for " + kcoreObject + " not found");
			throw new Error("Memory loader internal error : runtime object for " + kcoreObject + " not found");
		}
		
		// Store mapping in the memory
		objects.put(kcoreObject, result);
		
		return result;
	}
	
	/** Accessors */
	public Hashtable<fr.irisa.triskell.kermeta.language.structure.Object, RuntimeObject> getRuntimeObjects()
	{
	    return objects;
	}
	
	/**
	 * Return the concrete representation of the given node. This method is called when
	 * the node type is an abstract class of kermeta::reflection package. We need it when doing
	 * some reflective calls, such as : 
	 * 	- anInstance.getMetaclass.typeDefinition (which type is of kermeta::reflection::classdefinition)
	 *  - aClassDefinition.typeParameter (which is a set of kermeta::reflection::TypeVariables )
	 * @param node the node for which we get the implementation
	 * @return the runtimeobject representation of the concrete implementation of the given node
	 * --> getConcreteRuntimeObject?
	 * Get the concrete typedef if it is defined in kermeta, else, return only the abstract typedef
	 */
	public RuntimeObject getConcreteTypeDefinitionByName(fr.irisa.triskell.kermeta.language.structure.Object kcoreObject)
	{
	    String qname = getEQualifiedName(kcoreObject.eClass());
	    
	    // Initial "computation"
	    RuntimeObject result = memory.getROFactory().getTypeDefinitionByName(getEQualifiedName(kcoreObject.eClass()));
	    
	    // Does node belongs to kermeta::reflection, and inherited in kermeta::language::structure?
	    // If so, we need the concrete class! -- TODO : adapt this for RuntimeObjects that "wrap"
	    // other elements than Kermeta ones
	    String fname = qname.substring(qname.lastIndexOf(":")+1, qname.length());
	    fname = "kermeta::language::structure::"+fname;
	    if (qname.startsWith("kermeta::reflection") && unit.getTypeDefinitionByName(fname)!=null)
	    {
		    // Try to get the type definition of the concrete representation
		    TypeDefinition concrete_typedef = unit.getTypeDefinitionByName(fname);
		    // Get the RuntimeObject of this concrete repr
		    result = memory.getROFactory().getTypeDefinitionByName(fname);
	    }
	    
	    return result;
	}
	
	private String normalizePropertyname(EStructuralFeature f) {
	    String result = f.getName();
	    result = result.substring(0,1).toLowerCase() + result.substring(1);
	    return result;
	}
	
	/**
	 * Get the qualified name of the given ENamedElement. This is a recursive method,
	 * that parses the successive containers of an element and return their qualified names.
	 * This method is mainly used to get the metaclasses of a kermeta model
	 * (see loadKCoreRuntimeObject method)
	 * @param obj
	 * @return the qualified name of the given object
	 */
	private String getEQualifiedName(ENamedElement obj) {
	    String result = obj.getName();
	    
	    // DVK: F_refactoring we do not need anymore to remove the leading "F"
	    // if (obj instanceof EClass) result = result.substring(1);
	    // TODO: remove this temporary hack, needed during the partial refactoring
	    /*if ((obj instanceof EClass) && (result.charAt(0)== 'F') && Character.isUpperCase(result.charAt(1))){
	    	result = result.substring(1);
	    }
	    if (obj instanceof EStructuralFeature) 
	        result = result.substring(1,2).toLowerCase() + result.substring(2);*/
	    if (obj instanceof EStructuralFeature) 
	        result = result.substring(0,1).toLowerCase() + result.substring(1);
	    if (obj instanceof EPackage) {
	        if (result.equals("structure")) return "kermeta::reflection";
	        if (result.equals("behavior")) return "kermeta::language::behavior";
	    }
	    EObject cont = obj.eContainer();
	    if (cont != null &&cont instanceof ENamedElement) {
	        result = getEQualifiedName((ENamedElement)cont) + "::" + result;
	    }
	    return result;
	}
	protected void finalize() throws Throwable {
		super.finalize();
        KermetaUnit.internalLog.debug("FINALIZE RuntimeMemoryLoader ...");
        
        // clear as much ref as possible        
        unit = null;
        if(memory != null) {
        	memory.freeJavaMemory();
        	memory = null;
        }        
        if(properties != null){
	        properties.clear();
	        properties = null;
        }
        if (objects != null)
        {
        	objects.clear();        
        	objects = null;
        }
        if (typeDefinitions != null)
        {
        	typeDefinitions.clear();        
        	typeDefinitions = null;
        }
    }
}
