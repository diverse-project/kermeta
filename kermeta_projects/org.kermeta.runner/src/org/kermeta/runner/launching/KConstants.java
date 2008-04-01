package org.kermeta.runner.launching;

public interface KConstants {

	/**
	 * Unique identifier for the PDA debug model (value 
	 * <code>org.eclipse.debug.examples.pda</code>).
	 */
	public static final String K_DEBUG_MODEL = "org.kermeta.debug";
	
	/**
	 * Launch configuration key. Value is a path to a perl
	 * program. The path is a string representing a full path
	 * to a perl program in the workspace. 
	 */
	public static final String ATTR_K_PROGRAM = K_DEBUG_MODEL + ".ATTR_K_PROGRAM";
	
    public final static String KM_FILENAME = "fr.irisa.triskell.kermeta.launching.KM_FILENAME";
    public final static String KM_CLASSQNAME = "fr.irisa.triskell.kermeta.launching.KM_CLASSQNAME";
    public final static String KM_OPERATIONNAME = "fr.irisa.triskell.kermeta.launching.KM_OPERATIONNAME";
    // list of value separated by a comma
    public final static String KM_ARGUMENTS = "fr.irisa.triskell.kermeta.launching.KM_ARGUMENTS";
    public final static String KM_PROJECTNAME = "fr.irisa.triskell.kermeta.launching.KM_PROJECTNAME";

    public final static String RUN_CONFIGURATION = "org.kermeta.debug.runConfiguration";
    public final static String CONSTRAINT_CONFIGURATION = "org.kermeta.debug.constraintConfiguration";
    
	
}
