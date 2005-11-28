/* $Id: SerializableValue.java,v 1.1 2005-11-28 18:54:35 zdrey Exp $
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
	public SerializableValue(String valueString) { this.valueString = valueString; }
}
