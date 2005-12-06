/* $Id: SerializableValue.java,v 1.3 2005-12-06 18:53:16 zdrey Exp $
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
	public String refTypeName;
	
	public SerializableVariable refVar;
	
	public long runtimeOID; // the oid of the RuntimeObject that handle this value
	public SerializableValue(String valueString, String refTypeName, SerializableVariable refVar, long oid) { 
		this.valueString = valueString;
		this.refVar = refVar;
		this.refTypeName = refTypeName;
		this.runtimeOID  = oid;
	}
}
