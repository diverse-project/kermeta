/* $Id: $
* Project    : org.kermeta.utils.console.eclipse
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 18 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.utils.console.eclipse.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;



/**
 * This class implements the interface IConsoleUtility to provide a console for Kermeta or any other tool
 * @author mgouyett
 *
 */
public class ConsoleUtility extends IOConsole implements IConsoleUtility {
	
	// Colors for the different messages
	/**
	 * Color for standard message
	 */
	private Color standardColor;
	
	/**
	 * Color for error message
	 */
	private Color errorColor;
	
	/**
	 * Color for warning message
	 */
	private Color warningColor;
	
	/**
	 * Color for info messages
	 */
	private Color infoColor;
	
	/**
	 * Color for ok_message
	 */
	private Color okColor;
	
	//BufferedReader to read input stream
	private BufferedReader reader;
	
	// Output stream to display on the console
	private IOConsoleOutputStream outputStream;
	
	/** 	max width of the lines in the console, if overflow, start a new line */
	public static final int CONSOLE_MAX_WIDTH = 5000;
	
	/** 	size for which we need to split the message before passing to the stream */
	public static final int LARGE_MESSAGE_SIZE = 10000;

	/**
	 * @param name
	 * @param imageDescriptor
	 */
	public ConsoleUtility(String name, ImageDescriptor imageDescriptor,Color standardColor, Color errorColor, Color warningColor, Color infoColor, Color okColor ) {
		super(name, imageDescriptor);
		
		// Enable use of console in Eclipse
		ConsolePlugin.getDefault().
		   getConsoleManager().addConsoles(new IConsole[]{ this });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(this);
		this.activate();
		
		// Initialize input/ outputStream
		reader = new BufferedReader(new InputStreamReader(this.getInputStream()));
		outputStream = this.newOutputStream();
	}

	//--------------------------------------------------------------------------------------------------------------
	// Input stream/ output stream method
	//--------------------------------------------------------------------------------------------------------------
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public IOConsoleOutputStream getOutputStream() {
		if ( outputStream == null )
			outputStream = this.newOutputStream();
		return outputStream;
	}
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public BufferedReader getReader() {
		if ( reader == null )
			reader = new BufferedReader( new InputStreamReader( this.getInputStream() ) );
		return reader;
	}
	
	public void writeInOutputStream (final String message,final Color color) {
		new Job("Console product derivation") {
			public IStatus run(IProgressMonitor pm) {
		//Change the color to write if necessary
		switchColor(color);
		
		// write the message
		try {
			getOutputStream().write(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Status.OK_STATUS;
			}
			}.schedule();
	}
	
	//Methods to pretty print the message
	/**
	 * print the message eventually justify the message according to the maxwidth constant 
	 * deal with large string : they are printed using a separated thread instead of the UI thread
	 */
	public void print(final String message,final Color color) {
		// support for reasonnable sized string
		Runnable r = new Runnable() {
			public void run() {
				changeColor(color);
				String justifiedMsg = justifyMessage(message);
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
		    	  safePrint( message, color, monitor);
		         return new Status(IStatus.OK, "fr.irisa.triskell.eclipse.utils", "large message printed to the console");
		      }
		   };
		if(message.length() > LARGE_MESSAGE_SIZE){
			// large message
			myJob.schedule();
			// must wait before continuing
			try {
				myJob.join();
			} catch (InterruptedException e) {
				print("writing of large message to the console interrupted", this.errorColor);
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
			else{
				changeColor(c);
				((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
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
	
	//--------------------------------------------------------------------------------------------------------------
	// Color methods
	//--------------------------------------------------------------------------------------------------------------
	
	/**
	 * this methods allow to change the color of futur message
	 * (this is because a simple change of current stream color, change the color for all messages, even previous ones ...) 
	 * @param c
	 */
	public void switchColor(Color c){
		Color previousColor = getOutputStream().getColor();
		if(!c.equals(previousColor)){
			// need to change to another stream for the new color
			changeStream(); // reset the stream
			getOutputStream().setColor(c);
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
	

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#changeColor(org.eclipse.swt.graphics.Color)
	 */
	public void changeColor(Color c) {
		this.standardColor = c;	
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#changeErrorColor(org.eclipse.swt.graphics.Color)
	 */
	public void changeErrorColor(Color c) {
		this.errorColor = c;
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#changeInfoColor(org.eclipse.swt.graphics.Color)
	 */
	public void changeInfoColor(Color c) {
		this.infoColor = c;
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#changeOKColor(org.eclipse.swt.graphics.Color)
	 */
	public void changeOKColor(Color c) {
		this.okColor = c;
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#changeWarningColor(org.eclipse.swt.graphics.Color)
	 */
	public void changeWarningColor(Color c) {
		this.warningColor = c;
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#error(java.lang.String)
	 */
	public void error(String error) {
		print (error,this.errorColor);	
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#errorln(java.lang.String)
	 */
	public void errorln(String error) {
		print(error + "\n",this.errorColor);
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#info(java.lang.String)
	 */
	public void info(String info) {
		print (info ,this.infoColor);
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#infoln(java.lang.String)
	 */
	public void infoln(String info) {
		print (info + "\n",this.infoColor);
		
	}
	
	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#warning(java.lang.String)
	 */
	public void warning(String warning) {
		print (warning ,this.warningColor);
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#warningln(java.lang.String)
	 */
	public void warningln(String warning) {
		print (warning + "\n" ,this.warningColor);
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#write(java.lang.String)
	 */
	public void write(String message) {
		print (message ,this.standardColor);
	}
	
	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#writeln(java.lang.String)
	 */
	public void writeln(String message) {
		print (message + "\n" ,this.standardColor);
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#write_ok(java.lang.String)
	 */
	public void write_ok(String ok) {
		print (ok  ,this.okColor);
		
	}

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#write_ok_ln(java.lang.String)
	 */
	public void write_ok_ln(String ok_ln) {
		print ( ok_ln + "\n" ,this.okColor);
		
	}

	

	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#read()
	 */
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
	
	/* (non-Javadoc)
	 * @see org.kermeta.utils.console.eclipse.console.IConsoleUtility#promptAndRead()
	 */
	public String promptAndRead(String prompt) {
		write(prompt);
		return read();
	}

	

	

	

	

}
