/* $Id: Runtime2EMF.java,v 1.29 2006-06-22 18:01:01 zdrey Exp $
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

    // Put in this list all the RuntimeObject that were already updated
    protected ArrayList<RuntimeObject> updatedRuntimeObjects;
    protected EMFRuntimeUnit unit;
    protected Resource resource;
	
	/**
	 * The constructor, that initialize <code>unit</code> and <code>updatedRuntimeObjects</code>
	 * attributes.
	 * @param unit the EMFRuntimeUnit that hosts the contents of the model to save 
	 */
    public Runtime2EMF(EMFRuntimeUnit p_unit, Resource p_resource) {
        this.updatedRuntimeObjects = new ArrayList();
        this.unit = p_unit;
        this.resource = p_resource;
    }
    
    /**
     * Update the EMFModel from the attribute RuntimeUnit <code>unit</code>.
     * This is the main method called for the EMF model update.
     * @param resource
     */
    public void updateEMFModel()
    {   
        // Get the RuntimeObjects from the return result of external call of save() method (in Kermeta side)
    	// Important : *On save process*, unit.getContentMap contains the "instances" collection (which
    	// equals contentMap entry "rootContents".
        ArrayList<RuntimeObject> instances = Collection.getArrayList(unit.getContentMap());
        // Get each instance and convert it in an EObject
        // (Instances only contain the root elements of the resource to save)
        for (RuntimeObject ro : instances )
        {   findEObjectForRuntimeObject(ro); }
        // Now that we have the complete list of runtime objects, we can update 
        // the properties of each of those runtime objects. The mapping between 
        // RuntimeObject and EObject to update is done through the
        // entry { "emfObject" : EObject } in RuntimeObject.data hashtable.
        for (RuntimeObject ro : updatedRuntimeObjects)
        {   setEObjectPropertiesFromRuntimeObject(ro); }
        
        // Add the root elements to the XMI resource
        for (RuntimeObject ro : instances)
        {   resource.getContents().add(ro.getData().get("emfObject")); }
    }
    
    /**
     * Get or create the EMFObjects recursively, from the root element ("root element" is
     * by opposition to property element).
     * We don't yet update completely each object. A second pass is done for this
     * purpose in the method simpleUpdateProperty
     */
    protected void findEObjectForRuntimeObject(RuntimeObject rObject)
    {
        // Already created normally, in the first recursive pass
    	EObject result = (EObject)this.getOrCreateObjectFromRuntimeObject(rObject);
        
        // Add the runtime object parsed
        updatedRuntimeObjects.add(rObject);
        
        // Now, process the properties of this object
        for (Object next : rObject.getProperties().keySet())
        {
            String prop_name = (String)next;
            // Get the RuntimeObject value of property given by prop_name
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            // Create the EObject of this property's value 
            // - if property embedds an EObject : add it to the objects and process the props of the associated object
            // - if it embedds an EList (a prop. with upperBound>1) : for each one, do the same as above case
            findEObjectForProperty(result, prop_name, property);
        }
    }
    
    protected void findEObjectForProperty(EObject eObject, String prop_name, RuntimeObject property)
    {
        // If property is an EList 
        if (property.getData().containsKey("CollectionArrayList") && property.getData().get("CollectionArrayList") != null)
        {   // For each feature of the collection of features
            for (Object next : ((ArrayList)property.getData().get("CollectionArrayList")))
            {   
                RuntimeObject r_o =(RuntimeObject)next; 
                if (!updatedRuntimeObjects.contains(r_o))
                {   findEObjectForRuntimeObject(r_o); }
            }
        }
        // If property is not an EList, perhaps it is found in updatedRuntimeObjects?
        else if (!updatedRuntimeObjects.contains(property) )
        {
    		// If property's type is a primitive type (String, Integer), we don't have to 
        	// "parse" it contents, obviously, so, nor to add it in updatedRuntimeObject
        	if(getPrimitiveTypeValueFromRuntimeObject(property)==null)
        		findEObjectForRuntimeObject(property);
        }
    }
    
    /**
     * Set the values previously retrieved by findEMFObject... to their owning eobjects. 
     * @param rObject
     */
    protected void setEObjectPropertiesFromRuntimeObject(RuntimeObject rObject)
    {
        EObject eObject = (EObject)rObject.getData().get("emfObject");
        // Get all the Structural features of requested eObject
        for (Object next : rObject.getProperties().keySet())
        {
            String prop_name = (String)next;
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            // The feature corresponding to the name of the property
            EStructuralFeature feature = getEStructuralFeatureByName(eObject, prop_name);
            // Now get the property eObject (it should not be created in fact!)
            // If feature is null, it means that it is a transient feature, that 
            // only exists in kermeta metamodel representation 
            if (feature != null)
            {
            	if(!feature.isChangeable())
            	{
            		internalLog.warn("feature " + prop_name + " is not changeable: ignored(may be the other end has been correctly set). The feature was applied to "+ eObject  + " "+ rObject);
            	}
            	else
            	{	// Unset the old value of feature
	                eObject.eUnset(feature);
	                Object property_eObject = getOrCreatePropertyFromRuntimeObject(property);
	                
	                // If the feature is a collection of Objects
	                if (property_eObject instanceof EList)
	                {
	                    // For each feature of the collection of features
	                    for (Object rcoll : ((ArrayList)property.getData().get("CollectionArrayList")))
	                    {
	                        RuntimeObject r_o =(RuntimeObject)rcoll;
	                        // Get the type of the feature
	                        Object p_o = getOrCreateObjectFromRuntimeObject(r_o);
	                        internalLog.debug("      feature: " + feature.getName() + " eObject: "+ eObject + " p_o: " + p_o);
	                        if (p_o!=null) ((EList)eObject.eGet(feature)).add((EObject)p_o);
	                    }
	                }
	                // If property is an EObject 
	                else if ( property_eObject instanceof EObject)
	                {
	                    eObject.eSet(feature, property_eObject);
	                }
	                // If property type is a datatype, than its value is not EObject, but String,Integer,or alike.
	                else if (feature.getEType() instanceof EDataType)
	                {
	                    property_eObject = getPrimitiveTypeValueFromRuntimeObject(property);
	                    eObject.eSet(feature, property_eObject);
	                }
	                else
	                {
	                    unit.throwKermetaRaisedExceptionOnSave(
	                    		"NotImplementedError : This type is not recognized :" + feature.getEType() +
	                    		";\n - Please mail kermeta-users list :}", null);
	                }
            	}
            }
        }
    }
  
    
    /**
     * Get the EObject associated with the given runtimeObject.
     * This only works for objects that are not Collections (fixme?).
     * 2 cases can occur :
     *  - the object already exists since it is loaded from an existing XMI resource
     *  - it does not exist, so we create one 
     * @param rObject
     * @param classifier
     * @return
     */
    public Object getOrCreateObjectFromRuntimeObject(RuntimeObject rObject)
    {
        Object result = null;
        // try to get emfObject : it exists if and only if the rObject was not created by the kerdeveloper
        if (rObject.getData().containsKey("emfObject"))
        {   
            internalLog.debug("get (getOrCreateObjectFromRuntimeObject) for RuntimeObject: " + getRONameProp(rObject) + " "+ rObject  + rObject.getProperties());
            result = rObject.getData().get("emfObject");
        }
        else // createEObjectFromRuntimeObject also updates the emfObject entry
            result = createEObjectFromRuntimeObject(rObject);
        return result;
    }
    /**
     * A derivated version of getOrCreateObjectFromRuntimeObject adapted to the
     * creation of property (feature). Indeed, a property can be either an EObject,
     * an EList, or an instance of EDataType
     */
    protected Object getOrCreatePropertyFromRuntimeObject(RuntimeObject rProperty)
    {
        Object result = null;
        // is property a EList (with upper bound > 1)?
        if (isaCollection(rProperty)) {
            result = createEListFromRuntimeObject(rProperty);}
        // a EDataType?
        else if (getPrimitiveTypeValueFromRuntimeObject(rProperty) !=null)
            result = getPrimitiveTypeValueFromRuntimeObject(rProperty);
        // by default, an EObject
        else
            result = getOrCreateObjectFromRuntimeObject(rProperty);
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
     * Create an eObject corresponding to the given RuntimeObject. Update the emfObject
     * entry in the RuntimeObject
     * @param rObject the runtimeObject that we want to serialize
     * @return the eObject corresponding to this rObject
     */
    protected EObject createEObjectFromRuntimeObject(RuntimeObject rObject)
    {
    	internalLog.debug("createEObjectFromRuntimeObject for RuntimeObject: " + 
    			getRONameProp(rObject) + " "+ rObject  + rObject.getProperties());
        EObject result =  null;
        // Get the meta class of the instance hosted by given runtime object
        fr.irisa.triskell.kermeta.language.structure.Class metaclass = 
        	(fr.irisa.triskell.kermeta.language.structure.Class)rObject.getMetaclass().getData().get("kcoreObject");
        // Get the qualified name of this meta class
        String kqname = rObject.getFactory().getMemory().getUnit().getQualifiedName(
                metaclass.getTypeDefinition());
        
        // Equiv. to classifier.eResource if the eclassifier corresponding to the meta class of the runtime object were provided.. 
        Resource metamodel_resource = this.unit.getMetaModelResource();
        EClass eclass = this.getEClassFromFQualifiedName(kqname, metamodel_resource);
        
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
        if (!feature_name.equals(p_name)) { feature = null; }
        return feature;
    }
    
    /**
     * tool function
     * @return the name property of the runtime object if available
     */
    public static String getRONameProp(RuntimeObject rObject){
    	RuntimeObject roName = (RuntimeObject)rObject.getProperties().get("name");
        return  roName == null ? "" : (String)roName.getData().get("StringValue");
    }

	/**
	 * @return Returns the resource.
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource The resource to set.
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}
}