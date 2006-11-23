/*
 * Created on 1 November 2006
 *
 * Contributor : michel Hassenforder
 * 
 */
package fr.irisa.triskell.sintaks;

import org.eclipse.jface.preference.IPreferenceStore;

import fr.irisa.triskell.sintaks.SintaksPlugin;

/**
 * Option Manager for the java_cup syntax editor
 * 
 * @author michel Hassenforder
 * 
 */
public class OptionManager {

	private static final boolean DebugProcess = false;
	private static final boolean DebugParser  = false;
	private static final boolean DebugPrinter = false;
	private static final boolean DebugModel   = false;
	private static final String DebugOutputFile = "debug.txt";
	private static final String SyntacticModel = "";

	private static final String PREFIX = SintaksPlugin.PLUGIN_ID + ".";

	public static final String DEBUG_PROCESS     = PREFIX + "debug.process";
	public static final String DEBUG_PARSER      = PREFIX + "debug.parser";
	public static final String DEBUG_PRINTER     = PREFIX + "debug.printer";
	public static final String DEBUG_MODEL       = PREFIX + "debug.model";
	public static final String DEBUG_OUTPUT_FILE = PREFIX + "debug.outputfile";
	public static final String SYNTACTIC_MODEL   = PREFIX + "syntacticmodel";

	private IPreferenceStore store;

	public OptionManager (IPreferenceStore store) {
		this.store = store;
	}

	/**
	 * Set default in preference store.
	 */
	public void initializeDefaults() {
		store.setDefault(DEBUG_PROCESS, DebugProcess);
		store.setDefault(DEBUG_PARSER, DebugParser);
		store.setDefault(DEBUG_PRINTER, DebugPrinter);
		store.setDefault(DEBUG_MODEL, DebugModel);
		store.setDefault(DEBUG_OUTPUT_FILE, DebugOutputFile);
		store.setDefault(SYNTACTIC_MODEL, SyntacticModel);
	}

	public boolean isDebugProcess () {
		return store.getBoolean (DEBUG_PROCESS);
	}

	public boolean isDebugParser () {
		return store.getBoolean (DEBUG_PARSER);
	}

	public boolean isDebugPrinter () {
		return store.getBoolean (DEBUG_PRINTER);
	}

	public boolean isDebugModel () {
		return store.getBoolean (DEBUG_MODEL);
	}

	public String getDebugOutputFile () {
		return store.getString (DEBUG_OUTPUT_FILE);
	}

	public String getSyntacticModel () {
		return store.getString (SYNTACTIC_MODEL);
	}
	
	public void setSyntacticModel (String text) {
		store.setValue(SYNTACTIC_MODEL, text);
	}
	
}
