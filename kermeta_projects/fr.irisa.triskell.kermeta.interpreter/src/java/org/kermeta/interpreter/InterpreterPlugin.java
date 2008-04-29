package org.kermeta.interpreter;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Plugin;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class InterpreterPlugin extends Plugin {

	/** Logger to get the error of this interpreter */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("kermeta.interpreter");

	static private InterpreterPlugin _instance;
	
	/**
	 * The constructor
	 * note: cannot put this as a singleton due to eclipse :-(
	 * we cannot garantee that there is only one instance
	 */
	public InterpreterPlugin() {
		_instance = this;
	}
	
	static public InterpreterPlugin getDefault() {
		if ( _instance == null )
			_instance = new InterpreterPlugin();
		return _instance;
	}
	
}
