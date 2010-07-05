package org.kermeta.smartadapters.diva.toDrools.ui;

import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

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
	protected SortedSet<String> aspectFiles;
	
	public WeaverUI(){
		aspectFiles = new TreeSet<String>(new AspectComparator());
	}

	public void run() {
		if (baseFile != null && aspectFile != null && aspectFiles.size()>0){
			IOConsole console = new EclipseConsole("SmartAdapters weaver for DiVA");
			console.println(new InfoMessage("Weaving "+aspectFiles.size()+" aspects..."));
			
			String[] params = new String[/*aspectFiles.size()+2*/3];
			params[0] = "file:/"+baseFile.getRawLocation().toOSString();
			params[1] = "file:/"+baseFile.getRawLocation().toOSString().replace(".art", ".woven.art"); 
			//params[2] = aspectFile.getRawLocation().toOSString();
			
			long start = System.currentTimeMillis();
			int i = 2;
			for(String aspect : aspectFiles){
				/*console.println(new InfoMessage(aspect));
				params[i] = aspect;
				++i;*/
				
				params[2] = aspect;
				
				//String cmd = "java -jar "+"./lib/smartadapters.jar" + " " + params[0] + " " + params[1];

				
				SmartAdaptersDrools.main(params);
				params[0] = params[1];
				//params[1] = params[1].replace(".art", ".woven.art"); 
			}
			
			

			console.println(new InfoMessage("Done in "+(System.currentTimeMillis()-start)+" ms"));



			String file_uri = "file:/" + baseFile.getRawLocation().toOSString().replace(".art", ".woven.art").replace("\\", "/");
			System.out.println(file_uri);
			try {
				console.println(new InfoMessage("Cleaning..."));
				start = System.currentTimeMillis();
				KExecMain.run("main", file_uri, console, DIVA_KERMETA_CODE, ENTRY_POINT);
				console.println(new InfoMessage("Done in "+(System.currentTimeMillis()-start)+" ms"));

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
		aspectFiles.clear();
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
					aspectFiles.add(file.getRawLocation().toOSString());
				}
			}
		}
	}
}
