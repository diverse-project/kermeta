/* $Id: Resource.java,v 1.2 2005-07-12 16:30:34 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : Resource.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitLoader;

/**
 * This class is intended to "wrap" the resource management from kermeta.
 */
public class Resource {

    // Implementation of method load called as :
    // extern fr::irisa::triskell::kermeta::runtime::basetypes::Resource.load(uri, type)
    // This creates a RuntimeUnit adapted to the given type (we are expecting from type "EMF", "MDR"),
    // Which "handles" a Collection of instances, represented as a RuntimeObject
    /**
     * @param uri : a RuntimeObject that encapsulates a Kermeta string
     * @param resourceType : the type of the resource
     * @return a RuntimeObject that encapsulates a collection of instances of the 
     * model given by its uri.
     */
    public static RuntimeObject load(RuntimeObject uri, RuntimeObject resourceType)
    {
        RuntimeObject instances = null;
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(String.getValue(uri));
        return runtime_unit.getInstances();
    }
    
    /**
     * Save the resource "self" into its uri attributes, unless newUri is given
     * (not null)
     * @param self the runtimeObject representing the Resource to save.
     * @param newUri the newUri : if it is null, than the default attribute uri is used,
     * otherwise, we save the resource in it.
     * @return void instance
     */
    public static RuntimeObject save(RuntimeObject self, RuntimeObject newUri)
    {
        // TODO : to implement
        throw new Error("NotImplementedCustomError : this method is not implemented yet");
        /*
        return resource.getFactory().getMemory().voidINSTANCE;
        */
    }
    /**
     * 
     * @param uri
     * @param resourceType
     * @return
     */
    public static RuntimeObject load(RuntimeObject uri, RuntimeObject mmUri, RuntimeObject resourceType, RuntimeObject emptyInstances)
    {
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(String.getValue(uri), String.getValue(mmUri), emptyInstances);
        return runtime_unit.getInstances();
    }
    
    
}
