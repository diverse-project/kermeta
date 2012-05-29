package org.kermeta.language.gendoc.km2html.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.gendoc.km2html.ui.Activator;

public class GenerateHtmlAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
	private Shell shell;
	protected IFile selectedfile;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateHtmlAction() {
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
		k2.io.StdIO$.MODULE$.messagingSystem_$eq(Activator.getDefault().getMessaggingSystem());
        //Activator.getDefault().getMessaggingSystem().debug("console test", Activator.PLUGIN_ID);
        //k2.io.StdIO$.MODULE$.writeln("test message using kermeta stdio redirection");
		
		
		Activator.getDefault().getMessaggingSystem().debug("Generating documentation for "+ selectedfile.getLocationURI().toString(), Activator.PLUGIN_ID);
		org.kermeta.language.gendoc.km2html.Km2Html generator = new org.kermeta.language.gendoc.km2html.Km2HtmlImpl4Eclipse();
		
		generator.genHtmlDoc4File(selectedfile.getLocationURI().toString(), selectedfile.getParent().getLocationURI().toString()+"/html", "");
		Activator.getDefault().getMessaggingSystem().debug("Done", Activator.PLUGIN_ID);
		try {
			selectedfile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
		}
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
