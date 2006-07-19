/* $Id: EMF2Runtime.java,v 1.44 2006-07-19 14:45:18 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMF2Runtime.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 7, 2005
 * Authors       : zdrey, dvojtise
 * History : 
 * 		- 18/08/2005 - the instances attribute now only contains the root elements.
 * 		- 18/08/2005 - populating the runtimeobject is modified since containment handling
 * 					   seems not to be adapted to model instance load.
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.util.ArrayList;
import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class is used to transform an EMF model into a RuntimeObject representation,
 * so that we can manipulate this model in Kermeta.
 * For this purpose, we defined a new entry in the RuntimeObject <code>data</code> hashtable : 
 * 	{ emfObject : an EMF instance in the loaded EMF model }; This entry is useful
 * when we want to update an object.
 * [developer note] access to the meta-model uri of an object:
 * ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI().
 */
public class EMF2Runtime {

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.EMF2Runtime");

    /**
     * Hashtable that contains the RuntimeObjects that host the Types of the metamodel.
     * entry is { name_of_the_type : corresponding Runtime Object}
     */
    protected Hashtable<String, RuntimeObject> type_cache;
    
    /**
     * The list of runtimeObjects that represent the EMF instances
     */
    protected Hashtable<EObject, RuntimeObject> runtime_objects_map; // { eobject : robject }
    /**
     * { qualified name of ecore type : qualified name of kermeta type }
     */
    protected static Hashtable<String, String> ecore_kermeta_map;
    public static Hashtable<String, String> getEcoreKermetaMap() {
    	if (ecore_kermeta_map == null)
    	{
    		ecore_kermeta_map = new Hashtable<String, String>();
    		ecore_kermeta_map.put("ecore::EEnum", "kermeta::language::structure::Enumeration");
    		ecore_kermeta_map.put("ecore::EEnumLiteral", "kermeta::language::structure::EnumerationLiteral");
    		// Map for the properties of EEnumLiteral for EnumerationLiteral
    		ecore_kermeta_map.put("EEnumLiteral.eEnum", "enumeration");
    		ecore_kermeta_map.put("EEnumLiteral.name", "name");
    		ecore_kermeta_map.put("EEnumLiteral.value", "");
    		ecore_kermeta_map.put("EEnumLiteral.instance", "");
    		ecore_kermeta_map.put("EEnumLiteral.eAnnotations", "tag");
    		ecore_kermeta_map.put("EEnum.eAnnotations", "tag");
    		ecore_kermeta_map.put("EEnum.eLiterals", "ownedLiteral");
    		ecore_kermeta_map.put("EEnum.instanceClassName", "");
    		ecore_kermeta_map.put("EEnum.instanceClass", "");
    		ecore_kermeta_map.put("EEnum.defaultValue", "");
    		ecore_kermeta_map.put("EEnum.ePackage", "");
    		ecore_kermeta_map.put("EEnum.serializable", "");
    	}
    	return ecore_kermeta_map;
    }
    
    public Resource resource;
    public EMFRuntimeUnit unit;
    	
    /**
     * Constructor
     * @param newunit the emf runtime unit that contains some methods useful for loading
     * and saving EMF models.
     * @param newroot_resource contains the main resource to save.
     */
    public EMF2Runtime(EMFRuntimeUnit newunit, Resource newroot_resource) {
        super();
        type_cache = new Hashtable<String, RuntimeObject>();
        runtime_objects_map = new Hashtable<EObject, RuntimeObject>();
        
        resource = newroot_resource;
        unit = newunit;
    }
    
	/**
	 * returns the list of resources that are linked to the elements of this resources
	 *  it doesn't returns the metamodel resources.
	 * (this is because the getAllContents() on a resource set alos return the metamodel ...)
	 * result includes the input resources
	 * @return EList of Resource
	 */
	public EList findDependentResources(Resource resource)
	{
		EList result = new BasicEList();
		result.add(resource);
		findDependentResources(result, resource);
		return result;
	}
	/**
	 * Looks in the given resource the list of hosted objects, and
	 * Recursive part of the findDependentResources method
	 * @param list A list&lt;Resource&gt; that contains the resources of which 
	 * the given <code>resource</code> depends.
	 * @param resource The emf resource that EMF2Runtime has to load. 
	 */
	protected void findDependentResources(EList list, Resource resource)
	{
		TreeIterator treeIt = resource.getAllContents();
		while(treeIt.hasNext())
		{
			Object obj = treeIt.next();
			if(obj instanceof EObject)
			{
				EObject eobj = (EObject)obj;
				EClass eClass = eobj.eClass();
			    // Get the structural features
			    EList features = eClass.getEAllStructuralFeatures(); 
			    // For each feature, get the value and and check if its resource is in the list
			    for (Object next : features)
			    {
			        EStructuralFeature feature = (EStructuralFeature)next;
			        // Workaround for an EMF bug
			        // -------------------------------------------------------------------------
			        // Handle the particular case of an EObject which type is EClassifier : 
			        // If an EClass has (accidentally) an instanceClassName value, set it to null
			        // Indeed, such a case (which leads to a malformed model) can appear when user 
			        // loads an ecore model created with EMF reflexive editor, which sometimes 
			        // creates EClass elements with an instanceClassName that equals "". 
			        // An instanceClassName=="" leads to a ClassNotFoundException since EMF underlying code looks
			        // for a java class which name is thus "" -> unconsistent!
			        if (eobj instanceof EClassifier)
			        {
			        	 String instance_class_name = ((EClassifier)eobj).getInstanceClassName();
			        	 if (instance_class_name != null && instance_class_name.length() == 0)
			        		 ((EClassifier)eobj).setInstanceClassName(null);
			        }
			        Object fvalue = eobj.eGet(feature);
			        // If this feature is an EList,
			        if (fvalue instanceof EList)
			        {   // Then, for each object of this EList-feature, add its hosting resource 
			        	// into the list of dependent resources
			    	    for (Object sfeature : ((EList)fvalue)) 
			    	    {
			    	    	// Ignore values which type is a base type (String,...) : we don't need to 
			    	    	// precreate a runtime object for them. (will be created "on the fly")
			    	    	if (sfeature instanceof EObject)
			    	    		addObjectResourceToList(list,(EObject)sfeature); 
			    	    }
			        }
			        //If this feature is an EObject, add its hosting resource into the list of dependent resources.
			        else if (fvalue instanceof EObject)   
			        	addObjectResourceToList(list,(EObject)fvalue);
			    }
			}
		}
	}
	
	/**
	 * Adds the resource of the given EObject (using obj.eResource() call) to the
	 * list <code>list</code>
	 * @param list The list&lt;Resource&gt;
	 * @param obj The object for which we are looking the hosting Resource
	 */
	protected void addObjectResourceToList(EList list, EObject obj)
	{
		if((obj.eResource() != null) && (!list.contains(obj.eResource())))
    	{
			list.add(obj.eResource());
			internalLog.debug("Resource added : "+ obj.eResource().getURI());
    		// recursively add the resources
			findDependentResources(list,obj.eResource());
    	}
	}
	
	/**
	 * Create the runtime objects corresponding to the elements hosted by the 
	 * Resource (EMF2Runtime.resource) and the depending resources. 
	 * This method :
	 * - creates an empty runtime object, with only one entry in its <code>data</code>
	 * Hashtable, that is : { "emfObject" : instance_of_corresponding_EObject }.
	 * - fills in the runtime_objects_map hashtable
	 */
	protected void createEmptyRuntimeObjects()
	{		
		// Find all the resources on which our resource depend,
		// and for each resource, create the ROs for its hosted EObjects.
		// (We know that the list returned findDependentResources contains only Resources:))
		for (Object res : findDependentResources(resource))
		{
			TreeIterator treeIt = ((Resource)res).getAllContents();
			while(treeIt.hasNext())
			{
				Object obj = treeIt.next();
				if(obj instanceof EObject)
				{
					EObject eobj = (EObject)obj;
					RuntimeObject ro = this.createEmptyRuntimeObjectForEObject(eobj);
					this.runtime_objects_map.put(eobj, ro);
				}
				else
				{
					unit.throwKermetaRaisedExceptionOnLoad(
					"Found unknown object in Resource '"+ ((Resource)res).getURI().toString() + "' : "+ obj, null);
				}
			}
		}
	}
	
	/**
	 * Load the EMFRuntimeUnit. This consists on : 
	 * - 1/ creating an empty runtime object for each EObject of the resource
	 * - 2/ loading the metamodel of the loaded model
	 * (if user did not provide one (when calling the load method on an EMFResource in 
	 * the kermeta side), and, finally, fill the "contentMap" (a RuntimeObject) attribute of
	 * the RuntimeUnit that is the RuntimeObject that correspond to the object that will be 
	 * "sent" to the user (see EMFResource.contentMap attribute in Kermeta side -- 
	 * persistence/resource.kmt).
	 * - 3/ populate each runtime object by doing a second pass on the resource contents
	 * 
	 * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit
	 */
	public void loadunit()
	{
		try {
			// Pass 1 : pre-create the runtime objects
			createEmptyRuntimeObjects();
			
			// If the meta-model uri was not provided in the constructor of EMFRuntimeUnit, we try
			// to find one
			if (unit.getMetaModelUri()==null || unit.getMetaModelUri().length()==0)
			{
			    // This case must not occur : it is not valid for the "save()" method call in Runtime2EMF
			    String mmUri = ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI();
			    unit.setMetaModelUri(mmUri);
			}
			
			// Fill in the properties of the runtime objects that we created
			for (Object next : runtime_objects_map.keySet()) {
			    RuntimeObject rObject = (RuntimeObject)this.runtime_objects_map.get((EObject)next);
			    this.populateRuntimeObject(rObject);
			}
			// Now that RO are populated, we can fill the contentMap attribute of RuntimeUnit.
			// contentMap is a RuntimeObject that will be "sent" to the Kermeta side, and that contains
			// a set of derived properties that can be used by the user to retrieve the EObjects hosted
			// by the resource that we loaded.
			for (EObject eObject : runtime_objects_map.keySet())
			{ 	
			    RuntimeObject rObject = this.runtime_objects_map.get(eObject);
			    // Set the container if needed 
			    if (eObject.eContainer() != null)
			    {
			    	rObject.setContainer(runtime_objects_map.get(eObject.eContainer()));
			    	// Set Content map entry "contents" for the resource that user asked to load
			        if (eObject.eResource().getURI().toString().equals(unit.getResolvedUri().toString())) 
			        	addContentMapEntry(unit, "contents", rObject);
			    }
			    else
			    {
			        rObject.setContainer(null);
			        // Set Content map entry "contents"
			        if (eObject.eResource().getURI().toString().equals(unit.getResolvedUri().toString())) 
			        	addContentMapEntry(unit, "rootContents", rObject);
			        // Fill in the contentMap that will be returned by the extern load method call
			        addContentMapEntry(unit, "allRootContents", rObject);
			    }
			    addContentMapEntry(unit, "allContents", rObject);
			}
		}
		catch (Exception e) {
		    e.printStackTrace();
		    unit.throwKermetaRaisedExceptionOnLoad(
		    		"Error loading EMF model at '" + unit.getUriAsString() +
		    		"' :\n   " + e.getMessage() + "  (" + e.getStackTrace()[0] + ")", e);
		}
		
	}
	
	/**
	 * This method creates an empty runtime object for the given EObject, with an entry
	 * { "emfObject" : EObject } in the RuntimeObject.data hashtable 
	 */
	public RuntimeObject createEmptyRuntimeObjectForEObject(EObject eObject)
	{
	    // Define the RO-metaclass of the given EObject
	    RuntimeObject ro_metaclass = this.getRuntimeObjectForMetaClass(eObject.eClass());
	    // Define the RO-instance of the given EObject, with the above given RO-metaclass
	    RuntimeObject result = new RuntimeObject(unit.getRuntimeMemory().getROFactory(), ro_metaclass);
        result.getData().put("emfObject", eObject);
        return result;
	}
	
	/**
	 * Set the RuntimeObject corresponding to the given primitive type value.
	 * @param unit
	 * @param fvalue
	 * @return
	 */
    public RuntimeObject createRuntimeObjectForPrimitiveTypeValue(Object fvalue)
    {
        RuntimeObjectFactory rofactory = unit.getContentMap().getFactory();
        RuntimeObject rovalue = rofactory.getMemory().voidINSTANCE;
        // Boolean
    	if (fvalue instanceof Boolean) {
    		if (((Boolean)fvalue).booleanValue()) { rovalue = rofactory.getMemory().trueINSTANCE; }
    		else { rovalue = rofactory.getMemory().falseINSTANCE; }
    	}
    	// Integer
    	else if (fvalue instanceof Integer) {
    	    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(((Integer)fvalue).intValue(), rofactory);
    	}
    	// String
    	else if (fvalue instanceof String) {
    	    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.String.create((String)fvalue, rofactory);
    	}
    	else if (fvalue == null) 
    	{
    	    rovalue = rofactory.getMemory().voidINSTANCE;
    	}
    	else if (fvalue instanceof Character) 
    	{    
    		rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Character.create(((Character)fvalue).charValue(), rofactory);    		
    	}
    	else if (fvalue instanceof Class) // This case occurs if user has in its ecore model a DataType relating to a java Class
    	{
    		internalLog.warn("TODO : The type of <"+fvalue+"> has not been handled yet. Replaced by Void. "+fvalue.getClass());
    		// rovalue = // create a runtimeObject that would be able to embedd a java class?
    		rovalue = rofactory.getMemory().voidINSTANCE;
    	}
    	else // should never happen
    	{
    		internalLog.warn("The type of <"+fvalue+"> has not been handled yet. Replaced by Void. "+fvalue.getClass());
    		rovalue = rofactory.getMemory().voidINSTANCE;
    	}
    	return rovalue;
    }
	
	/**
	 * Return the Class corresponding to the given name. Looks inside the loaded
	 * ecore metamodel if it was not found in the main kermeta unit.
	 * @param name
	 * @return the kermeta type corresponding to the given EClassifier. It cannot be null.
	 * If null, an exception is thrown and "sent" to the kermeta user.
	 */
	protected Type getTypeFromEClassifier(EClassifier eclassifier)
	{
	    Type ftype = null;
	    // Find type definition for the given name, and get or create a type for it
	    String eclassifier_name = unit.getEQualifiedName(eclassifier);
	    ftype = getTypeFromName(eclassifier_name);
        return ftype; 
	}
	
	protected Type getTypeFromName(String type_name)
	{
		Type ftype = null;
		TypeDefinition etype_cdef = unit.getKermetaUnit().getTypeDefinitionByName(type_name);
		// If type definition was not found, maybe we can try to find it in Kermeta framework? 
        if (etype_cdef == null)
        {
        	String unit_uri = unit.getUriAsString();
	        String unit_uriextension = unit_uri.substring(unit_uri.lastIndexOf(".")+1, unit_uri.length());
	      	// PATCH to EMF limitation : try to find the class given by "name" in kermeta::language package
	        // -> generated code for kermeta metamodel ignore the packages that do not contain classes.
	        if (unit_uriextension.compareTo("km")==0)
	        {
	        	etype_cdef = unit.getKermetaUnit().getTypeDefinitionByName("kermeta::language::" +type_name);
	        }
        }
        // If type definition was found
	    if (etype_cdef!= null)
	    {
	    	// ClassDefinition case : create a Class for the ClassDefinition
	    	if (ClassDefinition.class.isInstance(etype_cdef))
	    	{
		    	ftype = InheritanceSearch.getFClassForClassDefinition((ClassDefinition)etype_cdef);
	    	}
	    	// PrimitieType case : get its instance type
	    	else if (PrimitiveType.class.isInstance(etype_cdef))
	    	{
	    	    ftype = ((PrimitiveType)etype_cdef).getInstanceType();
	    	}
	    }
        if (ftype == null)
        {
	    	String errmsg = "EMF loading error : could not find a class (" + type_name + ") " +
	    			"in loaded libraries. Please check your require statements.\n";
	    	// Stop after the first error
        	unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
        }
        return ftype;
	}
	
	/**
	 * Add the properties as RuntimeObjects to the object rObject
	 * All the required RuntimeObjects maus have been already created
	 * @param rObject
	 * @param unit
	 */
	protected void populateRuntimeObject(RuntimeObject rObject)
	{
	    EObject eObject = (EObject)rObject.getData().get("emfObject");
	    fr.irisa.triskell.kermeta.language.structure.Class kclass = null;
	    // Get the meta class in Ecore repr. (EClass) of the RuntimeObject to populate
	    EClass eclass = eObject.eClass();
	    if (getEcoreKermetaMap().containsKey(unit.getEQualifiedName(eclass))) 
	    {
	    	String kermeta_metaclass_name = (String)getEcoreKermetaMap().get(unit.getEQualifiedName(eclass));
	    	kclass = (fr.irisa.triskell.kermeta.language.structure.Class)getTypeFromName(kermeta_metaclass_name);
	    }
	    else
	    {
	    	kclass = (fr.irisa.triskell.kermeta.language.structure.Class)getTypeFromEClassifier(eclass);
	    }
	    // For each feature, get the value and add it to the properties hashtable
	    for (Object next : eclass.getEAllStructuralFeatures())
	    {	
	    	EStructuralFeature feature = (EStructuralFeature)next;
	    	EClassifier feature_type = feature.getEType();
	    	Type ftype = getTypeFromEClassifier(feature_type);
	    	// Find the property corresponding to the given feature
	    	// Note : if it is not found, this method throws a KermetaRaisedException.
	    	Property prop = getPropertyForEStructuralFeature((ClassDefinition) kclass.getTypeDefinition(), feature, eclass);
	    	// Means that prop does not exist in kermeta side, so do nothing
	    	if (prop != null)
	    	{	
	    		RuntimeObject roprop = unit.getRuntimeMemory().getRuntimeObjectForFObject(prop);
	    		// eGet can return an elist of features
	    		Object fvalue = eObject.eGet(feature);
	    		RuntimeObject rovalue = null;
	    		try
	    		{
	    			// A feature with multiplicity
	    			if (fvalue instanceof EList)
	    			{
	    				rovalue = createRuntimeObjectForCollection((EList)fvalue, ftype, unit, rObject, roprop);
	    			}
	    			// Get the RO-repr of this EObject
	    			else if (fvalue instanceof EObject)
	    			{   // EFactory is not saved in the model, neither does it refer to a saved element in the model (at the opposite
	    				// of all the other transient features), so it will not be loaded
	    				// Indeed, EFactory is a typical ecore case that is used for Java compliance..Unusable in kermeta.
	    				if (!(fvalue instanceof EFactory))
	    				{
	    					rovalue = createRuntimeObjectForEObject(rObject, (EObject)fvalue, feature);
	    					rObject.getProperties().put(prop.getName(), rovalue);
	    				}
	    			} // equivalent test : fvalue instanceof EString, EInt, etc.
	    			else if (EDataType.class.isInstance(feature_type))
	    			{
	    				rovalue = createRuntimeObjectForPrimitiveTypeValue(fvalue);
	    				fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, rovalue);
	    			}
	    			else if (fvalue == null)
	    			{    
	    				fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, unit.getRuntimeMemory().voidINSTANCE);
	    			}
	    			else // Enum?
	    			{
	    				String errmsg = "NotImplemented Error : The type <"+feature_type+"> has not been handled yet. Trying to set "+
	    				fvalue+" into "+rObject;	
	    				unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
	    			}
	    			// If we instanciated a RuntimeObject value, we can set the properties for the object
	    			// reminder : rovalue is null if fvalue was an instance of EFactory
	    			if (fvalue != null && rovalue != null) rovalue.getData().put("emfObject", fvalue);
	    		} // Catch any unhandled raised exception
	    		catch (Exception e) {
	    			String errmsg = "Exception received. Trying to set on " +  rObject  + " this property: " + prop +" / " + feature.getName() + " with value: "+ fvalue;
	    			e.printStackTrace();
	    			unit.throwKermetaRaisedExceptionOnLoad(errmsg, e);
	    		} 
	    	} 
	    }
	} 

	protected void populateRuntimeObjectForEnumeration(RuntimeObject rObject)
	{
	}
	
	/**
	 * retreives the property from its names.
	 * Also deal with "non natural" properties like the one inherited from the ecore EModelElement that is inherited by all model element  
	 * @param roFactory
	 * @param classDef
	 * @param propName
	 * @return
	 */
	private Property getPropertyForEStructuralFeature(ClassDefinition classDef, EStructuralFeature feature, EClass eclass)
	{
		String propName = feature.getName();
		String tmp_propName = "";
		// If we can get the value of the specified property, put propertyExists to true.
		boolean propertyExists = false;
		// Patch for bug #595
		// http://gforge.inria.fr/tracker/index.php?func=detail&aid=595&group_id=32&atid=205
		// deal with special properties cases - ecore special structural feature
		Property result = null;
		// Patch for bug #595
		// http://gforge.inria.fr/tracker/index.php?func=detail&aid=595&group_id=32&atid=205
		// deal with special properties cases - ecore special structural feature
		if (getEcoreKermetaMap().containsKey(eclass.getName()+"."+propName))
		{
			tmp_propName = getEcoreKermetaMap().get(eclass.getName()+"."+propName);
			if (tmp_propName.length() != 0)
			{ propName = tmp_propName; propertyExists = true; }
		}
		else propertyExists = true;
		if (propertyExists == true)
		{
			result = unit.getKermetaUnit().findPropertyByName(classDef, propName);
			// If result is still null, send an exception
			if (result == null)
			{
				String errmsg = "EMF loading error : property set failed.\n  Not able to find '"+ propName+"' property on class " + classDef.getName() +
				" ; known properties are : ";
				for ( Object prop : unit.getKermetaUnit().getAllProperties(classDef)) 
				{ errmsg += ((Property)prop).getName() + ", "; }
				errmsg += "\n in class \"" + classDef.getName() +"\"";
				errmsg += "\nwith feature == " + feature;
				unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
			}
		}
		
    	return result;
	}
	
	/**
	 * Create a runtime object corresponding to the given fvalue. This <code>fvalue</code> corresponds to a structural feature "extracted" from
	 * the eObject to which the given Runtime object <code>rObject</code> correspond.
	 * @param rObject the RuntimeObject that we want to "populate" with the given feature represented by the EObject <code>fvalue</code>
	 * @param fvalue the [structural] feature that we want to convert in its RuntimeObject representation
	 * @param fname the name of the fvalue feature (used to store it in the "properties" hashtable of rObject).
	 * @param etype the type of the feature (only used here to feed a potential KermetaException)
	 * @param interpreter the ExpressionInterpreter (only used here to report a potential KermetaException)
	 * @param memory the RuntimeMemory (only used here to feed a potential KermetaException)
	 * @return the runtime object representation of <code>fvalue</code>
	 */
	protected RuntimeObject createRuntimeObjectForEObject(RuntimeObject rObject, EObject fvalue, EStructuralFeature feature)
	{
		RuntimeObject rovalue = (RuntimeObject)this.runtime_objects_map.get(fvalue);
        // If this case occurs, throws a kermeta raised exception with a detailed message.
        if(rovalue==null)
        {
        	String errmsg = "";
        	// troubles in the auto resolve 
        	EObject obj = EcoreUtil.resolve(fvalue, resource.getResourceSet());
        	if(fvalue.eIsProxy() && obj.eIsProxy())
			{   	// ie. was a proxy and the proxy was not resolved
				String objectURI = fvalue.eResource().getURIFragment(fvalue);			            	
				errmsg = "Not able to resolve proxy for value: " + fvalue 
					+ " for object: "+rObject +" of type: "+feature.getEType()+
					"\nTry to load the file containing this URI: "+objectURI;
			}
			else
			{	// the feature destination was not in the main resource:
        		// this is in fact too late to create the runtime object for an EObject, !!! 
        		// concurrent exception !
				Resource eresource = fvalue.eResource();
				errmsg = "Not able to find RuntimeObject in runtime_objects_map for value on type "+feature.getEType()
					+"Trying to set "+ fvalue+" into "+rObject; 
				if (eresource!=null) errmsg += "\nBe sure to load the file containing this URI: "+eresource.getURIFragment(fvalue);
        	}
        	unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
        }
        // FIXME the set method needs to be reviewed (for model instances?)
        //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, rovalue);
        return rovalue;
	}
	
	/**
	 * Create a RuntimeObject that represent a collection.
	 * We need to create in "purely" in java when we have an instance of which one of its properties
	 * has an upperBound that is * or a number > 1
	 * Adds the list of objects given in arguments, and create a collection which type parameter is typeParam.
	 * 
	 * @param objects a list of EObjects that represent a property[0..*] of elements of type typeParam
	 * @param object
	 * @return a Set of objects (Set<typeParam>)
	 */
	public RuntimeObject createRuntimeObjectForCollection(EList objects, Type typeParam, EMFRuntimeUnit unit, RuntimeObject rObject, RuntimeObject roprop)
	{
	    RuntimeObject result = fr.irisa.triskell.kermeta.runtime.language.Object.get(rObject, roprop);
	    // We create one by default 
	    if (Collection.getArrayList(result) == null)
	    { result.getData().put("CollectionArrayList", new ArrayList()); }
	    
	    // Transform the EObjects into RuntimeObject and add them in our collection
	    for (Object sfeature : objects)
	    {
	        RuntimeObject rovalue;
	        if (sfeature instanceof EObject)
	            rovalue = this.runtime_objects_map.get(sfeature); 
	        else // it is a Datatype
	            rovalue = createRuntimeObjectForPrimitiveTypeValue(sfeature);
	        // RuntimeObject ri = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, memory.getROFactory());
	        // ReflectiveSequence.addAt(result, ri, rovalue); i+=1;
	        // ReflectiveCollection.add(result, rovalue);
	        // FIXME : ReflectiveSequence.addAt and ReflectiveCollection.add handle differently and weirdly 
	        // the containment of the added element. (see their code!). That's why we use the simple Collection.add method
	        rovalue.getData().put("emfObject", sfeature);
	        Collection.add(result, rovalue);
	    }
	    rObject.getProperties().put((String)((RuntimeObject)roprop.getProperties().get("name")).getData().get("StringValue"), result);
	    // FIXME : the set method handles the containment, but it seems to be not appropriated for 
	    // model instances. Containment is observed even if we simply use Collection.add to add instances
	    // since result is still a reflective collection.
	    //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, result);
	    return result;
	}

	/**
	 * Get or create (if it does not exist) the RuntimeObject for the given EClass, and put it 
	 * in the runtime unit. The class is found in the unit typedef_cache or put in it if it was not
	 * found in it. We use it to define instances of metaclass type.
	 * @param metaclass The EClass to "convert" in a RuntimeObject
	 * @param unit The runtime unit we are working with
	 * @return the RuntimeObject embedding the Kermeta FClass equivalent to the given EClass
	 */
	public RuntimeObject getRuntimeObjectForMetaClass(EClass metaclass)
	{
	    RuntimeObject result = null;
	    String metaclass_name = unit.getEQualifiedName(metaclass);
	    // If the given metaclass is an EEnum (ecore), we have to "convert" it in Enumeration (kermeta)
	    if (getEcoreKermetaMap().containsKey(metaclass_name)) 
	    {
	    	String kermeta_metaclass_name = (String)getEcoreKermetaMap().get(metaclass_name);
	    	if (this.type_cache.containsKey(kermeta_metaclass_name)) 
		        result = (RuntimeObject)this.type_cache.get(kermeta_metaclass_name);
	    	else
	    	{	
	    		Type ftype = this.getTypeFromName(kermeta_metaclass_name);
	    		fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)ftype;
	    		result = unit.getRuntimeMemory().getRuntimeObjectForFObject(ftype);
	    		this.type_cache.put(metaclass_name, result);
	    	}
	    }
	    else if (this.type_cache.containsKey(metaclass_name)) 
	    {
	        result = (RuntimeObject)this.type_cache.get(metaclass_name);
	    }
	    else
	    {   
	    	Type ftype = this.getTypeFromEClassifier(metaclass);
	        fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)ftype;
	        result = unit.getRuntimeMemory().getROFactory().createMetaClass(fclass);
	        this.type_cache.put(metaclass_name, result);
	    }
	    return result;
	}
	
	/**
	 * Fill in the content map entry which key is <code>key</code> : the value of this entry is the RO
	 * representation of a Collection, so the given <code>rObject</code> will be added to this
	 * collection 
	 * @param key Key in contentMap a value among "contents", "rootContents", "allRootContents", "allContents"
	 * @param coll the value corresponding to key. It is a collection 
	 * @param rObject the object to add the collection <code>coll</code>
	 */
	protected void addContentMapEntry(EMFRuntimeUnit unit, String key, RuntimeObject rObject)
	{
		// Set the entry to put { RuntimeObjectString , (RuntimeObject)content_table} in contentMap
		RuntimeObject collection_entry = unit.getContentMapEntryFromString(key); 
		// Fill in the contentMap that will host the loaded elements
		fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(collection_entry, rObject);
	}

}
