/* $Id: UnitExporterWizard.java,v 1.1 2005-07-21 15:41:44 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KmtPrinter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 juil. 2005
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 * Description : 
 * 		Pretty print of kmt files from a KermetaUnit.
 * 		It may be subclassed in order to add new pages or customize the messages.
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * Pretty print of kmt files from a KermetaUnit.
 * It may be subclassed in order to add new pages or customize the messages.
 */
public class UnitExporterWizard extends Wizard{
	
	protected IStructuredSelection selection;
    protected IWorkbench workbench;
    
    protected IFile inputFile;
    
    public WizardNewFileCreationPage outputPage;
    public String defaultOutputExtension = "xmi";
    
    // some constants
    /** pagenames */
    public static final String OUTPUTFILE_PAGENAME = "OutputFile";
    
	/**
	 * Constructor for Km2kmtWizard.
	 */
    public UnitExporterWizard()
    {
		super();
		setNeedsProgressMonitor(true);
    }
    
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		
		WizardNewFileCreationPage newfilepage = new WizardNewFileCreationPage(OUTPUTFILE_PAGENAME,selection);
		newfilepage.setTitle("Export to XMI:");
		newfilepage.setDescription("This wizard exports your file into a XMI file.\nPlease specify the output file name.");
		
		// use the input file name with a xmi extension as default
		IFile kmtfile = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(inputFile.getProjectRelativePath().removeFileExtension().addFileExtension(defaultOutputExtension));		
		newfilepage.setFileName(kmtfile.getName());
		outputPage = newfilepage;
		
		addPage(newfilepage);
	}
    
	/**
	 * output to the given file using default format: XMI
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception  {	    
		
	    builder.saveAsXMIModel(ifile.getLocation().toOSString());
        
	    ifile.refreshLocal(1, null);
    }

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {
		KermetaPlugin.getDefault().newConsole();
		KermetaPlugin.getDefault().getConsoleStream().println("Loading " + inputFile.getName()  );		
        KermetaUnit unit = createUnit();
        unit.load();
        
        if (unit.getAllErrors().size() != 0) {
        	Shell theShell = this.getContainer().getShell();
        	MessageDialog.openError(getContainer().getShell(),"Error loading file", "The source file contains errors: "+ unit.getAllMessagesAsString());
        	
        	MessageConsoleStream mcs = KermetaPlugin.getDefault().getConsole().newMessageStream();
        	mcs.setColor(new Color(null, 255,0,0));
        	mcs.println(unit.getAllMessagesAsString());
        	
        }
		else
		{
			try {
				WizardNewFileCreationPage outputPage = (WizardNewFileCreationPage)this.getPage(OUTPUTFILE_PAGENAME);
				outputPage.getFileName();
				//KermetaPlugin.getDefault().getWorkbench().
				IFile outputFile = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFolder(outputPage.getContainerFullPath()).getFile(outputPage.getFileName());
				
				Shell shell = new Shell();
			    if (outputFile.exists()) {
		            if (!MessageDialog.openQuestion(shell, "File already exists", "Do you want to overwrite exiting file: \n" + outputFile.getFullPath().toString()))
		                return true;
		        }
			    else outputFile = outputPage.createNewFile();
			    
			    KermetaPlugin.getDefault().getConsoleStream().println("Writing " + outputFile.getName()  );
				
				writeUnit(unit, outputFile );
			}
			catch (Exception e)
			{
				Shell theShell = this.getContainer().getShell();
	        	MessageDialog.openError(getContainer().getShell(),"Error writing file", "errors: "+ e.getMessage());
	        		        	
				e.printStackTrace();
				
				KermetaPlugin.getDefault().consolePrintStackTrace(e);
			}
		}
		
		return true;
	}

	/**
	 * Default Unit creation.
	 * @return KermetaUnit
	 */
	public KermetaUnit createUnit() {
		String inputFile_uri = "platform:/resource" + inputFile.getFullPath().toString();
        
        KermetaUnitFactory.getDefaultLoader().unloadAll();
        
        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(inputFile_uri);
        
		return unit;
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
			// the selection should be a single *.km file
			Iterator it = selection.iterator();

			while(it.hasNext()) {
				inputFile = (IFile)it.next();
			}
		}
	}
}
