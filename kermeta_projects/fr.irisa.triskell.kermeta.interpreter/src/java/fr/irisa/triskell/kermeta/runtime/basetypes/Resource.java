/* $Id: Resource.java,v 1.10 2007-03-08 14:16:37 cfaucher Exp $
 * Project   : Kermeta (First iteration)
 * File      : Resource.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.basetypes;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitLoader;


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
    		RuntimeObject uri,
    		RuntimeObject mmUri, 
    		RuntimeObject resourceType, RuntimeObject emptyMap)
    {
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(String.getValue(uri), String.getValue(mmUri), emptyMap);
        // 
        runtime_unit.load();
        return runtime_unit.getContentMap();
    }
    
 
    
}
