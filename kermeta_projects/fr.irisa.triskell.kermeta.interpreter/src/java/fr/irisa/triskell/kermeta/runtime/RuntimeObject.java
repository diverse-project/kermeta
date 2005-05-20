/* $Id: RuntimeObject.java,v 1.3 2005-05-20 12:54:47 ffleurey Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr>
 * Description : This is the java representation of the Kermeta objects during the execution
 * of a kermeta source code. Typically, a RuntimeObject corresponds to 
 * a Kermeta object during its "life" execution. 
 */
package fr.irisa.triskell.kermeta.runtime;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * This is the java implemetation of a Kermeta object 
 */
public class RuntimeObject {
    
    /**
     * Objec id counted for RuntimeObject
     */
    private static long oid_cpt = 0;
	
    private long oId = oid_cpt++;
    
	/**
	 * The meta class
	 */
	protected RuntimeObject metaclass;
	
	/**
	 * The container
	 */
	protected RuntimeObject container = null;
	
	/**
	 * The values of properties. 
	 * Indexed by the name of the property
	 */
	protected Hashtable properties = new Hashtable();
	
	/**
	 * Data contained in the object
	 */
	protected Hashtable data;
	
	/**
	 * Is the object modifiable
	 */
	protected boolean frozen = false;
	
	/**
	 * The kermeta object factory used to create this object 
	 */
	protected RuntimeObjectFactory factory;
	
	/**
	 * The constructor
	 */
	public RuntimeObject(RuntimeObjectFactory factory, RuntimeObject metaclass) {
		super();
		this.metaclass = metaclass;
		this.factory = factory;
		data = new Hashtable();
	}
	
    protected void finalize() throws Throwable {
        
        FObject fobj = (FObject)getData().get("kcoreObject");
        if (fobj != null) {
            factory.getMemory().clearFObjectFromCache(fobj);
        }
        
        super.finalize();
    }
	
	/**
	 * @return Returns the container.
	 */
	public RuntimeObject getContainer() {
		return container;
	}
	/**
	 * @param container The container to set.
	 */
	public void setContainer(RuntimeObject container) {
		this.container = container;
	}
	/**
	 * Get data contains only a "kcoreObject" entry in 1st iteration
	 * and NumericValue, StringValue for primitive types
	 * @return Returns the data.
	 */
	public Hashtable getData() {
		return data;
	}
	/**
	 * @param data The data to set.
	 */
	public void setData(Hashtable data) {
		this.data = data;
	}
	/**
	 * @return Returns the frozen.
	 */
	public boolean isFrozen() {
		return frozen;
	}
	/**
	 * @param frozen The frozen to set.
	 */
	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}
	/**
	 * @return Returns the metaclass.
	 */
	public RuntimeObject getMetaclass() {
		return metaclass;
	}
	/**
	 * Each property corresponds exactly to an FProperty : 
	 * ownedAttribute -> FOwnedAttribute()
	 * name -> FName()
	 * @return Returns the properties.
	 */
	public Hashtable getProperties() {
		return properties;
	}

	/**
	 * @param metaclass The metaclass to set.
	 */
	public void setMetaclass(RuntimeObject metaclass) {
		this.metaclass = metaclass;
	}
	/**
	 * @return Returns the factory.
	 */
	public RuntimeObjectFactory getFactory() {
		return factory;
	}
	
	public String toString() {
	    String class_name = "< No Metaclass ! >";
	    try {
	        class_name = factory.getMemory().getUnit().getQualifiedName(((FClass)metaclass.getData().get("kcoreObject")).getFClassDefinition());
	    }
	    catch(Exception e) { 
	        // NOTHING
	    }
	    
	    return "[" + class_name + " : "+ oId +"]";
	}
	
    public long getOId() {
        return oId;
    }
}
