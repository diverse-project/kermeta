/* $Id: UnitExporterWizard.java,v 1.2 2007-07-23 09:16:19 ftanguy Exp $
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
package fr.irisa.triskell.kermeta.migrationv032_v040.tools.wizards;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.migrationv032_v040.Activator;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * Pretty print of kmt files from a KermetaUnit. It may be subclassed in order
 * to add new pages or customize the messages.
 */
public class UnitExporterWizard extends Wizard {

	protected IStructuredSelection selection;

	protected IWorkbench workbench;

	protected IFile inputFile;

	protected IFile outputFile;

	protected KermetaUnit unit;

	protected ResourceSet trace_resource_set;

	protected Resource trace_resource = null;

	protected IFile traceFile;

	protected Tracer tracer;

	public DestFileWizardPage outputPage;

	//public ActivableDestFileWizardPage tracePage;

	//public Kermeta2EcoreResolveWizardPage resolvePage;

	public String defaultOutputExtension = "xmi";

	public String defaultTraceExtension = "traceability";

	/**
	 * <code>isInputKM</code> indicates weither the input unit is a km unit.
	 * Ie. it tells if the input references are directly loaded or
	 * parsed/transformed from another format.
	 */
	public boolean isInputKM = false;

	public boolean isOutputKM = true;

	// some constants
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";

	public static final String TRACEFILE_PAGENAME = "TraceFile";

	/**
	 * Constructor for Km2kmtWizard.
	 */
	public UnitExporterWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {

		DestFileWizardPage newfilepage = new DestFileWizardPage(
				OUTPUTFILE_PAGENAME, selection);
		newfilepage.setTitle("Export to XMI / Destination file selection");
		newfilepage
				.setDescription("This wizard exports your file into a XMI file.\nPlease specify the output file name.");
		
		// use the input file name with a xmi extension as default
		IFile kmtfile;
		kmtfile = Activator.getIFileFromString(inputFile.getFullPath()
				.removeFileExtension().addFileExtension(defaultOutputExtension)
				.toString());
		
		if (kmtfile == null) {
			kmtfile = IDEWorkbenchPlugin.getPluginWorkspace().getRoot()
					.getFile(
							inputFile.getFullPath().removeFileExtension()
									.addFileExtension(defaultOutputExtension));
		}
		
		newfilepage.setFileName(kmtfile.getName());
		outputPage = newfilepage;

		addPage(newfilepage);

			}

	/**
	 * output to the given file using default format: XMI
	 * 
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception {
	}

	public void writeTrace() throws Exception {
		if (!isInputKM && !isOutputKM) {
			// trace will be correctly saved only if the km is saved too
			// traces must be optimized before being saved. This is because emf
			// cannot save references to
			// non serialized object. here, kermeta FObject are not serialized
			// when parsed form kmt files
			// tracer.optimizeTraces();

/*			IFile traceKmFile = IDEWorkbenchPlugin.getPluginWorkspace()
					.getRoot().getFile(
							traceFile.getFullPath().addFileExtension("km"));
			unit.saveAsXMIModel(traceKmFile.getLocation().toOSString());

			traceKmFile.refreshLocal(1, null);*/
		}
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
		Activator.getDefault().newConsole();
		Activator.getDefault().getConsoleStream().println(
				"Loading " + inputFile.getName());

		// DestFileWizardPage outputPage =
		// (DestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.getFileName();

		outputFile = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(
				outputPage.getContainerFullPath().append(
						outputPage.getFileName()));
		unit = createUnit();

		if ( unit.isErrored() ) {
			Shell theShell = this.getContainer().getShell();
			MessageDialog.openError(theShell, "Error loading file",
					"The source file contains errors: "
							+ KermetaUnitHelper.getAllErrorsAsString(unit) );

			MessageConsoleStream mcs = Activator.getDefault().getConsole()
					.newMessageStream();
			mcs.setColor(new Color(null, 255, 0, 0));
			mcs.println( KermetaUnitHelper.getAllErrorsAsString(unit) );

		} else {
			try {

				outputFile = outputPage.createNewFile();

				// display eventual warnings
				if ( unit.isWarned() ) {
					MessageConsoleStream mcs = Activator.getDefault()
							.getConsole().newMessageStream();
					mcs.setColor(new Color(null, 255, 170, 0));
					mcs.println( KermetaUnitHelper.getAllWarningsAsString(unit) );
				}

				Activator.getDefault().getConsoleStream().println(
						"Writing " + outputFile.getName());

				writeUnit(unit, outputFile);
				
			} catch (Throwable e) {
				Shell theShell = this.getContainer().getShell();
				MessageDialog.openError(theShell, "Error writing file",
						"errors: " + e.getMessage());

				e.printStackTrace();

				Activator.getDefault().consolePrintStackTrace(e);
			}
		}

		return true;
	}

	/**
	 * Default Unit creation.
	 * 
	 * @return KermetaUnit
	 */
	public KermetaUnit createUnit() {
		return null;
	}

	protected void initTraces() {
		// create Trace structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"traceability", new XMIResourceFactoryImpl());
		trace_resource_set = new ResourceSetImpl();
		URI u = URI.createURI(traceFile.getFullPath().toString());
		u = new URIConverterImpl().normalize(u);
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
			// the selection should be a single *.km file
			Iterator it = selection.iterator();
			while (it.hasNext()) {
				inputFile = (IFile) it.next();
			}
		}
	}
}
