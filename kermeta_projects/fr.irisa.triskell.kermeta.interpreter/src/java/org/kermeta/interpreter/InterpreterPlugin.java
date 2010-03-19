package org.kermeta.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;


public class InterpreterPlugin extends Plugin {

	/** Logger to get the error of this interpreter */
	final static public Logger internalLog = LoggerFactory.getLogger("kermeta.interpreter");

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.interpreter";

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
