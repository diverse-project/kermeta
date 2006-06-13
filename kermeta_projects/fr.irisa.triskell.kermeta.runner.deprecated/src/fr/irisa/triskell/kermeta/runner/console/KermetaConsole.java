/* $Id: KermetaConsole.java,v 1.15 2006-06-13 11:58:22 zdrey Exp $
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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationManager;
//import org.eclipse.debug.internal.ui.views.console.ProcessConsole;
import org.eclipse.jface.dialogs.InputDialog;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;

import org.eclipse.ui.console.IConsoleListener;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.TextConsolePage;
import org.eclipse.ui.part.IPageBookViewPage;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.dialogs.InputStreamDialog;
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
    //protected ProcessConsole messageConsole = null;
	protected IOConsoleOutputStream outputStream = null;
	protected IOConsoleInputStream inputStream = null;
	protected BufferedInputStream bufferedStream = null;
    protected IConsoleManager consoleManager = null;
    // The console view of the messageConsole...
    protected IConsoleView view = null;
    
    protected InputStreamDialog inputDialog = null;
    static protected KermetaConsole theConsole = null;
    protected InputDialogThread theInputThread = null;
    protected String consoleName;
    protected boolean isDisposed;
    
    public KermetaConsole(String name)
    {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        consoleName = name;
        isDisposed = false;
	    consoleManager = plugin.getConsoleManager();
	    consoleManager.addConsoleListener(this);
	    addConsole();
    }
    
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
			//inputStream.reset();
			inputStream.setColor(new Color(null, 200,30,240));
			result = new BufferedReader(new InputStreamReader(inputStream)).readLine();
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
    
    protected class InputDialogThread extends Thread 
    {
        String inputStr = "";
        String prompt;
        
        public InputDialogThread(String pPrompt)
        {
            super();
            prompt = pPrompt;
        }
        
        public void setPrompt(String pPrompt)
        {
        	prompt = pPrompt;
        }
        
        public void run ()
        {   
        	inputDialog = new InputStreamDialog(
                    				new Shell(), 
									"Kermeta input stream", 
									prompt,"", null);
		    int code = inputDialog.open();
		    if (code != InputDialog.CANCEL)
		    {
		       inputStr = inputDialog.getInputString();
		       inputDialog.close();
		    }
        }
    }
    
    
    
    /**
     * @see org.eclipse.ui.console.IConsole#createPage(org.eclipse.ui.console.IConsoleView)
     */
    public IPageBookViewPage createPage(IConsoleView view) {
    	System.err.println("Create a console page!");
    	this.view = view;
    	return new TextConsolePage(messageConsole, view);
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
    
    /** Dispose the current console. If disposed, it will be removed as soon as another console
     * is initialised */
    public void disposeCurrentConsole()
    {
    	messageConsole.isDisposed = true;
    	messageConsole.destroy();
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
     * Add a console.
     * Some experimental tests added in this code. Does not affect the classic running of this
     * method. (Please don't remove the comment notes yet)
     */
    public void addConsole() {
    	// Check the disposed consoles in ConsoleManager, and remove them (useless!)
    	removeDisposedConsoles();
    	
    	messageConsole = new InternalIOConsole(consoleName + "[" +  consoleManager.getConsoles().length + "]", null, null, true);
        outputStream = messageConsole.newOutputStream(); //messageConsole.newMessageStream();
        inputStream = messageConsole.getInputStream();
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
    
    protected void finalize() throws Throwable {
        super.finalize();
        
        System.err.println("FINALIZE KermetaConsole");
    }


}
