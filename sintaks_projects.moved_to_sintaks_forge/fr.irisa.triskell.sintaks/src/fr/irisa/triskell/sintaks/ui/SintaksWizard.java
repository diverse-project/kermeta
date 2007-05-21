/**
 * 
 */
package fr.irisa.triskell.sintaks.ui;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.sintaks.SintaksPlugin;


/**
 * @author dtouzet
 *
 */
public abstract class SintaksWizard extends Wizard {

	protected IStructuredSelection selection;
    protected IWorkbench workbench;
    protected IFile inputFile;
    protected IFile outputFile;

    //public DestFileWizardPage outputPage;
    public SintaksDestFileWizardPage outputPage;
    
    public String defaultOutputExtension = "toBeDefined";
    
    // Constants
    /** pagenames */
    public static final String OUTPUTFILE_PAGENAME = "OutputFile";
    
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		
		outputPage.getFileName();
		
		outputFile = ResourceHelper.getIFile( outputPage.getContainerFullPath().append(outputPage.getFileName()).toOSString() );

		SintaksPlugin.getDefault().getOptionManager().setSyntacticModel(outputPage.getSMdlText());
		try {
			outputFile = outputPage.createNewFile();				
			SintaksPlugin.getDefault().createDebugStream (outputPage.getContainerFullPath());
			SintaksPlugin.getDefault().debugln("Loading " + inputFile.getName()  );
			SintaksPlugin.getDefault().debugln("Writing " + outputFile.getName()  );
			writeUnit(outputFile);
			outputFile.refreshLocal(1, null);
			outputFile.getParent().refreshLocal(1, null);
			SintaksPlugin.getDefault().closeDebugStream ();
		}
		catch (Throwable e)	{
				Shell theShell = this.getContainer().getShell();
	        	MessageDialog.openError(theShell,"Error writing file", "errors: "+ e.getMessage());
				e.printStackTrace();
				SintaksPlugin.log(e);
		}

		return true;
	}

	
	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single file
			Iterator it = selection.iterator();

			while(it.hasNext()) {
				inputFile = (IFile)it.next();
			}
		}
	}
	
	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		
		//DestFileWizardPage newfilepage = new DestFileWizardPage(OUTPUTFILE_PAGENAME, selection);
		SintaksDestFileWizardPage newfilepage = new SintaksDestFileWizardPage(OUTPUTFILE_PAGENAME, selection);
		newfilepage.setTitle("Export to XMI / Destination file selection");
		newfilepage.setDescription("This wizard exports your file into a XMI file.\nPlease specify the output file name.");
		newfilepage.setSMdlText (SintaksPlugin.getDefault().getOptionManager().getSyntacticModel());
		
		// Use the input file name with the xmi extension as default
		IFile kmtfile = ResourceHelper.getIFile( inputFile.getFullPath().removeFileExtension().addFileExtension(defaultOutputExtension).toOSString() );		
		newfilepage.setFileName(kmtfile.getName());
		outputPage = newfilepage;
		
		addPage(newfilepage);
	}
	
	

	/**
	 * @param ifile
	 * @throws Exception
	 */
	public abstract void writeUnit(IFile ifile) throws Exception;

}
