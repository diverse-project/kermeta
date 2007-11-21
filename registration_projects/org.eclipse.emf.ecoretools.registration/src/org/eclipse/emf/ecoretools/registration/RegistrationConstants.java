/* $Id: RegistrationConstants.java,v 1.1 2007-11-21 13:18:00 cfaucher Exp $
 * Project   : org.eclipse.emf.ecoretools.registration
 * File      : RunnerConstants.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : zdrey
 */
package org.eclipse.emf.ecoretools.registration;

import org.apache.log4j.Logger;

public class RegistrationConstants {

	public static final String FOLDER = "folder";
	public static final String FILE = "file";
	public static final String ECORE_FILE = "file";
	public static final String PROJECT = "project";
	public static final String IMG_GENERATED_PACKAGE = "IMG_GENERATED_PACKAGE";
	public static final String IMG_ECORE_FILE = "IMG_ECORE_FILE";
	
	// it is required to use a logger here
	final static public Logger internalLog = Logger.getRootLogger();
}
