package fr.irisa.triskell.kermeta.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.tools.wizards.UnitExporterWizard;

public class CompileKMTAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
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
	   /* MessageDialog.openWarning(
				shell,
				"Warning",
				"This feature has not been tested, it cannot be considered as stable.\n"
				+ "The file produced may contain errors.");
	    */    
    	UnitExporterWizard wizard =  new UnitExporterWizard();
    	wizard.defaultOutputExtension = "km";
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("Compile the kmt file into a typechecked xmi file");
    	wizDialog.open();
    	
	/*    Shell shell = new Shell();
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
	        	MessageDialog.openError(shell,"The source file contains errors: ", "The source file contains errors: "+ unit.getAllMessagesAsString());
	        	
	        	KermetaPlugin .getDefault().newConsole().println("The source file contains errors : " + unit.getAllMessagesAsString());
	            //throw new Error("The source file contains errors : " + unit.getAllMessagesAsString());
	        }
	        else
	        {
		        unit.typeCheckAllUnits();
		        
		        if (unit.getAllErrors().size() != 0) {
		        	MessageDialog.openError(shell,"The source file contains type errors: ", "The source file contains type errors: "+ unit.getAllMessagesAsString());
		        	
		        	KermetaPlugin .getDefault().newConsole().println("The source file contains type errors : \n" + unit.getAllMessagesAsString());
		            
		            //throw new Error("The source file contains type errors : " + unit.getAllMessagesAsString());
		        }
		        else
		        {
		        	saveAsXMI(unit, kmfile);
		        }
	        }
	       
	        
	    }
	    catch (Throwable t) {
	        
			MessageDialog.openInformation(
				shell,
				"Compile Kermeta error",
				"error : " + t);
			t.printStackTrace();
			KermetaPlugin.getDefault().newConsole().println("Compile Kermeta error (kmt2xmi): \n" + t.getMessage());
			ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();		
			PrintWriter pw = new PrintWriter(oStream);			
			t.printStackTrace(pw);
			pw.flush();
			KermetaPlugin.getDefault().getConsoleStream().println(oStream.toString());
            
	    }*/
	}
	
	
	/**
     * @param unit
     * @param kmfile
     */
  /*  private void saveAsXMI(KermetaUnit unit, IFile kmfile) throws Exception {
        Shell shell = new Shell();
	    if (kmfile.exists()) {
            if (!MessageDialog.openQuestion(shell, "File already exists", "Do you want to overwrite exiting km file :\n" + kmfile.getFullPath().toString()))
                return;
        }
        unit.saveAsXMIModel(kmfile.getLocation().toOSString());
        
        kmfile.refreshLocal(1, null);
    }*/



    /**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator<?> it = currentSelection.iterator();

			while(it.hasNext()) {
				kmtfile = (IFile)it.next();
			}

		}
	}


}
