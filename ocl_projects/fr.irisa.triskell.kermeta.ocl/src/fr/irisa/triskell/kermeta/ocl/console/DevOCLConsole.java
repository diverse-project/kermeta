package fr.irisa.triskell.kermeta.ocl.console;

import org.eclipse.swt.graphics.Color;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;

public class DevOCLConsole implements KermetaIOStream {
	
	public void dispose() { }

	public void initialize() { }

	public void print(Object outputString) {
		System.out.println(outputString);
	}

	public String read(String prompt) {
		throw new Error("NOT IMPLEMENTED !");
	}

	public void setKermetaInterpreter(KermetaInterpreter ki) { }

	// The instance
	private static DevOCLConsole console;

	public static void printlnMessage(final String msg, final Color color) {
		System.out.println(msg);
	}
	
	public static void printMessage(final String msg, final Color color) {
		System.out.print(msg);
	}
	
	
}
