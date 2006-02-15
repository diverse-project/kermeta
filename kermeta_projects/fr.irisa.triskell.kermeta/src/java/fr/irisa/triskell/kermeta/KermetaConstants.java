/* $Id: KermetaConstants.java,v 1.1 2006-02-15 18:17:11 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RunnerConstants.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class KermetaConstants {

	public static final String FOLDER = "folder";
	public static final String FILE = "file";
	public static final String ECORE_FILE = "file";
	public static final String PROJECT = "project";
	final static public Logger internalLog = LogConfigurationHelper.getLogger("Kermeta");
}
