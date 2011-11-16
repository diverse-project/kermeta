package kompose_ui_v1.popup.actions;

import java.util.Iterator;

import kompose.Context;
import kompose_core_parser_v1.KomposeParser;
import kompose_ui_v1.console.KomposeConsole;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.console.ConsolePlugin;


public class ParseKomposeWizard extends Wizard {

	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	
	protected IFile inputFile;
	
	public DestFileWizardPage outputPage;
	public String defaultOutputExtension = "kompose";
	
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";
	
	public ParseKomposeWizard() {
		super();
		setNeedsProgressMonitor(false);
	}

	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {

		DestFileWizardPage newfilepage = new DestFileWizardPage(OUTPUTFILE_PAGENAME, selection);
		newfilepage.setTitle("Create a Kompose Model / Destination file selection");
		newfilepage.setDescription("This wizard parses a textual Kompose Model and exports it as an XMI file.\nPlease specify the output file name.");

		newfilepage.setFileName(inputFile.getLocation().removeFileExtension().addFileExtension(defaultOutputExtension).lastSegment());

		outputPage = newfilepage;
		addPage(newfilepage);
	}


	@Override
	public boolean performFinish() {
		
		IFile xmiFile = null;

		KomposeConsole.printlnMessage( "Parsing file " + inputFile, KomposeConsole.INFO);
		System.out.println("Parsing file " + inputFile);
		try {
			KomposeParser kParser = new KomposeParser(inputFile.getContents());
			Context c = null;
			 
			c = kParser.dirUnit();
			
			//for(String msg : parser.warnings) ISTeCQConsole.printlnMessage( msg, ISTeCQConsole.WARNING);
			if(c == null){
				KomposeConsole.printlnMessage( "ERROR : " + kParser.getException(), KomposeConsole.ERROR);
				System.out.println("ERROR : " + kParser.getException());
			}
			
			if (kParser.getErrors().isEmpty()) {
				xmiFile = outputPage.createNewFile();
				
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("istecq",new XMIResourceFactoryImpl()); 
				ResourceSet resource_set = new ResourceSetImpl();
				
				Resource res = resource_set.createResource(URI.createFileURI(xmiFile.getLocation().toOSString()));
				res.getContents().add(c);
				res.save(null);
				
				xmiFile.refreshLocal(1, null);
				
				KomposeConsole.printlnMessage( "Done - File " + xmiFile + " successfully created.", KomposeConsole.OK);
				System.out.println("Done - File " + xmiFile + " successfully created.");
			}
			else {
				for(String msg : kParser.getErrors()) //KomposeConsole.printlnMessage( msg, KomposeConsole.ERROR);
				System.out.println(msg);
			}
			
		} catch (Throwable e) {
			System.out.println("ERROR : " + e.getMessage());
			KomposeConsole.printlnMessage( "ERROR : " + e.getMessage(), KomposeConsole.ERROR);
			e.printStackTrace();
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

		Iterator it = selection.iterator();
		IFile file = null;
		while (it.hasNext()) {
			try {
				file = (IFile) it.next();

			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}

		this.inputFile = file;
	}

}
