/* $Id: Runtime2EMF.java,v 1.47 2006-11-16 14:10:16 dvojtise Exp $
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
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

//import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectHelper;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class converts models that were created by the user through the
 * persistence library into EMF models, saved in XMI format.
 */
public class Runtime2EMF {

	final static public Logger internalLog = LogConfigurationHelper
			.getLogger("KMT.Runtime2EMF");

	final static public String ECORE_NSURI = "http://www.eclipse.org/emf/2002/Ecore";

	final static public String KERMETA_NSURI = "http://kermeta/kermeta.ecore";

	// Put in this list all the RuntimeObject that were already updated
	protected ArrayList<RuntimeObject> runtimeObjects;

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
		this.runtimeObjects = new ArrayList<RuntimeObject>();
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
	public void updateEMFModel() {
		// Get the RuntimeObjects from the return result of external call of
		// save() method (in Kermeta side)
		// Important : *On save process*, unit.getContentMap contains the
		// "instances" collection (which equals contentMap entry "rootContents").
		if (unit.getContentMap() == null) return; //there is nothing to update here, the resource was created but never loaded 
			// and nothing added to it. this is still useful in some case since it may help emf to save dependent files 
		ArrayList<RuntimeObject> instances = Collection.getArrayList(unit.getContentMap());
		// Get each instance and convert it in an EObject
		// (Instances only contain the root elements of the resource to save)
		internalLog.debug("updateEMFModel phase 1 : create a list of all RuntimeObject that are involved ");
		for (RuntimeObject ro : instances)
		{ fillRuntimeObjectList(ro); }
		// Now that we have the complete list of runtime objects, we can update
		// the properties of each of those runtime objects. The mapping between
		// RuntimeObject and EObject to update is done through the
		// entry { "r2e.emfObject" : EObject } in RuntimeObject.data hashtable.
		internalLog.debug("updateEMFModel phase 2 : get/create the associated EObject, update the properties ");
		for (RuntimeObject ro : runtimeObjects)
		{	setEObjectPropertiesFromRuntimeObject(ro); }

		
		
		// Add the root elements to the XMI resource
		// Note: emfObject2 entry is only used for eObject retrieval during the
		// save process!
		for (RuntimeObject o : instances)
		{	resource.getContents().add(o.getData().get("r2e.emfObject")); }	
	}

	/**
	 * Get or create the EMFObjects recursively, from the root element ("root
	 * element" is by opposition to property element). Method for the 1st pass
	 * of conversion from RuntimeObjects to EObjects : we don't yet update
	 * completely each object. A second pass is done for this purpose in the
	 * method simpleUpdateProperty
	 */
	protected void fillRuntimeObjectList(RuntimeObject rObject)
	{
		if ( !(runtimeObjects.contains(rObject) || 
				RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(rObject) != null
					|| RuntimeObjectHelper.isanEnumerationLiteral(rObject)
					|| RuntimeObjectHelper.isanEnumeration(rObject)) )
		{
			EObject kcoreObject = (EObject)rObject.getData().get("kcoreObject");
			if(kcoreObject != null){
				// ignore objects from the kermeta program itself but only if it comes from a model				
				// ie. that where loaded and typechecked => they should not be changed dynamicaly
				// this greatly improve the performance of the save ...
				if (kcoreObject.eResource() != null){
					internalLog.debug("     Ignoring update of Kermeta interpreter internal ClassDefinition EObject : "+((EObject)rObject.getData().get("kcoreObject")).eClass().getName());
					return;
				}
			}
			runtimeObjects.add(rObject);
			// Now, get the RO repr. of the properties of this object
			for (String prop_name : rObject.getProperties().keySet())
			{
				// Get the RuntimeObject value of property given by prop_name
				RuntimeObject property = (RuntimeObject) rObject.getProperties().get(prop_name);
				fillRuntimeObjectListWithProperty(property);
			}
		}
	}

	/**
	 * Get or create eobject for properties recursively. Method for the 1st pass
	 * of conversion from RuntimeObjects to EObjects.
	 * 
	 * @param eObject
	 * @param prop_name
	 * @param property
	 */
	protected void fillRuntimeObjectListWithProperty(RuntimeObject property) {
		// If property is an EList ([m..n] where n>1)
		if (property.getData().containsKey("CollectionArrayList")
				&& property.getData().get("CollectionArrayList") != null)
		{   // For each feature of the collection of features
			for (Object next : ((ArrayList) property.getData().get("CollectionArrayList")))
				fillRuntimeObjectList((RuntimeObject) next);
		}
		// If property is not an EList
		else fillRuntimeObjectList(property);
	}

	/**
	 * Set the values previously retrieved by findEMFObject... to their owning
	 * eobjects. rObject should never be a reference to a primitive type.
	 * @param rObject
	 */
	protected void setEObjectPropertiesFromRuntimeObject(RuntimeObject rObject) {
		EObject eObject = createEObjectFromRuntimeObject(rObject);
		if(eObject != null) 
			if(eObject.equals(rObject.getData().get("kcoreObject")))
			{
				//	do not update objects from the framework it self (this is may be due to bug #156 the reflexion seem to not be complete and the save crashes ...
				internalLog.debug("     Ignoring update of framework EObject : "+eObject.eClass().getName());
				return;
			}
		EStructuralFeature feature = null; 
		
		// Get all the Structural features of requested eObject
		for (String prop_name : rObject.getProperties().keySet()) {
			// eObject cannot be null, if rObject refers to a primitive type
			if (eObject == null)
				unit.throwKermetaRaisedExceptionOnSave(
						"Could not find an EClass for RuntimeObject : " + rObject
						+ "\n   properties : "	+ rObject.getProperties() + ";"
						+ "\n   possible reason : the RuntimeObject has a weird type? Please check '"
						+ unit.getMetaModelUri() + "'", null);
			String eprop_name = prop_name;
			// Special handling -> convert kermeta-Enumeration in ecore-EEnum
			RuntimeObject property = (RuntimeObject) rObject.getProperties().get(prop_name);
			if (getKermetaEcoreMap().containsValue(unit.getEQualifiedName(eObject.eClass())))
				eprop_name = getKermetaEcoreMap().get(prop_name);

			// The feature corresponding to the name of the property
			feature = eObject.eClass().getEStructuralFeature(eprop_name);
			// Now get the property eObject (it should not be created in fact)
			// If feature is null, it means that it is a transient feature,
			// that only exists in kermeta metamodel representation
			if (feature != null && feature.isChangeable())
			{
				// Unset the old value of feature
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
				if (property.getData().get("CollectionArrayList")!=null)
				{
					// For each feature of the collection of features
					for (Object rcoll : ((ArrayList) property.getData().get("CollectionArrayList")))
					{
						Object p_o = getOrCreatePropertyFromRuntimeObject((RuntimeObject) rcoll, feature);
						if (p_o != null) { ((EList) eObject.eGet(feature)).add(p_o); }
					}
					internalLog.debug("     "+ rObject + "; \n\t" +
							eObject + "; \n\t" +
							eObject.eClass().getName() + "."  + feature.getName() + 
							"; num. of elts in feature : " + ((EList) eObject.eGet(feature)).size());
				}
				else // EObject, EClass, EDataType
				{
					Object p_o = getOrCreatePropertyFromRuntimeObject(property, feature);
					eObject.eSet(feature, p_o);
					if (p_o == null) {
						internalLog.warn("    setting null to "+ eObject.eClass().getName() + "."  + feature.getName() + "");}
				}
			}
			
		}
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
		else if (RuntimeObjectHelper.isanEnumerationLiteral(rProperty) == true)
			result = createEEnumLiteralFromRuntimeObjectWithResource(rProperty,
					feature.getEType().eResource());
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
			result = rProperty.getData().get("r2e.emfObject");
		} else {
			String msg = "could not convert : " + rProperty
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
	private EList createEListFromRuntimeObject(RuntimeObject property) {
		java.util.Collection arraylist = Collection.getArrayList(property);
		return new BasicEList(arraylist);
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
		return createEObjectFromRuntimeObjectWithResource(rObject, unit.getMetaModelResource());
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
				.getMetaclass().getData().get("kcoreObject");
		// Get the qualified name of this meta class
		String kqname = NamedElementHelper.getQualifiedName(
				metaclass.getTypeDefinition());

		if (rObject.getData().get("r2e.emfObject") == null)
		{	// If we did not find the Eclass, then we could try to find it in
			// the ecore metamodel resource (unless the metamodel is Kermeta metamodel)
			if (getKermetaEcoreMap().containsKey(kqname)  &&  
					!((EPackage) p_resource.getContents().get(0)).getName().equals("kermeta")) 
			{ // this is a patch-like solution :/ for handling ecore metamodel types
				if (getKermetaEcoreMap().get(kqname).equals("ecore::EEnum"))
				{
					String enum_name = (String) rObject.getProperties().get("name").getData().get("StringValue");
					result = getEEnumFromQualifiedName(enum_name, p_resource);
					rObject.getData().put("r2e.emfObject", result);
				}
			} 
			else if( rObject.getData().containsKey("emfObject")){
				// this object was loaded from a resoure 
				// do not create a new EMF object, reuse the existing one (in order to keep the resource)				
				result = (EObject)rObject.getData().get("emfObject");
				rObject.getData().put("r2e.emfObject", result);
				
			}
			else
			{
				EClass eclass = this.getEClassFromFQualifiedName(kqname, p_resource);
				if (eclass != null)
				{
					result = EcoreUtil.create(eclass);
					rObject.getData().put("r2e.emfObject", result);
				}
			}
			// if (rObject.getData().get("r2e.emfObject") == null)
			// else : null eclass occurs when the object type is a primitive
			// type or an enumeration , or a special type,
			// like ecore::EAnnotation, which is not handled properly
		} else
			result = (EObject) rObject.getData().get("r2e.emfObject");
		return result;
	}

	protected EEnumLiteral createEEnumLiteralFromRuntimeObjectWithResource(
			RuntimeObject rObject, Resource p_resource) {
		EEnumLiteral result = null;
		// 1) get the "enumeration" property of this object.
		RuntimeObject ro_enumeration = rObject.getProperties().get("enumeration");
		String ro_enumeration_name = (String) ro_enumeration.getProperties()
				.get("name").getData().get("StringValue");
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
		rObject.getData().put("r2e.emfObject", result);
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
		TreeIterator it = res.getAllContents();
		// Is it a special converted kermeta type (which metamodel is NOT kermeta)
		while (it.hasNext() && result == null) {
			EObject obj = (EObject) it.next();
			if (obj instanceof EClass) {
				if (unit.getEQualifiedName((EClass) obj).equals(kqname))
					result = (EClass) obj;
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
			TreeIterator it = res.getAllContents();
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
		return roName == null ? "" : (String) roName.getData().get(
				"StringValue");
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