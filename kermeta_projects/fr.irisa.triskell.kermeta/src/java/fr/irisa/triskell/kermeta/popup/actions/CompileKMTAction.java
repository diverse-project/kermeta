package fr.irisa.triskell.kermeta.popup.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

public class CompileKMTAction implements IObjectActionDelegate {

    protected IFile kmtfile;
    
	/**
	 * Constructor for Action1.
	 */
	public CompileKMTAction() {
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
	    try {
	        
	        MessageDialog.openInformation(
					shell,
					"Warning",
					"This feature has not been tested, it cannot be considered as stable.\n"
					+ "The XMI file produced might not be usable.");
	        
	        IFile kmfile = kmtfile.getProject().getFile(kmtfile.getProjectRelativePath().removeFileExtension().addFileExtension("km"));
	        
	        String kmt_uri = "platform:/resource" + kmtfile.getFullPath().toString();
	        
	        KermetaUnitFactory.getDefaultLoader().unloadAll();
	        
	        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(kmt_uri);
	        
	        unit.load();
	        
	        if (unit.getAllErrors().size() != 0) {
	            throw new Error("The source file contains errors : " + unit.getAllMessagesAsString());
	        }
	        
	        unit.typeCheckAllUnits();
	        
	        if (unit.getAllErrors().size() != 0) {
	            throw new Error("The source file contains type errors : " + unit.getAllMessagesAsString());
	        }
	        
	        saveAsXMI(unit, kmfile);
	        
	       
	        
	    }
	    catch (Throwable t) {
	        
			MessageDialog.openInformation(
				shell,
				"Compile Kermeta error",
				"error : " + t);
			t.printStackTrace();
	    }
	}
	
	
	/**
     * @param unit
     * @param kmfile
     */
    private void saveAsXMI(KermetaUnit unit, IFile kmfile) throws Exception {
        Shell shell = new Shell();
	    if (kmfile.exists()) {
            if (!MessageDialog.openQuestion(shell, "File already exists", "Do you want to overwrite exiting km file :\n" + kmfile.getFullPath().toString()))
                return;
        }
        unit.saveAsXMIModel(kmfile.getLocation().toOSString());
        
        kmfile.refreshLocal(1, null);
    }



    /**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		StructuredSelection currentSelection;
		if (selection instanceof StructuredSelection)
		{
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				kmtfile = (IFile)it.next();
			}

		}
	}


}
