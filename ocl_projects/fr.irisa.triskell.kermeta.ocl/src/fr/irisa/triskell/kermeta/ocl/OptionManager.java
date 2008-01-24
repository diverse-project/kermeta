/* $Id: OptionManager.java,v 1.1 2008-01-24 14:15:17 dvojtise Exp $
 * Created on 2008/01/24
 * Project: OCL
 * File: Option Manager.java
 * License: EPL
 * Copyright: IRISA / INRIA 
 * Authors : 
 * 		Didier Vojtisek
 */
package fr.irisa.triskell.kermeta.ocl;

import org.eclipse.jface.preference.IPreferenceStore;


/**
 * Option Manager for OCL plugin
 * 
 */
public class OptionManager {

	public static final String LastUsedMetaModelDefaultValue = "";

	private static final String PREFIX = Activator.PLUGIN_ID + ".";

	public static final String LAST_USED_METAMODEL   = PREFIX + "lastusedmetamodel";

	private IPreferenceStore store;

	public OptionManager (IPreferenceStore store) {
		this.store = store;
	}

	/**
	 * Set default in preference store.
	 */
	public void initializeDefaults() {
		store.setDefault(LAST_USED_METAMODEL, LastUsedMetaModelDefaultValue);
	}



	public String getLastUsedMetamodel () {
		return store.getString (LAST_USED_METAMODEL);
	}
	
	public void setLastUsedMetamodel (String text) {
		store.setValue(LAST_USED_METAMODEL, text);
	}
	
}
