/* $Id: JavaFolderExporterWizard.java,v 1.2 2007/02/15 11:30:09 barais Exp $
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

/**
 * Pretty print of kmt files from a KermetaUnit. It may be subclassed in order
 * to add new pages or customize the messages.
 */
public class JavaFolderExporterWizard extends Wizard {

	protected IStructuredSelection selection;

	protected IWorkbench workbench;

	protected List<String> foldertoparse = new ArrayList<String>();

	protected String outputFile;

	protected ResourceSet trace_resource_set;

	protected Resource trace_resource = null;

	public DestFileWizardPage outputPage;

	public String defaultOutputExtension = "java5";

	// some constants
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";

	/**
	 * Constructor for Km2kmtWizard.
	 */
	public JavaFolderExporterWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {

		DestFileWizardPage newfilepage = new DestFileWizardPage(
				OUTPUTFILE_PAGENAME, selection);
		newfilepage
				.setTitle("Export to Java5(XMI) / Destination file selection");
		newfilepage
				.setDescription("This wizard exports your package into a Java5(XMI) file.\nPlease specify the output file name.");

		newfilepage.setFileName(outputFile);

		outputPage = newfilepage;

		addPage(newfilepage);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {

		String outputfile = ResourcesPlugin.getWorkspace().getRoot()
				.getLocation().toString()
				+ outputPage.getContainerFullPath()
				+ "/"
				+ outputPage.getFileName();
		System.err.println("folder to parse " + foldertoparse + "\n"
				+ "outputfile " + outputfile);
		Java2XMIHelper.eInstance.processJavaFolder(this.foldertoparse,
				outputfile);
		// outputPage.createNewFile();
		System.err.println(outputPage.getContainerFullPath());
		IContainer f = null;

		if (!outputPage.getContainerFullPath().removeFirstSegments(1)
				.toString().equals("")) {
			f = ResourcesPlugin.getWorkspace().getRoot().getFolder(
					outputPage.getContainerFullPath());

		} else {

			f = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(
							outputPage.getContainerFullPath().makeRelative()
									.toString());

		}

		try {
			if (f != null)
				f.refreshLocal(IFolder.DEPTH_INFINITE, null);
			else
				System.err.println("f est encore null");
		} catch (CoreException e) {
			System.err.println("CoreExceptionl");
			// e.printStackTrace();
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
		IJavaElement pack = null;
		while (it.hasNext()) {
			try {
				pack = (IJavaElement) it.next();
				try {
					this.foldertoparse.add(ResourcesPlugin.getWorkspace()
							.getRoot().getLocation().toString()
							+ pack.getCorrespondingResource().getFullPath()
									.toString());
					this.outputFile = pack.getResource().getName() + ".java5";
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}

	}
}
