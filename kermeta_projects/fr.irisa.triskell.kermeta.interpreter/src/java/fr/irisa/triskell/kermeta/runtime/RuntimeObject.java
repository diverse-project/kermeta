/* $Id: RuntimeObject.java,v 1.12 2006-02-21 17:56:04 jsteel Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
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
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * This is the java (runtime) implementation of a Kermeta object. Important properties :
 *  - data : contain special informations, like the model element corresponding to the runtime object
 *  - properties : contain the RuntimeObject representations of the value of the properties of
 *    the runtime object
 *  - metaclass : the metaclass of the runtime object
 *  (see detailed doc. in member functions)
 */
public class RuntimeObject {
    
    public static int getInstanceCounter() {
        return oid_cpt;
    }
    
    /**
     * Object id counted for RuntimeObject
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
	 * Indexed by the name of the property : { a_string : a_runtime_object }
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
	
	/**
	 * Properly clears this RuntimeObject on garbage collecting time. 
	 */
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
    
    
    /**
     * Overrides the classic equals in order to evaluate properly equality between
     * RuntimeObject representations of the primitive types.
     * @return true if arg0 equals this RuntimeObject, false otherwise.
     */
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
	 * @return Returns the container in the mof meaning (black diamond).
	 */
	public RuntimeObject getContainer() {
		FClass self_cls = ((FClass)metaclass.getData().get("kcoreObject"));
		// FIXME: this is just a quick fix, we should check that self_cls inherits from ValueType
		String name = getFactory().getMemory().getUnit().getQualifiedName(self_cls.getFTypeDefinition());
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
	 * Returns the data, which contains different kinds of objects according to
	 * the Kermeta type that is represented.
	 * Here is the currently exhaustive list of available keys in this hashtable 
	 * (i.e : How to access the internal structure of a RuntimeObject):
	 *  
	 *   - <b>kcoreObject</b> : the FObject represented by this runtime object. Note that if the runtime object is an 
	 *     <em>instance</em> (by opposition to a model) than there is no kcoreObject.<br>
	 *     Examples of common uses :<br>
	 *     - <code>FClass a_fclass = (FClass)a_runtimeobject.getMetaclass().getData().get("kcoreObject")</code>;
	 *     gets the class (in its "model representation") of which the given runtimeobject is an instance.
	 *     - <code>FProperty a_fprop = (FProperty)a_ro_property.getData().get("kcoreObject")</code>;
	 *     gets the model representation of the given runtime property.
	 *   - <b>[String|Numeric|Boolean|Character]Value</b> : the java primitive type corresponding to this
	 *     RuntimeObject. Only provided for runtime object that represents primitive types!
	 *   - <b>emfObject</b> : used during the serialization of a Kermeta model : represents the EObject 
	 *   represented by this runtime object.  
	 *   
	 * @return Returns the data represented by this runtime object.
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
	 * @return Returns true if the RuntimeObject is not modifiable, false otherwise.
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
	 * @return Returns the metaclass of this runtime object.
	 */
	public RuntimeObject getMetaclass() {
		return metaclass;
	}
	
	/**
	 * @param metaclass The metaclass to set.
	 */
	public void setMetaclass(RuntimeObject metaclass) {
		this.metaclass = metaclass;
	}
	
	/**
	 * Returns the properties of this runtime object.
	 * Indexed by the name (a String) of the property
	 * <pre>class X
	 * { 
	 *    attribute y : Y 
	 *    attribute z : Z
	 * }
	 * </pre>
	 * 
	 * The properties hashtable of the RuntimeObject representation of an instance of X : 
	 * <pre>{ "y" : a_RuntimeObject_as_instance_of_Y, "z" : a_RuntimeObject_as_instance_of_z }</pre>
	 * @return Returns the properties.
	 */
	public Hashtable getProperties() {
		return properties;
	}
	

	/**
	 * @return Returns the factory used to create RuntimeObjects.
	 */
	public RuntimeObjectFactory getFactory() {
		return factory;
	}

	/**
	 * @return A string representation of this runtime object : <code>[ class_name : oId ]</code>, or
	 * <code>[ class_name : oId = &lt;a_printable_value&gt;</code> for primitive types.
	 */
	public String toString() {
	    String class_name = "< No Metaclass ! >";
	    try {
	        class_name = factory.getMemory().getUnit().getQualifiedName(((FClass)metaclass.getData().get("kcoreObject")).getFTypeDefinition());
		    String sValue = (String)getData().get("StringValue");
		    if(sValue != null)
		    	return "[" + class_name + " : "+ oId +" = \"" +sValue+"\"]";
		    
		    Boolean bValue = (Boolean)getData().get("BooleanValue");
		    if(bValue != null)
		    	return "[" + class_name + " : "+ oId +" = " +bValue+"]";
		    
		    Object nValue = getData().get("NumericValue");
		    if(nValue != null)
		    	return "[" + class_name + " : "+ oId +" = " +nValue+"]";
	    }
	    catch(Exception e) { 
	        // NOTHING
	    }
	    	    
	    return "[" + class_name + " : "+ oId +"]";
	}
	
	/**
	 * @return A simplified string representation of this runtime object : <code>[ class_name : oId ]</code>,
	 * or a printable value for primitive types..
	 */
	public String toUserString() {
	    String class_name = "< No Metaclass ! >";
	    try {
	        class_name = factory.getMemory().getUnit().getQualifiedName(((FClass)metaclass.getData().get("kcoreObject")).getFTypeDefinition());
		    String sValue = (String)getData().get("StringValue");
		    if(sValue != null)
		    	return "\"" +sValue+"\"";
		    
		    Boolean bValue = (Boolean)getData().get("BooleanValue");
		    if(bValue != null)
		    	return "" + bValue;
		    
		    Object nValue = getData().get("NumericValue");
		    if(nValue != null)
		    	return "" +nValue;
	    }
	    catch(Exception e) { 
	        // NOTHING
	    }
	    	    
	    return "[" + class_name + " : "+ oId +"]";
	}
	
	/** @return the ID of this runtime object */
    public long getOId() {
        return oId;
    }
}
