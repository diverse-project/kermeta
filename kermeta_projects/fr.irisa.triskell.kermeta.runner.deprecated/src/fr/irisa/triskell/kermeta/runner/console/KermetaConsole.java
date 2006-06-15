/* $Id: KermetaConsole.java,v 1.18 2006-06-15 13:23:11 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaConsole.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 13, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.console;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.console.ConsoleColorProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleListener;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;

import fr.irisa.triskell.kermeta.runner.dialogs.InputStreamDialog;
import fr.irisa.triskell.kermeta.runner.launching.KermetaRunTarget;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
//import org.eclipse.ui.internal.console.IOConsolePage;
/**
 * The console on which the results of an operation are printed (output),
 * and where the user can write data (input)
 * TODO : implement Listener
 */
public class KermetaConsole extends KermetaIOStream implements IConsoleListener
{

	protected final static int MAX_BYTES = 10000;
    protected InternalIOConsole messageConsole = null;
	protected IOConsoleOutputStream outputStream = null;
	protected IOConsoleInputStream inputStream = null;
	protected BufferedInputStream bufferedStream = null;
	protected BufferedReader bufferedReader =  null;
    protected IConsoleManager consoleManager = null;
    // The console view of the messageConsole...
    protected IConsoleView view = null;
    
    protected InputStreamDialog inputDialog = null;
    static protected KermetaConsole theConsole = null;
    protected String consoleName;
    protected boolean isDisposed;
    // The process being launched
    protected IProcess process;
    protected ILaunch launch;
    protected KermetaRunTarget target;
    
    public KermetaConsole(String name)
    {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        consoleName = name;
        isDisposed = false;
        consoleManager = plugin.getConsoleManager();
	    consoleManager.addConsoleListener(this);
	    initialize();
    }
    
    public KermetaConsole(String name, KermetaRunTarget t) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
        consoleName = name;
        isDisposed = false;
        target = t;
        consoleManager = plugin.getConsoleManager();
	    consoleManager.addConsoleListener(this);
	}

	public void setProcess(IProcess process) { this.process = process; }
    
    public boolean isInitialized()
    {
    	return messageConsole != null;
    }
    
    public void print(Object messageString)
    {
    	String str = "";
        str =(messageString!=null)?messageString.toString():"Error : the object to print is null ("+messageString+")";
	    // stream.print(str);
        try {
			outputStream.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    /*stream.setColor(new Color(null, 120, 5, 100));*/
    }
    
    public Object read(String prompt)
    {
		String result = "";
    	try
    	{
    		messageConsole.activate();
    		inputStream = messageConsole.getInputStream();
    		// This lead to a thread access error.
    		// inputStream.setColor(new Color(null, 200,30,240));
			if (bufferedReader == null)
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			result = bufferedReader.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (result == null) result = " ";
		return result;
    }

    /**
     * Reset the console : remove all displayed strings.
     * Does not work..
     */
    public void reset()
    {
    	outputStream = messageConsole.newOutputStream();
    	inputStream = messageConsole.getInputStream();
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.console.IConsoleListener#consolesAdded(org.eclipse.ui.console.IConsole[])
     */
    public void consolesAdded(IConsole[] consoles)
    {   //System.out.println("Consols added : ");
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.console.IConsoleListener#consolesRemoved(org.eclipse.ui.console.IConsole[])
     */
    public void consolesRemoved(IConsole[] consoles) {
        //System.out.println("Consols removed");
    }
    
    /**
     * Dispose the current console. If disposed, it will be removed as soon as another console
     * is initialised 
     *  @see fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream#dispose()*/
    public void dispose()
    {
    	messageConsole.isDisposed = true;
    	//messageConsole.dispose();
    	// messageConsole.destroy(); // throws an exception
    	consoleManager.removeConsoleListener(this);
    }


	/** Remove all the consoles which isDisposed attribute is set to true.
     * Only called when a new console is created for interpretation */
    private void removeDisposedConsoles()
    {
    	IConsole[] consoles = consoleManager.getConsoles();
    	for (int i=0; i<consoles.length; i++)
    	{
    		InternalIOConsole c = (InternalIOConsole)consoles[i];
    		if (c.isDisposed == true) consoleManager.removeConsoles(new IConsole[] {c});
    	}
    }
    
    
    
    
    /**
	 * @return Returns the target.
	 */
	public KermetaRunTarget getTarget() {
		return target;
	}

	/**
     * Add an internal IO console. This implicitely open the console
     * Some experimental tests added in this code. Does not affect the classic running of this
     * method. (Please don't remove the comment notes yet)
     */
    public void initialize() {
    	// Check the disposed consoles in ConsoleManager, and remove them (useless!)
    	removeDisposedConsoles();
    	// NOTE : the ISO-8859-1 VALUE IS VITAL.
    	messageConsole = new InternalIOConsole(consoleName + "[" +  consoleManager.getConsoles().length + "]", null);
    		// This is for ProcessConsole extension
    		//new InternalIOConsole(target.getProcess(), new ConsoleColorProvider(), "ISO-8859-1") ; //consoleName + "[" +  consoleManager.getConsoles().length + "]");
    	inputStream = messageConsole.getInputStream();
    	outputStream = messageConsole.newOutputStream(); //messageConsole.newMessageStream();

    	consoleManager.addConsoles( new IConsole[]{messageConsole});
		consoleManager.showConsoleView(messageConsole);
    }
    
    /**
     * Do some cleanup on the console
     * (unregister events, ...)
     */
    public void removeConsoleListener()
    {
	    consoleManager.removeConsoleListener(this);
    }
    
//    private final boolean TRACE_ENABLED = Boolean.valueOf(Platform.getDebugOption("org.maven.ide.eclipse/console")).booleanValue();
//
//    public boolean isTraceEnabled() {
//      return TRACE_ENABLED;
//    }
//
//    public void consolesAdded(IConsole[] consoles) {
//      Tracer.trace(this, "consolesAdded()");
//      for (int i = 0; i < consoles.length; i++) {
//        IConsole console = consoles[i];
//        if (console == Maven2Console.this) {
//          init();
//        }
//      }
//
//    }
//    public void consolesRemoved(IConsole[] consoles) {
//      Tracer.trace(this, "consolesRemoved()");
//      for (int i = 0; i < consoles.length; i++) {
//        IConsole console = consoles[i];
//        if (console == Maven2Console.this) {
//          ConsolePlugin.getDefault().getConsoleManager().removeConsoleListener(this);
//          dispose();
//        }
//      }
//    }


    
    protected void finalize() throws Throwable {
        super.finalize();
    }

	/**
	 * @return Returns the inputStream.
	 */
	public IOConsoleInputStream getInputStream() {
		return inputStream;
	}

	/**
	 * @return Returns the outputStream.
	 */
	public IOConsoleOutputStream getOutputStream() {
		return outputStream;
	}

}
