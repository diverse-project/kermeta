/* $Id: Runtime2EMF.java,v 1.4 2005-07-26 16:41:46 zdrey Exp $
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
import java.util.List;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.structure.FClass;

/**
 * 
 */
public class Runtime2EMF {

    /**
     * 
     */
    public Runtime2EMF(EMFRuntimeUnit unit) {
        super();
        this.updatedRuntimeObjects = new ArrayList();
        this.updatedEObjects = new ArrayList();
        this.unit = unit;
    }
    

    /**
     * @param unit
     * @param file_path
     */
    public static void saveunit(EMFRuntimeUnit p_unit, String file_path) {

        Runtime2EMF r2e = new Runtime2EMF(p_unit);
        // Get and load the resource of the ECore MetaModel wanted
        // TODO : metamodel URI can be void if the user created a new empty resource!!!
        // We must raise a correct exception in such a case!!!! 
        if (p_unit.getMetaModelUri() != null && p_unit.getMetaModelUri().length()>0)
        {	// resolve
            r2e.metaModelResource = p_unit.loadMetaModelAsEcore(p_unit.getMetaModelUri());
        }
        else
            // FIXME : not good!
            throw new KermetaRaisedException(null, null);
        // Initialize the resource of the EMF model to save
	    String ext = file_path.substring(file_path.lastIndexOf(".")+1);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    r2e.resource = resource_set.createResource(URI.createFileURI(file_path));
	    //System.err.println("URI to save : " + URI.createFileURI(file_path).toString());
	    // Update all the instance of the EMF Model
	    r2e.updateEMFModel(r2e.resource);
	    
	    try {
	        /* For tests purpose : java.io.OutputStream out = new BufferedOutputStream(System.out);
	        resource.save(out, null); */
	        r2e.resource.save(null);
		} catch (IOException e) {
		    e.printStackTrace();
			throw new Error(e);
		}
        
    }
    
    public void updateEMFModel(Resource resource)
    {
        ArrayList root_containers = new ArrayList();
        //  Get the instances RuntimeObject
        ArrayList instances = Collection.getArrayList(unit.getInstances());
        ArrayList eobjects = new ArrayList(); 
        Iterator it = instances.iterator();
        // Get each instance and translate it in EMF (EObject)
        // Store each instance that is a root (i.e has no container)
        ArrayList root_map = new ArrayList();
        while(it.hasNext()) {
            RuntimeObject ro = (RuntimeObject)it.next();
            // Update the EMF Object attached to our ro // it cannot be smtjhg else than an EObject
            EObject o = (EObject)getOrCreateObjectFromRuntimeObject(ro, null);
            //eobjects.add(o);
            if (o.eContainer() == null)
            {
                root_map.add(ro);
            }
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
    protected EMFRuntimeUnit unit;
    protected Resource metaModelResource;
    protected Resource resource;
    
    /**
     * Update the EMFObject that was represented by the RuntimeObject rObject
     * @param rObject
     * @return the updated EObject
     */
    protected Object updateEMFObjectFromRuntimeObject(RuntimeObject rObject)
    {
        // EMF object exists only for instances that already existed on the load of the
        // EMF model.
        // User can create new EMF objects in pure kermeta. Such objects do not contains an
        // emfObject entry, so we have to create it
        Object result = this.getOrCreateObjectFromRuntimeObject(rObject, null);
        
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
        Object property_eObject = null;
        //FType ftype = getMetaClassByName(getEQualifiedName(etype), unit);
        eObject.eUnset(feature); // is it necessary? (when object modified by the user?)

        // If property emf representation was not found, it means that it was a newly created object, so
        // we have to create the equivalent EMF object.
        property_eObject = getOrCreatePropertyFromRuntimeObject(property, feature.getEType());
        //property_eObject = property.getData().get("emfObject");
        if (property_eObject == null)
            property_eObject = getPrimitiveTypeValueFromRuntimeObject(property);
        // If property is a simple EObject 
        if ( property_eObject instanceof EObject)
        {
            //System.err.println("   feature EObject -> " + feature.getEType() );
            eObject.eSet(feature, property_eObject);
        }
        // If it is a collection of Objects
        else if (property_eObject instanceof EList)
        {
            //System.err.println("   feature EList -> " + feature.getEType() + ((EList)property_eObject).size());
            Iterator p_it = ((ArrayList)property.getData().get("CollectionArrayList")).iterator();
            // For each feature of the collection of features
            while (p_it.hasNext())
            {
                RuntimeObject r_o =(RuntimeObject)p_it.next(); 
                //Object p_o = r_o.getData().get("emfObject");
                Object p_o = getOrCreateObjectFromRuntimeObject(r_o, feature.getEType());
                // We could have an EList I suppose?
                //((EList)property_eObject).add(p_o);
                //System.out.println("    "+feature.getName() + " -> "+ p_o);
                // Above line is ok, but this one does not work : eObject.eSet(feature, (EList)property_eObject);
                // robustness test
                if (p_o!=null)
                {
                    ((EList)eObject.eGet(feature)).add((EObject)p_o);
                    // We need to update RuntimeObject in order to update the associated EObject : 
                    // thus, RuntimeObject "knows" now what object to update
                    if (!r_o.getData().containsKey("emfObject"))
                        r_o.getData().put("emfObject", p_o);
                }
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
     * @param classifier
     * @return
     */
    protected Object getOrCreateObjectFromRuntimeObject(RuntimeObject rObject, EClassifier classifier)
    {
        Object result = null;
        System.out.println("RObject emf : " + rObject.getData().get("emfObject"));
        System.out.println("RObject : " + rObject);
        if (rObject.getData().containsKey("emfObject"))
            result = rObject.getData().get("emfObject");
        else
            result = createEObjectFromRuntimeObject(rObject, classifier);
        return result;
    }
    /**
     * A derivated version of getOrCreateObjectFromRuntimeObject adapted to the
     * creation of property (feature). Indeed, a property can be either an EObject,
     * an EList, or an instance of EDataType
     * @param classifier TODO
     */
    protected Object getOrCreatePropertyFromRuntimeObject(RuntimeObject rProperty, EClassifier classifier)
    {
        Object result = null;
        if (rProperty.getData().containsKey("emfObject"))
            result = rProperty.getData().get("emfObject");
        // a EList?
        else if (rProperty.getData().containsKey("CollectionArrayList"))
            result = createEListFromRuntimeObject(rProperty);
        // a EDataType?
        else if (getPrimitiveTypeValueFromRuntimeObject(rProperty) !=null)
            result = getPrimitiveTypeValueFromRuntimeObject(rProperty);
        // by default, an EObject
        else
            result = createEObjectFromRuntimeObject(rProperty, classifier);
        return result;
    }
   
    /**
     * @param property
     * @return
     */
    private EList createEListFromRuntimeObject(RuntimeObject property) {
        return new BasicEList((java.util.Collection)property.getData().get("CollectionArrayList"));
    }


    /**
     * Create an eObject corresponding to the given RuntimeObject. We do this for 
     * EMF instances that were created manually in Kermeta.
     * @param rObject
     * @param classifier TODO
     * @return the eObject corresponding to this rObject
     */
    protected EObject createEObjectFromRuntimeObject(RuntimeObject rObject, EClassifier classifier)
    {
        EObject result =  null;
        // TypeDefinition -> ClassDefinition, PrimitiveType??
        FClass metaclass = (FClass)rObject.getMetaclass().getData().get("kcoreObject");
        // Get the qualified name of the runtimeObject class
        String kqname = rObject.getFactory().getMemory().getUnit().getQualifiedName(
                metaclass.getFClassDefinition());
        EClass eclass = null;
        // Find in mm_resource the eClass named "kqname"?
        // FIXME : ugly unneeded cast
        if (classifier == null)
            eclass = this.getEClassFromFQualifiedName(kqname, this.metaModelResource, unit);
        else
            eclass = (EClass)classifier;
        //System.err.println("eclass for kqname : " + eclass + "("+ kqname +")");
        if (eclass != null) // If we did not find the Eclass (it means that kqname is the name of a primitive type)
        {
            result = EcoreUtil.create(eclass);
            
        }
        return result;
    }
    
    protected EClass getEClassFromFQualifiedName(String kqname, Resource p_resource, EMFRuntimeUnit unit)
    {
        EClass result = null;
        TreeIterator it = null; 
      /*  String result = obj.getName();
	    EObject cont = obj.eContainer();
	    if (cont != null &&cont instanceof ENamedElement) {
	        result = getEQualifiedName((ENamedElement)cont) + "::" + result;
	    }*/
        //
        // If we work on an existing resource, this method is ok resource is empty!!!
        if (resource.getContents().size() > 0)
        {
            EPackage mmpkg = ((EObject)resource.getContents().get(0)).eClass().getEPackage();
            it = mmpkg.eAllContents();
        }
        else
        {
              it = p_resource.getAllContents();
        }
              
        while (it.hasNext() && result == null)
        {
            EObject obj = (EObject)it.next();
			if (obj instanceof EClass)
			{
				if (unit.getEQualifiedName((EClass)obj).equals(kqname))
				    result = (EClass)obj;
			}
        }
        return result;
    }
   
    
    /**
     * Get the value linked to the given RuntimeObject. Returns a String, Boolean,
     * or Int value according to the primitive type wrapped by this runtime object.
     * @param robject The runtime object of which we want the value
     * @return the value of the primitive type wrapped by robject
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



