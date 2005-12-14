/* $Id: RunnerConstants.java,v 1.6 2005-12-14 17:19:55 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RunnerConstants.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class RunnerConstants {

	/** Commands susceptible to be asked by the user */
	public static final String GET_STACK = "stack";

	
	public static final String ARG_SEP = " ";
	
	public static final String STEP_INTO = "stepInto";
	public static final String STEP_OVER = "stepOver";
	public static final String STEP_RETURN = "stepReturn";
	public static final String RESUME = "resume";
	public static final String SUSPEND = "suspend";
	public static final String TERMINATE = "terminate";
	
	// useless
	public static final String DISCONNECT = "disconnected";
	/*
	public static final String RESUMED = "resumed";
	public static final String SUSPENDED = "suspended";
	public static final String TERMINATED = "terminated"; */
	public static final String BREAKPOINT = "breakpoint";
	public static final String CLIENT_REQUEST = "request";
	// This is more a "reason" of supsension, not a "command" 
	public static final String STEP_END = "stepEnd";
	public static final String IVALUE_NA = "<not available>";
	public static final String IVALUE_SET = "<Set>";
	public static final String IVALUE_PRIMITIVE = "primitive";
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("Kermeta");
}
