/* $Id: EcoreMerge2EcoreWizard.java,v 1.7 2007-12-03 10:56:37 cfaucher Exp $
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kermeta.dev.model.PackageMerge;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * Merge of ecore files
 */
public class EcoreMerge2EcoreWizard extends Wizard {

	protected IStructuredSelection selection;

	protected IWorkbench workbench;

	// protected IFile inputFile;
	protected IFile outputFile;

	protected IFile inputFile;

	protected ResourceSet trace_resource_set;

	protected Resource trace_resource = null;

	protected IFile traceFile;

	protected Tracer tracer;

	public DestFileWizardPage outputPage;

	public ActivableDestFileWizardPage tracePage;

	public String defaultOutputExtension = "ecore";

	public String defaultTraceExtension = "traceability";

	protected List<IFile> ecorefiles = new ArrayList<IFile>();

	// some constants
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";

	public static final String TRACEFILE_PAGENAME = "TraceFile";

	/**
	 * Constructor for Km2kmtWizard.
	 */
	public EcoreMerge2EcoreWizard() {
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
				.setTitle("Merge to a single ECORE ressource / Destination file selection");
		newfilepage
				.setDescription("This wizard merges your selected files into an ECORE file.\nPlease specify the output file name.");

		// use the input file name with an ecore extension as default
		IFile kmtfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(
						inputFile.getFullPath().removeFileExtension()
								.addFileExtension(defaultOutputExtension));
		newfilepage.setFileName(kmtfile.getName());
		outputPage = newfilepage;

		addPage(newfilepage);

		tracePage = new ActivableDestFileWizardPage(TRACEFILE_PAGENAME,
				selection, "Save trace file ");
		tracePage.setTitle("Trace file selection");
		tracePage
				.setDescription("Trace file contain traceability informations generated by this transformation.");

		// use the input file name with a xmi extension as default
		IFile tracefile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(
						inputFile.getFullPath().removeFileExtension()
								.addFileExtension(defaultTraceExtension));
		tracePage.setFileName(tracefile.getName());

		addPage(tracePage);
	}

	/**
	 * output to the given file using default format: XMI
	 * 
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(IFile ifile) throws Exception {
		EPackage result = null;

		ResourceSet resource_set = new ResourceSetImpl();
		URI u = null;
		for (IFile file : ecorefiles) {
			// IFile file = ecorefiles.get(0);
			// create a ResourceSet
			resource_set = new ResourceSetImpl();
			u = URI.createURI(file.getFullPath().toString());
			u = new URIConverterImpl().normalize(u);

			Resource resource = resource_set.getResource(u, true);
			for ( EObject o : resource.getContents() ) {
				
				if ( o instanceof EPackage )
					result = PackageMerge.addModel( result, (EPackage) o );
			}
			
		}
		u = URI.createURI(ifile.getFullPath().toString());
		u = new URIConverterImpl().normalize(u);

		Resource res = resource_set.createResource(u);
		res.getContents().add(result);
		try {
			res.save(null);
		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		ifile.refreshLocal(1, null);
	}

	public void writeTrace() throws Exception {

		// Save trace
		try {
			trace_resource.save(null);
		} catch (IOException e) {
			KermetaUnit.internalLog
					.error("cannot save trace ressource, due to: "
							+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource ("
					+ traceFile.getName() + "), due to: " + e.getMessage(), e);
		}
		traceFile.refreshLocal(1, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {
		
		KermetaPlugin.getDefault().getConsole().println("Loading " + inputFile.getName());
		
		// DestFileWizardPage outputPage =
		// (DestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.getFileName();

		outputFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
				outputPage.getContainerFullPath().append(
						outputPage.getFileName()));
		traceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
				outputPage.getContainerFullPath().append(
						tracePage.getFileName()));
		// unit = createUnit();
		// unit.load();
		try {

			outputFile = outputPage.createNewFile();

			KermetaPlugin.getDefault().getConsole().println("Writing " + outputFile.getName());

			writeUnit(outputFile);
			if (tracePage.enableFileDestinationButton.getSelection()) {
				traceFile = tracePage.createNewFile();
				writeTrace();
			}
		} catch (Throwable e) {
			Shell theShell = this.getContainer().getShell();
			MessageDialog.openError(theShell, "Error writing file", "errors: "
					+ e.getMessage());

			e.printStackTrace();

			KermetaPlugin.getDefault().getConsole().print( new ThrowableMessage(e) );
		}

		return true;
	}

	protected void initTraces() {
		// create Trace structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"traceability", new XMIResourceFactoryImpl());
		trace_resource_set = new ResourceSetImpl();
		URI u = URI.createURI(traceFile.getFullPath().toString());
		u = new URIConverterImpl().normalize(u);
		// traceFile =
		// ResourcesPlugin.getWorkspace().getRoot().getFile(traceFile.getFullPath().removeFileExtension().addFileExtension("traceability"));
		trace_resource = trace_resource_set.createResource(u);
		tracer = new Tracer(trace_resource);
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
		if (selection instanceof StructuredSelection) {
			// the selection should be  multiples *.ecore files
			Iterator it = selection.iterator();

			while (it.hasNext()) {

				inputFile = (IFile) it.next();
				ecorefiles.add(inputFile);
			}
		}
	}

}
