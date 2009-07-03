/* $Id: EMF2Runtime.java,v 1.87 2008-12-31 08:56:58 dvojtise Exp $
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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.apache.commons.logging.Log;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.BasicFeatureMapEntry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.customidentity.CustomHashtable;
import org.kermeta.customidentity.ReferenceComparer;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Repository;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.runtime.rohelper.RepositoryHelper;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;

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
    final static public Log internalLog = LogConfigurationHelper.getLogger("KMT.EMF2Runtime");

    /**
     * Hashtable that contains the RuntimeObjects that host the Types of the metamodel.
     * entry is { name_of_the_type : corresponding Runtime Object}
     */
    protected Hashtable<String, RuntimeObject> type_cache;
    
    protected Hashtable<String, RuntimeObject> special_primitive_types;
    
    /** monitor that may be used to monitor the progress of this task
     * must not use beginTask and done on it, only create subtasks
     */
    public IProgressMonitor monitor = null;
    /**
     * if true, try to ignore all faulty objects while loading the resources
     */
    protected boolean ignoreAllLoadErrors = false;/**
     
     /** if true, try to ignore objects that don't have a known metaclass while loading the resources
     */
    protected boolean ignoreLoadErrorUnknownMetaclass = false;
    
    /** if true, try to ignore properties that don't have an equivalent in the metaclass definition while loading the resources
     */
    protected boolean ignoreLoadErrorUnknownProperty = false;
    /**
     * The list of runtimeObjects that represent the EMF instances
     * it may contain EObject and RO that were loaded in a previous load
     */
    protected CustomHashtable<EObject, RuntimeObject> runtime_objects_map; // { eobject : robject }
    
    /**
     * The list of new runtimeObjects that represent the EMF instances
     */
    protected CustomHashtable<EObject, RuntimeObject> newlycreated_runtime_objects_map; // { eobject : robject }
    
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
    		ecore_kermeta_map.put("EEnumLiteral.literal", "");
    		ecore_kermeta_map.put("EEnum.instanceClassName", "");
    		ecore_kermeta_map.put("EEnum.instanceTypeName", "");
    		ecore_kermeta_map.put("EEnum.eTypeParameters", "");
    		ecore_kermeta_map.put("EEnum.instanceClass", "");
    		ecore_kermeta_map.put("EEnum.defaultValue", "");
    		ecore_kermeta_map.put("EEnum.ePackage", "");
    		ecore_kermeta_map.put("EEnum.serializable", "");
    	}
    	return ecore_kermeta_map;
    }
    
    public Resource resource;
    public EMFRuntimeUnit unit;
    
    /** List of inter-dependent resources (including the main resource) */
    public EList<Resource> dependentResources;
    	
    /**
     * Constructor
     * @param newunit the emf runtime unit that contains some methods useful for loading
     * and saving EMF models.
     * @param newroot_resource contains the main resource to save.
     */
    public EMF2Runtime(EMFRuntimeUnit newunit, Resource newroot_resource) {
        super();
        type_cache = new Hashtable<String, RuntimeObject>();
        runtime_objects_map = new CustomHashtable<EObject, RuntimeObject>(new ReferenceComparer());
        newlycreated_runtime_objects_map = new CustomHashtable<EObject, RuntimeObject>(new ReferenceComparer());
        special_primitive_types = new Hashtable<String, RuntimeObject>();
        resource = newroot_resource;
        unit = newunit;
    }
    
	/**
	 * Adds the resource of the given EObject (using obj.eResource() call) to the
	 * list <code>list</code>
	 * @param list The list&lt;Resource&gt;
	 * @param obj The object for which we are looking the hosting Resource
	 */
	protected void addObjectResourceToList(EList<Resource> list, EObject obj)
	{
		if((obj.eResource() != null) && (!list.contains(obj.eResource())))
    	{
			list.add(obj.eResource());
			internalLog.debug("Resource added : "+ obj.eResource().getURI() );
    		// recursively add the resources
			unit.findDependentResources(list,obj.eResource());
    	}
	}
	
	/**
	 * Create the runtime objects corresponding to the elements hosted by the 
	 * Resource (EMF2Runtime.resource) and the depending resources. 
	 * This method :
	 * - creates an empty runtime object, with only one entry in its <code>data</code>
	 * Hashtable, that is : { "emfObject" : instance_of_corresponding_EObject }.
	 * - fills in the runtime_objects_map hashtable
	 * Will not recreate RuntimeObject for existing runtime object
	 */
	protected void createEmptyRuntimeObjects() {
				
		// For each resource, create the ROs for its hosted EObjects.
		for (Resource resObj : dependentResources) {
			
			/* EcoreUtil.getAllContents(resObj.getResourceSet(), true);
			//resource.getResourceSet().getAllContents();
			//resObj.getResourceSet().getAllContents();
			if(EcoreUtil.UnresolvedProxyCrossReferencer.find(resObj.getResourceSet()).size() > 0)
			{
				internalLog.debug(" found unresolved proxy  ! " );
				
			}*/
			TreeIterator<EObject> contentsIt = EcoreUtil.getAllContents(resObj, true); //resObj.getAllContents();
			while(contentsIt.hasNext()) {
				
				// Create RO for current EObject
				EObject eObj = contentsIt.next();
				if(!runtime_objects_map.containsKey(eObj)){
					try{
						RuntimeObject rootRO = this.createEmptyRuntimeObjectForEObject(eObj);
						this.runtime_objects_map.put(eObj, rootRO);
						this.newlycreated_runtime_objects_map.put(eObj, rootRO );
						if(eObj.eIsProxy()){
							internalLog.debug(" this object is still a proxy  ! " + eObj);
						}
					}catch (UnknownMetaclassException e){
						String errmsg = "could not find a class (" + e.metaclassName + ") " +
		    			"in the required ClassDefinition. Please check your require statements.\n";
				    	
				    	if(ignoreAllLoadErrors || ignoreLoadErrorUnknownMetaclass ){ 
				    		internalLog.warn("Ignoring load of an object due to : "+errmsg);
				    	}
				    	else{// Stop after the first error
				    		unit.throwKermetaRaisedExceptionOnLoad("EMF loading error : " + errmsg, null);
				    		internalLog.error("EMF loading error : " + errmsg);
				    		
				    	}
					}
				}
				/*else{
					internalLog.debug("skipped because already loaded" + eObj);
				}*/
			}
		}
	}
	/**
	 * pre fill the runtime_objects_map with preexisting RO that were here from a previous load
	 *  Should be called before creating the EmptyRuntimeObjects
	 *  
	 */
	protected void fillRuntimeObjectsMapWithPreExistingObjects(RuntimeObject roRepository){
		// Design note : cannot use directly the getAllContainedObjects on Resource because this is not a classical "containment"
		
		// for all resources in the repository
		RuntimeObject resourceListRO = roRepository.getProperties().get("resources");
		if(resourceListRO != null) {
			ArrayList<RuntimeObject> resourceList = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resourceListRO);
			
			for(RuntimeObject aResourceRO : resourceList) {
				// for all elements in the resource
					// a Resource inherit from Collection
				ArrayList<RuntimeObject> elementList = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(aResourceRO);
				for(RuntimeObject anElementRO : elementList) {	
					EObject eObj = (EObject)anElementRO.getEmfObject();
					// if it has an EObject  (even if this is not recommended, the user may have added new element in the resource between 2 load) 
					//		put this Element RO and its associated EObject in the map   
					if(eObj != null) this.runtime_objects_map.put(eObj, anElementRO);
					// for all element contained by the element
					RuntimeObject containedElementListRO = fr.irisa.triskell.kermeta.runtime.language.Object.getAllContainedObjects(anElementRO);
					ArrayList<RuntimeObject> containedElementList = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(containedElementListRO);
					for(RuntimeObject aContainedElementRO : containedElementList) {							
						EObject containedEObj = (EObject)aContainedElementRO.getEmfObject();
						// do the same
						if(containedEObj != null) this.runtime_objects_map.put(containedEObj, aContainedElementRO);
					}
				}
			}
		}
	}
	
	/**
	 * @param mainResRO
	 */
	protected void createResourceRuntimeObjects(RuntimeObject mainResRO) {
		RuntimeObject repRO = mainResRO.getProperties().get("repository");
		
		// Iterate over inter-dependent resources
		for (Resource res : dependentResources) {
			RuntimeObject crtResRO = null;
			String mainResNormalizedUri = Repository.normalizeUri(
					fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(mainResRO.getProperties().get("uri")),
					mainResRO.getFactory().getMemory().getUnit(), 
					mainResRO.getFactory().getMemory().getInterpreter());
			// First step: create and/or initialize the RO for the current resources
			if(! res.getURI().toString().equals(mainResNormalizedUri)) {
				// this is a dependent resource
				
				// is this an already loaded resource ?
				RuntimeObject foundResourceRO = RepositoryHelper.getResource(repRO,res.getURI().toString());				
		    	if(foundResourceRO != null){
		    		crtResRO = foundResourceRO;
		    	}
		    	else{
		    		// that's a new dependent resource, create and add it to the Repository
					String metamodel_uri = EcoreHelper.getMetaModelUriFromResource(resource);
					
					// Create and initialize RO for current Resource
					crtResRO = mainResRO.getFactory().createRuntimeObjectFromResource(
									res,
									repRO,
									fr.irisa.triskell.kermeta.runtime.basetypes.String.create(metamodel_uri, repRO.getFactory()),
									RuntimeObjectFactory.EMFRESOURCE_QUALIFIED_NAME
								);
					
					// Link the repository RO to the newly allocated resource RO 
					RuntimeObject resListRO = repRO.getProperties().get("resources");
					ArrayList<RuntimeObject> aResourceListRO = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resListRO);
					aResourceListRO.add(crtResRO);
					
					// new dependent resources are declared readonly by default
						// ie. they are not updated when saving the repository
					crtResRO.getProperties().put("isReadOnly", crtResRO.getFactory().getMemory().trueINSTANCE);
					
		    	}
			}
			else {
				// this is the main Resource we are loading : it has already been created
				crtResRO = mainResRO;
			}
			
			// Second step: set the containing resource information for the root model elements
			// of the current resource RO, and add these model elements into the contents of 
			// the resourde RO
			for( EObject rootEObj : res.getContents()){
					
				RuntimeObject rootRO = (RuntimeObject) this.runtime_objects_map.get(rootEObj);
				// note: it may be null if the option ignoreLoadErrorUnknownMetaclass is set to true
				if(rootRO != null){
					fr.irisa.triskell.kermeta.runtime.language.Object.setContainingResource(rootRO, crtResRO);
					
					ArrayList<RuntimeObject> resContents = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(crtResRO);
					resContents.add(rootRO);
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
	//public void loadunit()
	public void loadunit(RuntimeObject mainResRO)
	{
		int processedElements = 0;
		int nbPreExistingObjects = 0;
		try {
			String fileName = unit.getUriAsString().substring(unit.getUriAsString().lastIndexOf('/')+1);
			SubMonitor progress = SubMonitor.convert(monitor, "Loading " + fileName, 4 );
			
			if(monitor!= null) monitor.subTask("Looking for dependent resources");
			// Compute list of inter-dependent resources
			dependentResources = unit.findDependentResources(resource);
			
			// make sure we don't recreate already loaded RO			
			RuntimeObject roRepository = (RuntimeObject) mainResRO.getProperties().get("repository");	
			
			// update the ignore load error field from the RuntimeObject
			RuntimeObject roIgnoreAllLoadErrors = (RuntimeObject) roRepository.getProperties().get("ignoreAllLoadErrors");
			ignoreAllLoadErrors = roIgnoreAllLoadErrors != null ? fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(roIgnoreAllLoadErrors) : false;		
			// update the ignore load error field from the RuntimeObject
			RuntimeObject roIgnoreLoadErrorUnknownMetaclass = (RuntimeObject) roRepository.getProperties().get("ignoreLoadErrorUnknownMetaclass");
			ignoreLoadErrorUnknownMetaclass = roIgnoreLoadErrorUnknownMetaclass != null ? fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(roIgnoreLoadErrorUnknownMetaclass) : false;		
			// update the ignore load error field from the RuntimeObject
			RuntimeObject roIgnoreLoadErrorUnknownProperty = (RuntimeObject) roRepository.getProperties().get("ignoreLoadErrorUnknownProperty");
			ignoreLoadErrorUnknownProperty = roIgnoreLoadErrorUnknownProperty != null ? fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(roIgnoreLoadErrorUnknownProperty) : false;		
			

			if(monitor!= null) monitor.subTask("Looking for pre-existing objects");
			fillRuntimeObjectsMapWithPreExistingObjects(roRepository); 
			nbPreExistingObjects = runtime_objects_map.size();
			// Pass 1 : pre-create the runtime objects
			if(monitor!= null) 	monitor.subTask("Creating new objects");
			createEmptyRuntimeObjects();
			
			internalLog.debug("Loading " + runtime_objects_map.size() + " objects (new : " +
					newlycreated_runtime_objects_map.size()+ ", update only : "+nbPreExistingObjects + " ) from " + resource.getURI().toString() +  " and its dependencies ");
			
			// If the meta-model uri was not provided in the constructor of EMFRuntimeUnit, we try
			// to find one
			if (unit.getMetaModelUri()==null || unit.getMetaModelUri().length()==0)
			{
			    // This case must not occur : it is not valid for the "save()" method call in Runtime2EMF
			    String mmUri = ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI();
			    unit.setMetaModelUri(mmUri);
			}

			if(monitor!= null) monitor.subTask("Updating objects links");	
			// convert the monitor for a finer precision of the monitor on this time consuming task
			progress = SubMonitor.convert(monitor, "Loading " + fileName, newlycreated_runtime_objects_map.size() );
			
			// Fill in the properties of the new runtime objects that we created
			java.util.Enumeration<EObject> enum1 = newlycreated_runtime_objects_map.keys();
			while(enum1.hasMoreElements()){
				Object next = enum1.nextElement();
			    RuntimeObject rObject = newlycreated_runtime_objects_map.get((EObject)next);
			    this.populateRuntimeObject(rObject);
			    processedElements++;
			    //if(monitor!= null) monitor.worked(1);
			    progress.worked(1);
			    if(this.monitor.isCanceled()) throw new Exception("Model load interrupted by the user");
				
			}

			// Set the container RO property for populated ROs
			java.util.Enumeration<EObject> enum2 = newlycreated_runtime_objects_map.keys();
			while(enum2.hasMoreElements()){
				EObject eObject = enum2.nextElement(); 	
			    RuntimeObject rObject = newlycreated_runtime_objects_map.get(eObject);
			    // Set the container if needed 
			    if (eObject.eContainer() != null) {
			    	rObject.setContainer( newlycreated_runtime_objects_map.get(eObject.eContainer()));
			    }
			    else {
			        rObject.setContainer(null);
			    }
			}
			
			// Manage the resource RuntimeObjects:
			//   1- Create resource RuntimeObject for all dependent resources
			//   2- Associate resources to their root model elements
			createResourceRuntimeObjects(mainResRO);
		}
		/*catch (DiagnosticWrappedException e){
			e.
		}*/
		catch (Exception e) {
			if(e.getCause() instanceof InvocationTargetException){
				InvocationTargetException ite = (InvocationTargetException)e.getCause();
				if(ite.getCause() != null){
					Throwable cause = ite.getCause();
					internalLog.error("loadUnit failed due to " + (cause.getMessage()!=null?cause.getMessage():"") + " : exception: " + cause + 
							" ) \n maybe you forgot to register your metamodel ?", e);
					unit.throwKermetaRaisedExceptionOnLoad(
							"Error loading EMF model at '" + unit.getUriAsString() +
							"' :\n   " + (cause.getMessage()!=null?cause.getMessage():cause) + "  at '"  + cause.getStackTrace()[0] + "'" +
							"\n maybe you forgot to register your metamodel ?", e);
				}
				else{
					internalLog.error("loadUnit failed due to " + (ite.getMessage()!=null?ite.getMessage():"") + " : exception: " + ite + " )", e);
					unit.throwKermetaRaisedExceptionOnLoad(
							"Error loading EMF model at '" + unit.getUriAsString() +
							"' :\n   " + (ite.getMessage()!=null?ite.getMessage():ite) + "  at '"  + ite.getStackTrace()[0] + "'", e);
				}
			}
			else{
				internalLog.error("loadUnit failed due to " + e.getMessage()!=null?e.getMessage():"" + " : exception: " + e + " )", e);
				unit.throwKermetaRaisedExceptionOnLoad(
		    		"Error loading EMF model at '" + unit.getUriAsString() +
		    		"' :\n   " + (e.getMessage()!=null?e.getMessage():e) + "  at '"  + e.getStackTrace()[0] + "'", e);
			}
		}
		catch(java.lang.OutOfMemoryError e2){
    		//packages.clear();
    		String msg = e2 + ": Not enough memory to load your " 
    				+ " model (processed " + processedElements + " elements ot of " 
    				+ runtime_objects_map.size() + " from " + resource.getURI().toString() +  " and its dependencies); ";
    		msg += "\nplease consider increasing the memory allocated to your jvm";
    		
    		internalLog.error(msg,e2);
    		unit.throwKermetaRaisedExceptionOnLoad(msg,e2);
    	}
/*		catch(java.lang.Error e3){
			String msg = e3 + ": Java problem " 
				+ " model (processed " + processedElements + " elements ot of " 
				+ runtime_objects_map.keySet().size() + " from " + resource.getURI().toString() +  " and its dependencies); ";
			
			internalLog.error(msg,e3);
			unit.throwKermetaRaisedExceptionOnLoad(msg,e3);
		}*/
		
	}
	
	/**
	 * This method creates an empty runtime object for the given EObject, with an entry
	 * { "emfObject" : EObject } in the RuntimeObject.data hashtable 
	 * @throws UnknownMetaclassException 
	 */
	public RuntimeObject createEmptyRuntimeObjectForEObject(EObject eObject) throws UnknownMetaclassException
	{
	    // Define the RO-metaclass of the given EObject
		RuntimeObject ro_metaclass = this.getRuntimeObjectForMetaClass(eObject.eClass());
	    // Define the RO-instance of the given EObject, with the above given RO-metaclass
	    RuntimeObject result = new RuntimeObjectImpl(unit.getRuntimeMemory().getROFactory(), ro_metaclass);
        result.setEmfObject( eObject);
        return result;
	}
	
	/**
	 * Set the RuntimeObject corresponding to the given primitive type value.
	 * If the fvalue is not "recognized" by kermeta as a primitive value, create
	 * a void instance runtime object instead.
	 * If the fvalue is null, set a default value
	 * @param fvalue the value of the given feature
	 * @param feature the feature which has "fvalue" as its value
	 * @return
	 */
    public RuntimeObject createRuntimeObjectForPrimitiveTypeValue(Object fvalue, EDataType feature_type)
    {
    	RuntimeObjectFactory rofactory = unit.getContentMap().getFactory();
        RuntimeObject rovalue = rofactory.getMemory().voidINSTANCE;
        String instance_classname = feature_type.getInstanceClassName(); 
        // Boolean
    	if (instance_classname.equals("java.lang.Boolean")||instance_classname.equals("boolean")) {
    		if (fvalue == null || ((Boolean)fvalue).booleanValue()) { rovalue = rofactory.getMemory().trueINSTANCE; }
    		else { rovalue = rofactory.getMemory().falseINSTANCE; }
    	}
    	//Real
    	else if (instance_classname.equals("java.lang.Double")||instance_classname.equals("double")) {
    		rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Real.create(fvalue!=null?(Double)fvalue:0.0, rofactory);
    	}
    	// Integer
    	else if (instance_classname.equals("java.lang.Integer")||instance_classname.equals("int")) {
    	    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(
    	    		(fvalue == null)?0:((Integer)fvalue).intValue(), rofactory);
    	}
    	// String
    	else if (instance_classname.equals("java.lang.String")) {
    	    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(fvalue!=null?(String)fvalue:"", rofactory);
    	}
    	else if (instance_classname.equals("java.lang.Character")||instance_classname.equals("char")) 
    	{    
    		rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Character.create(((Character)fvalue).charValue(), rofactory);    		
    	}
    	else if (fvalue instanceof Class) // This case occurs if user has in its ecore model a DataType relating to a java Class
    	{
    		internalLog.warn("TODO : The type of <"+fvalue+"> has not been handled yet. Replaced by null. ");
    		// create a runtimeObject that would be able to embedd a java class?
    		rovalue = rofactory.getMemory().voidINSTANCE;
    	}    	
    	else // should never happen
    	{
    		internalLog.warn("The type of <"+fvalue+"> has not been handled yet("+instance_classname+"). Replaced by Void.");
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
	    	// PrimitiveType case : get its instance type
	    	else if (PrimitiveType.class.isInstance(etype_cdef))
	    	{
	    	    ftype = ((PrimitiveType)etype_cdef).getInstanceType();
	    	}
	    	else if(Enumeration.class.isInstance(etype_cdef)){
	    		ftype = ((Enumeration)etype_cdef);
	    	}
	    }
	    if (ftype == null && type_name.equals("ecore::EObject"))
	    {
	    	// we were probably using ecore::EObject as the "Any", in kermeta this is Object that must be used
	    	ftype = getTypeFromName("kermeta::language::structure::Object");
	    }
        if (ftype == null)
        {
	    	String errmsg = "could not find a class (" + type_name + ") " +
	    			"in the required ClassDefinition. Please check your require statements.\n";
	    	if(type_name.startsWith("null::")){
	    		errmsg += "EMF had trouble finding the package ("+ type_name +"), this typically occurs when the uri used in the model is not correctly registered. You must either : register your metamodel, or use a nsuri that correspond to a physical location ex: platform:/resource/yourproject/yourmm.ecore";
	    		unit.throwKermetaRaisedExceptionOnLoad("EMF loading error : " + errmsg, null);
	    		internalLog.error("EMF loading error : " + errmsg);
	    	}
	    	
	    /*	if(!ignoreLoadErrors){ // maybe we can 
	    		// Stop after the first error
	    		unit.throwKermetaRaisedExceptionOnLoad("EMF loading error : " + errmsg, null);
	    		internalLog.error("EMF loading error : " + errmsg);
	    	}
	    	else{
	    		internalLog.error("Ignoring load of some object due to : "+errmsg);
	    	}*/
        }
        return ftype;
	}
	
	/**
	 * Add the properties as RuntimeObjects to the object rObject
	 * All the required RuntimeObjects must have been already created
	 * @param rObject
	 * @param unit
	 */
	protected void populateRuntimeObject(RuntimeObject rObject)
	{
	    EObject eObject = (EObject)rObject.getEmfObject();

	    fr.irisa.triskell.kermeta.language.structure.Class kclass = null;
	    // Get the meta class in Ecore repr. (EClass) of the RuntimeObject to populate
	    EClass eclass = eObject.eClass();
	    // Get the Type corresponding to the given class. If it is an ecore type to convert (EEnum, EEnumLiteral, EAnnotation)
	    // then, convert it in its kermeta compliant version (Enumeration, EnumerationLiteral, Tag) 
	    if (getEcoreKermetaMap().containsKey(unit.getEQualifiedName(eclass)) && !unit.isFromEcoreMetaModel())
	    {
	    	String kermeta_metaclass_name = (String)getEcoreKermetaMap().get(unit.getEQualifiedName(eclass));
	    	kclass = (fr.irisa.triskell.kermeta.language.structure.Class)getTypeFromName(kermeta_metaclass_name);
	    }
	    else
	    {
	    	kclass = (fr.irisa.triskell.kermeta.language.structure.Class)getTypeFromEClassifier(eclass);
	    }
	    // For each feature, get the value and add it to the properties hashtable
	    EList<EStructuralFeature> allStructuralFeature = eclass.getEAllStructuralFeatures();
	    for (EStructuralFeature feature : allStructuralFeature)
	    {	// Find the property corresponding to the given feature
	    	// Note : if it is not found, this method throws a KermetaRaisedException.
	    	Property prop = getPropertyForEStructuralFeature((ClassDefinition) kclass.getTypeDefinition(), feature, eObject.eClass());

	    	if(prop != null){ // in some situation prop may be null and we should ignore it. ex: EEnum.eTypeParameters as no translation in kermeta enumeration 		    	
	    		setPropertyFromEStructuralFeature(feature, eObject, 
		    			prop, rObject, kclass);	    		    	
		    	if(feature instanceof EReference){
		    		EReference ref = (EReference)feature;
		    		if (ref.getEOpposite() == null && prop.getOpposite() != null){		    	
			    		// need to manually set the opposite (not done by the normal case because not in the ecore)
			    		setPropertyOppositeFromEStructuralFeature(feature, eObject, 
			    				prop, rObject, kclass);
			    	}
		    	}
	    	}
	    }
	} 
	/**
	 * From an ecore object and given one feature, sets the corresponding property on the kermeta RuntimeObject side
	 * Do not set the opposite (because in the normal case, this is done by populating the other end objects.
	 * @param eFeature
	 * @param eObject
	 * @param kprop
	 * @param rObject
	 * @param kclass
	 */
	protected void setPropertyFromEStructuralFeature(EStructuralFeature eFeature, EObject eObject,
			Property kprop, RuntimeObject rObject, fr.irisa.triskell.kermeta.language.structure.Class kclass){
		
		
		EClassifier feature_type = eFeature.getEType();
    	// Means that prop does not exist in kermeta side, so do nothing
    	if (kprop != null && !kprop.isIsDerived())
    	{	
    		RuntimeObject roprop = unit.getRuntimeMemory().getRuntimeObjectForFObject(kprop);
    		// eGet can return an elist of features
    		Object fvalue = eObject.eGet(eFeature);
    		RuntimeObject rovalue = null;
    		try
    		{
    			if(fvalue instanceof BasicFeatureMap){
    				Type ftype = getTypeFromEClassifier(feature_type);
					// special case for FeatureMap
					rovalue = createRuntimeObjectForFeatureMap((EList)fvalue, ftype, feature_type, rObject, roprop);
					
				}
    			// A feature with multiplicity
    			else if (fvalue instanceof EList)
    			{	Type ftype = getTypeFromEClassifier(feature_type);
    		    	rovalue = createRuntimeObjectForCollection((EList)fvalue, ftype, feature_type, rObject, roprop);
    			}
    			else if (feature_type instanceof EEnum){
    				// special case of enumeration we must connect it to the enumartion definition instead of creating a RuntimeObject for it
    				String enumName = unit.getEQualifiedName(feature_type);
    				RuntimeObject roEnum = unit.getRuntimeMemory().getTypeDefinitionAsRuntimeObject(enumName);
    				// get the enumliteral
    				String litValue = null;
    				if (fvalue instanceof org.eclipse.emf.common.util.AbstractEnumerator){
    					litValue = ((org.eclipse.emf.common.util.AbstractEnumerator)fvalue).getLiteral();
    				}
    				else if (fvalue instanceof EEnumLiteral)
    					litValue = ((EEnumLiteral)fvalue).getLiteral();
    				else if (fvalue instanceof org.eclipse.emf.common.util.Enumerator){
    					litValue = ((org.eclipse.emf.common.util.Enumerator)fvalue).getLiteral();
    				}
    				else {
    					internalLog.warn("not able to retreive literal value for " + fvalue + ", unable to reconnect to the kermeta definition ...");
    				}
    				RuntimeObject roEnumLit = fr.irisa.triskell.kermeta.runtime.rohelper.EnumerationHelper.getLiteral(roEnum, litValue);
    				rObject.getProperties().put(kprop.getName(), roEnumLit);
    			}
    			// Get the RO-repr of this EObject
    			else if (fvalue instanceof EObject)
    			{   // EFactory is not saved in the model, neither does it refer to a saved element in the model (at the opposite
    				// of all the other transient features), so it will not be loaded
    				// Indeed, EFactory is a typical ecore case that is used for Java compliance..Unusable in kermeta.
    				if (!(fvalue instanceof EFactory))
    				{
    					rovalue = createRuntimeObjectForEObject(rObject, (EObject)fvalue, eFeature);
    					rObject.getProperties().put(kprop.getName(), rovalue);
    				}
    			}
    			
    			// BEGIN EMF Patch
    			// A "null" instanceClassName property must correspond to a "void" RO property and not to an empty string.
    			// Empty string will raise an error during EMF saving.
    			else if(eObject instanceof EClassifier && eFeature.getName().equals("instanceClassName") && fvalue == null) {
    				fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, unit.getRuntimeMemory().voidINSTANCE);
    			}else if(eObject instanceof EClassifier && eFeature.getName().equals("instanceTypeName") && fvalue == null) {
    				fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, unit.getRuntimeMemory().voidINSTANCE);
    			}
    			// END EMF Patch	    			
    			
    			// equivalent test : fvalue instanceof EString, EInt, etc.
    			else if (fvalue == null)
    			{    
    				fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, unit.getRuntimeMemory().voidINSTANCE);
    			}
    			else if (EDataType.class.isInstance(feature_type))
    			{   // EJavaClass -> rovalue null
    				rovalue = createRuntimeObjectForPrimitiveTypeValue(fvalue, (EDataType)feature_type);
    				fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, rovalue);
    			}
    			else
    			{
    				String errmsg = "NotImplemented Error : The type <"+feature_type+"> has not been handled yet. Trying to set "+
    				fvalue+" into "+rObject;	
    				unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
    			}
    			// If we instanciated a RuntimeObject value, we can set the properties for the object
    			// reminder : rovalue is null if fvalue was an instance of EFactory
    			if (fvalue != null && rovalue != null) rovalue.setEmfObject(fvalue);
    		} // Catch any unhandled raised exception
    		catch (Exception e) {
    			String errmsg = "Exception received. Trying to set on " +  rObject  + " this property: " + kprop +" / " + eFeature.getName() + " with value: "+ fvalue;
    			e.printStackTrace();
    			unit.throwKermetaRaisedExceptionOnLoad(errmsg, e);
    		}
    	}
	}
	/**
	 * Deal with the special case where the EObject has no opposite but Kermeta Object does ..
	 * @param eFeature
	 * @param eObject
	 * @param kprop
	 * @param rObject
	 * @param kclass
	 */
	protected void setPropertyOppositeFromEStructuralFeature(EStructuralFeature eFeature, EObject eObject,
			Property kprop, RuntimeObject rObject, fr.irisa.triskell.kermeta.language.structure.Class kclass){
		
		// get the opposite RuntimeObject
		RuntimeObject rOppositeObject =  rObject.getProperties().get(kprop.getName());
		
		// get the runtimeobject for the opposite property
		RuntimeObject rOppositeProperty =  unit.getRuntimeMemory().getRuntimeObjectForFObject(kprop.getOpposite());
		
		// this opposite object might be a collection
		if (kprop.getUpper() > 1 || kprop.getUpper() == -1){
			// for each of the opposite objects
			ArrayList<RuntimeObject> elems = new ArrayList<RuntimeObject>(fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(rOppositeObject));
			for(RuntimeObject rOppCollelem : elems){
				// assign the other side object  
				if(kprop.getOpposite().getUpper() > 1 || kprop.getOpposite().getUpper() == -1){
					// the opposite property is a collection
					RuntimeObject rPropColl = fr.irisa.triskell.kermeta.runtime.language.Object.get(rOppCollelem, rOppositeProperty);
					fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.add(rPropColl, rObject, false);
				}
				else{
					// tells to not use opposite since this has been already done
					fr.irisa.triskell.kermeta.runtime.language.Object.set(rOppCollelem, rOppositeProperty,rObject, false );
				}	
			}
			
		}
		else{
			if(kprop.getOpposite().getUpper() > 1 || kprop.getOpposite().getUpper() == -1){
				// the opposite property is a collection
				RuntimeObject rPropColl = fr.irisa.triskell.kermeta.runtime.language.Object.get(rOppositeObject, rOppositeProperty);
				fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.add(rPropColl, rObject, false);
			}
			else{
				// tells to not use opposite since this has been already done
				fr.irisa.triskell.kermeta.runtime.language.Object.set(rOppositeObject, rOppositeProperty,rObject, false );
			}
		
		}
		
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
		if (getEcoreKermetaMap().containsKey(eclass.getName()+"."+propName) && !unit.isFromEcoreMetaModel())
		{
			tmp_propName = getEcoreKermetaMap().get(eclass.getName()+"."+propName);
			if (tmp_propName.length() != 0)
			{ propName = tmp_propName; propertyExists = true; }
		}
		else propertyExists = true;
		if (propertyExists == true)
		{
			//System.out.println("feature name : " + eclass.getName()+ "."+ feature.getName());
			result = KermetaModelHelper.ClassDefinition.getPropertyByName(classDef, propName);
			// If result is still null, send an exception
			if (result == null)
			{
				if(ignoreAllLoadErrors || ignoreLoadErrorUnknownProperty){
					String errmsg = "Ignoring property due to :  Not able to find '"+ propName+"' property on class " + KermetaModelHelper.ClassDefinition.qualifiedName(classDef) +
					" ; known properties are : ";
					for ( Object prop : KermetaModelHelper.ClassDefinition.getAllProperties(classDef)) 
					{ errmsg += ((Property)prop).getName() + ", "; }
					errmsg += "\n in class \"" + classDef.getName() +"\"";
					errmsg += "\nwith feature == " + feature;
					internalLog.warn(errmsg);
				}
				else{
					String errmsg = "EMF loading error : property set failed.\n  Not able to find '"+ propName+"' property on class " + KermetaModelHelper.ClassDefinition.qualifiedName(classDef) +
					" ; known properties are : ";
					for ( Object prop : KermetaModelHelper.ClassDefinition.getAllProperties(classDef)) 
					{ errmsg += ((Property)prop).getName() + ", "; }
					errmsg += "\n in class \"" + classDef.getName() +"\"";
					errmsg += "\nwith feature == " + feature;
					unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
				}
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
        // If rovalue is still null, take a look at the required stuff.
        if(rovalue==null)
        {
        	
        }
        // If this case occurs, throws a kermeta raised exception with a detailed message.
        if (rovalue==null)
        {
        	String errmsg = "";
        	// troubles in the auto resolve 
        	EObject obj = EcoreUtil.resolve(fvalue, resource.getResourceSet());
        	
        	// fvalue.eResource can sometimes be null.
        	if(fvalue.eIsProxy() && obj.eIsProxy())
			{   	// ie. was a proxy and the proxy was not resolved
				String objectURI =  (fvalue.eResource()!=null)?fvalue.eResource().getURIFragment(fvalue):"";			            	
				errmsg = "Not able to resolve proxy for value: " + fvalue 
					+ " for object: "+rObject +" for feature of type: "+feature.getEType();
				errmsg += (objectURI!=null)?("\nTry to load the file containing this URI: "+objectURI):"";
				EcoreUtil.resolve(fvalue, resource.getResourceSet());
			}
			else
			{	// the feature destination was not in the main resource
        		// this is in fact too late to create the runtime object for an EObject, 
        		// concurrent exception !
				Resource eresource = fvalue.eResource();
				errmsg = "Property '"+ feature.getName() + "' on " +  rObject + " : " +
						 "Not able to find RuntimeObject for a value of this property " +
						 "'" +  feature.getName() +  "' which type is\n    '"+feature.getEType() + "'.\n " +
					     "Trying to set "+ fvalue+" into "+rObject + " "+
							this.runtime_objects_map.size(); 
				if (eresource!=null) errmsg += "\nBe sure to load the file containing this URI: "+eresource.getURIFragment(fvalue);
        	}
        	unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
        }
        // FIXME the set method needs to be reviewed (for model instances?) -> does not work well if we use it here
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
	 * @param typeParam the kermeta type of the feature of which objects are values
	 * @param feature_type the ecore type of the feature of which objects are values. 
	 * @return a Set of objects (Set<typeParam>)
	 */
	public RuntimeObject createRuntimeObjectForCollection(EList objects, Type typeParam, EClassifier feature_type, RuntimeObject rObject, RuntimeObject roprop)
	{
	    RuntimeObject result = fr.irisa.triskell.kermeta.runtime.language.Object.get(rObject, roprop);
	    // We create one by default 
	    if (Collection.getArrayList(result) == null)
	    { 
	    	result.setPrimitiveType(RuntimeObject.COLLECTION_VALUE);
	    	result.setJavaNativeObject(new ArrayList<Object>()); }
	    
	    // Transform the EObjects into RuntimeObject and add them in our collection
	    for (Object fvalue : objects)
	    {
	        RuntimeObject rovalue = null;
	        if (fvalue instanceof EObject)
	            rovalue = (RuntimeObject) this.runtime_objects_map.get(fvalue);
	        else if (feature_type instanceof EDataType)// it is a Datatype
	        {
	            rovalue = createRuntimeObjectForPrimitiveTypeValue(fvalue, (EDataType)feature_type);
	        }
	        if (rovalue != null)
	        {	// RuntimeObject ri = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, memory.getROFactory());
		        // ReflectiveSequence.addAt(result, ri, rovalue); i+=1;) |OR| ReflectiveCollection.add(result, rovalue);
		        // NOTE 1 : FIXME : ReflectiveSequence.addAt and ReflectiveCollection.add handle differently and weirdly 
		        // the containment of the added element. (see their code!). That's why we use the simple Collection.add method
		        // NOTE 2 : sometimes createRuntimeObjectForPrimitiveTypeValue can return null if the "sfeature"
		        // is not kermeta compliant, ex: the edatatype EJavaClass. We ignore it for the moment
		        rovalue.setEmfObject(fvalue);
		        Collection.add(result, rovalue);
	        }
	    }
	    rObject.getProperties().put((String)((RuntimeObject)roprop.getProperties().get("name")).getJavaNativeObject(), result);
	    // FIXME : the set method handles the containment, but seems to be not appropriated for 
	    // model instances. Containment is observed even if we simply use Collection.add to add instances
	    // since result is still a reflective collection.
	    //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, result);
	    return result;
	}

	
	/**
	 * Create a RuntimeObject that represent a feature map .
	 * actually it create a simple collection of FeatureMapEntry (ie. objects that have featurename as key and the entry as value)
	 * We need to create in "purely" in java when we have an instance of which one of its properties
	 * has an upperBound that is * or a number > 1
	 * Adds the list of objects given in arguments, and create a collection which type parameter is typeParam.
	 * 
	 * @param objects a list of EObjects that represent a property[0..*] of elements of type typeParam
	 * @param typeParam the kermeta type of the feature of which objects are values
	 * @param feature_type the ecore type of the feature of which objects are values. 
	 * @return a Set of objects (Set<typeParam>)
	 */
	public RuntimeObject createRuntimeObjectForFeatureMap(EList objects, Type typeParam, EClassifier feature_type, RuntimeObject rObject, RuntimeObject roprop)
	{
	    RuntimeObject result = fr.irisa.triskell.kermeta.runtime.language.Object.get(rObject, roprop);
	    // is this a collection ?
	    RuntimeObject propUpper = RuntimeObjectHelper.getPropertyByName(roprop,"upper");
	    int upperVal = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(
	    		fr.irisa.triskell.kermeta.runtime.language.Object.get(roprop,propUpper));

	    // usual case : this is a collection
	    if(upperVal != 1){
		    // We create one by default 
		    if (Collection.getArrayList(result) == null)
		    { 
		    	result.setPrimitiveType(RuntimeObject.COLLECTION_VALUE);
		    	result.setJavaNativeObject(new ArrayList<Object>()); }
		    
		    // Transform the EObjects into RuntimeObject and add them in our collection
		    for (Object fvalue : objects)
		    {
		    	RuntimeObject featureMapEntry = createRuntimeObjectForFeatureMapEntry(fvalue);
		    	// RuntimeObject ri = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, memory.getROFactory());
		        // ReflectiveSequence.addAt(result, ri, rovalue); i+=1;) |OR| ReflectiveCollection.add(result, rovalue);
		        // NOTE 1 : FIXME : ReflectiveSequence.addAt and ReflectiveCollection.add handle differently and weirdly 
		        // the containment of the added element. (see their code!). That's why we use the simple Collection.add method
		        // NOTE 2 : sometimes createRuntimeObjectForPrimitiveTypeValue can return null if the "sfeature"
		        // is not kermeta compliant, ex: the edatatype EJavaClass. We ignore it for the moment
		        //rovalue.getData().put("emfObject", fvalue);
		        //Collection.add(result, featureMapEntry);
		    	// DVK june 2009, try ReflectiveCollection again but filter multiplicity == 1
		    	ReflectiveCollection.add(result, featureMapEntry);
		        
		    }
		    rObject.getProperties().put((String)((RuntimeObject)roprop.getProperties().get("name")).getJavaNativeObject(), result);
		    // FIXME : the set method handles the containment, but seems to be not appropriated for 
		    // model instances. Containment is observed even if we simply use Collection.add to add instances
		    // since result is still a reflective collection.
		    //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, result);
	    }
	    else{
	    	// this is not a collection 
	    	// even if FeatureMap is a list, the associated attribute has a multiplicity == 1
	    	if(objects.size() > 1){
				internalLog.warn(" strange, we have more than one FeatureMapEntry to put in a FeatureMap with a multiplicity == 1");
	    		
	    	}
	    	if(objects.size() == 1){
	    		RuntimeObject featureMapEntry = createRuntimeObjectForFeatureMapEntry(objects.get(0));
	    		result = featureMapEntry;
	    		fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, result);
	    	}
	    	
	    }
	    return result;
	}
	
	/**
	 * @param fvalue
	 * @return
	 */
	public RuntimeObject createRuntimeObjectForFeatureMapEntry(Object fvalue){
		RuntimeObject featureMapEntry = null;
        BasicFeatureMapEntry mapEntry= null;
        if(fvalue instanceof BasicFeatureMapEntry){
    		//internalLog.warn("The type of BasicFeatureMapEntry <"+fvalue+"> has not been handled yet. Replaced by Void.");
    		
    		//rovalue = rofactory.getMemory().voidINSTANCE;
    		mapEntry = (BasicFeatureMapEntry)fvalue;
    	//	mapEntry.getEStructuralFeature()
    	}
        else{
        	String errmsg = "FeatureMap contains something different from BasicFeatureMapEntry please contact kermeta developpers ...";	        
        	//e.printStackTrace();
        	unit.throwKermetaRaisedExceptionOnLoad(errmsg, null);
        }
        
        // create the FeatureMapEntry
        RuntimeObject ro_metaclass;
        String kermeta_metaclass_name = "kermeta::ecore::EFeatureMapEntry";
        if (this.type_cache.containsKey(kermeta_metaclass_name)) 
        	ro_metaclass = this.type_cache.get(kermeta_metaclass_name);
    	else
    	{	
    		Type ftype = this.getTypeFromName(kermeta_metaclass_name);
    		//fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)ftype;
    		ro_metaclass = unit.getRuntimeMemory().getRuntimeObjectForFObject(ftype);
    		this.type_cache.put(kermeta_metaclass_name, ro_metaclass);
    	}
	    // Define the RO-instance of the given EObject, with the above given RO-metaclass
	    featureMapEntry = new RuntimeObjectImpl(unit.getRuntimeMemory().getROFactory(), ro_metaclass);
        // set its key using the feature name
	    RuntimeObject rofeaturenameprop = RuntimeObjectHelper.getPropertyByName(featureMapEntry,"eStructuralFeatureName");
	    RuntimeObject rofeaturename = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(mapEntry.getEStructuralFeature().getName(), unit.getRuntimeMemory().getROFactory());
		fr.irisa.triskell.kermeta.runtime.language.Object.set(featureMapEntry, rofeaturenameprop, rofeaturename);
        // set its value
	    RuntimeObject rofeaturevalueprop = RuntimeObjectHelper.getPropertyByName(featureMapEntry,"value");
	    Object entryvalue = mapEntry.getValue();
	    rofeaturevalueprop = RuntimeObjectHelper.getPropertyByName(featureMapEntry,"value");
	    //RuntimeObject rofeaturevalue = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(mapEntry.getValue(), unit.getRuntimeMemory().getROFactory());
		//fr.irisa.triskell.kermeta.runtime.language.Object.set(featureMapEntry, rofeaturevalueprop, rofeaturevalue);

        if (entryvalue instanceof EObject)
        	fr.irisa.triskell.kermeta.runtime.language.Object.set(featureMapEntry, rofeaturevalueprop, (RuntimeObject) this.runtime_objects_map.get(entryvalue));
        else if (mapEntry.getEStructuralFeature().getEType() instanceof EDataType)// it is a Datatype
        {
        	RuntimeObject roentryvalue = createRuntimeObjectForPrimitiveTypeValue(entryvalue, (EDataType)mapEntry.getEStructuralFeature().getEType());
        	fr.irisa.triskell.kermeta.runtime.language.Object.set(featureMapEntry, rofeaturevalueprop, 
        			roentryvalue);
	        
        }
        if(entryvalue ==  null){
        	// I suppose that this should nt occur ?
        	fr.irisa.triskell.kermeta.runtime.language.Object.set(featureMapEntry, rofeaturevalueprop, 
        			unit.getRuntimeMemory().voidINSTANCE);
        }
        return featureMapEntry;
	}
	
	
	/**
	 * Get or create (if it does not exist) the RuntimeObject for the given EClass, and put it 
	 * in the runtime unit. The class is found in the unit typedef_cache or put in it if it was not
	 * found in it. We use it to define instances of metaclass type.
	 * @param metaclass The EClass to "convert" in a RuntimeObject
	 * @param unit The runtime unit we are working with
	 * @return the RuntimeObject embedding the Kermeta FClass equivalent to the given EClass
	 * @throws UnknownMetaclassException 
	 */
	public RuntimeObject getRuntimeObjectForMetaClass(EClass metaclass) throws UnknownMetaclassException
	{
	    RuntimeObject result = null;
	    String metaclass_name = unit.getEQualifiedName(metaclass);
	    // If the given metaclass is an EEnum (ecore), we have to "convert" it in Enumeration (kermeta)
	    if (getEcoreKermetaMap().containsKey(metaclass_name) && !unit.isFromEcoreMetaModel()) 
	    {
	    	String kermeta_metaclass_name = (String)getEcoreKermetaMap().get(metaclass_name);
	    	if (this.type_cache.containsKey(kermeta_metaclass_name)) 
		        result = this.type_cache.get(kermeta_metaclass_name);
	    	else
	    	{	
	    		Type ftype = this.getTypeFromName(kermeta_metaclass_name);
	    		// fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)ftype;
	    		
	    		if ((this.ignoreAllLoadErrors ||this.ignoreLoadErrorUnknownMetaclass) && ftype == null){
	    			// we had to ignore this kind of object return null ...
	    			result = null; //unit.getRuntimeMemory().getRuntimeObjectForFObject(ftype);
	    			throw new UnknownMetaclassException(metaclass_name, "Cannot retreive RuntimeObject for metaclass "+metaclass_name);
	    		}
	    		else{
	    			// normal case
	    			result = unit.getRuntimeMemory().getRuntimeObjectForFObject(ftype);
	    			this.type_cache.put(metaclass_name, result);
	    		}
	    	}
	    }
	    else if (this.type_cache.containsKey(metaclass_name)) 
	    {
	        result = this.type_cache.get(metaclass_name);
	    }
	    else
	    {   
	    	Type ftype = this.getTypeFromEClassifier(metaclass);
	    	if ( ftype == null){
    			// we had to ignore this kind of object return null
    			result = null; // unit.getRuntimeMemory().getRuntimeObjectForFObject(ftype);
    			throw new UnknownMetaclassException("Cannot retrieve RuntimeObject for metaclass "+metaclass_name, metaclass_name);
    		}
    		else{
    			// normal case
    			fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)ftype;
		        result = unit.getRuntimeMemory().getROFactory().createMetaClass(fclass);
		        this.type_cache.put(metaclass_name, result);
    		}
	    }
	    return result;
	}
}
