package spoonemf.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;



public class Java2XMI implements IObjectActionDelegate {

	
	protected StructuredSelection currentSelection;
	/**
	 * Constructor for Action1.
	 */
	public Java2XMI() {
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
		   
    	JavaFolderExporterWizard wizard =  new JavaFolderExporterWizard();
    	wizard.defaultOutputExtension = "java5";
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("Create XMI files from Java folder(s)");
    	wizDialog.open();
		
		
		
		
		
		
		
		
	/*	
		
		try {
			MessageDialog.openInformation(
				shell,
				"SpoonEMF",
				"Create XMI files from Java Folder was executed."
			+ "\n" + ResourcesPlugin.getWorkspace().getRoot().getLocation()	
					+ pack.getCorrespondingResource().getFullPath()	);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			//Iterator it = currentSelection.iterator();

			/*while(it.hasNext()) {
				try{
				pack = (PackageFragment) it.next();
				}
				catch (ClassCastException e){
					e.printStackTrace();
				}
			}
*/
		}
		
	}

}
