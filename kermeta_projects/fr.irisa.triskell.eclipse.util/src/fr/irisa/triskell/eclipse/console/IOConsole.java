/* $Id: IOConsole.java,v 1.6 2007-11-28 07:50:59 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	IOConsole.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;
import fr.irisa.triskell.eclipse.console.messages.ObjectKermetaMessage;

/**
 * 
 * This console encapsulates an IOConsole instance and provides an
 * high level writing / reading protocol.
 * 
 * As a fact you can use this class either to manage output and input
 * string and display it in the console view.
 * 
 * @author ftanguy
 *
 */
public class IOConsole {

	/**
	 * The IOConsole instance.
	 */
	protected org.eclipse.ui.console.IOConsole console = null;
	
	/**
	 * Considering the IOConsole protocol, several output stream can be created.
	 * For the moment, we just need one. To get access to it, please use the accessor method.
	 */
	protected OutputStream outputStream = null;

	/**
	 * The reader is used to read strings from the keyboard. To get access to it, please use the accessor method.
	 */
	private BufferedReader reader;
	
	//////////////////////////
	//////////////////////////
	//		Constructor		//
	//////////////////////////
	//////////////////////////
	/**
	 * This constructor is IMPORTANT for the subclasses.
	 */
	protected IOConsole() {}
	
	/**
	 * This basic constructor instanciates an IOConsole object and initialize it.
	 * The name parameter is used by the Eclipse console view and is mandatory.
	 * @param name
	 */
	public IOConsole(String name) {
		console = new KermetaConsole(name, null);
		initialize();
	}
	
	public IOConsole(KermetaConsole console) {
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
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Constructor		//
	//////////////////////////////////
	//////////////////////////////////
	

	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	protected OutputStream getOutputStream() {
		if ( outputStream == null )
			outputStream = console.newOutputStream();
		return outputStream;
	}
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	private BufferedReader getReader() {
		if ( reader == null )
			reader = new BufferedReader( new InputStreamReader( console.getInputStream() ) );
		return reader;
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Accessors		//
	//////////////////////////////////
	//////////////////////////////////

	
	
	
	//////////////////////////////
	//////////////////////////////
	//		Writing Methods		//
	///////////////////////////////////////////////////////////////////////////////////////
	// The writing protocol provides some methods to print out some String or messages . //
	// Any object can be printed for the moment it declares a toString method.			 //
	///////////////////////////////////////////////////////////////////////////////////////
	public void print(Object o) {
		if ( o != null )
			print( new ObjectKermetaMessage(o) );
	}
	
	public void println(Object o) {
		if ( o != null )
			println( new ObjectKermetaMessage(o) );
	}
	
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
	
	
	
	//////////////////////////////
	//////////////////////////////
	//		Reading Methods		//
	//////////////////////////////
	//////////////////////////////
	public String read() {
		String line = "";
		BufferedReader reader = getReader();
		try {
			line = reader.readLine();
			if ( line == null )
				line = "";
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return line;
	}
	
	public String promptAndRead(String prompt) {
		console.activate();
		print(prompt);
		return read();
	}
	//////////////////////////////////////
	//////////////////////////////////////
	//		End of Reading Methods		//
	//////////////////////////////////////
	//////////////////////////////////////
	
	
	public void clear() {
		console.clearConsole();
	}
	
	
	public void dispose() {
		try {
			if ( outputStream != null )
				outputStream.close();
			if ( reader != null )
				reader.close();
			//ConsolePlugin.getDefault().getConsoleManager().removeConsoles( new IConsole[]{console} );
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public void finalize() throws Throwable {
		super.finalize();
		if ( (outputStream != null) && ! ((IOConsoleOutputStream) getOutputStream()).isClosed() )
			outputStream.close();
	}
	
	
}
