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
		Shell shell = new Shell();

		IFile rxeFile = nxcFile.getWorkspace().getRoot().getFile(nxcFile.getFullPath().removeFileExtension().addFileExtension("rxe"));
    	
    	//String cmd = "dot -Tpdf -o "+pdfFile.getLocation().toOSString()+" " + dotFile.getLocation().toOSString();
    	
    	LogoConsole.printlnMessage("Compiling file " + nxcFile, LogoConsole.INFO);
    	
    	 try {
    		 //Runtime r = Runtime.getRuntime();
    		 //Process p = r.exec(cmd);
    		 //p.waitFor();
    		 
    		 String[] cmds = new String[3];
    		 cmds[0] = "/opt/NXT/nbc/nbc";
    		 cmds[1] = nxcFile.getLocation().toOSString();
    		 cmds[2] = "-O=" + rxeFile.getLocation().toOSString();
    		 
    		 String result = ExecHelper.exec(cmds).getOutput();
    		 LogoConsole.printlnMessage(result , LogoConsole.KERMETA);
    		 
    		 rxeFile.refreshLocal(1, null);
    		 LogoConsole.printlnMessage("File " + rxeFile + " created", LogoConsole.OK);
    		 
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
