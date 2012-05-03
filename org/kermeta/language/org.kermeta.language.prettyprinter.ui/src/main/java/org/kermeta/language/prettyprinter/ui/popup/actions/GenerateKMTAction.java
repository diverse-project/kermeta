package org.kermeta.language.prettyprinter.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.prettyprinter.ui.Activator;

public class GenerateKMTAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
	private Shell shell;
	protected IFile selectedfile;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateKMTAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		/*MessageDialog.openInformation(
			shell,
			"Kermeta 2 prettyprinter UI",
			"generate kmt was executed.");
			*/
		// assign this plugin messaging system console to kermeta stdio
				// note: this works correctly only because we make sure to call the correct classes that are duplicated in fr.inria.varymde.fuml.behavior (verify the manifest !)
				k2.io.StdIO$.MODULE$.messagingSystem_$eq(Activator.getDefault().getMessaggingSystem());
		        //Activator.getDefault().getMessaggingSystem().debug("console test", Activator.PLUGIN_ID);
		        //k2.io.StdIO$.MODULE$.writeln("test message using kermeta stdio redirection");
				
				//InputDialog input = new InputDialog(shell, "FUML runner", "Activity to run", null, null);
				//if(input.open()==org.eclipse.jface.window.Window.OK) {
					Activator.getDefault().getMessaggingSystem().debug("Prettyprinting "+ selectedfile.getLocationURI().toString(), Activator.PLUGIN_ID);
					org.kermeta.language.prettyprinter.KM2KMTPrettyPrinter printer = new org.kermeta.language.prettyprinter.KM2KMTPrettyPrinterImpl4Eclipse();
					printer.prettyPrintFile(selectedfile.getLocationURI().toString(), selectedfile.getLocationURI().toString()+".kmt");
					Activator.getDefault().getMessaggingSystem().debug("Done", Activator.PLUGIN_ID);
				//}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				selectedfile = (IFile)it.next();
			}

		}
	}

}
