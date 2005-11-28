/* $Id: SerializableVariable.java,v 1.1 2005-11-28 18:54:35 zdrey Exp $
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
	
	/**
	 * The attributes of the type IVariable in Eclipse Debug Framework
	 */
	public SerializableVariable(String name, String type, SerializableValue value)
	{
		this.name = name;
		this.type = type;
		this.value = value;
	}
}
