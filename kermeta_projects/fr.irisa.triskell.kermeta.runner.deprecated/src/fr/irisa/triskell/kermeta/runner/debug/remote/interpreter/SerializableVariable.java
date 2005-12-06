/* $Id: SerializableVariable.java,v 1.2 2005-12-06 18:53:16 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : SerializableVariable.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 21, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.io.Serializable;


/** A serialisable representation of the available variables */
public class SerializableVariable implements Serializable {
	
	/** attributes corresponding to the type IVariable/KermetaVariable of the debug framework. */
	public String name;
	public String type;
	
	public SerializableValue value;
	public SerializableValue ownerValue;
	
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param value the value "of" this variable
	 * @param owner the value that owns this variable (variable is contained by this value)
	 */
	public SerializableVariable(String name, String type, SerializableValue value, SerializableValue owner)
	{
		this.name = name;
		this.type = type;
		this.value = value;
		this.ownerValue = owner;
	}
	
	public void setValue(SerializableValue v) {	value = v; }
	public SerializableValue getValue() {	return value; }
}
