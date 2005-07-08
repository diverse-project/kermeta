/* $Id: EMF2Runtime.java,v 1.1 2005-07-08 11:39:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMF2Runtime.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * 
 */
public class EMF2Runtime {

    /**
     * 
     */
    public EMF2Runtime() {
        super();
        typedef_cache = new Hashtable();
        runtime_objects = new ArrayList();
        runtime_objects_map = new Hashtable();
        
    }
    
    /**
     * Hashtable that contains the RuntimeObjects for the class Definitions of the metamodel.
     * entry is { name_of_the_class : corresponding Runtime Object}
     */
    protected Hashtable typedef_cache;
    
    /**
     * The list of runtimeObjects that represent the EMF instances
     */
    protected ArrayList runtime_objects;
    protected Hashtable runtime_objects_map; // { eobject : robject }
    
	public static void loadunit(EMFRuntimeUnit unit) {
		try {
	//		 load ressource
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
			Resource resource = resource_set.getResource(URI.createURI(unit.getUri()), true);
			
	        loadunit(unit, resource);
		} catch (Throwable e) {
			
			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUri() + " : " + e, e);
		}
	}
	
	public static void loadunit(EMFRuntimeUnit unit, Resource resource) {
		try {
		    EMF2Runtime visitor = new EMF2Runtime();
		    System.out.println("I am a null unit : "+ unit);
		    System.out.println("I am a null instance : "+ unit.getInstances());
		    // FIXME : null factory§!!!!!!
		    System.out.println("I am a null factory : " + unit.getFactory());
		    //unit.factory = new EMFRuntimeUnitFactory();
		    System.out.println("I am a null factory of instances : " + unit.getInstances().getFactory());
			// pre-create the runtime objects
			TreeIterator it = resource.getAllContents();
			while(it.hasNext()) {
				EObject obj = (EObject)it.next();
				RuntimeObject ro = visitor.setRuntimeObjectForEObject(unit, obj);
				visitor.runtime_objects.add(ro);
				visitor.runtime_objects_map.put(obj, ro);
				System.out.println("RO created : "+ (ro != null));
			}
			
			// Fill in the properties of the runtime objects that we created
			Iterator rit = visitor.runtime_objects.iterator();
			RuntimeObject ro = null;
			while (rit.hasNext())
			{
			    ro = (RuntimeObject)rit.next();
			    visitor.populateRuntimeObject(ro);
			    fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(unit.getInstances(), ro);
			}
	        			
			// Add the runtime objects to this collection
			
			
			
		} catch (Throwable e) {
			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUri() + " : " + e, e);
		}
		
	}
	
	/**
	 * Define the runtimeObject corresponding to this object
	 * - get the runtimeobject of the meta class it refers to 
	 * -
	 */
	public RuntimeObject setRuntimeObjectForEObject(EMFRuntimeUnit unit, EObject object)
	{
	    RuntimeObject result = null;
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    
	    String eclass_name = object.eClass().getName();
	    unit.ecore_unit.getQualifiedName(unit.ecore_unit.getTypeDefinitionByName(eclass_name));
	    // Define the RO-metaclass of the given EObject
	    RuntimeObject ro_metaclass = this.getRuntimeObjectForMetaClass(eclass_name, unit);
	    
	    // Define the RO-instance of the given EObject :
	    // - create a RO
	    // - fill its properties hashtable
	    // TODO move helper method for RO creation somewhere elles
	    
        result = new RuntimeObject(memory.getROFactory(), ro_metaclass);
        // FIXME : is it good?????????????????????????????????????????
        result.getData().put("ecoreObject", object);
        
        // Define the properties of the runtime object (attributes, operation, blablabla)
        // Add the runtime object in the memory. TODO : we have to add it in the current context memory stack
        
        return result;
        
	}
	
	
	protected void populateRuntimeObject(RuntimeObject rObject)
	{
	    EObject eObject = (EObject)rObject.getData().get("ecoreObject");
	    EClass c = eObject.eClass();
	    // Get the structural features
	    EList features = c.getEStructuralFeatures();
	    // For each feature, get the value and add it to the properties hashtable
	    Iterator it = features.iterator();
	    while (it.hasNext())
	    {
	        EStructuralFeature feature = (EStructuralFeature)it.next();
	        String  fname  = feature.getName();
	        System.err.println("son nom : " + feature.getName() + "\n et son feature:"+eObject.eGet(feature));
	        // Eget can return an elist of features
	        Object fvalue = eObject.eGet(feature);
	        if (fvalue instanceof EList)
	        {
	            Iterator eit = ((EList)fvalue).iterator();
	            while (eit.hasNext())
	            {
	                EObject sfeature = (EObject)eit.next();
	          /*      RuntimeObject rovalue = (RuntimeObject)this.runtime_objects_map.get(sfeature);
	                // FIXME : wrong
	                rObject.getProperties().put(fname, rovalue);
	                */
	            }
	            System.out.println("fvalue is an elist ");
	            
	            
	        }
	        else if (fvalue instanceof EObject)
	        {   
	            // Get the RO Instance for this feature
	            System.out.println("rovalue : "+ fvalue);
	            RuntimeObject rovalue = (RuntimeObject)this.runtime_objects_map.get(fvalue);
	            System.out.println("rovalue : "+ rovalue);
	            System.out.println("--> map :"+ runtime_objects_map.size() + "CONTENTS : "+ runtime_objects_map);
	            rObject.getProperties().put(fname, rovalue);
	        }
	    }
	    
	    // Find the value of the structural features and populate the properties.
	}
	

	public RuntimeObject getRuntimeObjectForMetaClass(String metaclass_name, EMFRuntimeUnit unit)
	{
	    RuntimeObject result = null;
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    if (this.typedef_cache.containsKey(metaclass_name)) 
	    {
	        result = (RuntimeObject)this.typedef_cache.get(metaclass_name);
	    }
	    else
	    {
	        // Create the RuntimeObject encaspulating the FClass corresponding to the EClass given by its name :
	        // Reconstruct from FClass -> FClassDefinition (meta meta levels) -> Our EClass 
	        FTypeDefinition typedef = unit.getMetamodelUnit().getTypeDefinitionByName(metaclass_name);
	        // MetaclassRO of EClass is "memory.getRuntimeObjectForFObject(fc)" 
		    // which is the type FClass itself (repr. as a RO)) 
		    result = new RuntimeObject(memory.getROFactory(), memory.getROFactory().getClassClass());//memory.getRuntimeObjectForFObject(typedef.fGetMetaClass()));
		    System.err.println("Metaclass : "+ result );
		    if (result.getData()==null) result.setData(new Hashtable());
		    result.getData().put("kcoreObject", typedef);

	    }
	    return result;
	    
	}
	
    

}
