/*
 * Created on 16 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.runtime;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * This is the java implemetation of a Kermeta object 
 */
public class KermetaObject {
	
	/**
	 * The meta class
	 */
	protected KermetaObject metaclass;
	
	/**
	 * The container
	 */
	protected KermetaObject container = null;
	
	/**
	 * The values of properties. 
	 * Indexed by the name of the property
	 */
	protected Hashtable properties = new Hashtable();
	
	/**
	 * The values of propertiesGenerators. 
	 * Indexed by the name of the property
	 */
	protected Hashtable propertiesGenerators = new Hashtable();
	
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
	protected KermetaObjectFactory factory;
	
	/**
	 * The constructor of unique instance
	 */
	public KermetaObject(String uniqueInstanceName) {
		super();
		this.properties.put("singleton instance",uniqueInstanceName);
	}

	/**
	 * The constructor
	 */
	public KermetaObject(KermetaObjectFactory factory, KermetaObject metaclass) {
		super();
		this.metaclass = metaclass;
		this.factory = factory;
	}

	/**
	 * @return Returns the container.
	 */
	public KermetaObject getContainer() {
		return container;
	}
	/**
	 * @param container The container to set.
	 */
	public void setContainer(KermetaObject container) {
		this.container = container;
	}
	/**
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
	public KermetaObject getMetaclass() {
		return metaclass;
	}
	/**
	 * @return Returns the properties.
	 */
	public Hashtable getProperties() {
		return properties;
	}
	/**
	 * @return Returns the propertiesGenerators.
	 */
	public Hashtable getPropertiesGenerators() {
		return propertiesGenerators;
	}
	/**
	 * @param metaclass The metaclass to set.
	 */
	public void setMetaclass(KermetaObject metaclass) {
		this.metaclass = metaclass;
	}
	/**
	 * @return Returns the factory.
	 */
	public KermetaObjectFactory getFactory() {
		return factory;
	}
	
	public KermetaObject instanciate(List attributes) {
		KermetaObject instance=new KermetaObject(this.getFactory(),this);
		Hashtable propertiesGenerators=instance.getPropertiesGenerators();
		Hashtable properties=instance.getProperties();
		Iterator it=attributes.iterator();
		while (it.hasNext()) {
			KermetaObject attribute=(KermetaObject)it.next();
			String attribName=((FProperty)attribute.getData().get("kcoreObject")).getFName();
			propertiesGenerators.put(attribName,attribute);
			properties.put(attribName,KMDummyObject.INSTANCE);
		}
		return instance;
	}
	
	
}
