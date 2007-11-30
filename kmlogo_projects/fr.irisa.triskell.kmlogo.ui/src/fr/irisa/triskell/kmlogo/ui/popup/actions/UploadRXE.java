/* $Id: UploadRXE.java,v 1.4 2007-11-30 08:05:36 dvojtise Exp $
 * Project   : KmLogo
 * File      : UploadRXE.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2007
 * Authors       : 
 *		Franck Fleurey
 *		Didier Vojtisek
 */
package fr.irisa.triskell.kmlogo.ui.popup.actions;



import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.KermetaMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kmlogo.ui.ExecHelper;


public class UploadRXE implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile nxcFile;
	
	/**
	 * Constructor for Action1.
	 */
	public UploadRXE() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		Shell shell = new Shell();

		IOConsole console = new EclipseConsole("Logo uploadRXE");
		console.println(new InfoMessage("Uploading File " +  nxcFile.getLocation().toString()));
    	
    	 try {
    		
    		 /*
    		 String cmd = "/opt/NXT/BlueTooth/NXT -a 00:16:53:03:6A:B1 -W " + nxcFile.getLocation().toString();
    		 Runtime r = Runtime.getRuntime();
    		 Process p = r.exec(cmd);
    		 p.waitFor();
    		 System.out.println(cmd);
    		 // /opt/NXT/BlueTooth/NXT -a 00:16:53:03:6A:B1 -W Logo.rxe 
			*/
    		 
    		 String[] cmds = new String[4];
    		 cmds[0] = "/opt/NXT/BlueTooth/NXT";
    		 cmds[1] = "-a 00:16:53:03:6A:B1";
    		 cmds[2] = "-W";
    		 cmds[3] = nxcFile.getLocation().toString();
    		 
    		 String result = ExecHelper.exec(cmds).getOutput();
    		 console.println(new KermetaMessage(result ));
    		 
    		 console.println(new OKMessage("File Uploaded"));
    		 
    	 } catch(Throwable e) {
    		 console.println(new ErrorMessage("ERROR : " ));
    		 console.println(new ThrowableMessage(e));
    		 e.printStackTrace();
    	} 
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				nxcFile = (IFile)it.next();
			}

		}
	}

}
