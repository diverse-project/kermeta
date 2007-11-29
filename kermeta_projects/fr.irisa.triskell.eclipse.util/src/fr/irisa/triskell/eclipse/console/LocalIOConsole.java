

/*$Id: LocalIOConsole.java,v 1.3 2007-11-29 16:28:04 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	LocalIOConsole.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.eclipse.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.swt.graphics.Color;

import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;

public class LocalIOConsole extends IOConsole {
	
	protected OutputStream getOutputStream() {
		if ( outputStream == null )
			outputStream = System.out;
		return outputStream;
	}
	
	public void print(ConsoleMessage message) {
		PrintStream stream = (PrintStream) getOutputStream();
		try {
			stream.write(message.getMessage().getBytes());
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public void println(ConsoleMessage message) {
		PrintStream stream = (PrintStream) getOutputStream();
		try {
			stream.write( (message.getMessage() + '\n').getBytes() );
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	public void changeColor(Color c) {
		// nothing to do if the output is the stout console
	}

	protected BufferedReader getReader() {
		if ( reader == null )
			reader = new BufferedReader( new InputStreamReader( System.in ) );
		return reader;
	}
	
}


