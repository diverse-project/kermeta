/* $Id: RuntimeUnitLoader.java,v 1.2 2005-07-12 09:27:41 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : RuntimeUnitLoader.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnitFactory;

/**
 * This is a singleton that delegates the creation of a runtime unit to its appropriate factory
 */
public class RuntimeUnitLoader {

    public static RuntimeUnitLoader defaultLoader;
    public Hashtable factories;

    private RuntimeUnitLoader()
    {
        factories = new Hashtable();
    }
    
    /**
     * Create a singleton of this class if it does not exist
     * @return
     */
    public static RuntimeUnitLoader getDefaultLoader() 
    {
        if (defaultLoader == null)
        {
            defaultLoader = new RuntimeUnitLoader();
            
            defaultLoader.factories.put("EMF", new EMFRuntimeUnitFactory());
            // When MDRRuntimeUnitFactory is created!
            //defaultLoader.factories.put("MDR", new MDRRuntimeUnitFactory());
        }
        return defaultLoader;
    }
    
    /**
     * Get the concrete factory that is dedicated to the creation of the RuntimeObjects
     * of an instance-model corresponding to the given resourceType
     * @param resourceType
     * @return
     */
    public RuntimeUnitFactory getConcreteFactory(String resourceType)
    {
        return (RuntimeUnitFactory)getDefaultLoader().factories.get(resourceType);
    }
    

    
}
