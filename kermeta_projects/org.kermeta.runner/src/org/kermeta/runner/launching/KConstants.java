/*$Id: KConstants.java,v 1.4 2008-04-30 13:58:47 ftanguy Exp $
* Project : org.kermeta.runner
* File : 	KConstants.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

public interface KConstants {

	/**
	 * Unique identifier for the Kermeta debug model
	 */
	public static final String K_DEBUG_MODEL = "org.kermeta.debug";
	
	/**
	 * Launch configuration key. Value is a path to a perl
	 * program. The path is a string representing a full path
	 * to a perl program in the workspace. 
	 */
	public static final String DEFAULT_PATH = K_DEBUG_MODEL + ".DEFAULT_PATH";
	
    public final static String KM_FILENAME = "fr.irisa.triskell.kermeta.launching.KM_FILENAME";
    public final static String KM_CLASSQNAME = "fr.irisa.triskell.kermeta.launching.KM_CLASSQNAME";
    public final static String KM_OPERATIONNAME = "fr.irisa.triskell.kermeta.launching.KM_OPERATIONNAME";
    // list of value separated by a comma
    public final static String KM_ARGUMENTS = "fr.irisa.triskell.kermeta.launching.KM_ARGUMENTS";
    public final static String KM_PROJECTNAME = "fr.irisa.triskell.kermeta.launching.KM_PROJECTNAME";

    public final static String RUN_CONFIGURATION = "org.kermeta.debug.runConfiguration";
    public final static String CONSTRAINT_CONFIGURATION = "org.kermeta.debug.constraintConfiguration";
    
	
}
