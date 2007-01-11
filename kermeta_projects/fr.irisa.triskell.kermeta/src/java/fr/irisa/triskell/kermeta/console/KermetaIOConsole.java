package fr.irisa.triskell.kermeta.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

import fr.irisa.triskell.kermeta.console.messages.KermetaMessage;
import fr.irisa.triskell.kermeta.console.messages.ObjectKermetaMessage;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

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
public class KermetaIOConsole {

	/**
	 * The IOConsole instance.
	 */
	protected IOConsole console = null;
	
	/**
	 * Considering the IOConsole protocol, several output stream can be created.
	 * For the moment, we just need one. To get access to it, please use the accessor method.
	 */
	private IOConsoleOutputStream outputStream = null;

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
	protected KermetaIOConsole() {}
	
	/**
	 * This basic constructor instanciates an IOConsole object and initialize it.
	 * The name parameter is used by the Eclipse console view and is mandatory.
	 * @param name
	 */
	public KermetaIOConsole(String name) {
		console = new IOConsole(name, null);
		initialize();
	}
	
	/**
	 * The initialize method add the console instance to the eclipse console registry,
	 * and display it.
	 *
	 */
	protected void initialize() {
		KermetaPlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ console }); ;
		KermetaPlugin.getDefault().getConsoleManager().showConsoleView(console);
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
	private IOConsoleOutputStream getOutputStream() {
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
		print( new ObjectKermetaMessage(o) );
	}
	
	public void println(Object o) {
		println( new ObjectKermetaMessage(o) );
	}
	
	public void print(KermetaMessage message) {
		IOConsoleOutputStream stream = getOutputStream();
		stream.setColor(message.getColor());
		try {
			stream.write(message.getMessage());
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public void println(KermetaMessage message) {
		IOConsoleOutputStream stream = getOutputStream();
		stream.setColor(message.getColor());
		try {
			stream.write(message.getMessage() + '\n');
		} catch (IOException exception) {
			exception.printStackTrace();
		}
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
			outputStream.close();
			reader.close();
			//KermetaPlugin.getDefault().getConsoleManager().removeConsoles( new IConsole[]{console} );
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public void finalize() throws Throwable {
		super.finalize();
		if ( (outputStream != null) && ! outputStream.isClosed() )
			outputStream.close();
	}
	
	
}
