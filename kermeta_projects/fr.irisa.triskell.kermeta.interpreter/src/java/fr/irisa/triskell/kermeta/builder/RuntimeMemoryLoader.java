/* $Id: RuntimeMemoryLoader.java,v 1.8 2005-07-08 12:21:50 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
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
                RuntimeObject ro =  new KCoreRuntimeObject(memory.getROFactory(), null, td);
                //ro.getData().put("kcoreObject", td);
                //System.out.println("Load type : "+unit.getQualifiedName(td)+" -> "+td+"ro:"+ro);
                typeDefinitions.put(unit.getQualifiedName(td), ro);
                objects.put(td, ro);
                
                if (td instanceof FClassDefinition) {
                    Iterator pit = ((FClassDefinition)td).getFOwnedAttributes().iterator();
                    while (pit.hasNext()) {
                        FProperty prop = (FProperty)pit.next();
                        RuntimeObject ro_prop = new KCoreRuntimeObject(memory.getROFactory(), null, prop);
                        //ro_prop.getData().put("kcoreObject", prop);
                        properties.put(unit.getQualifiedName(prop), ro_prop);
                        objects.put(prop, ro_prop);
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
    
    public void loadKCoreRuntimeObject(KCoreRuntimeObject run_obj) {
        if (run_obj.isLoaded()) return;
        run_obj.setLoaded(true);
        FObject kcoreObject = run_obj.getKcoreObject();
        
//      set kcoreObject
        //run_obj.getData().put("kcoreObject", kcoreObject);
		
        // set the class definition
        RuntimeObject classdef = getConcreteTypeDefinitionByName(kcoreObject);
		// set the meta-class
		run_obj.setMetaclass( memory.getROFactory().getClassForClassDefinition(classdef) );
		
		// set the container
		run_obj.setContainer( getOrCreateRuntimeObject((FObject)kcoreObject.eContainer()) );
		
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
		it = kcoreObject.eClass().getEAllReferences().iterator();
		while (it.hasNext()) {
			EReference ref = (EReference)it.next();
			if (ref.getUpperBound() == 1) {
				// it is a single object
				if (kcoreObject.eGet(ref) != null)
				    run_obj.getProperties().put(normalizePropertyname(ref), getOrCreateRuntimeObject((FObject)kcoreObject.eGet(ref)));
			}
			else {
				// it is a collection of objects
				if (kcoreObject.eGet(ref) != null) {
				    RuntimeObject list;
				    if (ref.isOrdered()) {
				        list = ReflectiveSequence.createReflectiveSequence(run_obj, (RuntimeObject)properties.get(getEQualifiedName(ref)));
				    }
				    else {
				        list = ReflectiveCollection.createReflectiveCollection(run_obj, (RuntimeObject)properties.get(getEQualifiedName(ref)));
				    }
				    // System.out.println(ref.getName() + " : " + eo.eGet(ref).getClass().getName());
					EList values = (EList)kcoreObject.eGet(ref);
					ArrayList ftm_values = new ArrayList();
					for (int i=0; i<values.size(); i++) {
					    Collection.add(list, getOrCreateRuntimeObject((FObject)values.get(i)));
					}
					run_obj.getProperties().put(normalizePropertyname(ref), list);
				}
			}
		}
		run_obj.setFrozen(true);
	}

	
	private RuntimeObject getOrCreateRuntimeObject(FObject kcoreObject) {
	    // return void if null
		if (kcoreObject == null) return memory.voidINSTANCE;
		// Get it if it exists
		if (objects.containsKey(kcoreObject)) return (KCoreRuntimeObject)objects.get(kcoreObject);
		// Create the object
		RuntimeObject result;
		if (kcoreObject instanceof FTypeDefinition) {
		    //System.err.println("Load type definition " + unit.getQualifiedName((FTypeDefinition)kcoreObject));
		    result = (RuntimeObject)typeDefinitions.get(unit.getQualifiedName((FTypeDefinition)kcoreObject));
		}
		else if (kcoreObject instanceof FProperty) result = (RuntimeObject)properties.get(unit.getQualifiedName((FProperty)kcoreObject));
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
	public Hashtable getRuntimeObjects()
	{
	    return objects;
	}
	
	/**
	 * Return the concrete representation of the given node. This method is called when
	 * the node type is an abstract class of kermeta::reflection package. We need it when doing
	 * some reflective calls, such as : 
	 * 	- anInstance.getMetaclass.classDefinition (which type is of kermeta::reflection::classdefinition)
	 *  - aClassDefinition.typeParameter (which is a set of kermeta::reflection::TypeVariables )
	 * @param node the node for which we get the implementation
	 * @return the runtimeobject representation of the concrete implementation of the given node
	 * --> getConcreteRuntimeObject?
	 * Get the concrete typedef if it is defined in kermeta, else, return only the abstract typedef
	 */
	public RuntimeObject getConcreteTypeDefinitionByName(FObject kcoreObject)
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
		    FTypeDefinition concrete_typedef = unit.getTypeDefinitionByName(fname);
		    // Get the RuntimeObject of this concrete repr
		    result = memory.getROFactory().getTypeDefinitionByName(fname);
	    }
	    
	    return result;
	}
	
	private String normalizePropertyname(EStructuralFeature f) {
	    String result = f.getName();
	    result = result.substring(1,2).toLowerCase() + result.substring(2);
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
