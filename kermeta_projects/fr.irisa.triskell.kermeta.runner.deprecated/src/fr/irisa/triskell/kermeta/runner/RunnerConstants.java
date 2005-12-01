/* $Id: RunnerConstants.java,v 1.4 2005-12-01 18:29:07 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RunnerConstants.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner;

public class RunnerConstants {

	/** Commands susceptible to be asked by the user */
	public static final String GET_STACK = "stack";

	
	public static final String ARG_SEP = " ";
	
	public static final String STEP_INTO = "stepInto";
	public static final String STEP_OVER = "stepOver";
	public static final String RESUME = "resume";
	public static final String SUSPEND = "suspend";
	
	public static final String RESUMED = "resumed";
	public static final String SUSPENDED = "suspended";
	public static final String TERMINATED = "terminated";
	public static final String BREAKPOINT = "breakpoint";
	public static final String CLIENT_REQUEST = "request";
	// This is more a "reason" of supsension, not a "command" 
	public static final String STEP_END = "stepEnd";


	public static final String TERMINATE = "terminate";
}
