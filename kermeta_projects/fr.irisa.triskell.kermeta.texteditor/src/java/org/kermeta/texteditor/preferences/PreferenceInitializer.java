/* $Id: PreferenceInitializer.java,v 1.1 2008-09-22 12:17:34 dvojtise Exp $
 * Project    : .kermeta.log4j
 * File       : PreferenceInitializer.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 may. 2008
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 */
package org.kermeta.texteditor.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.kermeta.texteditor.ModelcheckingStrategy;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

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
		IPreferenceStore store = TexteditorPlugin.getDefault().getPreferenceStore();
		
		store.setDefault(ModelcheckingStrategy.MODE_KEY, ModelcheckingStrategy.SAVING_TIME);
		
		
	}

}
