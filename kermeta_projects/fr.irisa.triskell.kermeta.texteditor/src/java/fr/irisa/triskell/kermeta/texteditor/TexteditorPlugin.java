/* $Id: TexteditorPlugin.java,v 1.8 2007-01-26 10:08:23 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta.texteditor
 * File : TextzditorPlugin.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 11 Fev. 2005
 * Authors : 
 * 		ffleurey <ffleurey@irisa.fr
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.texteditor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.texteditor.editors.KMTEditor;
import fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * The main plugin class to be used in the desktop.
 */
public class TexteditorPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static TexteditorPlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	
	// the current kermeta texteditor
	private KMTEditor editor;
	
	final static public String KMT_PARTITIONING = "_KMT_PARTITIONING_";
	
	/**
	 * List of KermetaEditorEventListener that must be notified
	 */
	public Vector<KermetaEditorEventListener> kermetaEditorEventListeners = new Vector <KermetaEditorEventListener> (); 
	
	final static public Logger pluginLog = LogConfigurationHelper.getLogger("KermetaEditor");
	
	/**
	 * The constructor.
	 */
	public TexteditorPlugin() {
		super();
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle("fr.irisa.triskell.kermeta.texteditor.TexteditorPluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
		
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
			
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

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = TexteditorPlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	
	public KMTEditor getEditor()
	{
		return editor;
	}
	/**
	 * set The kermeta texteditor
	 * @param newEditor
	 */
	public void setEditor(KMTEditor newEditor)
	{
		editor = newEditor;
	}
	
	public void registerListener(KermetaEditorEventListener listener) {
		kermetaEditorEventListeners.add(listener);
	}
	public void unregisterListener(KermetaEditorEventListener listener) {
		kermetaEditorEventListeners.remove(listener);
	}
}
