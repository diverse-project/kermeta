/* $Id: RuntimeUnitFactory.java,v 1.3 2006-02-09 12:04:57 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : RuntimeUnitFactory.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * Abstract/ Deferred Factory that defers the creation of an object to the appropriate
 * Concrete factory. This is a magic factory...
 */
public abstract class RuntimeUnitFactory {

    /** This one could replace the other constructor later */
    public abstract RuntimeUnit createRuntimeUnit(String uri, RuntimeObject emptyInstances);

    /**
     * @param emptyInstances
     * @param emptyMap 
     * @param value
     * @param value2
     * @return
     */
    public abstract RuntimeUnit createRuntimeUnit(String pUri, String mmUri, RuntimeObject emptyInstances);
    /** create a runtime unit with pre-created content map. */
    //public abstract RuntimeUnit createRuntimeUnit(String pUri, String mmUri, RuntimeObject emptyInstances, RuntimeObject emptyMap);

    /**
     * The RuntimeMemory necessary to store the runtime object inside it ..
     *
     */
    protected RuntimeMemory memory;
    
    /*
     * ACCESSORS
     *
     */
    
    /**
     * @return Returns the memory.
     */
    public abstract RuntimeMemory getMemory();
    /*{
        return memory;
    }*/
}
