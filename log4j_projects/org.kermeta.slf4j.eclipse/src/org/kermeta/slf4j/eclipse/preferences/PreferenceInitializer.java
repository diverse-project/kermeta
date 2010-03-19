/* $Id: PreferenceInitializer.java,v 1.1 2008-05-30 12:58:35 dvojtise Exp $
 * Project    : .kermeta.log4j
 * File       : PreferenceInitializer.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 may. 2008
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 */
package org.kermeta.slf4j.eclipse.preferences;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.kermeta.slf4j.eclipse.Activator;


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
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		//store.setDefault(PreferenceConstants.P_BOOLEAN, true);
		//store.setDefault(PreferenceConstants.P_LOGGERCHOICE, "log4j");
		try {
			//URL url = Activator.getDefault().getBundle().getEntry("/kermeta_log4j_configuration.xml");
			//store.setDefault(PreferenceConstants.P_LOG4JXMLPATH, FileLocator.toFileURL(url).getFile());
			String url = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + Activator.LOG4JCONFIGDEFAULTLOCATION_IN_METADATA;
			store.setDefault(PreferenceConstants.P_LOG4JXMLPATH, url);
		} catch (Exception e) {
			System.out.print("Not able to retreive kermeta_log4j_configuration.xml in the kermeta plugin => using default log configuration");
			// don't worry about that, the log4j will simply use its default configuration
		}
		
	}

}
