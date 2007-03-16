/* $Id: KermetaMessages.java,v 1.2 2007-03-16 14:03:45 cfaucher Exp $
 * Project   : Kermeta (First iteration)
 * File      : Messages.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Basic handler for the String messages stored in *.properties files
 */
public class KermetaMessages {

	private static final String BUNDLE_NAME = "fr.irisa.triskell.kermeta.kermeta_english";//$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private KermetaMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
