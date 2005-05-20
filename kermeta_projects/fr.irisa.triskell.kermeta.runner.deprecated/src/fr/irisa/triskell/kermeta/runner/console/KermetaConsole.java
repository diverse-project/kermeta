/* $Id: KermetaConsole.java,v 1.3 2005-05-20 12:06:26 zdrey Exp $
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
import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.internal.console.MessageConsolePage;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.IPageBookViewPage;

import fr.irisa.triskell.kermeta.runner.dialogs.InputStreamDialog;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
//import org.eclipse.ui.internal.console.IOConsolePage;
/**
 * The console on which the results of an operation are printed (output),
 * and where the user can write data (input)
 */
public class KermetaConsole extends KermetaIOStream
{

    protected MessageConsole messageConsole;
    protected IConsoleManager consoleManager;
    protected MessageConsoleStream stream;
    protected InputStreamDialog inputDialog;
    
    public KermetaConsole()
    {
        messageConsole = new MessageConsole("KermetaConsole", null);
        stream = messageConsole.newMessageStream();
        ConsolePlugin plugin = ConsolePlugin.getDefault();
	    consoleManager = plugin.getConsoleManager();
	    consoleManager.addConsoles(new IConsole[]{messageConsole});
    }
    
    public void print(Object messageString)
    {
        String str = "";
        str =(messageString!=null)?messageString.toString():"PLUGIN ERROR : object to print is null ("+messageString+")";
	    stream.print(str);
	    stream.setColor(new Color(null, 120, 5, 100));
	    consoleManager.showConsoleView(messageConsole);
    }
    
    public Object read(String prompt)
    {
        String inputStr = null;
        inputDialog = new InputStreamDialog(new Shell(), 
	            "Kermeta input stream", 
	            prompt,"", null);
        int code = inputDialog.open();
        
        if (code != InputDialog.CANCEL)
	    {
            if (code != InputDialog.CANCEL)
		    {
                inputStr = inputDialog.getInputString();
		    }
	    }
        return inputStr;
    }
    
    
    /**
     * @see org.eclipse.ui.console.IConsole#createPage(org.eclipse.ui.console.IConsoleView)
     */
    public IPageBookViewPage createPage(IConsoleView view) {
    	return new MessageConsolePage(view, messageConsole);
    }


}
