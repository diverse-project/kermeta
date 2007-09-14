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

import fr.irisa.triskell.kmlogo.ui.ExecHelper;
import fr.irisa.triskell.kmlogo.ui.LogoConsole;


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

		
    	LogoConsole.printlnMessage("Uploading File " +  nxcFile.getLocation().toString(), LogoConsole.INFO);
    	
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
    		 LogoConsole.printlnMessage(result , LogoConsole.KERMETA);
    		 
    		 LogoConsole.printlnMessage("File Uploaded", LogoConsole.OK);
    		 
    	 } catch(Exception e) {
    		 LogoConsole.printlnMessage("ERROR : " + e, LogoConsole.ERROR);
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
