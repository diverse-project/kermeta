/* $Id: Java5ExporterWizard.java,v 1.1 2007/02/15 11:26:40 barais Exp $
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
package spoonemf.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

/**
 * Pretty print of kmt files from a KermetaUnit. It may be subclassed in order
 * to add new pages or customize the messages.
 */
public class Java5ExporterWizard extends Wizard {

	protected IStructuredSelection selection;

	protected IWorkbench workbench;

	protected String destFolder = "outputFiles";

	protected String inputFile;

	protected ResourceSet trace_resource_set;

	protected Resource trace_resource = null;

	public DestFolderWizardPage outputPage;

	public String defaultOutputExtension = "";

	// some constants
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";

	/**
	 * Constructor for Km2kmtWizard.
	 */
	public Java5ExporterWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {

		DestFolderWizardPage newfilepage = new DestFolderWizardPage(
				OUTPUTFILE_PAGENAME, selection);
		newfilepage.setTitle("Export to Java Source File / Destination folder selection");
		newfilepage
				.setDescription("This wizard exports your Java5(XMI) file into Java source files.\nPlease specify the output folder name.");

		newfilepage.setFileName(destFolder);

		outputPage = newfilepage;

		addPage(newfilepage);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {
		Shell shell = new Shell();
		String outputfile = ResourcesPlugin.getWorkspace().getRoot()
				.getLocation().toString()
				+ outputPage.getContainerFullPath()
				+ "/"
				+ outputPage.getFileName();
		IFolder fold = outputPage.createNewFile();
		/*System.err.println("input file " + inputFile + "\n"
				+ "output folder " + outputfile);*/
		Java2XMIHelper.eInstance.processXMIFiles(outputfile, inputFile);
		if (fold != null){
			try {
				fold.refreshLocal(IFolder.DEPTH_INFINITE,null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;

		// the selection should be a single *.km file
		Iterator it = selection.iterator();
		IFile file = null;
		while (it.hasNext()) {
			try {
				file = (IFile) it.next();

			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}

		this.inputFile = ResourcesPlugin.getWorkspace().getRoot().getLocation()
				.toString()
				+ file.getFullPath().toString();

	}
}
