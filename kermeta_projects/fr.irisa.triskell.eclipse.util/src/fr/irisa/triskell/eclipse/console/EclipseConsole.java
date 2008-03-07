

/*$Id: EclipseConsole.java,v 1.6 2008-03-07 15:15:29 dvojtise Exp $
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;
import fr.irisa.triskell.eclipse.console.messages.WarningMessage;

public class EclipseConsole extends IOConsole {

	/**		List of consoles to be able to remove some when there are too many.		*/
	private static List<EclipseConsole> consoles = new ArrayList<EclipseConsole>();
	
	/**		Number maximum of consoles that can be displayed in the console view.	*/
	private static final int CONSOLE_MAX = 3;
	
	/** 	max width of the lines in the console, if overflow, start a new line */
	public static final int CONSOLE_MAX_WIDTH = 5000;
	
	/** 	size for which we need to split the message before passing to the stream */
	public static final int LARGE_MESSAGE_SIZE = 10000;
	
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
	// Any object can be printed as far as it declares a toString method.			 //
	///////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * print the message eventually justify the message according to the maxwidth constant 
	 * deal with large string : they are printed using a separated thread instead of the UI thread
	 */
	public void print(final ConsoleMessage message) {
		// support for reasonnable sized string
		Runnable r = new Runnable() {
			public void run() {
				changeColor(message.getColor());
				String justifiedMsg = justifyMessage(message.getMessage());
				if(!((IOConsoleOutputStream)getOutputStream()).isClosed())
					try {
						((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg);
					} catch (IOException e) {
					}
				
			}
		};
		// support for large string !
		Job myJob = new Job("Kermeta is writing a large string to the console") {
		      public IStatus run(IProgressMonitor monitor) {
		    	  safePrint( message.getMessage(), message.getColor(), monitor);
		         return new Status(IStatus.OK, "fr.irisa.triskell.eclipse.utils", "large message printed to the console");
		      }
		   };
		if(message.getMessage().length() > LARGE_MESSAGE_SIZE){
			// large message
			myJob.schedule();
			// must wait before continuing
			try {
				myJob.join();
			} catch (InterruptedException e) {
				print(new WarningMessage("writing of large message to the console interrupted"));
			}
		}
		else{
			// normal messages are run in the UI thread
			ConsolePlugin.getStandardDisplay().syncExec(r);
		}
	}
	/** deal with not justified and large string
	 * this is because large string may block Eclipse UI
	 */
	protected void safePrint(String message, Color c, IProgressMonitor monitor){
		try {
			String justifiedMsg = justifyMessage(message);
			if(justifiedMsg.length() > LARGE_MESSAGE_SIZE){
				// deal with large messages ... chunk the message
				int nbChunk = justifiedMsg.length()/LARGE_MESSAGE_SIZE;
				monitor.beginTask("writing large string to the console", nbChunk+1);
				int start, end= 0;
				for(int i = 0; i< nbChunk; i++){
					start = LARGE_MESSAGE_SIZE*i;
					end = LARGE_MESSAGE_SIZE*i + LARGE_MESSAGE_SIZE;
					changeStream();
					changeColor(c);
					((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg.substring(start, end));
					monitor.worked(1);
				}
				changeStream();
				changeColor(c);
				((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg.substring(end, justifiedMsg.length()));
				monitor.done();
			}
			else
				changeColor(c);
				((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
			changeStream(); // reset the stream
			((IOConsoleOutputStream) getOutputStream()).setColor(c);
		}
	}
	/**
	 * allows to change stream, sometime needed if a stream is too full or when changing color
	 */
	public void changeStream(){
		try {
			if(outputStream != null)
				outputStream.close();
		} catch (IOException e) {
		}
		outputStream = null;
	}
	public void println(final ConsoleMessage message) {
		// use normal print for the message itself
		print(message);
		// add the cariage return
		Runnable r = new Runnable() {
			public void run() {
				changeColor(message.getColor());
				if(!((IOConsoleOutputStream)getOutputStream()).isClosed())
					try {
						((IOConsoleOutputStream)getOutputStream()).write("\n");
					} catch (IOException e) {
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
	
	public static String justifyMessage(String message){
		StringBuffer justifiedMessage = new StringBuffer(message);
		int lastNLIndex = 0;
		int index = 0;
		while(index < justifiedMessage.length()){
			if(justifiedMessage.charAt(index) == '\n' || index == justifiedMessage.length()-1){
				if(index - lastNLIndex > CONSOLE_MAX_WIDTH){
					// need to insert a newline
					justifiedMessage.insert(lastNLIndex+CONSOLE_MAX_WIDTH, '\n');
					lastNLIndex=lastNLIndex+CONSOLE_MAX_WIDTH;
					// normally , since we have inserted a char we should fall on the same newline char again
				}
				else
					lastNLIndex=index;
			}
			index++;
		}
		
		return justifiedMessage.toString();
	}
}


