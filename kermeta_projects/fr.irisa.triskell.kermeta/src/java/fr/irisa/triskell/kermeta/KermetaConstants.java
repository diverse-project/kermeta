/* $Id: KermetaConstants.java,v 1.4 2008-05-27 13:21:40 dvojtise Exp $
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

import org.kermeta.log4j.util.LogConfigurationHelper;

public class KermetaConstants {

	public static final String FOLDER = "folder";
	public static final String FILE = "file";
	public static final String ECORE_FILE = "file";
	public static final String PROJECT = "project";
	public static final String KLOGO = "klogo";
	public static final String IMG_GENERATED_PACKAGE = "IMG_GENERATED_PACKAGE";
	public static final String IMG_ECORE_FILE = "IMG_ECORE_FILE";
	final static public Logger internalLog = LogConfigurationHelper.getLogger("Kermeta");
}
