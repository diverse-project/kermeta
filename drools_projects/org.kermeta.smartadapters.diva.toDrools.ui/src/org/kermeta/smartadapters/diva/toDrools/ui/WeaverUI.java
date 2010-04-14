package org.kermeta.smartadapters.diva.toDrools.ui;

import java.io.IOException;

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

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class WeaverUI implements IObjectActionDelegate, Runnable {

	public static final String DIVA_KERMETA_CODE = "platform:/plugin/org.kermeta.smartadapters.diva.toDrools.ui/src/kermeta/ARTcleaner/ArtCleaner.kmt";
	public static final String ENTRY_POINT = "art::MainCleaning";

	protected Shell shell;

	//protected TreeSelection currentSelection;
	protected IFile baseFile;
	protected IFile aspectFile;

	public void run() {
		if (baseFile != null && aspectFile != null){
			IOConsole console = new EclipseConsole("SmartAdapters weaver for DiVA");
			console.println(new InfoMessage("Weaving..."));

			SmartAdaptersDrools.main(new String[]{"file:/"+baseFile.getRawLocation().toOSString(),"file:/"+baseFile.getRawLocation().toOSString().replace(".art", ".woven.art"),aspectFile.getRawLocation().toOSString()});

			console.println(new InfoMessage("Done!"));



			String file_uri = "file:/" + baseFile.getRawLocation().toOSString().replace(".art", ".woven.art").replace("\\", "/");
			System.out.println(file_uri);
			try {
				console.println(new InfoMessage("Cleaning..."));
				KExecMain.run("main", file_uri, console, DIVA_KERMETA_CODE, ENTRY_POINT);
				console.println(new InfoMessage("Done!"));

				java.io.File file;
				file = new java.io.File(baseFile.getRawLocation().toOSString().replace(".art", ".woven.art"));
				file.delete();
				file = new java.io.File(baseFile.getRawLocation().toOSString().replace(".art", ".woven.clean.art"));
				file.renameTo(new java.io.File(baseFile.getRawLocation().toOSString().replace(".art", ".woven.art")));

			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}


		}
		baseFile = null;
		aspectFile = null;
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
		if(action.getId()!=null && action.getId().equals("org.kermeta.smartadapters.diva.toDrools.ui.WeaveAspect")){
			for(Object o : ((StructuredSelection)selection).toList()){
				File file = (File)o;
				if(file.getFullPath().getFileExtension().equals("art")){
					baseFile = file;
				}
				else if (file.getFullPath().getFileExtension().equals("drl")){
					aspectFile = file;
				}
			}
		}
	}
}
