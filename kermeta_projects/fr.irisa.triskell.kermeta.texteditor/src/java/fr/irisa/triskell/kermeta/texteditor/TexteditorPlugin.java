/* $Id: TexteditorPlugin.java,v 1.17 2008-02-14 07:13:43 uid21732 Exp $
 * Project : fr.irisa.triskell.kermeta.texteditor
 * File : TexteditorPlugin.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 11 feb. 2005
 * Authors : 
 * 		ffleurey <ffleurey@irisa.fr
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.texteditor;

import java.util.HashSet;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.texteditor.KermetaEditorEventListener;
import org.kermeta.texteditor.ModelcheckingStrategy;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * The main plugin class to be used in the desktop.
 */
public class TexteditorPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static TexteditorPlugin plugin;
	
	final static public String KMT_PARTITIONING = "_KMT_PARTITIONING_";
	
	// Resource bundle.
	private ResourceBundle resourceBundle;
	
	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	
	/**
	 * Returns the string from the plugin's resource bundle, or 'key' if not
	 * found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * List of KermetaEditorEventListener that must be notified
	 */
	public Set<KermetaEditorEventListener> kermetaEditorEventListeners = new HashSet <KermetaEditorEventListener> (); 
	
	final static public Logger pluginLog = LogConfigurationHelper.getLogger("KermetaEditor");
	
	/**
	 * The constructor.
	 */
	public TexteditorPlugin() {
		super();
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle("org.kermeta.texteditor.EditorPluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		getPreferenceStore().setDefault( ModelcheckingStrategy.INPUT_CHANGED_KEY, ModelcheckingStrategy.INPUT_CHANGED);
		getPreferenceStore().setDefault( ModelcheckingStrategy.SAVING_TIME_KEY, ModelcheckingStrategy.SAVING_TIME);
	}

	public int getModelCheckingStrategy() {
		int value = getPreferenceStore().getInt( ModelcheckingStrategy.MODE_KEY );
		if ( value == 0 ) {
			value = getPreferenceStore().getDefaultInt( ModelcheckingStrategy.SAVING_TIME_KEY );
			getPreferenceStore().setValue( ModelcheckingStrategy.MODE_KEY, value);
		}
		return value;
	}
	
	public void setModelCheckingStrategy(int value) {
		getPreferenceStore().setValue( ModelcheckingStrategy.MODE_KEY, value);
	}
	
	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static TexteditorPlugin getDefault() {
		return plugin;
	}

	
	public void registerListener(KermetaEditorEventListener listener) {
		kermetaEditorEventListeners.add(listener);
	}
	public void unregisterListener(KermetaEditorEventListener listener) {
		kermetaEditorEventListeners.remove(listener);
	}
}
