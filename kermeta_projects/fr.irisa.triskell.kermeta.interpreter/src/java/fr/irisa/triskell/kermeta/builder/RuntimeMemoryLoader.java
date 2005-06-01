/* $Id: RuntimeMemoryLoader.java,v 1.4 2005-06-01 07:51:39 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : newRuntimeLoader.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.builder;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
 class RuntimeMemoryLoader {
    
    protected KermetaUnit unit;
    protected RuntimeMemory memory;
    
    // properties by qualified name
    private Hashtable properties;
    
    // mapping kcoreObject -> RuntimeObject
    private Hashtable objects;
    // mapping qualified_name -> RuntimeObject (TypeDefinition)
    private Hashtable typeDefinitions;
    
    /**
     * Constructor
     */
    protected RuntimeMemoryLoader(KermetaUnit unit, RuntimeMemory memory) {
        super();
        properties = new Hashtable();
        this.unit = unit;
        this.memory = memory;
        objects = new Hashtable();
        typeDefinitions = new Hashtable();
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
            throw new Error("INTERNAL ERROR : unable to find type " + qname );
        }
        
        // The type is not loaded yet as a runtime object
        if (!result.isFrozen()) {
            getOrCreateRuntimeObject((FObject)result.getData().get("kcoreObject"));
        }
        
        return result;
    }
    
    protected RuntimeObject getRuntimeObjectForFObject(FObject object) {
        //System.err.println("getRuntimeObjectForFObject, objects size = " + objects.size());
        return getOrCreateRuntimeObject(object);
    }
    
    public void clearFObjectFromCache(FObject object)
    {
        objects.remove(object);
    }
    
    
    /**
     * Pre-create runtime objects for types
     */
    private void _1_loadTypes() {
        Iterator it = unit.packages.values().iterator();
        while(it.hasNext()) {
            FPackage p = (FPackage)it.next();
            Iterator tit = p.getFOwnedTypeDefinition().iterator();
            while(tit.hasNext()) {
                FTypeDefinition td = (FTypeDefinition)tit.next();
                RuntimeObject ro =  new RuntimeObject(memory.getROFactory(), null);
                ro.getData().put("kcoreObject", td);
                typeDefinitions.put(unit.getQualifiedName(td), ro);
                
                if (td instanceof FClassDefinition) {
                    Iterator pit = ((FClassDefinition)td).getFOwnedAttributes().iterator();
                    while (pit.hasNext()) {
                        FProperty prop = (FProperty)pit.next();
                        RuntimeObject ro_prop = new RuntimeObject(memory.getROFactory(), null);
                        ro_prop.getData().put("kcoreObject", prop);
                        properties.put(unit.getQualifiedName(prop), ro_prop);
                    }
                }
                
            }
        }
    }
    
    private void _2_initializeMemory() {
        // Intialize the class Class
        FClass fclass=unit.struct_factory.createFClass();
		fclass.setFClassDefinition(
		  (FClassDefinition)unit.getTypeDefinitionByName("kermeta::language::structure::Class"));
	    memory.getROFactory().setClassClassFromFClass(fclass);
	    // Initialize singletons
        memory.createSingletons(unit);
    }
    
    /**
     * Create all objects and fill correspondance table
     */
    private void _3_createRuntimeObjects() {
        Iterator it = unit.packages.values().iterator();
        while(it.hasNext()) {
            getOrCreateRuntimeObject((FObject)it.next());
        }
    }
     

	
	private RuntimeObject getOrCreateRuntimeObject(FObject kcoreObject) {
	    // return void if null
		if (kcoreObject == null) return memory.voidINSTANCE;
		// Get it if it exists
		if (objects.containsKey(kcoreObject)) return (RuntimeObject)objects.get(kcoreObject);
		// Create the object
		RuntimeObject result;
		if (kcoreObject instanceof FTypeDefinition) {
		    //System.err.println("Load type definition " + unit.getQualifiedName((FTypeDefinition)kcoreObject));
		    result = (RuntimeObject)typeDefinitions.get(unit.getQualifiedName((FTypeDefinition)kcoreObject));
		}
		else if (kcoreObject instanceof FProperty) result = (RuntimeObject)properties.get(unit.getQualifiedName((FProperty)kcoreObject));
		else result = new RuntimeObject(memory.getROFactory(), null);
		
		// This is an error
		if (result == null) {
			KermetaUnit.internalLog.error("Memory loader internal error : runtime object for " + kcoreObject + " not found");
			throw new Error("Memory loader internal error : runtime object for " + kcoreObject + " not found");
		}
		
		// Store mapping in the memory
		objects.put(kcoreObject, result);
		// set kcoreObject
		result.getData().put("kcoreObject", kcoreObject);
		
		RuntimeObject classdef =  memory.getROFactory().getTypeDefinitionByName(getEQualifiedName(kcoreObject.eClass()));
		
		// set the meta-class
		result.setMetaclass( memory.getROFactory().getClassForClassDefinition(classdef) );
		
		// set the container
		result.setContainer( getOrCreateRuntimeObject((FObject)kcoreObject.eContainer()) );
		
		// set properties
		Iterator it = kcoreObject.eClass().getEAllAttributes().iterator();
		while (it.hasNext()) {
			EAttribute att = (EAttribute)it.next();
			if (att.getUpperBound() == 1) {
				// it is a single primitive value
				if (kcoreObject.eGet(att) != null) {
				    String property_name = normalizePropertyname(att);
				    Object value = kcoreObject.eGet(att);
				    // Map primitive types
				    if (value instanceof Boolean) {
				        result.getProperties().put(property_name, memory.getRuntimeObjectForBoolean(((Boolean)value).booleanValue()));
				    }
				    else if (kcoreObject.eGet(att) instanceof java.lang.Integer) {
				        result.getProperties().put(property_name, Integer.create(((java.lang.Integer)value).intValue(), memory.getROFactory()));
				    }
				    else if (kcoreObject.eGet(att) instanceof java.lang.String) {
				        result.getProperties().put(property_name, fr.irisa.triskell.kermeta.runtime.basetypes.String.create( (java.lang.String)value, memory.getROFactory() ));
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
		it = kcoreObject.eClass().getEAllReferences().iterator();
		while (it.hasNext()) {
			EReference ref = (EReference)it.next();
			if (ref.getUpperBound() == 1) {
				// it is a single object
				if (kcoreObject.eGet(ref) != null)
					result.getProperties().put(normalizePropertyname(ref), getOrCreateRuntimeObject((FObject)kcoreObject.eGet(ref)));
			}
			else {
				// it is a collection of objects
				if (kcoreObject.eGet(ref) != null) {
				    RuntimeObject list;
				    if (ref.isOrdered()) {
				        list = ReflectiveSequence.createReflectiveSequence(result, (RuntimeObject)properties.get(getEQualifiedName(ref)));
				    }
				    else {
				        list = ReflectiveCollection.createReflectiveCollection(result, (RuntimeObject)properties.get(getEQualifiedName(ref)));
				    }
				    // System.out.println(ref.getName() + " : " + eo.eGet(ref).getClass().getName());
					EList values = (EList)kcoreObject.eGet(ref);
					ArrayList ftm_values = new ArrayList();
					for (int i=0; i<values.size(); i++) {
					    Collection.add(list, getOrCreateRuntimeObject((FObject)values.get(i)));
					}
					result.getProperties().put(normalizePropertyname(ref), list);
				}
			}
		}
		result.setFrozen(true);
		return result;
	}
	
	private String normalizePropertyname(EStructuralFeature f) {
	    String result = f.getName();
	    result = result.substring(1,2).toLowerCase() + result.substring(2);
	    return result;
	}
	
	private String getEQualifiedName(ENamedElement obj) {
	    String result = obj.getName();
	    if (obj instanceof EClass) result = result.substring(1);
	    if (obj instanceof EStructuralFeature) 
	        result = result.substring(1,2).toLowerCase() + result.substring(2);
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

}
