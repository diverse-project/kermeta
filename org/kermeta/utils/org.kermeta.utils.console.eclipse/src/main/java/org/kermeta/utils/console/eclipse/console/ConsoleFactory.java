package org.kermeta.utils.console.eclipse.console;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.IConsoleFactory;

/**
 * This class permits use of the extension point org.eclipse.ui.console.consoleFactories
 * @author mgouyett
 *
 */
public class ConsoleFactory implements IConsoleFactory {
	
	// some default colors that can be used
	public static final Color INFO = new Color(null, 0,0,255);
	public static final Color OK = new Color(null, 0,128,0);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,150,0);
	public static final Color STANDARD = new Color(null, 0,0,0);
	
	private  IConsoleUtility console = null;
	
	private static ConsoleFactory instance = new ConsoleFactory();
	
	public static ConsoleFactory getInstance() {
		return instance;
	}
	
	/**
	 * Retrieve the console associated with this console factory
	 * @return the console associated with this console factory
	 */
	public  IConsoleUtility getConsole() {
		openConsole();
		return console;
	}

	/**
	 * Open the console associated with the console factory and create it if it do not ever exist
	 */
	public  void openConsole() {
		if (console == null){
		console = new ConsoleUtility("Test Console", null, STANDARD, ERROR, WARNING, INFO, OK);
		}
	}

}
