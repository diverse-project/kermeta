/* $Id: Runtime2EMF.java,v 1.13 2005-08-23 18:44:20 zdrey Exp $
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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

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
        else // exception should be put in another way. it is not valid in the case user
            // saves a model that was initialy loaded. (exception should only be valid
            // when user tries to save a model created from scratch) 
        {
            //throw new KermetaRaisedException(null, null);
        }
        // Initialize the resource of the EMF model to save
        String unit_uri = p_unit.getInstances().getFactory().getMemory().getUnit().getUri();
        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
    	URI u = URI.createURI(file_path);
    	KermetaUnit.internalLog.info("URI created for model to save : "+u);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(unit_uripath)));    			
    	}
        String ext = file_path.substring(file_path.lastIndexOf(".")+1);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    r2e.resource = resource_set.createResource(u);
	    // Update all the instance of the EMF Model
	    r2e.updateEMFModel(r2e.resource);
	    
	    try {
	        /* For tests purpose : java.io.OutputStream out = new BufferedOutputStream(System.out);
	        resource.save(out, null); */
	        r2e.resource.save(null);
		} catch (IOException e) {
		    Throwable t = e.getCause();
		    if (t instanceof Resource.IOWrappedException)
		    {
		        Resource.IOWrappedException we = (Resource.IOWrappedException)t;
		        we.getMessage();
		    }
		    e.printStackTrace();
		}
    }
    
    /** The root objects (with no container) are stored in this list */
    protected ArrayList root_map;
    
    /**
     * Update the EMFModel from the attribute RuntimeUnit <code>unit</code>.
     * This is the main method called for the EMF model update.
     * @param resource
     */
    public void updateEMFModel(Resource resource)
    {
        ArrayList root_containers = new ArrayList();
        //  Get the instances RuntimeObject
        ArrayList instances = Collection.getArrayList(unit.getInstances());
        ArrayList eobjects = new ArrayList();
        // instances should only contain the root elements
        Iterator it = instances.iterator();
        // Get each instance and translate it in EMF (EObject)
        root_map = new ArrayList();
        while(it.hasNext()) {
            RuntimeObject ro = (RuntimeObject)it.next();
            // Find or create the EMF Object attached to our RuntimeObject
            // 2 cases can occur :
            //  - the object already exists since it is loaded from an existing XMI resource
            //  - it does not exist, so we create one
            EObject o = (EObject)getOrCreateObjectFromRuntimeObject(ro, null);
            if (o.eContainer() == null) 
                root_map.add(ro);
            else { // TODO : an object with a container in the instances att. should be forbidden 
                }
            findEMFObjectsForRuntimeObjectsForRoot(ro, null);
        }
        
        // now we have the complete list of runtime objects (findEMFObj.. fills updatedRuntimeObjects)
        // We can update the properties of each of those runtime objects
        it = updatedRuntimeObjects.iterator();
        while(it.hasNext())
        {
            RuntimeObject ro = (RuntimeObject)it.next();
            simpleUpdatePropertyForObject(ro);
        }
        
        // Add the root elements to the XMI resource
       it = root_map.iterator();
        while (it.hasNext())
        {
            RuntimeObject ro = (RuntimeObject)it.next();
            // Object o = updateEMFObjectFromRuntimeObject(ro);
            // And now update the contained objects as well:)
            //System.err.println("ROOOTS : " + ro.getData().get("emfObject"));
            resource.getContents().add(ro.getData().get("emfObject"));
        }
    }
    
    /**
     * Get or create the EMFObjects recursively, from the root element.
     * We don't yet update completely each object. A second pass is done for this
     * purpose in the method simpleUpdateProperty
     */
    protected void findEMFObjectsForRuntimeObjectsForRoot(RuntimeObject rObject, EClassifier classifier)
    {
        // already created normally, in the first recursive pass
        EObject result = (EObject)this.getOrCreateObjectFromRuntimeObject(rObject, classifier);
        
        // Add the runtime object parsed
        updatedRuntimeObjects.add(rObject);
        
        // Now, process the properties of this object
        Iterator it = rObject.getProperties().keySet().iterator();
        while (it.hasNext())
        {   
            String prop_name = (String)it.next();
            // Get the RuntimeObject repr. of property
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            // Now, process it : 
            // - if property embedds an EObject : add it to the objects and process the props of the associated object
            // - if it embedds an EList (a prop. with upperBound>1) : for each one, do the same as above case
            findEMFObjectForProperty(result, prop_name, property);
        }
    }

    // Put in this list all the RuntimeObject that were already updated
    protected ArrayList updatedRuntimeObjects;
    protected EMFRuntimeUnit unit;
    protected Resource metaModelResource;
    protected Resource resource;
    
    protected void findEMFObjectForProperty(EObject eObject, String prop_name, RuntimeObject property)
    {
        // If property is an EList 
        if ( property.getData().get("CollectionArrayList") != null )
        {
            //System.err.println("   feature EList -> " + feature.getEType() + ((EList)property_eObject).size());
            Iterator p_it = ((ArrayList)property.getData().get("CollectionArrayList")).iterator();
            // For each feature of the collection of features
            while (p_it.hasNext())
            {   
                RuntimeObject r_o =(RuntimeObject)p_it.next(); 
                if (!updatedRuntimeObjects.contains(r_o))
                {   
                    findEMFObjectsForRuntimeObjectsForRoot(r_o, getEStructuralFeatureByName(eObject, prop_name).getEType());
                }
            }
        }
        // We do not add primitive typed properties, since they do not need a special update.
        else if (!updatedRuntimeObjects.contains(property) && getPrimitiveTypeValueFromRuntimeObject(property)==null)
        {
            updatedRuntimeObjects.add(property);
        }
    }
    
    protected void simpleUpdatePropertyForObject(RuntimeObject rObject)
    {
        EObject eObject = (EObject)rObject.getData().get("emfObject");
        // Get all the Structural features of requested eObject
        Iterator it = rObject.getProperties().keySet().iterator();
        while (it.hasNext())
        {
            String prop_name = (String)it.next();
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            // The feature corresponding to the name of the property
            EStructuralFeature feature = getEStructuralFeatureByName(eObject, prop_name);
            eObject.eUnset(feature);
            // Now get the property eObject (it should not be created in fact!)
            /*System.out.println("Property : " + prop_name + "; eObject : " + eObject.eClass().getName() + "; " +
                    "feautre : " + feature);*/
            // If feature is null, it means that it is not persistent ! 
            if (feature != null)
            {
                Object property_eObject = getOrCreatePropertyFromRuntimeObject(property, feature.getEType());
                
                // If it is a collection of Objects
                if (property_eObject instanceof EList)
                {
                    // System.err.println("   feature EList -> " + feature.getEType() + ((EList)property_eObject).size() + "> "+prop_name);
                    Iterator p_it = ((ArrayList)property.getData().get("CollectionArrayList")).iterator();
                    // For each feature of the collection of features
                    while (p_it.hasNext())
                    {
                        RuntimeObject r_o =(RuntimeObject)p_it.next();
                        Object p_o = getOrCreateObjectFromRuntimeObject(r_o, feature.getEType());
                        if (p_o!=null)
                        {	
                            ((EList)eObject.eGet(feature)).add((EObject)p_o);
                            // Update the property for next objects to be updated that need its value
                            r_o.getData().put("emfObject", p_o);
                        }
                    }
                }
                // If property is a simple EObject 
                else if ( property_eObject instanceof EObject)
                {
                    //System.err.println("   feature type -> " + feature.getEType() +
                    //        "\n" +     "   eobject type -> " + ((EObject)property_eObject).eClass());
                    eObject.eSet(feature, property_eObject);
                }
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
        // emfObject exists if and only if the rObject was not created by the kerdeveloper
        if (rObject.getData().containsKey("emfObject"))
        {   
            result = rObject.getData().get("emfObject");
        } // WrappedException if we do not test thiss
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
        // emfObject is set if and only if the instance was not "manually" create by the kerdeveloper
        if (rProperty.getData().containsKey("emfObject")) {
            result = rProperty.getData().get("emfObject");}
        // a EList?
        else if (isaCollection(rProperty)) {
            result = createEListFromRuntimeObject(rProperty);}
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
        java.util.Collection arraylist = Collection.getArrayList(property);
        return new BasicEList(arraylist);
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
        if (classifier == null)
        {
            eclass = this.getEClassFromFQualifiedName(kqname, this.metaModelResource, unit);
        }
        else
        {
            eclass = (EClass)classifier;
            //System.err.println("eclass for kqname : " + eclass + "("+ kqname +")");
        }
        if (eclass != null) // If we did not find the Eclass (it means that kqname is the name of a primitive type)
        {
            result = EcoreUtil.create(eclass);
            rObject.getData().put("emfObject", result);
        }
        return result;
    }
    
    /**
     * Get the EClass corresponding to the kermeta qualified name 
     * @param kqname
     * @param p_resource
     * @param unit
     * @return
     */
    protected EClass getEClassFromFQualifiedName(String kqname, Resource p_resource, EMFRuntimeUnit unit)
    {
        EClass result = null;
        TreeIterator it = null; 
        // If we work on an existing resource (not a new one), this method is ok resource is empty!!!
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
     * Get the value linked to the given RuntimeObject, provided this object wraps
     * a primitive type. Returns a String, Boolean,
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
     * Returns true if the given RuntimeObject is a collection (Collection, ReflectiveCollection,
     * ReflectiveSequence), false otherwise.
     * We use this method since Collections that are void do not have a "CollectionArrayList"
     * entry in their associated data hashtable (see RuntimeObject doc), so we can't test with this
     * @param robject the object to test
     * @return true if robject type is Collection, false otherwise
     */
    public boolean isaCollection(RuntimeObject robject)
    {	
        boolean b = false;
        KermetaUnit kunit = robject.getFactory().getMemory().getUnit(); 
        FClassDefinition coll_cd = (FClassDefinition)kunit.getTypeDefinitionByName("kermeta::standard::Collection");  
        FClass c = (FClass)robject.getMetaclass().getData().get("kcoreObject");
        if (kunit.isSuperClass(coll_cd, c.getFClassDefinition())) b = true;
        return b;
    }
    
    /**
     * Get the EStructuralFeature in given <code>eObject</code> from the feature <code>p_name</code>
     * given in parameters
     * @param eObject the eObject of which we get a feature
     * @param p_name the name of the wanted feature
     * @return an EStructuralFeature corresponding to eObject.p_name
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



