/* $Id: PreferenceInitializer.java,v 1.4 2008-11-06 11:11:20 dvojtise Exp $
 * Project: KPM UI
 * File: KPMPreferenceInitializer.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: Sep 19, 2008
 * Authors: dvojtise
 */
package org.kermeta.kpm.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.kermeta.kpm.KPMPlugin;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	/**
	 * By default KPM should ignore : *.class *.java and all projects whose name start with .
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = KPMPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_EXCLUDED_EXTENSIONS,
				"*.class\n*.java\n/.*\n\n");
		store.setDefault(PreferenceConstants.P_INCLUDED_EXTENSIONS,
		"*.kmt\n*.ecore\n*.km\n\n");
	}

}
