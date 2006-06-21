/* $Id: RuntimeUnitError.java,v 1.1 2006-06-21 13:10:56 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RuntimeUnitError.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Jun 21, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.runtime.loader;

/**
 * @author zdrey
 *
 */
public class RuntimeUnitError extends Error {

	/**
	 * 
	 */
	public RuntimeUnitError() {
		super();
	}

	/**
	 * @param message
	 */
	public RuntimeUnitError(String message) {
		super("RuntimeUnit error while try to load a model:\n    " + message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public RuntimeUnitError(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public RuntimeUnitError(Throwable cause) {
		super(cause);
	}

}
