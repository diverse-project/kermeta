/* $Id: KM2ECoreConversionException.java,v 1.2 2007-07-20 15:08:11 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KM2ECoreConversionException.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : May 31, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.loader.ecore;

/**
 * @author zdrey
 *
 */
public class KM2ECoreConversionException extends Error {

	public KM2ECoreConversionException() {
		super();
	}

	/**
	 * @param message
	 */
	public KM2ECoreConversionException(String message) {
		super(message);
	}


}
