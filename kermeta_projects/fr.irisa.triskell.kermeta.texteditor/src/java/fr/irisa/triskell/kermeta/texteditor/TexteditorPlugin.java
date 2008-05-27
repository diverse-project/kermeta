/* $Id: TexteditorPlugin.java,v 1.19 2008-05-27 12:58:33 dvojtise Exp $
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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.texteditor.KermetaEditorEventListener;
import org.kermeta.texteditor.ModelcheckingStrategy;
import org.osgi.framework.BundleContext;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * The main plugin class to be used in the desktop.
 */
public class TexteditorPlugin extends AbstractUIPlugin {
	

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.texteditor";
	
	//The shared instance.
	private static TexteditorPlugin plugin;
	
	final static public String KMT_PARTITIONING = "_KMT_PARTITIONING_";

	// Log4j logger for this plugin
	final static public Logger internalLog = LogConfigurationHelper.getLogger("TexteditorPlugin");
	
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
	
	/**
	 * This method logs an error message and an associated exception (as a trace)
	 * It will post the message both in the ErrorLog view in Eclipse and in the Log4J
	 * @param message String
	 */
	public static void logErrorMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, message, e));
		// log4j message
		internalLog.error(message, e);
	}
	
	/**
	 * This method logs a warning message and an associated exception (as a trace)
	 * It will post the message both in the ErrorLog view in Eclipse and in the Log4J
	 * @param message String
	 */
	public static void logWarningMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, IStatus.WARNING, message, e));
		// log4j message
		internalLog.error(message, e);
	}
}
