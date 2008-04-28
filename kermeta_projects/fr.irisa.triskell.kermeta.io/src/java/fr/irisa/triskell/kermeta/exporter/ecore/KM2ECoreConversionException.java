/* $Id: KM2ECoreConversionException.java,v 1.3 2008-04-28 11:50:22 ftanguy Exp $
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
package fr.irisa.triskell.kermeta.exporter.ecore;

/**
 * @author zdrey
 *
 */
@SuppressWarnings("serial")
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
