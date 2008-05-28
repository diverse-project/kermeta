package org.kermeta.interpreter;

import org.apache.commons.logging.Log;
import org.eclipse.core.runtime.Plugin;

import org.kermeta.log4j.util.LogConfigurationHelper;

public class InterpreterPlugin extends Plugin {

	/** Logger to get the error of this interpreter */
	final static public Log internalLog = LogConfigurationHelper.getLogger("kermeta.interpreter");

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
