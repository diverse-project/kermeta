/* $Id: RuntimeObject.java,v 1.2 2005-03-21 13:44:59 zdrey Exp $
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
	protected RuntimeObjectFactory factory;
	
	/**
	 * The constructor of unique instance
	 */
	public RuntimeObject(String uniqueInstanceName) {
		super();
		this.properties.put("singleton instance",uniqueInstanceName);
	}

	/**
	 * The constructor
	 */
	public RuntimeObject(RuntimeObjectFactory factory, RuntimeObject metaclass) {
		super();
		this.metaclass = metaclass;
		this.factory = factory;
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
	public void setMetaclass(RuntimeObject metaclass) {
		this.metaclass = metaclass;
	}
	/**
	 * @return Returns the factory.
	 */
	public RuntimeObjectFactory getFactory() {
		return factory;
	}
	
/*	public KermetaObject instanciate(List attributes) {
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
	}*/
	
	
}
