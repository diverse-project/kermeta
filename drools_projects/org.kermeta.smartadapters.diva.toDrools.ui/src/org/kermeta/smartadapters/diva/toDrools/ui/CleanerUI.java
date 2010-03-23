package org.kermeta.smartadapters.diva.toDrools.ui;

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
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;

public class CleanerUI implements IObjectActionDelegate, Runnable {

	public static final String DIVA_KERMETA_CODE = "platform:/plugin/org.kermeta.smartadapters.diva.toDrools.ui/src/kermeta/ARTcleaner/ArtCleaner.kmt";
	public static final String ENTRY_POINT = "art::MainCleaning";
	
	protected StructuredSelection currentSelection;
    protected IFile file;
	
	@Override
	public void run() {
		IOConsole console = new EclipseConsole("SmartAdapters Cleaner for DiVA");
		console.println(new InfoMessage("Cleaning DiVA architectural model: " + file.getLocation().toOSString() + "..."));
		
		try {			
				
			String file_uri = "file:/" + file.getLocation().toOSString().replace("\\", "/");
		    System.out.println(file_uri);
			KExecMain.run("main", file_uri, console, DIVA_KERMETA_CODE, ENTRY_POINT);
			
			console.println(new OKMessage("Execution terminated successfully."));
			
			
		} catch (Throwable e) {
			console.println(new ErrorMessage("Runtime error : "));
			console.println(new ThrowableMessage(e));
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
			currentSelection = (StructuredSelection)selection;
			Iterator<StructuredSelection> it = currentSelection.iterator();

			while(it.hasNext()) {
				file = (IFile)it.next();
			}
		}
	}
}
