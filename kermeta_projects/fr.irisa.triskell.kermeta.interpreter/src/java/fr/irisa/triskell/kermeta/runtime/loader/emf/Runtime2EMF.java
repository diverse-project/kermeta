/* $Id: Runtime2EMF.java,v 1.25 2006-04-04 12:21:19 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : Runtime2EMF.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 20, 2005
 * Authors       : zdrey, dvojtise
 * NOTE : how to use resources :
 * 		The objects that you serialize must be added to the resource in a specific order
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class converts models that were created by the user through the 
 * persistence library into EMF models, saved in XMI format.
 */
public class Runtime2EMF {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.Runtime2EMF");
	
	/**
	 * The constructor, that initialize <code>unit</code> and <code>updatedRuntimeObjects</code>
	 * attributes.
	 * @param unit the EMFRuntimeUnit that hosts the contents of the model to save 
	 */
    public Runtime2EMF(EMFRuntimeUnit unit) {
        this.updatedRuntimeObjects = new ArrayList();
        this.unit = unit;
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
        // Get the instances RuntimeObject
    	// On save process, unit.getContentMap actually contains the "instances" collection (which
    	// equals contentMap entry "rootContents". There is an operation
    	// naming problem, or an homogeinisation problem in the runtime objects (i.e the collection of object to save)
    	// access!
        ArrayList instances = Collection.getArrayList(unit.getContentMap());
        // instances should only contain the root elements
        Iterator it = instances.iterator();
        internalLog.debug("Updating EMF Objects  (number of instances : "+ instances.size()+")");
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
        
        internalLog.debug("Updating EMF properties");
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
            resource.getContents().add(ro.getData().get("emfObject"));
        }
    }
    
    /**
     * Get or create the EMFObjects recursively, from the root element ("root element" is
     * by opposition to property element).
     * We don't yet update completely each object. A second pass is done for this
     * purpose in the method simpleUpdateProperty
     */
    protected void findEMFObjectsForRuntimeObjectsForRoot(RuntimeObject rObject, EClassifier classifier)
    {
        // Already created normally, in the first recursive pass
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
    protected Resource resource;
    
    protected void findEMFObjectForProperty(EObject eObject, String prop_name, RuntimeObject property)
    {
    	//internalLog.debug("      findEMFObjectForProperty: " + prop_name + " "+ property  + eObject);
		
        // If property is an EList 
        if (property.getData().containsKey("CollectionArrayList") && property.getData().get("CollectionArrayList") != null)
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
                else internalLog.debug("      findEMFObjectForProperty skipped RO: " + getRONameProp(r_o) + " "+ r_o  + r_o.getProperties());
               
            }
        }
        
        else if (!updatedRuntimeObjects.contains(property) )
        {	// We do not add primitive typed properties, since they do not need a special update.
        	if(getPrimitiveTypeValueFromRuntimeObject(property)!=null){
        		internalLog.debug("      findEMFObjectForProperty ignoring primitive property: " + prop_name + " "+ property  + eObject);
        		//updatedRuntimeObjects.add(property);
        	}
        	else {
        		internalLog.debug("      findEMFObjectForProperty: " + prop_name + " "+ property  + eObject);
        		// the property variable is the RuntimeObject we are looking for
        		findEMFObjectsForRuntimeObjectsForRoot(property, 
        				getEStructuralFeatureByName(eObject, prop_name).getEType());
        	}        	
        }
        else internalLog.debug("      findEMFObjectForProperty skipped RO: " + prop_name + " "+ property  + eObject);
        
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
            // Now get the property eObject (it should not be created in fact!)
            /*System.out.println("Property : " + prop_name + "; eObject : " + eObject.eClass().getName() + "; " +
                    "feautre : " + feature);*/
            // If feature is null, it means that it is not persistent ! 
            if (feature != null)
            {
            	if(!feature.isChangeable())
            	{
            		internalLog.warn("feature " + prop_name + " is not changeable: ignored(may be the other end has been correctly set). The feature was applied to "+ eObject  + " "+ rObject);
            	}
            	else {
            		
	                eObject.eUnset(feature);
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
	                        // Get the type of the feature
	                        Object p_o = getOrCreateObjectFromRuntimeObject(r_o, feature.getEType());
	                        if (p_o!=null)
	                        {	
	                        	internalLog.debug("      feature: " + feature.getName() + " eObject: "+ eObject + " p_o: " + p_o);
	                        	
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
    }
  
    
    /**
     * Get the EObject associated with the given runtimeObject.
     * This only works for objects that are not Collections (fixme?). 
     * @param rObject
     * @param classifier
     * @return
     */
    public Object getOrCreateObjectFromRuntimeObject(RuntimeObject rObject, EClassifier classifier)
    {
        Object result = null;
        // emfObject exists if and only if the rObject was not created by the kerdeveloper
        if (rObject.getData().containsKey("emfObject"))
        {   
        	
            internalLog.debug("get (getOrCreateObjectFromRuntimeObject) for RuntimeObject: " + getRONameProp(rObject) + " "+ rObject  + rObject.getProperties());
            
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
     * @param rObject the runtimeObject that we want to serialize
     * @param classifier The type of the feature "in" which the rObject was 
     * contained. It can be null. If null, then search the Eclassifier 
     * equivalent to the rObject metaclass (through the metaclass qualified name).
     * @return the eObject corresponding to this rObject
     */
    protected EObject createEObjectFromRuntimeObject(RuntimeObject rObject, EClassifier classifier)
    {
        EObject result =  null;
        // TypeDefinition -> ClassDefinition, PrimitiveType??
        fr.irisa.triskell.kermeta.language.structure.Class metaclass = (fr.irisa.triskell.kermeta.language.structure.Class)rObject.getMetaclass().getData().get("kcoreObject");
        // Get the qualified name of the runtimeObject class
        String kqname = rObject.getFactory().getMemory().getUnit().getQualifiedName(
                metaclass.getTypeDefinition());
        
        internalLog.debug("createEObjectFromRuntimeObject for RuntimeObject: " + getRONameProp(rObject) + " "+ rObject  + rObject.getProperties());
        EClass eclass = null;
        if (classifier == null)
        {
            eclass = this.getEClassFromFQualifiedName(kqname, this.unit.getMetaModelResource());
        }
        else
        {
        	if(((EClass)classifier).isAbstract() || ((EClass)classifier).isInterface()){
        		internalLog.debug("   The type for the new EObject is not concrete !");     
        		
        		eclass = this.getEClassFromFQualifiedName(kqname, classifier.eResource());
        		//eclass = this.getEClassFromFQualifiedName(kqname, this.metaModelResource, unit);
        	}
        	else
        	{
        		//eclass = (EClass)classifier; // in fact this was wrong! the given classifier is the
        		// static type of the feature to which given object "belongs" (instance of this type or one of
        		// its subtypes), not the real type of the object.
        		eclass = this.getEClassFromFQualifiedName(kqname, classifier.eResource());
        	}
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
     * @param kqname the name of which we look for the corresponding in Ecore meta-model
     * @param p_resource the resource of the meta-model
     * @param unit the RuntimeUnit that contain the correspondance table between kermeta object names
     * and emf serialised object names.
     * @return the EClass in the ecore meta-model given by the user for serialization of its model
     */
    protected EClass getEClassFromFQualifiedName(String kqname, Resource p_resource)
    {
        EClass result = null;
        TreeIterator it = null; 
        // If a resource uri for the meta-model was not provided ?
        if (resource.getContents().size() > 0)
        {
            EPackage mmpkg = ((EObject)resource.getContents().get(0)).eClass().getEPackage();
            it = mmpkg.eAllContents();
        }
        // Otherwise  
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
        String[] s_primitive_types = new String[] {"StringValue", "BooleanValue", "NumericValue", "CharacterValue" };
    	for (int i=0; i<s_primitive_types.length; i++)
    	    if (robject.getData().containsKey(s_primitive_types[i]))
    	        return robject.getData().get(s_primitive_types[i]);
    	return null;
    }
    
    /**
     * Get all the subtypes for the type of the given feature.
     * @param feature the feature of the meta-model of the model that we want to serialize.
     * @param mm_resource the resource of the meta-model that we will parse to get the allowed
     * subtypes for the given feature.
     * @return the list of types inheriting the type of the given feature
     * @deprecated 
     */
    protected List getAllSubtypesForType(Resource mm_resource, EClassifier roottype)
    {
    	ArrayList<EClassifier> result = new ArrayList<EClassifier>();
    	TreeIterator it = null; 
        // If we work on an existing resource (not a new one), this method is ok resource is empty!!!
        it = mm_resource.getAllContents();
        while (it.hasNext())
        {
            EObject obj = (EObject)it.next();
			if (obj instanceof EClass)
				if (((EClass)obj).getEAllSuperTypes().contains(roottype))
				    result.add((EClass)obj);
        }
        return result;
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
        ClassDefinition coll_cd = (ClassDefinition)kunit.getTypeDefinitionByName("kermeta::standard::Collection");  
        fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)robject.getMetaclass().getData().get("kcoreObject");
        if (kunit.isSuperClass(coll_cd, (ClassDefinition) c.getTypeDefinition())) b = true;
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
    
    /**
     * tool function
     * @return the name property of the runtime object if available
     */
    public static String getRONameProp(RuntimeObject rObject){
    	RuntimeObject roName = (RuntimeObject)rObject.getProperties().get("name");
        return  roName == null ? "" : (String)roName.getData().get("StringValue");
    }
}



