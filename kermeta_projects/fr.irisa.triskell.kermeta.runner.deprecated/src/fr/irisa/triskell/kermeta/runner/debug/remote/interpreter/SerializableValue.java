/* $Id: SerializableValue.java,v 1.2 2005-12-01 18:29:07 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : SerializableValue.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 22, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.io.Serializable;

/**
 * This class is quite useless yet */
public class SerializableValue implements Serializable {
	/**
	 * 
	 */
	
	public String valueString; // same attribute as in KermetaValue
	// public String runtimeOID; // the oid of the RuntimeObject that handle this value
	public SerializableValue(String valueString) { this.valueString = valueString; }
}
