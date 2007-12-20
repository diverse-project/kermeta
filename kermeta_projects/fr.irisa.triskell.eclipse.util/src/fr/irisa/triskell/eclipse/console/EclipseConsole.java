

/*$Id: EclipseConsole.java,v 1.4 2007-12-20 09:12:12 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EclipseConsole.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.eclipse.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;

public class EclipseConsole extends IOConsole {

	/**		List of consoles to be able to remove some when there are too many.		*/
	private static List<EclipseConsole> consoles = new ArrayList<EclipseConsole>();
	
	/**		Number maximum of consoles that can be displayed in the console view.	*/
	private static final int CONSOLE_MAX = 3;
	
	/**
	 * The IOConsole instance.
	 */
	protected org.eclipse.ui.console.IOConsole console = null;

	/**
	 * This basic constructor instanciates an IOConsole object and initialize it.
	 * The name parameter is used by the Eclipse console view and is mandatory.
	 * @param name
	 */
	public EclipseConsole(String name) {
		console = new KermetaConsole(name, null);
		initialize();
	}
	
	public EclipseConsole(KermetaConsole console) {
		this.console = console;
		initialize();
	}
	
	/**
	 * The initialize method add the console instance to the eclipse console registry,
	 * and display it.
	 *
	 */
	protected void initialize() {
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ console });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
		console.activate();
		if ( consoles.size() >= CONSOLE_MAX ) {
			EclipseConsole consoleToRemove = consoles.remove(0);
			ConsolePlugin.getDefault().getConsoleManager().removeConsoles( new IConsole[] {consoleToRemove.console} );
		}
		consoles.add(this);
	}
	
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public OutputStream getOutputStream() {
		if ( outputStream == null )
			outputStream = console.newOutputStream();
		return outputStream;
	}
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public BufferedReader getReader() {
		if ( reader == null )
			reader = new BufferedReader( new InputStreamReader( console.getInputStream() ) );
		return reader;
	}
	
	public String promptAndRead(String prompt) {
		console.activate();
		print(prompt);
		return read();
	}
	
	public void clear() {
		console.clearConsole();
	}
	
	//////////////////////////////
	//////////////////////////////
	//		Writing Methods		//
	///////////////////////////////////////////////////////////////////////////////////////
	// The writing protocol provides some methods to print out some String or messages . //
	// Any object can be printed for the moment it declares a toString method.			 //
	///////////////////////////////////////////////////////////////////////////////////////
	
	public void print(final ConsoleMessage message) {
		Runnable r = new Runnable() {
			public void run() {
				changeColor(message.getColor());
				IOConsoleOutputStream stream = (IOConsoleOutputStream) getOutputStream();
				try {
					if ( ! stream.isClosed() )
						stream.write(message.getMessage());
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		};
		ConsolePlugin.getStandardDisplay().syncExec(r);
	}
	
	/**
	 * this methods allow to change the color of futur message
	 * (this is because a simple change of current stream color, change the color for all messages, even previous ones ...) 
	 * @param c
	 */
	public void changeColor(Color c){
		Color previousColor = ((IOConsoleOutputStream) getOutputStream()).getColor();
		if(!c.equals(previousColor)){
			// need to change to another stream for the new color
			outputStream = null; // reset the stream
			((IOConsoleOutputStream) getOutputStream()).setColor(c);
		}
	}
	public void println(final ConsoleMessage message) {
		Runnable r = new Runnable() {
			public void run() {
				changeColor(message.getColor());
				IOConsoleOutputStream stream = (IOConsoleOutputStream) getOutputStream();
				try {
					stream.write(message.getMessage() + '\n');
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		};
		ConsolePlugin.getStandardDisplay().syncExec(r);
	}
	

	//////////////////////////////////////
	//////////////////////////////////////
	//		End of Writing Methods		//
	//////////////////////////////////////
	//////////////////////////////////////
}


