/* $Id: UnitExporterWizard.java,v 1.38 2009-01-12 09:37:44 moha Exp $
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kermetaunitloader.LoaderFactory;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.eclipse.console.messages.WarningMessage;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KM;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
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

	public ActivableDestFileWizardPage tracePage;

	public Kermeta2EcoreResolveWizardPage resolvePage;

	public String defaultOutputExtension = "xmi";

	public String defaultTraceExtension = "traceability";

	protected HashMap<String, Object> options = new HashMap<String, Object>();
	
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
		kmtfile = ResourceHelper.getIFile(inputFile.getFullPath()
				.removeFileExtension().addFileExtension(defaultOutputExtension)
				.toString());
		
		if (kmtfile == null) {
			kmtfile = ResourcesPlugin.getWorkspace().getRoot()
					.getFile(
							inputFile.getFullPath().removeFileExtension()
									.addFileExtension(defaultOutputExtension));
		}
		
		newfilepage.setFileName(kmtfile.getName());
		outputPage = newfilepage;

		addPage(newfilepage);

		// add the page for the ecore generation philosophy -- only for
		// Kermeta2Ecore wizard in fact!
		if (this instanceof Kermeta2EcoreWizard) {
			resolvePage = new Kermeta2EcoreResolveWizardPage(
					OUTPUTFILE_PAGENAME, selection);
			addPage(resolvePage);			
		}

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
	public void writeUnit(final KermetaUnit builder, final IFile ifile) throws Exception {

		if ( outputPage.deployCheck.getSelection() ) {
			Set<KermetaUnit> l = new HashSet<KermetaUnit>();
			l.add(builder);
			l.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(builder) );

			String fileURI = "platform:/resource" + ifile.getFullPath().toString();
	    	int index = fileURI.lastIndexOf(".");
	    	fileURI = fileURI.substring(0, index) + ".km";
			
			Merger merger = new Merger();
			merger.process(l, fileURI, true, true);
		} else {
		
			final String fileURI = "platform:/resource" + ifile.getFullPath().toString();
	    	int index = fileURI.lastIndexOf("/");
	    	final String targetDir = fileURI.substring(0, index);
			final KmExporter exporter = new KmExporter();
	
	
			IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					exporter.export(builder, targetDir, fileURI, false);				
					ifile.refreshLocal(1, null);
				}
			};
			
			ResourcesPlugin.getWorkspace().run(runnable, null);		
		}
	}

	public void writeTrace() throws Exception {
		if (!isInputKM && !isOutputKM) {
			// trace will be correctly saved only if the km is saved too
			// traces must be optimized before being saved. This is because emf
			// cannot save references to
			// non serialized object. here, kermeta FObject are not serialized
			// when parsed form kmt files
			// tracer.optimizeTraces();

			IFile traceKmFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
							traceFile.getFullPath().addFileExtension("km"));
			
			//KmExporter exporter = new KmExporter();
			//exporter.export(unit.getTracer(), "./");
			
	//		unit.saveAsXMIModel(traceKmFile.getLocation().toOSString());

			traceKmFile.refreshLocal(1, null);
		}
		// Save trace
		try {
			URI uri = URI.createURI( "platform:/resource" + traceFile.getFullPath().toString() );
			ResourceSet resourceSet = unit.getModelingUnit().eResource().getResourceSet();
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add( unit.getTracer().getTraceModel() );
			resource.save(null);
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
		unit = createUnit();
		
		KermetaTypeChecker typechecker = new KermetaTypeChecker(unit);
		typechecker.checkUnit();

		if ( ! unit.isErroneous() ) {
			KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(unit);
			constraintchecker.checkUnit();
		}
		
		List<KermetaUnit> kuList = KermetaUnitHelper.getAllImportedKermetaUnits(unit);
		if(kuList.size() != 0){
			KermetaPlugin.getDefault().getConsole().println("Files or resources indirectly loaded :");
			for( KermetaUnit ku :  kuList){
				KermetaPlugin.getDefault().getConsole().println("    " + ku.getUri());				
			}
		}
		
		// display eventual warnings
		if ( KermetaUnitHelper.hasWarning(unit) ) {
			WarningMessage message = new WarningMessage( KermetaUnitHelper.getWarningsAsString(unit) );
			KermetaPlugin.getDefault().getConsole().println(message);
		}
		
		if ( unit.isIndirectlyErroneous() ) {
			Shell theShell = this.getContainer().getShell();
			MessageDialog.openError(theShell, "Error loading file",
					"The source file contains errors. Please have look to the Console view for the details");
			
			ErrorMessage errmessage = new ErrorMessage( KermetaUnitHelper.getAllErrorsAsString(unit) );
			KermetaPlugin.getDefault().getConsole().println(errmessage);

		} 
		
		if(! unit.isIndirectlyErroneous() || outputPage.forceWriteEvenIfErrorCheck.getSelection()){
			try {

				KermetaPlugin.getDefault().getConsole().println("Writing " + outputFile.getName());

				writeUnit(unit, outputFile);
				if (tracePage.enableFileDestinationButton.getSelection()) {
					traceFile = tracePage.createNewFile();
					writeTrace();
				}
			} catch (Throwable e) {
				Shell theShell2 = this.getContainer().getShell();
				MessageDialog.openError(theShell2, "Error writing file",
						"errors: " + e.getMessage());

				e.printStackTrace();

				KermetaPlugin.getDefault().getConsole().print( new ThrowableMessage(e) );
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

		// by default exporter enable the quick fix
		Ecore2KM.isQuickFixEnabled = true;
        Ecore2KM.isMethodPropertyNameOverlapSafe = true;
        Ecore2KM.isMethodNameOverlapSafe = true;
        Ecore2KM.methodRenamePrefix = "op_";
        Ecore2KM.methodRenamePostfix = "";
        
        options.put(LoadingOptions.ECORE_QuickFixEnabled, true);
        
        
		String inputFile_uri = "platform:/resource" + inputFile.getFullPath().toString();
			
			//"platform:/resource"
			//	+ inputFile.getFullPath().toString();

		//KermetaUnitFactory.getDefaultLoader().unloadAll();

		try {
			unit = IOPlugin.getDefault().getEditionKermetaUnitStore().get( inputFile_uri, options );
			// init the tracer (needed in order to get error messages and for an eventual save of the trace file)
			//initTraces();
			//unit.setTracer(tracer);
			//LoaderPlugin.getDefault().load( inputFile_uri, options );
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return unit;
	}

	protected void initTraces() {
		// create Trace structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"traceability", new XMIResourceFactoryImpl());
		trace_resource_set = new ResourceSetImpl();
		URI u = URI.createURI(traceFile.getFullPath().toString());
		u = new ExtensibleURIConverterImpl().normalize(u);
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
			@SuppressWarnings("unchecked")
			Iterator it = selection.iterator();
			while (it.hasNext()) {
				inputFile = (IFile) it.next();
			}
		}
	}
}
