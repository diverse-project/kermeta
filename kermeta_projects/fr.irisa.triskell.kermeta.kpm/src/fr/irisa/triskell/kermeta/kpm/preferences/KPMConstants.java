/*$Id: KPMConstants.java,v 1.2 2007-04-19 15:50:10 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KPMConstants.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 avr. 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.kpm.preferences;

/**
 * Constants and default values for KPM preferences / default configuration
 * Note: some of them may eventually be parametrized using a general configuration in preferences
 * Notebis: for the string constant it would be even better to pput them in a property file in the plugin
 */
public class KPMConstants {
	
	// customisation of default KPM model
	// maybe in the future we may put that in a general preference
	public static boolean GENERATEKM_DEFAULTVALUE = false;
	public static boolean APPLYREQUIREDEPENDENCIES_DEFAULTVALUE = true;
	
	// Preferences default values
	public static String KERMETAPROJECT_PREF_GENERATEKM_DEFAULTVALUE = GENERATEKM_DEFAULTVALUE ? "true" : "false";
	public static String KERMETAPROJECT_PREF_APPLYREQUIREDEPENDENCIES_DEFAULTVALUE = APPLYREQUIREDEPENDENCIES_DEFAULTVALUE ? "true" : "false";

}


