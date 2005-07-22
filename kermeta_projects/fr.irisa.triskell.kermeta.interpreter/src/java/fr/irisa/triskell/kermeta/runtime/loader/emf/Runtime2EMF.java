/* $Id: Runtime2EMF.java,v 1.3 2005-07-22 16:45:18 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : Runtime2EMF.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 20, 2005
 * Authors       : zdrey
 * NOTE : how to use resources :
 * 		The objects that you serialize must be added to the resource in a specific order
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

//import java.io.BufferedOutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;

/**
 * 
 */
public class Runtime2EMF {

    /**
     * 
     */
    public Runtime2EMF() {
        super();
        updatedRuntimeObjects = new ArrayList();
        updatedEObjects = new ArrayList();
    }
    

    /**
     * @param unit
     * @param file_path
     */
    public static void saveunit(EMFRuntimeUnit unit, String file_path) {

        Runtime2EMF r2e = new Runtime2EMF();
        // Initialize the resource
	    String ext = file_path.substring(file_path.lastIndexOf(".")+1);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    Resource resource = resource_set.createResource(URI.createFileURI(file_path));
	    System.err.println("URI to save : " + URI.createFileURI(file_path).toString());
	    // Update all the instance of the EMF Model
	    r2e.updateEMFModel(unit, resource);
	    
	    try {
	        /* For tests purpose : java.io.OutputStream out = new BufferedOutputStream(System.out);
	        resource.save(out, null); */
	        resource.save(null);
		} catch (IOException e) {
		    e.printStackTrace();
			throw new Error(e);
		}
        
    }
    
    public void updateEMFModel(EMFRuntimeUnit unit, Resource resource)
    {
        ArrayList root_containers = new ArrayList();
        //  Get the instances RuntimeObject
        ArrayList instances = Collection.getArrayList(unit.getInstances());
        ArrayList eobjects = new ArrayList(); 
        Iterator it = instances.iterator();
        // Get each instance and translate it in EMF (EObject)
        ArrayList root_map = new ArrayList();
        while(it.hasNext()) {
            RuntimeObject ro = (RuntimeObject)it.next();
            // Update the EMF Object attached to our
            EObject o = getEObjectFromRuntimeObject(ro);
            //eobjects.add(o);
            if (o.eContainer() == null)
            {
                root_map.add(ro);
            }
            // We look for its children, add them, and then, add it in the resource
            /*System.err.println("----------------------------------");
            System.err.println("Objet n°" + instance_number + " : ("+ o.hashCode() +")" );
            System.err.println("   l'objet : "+ o);
            System.err.println("   sa resource : "+ o.eResource());
            System.err.println("   son conteneur : "+ o.eContainer());
            if (o.eContainer()!=null && o.eContainer() instanceof EPackage)
                System.err.println("        ( : "+ ((EPackage)o.eContainer()).getName());
            System.err.println("   sa classe : "+ o.eClass().getName());
            System.err.println("----------------------------------");*/
        }
        
        // Are we allowed to have more than one "Object model" (root object)?
        it = root_map.iterator();
        while (it.hasNext())
        {
            RuntimeObject ro = (RuntimeObject)it.next();
            //EObject o = updateEObjectFromRuntimeObject(ro, unit, resource);
            Object o = updateEMFObjectFromRuntimeObject(ro);
            // And now update the contained objects as well:)
            resource.getContents().add(o);
        }
        
        
    }
    
    // Put in this list all the RuntimeObject that were already updated
    protected ArrayList updatedRuntimeObjects;
    protected ArrayList updatedEObjects;
    
    /**
     * Update the EMFObject that was represented by the RuntimeObject rObject
     * @param rObject
     * @return the updated EObject
     */
    protected Object updateEMFObjectFromRuntimeObject(RuntimeObject rObject)
    {
        Object result = rObject.getData().get("emfObject");
        // For each property of RO, convert it!
        Iterator it = rObject.getProperties().keySet().iterator();
        while (it.hasNext())
        {   
            String prop_name = (String)it.next(); 
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            
            // Handle the property named prop_name
            if (!updatedRuntimeObjects.contains(property))
            {	
                //System.err.println("La taille de mes objects mis à jour : "+ updatedRuntimeObjects.size());
                if (result instanceof EObject)
                {
                    updateProperties((EObject)result, prop_name, property);
                }
                // Q : does an EList of ELists has a sense??? If yes, this code is meaningful..But i think that no
                /*else if (result instanceof EList)
                {
                    EList rlist = (EList)result;
                    Iterator rit = rlist.iterator();
                    while (rit.hasNext())
                    {
                        EObject po = (EObject)rit.next();
                        updateProperties(po, prop_name, property);
                    } 
                }*/
                else 
                {
                    throw new Error("NotImplemented Error. The following emf object has unrecognized type : " + result );
                }
                // If the property is not a "sharable" RuntimeObject (like the Strings), then we add it to the objects
                // which the EMF instances associated are updated --> TODO : find the common type for those DataTypes?
                if (getPrimitiveTypeValueFromRuntimeObject(property)==null)
                    updatedRuntimeObjects.add(property);
            }
        }
        return result;
    }
    
    /**
     * Update the property named by <code>prop_name</code> of the <code>result</code>.
     * This is a recursive method, calling updateSubObjects
     * EObject given in parameter, with the provided Runtime representation of this property value.
     * @param result the EObject of which we have to modify a property 
     * @param prop_name the name of the property to modify
     * @param property the Runtime representation of the property to update
     */
    protected void updateProperties(EObject eObject, String prop_name, RuntimeObject property)
    {
        EStructuralFeature feature = getEStructuralFeatureByName(eObject, prop_name);
        //FType ftype = getMetaClassByName(getEQualifiedName(etype), unit);
        //eObject.eUnset(feature); // is it necessary? (when object modified by the user?)
        Object property_eObject = property.getData().get("emfObject");
        // If property is a simple EObject 
        if ( property_eObject instanceof EObject)
        {
            eObject.eSet(feature, property_eObject);
            //System.err.println("   feature tout seul -> " + eObject.eGet(feature) );
        }
        // If it is a collection of Objects
        else if (property_eObject instanceof EList)
        {
            Iterator p_it = ((ArrayList)property.getData().get("CollectionArrayList")).iterator();
            // For each feature of the collection of features
            while (p_it.hasNext())
            {
                RuntimeObject r_o =(RuntimeObject)p_it.next(); 
                Object p_o = r_o.getData().get("emfObject");
                // We could have an EList I suppose?
                ((EList)property_eObject).add(p_o);
                //System.out.println("    "+feature.getName() + " -> "+ p_o);
                // Above line is ok, but this one does not work : eObject.eSet(feature, (EList)property_eObject);
                ((EList)eObject.eGet(feature)).add(p_o);
                if (!updatedRuntimeObjects.contains(r_o))
                {
                    updateEMFObjectFromRuntimeObject(r_o);
                    updatedRuntimeObjects.add(r_o);
                }
            }
        }// FIXME : rather put a test like " property instanceof java.lang.String"
        else if (feature.getEType() instanceof EDataType)
        {
            property_eObject = getPrimitiveTypeValueFromRuntimeObject(property);
            eObject.eSet(feature, property_eObject);
        }
        else
        {
            System.err.println("NotImplementedError : This type is not recognized!!!" + feature.getEType());
        }
    }
    
    /**
     * Get the EObject associated with the given runtimeObject.
     * This only works for objects that are not Collections (fixme?). 
     * @param rObject
     * @return
     */
    protected EObject getEObjectFromRuntimeObject(RuntimeObject rObject)
    {
        return (EObject)rObject.getData().get("emfObject");
    }
   
    /**
     * Map the modified objects :
     * An object that was modified in Kermeta do not update automatically the ecore corresponding object :
     * (The architecture is not a proxy yet) We have to lazily update the mapped EObject.
     * This method handle the case of features that are data types (EDataType) :
     * 
     * ----------------------> We have to update the default literal value
     * 
     * FIXME : a dirty patchy method : We have to do a proper mapping between FTypes and ETypes
     * @param ro The runtime object corresponding to the given feature
     * @param
     * 
     */
    public Object getPrimitiveTypeValueFromRuntimeObject(RuntimeObject robject)
    {
        String[] s_primitive_types = new String[] {"StringValue", "BooleanValue", "NumericValue" };
    	for (int i=0; i<s_primitive_types.length; i++)
    	    if (robject.getData().containsKey(s_primitive_types[i]))
    	        return robject.getData().get(s_primitive_types[i]);
    	return null;
    }
    
    /**
     * 
     * @param eObject
     * @param p_name
     * @return
     */
    protected EStructuralFeature getEStructuralFeatureByName(EObject eObject, String p_name)
    {
        EClass c = eObject.eClass();
        // EObject feature_value = null;
        // Get the structural features
        EList features = c.getEAllStructuralFeatures();
        // For each feature, get the value and add it to the properties hashtable
        Iterator it = features.iterator();
        String feature_name = "";
        EStructuralFeature feature = null;
        while (it.hasNext() &&  !feature_name.equals(p_name))
        {
            feature = (EStructuralFeature)it.next();
	        feature_name  = feature.getName();
        }
        if (feature_name.equals(p_name))
        {
            return feature; //feature_value = (EObject)eObject.eGet(feature);
        }
        return null;
    }
}



