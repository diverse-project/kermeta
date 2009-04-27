/* $Id: Runtime2EMF.java,v 1.79 2008-09-24 13:51:09 dvojtise Exp $
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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.KmPackage;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectHelper;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * This class converts models that were created by the user through the
 * persistence library into EMF models, saved in XMI format.
 */
public class Runtime2EMF {

	final static public Log internalLog = LogConfigurationHelper
			.getLogger("KMT.Runtime2EMF");

	final static public String ECORE_NSURI = "http://www.eclipse.org/emf/2002/Ecore";

	final static public String KERMETA_NSURI = "http://kermeta/kermeta.ecore";

	/** this list contains all the RuntimeObject that are updated during this transformation
	 * 
	 */
	protected HashSet<RuntimeObject> runtimeObjectsToUpdate;
	
	/**
	 * Traceability for the object that will be updated, if filled, the text indicates from which object, the 
	 * action of updating comes from
	 */
	protected Hashtable<RuntimeObject,String> runtimeObjectsToUpdateTrace = new Hashtable<RuntimeObject,String>();

	
	/**
	 * List of the properties that need to be sorted because the collection is ordered
	 */
	List<SortPropertyCommand> propertiesToSort = new ArrayList<SortPropertyCommand>();

	protected EMFRuntimeUnit unit;

	protected Resource resource;
	
	// { name_of_enumeration : an EEnumeration }
	protected Hashtable<String, EEnum> eenum_map;

	/**
	 * { qualified name of ecore type : qualified name of kermeta type }
	 */
	protected static Hashtable<String, String> kermeta_ecore_map;

	public static Hashtable<String, String> getKermetaEcoreMap() {
		if (kermeta_ecore_map == null) {
			kermeta_ecore_map = new Hashtable<String, String>();
			kermeta_ecore_map.put("kermeta::language::structure::Enumeration",
					"ecore::EEnum");
			kermeta_ecore_map.put(
					"kermeta::language::structure::EnumerationLiteral",
					"ecore::EEnumLiteral");
			// Map for the properties of EEnumLiteral for EnumerationLiteral
			// FIXME : deprecated
			kermeta_ecore_map.put("enumeration", "eEnum");
			kermeta_ecore_map.put("name", "name");
			kermeta_ecore_map.put("tag", "eAnnotations");
			kermeta_ecore_map.put("ownedLiteral", "eLiterals");
		}
		return kermeta_ecore_map;
	}

	/**
	 * The constructor, that initialize <code>unit</code> and
	 * <code>updatedRuntimeObjects</code> attributes.
	 * 
	 * @param unit
	 *            the EMFRuntimeUnit that hosts the contents of the model to
	 *            save
	 * @param p_resource
	 *            the resource that hosts the model to save. It is actually
	 *            empty...
	 */
	public Runtime2EMF(EMFRuntimeUnit p_unit, Resource p_resource) {
		this.runtimeObjectsToUpdate = new HashSet<RuntimeObject>();
		this.unit = p_unit;
		this.resource = p_resource;
		this.eenum_map = new Hashtable<String, EEnum>();
	}

	/**
	 * Update the EMFModel from the attribute RuntimeUnit <code>unit</code>.
	 * This is the main method called for the EMF model update.
	 * 
	 * @param resource
	 */
	public void updateEMFModel(boolean saveWithNewURI) {
		// Get the RuntimeObjects from the return result of external call of
		// save() method (in Kermeta side)
		// Important : *On save process*, unit.getContentMap contains the
		// "instances" collection (which equals contentMap entry "rootContents").
		if (unit.getContentMap() == null) return; //there is nothing to update here, the resource was created but never loaded 
			// and nothing added to it. this is still useful in some case since it may help emf to save dependent files 
		internalLog.info("updateEMFModel : updating " + unit.getUriAsString());
		
		ArrayList<RuntimeObject> instances = Collection.getArrayList(unit.getContentMap());
		// Get each instance and convert it in an EObject
		// (Instances only contain the root elements of the resource to save)
		internalLog.debug("updateEMFModel phase 1 : create a list of all RuntimeObject that are involved ");
		int processedElements = 0;
		
		for (RuntimeObject ro : instances)
		{ fillRuntimeObjectToUpdateList(ro); }
		internalLog.info("Saving " + instances.size()+"/"+ runtimeObjectsToUpdate.size()+ " objects from " + resource.getURI().toString() +  " and its dependencies ");
		
		propertiesToSort.clear();
		
		// Now that we have the complete list of runtime objects, we can update
		// the properties of each of those runtime objects. The mapping between
		// RuntimeObject and EObject to update is done through the
		// entry { "r2e.emfObject" : EObject } in RuntimeObject.data hashtable.
		internalLog.debug("updateEMFModel phase 2 : get/create the associated EObject, update the properties ");
		for (RuntimeObject ro : runtimeObjectsToUpdate)
		{	
			setEObjectPropertiesFromRuntimeObject( ro); 
			processedElements++;
		}

		// sort the properties that are ordered
		for( SortPropertyCommand spc : propertiesToSort){
			spc.run();
		}
		
		// Add the root elements to the XMI resource
		// Note: r2e.emfObject entry is only used for eObject retrieval during the
		// save process!
		for (RuntimeObject o : instances)
		{	
			if ( ! saveWithNewURI ) {
				if ( o.getResourceRO().getProperties().get("uri").getJavaNativeObject().equals(resource.getURI().toString()) )
					/*
					 * 
					 * Maybe during the execution, the resource of the instances may have changed.
					 * Therefore, we need to check if the current resource is the resource of the instance.
					 * If it is true, let's update the instance, otherwise we do nothing because it will be done later.
					 * 
					 */
					resource.getContents().add((EObject) o.getR2eEmfObject());				
			} else
				resource.getContents().add((EObject) o.getR2eEmfObject());
		}	
	}

	/**
	 * Update the EMFModel from the attribute RuntimeUnit <code>unit</code>.
	 * This is the main method called for the EMF model update.
	 * 
	 * @param resource
	 */
	public void updateEMFModelResourceContainment() {
		if (unit.getContentMap() == null) return; //there is nothing to update here, the resource was created but never loaded 
		// and nothing added to it. this is still useful in some case since it may help emf to save dependent files 
		
		ArrayList<RuntimeObject> instances = Collection.getArrayList(unit.getContentMap());
		// Add the root elements to the XMI resource
		// Note: r2e.emfObject entry is only used for eObject retrieval during the
		// save process!
		for (RuntimeObject o : instances)
		{	
			resource.getContents().add((EObject) o.getR2eEmfObject());
		}
	}
	/**
	 * Get or create the EMFObjects recursively, from the root element ("root
	 * element" is by opposition to property element). Method for the 1st pass
	 * of conversion from RuntimeObjects to EObjects : we don't yet update
	 * completely each object. A second pass is done for this purpose in the
	 * method simpleUpdateProperty
	 * 
	 * Ignore RO that belong to another Resource, as the save call the updateEMFModel on each of the other resources
	 * they are already updated by themselves
	 */
	protected void fillRuntimeObjectToUpdateList(RuntimeObject rObject)
	{ 
		if ( !(runtimeObjectsToUpdate.contains(rObject) || 
				RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(rObject) != null
					|| RuntimeObjectHelper.isanEnumerationLiteral(rObject)
					|| RuntimeObjectHelper.isanEnumeration(rObject)) )
		{
			EObject kcoreObject = (EObject)rObject.getKCoreObject(); 
			if(kcoreObject != null){
				String kcoreIdentification = kcoreObject.eClass().getName();
				if(kcoreObject instanceof NamedElement){
					kcoreIdentification +=  " named " + ((NamedElement)kcoreObject).getName();
				}
				// the model to save contains references to the definition level
				// a model must not mix levels. The definition should be loaded separately, then the model car refer it.
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ResourceMixedLevelsException",
		    			"You can't save a model that refers to elements from the currently running program definition since they may not exist in a physical km file.\n" +
		    			"Please make sure to load and retrieve the element (" + kcoreIdentification +") directly from a resource.",
		    			this.unit.getRuntimeMemory().getInterpreter().getBasicInterpreter(),
		    			this.unit.getRuntimeMemory(),
		    			null);				
			}
			EObject emfObject = (EObject)rObject.getEmfObject();
			if(emfObject != null){
				if(emfObject.eResource() != null){
					// has been registered in emf ? we cannot modify/update it !!!
					// espacillay we should not update http://www.eclipse.org/emf/2002/Ecore
					if(EMFRegistryHelper.isRegistered(emfObject.eResource().getURI())){
						internalLog.info("Ignoring update of object " + ((EObject)rObject.getEmfObject()).eClass().getName() + " that comes from an ecore registered package: "+emfObject.eResource().getURI().toString());
						return;
					}
					if("http://www.eclipse.org/emf/2002/Ecore".equals(emfObject.eResource().getURI().toString())){
						// we really don't want to modify the metameta model we are working on ...
						internalLog.info("     Ignoring update of Ecore internal object : "+((EObject)rObject.getEmfObject()).eClass().getName());
						return; //platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.ecore
					}
					// normally we should not update/modify objects that comes from a plugin ? ...
					/*if("platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km".equals(emfObject.eResource().getURI().toString())){
						internalLog.debug("     Ignoring update of kermeta framework.km internal object : "+((EObject)rObject.getEmfObject()).eClass().getName());
						return; //platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.ecore
					}*/
					/* DVK : this suppose that framework.ecore should be registered ...
					if("platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.ecore".equals(emfObject.eResource().getURI().toString())){
						internalLog.debug("     Ignoring update of kermeta framework internal object : "+((EObject)rObject.getEmfObject()).eClass().getName());
						return; //platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.ecore
					}*/
				}
				if(this.unit.associatedResource != fr.irisa.triskell.kermeta.runtime.language.Object.getContainingResource(rObject) ){
					if(fr.irisa.triskell.kermeta.runtime.language.Object.getContainingResource(rObject) != rObject.getFactory().getMemory().voidINSTANCE){			
						// Ignore RO that belong to another Resource, as the save call the updateEMFModel on each of the other resources
						//  they are already updated by themselve 
						RuntimeObject nameString = rObject.getProperties().get("name");
						if(nameString != null) {
							internalLog.info(" ignore update of Ecore internal object named : " + fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameString));
						}
						else 
							internalLog.info(" ignore update of Ecore internal object : ");
						return;
					}				
				}
			}
			////////////////////////////////////////////////////////
			// BEGIN PATCH dealing with unsynchronized containing
			// resource between RO and associated emf object(s)
			RuntimeObject resRO = fr.irisa.triskell.kermeta.runtime.language.Object.getContainingResource(rObject);
			Resource refRes = fr.irisa.triskell.kermeta.runtime.basetypes.Resource.getEmfResource(resRO);
			
			EObject eObj = (EObject) rObject.getEmfObject();
			if(eObj != null){
				Resource res = eObj.eResource();
				if(res != null) {
					if(res != refRes) {
						res.getContents().remove(eObj);
					}
				}
			}
			eObj = (EObject) rObject.getR2eEmfObject();
			if(eObj != null){
				Resource res = eObj.eResource();
				if(res != null) {
					if(res != refRes) {
						res.getContents().remove(eObj);
					}
				}
			}
			// END PATCH
			////////////////////////////////////////////////////////
			
			
			runtimeObjectsToUpdate.add(rObject);
				
				
			// Now, get the RO repr. of the properties of this object
			for (String prop_name : rObject.getProperties().keySet())
			{
				// Get the RuntimeObject value of property given by prop_name
				RuntimeObject property = (RuntimeObject) rObject.getProperties().get(prop_name);
				fillRuntimeObjectToUpdateListWithProperty(property, rObject.toString() + "."+ prop_name);
			}
		}
	}

	/**
	 * Get or create eobject for properties recursively. Method for the 1st pass
	 * of conversion from RuntimeObjects to EObjects.
	 * 
	 * @param property
	 * @param originTrace a string message to help identify which object asked to update this property values
	 */
	protected void fillRuntimeObjectToUpdateListWithProperty(RuntimeObject property, String originTrace) {
		// If property is an EList ([m..n] where n>1)
		if (RuntimeObject.COLLECTION_VALUE.equals( property.getPrimitiveType())
				&& property.getJavaNativeObject() != null)
		{   // For each feature of the collection of features
			//for (RuntimeObject next : ((ArrayList<RuntimeObject>) property.getData().get("CollectionArrayList")))
			for (RuntimeObject next : Collection.getArrayList(property)){
				runtimeObjectsToUpdateTrace.put(next, originTrace);
				fillRuntimeObjectToUpdateList( next);
			}
		}
		// If property is not an EList
		else {
			runtimeObjectsToUpdateTrace.put(property, originTrace);
			fillRuntimeObjectToUpdateList(property);
		}
	}


	/**
	 * Set the values previously retrieved by findEMFObject... to their owning
	 * eObjects. rObject should never be a reference to a primitive type.
	 * @param rObject
	 */
	protected void setEObjectPropertiesFromRuntimeObject( RuntimeObject rObject) {
		EObject eObject = createEObjectFromRuntimeObject(rObject);
		if(eObject != null) 
			if(eObject.equals(rObject.getKCoreObject()))
			{
				//	do not update objects from the framework it self (this is may be due to bug #156 the reflexion seem to not be complete and the save crashes ...
				internalLog.debug("     Ignoring update of framework EObject : "+eObject.eClass().getName());
				return ;
			}
		if (eObject == null) // cannot continue
			unit.throwKermetaRaisedExceptionOnSave(
					"Could not find an EClass for RuntimeObject : " + rObject
					+ "\n   properties : "	+ rObject.getProperties() + ";"
					+ "\n   origin : "	+ runtimeObjectsToUpdateTrace.get(rObject) + ";"
					+ "\n   possible reason : the RuntimeObject has a weird type? Please check '"
					+ unit.getMetaModelUri() + "'", null);
		EStructuralFeature feature = null;
		internalLog.debug("  setting property of  "+ rObject + "; \t" +	eObject);
		// Get all the Structural features of requested eObject
		// must sort the properties to make sure that if we have subset (ecore anotation) then the higher 
		// level set must be processed first
		java.util.List<String> sortedProperty = sortProperties(rObject.getProperties().keySet(), eObject);		
		//for (String prop_name : rObject.getProperties().keySet()) {
		for (String prop_name : sortedProperty) {
			String eprop_name = prop_name;
			// Special handling -> convert kermeta-Enumeration in ecore-EEnum
			RuntimeObject property = (RuntimeObject) rObject.getProperties().get(prop_name);
			/*if (getKermetaEcoreMap().containsValue(unit.getEQualifiedName(eObject.eClass())))
				eprop_name = getKermetaEcoreMap().get(prop_name);*/

			// The feature corresponding to the name of the property
			feature = eObject.eClass().getEStructuralFeature(eprop_name);
			// Now get the property eObject (it should not be created in fact)
			// If feature is null, it means that it is a transient feature,
			// that only exists in kermeta metamodel representation
			if (feature != null && feature.isChangeable())
			{
				// Unset the old value of feature in case it was recycled from a previous load
				// DVK note: unsetting like this implies that opposite properties are unset and set twice ...
				//   This may look not efficient, but I'm not sure weither we would have better performance by doing this in a separate pass because this would lead to 
				//	 special code to deal with collection that accept non-unique value, in addition to the cost of the second pass ...
				try {
					eObject.eUnset(feature);
				}
				catch(UnsupportedOperationException uoe ){
					unit.throwKermetaRaisedExceptionOnSave(
							"UnsupportedOperationException, Problem unsetting : " + feature
							+ "\n   on "	+ eObject + ";"
							+ "\n   possible reason : bug in EMF, maybe inverting some inheritance in your metamodel may solve it",
							uoe);
				}
				// If the feature is a collection of Objects
				if (RuntimeObject.COLLECTION_VALUE.equals(property.getPrimitiveType())&& 
						property.getJavaNativeObject()!=null)
				{
					
					// For each feature of the collection of features
					ArrayList<RuntimeObject> colArr = (ArrayList<RuntimeObject>) property.getJavaNativeObject();
					//for(int i = colArr.size()-1; i >= 0 ; i--)
					for(int i = 0; i <= colArr.size()-1 ; i++)
					{
						RuntimeObject rcoll = colArr.get(i);
						Object p_o = getOrCreatePropertyFromRuntimeObject( rcoll, feature);
						
						if (p_o != null) {
							//internalLog.debug("    adding "+ eObject.eClass().getName() + "."  + feature.getName() + " =  "+ rcoll.getProperties().toString());
							//((EList<Object>) eObject.eGet(feature)).add(0,p_o); 
							((EList<Object>) eObject.eGet(feature)).add(p_o);
						}
					}
					if(colArr.size()>1 )
						internalLog.debug("     "+ rObject + "; \n\t" +
							eObject + "; \n\t" +
							eObject.eClass().getName() + "."  + feature.getName() + 
							"; num. of elts in feature : " + ((EList) eObject.eGet(feature)).size());					
					if(feature.isOrdered() && colArr.size()>1){
						this.propertiesToSort.add(new SortPropertyCommand(rObject, colArr, eObject, feature));
						//internalLog.debug("We will need to make sure that collection "+ eObject.eClass().getName() + "."  + feature.getName() + " is correctly ordered");
					}
				}
				else // EObject, EClass, EDataType
				{
					Object p_o = getOrCreatePropertyFromRuntimeObject(property, feature);
					/*if(p_o instanceof EnumerationLiteral)
						p_o = getOrCreatePropertyFromRuntimeObject(property, feature);*/
					//EObject eObject2 = (EObject) p_o;
					eObject.eSet(feature, p_o);	
					//internalLog.debug("    setting "+ eObject.eClass().getName() + "."  + feature.getName() + " = " + p_o.toString() + " on  "+ rObject.getProperties().toString());
					if (p_o == null) {
						internalLog.warn("    setting null to "+ eObject.eClass().getName() + "."  + feature.getName() + "");}
				}
			}
			
		}
	}

	/** sort the properties according to the subsets annotation
	 * a subset property will be after the more general property
	 * this is for fixing bug #7660
	 * @return
	 */
	private java.util.List<String> sortProperties(java.util.Set<String> unsortedPropertyNames, EObject eObject){
		
		boolean isAnEcoreModel = unit.getMetaModelResource().getURI().toString().equals("http://www.eclipse.org/emf/2002/Ecore");
		
		java.util.List<String> sortedProperty = new java.util.LinkedList<String>();		
		for (String prop_name : unsortedPropertyNames){
			//todo
			// The feature corresponding to the name of the property
			EStructuralFeature feature = eObject.eClass().getEStructuralFeature(prop_name);
			int insertionIndex = 0; // normally add at the beginning of the list
			EAnnotation subsetsAnnotation = feature.getEAnnotation("subsets");
			if(subsetsAnnotation != null){
				// must insert before the subsetting properties if already in the list
				
				for(EObject eobj : subsetsAnnotation.getReferences()){
					if (eobj instanceof ENamedElement){
						ENamedElement namedElem = (ENamedElement)eobj;
						int subsettingPropIndex = sortedProperty.indexOf(namedElem.getName());
						if (subsettingPropIndex != -1 && subsettingPropIndex >= insertionIndex) insertionIndex = subsettingPropIndex+1;
					}
				}
				
			}
			else{
				if(isAnEcoreModel){
					// deal with the special eType and eGenericType, the generic contains more information that the eType
					// so it must be saved after
					if(feature.getName().equals("eGenericType")){
						int subsettingPropIndex = sortedProperty.indexOf("eType");
						if (subsettingPropIndex != -1 && subsettingPropIndex >= insertionIndex) insertionIndex = subsettingPropIndex+1;
					}
					else if(feature.getName().equals("eGenericSuperType")){
						int subsettingPropIndex = sortedProperty.indexOf("eSuperType");
						if (subsettingPropIndex != -1 && subsettingPropIndex >= insertionIndex) insertionIndex = subsettingPropIndex+1;
					}
					else if(feature.getName().equals("eGenericExceptions")){
						int subsettingPropIndex = sortedProperty.indexOf("eExceptions");
						if (subsettingPropIndex != -1 && subsettingPropIndex >= insertionIndex) insertionIndex = subsettingPropIndex+1;
					}
				}
			}
			// add at the specifyeid position (0 if no special case occur)
			sortedProperty.add(insertionIndex,prop_name);
		}
		return sortedProperty;
	}
	/**
	 * A derivated version of getOrCreateObjectFromRuntimeObject adapted to the
	 * creation of property (feature). Indeed, a property can be either an
	 * EObject, an EList, or an instance of EDataType
	 */
	protected Object getOrCreatePropertyFromRuntimeObject(RuntimeObject rProperty, EStructuralFeature feature)
	{
		Object result = null;
		if (RuntimeObjectHelper.isaCollection(rProperty))
			result = createEListFromRuntimeObject(rProperty);
		// a EDataType?
		else if (RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(rProperty) != null)
			result = RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(rProperty);
		else if (RuntimeObjectHelper.isanEnumerationLiteral(rProperty) == true){
			/*if(unit.getEQualifiedName(feature.getEType()).equals("kermeta::standard::Object")){
				// for some unknown reason, the type has been mapped to a simple java object
				// the reflexivity won't work
				// the only way to retrieve the enumeration is to navigate in the metamodel resource 
				result = createEEnumLiteralFromRuntimeObjectWithResource(rProperty,			
						unit.getMetaModelResource());
			}
			else*/
			if(feature.getEType().getInstanceClass() !=  null){			
				// this enumeration has its own implementation must use it ...
				/*if(feature.getEType() instanceof EJavaObject)
				{
					feature.getEType().isInstance(org.eclipse.emf.ecore.EEnum);
					EJavaObject ejo = feature.getEType(); 
				}*/
				result = createGeneratedClassLiteralFromEnumRuntimeObject(rProperty,
						feature.getEType());
			}
			else if(feature.getEType().eResource().getURI().toString().equals(KmPackage.eNS_URI) /* "http://www.kermeta.org/kermeta/1_2_0//kermeta"*/){
				// this is a special case of writing a km file, so we need to find the enum in the km and not a EEnum
				result = createEObjectFromRuntimeObjectWithResource(rProperty,
						feature.getEType().eResource());
			}
			else {
				 // DVK: maybe we can improve this by retreiving the EEnum directly in the feature.getEType() rather than looking for it in the resource ?
				 result = createEEnumLiteralFromRuntimeObjectWithResource(rProperty,			
					feature.getEType().eResource());
			}
		}
		// by default, an EObject instance of an EClass
		else if (feature.getEType() instanceof EClass) { 
			// Important note: once the objects are created (using the metamodel given
			// by the user in kermeta side)
			// we have to use the metamodel hosted by the resource
			// (eobject.eResource())
			// implicitely loaded by EMF instead of our own resource
			// (unit.getMetamodelResource)
			// please do not modify this (it is *intentional* now :P).
			result = createEObjectFromRuntimeObjectWithResource(rProperty,
					feature.getEType().eResource());
		}
		// - If it is an EDatatype that is not a "PrimitiveType" (see
		// getPrimitiveTypeValue)?
		// - Example of case handled here : (see 003_testEnum.kmt in
		// fr.irisa.triskell.kermeta.tests)
		// rProperty : [ecore::EEnumLiteral : 841] into an EMF type.
		// feature.getEType() == org.eclipse.emf.ecore.impl.EDataTypeImpl@7af3e0
		// (name: EEnumerator)
		// (instanceClassName: org.eclipse.emf.common.util.Enumerator)
		// (serializable: false))
		else if (feature.getEType() instanceof EDataType) {
			result = rProperty.getR2eEmfObject();
			
		
		} 
		else if(feature.getEType() == null){
			String ownerString = feature.eContainer() instanceof ENamedElement ? ((ENamedElement)(feature.eContainer())).getName() : feature.eContainer().toString();
			String msg = "problem with property : " + rProperty
				+ "; the corresponding feature in your emf metamodel ("+ ownerString + "." +feature.getName()+ ") has no EType, please check your metamodel" ;
			unit.throwKermetaRaisedExceptionOnSave(msg, null);
		} 
		else {			
		
			String msg = "cannot convert : " + rProperty
					+ " into an EMF type. (classifier : " + feature.getEType()
					+ ")";
			unit.throwKermetaRaisedExceptionOnSave(msg, null);
		}
		return result;
	}

	/**
	 * @param property
	 * @return
	 */
	private EList<?> createEListFromRuntimeObject(RuntimeObject property) {
		java.util.Collection<?> arraylist = Collection.getArrayList(property);
		return new BasicEList<Object>(arraylist);
	}

	/**
	 * Create an eObject corresponding to the given RuntimeObject. Update the
	 * emfObject entry in the RuntimeObject. The object is created using the
	 * metamodel given by the user when he calls
	 * <code>repository.createResource("<model_url>", "<metamodel_url>")</code>
	 * 
	 * @param rObject
	 *            the runtimeObject that we want to serialize
	 * @return the eObject corresponding to this rObject
	 */
	public EObject createEObjectFromRuntimeObject(RuntimeObject rObject) {
		// maybe the object to create is not from this resource
		// fall back to this resource only if we cannot find it for this runtime object
		Resource res = unit.getMetaModelResource();
		// find the resource that should create 
		EObject result = createEObjectFromRuntimeObjectWithResource(rObject, res);
		if(result != null) return result;
		
		internalLog.debug("not able to create an EObject from " + rObject + " using resource " + res.toString() + "; let's try the other resources of the repository.");		
		// was not able to create the object using the definition in the Resource metamodel
		// maybe it need to try definitions of metamodel from the other resources of the repository
			// retreives the repository
		RuntimeObject roRepository = (RuntimeObject) unit.associatedResource.getProperties().get("repository");
		RuntimeObject roResources = (RuntimeObject) roRepository.getProperties().get("resources");
		//for (RuntimeObject next : ((ArrayList<RuntimeObject>) roResources.getData().get("CollectionArrayList"))) 
		for (RuntimeObject next : Collection.getArrayList(roResources))
		{
			RuntimeObject roResource =  next;
			if (roResource != unit.associatedResource){ // ignore the main resource metamodel
				String res_uri = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) roResource.getProperties().get("metaModelURI"));						
				res = unit.loadMetaModelAsEcore(res_uri);
				
				result = createEObjectFromRuntimeObjectWithResource(rObject, res);
				if(result != null){ 
					internalLog.debug("   finally able to create an EObject from " + rObject + " using resource " + res.toString() );
					return result; // if it worked, don't try other resources				
				}
				internalLog.debug("   still not able to create an EObject from " + rObject + " using resource " + res.toString() + "...");		
				
			}
		}
		
		return result;
		
	}

	/** 
	 * 
	 * @param rObject
	 * @param p_resource The resource of the metamodel of the model we want to save.
	 * @return
	 */
	protected EObject createEObjectFromRuntimeObjectWithResource(
			RuntimeObject rObject, Resource p_resource) {
		EObject result = null;
		// Get the meta class of the instance hosted by given runtime object
		fr.irisa.triskell.kermeta.language.structure.Class metaclass = (fr.irisa.triskell.kermeta.language.structure.Class) rObject
				.getMetaclass().getKCoreObject();
		// Get the qualified name of this meta class
		String kqname = NamedElementHelper.getQualifiedName(
				metaclass.getTypeDefinition());

		if (rObject.getR2eEmfObject() == null)
		{	// If we did not find the Eclass, then we could try to find it in
			// the ecore metamodel resource (unless the metamodel is Kermeta metamodel)
			if (getKermetaEcoreMap().containsKey(kqname)  &&  
					!((EPackage) p_resource.getContents().get(0)).getName().equals("kermeta")) 
			{ // this is a patch-like solution :/ for handling ecore metamodel types
				if (getKermetaEcoreMap().get(kqname).equals("ecore::EEnum"))
				{
					String enum_name = (String) rObject.getProperties().get("name").getJavaNativeObject();
					result = getEEnumFromQualifiedName(enum_name, p_resource);
					if(result == null){
						internalLog.warn("Problem with enumerations need to fix that !!!");
					}
					else rObject.setR2eEmfObject(result);
				}
			} 
			else if( rObject.getEmfObject() != null){
				// this object was loaded from a resoure 
				// do not create a new EMF object, reuse the existing one (in order to keep the resource)				
				result = (EObject)rObject.getEmfObject();
				rObject.setR2eEmfObject( result);
				
			}
			else
			{
				EClass eclass = this.getEClassFromFQualifiedName(kqname, p_resource);
				if(eclass == null && kqname.equals("ecore::EFeatureMapEntry")){
					// special case of EFeatureMapEntry
					// this is because some model may be dependent of ecore only for this reason
					// retreive the EStructuralFeature
					EStructuralFeature structFeat;
					// retreive the object
					//result = FeatureMapUtil.createEntry(structFeat,);
					rObject.setR2eEmfObject(result);
					// TODO DVK deal with FeatureMap when saving files
				}
				else if (eclass == null){
					// maybe the metaclass is not in this metamodel
					// this occurs when a metamodel uses references of type EObject, 
					// or when EMF fails to load the dependent part of the metamodel (and then the getAllContent doesn't traverse it
					// so let' try the other metamodel resources of the other resource in the same Repository
					// TODO
				}
				if (eclass != null)
				{
					result = EcoreUtil.create(eclass);
					rObject.setR2eEmfObject( result);
				}
				else {
					// this is an error, we haven't been able to create the object because we haven't retreived its metaclass
				
				}
				
			}
			// if (rObject.getR2eEmfObject() == null)
			// else : null eclass occurs when the object type is a primitive
			// type or an enumeration , or a special type,
			// like ecore::EAnnotation, which is not handled properly
		} else
			result = (EObject) rObject.getR2eEmfObject();
		return result;
	}

	/**
	 * allow to create the expected object from an Enumeration
	 * this is used when the object to create is driven with a InstanceClassName
	 * @param rObject
	 * @param type
	 * @return
	 */
	protected Object createGeneratedClassLiteralFromEnumRuntimeObject(
			RuntimeObject rObject, EClassifier type) {
		Object result = null;
		String enum_literal_name = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) rObject
				.getProperties().get("name"));
		try {
			Class<?> c = type.getInstanceClass();
			// we suppose this is an abstract enumerator ... and that it has a method getByName
			Method m = c.getMethod("getByName", String.class);
			// Get the name of the enumeration literal element
			
			result = m.invoke(c, (enum_literal_name));
		} catch (Exception e) {
			
			if(type.eResource().getURI().toString().equals(KmPackage.eNS_URI)){ /* "http://www.kermeta.org/kermeta/1_2_0//kermeta"*/
				internalLog.debug("not able to create the enumeration literal concrete object for instanceClass "+type.getInstanceClassName()+ " for " +
						enum_literal_name	+
						", let's try as an EObject", null);
				// this is a special case of writing a km file, so we need to find the enum in the km and not a EEnum
				result = createEObjectFromRuntimeObjectWithResource(rObject, type.eResource());
			}
			else {
				internalLog.debug("not able to create the enumeration literal concrete object for instanceClass "+type.getInstanceClassName()+ " " + enum_literal_name +
						", let's try as an EEnumLiteral", e);
				result = createEEnumLiteralFromRuntimeObjectWithResource(rObject, type.eResource());
			}
		}
		return result;
	}
	
	/**
	 * create a "normal" EEnumLiteral from an enumeration, create it in the target resource ...
	 * @param rObject
	 * @param p_resource
	 * @return
	 */
	protected EEnumLiteral createEEnumLiteralFromRuntimeObjectWithResource(
			RuntimeObject rObject, Resource p_resource) {		
		
		EEnumLiteral result = null;
		// 1) get the "enumeration" property of this object.
		RuntimeObject ro_enumeration = rObject.getProperties().get("enumeration");
		String ro_enumeration_name = (String) ro_enumeration.getProperties()
				.get("name").getJavaNativeObject();
		// 2) get its eenum ecore equivalence
		EEnum current_eenum = getEEnumFromQualifiedName(ro_enumeration_name, p_resource);
		// Get the name of the enumeration literal element
		String enum_literal_name = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) rObject
				.getProperties().get("name"));
		result = getEEnumLiteralFromQualifiedNameInEnumeration(
				enum_literal_name, current_eenum);
		// note : do not get the old r2e.emfObject if there existed one :
		// successive load/save methods make
		// them unvalid -> different location in memory from a load to another.
		rObject.setR2eEmfObject(result);
		return result;
	}

	/**
	 * Get the EClass corresponding to the kermeta qualified name
	 * 
	 * @param kqname
	 *            the name of which we look for the corresponding in Ecore
	 *            meta-model
	 * @param res
	 *            the resource of the meta-model of the model to save. if null,
	 *            the one given by the user is taken
	 * @param unit
	 *            the RuntimeUnit that contain the correspondance table between
	 *            kermeta object names and emf serialised object names.
	 * @return the EClass in the ecore meta-model given by the user for
	 *         serialization of its model
	 */
	protected EClass getEClassFromFQualifiedName(String kqname, Resource res) {
		EClass result = null;
		TreeIterator<?> it = res.getAllContents();
		// Is it a special converted kermeta type (which metamodel is NOT kermeta)
		while (it.hasNext() && result == null) {
			EObject obj = (EObject) it.next();
			if (obj instanceof EClass) {
				if (unit.getEQualifiedName((EClass) obj).equals(kqname)){
					result = (EClass) obj;
					return result; // do not continue visiting the resource if we have found it
				}
			}
		}
		// If it was not found, maybe it is an Ecore Type? (like EEnum,
		// EEnumeration literal....)
		return result;
	}

	protected EEnumLiteral getEEnumLiteralFromQualifiedNameInEnumeration(
			String kqname, EEnum eenum) {
		EEnumLiteral result = null;
		// FIXME : enum_name must be "qualified" (with its owning package
		for (Object o : eenum.getELiterals()) {
			EEnumLiteral elit = (EEnumLiteral) o;
			if (elit.getName().equals(kqname))
				result = elit;
		}
		return result;
	}

	protected EEnum getEEnumFromQualifiedName(String enum_name, Resource res) {
		EEnum result = null;
		if (eenum_map.containsKey(enum_name))
			result = eenum_map.get(enum_name);
		else {
			TreeIterator<?> it = res.getAllContents();
			// Is the enum literal available in the metamodel?
			while (it.hasNext() && result == null) {
				EObject obj = (EObject) it.next();
				if (obj instanceof EEnum) {
					EEnum eenum = (EEnum) obj;
					// FIXME : enum_name must be "qualified" (with its owning
					// package
					if (eenum.getName().equals(enum_name)) {
						result = eenum;
						eenum_map.put(enum_name, result);
					}
				}
			}
		}
		return result;
	}

	




	/**
	 * tool function
	 * 
	 * @return the name property of the runtime object if available
	 */
	public static String getRONameProp(RuntimeObject rObject) {
		RuntimeObject roName = (RuntimeObject) rObject.getProperties().get(
				"name");
		return roName == null ? "" : (String) roName.getJavaNativeObject();
	}

	/**
	 * @return Returns the resource.
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource
	 *            The resource to set.
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}
}