/* $Id: TexteditorPlugin.java,v 1.13 2007-09-11 12:31:00 dvojtise Exp $
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
import java.util.Set;

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
	
	final static public String KMT_PARTITIONING = "_KMT_PARTITIONING_";
	
	// the current kermeta texteditor
	private KMTEditor editor;
	
	public KMTEditor getEditor() {
		return editor;
	}
	
	public void setEditor(KMTEditor newEditor) {
		editor = newEditor;
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

	
	public void registerListener(KermetaEditorEventListener listener) {
		kermetaEditorEventListeners.add(listener);
	}
	public void unregisterListener(KermetaEditorEventListener listener) {
		kermetaEditorEventListeners.remove(listener);
	}
}
