/* $Id: PreferenceInitializer.java,v 1.1 2008-05-30 15:52:45 dvojtise Exp $
 * Project: Kermeta (First iteration)
 * File: PreferenceInitializer.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2008
 * Authors: dvojtise
 */
package org.kermeta.kmttemplate.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import fr.irisa.triskell.kermeta.ui.KermetaUIPlugin;

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
		IPreferenceStore store = KermetaUIPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_KMT_HEADER_TEMPLATESTRING,
				"/* $Id:"+
				"$ \n"+
				" * Creation : ${date}\n" +
				" * Licence  : EPL \n"+
		    	" * Copyright:\n"+
				" * Authors  : \n" +
				" *            ${user}\n" +
				" */\n");
	}

}
