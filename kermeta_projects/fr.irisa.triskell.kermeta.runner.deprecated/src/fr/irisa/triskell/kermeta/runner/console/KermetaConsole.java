/* $Id: KermetaConsole.java,v 1.8 2005-06-10 16:00:18 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaConsole.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 13, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.console;


import org.eclipse.jface.dialogs.InputDialog;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;

import org.eclipse.ui.console.IConsoleListener;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.internal.console.MessageConsolePage;
import org.eclipse.ui.part.IPageBookViewPage;

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

    protected MessageConsole messageConsole;
    protected IConsoleManager consoleManager;
    protected MessageConsoleStream stream;
    protected InputStreamDialog inputDialog;
    
    public KermetaConsole()
    {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
	    consoleManager = plugin.getConsoleManager();
	    consoleManager.addConsoleListener(this);
    }
    
    public void print(Object messageString)
    {
        String str = "";
        str =(messageString!=null)?messageString.toString():"Error : the object to print is null ("+messageString+")";
	    stream.print(str);
	    /*stream.setColor(new Color(null, 120, 5, 100));*/
    }
    
    public Object read(String prompt)
    {
        InputDialogThread thread = new InputDialogThread(prompt);
        Display.getDefault().syncExec(thread);
        
        return thread.inputStr;
        
    }

    /**
     * Reset the console : remove all displayed strings.
     * Does not work..
     */
    public void reset()
    {
        stream = messageConsole.newMessageStream();
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
    			    }
            }
    }
    
    /**
     * @see org.eclipse.ui.console.IConsole#createPage(org.eclipse.ui.console.IConsoleView)
     */
    public IPageBookViewPage createPage(IConsoleView view) {
    	return new MessageConsolePage(view, messageConsole);
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
    
    /** Remove all the existing consoles [temporary patch]*/
    public void removeCurrentConsole() {
        consoleManager.removeConsoles(consoleManager.getConsoles());
    }
    
    /**
     * Add a console
     */
    public void addConsole() {
        messageConsole = new MessageConsole("KermetaConsole", null);
        stream = messageConsole.newMessageStream();
        consoleManager.addConsoles( new IConsole[]{messageConsole});
	    consoleManager.showConsoleView(messageConsole);
    }
    


}
