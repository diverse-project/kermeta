/* $Id: KermetaConsole.java,v 1.1 2005-05-16 17:05:27 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaConsole.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 13, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.console;


import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.internal.console.MessageConsolePage;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.IPageBookViewPage;
//import org.eclipse.ui.internal.console.IOConsolePage;
/**
 * The console on which the results of an operation are printed (output),
 * and where the user can write data (input)
 */
public class KermetaConsole extends MessageConsole
{

    protected MessageConsole messageConsole;
    protected IConsoleManager consoleManager; 
    
    public KermetaConsole(String name, ImageDescriptor imageDescriptor)
    {
        super(name, imageDescriptor);
        ConsolePlugin plugin = ConsolePlugin.getDefault();
	    consoleManager = plugin.getConsoleManager();
	    consoleManager.addConsoles(new IConsole[]{this});
	    

	    
	    // Print a welcome message
	    MessageConsoleStream stream = this.newMessageStream();
	    stream.println("Welcome to the kermeta console");
	    // Displays test message in orange
	    stream.setColor(new Color(null, 255, 100, 20));
	    
    }
    
    /**
     * Sho
     */
    public IConsoleView getIConsoleView()
    {
        consoleManager.showConsoleView(this);
        return null;
    }
    
    /**
     *  Wrapper for the print method of MessageConsoleStream 
     * */
    public void write(String messageString)
    {
//      Print a welcome message
	    MessageConsoleStream stream = this.newMessageStream();
	    stream.print(messageString);
	    stream.setColor(new Color(null, 220, 50, 100));
    }
    
    
    
    
    
    /**
     * @see org.eclipse.ui.console.IConsole#createPage(org.eclipse.ui.console.IConsoleView)
     */
    public IPageBookViewPage createPage(IConsoleView view) {
    	return new MessageConsolePage(view, this);
    }
}
