/* $Id: Runtime2EMF.java,v 1.34 2006-07-19 11:21:09 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : Runtime2EMF.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 20, 2005
 * Authors       : zdrey, dvojtise
 * NOTES : 
 *   - how to use resources :
 * 		To serialize the model, add all the element that have no eContainer to the resource to save.
 *   - Note: there is an r2e.emfObject entry associated to RuntimeObjects, available through
 *   the hashtable RuntimeObject.getData. It is used for eObject retrieval during the save process.
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2EcorePass1;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class converts models that were created by the user through the 
 * persistence library into EMF models, saved in XMI format.
 */
public class Runtime2EMF {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.Runtime2EMF");
	final static public String ECORE_NSURI = "http://www.eclipse.org/emf/2002/Ecore"; 

    // Put in this list all the RuntimeObject that were already updated
    protected ArrayList<RuntimeObject> updatedRuntimeObjects;
    protected EMFRuntimeUnit unit;
    protected Resource resource;
    // { name_of_enumeration : an EEnumeration }
    protected Hashtable<String, EEnum> eenum_map; 
    
    /**
     * { qualified name of ecore type : qualified name of kermeta type }
     */
    protected static Hashtable<String, String> kermeta_ecore_map;
    public static Hashtable<String, String> getKermetaEcoreMap() {
    	if (kermeta_ecore_map == null)
    	{
    		kermeta_ecore_map = new Hashtable<String, String>();
    		kermeta_ecore_map.put("kermeta::language::structure::Enumeration", "ecore::EEnum");
    		kermeta_ecore_map.put("kermeta::language::structure::EnumerationLiteral", "ecore::EEnumLiteral");
    		// Map for the properties of EEnumLiteral for EnumerationLiteral
    		kermeta_ecore_map.put("enumeration", "eEnum");
    		kermeta_ecore_map.put("name", "name");
    		kermeta_ecore_map.put("tag", "eAnnotations");
    		kermeta_ecore_map.put("ownedLiteral", "eLiterals");
    	}
    	return kermeta_ecore_map;
    }
	
	/**
	 * The constructor, that initialize <code>unit</code> and <code>updatedRuntimeObjects</code>
	 * attributes.
	 * @param unit the EMFRuntimeUnit that hosts the contents of the model to save 
	 * @param p_resource the resource that hosts the model to save. It is actually empty...
	 */
    public Runtime2EMF(EMFRuntimeUnit p_unit, Resource p_resource) {
        this.updatedRuntimeObjects = new ArrayList<RuntimeObject>();
        this.unit = p_unit;
        this.resource = p_resource;
        this.eenum_map = new Hashtable<String, EEnum>();
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
        {	findEObjectForRuntimeObject(ro); }
        // Now that we have the complete list of runtime objects, we can update 
        // the properties of each of those runtime objects. The mapping between 
        // RuntimeObject and EObject to update is done through the
        // entry { "r2e.emfObject" : EObject } in RuntimeObject.data hashtable.
        for (RuntimeObject ro : updatedRuntimeObjects)
        {	setEObjectPropertiesFromRuntimeObject(ro); }
        
        // Add the root elements to the XMI resource
        // Note: emfObject2 entry is only used for eObject retrieval during the save process!
        for (RuntimeObject o : instances) 
        { resource.getContents().add(o.getData().get("r2e.emfObject")); }
    }
    
    /**
     * Get or create the EMFObjects recursively, from the root element ("root element" is
     * by opposition to property element).
     * Method for the 1st pass of conversion from RuntimeObjects to EObjects :
     * we don't yet update completely each object. A second pass is done for this
     * purpose in the method simpleUpdateProperty
     */
    protected EObject findEObjectForRuntimeObject(RuntimeObject rObject)
    {
    	
        // Create the EObject for given runtime object
    	EObject result = (EObject)this.getOrCreateEObjectFromRuntimeObject(rObject);
        
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
        return result;
    }
    
    /**
     * Get or create eobject for properties recursively.
     * Method for the 1st pass of conversion from RuntimeObjects to EObjects.
     * @param eObject
     * @param prop_name
     * @param property
     */
    protected void findEObjectForProperty(EObject eObject, String prop_name, RuntimeObject property)
    {
        // If property is an EList 
        if (property.getData().containsKey("CollectionArrayList") && property.getData().get("CollectionArrayList") != null)
        {   // For each feature of the collection of features
            for (Object next : ((ArrayList)property.getData().get("CollectionArrayList")))
            {   
                RuntimeObject r_o =(RuntimeObject)next; 
                if (!updatedRuntimeObjects.contains(r_o))
                {
                	if(getPrimitiveTypeValueFromRuntimeObject(r_o)==null
                		|| isanEnumerationLiteral(r_o)==false)
                		findEObjectForRuntimeObject(r_o); 
                }
            }
        }
        // If property is not an EList, perhaps it is found in updatedRuntimeObjects?
        else if (!updatedRuntimeObjects.contains(property) )
        {
    		// If property's type is a primitive type (String, Integer), we don't have to 
        	// "parse" it contents, obviously, so, nor to add it in updatedRuntimeObject
        	if(getPrimitiveTypeValueFromRuntimeObject(property)==null
        			|| isanEnumerationLiteral(property)==false)
        		findEObjectForRuntimeObject(property);
        }
    }
    
    /**
     * Set the values previously retrieved by findEMFObject... to their owning eobjects. 
     * @param rObject
     */
    protected void setEObjectPropertiesFromRuntimeObject(RuntimeObject rObject)
    {
    	// If the object is an instance of eClass :
        EObject eObject = (EObject)rObject.getData().get("r2e.emfObject");
        // Get all the Structural features of requested eObject
        for (Object next : rObject.getProperties().keySet())
        {
            String prop_name = (String)next;
            String eprop_name = prop_name;
            // Special handling for Enumeration -> convert Enumeration from kermeta into EEnum from Ecore
            // if rObject is _the_ EnumerationLiteral type handled here:
            
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            if (getKermetaEcoreMap().containsValue(unit.getEQualifiedName(eObject.eClass())))
            	eprop_name = getKermetaEcoreMap().get(prop_name);
            
            // The feature corresponding to the name of the property
            EStructuralFeature feature = getEStructuralFeatureByName(eObject, eprop_name);
            // Now get the property eObject (it should not be created in fact!)
            // If feature is null, it means that it is a transient feature, that 
            // only exists in kermeta metamodel representation 
            if (feature != null)
            {
            	if(!feature.isChangeable())
            	{
            		internalLog.warn("feature " + prop_name + " is not changeable: ignored(maybe the other end has been correctly set). The feature was applied to "+ eObject  + " "+ rObject);
            	}
            	else
            	{	// Unset the old value of feature
            		eObject.eUnset(feature);
	                Object property_eObject = getOrCreatePropertyFromRuntimeObject(property, feature);
	                // If the feature is a collection of Objects
	                if (property_eObject instanceof EList)
	                {
	                    // For each feature of the collection of features
	                    for (Object rcoll : ((ArrayList)property.getData().get("CollectionArrayList")))
	                    {
	                        Object p_o = getOrCreatePropertyFromRuntimeObject((RuntimeObject)rcoll, feature);
	                        internalLog.debug("      feature: " + feature.getName() + ";\n      eObject: "+ eObject + "; p_o: " + p_o);
	                        if (p_o!=null)
	                        {
	                        	((EList)eObject.eGet(feature)).add(p_o);
	                        }
	                    }
	                }
	                else // EObject, EClass, EDataType
	                {
	                	eObject.eSet(feature, property_eObject);
	                }
	                /*// TODO : before uncommenting this, we have to check if "null" is a legal value for property_eObject
	                if (property_eObject==null)
	                {
	                    unit.throwKermetaRaisedExceptionOnSave(
	                    		"NotImplementedError : This type is not recognized :" + feature.getEType() +
	                    		";\n - perhaps a require is missing (like Ecore.ecore?)" +
	                    		";\n - Please mail kermeta-users list :}", null);
	                }*/
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
    public Object getOrCreateEObjectFromRuntimeObject(RuntimeObject rObject)
    {
        Object result = null;
        // try to get emfObject : it exists if and only if the rObject was not created by the kerdeveloper
        if (rObject.getData().containsKey("r2e.emfObject"))
            result = rObject.getData().get("r2e.emfObject");
        else // createEObjectFromRuntimeObject also updates the emfObject entry
        	result = createEObjectFromRuntimeObject(rObject);
        return result;
    }

    /**
     * A derivated version of getOrCreateObjectFromRuntimeObject adapted to the
     * creation of property (feature). Indeed, a property can be either an EObject,
     * an EList, or an instance of EDataType
     */
    protected Object getOrCreatePropertyFromRuntimeObject(RuntimeObject rProperty, EStructuralFeature feature)
    {
        Object result = null;
        // is property a EList (with upper bound > 1)?
        if (isaCollection(rProperty)) {
            result = createEListFromRuntimeObject(rProperty);}
        // a EDataType?
        else if (getPrimitiveTypeValueFromRuntimeObject(rProperty) !=null)
            result = getPrimitiveTypeValueFromRuntimeObject(rProperty);
        else if (isanEnumerationLiteral(rProperty) == true)
        	result = createEEnumLiteralFromRuntimeObjectWithResource(rProperty, feature.getEType().eResource());
        // by default, an EObject instance of an EClass
        else if (feature.getEType() instanceof EClass)
        {	// Important note: once the objects are created (using the metamodel given by the user in kermeta side)
        	// we have to use the metamodel hosted by the resource (eobject.eResource()) 
        	// implicitely loaded by EMF instead of our own resource (unit.getMetamodelResource)
        	// please do not modify this (it is *intentional* now :P).
       		result = createEObjectFromRuntimeObjectWithResource(rProperty, feature.getEType().eResource());
        }
        // - If it is an EDatatype that is not a "PrimitiveType" (see getPrimitiveTypeValue)?
        // - Example of case handled here : (see 003_testEnum.kmt in fr.irisa.triskell.kermeta.tests)
        //   rProperty : [ecore::EEnumLiteral : 841] into an EMF type.
        //   feature.getEType() == org.eclipse.emf.ecore.impl.EDataTypeImpl@7af3e0
        //          (name: EEnumerator)
        // 			(instanceClassName: org.eclipse.emf.common.util.Enumerator)
        //          (serializable: false))
        else if (feature.getEType() instanceof EDataType)
        {
        	result = rProperty.getData().get("r2e.emfObject");
        }
        else
        {
        	String msg = "could not convert : " + rProperty + " into an EMF type. (classifier : " + feature.getEType() + ")";
        	// unit.getKermetaUnit().messages.addWarning(msg, null);
        	unit.throwKermetaRaisedExceptionOnSave(msg , null);
        }
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
     * entry in the RuntimeObject. The object is created using the metamodel given by the user
     * when he calls <code>repository.createResource("<model_url>", "<metamodel_url>")</code>
     * @param rObject the runtimeObject that we want to serialize
     * @return the eObject corresponding to this rObject
     */
    protected EObject createEObjectFromRuntimeObject(RuntimeObject rObject)
    {
    	return createEObjectFromRuntimeObjectWithResource(rObject, unit.getMetaModelResource());
    }
    
    protected EObject createEObjectFromRuntimeObjectWithResource(RuntimeObject rObject, Resource p_resource)
    {
        EObject result =  null;
        // Get the meta class of the instance hosted by given runtime object
        fr.irisa.triskell.kermeta.language.structure.Class metaclass = 
        	(fr.irisa.triskell.kermeta.language.structure.Class)rObject.getMetaclass().getData().get("kcoreObject");
        // Get the qualified name of this meta class
        String kqname = unit.getKermetaUnit().getQualifiedName(metaclass.getTypeDefinition());
        
        if (rObject.getData().get("r2e.emfObject")==null)
        {
        	 // If we did not find the Eclass, then we could try to find it in the ecore metamodel resource
            if (getKermetaEcoreMap().containsKey(kqname))
            {	// this is a patch-like solution :/ for handling ecore metamodel types
            	if (getKermetaEcoreMap().get(kqname).equals("ecore::EEnum"))
            	{
            		result = getOrCreateEEnumFromRuntimeObject(rObject);
            		rObject.getData().put("r2e.emfObject", result);
            	}
            }
            EClass eclass = this.getEClassFromFQualifiedName(kqname, p_resource);
            if (eclass != null)
            {
            	result = EcoreUtil.create(eclass);
            	rObject.getData().put("r2e.emfObject", result);
            }
            // else : null eclass occurs when the object type is a primitive type or an enumeration 
        }
        else
        	result=(EObject)rObject.getData().get("r2e.emfObject");
        return result;
    }
    
    protected EEnumLiteral createEEnumLiteralFromRuntimeObjectWithResource(RuntimeObject rObject, Resource p_resource)
    {
    	EEnumLiteral result = null;
    	// 1) get the "enumeration" property of this object.
    	RuntimeObject ro_enumeration = rObject.getProperties().get("enumeration");
    	// 2) get its eenum ecore equivalence
    	EEnum current_eenum = getOrCreateEEnumFromRuntimeObject(ro_enumeration);
    	
    	// FIXME :"enumeration" element is not set correctly on runtime object representing an enumeration literal!
    	//for (Object e : rObject.getProperties().keySet()) {System.out.println("KEY:" + e + "; VALUE:"+ rObject.getProperties().get(e));
    	//RuntimeObject en = (RuntimeObject)rObject.getProperties().get("enumeration");
    	//(String)getPrimitiveTypeValueFromRuntimeObject((RuntimeObject)en.getProperties().get("name"));
    	// Get the name of the enumeration literal element
    	// Get the qualified name of this meta class
        if (rObject.getData().get("r2e.emfObject")==null)
        {
        	String enum_literal_name = (String)getPrimitiveTypeValueFromRuntimeObject((RuntimeObject)rObject.getProperties().get("name"));
        	String enumeration_name = current_eenum.getName(); // FIXME : qualified name wanted.
        	result = getEEnumLiteralFromQualifiedName(enum_literal_name, enumeration_name, p_resource);
        	rObject.getData().put("r2e.emfObject", result);
        }
        else
        	result = (EEnumLiteral)rObject.getData().get("r2e.emfObject");
        return result;
    }
    
    /**
     * Get the EClass corresponding to the kermeta qualified name 
     * @param kqname the name of which we look for the corresponding in Ecore meta-model
     * @param res the resource of the meta-model of the model to save. if null, the one given by
     * the user is taken
     * @param unit the RuntimeUnit that contain the correspondance table between kermeta object names
     * and emf serialised object names.
     * @return the EClass in the ecore meta-model given by the user for serialization of its model
     */
    protected EClass getEClassFromFQualifiedName(String kqname, Resource res)
    {
        EClass result = null;
        TreeIterator it = res.getAllContents();
        // Is it a special converted kermeta type?
        if (getKermetaEcoreMap().containsKey(kqname))
        	kqname = getKermetaEcoreMap().get(kqname);
        while (it.hasNext() && result == null)
        {
            EObject obj = (EObject)it.next();
			if (obj instanceof EClass)
			{
				if (unit.getEQualifiedName((EClass)obj).equals(kqname))
				    result = (EClass)obj;
			}
        }
        // If it was not found, maybe it is an Ecore Type? (like EEnum, EEnumeration literal....)
        return result;
    }
    
    protected EEnum getOrCreateEEnumFromRuntimeObject(RuntimeObject ro_enumeration)
    {
    	EEnum result = null;
    	String enumeration_name = (String)ro_enumeration.getProperties().get("name").getData().get("StringValue");
    	ArrayList enumeration_literals = (ArrayList)ro_enumeration.getProperties().get("ownedLiteral").getData().get("CollectionArrayList"); 
    	if (eenum_map.containsKey(enumeration_name))
    		result = eenum_map.get(enumeration_name);
    	else
    	{
    		result = EcoreFactory.eINSTANCE.createEEnum();
    		result.setName(enumeration_name);
    		result.setInstanceClass(null);
    		result.setInstanceClassName(null);
    		result.setSerializable(true); // this property does not exist in kermeta Enumeration...

    		for (Object o : enumeration_literals) 
    		{ 
    			RuntimeObject ro_elit = (RuntimeObject)o;
    			EEnumLiteral elit = EcoreFactory.eINSTANCE.createEEnumLiteral();
    			elit.setName((String)ro_elit.getProperties().get("name").getData().get("StringValue"));
    			elit.setValue(result.getELiterals().size()-1);
    			result.getELiterals().add(elit);
    		}
    		eenum_map.put(enumeration_name, result);
    	}
    	return result;
    }
    
    /** Special method to find an enumeration in meta model that contains an enumeration literal
     * which name is kqname */
    protected EEnumLiteral getEEnumLiteralFromQualifiedName(String kqname, String enum_name, Resource res)
    {
        EEnumLiteral result = null;
        //TreeIterator it = res.getAllContents();
        TreeIterator it = unit.getMetaModelResource().getAllContents();
        // Is the enum literal available in the metamodel?
        while (it.hasNext() && result == null)
        {
            EObject obj = (EObject)it.next();
			if (obj instanceof EEnum)
			{
				EEnum eenum = (EEnum)obj;
				// FIXME : enum_name must be "qualified" (with its owning package
				if (eenum.getName().equals(enum_name))
				{
					for (Object o : eenum.getELiterals()) {
						EEnumLiteral elit = (EEnumLiteral)o;
						if (elit.getName().equals(kqname))
							result = elit;
					}
				}
			}
        }
        // Is it available in the model itself?
        if (result == null)
        {
        	Iterator<Map.Entry<String, EEnum>> it_eenum = eenum_map.entrySet().iterator();
        	while (it_eenum.hasNext())
        	{
				Map.Entry<String, EEnum> next = it_eenum.next(); 
        		if (next.getValue().getName().equals(enum_name))
        		{
        			for (Object o : next.getValue().getELiterals()) {
        				EEnumLiteral elit = (EEnumLiteral)o;
        				if (elit.getName().equals(kqname))
        					result = elit;
        			}
				}
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
        ClassDefinition coll_cd = (ClassDefinition)unit.getKermetaUnit().getTypeDefinitionByName("kermeta::standard::Collection");  
        fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)robject.getMetaclass().getData().get("kcoreObject");
        if (unit.getKermetaUnit().isSuperClass(coll_cd, (ClassDefinition) c.getTypeDefinition())) b = true;
        return b;
    }
    
    public boolean isanEnumerationLiteral(RuntimeObject robject)
    {	
        boolean b = false;
        ClassDefinition coll_cd = (ClassDefinition)unit.getKermetaUnit().getTypeDefinitionByName("kermeta::language::structure::EnumerationLiteral");  
        fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)robject.getMetaclass().getData().get("kcoreObject");
        if (coll_cd.equals(c.getTypeDefinition())) b = true;
        return b;
    }
    
    /**
     * Get the EStructuralFeature in given <code>eObject</code> from the feature <code>p_name</code>
     * given in parameters
     * @param eObject the eObject of which we get a feature
     * @param p_name the name of the wanted feature
     * @return an EStructuralFeature corresponding to eObject.p_name
     */
    public static EStructuralFeature getEStructuralFeatureByName(EObject eObject, String p_name)
    {
        EList features = eObject.eClass().getEAllStructuralFeatures();
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