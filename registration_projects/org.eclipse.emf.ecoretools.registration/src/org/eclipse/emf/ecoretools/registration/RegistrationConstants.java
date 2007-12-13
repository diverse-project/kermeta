/* $Id: RegistrationConstants.java,v 1.2 2007-12-13 15:23:11 dvojtise Exp $
 * Project   : org.eclipse.emf.ecoretools.registration
 * File      : RegistrationConstants.java
 * License   : EPL
 * Copyright : INRIA
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : Didier Vojtisek <dvojtise@irisa.fr>
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
