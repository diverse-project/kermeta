package org.eclipse.emf.emfatic.ui.editor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class EmfaticEditorMessages {

	private static final String BUNDLE_NAME = "org.eclipse.emf.emfatic.ui.editor.EmfaticEditorMessages"; //$NON-NLS-1$

	private static final ResourceBundle fgResourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

	private EmfaticEditorMessages() {
	}

	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	protected static ResourceBundle getResourceBundle() {
		return fgResourceBundle;
	}
}
