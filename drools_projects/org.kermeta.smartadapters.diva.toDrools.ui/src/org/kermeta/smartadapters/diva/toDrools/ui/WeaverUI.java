package org.kermeta.smartadapters.diva.toDrools.ui;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.smartadapters.drools.standalone.SmartAdaptersDrools;

public class WeaverUI implements IObjectActionDelegate, Runnable {

	protected Shell shell;

	//protected TreeSelection currentSelection;
	protected IFile baseFile;
	protected IFile aspectFile;

	public void run() {		
		SmartAdaptersDrools.main(new String[]{"file:/"+baseFile.getRawLocation().toOSString(),"file:/"+baseFile.getRawLocation().toOSString().replace(".art", ".woven.art"),aspectFile.getRawLocation().toOSString()});
		//MessageDialog.openInformation(shell, "Info", "Weaving...");
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
		new Thread(this).start();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		for(Object o : ((StructuredSelection)selection).toList()){
			File file = (File)o;
			if(file.getFullPath().getFileExtension().equals("art")){
				baseFile = file;
			}
			else if (file.getFullPath().getFileExtension().equals("drl")){
				aspectFile = file;
			}
			
			if (baseFile != null && aspectFile != null){
				run();
			}
		}
	}
}
