package fr.irisa.triskell.kermeta.ocl.ui.popup.actions;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import fr.irisa.triskell.kermeta.ocl.TestOCLParser;
import fr.irisa.triskell.kermeta.ocl.console.OCLConsole;
import fr.irisa.triskell.kermeta.ocl.kmtactions.GenerateOCL;


public class OCLParseWizard extends Wizard {

	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	
	protected IFile inputFile;
	protected IFile inputMetaFile;
	//public FileChooserWizardPage selectPage;
	public DestFileWizardPage outputPage;
	public String defaultOutputExtension = "kmt";
	
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";
	
	public OCLParseWizard() {
		super();
		setNeedsProgressMonitor(false);
	}

	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		
		//FileChooserWizardPage selectpage = new FileChooserWizardPage("OCL to Kermeta Transformaion / MetaModel file selection");
		//selectpage.setDescription("This wizard parses a OCL file and create the corresponding kmt file.\nPlease specify the output file name.");
		DestFileWizardPage newfilepage = new DestFileWizardPage(OUTPUTFILE_PAGENAME, selection);
		newfilepage.setTitle("OCL to Kermeta Transformaion /  Destination file selection");
		newfilepage.setDescription("This wizard parses a OCL file and create the corresponding kmt file.\nPlease specify the output file name.");

		newfilepage.setFileName(inputFile.getLocation().removeFileExtension().addFileExtension(defaultOutputExtension).lastSegment());

		outputPage = newfilepage;
		//selectPage = selectpage;
		//addPage(selectpage);
		addPage(newfilepage);
		
	}

	IFile outOCLfile;
	private boolean generatemOCL(){
		
		OCLConsole.printlnMessage( "Parsing file " + inputFile, OCLConsole.INFO);
		
		try {
			 outOCLfile = inputFile.getWorkspace().getRoot().getFile(inputFile.getLocation().removeFileExtension().addFileExtension("mocl"));
			if (outOCLfile.exists()) outOCLfile.delete(true, null);
			String ipath =  inputFile.getLocation().toOSString();
			String opath =  inputFile.getLocation().removeFileExtension().addFileExtension("mocl").toOSString();
			
			
			
			new TestOCLParser().run(ipath,opath);
			
			/*//ISTeCQLexer lexer = new ISTeCQLexer(inputFile.getContents());
			//ISTeCQParser parser = new ISTeCQParser(lexer);
			
			//ApplicationModel m = null;
			 
			//m = parser.ammUnit();
			
			for(String msg : parser.warnings) OCLConsole.printlnMessage( msg, OCLConsole.WARNING);
			
			
			if (parser.errors.isEmpty()) {
				
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("istecq",new XMIResourceFactoryImpl()); 
				ResourceSet resource_set = new ResourceSetImpl();
				
				Resource res = resource_set.createResource(URI.createFileURI(xmiFile.getLocation().toOSString()));
				res.getContents().add(m);
				res.save(null);
				*/
			
			 outOCLfile = inputFile.getWorkspace().getRoot().getFile(inputFile.getLocation().removeFileExtension().addFileExtension("mocl"));
				
			outOCLfile.refreshLocal(1, null);
				
				OCLConsole.printlnMessage( "Done - File " + outOCLfile + " successfully created.", OCLConsole.OK);
			/*}
			else {
				for(String msg : parser.errors) OCLConsole.printlnMessage( msg, OCLConsole.ERROR);
			}*/
			
		} catch (Throwable e) {
			OCLConsole.printlnMessage( "ERROR : " + e.getMessage(), OCLConsole.ERROR);
			return false;
		}
		
		
		
		return true;
	}
	
	

	@Override
	public boolean canFinish() {
		if (outputPage == null){
			return false;
			
		}
		
		// TODO Auto-generated method stub
		return super.canFinish() && outputPage.getEcoreFile() != null;
	}

	private void registerPackages(EPackage pack) {
		Registry.INSTANCE.put(pack.getNsURI(), pack);
		
		EList l = pack.getESubpackages();
		
		if(l != null) {
			Iterator it = l.iterator();
			while(it.hasNext()) {
				registerPackages((EPackage) it.next());
			}
		}
	}
	
	@Override
	public boolean performFinish() {
		IFile xmiFile = null;
		//this.generatemOCL();
		if (this.generatemOCL()){
			try{
				
				
				
			xmiFile = outputPage.createNewFile();
			inputMetaFile = outputPage.getEcoreFile();
			
			String strURI = null;
			URI mmURI = null;
			Resource res = null;
			EPackage ePack = null;
			
			ResourceSet rs = new ResourceSetImpl();
				
			strURI = "platform:/plugin/fr.irisa.triskell.kermeta.ocl/mmodel/OCLCST.ecore"; 
			mmURI = URI.createURI(strURI);
			res = rs.getResource(mmURI, true);
				
			ePack = (EPackage) res.getContents().get(0);
			registerPackages(ePack);
			
			
			
			//IFile outfile = inputFile.getWorkspace().getRoot().getFile(inputFile.getLocation().removeFileExtension().addFileExtension("fixed.istecq"));
			if (xmiFile.exists()) xmiFile.delete(true, null);
				
			String ipath = "file:/" + inputFile.getLocation().removeFileExtension().addFileExtension("mocl").toOSString();
			String imetapath ="file:/" +  inputMetaFile.getLocation().toOSString();
			
			String opath = xmiFile.getLocation().toOSString();
			
			// Here I need to redirect Kermeta Console !
			
			//GenerateOCL.run(ipath, imetapath, opath, new OCLConsole(), KermetaConfig.KM_DIR + "/OCLKMTPrinter.kmt");
			//GenerateOCL.run(ipath, imetapath, opath, new OCLConsole());
			
			
			 File f = new File(inputFile.getLocation().removeFileExtension().addFileExtension("mocl").toString());
				if (f.exists()) {
					f.delete();
					System.err.println("delete File");
				}
				
			inputFile.getParent().refreshLocal(1, null);
			//xmiFile.refreshLocal(1, null);
			
		//	msgStream = OCLConsole.newOKMessageStream();
		//	msgStream.println("Model " + xmiFile + " created successfully.");
			
		} catch (Exception e) {
			OCLConsole.printlnMessage( "ERROR : " + e.getMessage(), OCLConsole.ERROR);
			e.printStackTrace();
		}

			
			return true;
		}else
			return false;
		
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

		this.inputFile = file;
	}

}
