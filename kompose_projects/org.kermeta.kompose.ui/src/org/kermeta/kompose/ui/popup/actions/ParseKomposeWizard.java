package org.kermeta.kompose.ui.popup.actions;

import java.util.Iterator;

import kompose.Composer;
import org.kermeta.kompose.core.parser.KomposeParser;

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
import org.kermeta.kompose.ui.console.KomposeConsole;


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
		
		try {
			KomposeParser kParser = new KomposeParser(inputFile.getContents());
			Composer c = null;
			 
			c = kParser.dirUnit();
			
			//for(String msg : parser.warnings) ISTeCQConsole.printlnMessage( msg, ISTeCQConsole.WARNING);
			if(c == null){
				KomposeConsole.printlnMessage( "ERROR : " + kParser.getException(), KomposeConsole.ERROR);
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
			}
			else {
				for(String msg : kParser.getErrors()) KomposeConsole.printlnMessage( msg, KomposeConsole.ERROR);
			}
			
		} catch (Throwable e) {
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
