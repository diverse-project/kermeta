/*
 * Created on 16 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.runtime;

import java.util.Hashtable;

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
	 * Data contained in the object
	 */
	protected Hashtable data;
	
	/**
	 * Is the object modifiable
	 */
	protected boolean frozen = false;
	
	/**
	 * The constructor
	 */
	public KermetaObject(KermetaObject metaclass) {
		super();
		this.metaclass = metaclass;
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
	 * @param metaclass The metaclass to set.
	 */
	public void setMetaclass(KermetaObject metaclass) {
		this.metaclass = metaclass;
	}
}
