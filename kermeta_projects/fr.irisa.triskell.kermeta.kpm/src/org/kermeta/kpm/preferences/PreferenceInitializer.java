/* $Id: PreferenceInitializer.java,v 1.2 2008-11-04 12:24:32 dvojtise Exp $
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
	public void initializeDefaultPreferences() {
		IPreferenceStore store = KPMPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_EXCLUDED_EXTENSIONS,
				"*.class\n*.java\n/.JETEmitters/*\n\n");
	}

}
