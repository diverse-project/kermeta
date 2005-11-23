/* $Id: RemoteVariable.java,v 1.2 2005-11-23 16:18:59 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RemoteVariable.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 21, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.io.Serializable;

/** A serialisable representation of the available variables */
public class RemoteVariable implements Serializable {
	
	/** attributes corresponding to the type IVariable/KermetaVariable of the debug framework. */
	public String name;
	public String type;
	public RemoteValue value;
	
	/**
	 * The attributes of the type IVariable in Eclipse Debug Framework
	 */
	public RemoteVariable(String name, String type, RemoteValue value)
	{
		this.name = name;
		this.type = type;
		this.value = value;
	}
}
