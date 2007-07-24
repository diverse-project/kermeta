/* $Id: RuntimeUnitError.java,v 1.3 2007-07-24 13:47:38 ftanguy Exp $
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

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

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
	
	public static void createRuntimeUnitError(String msg, ExpressionInterpreter interpreter, RuntimeMemory memory, Throwable we)
	{
	}
//	super("RuntimeUnit error while try to load a model:\n    " + message);
 

}
