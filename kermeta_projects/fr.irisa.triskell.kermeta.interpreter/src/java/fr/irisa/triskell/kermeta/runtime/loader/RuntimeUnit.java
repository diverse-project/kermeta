/* $Id: RuntimeUnit.java,v 1.6 2006-11-16 14:06:12 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : RuntimeUnit.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * A RuntimeUnit is an object that simply handles a collection of entities for 
 * a given instance-model
 */
public abstract class RuntimeUnit {
	/**
	 * A runtime object representation of a Kermeta Hashtable
	 * 4 entries available : contents, allContents, rootContents, allRootContents
	*/
    protected RuntimeObject contentMap;
    public String resourceType; // "EMF", "MDR"
    protected String uri;
    // The factory that created this runtime unit
    protected RuntimeUnitFactory factory;
    
    /** This is the resource that is the origin of this runtimeUnit */
    public RuntimeObject associatedResource = null;
    

    /** This is called in the constructor of the concrete RuntimeUnit
     *  It construct the RuntimeObject instances.
     */
    public abstract void load();
    
    public abstract void save(String file_path); // as XMI
    
    
    /** @return the instances of the model loaded through this runtimeUnit */
    public RuntimeObject getContentMap()
    {
        return contentMap;
    }
    
    /**
     * tells if the save should validate the output model
     */
    protected boolean mustValidate = false; 

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
    
    
    /** Helper method: get the runtime memory of the interpreter (runtimememory = the memory 
     * that contains the RuntimeObjects) */
    public RuntimeMemory getRuntimeMemory()
    {
    	return this.getContentMap().getFactory().getMemory();	
    }
    /** Helper method: get the kermeta unit of the file in which the resource loading is asked */
    public KermetaUnit getKermetaUnit()
    {
    	return getRuntimeMemory().getUnit();
    }

	public void setMustValidate(boolean mustValidate) {
		this.mustValidate = mustValidate;
	}
    
}
