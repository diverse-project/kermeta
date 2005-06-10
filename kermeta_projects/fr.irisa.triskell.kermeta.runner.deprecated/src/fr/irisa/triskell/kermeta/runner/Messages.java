/* $Id: Messages.java,v 1.1 2005-06-10 09:00:01 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : Messages.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Basic handler for the String messages stored in *.properties files
 */
public class Messages {

	private static final String BUNDLE_NAME = "fr.irisa.triskell.kermeta.runner.kermeta_english";//$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
