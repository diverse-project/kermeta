/* $Id: WizardMessages.java,v 1.1 2008-12-09 09:37:35 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : Messages.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.eclipse.wizard;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Basic handler for the String messages stored in *.properties files
 */
public class WizardMessages {

	private static final String BUNDLE_NAME = "fr.irisa.triskell.eclipse.wizard.wizard_english";//$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private WizardMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
