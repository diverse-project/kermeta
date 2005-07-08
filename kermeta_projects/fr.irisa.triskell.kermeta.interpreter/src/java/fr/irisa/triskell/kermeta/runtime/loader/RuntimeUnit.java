/* $Id: RuntimeUnit.java,v 1.1 2005-07-08 11:39:33 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : RuntimeUnit.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * A RuntimeUnit is an object that simply handles a collection of entities for 
 * a given instance-model
 */
public abstract class RuntimeUnit {
    
    protected RuntimeObject instances;
    public String resourceType; // "EMF", "MDR"
    protected String uri;
    // The factory that created this runtime unit
    protected RuntimeUnitFactory factory;
    

    
    /** This is called in the constructor of the concrete RuntimeUnit
     *  It construct the RuntimeObject instances.
     */
    public abstract void load();
    
    /** @return the instances of the model loaded through this runtimeUnit */
    public RuntimeObject getInstances()
    {
        return instances;
    }
    
    

    /**
     * @return Returns the factory.
     */
    public RuntimeUnitFactory getFactory() {
        return factory;
    }
    /**
     * @param factory The factory to set.
     */
    public void setFactory(RuntimeUnitFactory factory) {
        this.factory = factory;
    }
}
