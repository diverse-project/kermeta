package fr.irisa.triskell.kmlogo.ui.popup.actions;

import fr.irisa.triskell.kmlogo.ui.LogoConsole;
import fr.irisa.triskell.kmlogo.ui.RunLogoK;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RunLogo implements IObjectActionDelegate, Runnable {

	protected StructuredSelection currentSelection;
    protected IFile logoFile;
	
	/**
	 * Constructor for Action1.
	 */
	public RunLogo() {
		super();
	}
	
	public void run() {
		
		LogoConsole.printlnMessage("Launching logo interpreter on file : " + logoFile.getLocation().toOSString() + "...", LogoConsole.INFO);
		
		try {			
				
			String file_uri = "file:/" + logoFile.getLocation().toOSString();

			try {
				RunLogoK.run(file_uri, new LogoConsole());
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			LogoConsole.printlnMessage("Execution terminated successfully.", LogoConsole.OK);
			
		} catch (Exception e) {
			LogoConsole.printlnMessage("Logo runtime error : " +  e.getMessage(), LogoConsole.ERROR);
			e.printStackTrace();
		}
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
		new Thread(this).start();
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
				logoFile = (IFile)it.next();
			}

		}
		
	}

}
