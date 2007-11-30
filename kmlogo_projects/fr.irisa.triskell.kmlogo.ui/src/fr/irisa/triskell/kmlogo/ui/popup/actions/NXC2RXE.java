/* $Id: NXC2RXE.java,v 1.4 2007-11-30 08:05:36 dvojtise Exp $
 * Project   : KmLogo
 * File      : NXC2RXE.java
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
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.KermetaMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kmlogo.ui.ExecHelper;


public class NXC2RXE implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile nxcFile;
	
	/**
	 * Constructor for Action1.
	 */
	public NXC2RXE() {
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
		//Shell shell = new Shell();

		IFile rxeFile = nxcFile.getWorkspace().getRoot().getFile(nxcFile.getFullPath().removeFileExtension().addFileExtension("rxe"));
    	
    	//String cmd = "dot -Tpdf -o "+pdfFile.getLocation().toOSString()+" " + dotFile.getLocation().toOSString();
    	
		IOConsole console = new EclipseConsole("Logo NXC2RXE compiler");
		console.println(new InfoMessage("Compiling file " + nxcFile));
    	
    	 try {
    		 //Runtime r = Runtime.getRuntime();
    		 //Process p = r.exec(cmd);
    		 //p.waitFor();
    		 
    		 String[] cmds = new String[3];
    		 cmds[0] = "/opt/NXT/nbc/nbc";
    		 cmds[1] = nxcFile.getLocation().toOSString();
    		 cmds[2] = "-O=" + rxeFile.getLocation().toOSString();
    		 
    		 String result = ExecHelper.exec(cmds).getOutput();
    		 console.println(new KermetaMessage(result ));
    		 
    		 rxeFile.refreshLocal(1, null);
    		 console.println(new OKMessage("File " + rxeFile + " created"));
    		 
    	 } catch(Throwable e) {
    		 console.println(new ErrorMessage("ERROR : " ));
    		 console.println(new ThrowableMessage(e ));
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
