/* $Id: RemoteValue.java,v 1.2 2005-11-24 14:22:37 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RemoteValue.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 22, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.io.Serializable;

/**
 * This class is quite useless yet */
public class RemoteValue implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	public String valueString; // same attribute as in KermetaValue
	public RemoteValue(String valueString) { this.valueString = valueString; }
}
