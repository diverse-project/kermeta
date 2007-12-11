/* $Id: Resource.java,v 1.18 2007-12-11 13:57:51 cfaucher Exp $
 * Project   : Kermeta (First iteration)
 * File      : Resource.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.basetypes;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.generic.DiffMaker;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.statistic.DifferencesServices;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitLoader;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;


// Get the namespace
// ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI().
// If you're looking for hooks during parsing, XMLHandler.getPackageForURI is used to map a namespace to the right package.

/**
 * This class is intended to "wrap" the resource management from kermeta.
 */
public class Resource {
    
    /**
     * Save the resource "self" into its uri attributes, unless newUri is given
     * (not null)
     * @param self the runtimeObject representing the instances (of the Resource) to save.
     * @param newUri the newUri : if it is null, than the default attribute uri is used,
     * otherwise, we save the resource in it.
     * @return void instance
     */
    public static RuntimeObject save(
    		RuntimeObject self,
    		RuntimeObject newUri, 
    		RuntimeObject mmUri, 
    		RuntimeObject resourceType, 
    		RuntimeObject instances,
    		RuntimeObject mustValidate)
    {
        // runtime unit handles the transformation Kermeta2EMFInstance
        java.lang.String str_uri = String.getValue(newUri);
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(str_uri, String.getValue(mmUri), instances);
        runtime_unit.associatedResource = self;
        runtime_unit.setMustValidate(Boolean.getValue(mustValidate));
	    runtime_unit.save(str_uri);
        return instances.getFactory().getMemory().voidINSTANCE;
    }
    
    /**
     *  Implementation of method load called as :
     * extern fr::irisa::triskell::kermeta::runtime::basetypes::Resource.load(uri, type)
     * This creates a RuntimeUnit adapted to the given type (we are expecting from type "EMF", "MDR"),
     * Which "handles" a Collection of instances, represented as a RuntimeObject  
     * @param self the resource itself  
     * @param uri the uri of the EMF model to load
     * @param mmUri the uri of the Ecore meta-model of which EMF model is an 
     *        instance; it can be an empty string. In such a case, the meta model uri
     * 		  is retrieved from the model.
     * @param resourceType the resource type represented as a String (precisely, 
     * a RuntimeObject embedding a String) ("EMF", "MDR")
     * @param emptyInstances the runtimeObject representing the collection of instances
     * @param cmap the content map pre-initialized in kermeta source code.
     * of the EMF Model, once loaded
     * @return The emptyMap, filled in.
     */
    public static RuntimeObject load(
			RuntimeObject self,
			RuntimeObject uri,
			RuntimeObject mmUri, 
			RuntimeObject resourceType)
    {
    	// Set "contentMap" property of resource RO
    	GenericTypeDefinition mapClassDef  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::utils::Hashtable");
    	
	    GenericTypeDefinition stringClassDef  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::String");
	    fr.irisa.triskell.kermeta.language.structure.Class stringClass = StructureFactory.eINSTANCE.createClass();
	    stringClass.setTypeDefinition(stringClassDef);

    	GenericTypeDefinition objClassDef  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::reflection::Object");
	    fr.irisa.triskell.kermeta.language.structure.Class objClass = StructureFactory.eINSTANCE.createClass();
	    objClass.setTypeDefinition(objClassDef);
	    
	    GenericTypeDefinition setClassDef  = (GenericTypeDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Set");
	    fr.irisa.triskell.kermeta.language.structure.Class setClass = StructureFactory.eINSTANCE.createClass();
	    setClass.setTypeDefinition(setClassDef);
	    
	    fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding4set = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    tvBinding4set.setType(objClass);
	    tvBinding4set.setVariable( (TypeVariable) setClassDef.getTypeParameter().get(0) );
	    setClass.getTypeParamBinding().add(tvBinding4set);
	    
	    fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding4map1 = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    tvBinding4map1.setType(stringClass);
	    tvBinding4map1.setVariable( (TypeVariable) mapClassDef.getTypeParameter().get(0) );
	    
	    fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding4map2 = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    tvBinding4map2.setType(setClass);
	    tvBinding4map2.setVariable( (TypeVariable) mapClassDef.getTypeParameter().get(1) );
	    
	    fr.irisa.triskell.kermeta.language.structure.Class mapClass = StructureFactory.eINSTANCE.createClass();
	    mapClass.setTypeDefinition(mapClassDef);
	    mapClass.getTypeParamBinding().add(tvBinding4map1);
	    mapClass.getTypeParamBinding().add(tvBinding4map2);
	    
	    RuntimeObject metaclassRO = self.getFactory().getMemory().getRuntimeObjectForFObject(mapClass);
    	RuntimeObject emptyMapRO = new RuntimeObjectImpl(self.getFactory(), metaclassRO);
   	
    	Hashtable<RuntimeObject, RuntimeObject> ht = new Hashtable<RuntimeObject, RuntimeObject>();

    	ht.put(
    		fr.irisa.triskell.kermeta.runtime.basetypes.String.create("rootContents", self.getFactory()),
    		fr.irisa.triskell.kermeta.runtime.basetypes.Collection.create("kermeta::standard::Set", self.getFactory(), objClass)
    	);
    	ht.put(
    		fr.irisa.triskell.kermeta.runtime.basetypes.String.create("allRootContents", self.getFactory()),
    		fr.irisa.triskell.kermeta.runtime.basetypes.Collection.create("kermeta::standard::Set", self.getFactory(), objClass)
    	);
    	ht.put(
    		fr.irisa.triskell.kermeta.runtime.basetypes.String.create("contents", self.getFactory()),
    		fr.irisa.triskell.kermeta.runtime.basetypes.Collection.create("kermeta::standard::Set", self.getFactory(), objClass)
    	);
    	ht.put(
    		fr.irisa.triskell.kermeta.runtime.basetypes.String.create("allContents", self.getFactory()),
    		fr.irisa.triskell.kermeta.runtime.basetypes.Collection.create("kermeta::standard::Set", self.getFactory(), objClass)
    	);
    	
    	emptyMapRO.setPrimitiveType(RuntimeObject.HASHTABLE_VALUE);
    	emptyMapRO.setJavaNativeObject(ht);
    	emptyMapRO.getProperties().put("contentMap", emptyMapRO);

    	
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(String.getValue(uri), String.getValue(mmUri), emptyMapRO);

        //
        runtime_unit.load(self);
        
        return self.getFactory().getMemory().voidINSTANCE;
    }
    
    
    /**
     * This methods computes the set of resources the contextual resource depends on
     * @param selfRO         - RO for the current resource
     * @param uriRO          - RO for the uri of the resource
     * @param mmUriRO        - RO for the metamodel uri of the resource
     * @param resourceTypeRO - RO for the string characterizing the type of te resource
     * @return               - RO for the returned set of dependent resources
     */
    public static RuntimeObject getDependentResources(
			RuntimeObject selfRO,
			RuntimeObject uriRO,
			RuntimeObject mmUriRO, 
			RuntimeObject resourceTypeRO)
    {
    	// Default return value
    	RuntimeObject result = selfRO.getFactory().getMemory().voidINSTANCE;
    	
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
    		getConcreteFactory(String.getValue(resourceTypeRO)).
    		createRuntimeUnit(String.getValue(uriRO), String.getValue(mmUriRO), null);
        
        if(runtime_unit instanceof EMFRuntimeUnit) {
        	EMFRuntimeUnit emfUnit = (EMFRuntimeUnit) runtime_unit;
 
        	// Compute list of EMF dependent resources (include self emf resource) 
        	EList<org.eclipse.emf.ecore.resource.Resource> emfDependentResources =
        		emfUnit.findDependentResources(
        			getEmfResource(selfRO)
 				);
        	
        	// Allocate a new RO of type Set<Resource>
        	GenericTypeDefinition resClassDef  = (GenericTypeDefinition)selfRO.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::persistence::Resource");
    	    fr.irisa.triskell.kermeta.language.structure.Class resClass = StructureFactory.eINSTANCE.createClass();
    	    resClass.setTypeDefinition(resClassDef);
    	    
    	    GenericTypeDefinition setClassDef  = (GenericTypeDefinition)selfRO.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Set");
    	    fr.irisa.triskell.kermeta.language.structure.Class setClass = StructureFactory.eINSTANCE.createClass();
    	    setClass.setTypeDefinition(setClassDef);
    	    
    	    fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding4set = StructureFactory.eINSTANCE.createTypeVariableBinding();
    	    tvBinding4set.setType(resClass);
    	    tvBinding4set.setVariable( (TypeVariable) setClassDef.getTypeParameter().get(0) );
    	    setClass.getTypeParamBinding().add(tvBinding4set);
    	    
    	    RuntimeObject metaclassRO = selfRO.getFactory().getMemory().getRuntimeObjectForFObject(setClass);
    	    result = new RuntimeObjectImpl(selfRO.getFactory(), metaclassRO);
    	    
    	    // Get corresponding list of resource ROs
    	    ArrayList<RuntimeObject> resultList = (ArrayList<RuntimeObject>) fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(result); 
    	    
    	    // Get list of resources contained by the Repository
    	    RuntimeObject repRO = selfRO.getProperties().get("repository");
    	    RuntimeObject resourcesRO = repRO.getProperties().get("resources");
    	    ArrayList<RuntimeObject> roList = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resourcesRO);
    	    
    	    // Iterate over resources contained by the Repository
    	    for(Object next : roList) {
    	    	RuntimeObject crtRO = (RuntimeObject) next;
    	    	org.eclipse.emf.ecore.resource.Resource crtRes = getEmfResource(crtRO);
    	    	
    	    	// Test whether current resource belongs to the set computed set of dependent resources
    	    	// and is different from contextual resource
    	    	if(crtRO != selfRO && emfDependentResources.contains(crtRes)) {
    	    		resultList.add(crtRO);
    	    	}
    	    }
        }
        
    	return result;
    }

    
    /**
     * This method provides access to the emf Resource associated with the provided
     * resource RO
     * @param selfRO - Resource runtime object
     * @return       - emf Resource associated with the provided resource RO, or null
     */
    public static org.eclipse.emf.ecore.resource.Resource getEmfResource(RuntimeObject selfRO) {
    	return (org.eclipse.emf.ecore.resource.Resource) selfRO.getR2eEmfResource();
    }
    
    
    
    /*** START ********************************/
    /*** METHODS FOR THE EMF_COMPARE DRIVER ***/
    /******************************************/
    
    public static RuntimeObject getDiff(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		
		// Convert the 2 uris passed as arguments into String
		java.lang.String leftModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self);
		java.lang.String rightModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0);
		java.lang.String diffModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param1);
		
		try {
			ModelUtils.save(getDiffModel(leftModelPath, rightModelPath), ResourceHelper.cleanIfNecessaryPath(diffModelPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	public static RuntimeObject getMatch(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		
		// Convert the 2 uris passed as arguments into String
		java.lang.String leftModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self);
		java.lang.String rightModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0);
		java.lang.String matchModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param1);
		
		try {
			ModelUtils.save(getMatchModel(leftModelPath, rightModelPath), ResourceHelper.cleanIfNecessaryPath(matchModelPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	private static DiffModel getDiffModel(java.lang.String leftModelPath, java.lang.String rightModelPath) {
		final DiffModel diff = new DiffMaker().doDiff(getMatchModel(leftModelPath, rightModelPath));
		return diff;
	}
	
	
	private static MatchModel getMatchModel(java.lang.String leftModelPath, java.lang.String rightModelPath) {

		try {
			// Register the extensions, we are not the two files are the same extension, also we try to register the two extensions
			EMFRuntimeUnit.registerEMFextensionToFactoryMap(leftModelPath);
			EMFRuntimeUnit.registerEMFextensionToFactoryMap(rightModelPath);
			
			// Loads the two models passed as arguments
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
	        URI left_u = URI.createURI(leftModelPath);
	        left_u = new URIConverterImpl().normalize(left_u);
	        org.eclipse.emf.ecore.resource.Resource left_resource = resourceSet.getResource(left_u, true);
	        final EObject model1 = left_resource.getContents().get(0);
	        
	        URI right_u = URI.createURI(rightModelPath);
	        right_u = new URIConverterImpl().normalize(right_u);
	        org.eclipse.emf.ecore.resource.Resource right_resource = resourceSet.getResource(right_u, true);
	        final EObject model2 = right_resource.getContents().get(0);
			
			// Creates the match then the diff model for those two models
			final MatchModel match = new DifferencesServices().modelMatch(model1, model2, new NullProgressMonitor());
			
			return match;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param result_dir
	 * @param result_fileName
	 */
	public static RuntimeObject compare(RuntimeObject self, RuntimeObject param0) {

		// Convert the 2 uris passed as arguments into String
		java.lang.String leftModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self);
		java.lang.String rightModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0);
		
		boolean res = false;
		
		if(((DiffGroup) getDiffModel(leftModelPath, rightModelPath).getOwnedElements().get(0)).getSubchanges()> 0) {
			res = false;
		} else {
			res = true;
		}
		
		// Convert the result of the method into RuntimeObject
		if(res) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;

	}
	
	
	/**
	 * FIXME CF unused for the moment
	 */
    private static RuntimeObject saveInMemory(
    		RuntimeObject self,
    		RuntimeObject newUri, 
    		RuntimeObject mmUri, 
    		RuntimeObject resourceType, 
    		RuntimeObject instances,
    		RuntimeObject mustValidate)
    {
        // runtime unit handles the transformation Kermeta2EMFInstance
        java.lang.String str_uri = String.getValue(newUri);
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(str_uri, String.getValue(mmUri), instances);
        runtime_unit.associatedResource = self;
        runtime_unit.setMustValidate(Boolean.getValue(mustValidate));
	    runtime_unit.save(str_uri);
        return instances.getFactory().getMemory().voidINSTANCE;
    }
	
	/*** END **********************************/
    /*** METHODS FOR THE EMF_COMPARE DRIVER ***/
    /******************************************/
	
}
