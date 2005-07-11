/* $Id: EMF2Runtime.java,v 1.2 2005-07-11 16:50:33 zdrey Exp $
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
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.sun.rsasign.s;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * 
 */
public class EMF2Runtime {

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");
    
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
			// pre-create the runtime objects
			TreeIterator it = resource.getAllContents();
			while(it.hasNext()) {
				EObject obj = (EObject)it.next();
				RuntimeObject ro = visitor.setRuntimeObjectForEObject(unit, obj);
				visitor.runtime_objects.add(ro);
				visitor.runtime_objects_map.put(obj, ro);
				internalLog.info("RO created : "+ (ro != null));
			}
			
			// Fill in the properties of the runtime objects that we created
			Iterator rit = visitor.runtime_objects.iterator();
			RuntimeObject ro = null;
			while (rit.hasNext())
			{
			    ro = (RuntimeObject)rit.next();
			    visitor.populateRuntimeObject(ro, unit);
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
	    FTypeDefinition cdef = unit.getMetamodelUnit().getTypeDefinitionByName(eclass_name);
	    // Define the RO-metaclass of the given EObject
	    RuntimeObject ro_metaclass = this.getRuntimeObjectForMetaClass(eclass_name, unit);
	    
	    // Define the RO-instance of the given EObject :
	    // - create a RO
	    // - fill its properties hashtable
	    // TODO move helper method for RO creation somewhere elles
	    FClass fclass = unit.getMetamodelUnit().struct_factory.createFClass();
        fclass.setFClassDefinition((FClassDefinition)cdef);
	    //result = memory.getROFactory().createMetaClass(fclass);
        result = new RuntimeObject(memory.getROFactory(), ro_metaclass);
        // FIXME : is it good?????????????????????????????????????????
        result.getData().put("ecoreObject", object);
        //result.getData().put("kcoreObject", fclass);
        
        // Define the properties of the runtime object (attributes, operation, blablabla)
        // Add the runtime object in the memory. TODO : we have to add it in the current context memory stack
        
        return result;
        
	}
	
	
	protected void populateRuntimeObject(RuntimeObject rObject, EMFRuntimeUnit unit)
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
	        System.err.println("le nom de la feature : " + feature.getName() + "\n et sa valeur :"+eObject.eGet(feature));
	        internalLog.info("Le type de la 'feature' � ajouter : " + feature.getEType());
	        //
	        EClassifier etype = feature.getEType(); 
	        // Get the FObject corresponding to this etype
	        //RuntimeObject roTypeParam = getRuntimeObjectForMetaClass(etype.getName(), unit);
	        FTypeDefinition etype_cdef = unit.getMetamodelUnit().getTypeDefinitionByName(etype.getName());
	        // Create the type of the collection that corresponds to the property upper bounded!!
	        // FIXME : it would be better not to create the FClass corresponding to the type every time we need one?
	        FClass etype_fclass = unit.getMetamodelUnit().struct_factory.createFClass();
	        etype_fclass.setFClassDefinition((FClassDefinition)etype_cdef);
	        
	        // Eget can return an elist of features
	        Object fvalue = eObject.eGet(feature);
	        if (fvalue instanceof EList) // I have then to create a Collection of Features of the given type (etype)
	        {
	            RuntimeObject roset = createRuntimeObjectForCollection((EList)fvalue, etype_fclass, unit);
	            // Create the parametred set (Set<etype>) and Fill in the set   
	            rObject.getProperties().put(fname, roset);
	            System.out.println("fvalue is an elist! ");
	        }
	        else if (fvalue instanceof EObject)
	        {   
	            // Get the RO Instance for this feature
	            RuntimeObject rovalue = (RuntimeObject)this.runtime_objects_map.get(fvalue);
	            rObject.getProperties().put(fname, rovalue);
	            
	        }
	    }
	    
	    // Find the value of the structural features and populate the properties.
	}
	
	/**
	 * Create a RuntimeObject that represent a collection.
	 * We need to create in "purely" in java when we have an instance which one of its properties
	 * has an upperBound that is * or a number > 1
	 * Adds the list of objects given in arguments, and create a collection which type parameter is typeParam.
	 * 
	 * @param objects a list of EObjects
	 * @return a Set of objects (Set<typeParam>)
	 */
	public RuntimeObject createRuntimeObjectForCollection(EList objects, FType typeParam, EMFRuntimeUnit unit)
	{
	    //memory.getROFactory().createMetaClass(fclass)
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    // Get the runtimeobject that embeds the FClass "Set"
	    RuntimeObject result = Collection.create("kermeta::standard::Set", memory.getROFactory(), typeParam);
	    Iterator it = objects.iterator();
	    // Transform the EObjects into RuntimeObject and add them in our collection
	    while (it.hasNext())
	    {
	        EObject sfeature = (EObject)it.next();
	        RuntimeObject rovalue = (RuntimeObject)this.runtime_objects_map.get(sfeature);
	        Collection.add(result, rovalue);
	    }
	    return result;
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
	        // Here, the type def should always be a FCLassDefinition
	        FTypeDefinition typedef = unit.getMetamodelUnit().getTypeDefinitionByName(metaclass_name);
	        // TODO a cache for already loaded FClasses?
	        // Create the RuntimeObject corresponding to the FClass associated to the metaclass_name class.
	        FClass fclass = unit.getMetamodelUnit().struct_factory.createFClass();
	        fclass.setFClassDefinition((FClassDefinition)typedef);
	        System.out.println("Type definition : "+ typedef.getFName());
	        result = memory.getROFactory().createMetaClass(fclass); // does not work -> RO not found
	        // MetaclassRO of EClass is "memory.getRuntimeObjectForFObject(fc)" 
		    // which is the type FClass itself (repr. as a RO)) 
		    // result = new RuntimeObject(memory.getROFactory(), memory.getROFactory().getClassClass());//memory.getRuntimeObjectForFObject(typedef.fGetMetaClass()));
		    // result.getData().put("kcoreObject", fclass);

	    }
	    return result;
	    
	}
	
    

}
