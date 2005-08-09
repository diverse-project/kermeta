/* $Id: RuntimeObject.java,v 1.8 2005-08-09 09:33:07 ffleurey Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : EPL
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

import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * This is the java implemetation of a Kermeta object 
 */
public class RuntimeObject {
    
    public static int getInstanceCounter() {
        return oid_cpt;
    }
    
    /**
     * Objec id counted for RuntimeObject
     */
    private static int oid_cpt = 0;
	
    private int oId = oid_cpt++;
    
	/**
	 * The meta class
	 */
	private RuntimeObject metaclass;
	
	/**
	 * The container
	 */
	private RuntimeObject container = null;
	
	/**
	 * The values of properties. 
	 * Indexed by the name of the property
	 */
	private Hashtable properties = new Hashtable();
	
	/**
	 * Data contained in the object
	 */
	private Hashtable data;
	
	/**
	 * Is the object modifiable
	 */
	private boolean frozen = false;
	
	/**
	 * The kermeta object factory used to create this object 
	 */
	private RuntimeObjectFactory factory;
	
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
        //System.err.println("finalize RuntimeObject : " + oId);
        FObject fobj = (FObject)getData().get("kcoreObject");
        if (fobj != null) {
          //  System.err.println("           -> free km object " + fobj);
            factory.getMemory().clearFObjectFromCache(fobj);
        }
        
        super.finalize();
        // clear as much ref as possible
        container = null;
        metaclass = null;
        properties = null;
        data = null;
        factory = null;
    }
    
    
	/**
	 * This is a hack to make hastable implementation work
	 */
    public int hashCode() {
        if (getData().containsKey("StringValue")) return getData().get("StringValue").hashCode();
        if (getData().containsKey("NumericValue")) return getData().get("NumericValue").hashCode();
        return super.hashCode();
    }
    
    
    
    public boolean equals(Object arg0) {
        if (arg0 instanceof RuntimeObject) {
            RuntimeObject other = (RuntimeObject)arg0;
            if (getData().containsKey("StringValue") && other.getData().containsKey("StringValue")) {
                return getData().get("StringValue").equals(other.getData().get("StringValue"));
            }
            if (getData().containsKey("NumericValue") && other.getData().containsKey("NumericValue")) {
                return getData().get("NumericValue").equals(other.getData().get("NumericValue"));
            }
        }
        
        return super.equals(arg0);
    }
    
	/**
	 * @return Returns the container.
	 */
	public RuntimeObject getContainer() {
		FClass self_cls = ((FClass)metaclass.getData().get("kcoreObject"));
		// FIXME: this is just a quick fix, we should check that self_cls inherits from ValueType
		String name = getFactory().getMemory().getUnit().getQualifiedName(self_cls.getFClassDefinition());
		if (name.equals("kermeta::standard::Boolean")) return null;
		if (name.equals("kermeta::standard::Integer")) return null;
		if (name.equals("kermeta::standard::String")) return null;
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
