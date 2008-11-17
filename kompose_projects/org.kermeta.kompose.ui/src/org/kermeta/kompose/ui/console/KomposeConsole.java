package org.kermeta.kompose.ui.console;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;


public class KomposeConsole implements KermetaIOStream {
	
	public void dispose() {
	}

	public void initialize() {
	}

	public void print(Object outputString) {
		printMessage(outputString.toString(), KomposeConsole.KERMETA);
	}

	public String read(String prompt) {
		throw new Error("NOT IMPLEMENTED !");
	}

	/*public void setKermetaInterpreter(KermetaInterpreter ki) {
		// TODO Auto-generated method stub
		
	}*/

	public static final Color INFO = new Color(null, 0,0,255);
	public static final Color OK = new Color(null, 0,128,0);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,150,0);
	public static final Color KERMETA = new Color(null, 255,114,0);
	
	//public static Display display;
	
	// The instance
	private static MessageConsole console;
	
	public static MessageConsole getConsole() {
		if (console == null) {
			console = new MessageConsole("Kompose Console", null, true);
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ console });
		}
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);

		return console;
	}
	
	public static void clearConsole() {
		getConsole().clearConsole();
	}
	
	public static void printlnMessage(final String msg, final Color color) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				MessageConsoleStream result = getConsole().newMessageStream();
				result.setColor(color);
				result.println(msg);
			}
		});
	}
	
	public static void printMessage(final String msg, final Color color) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				MessageConsoleStream result = getConsole().newMessageStream();
				result.setColor(color);
				result.print(msg);
			}
		});
	}
	
	
}
