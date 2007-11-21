package org.eclipse.emf.emfatic.ui.editor.actions;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class EmfaticEditorActionMessages {

	private static final String BUNDLE_NAME = "org.eclipse.emf.emfatic.ui.editor.actions.EmfaticEditorActionMessages"; //$NON-NLS-1$

	private static final ResourceBundle fgResourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

	private EmfaticEditorActionMessages() {
	}

	public static ResourceBundle getResourceBundle() {
		return fgResourceBundle;
	}
	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
