/* $Id: OCLParseWizard.java,v 1.12 2008-07-25 14:25:10 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.ocl
* File : 	OCLParseWizard.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : 
* 	Olivier Barais
* 	Mark Skipper
* 	Didier Vojtisek
*/
package fr.irisa.triskell.kermeta.ocl.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.ocl.GenerateKMT;


public class OCLParseWizard extends Wizard {

	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	
	protected IFile inputFile;
	protected IFile inputMetaFile;
	//public FileChooserWizardPage selectPage;
	public DestFileWizardPage outputPage;
	public String defaultOutputExtension = "kmt";
	
	private EclipseConsole console;
	
	/** pagenames */
	public static final String OUTPUTFILE_PAGENAME = "OutputFile";
	
	public OCLParseWizard() {
		super();
		console = new EclipseConsole("OCL 2 KMT");
		
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

	/*IFile outOCLfile;
	private boolean generatemOCL(){
		
		console.println(new InfoMessage("Parsing file " + inputFile));
		
		try {
			outOCLfile = inputFile.getWorkspace().getRoot().getFile(inputFile.getLocation().removeFileExtension().addFileExtension("mocl"));
			if (outOCLfile.exists()) outOCLfile.delete(true, null);
			//String ipath =  inputFile.getLocation().toOSString();
			//String opath =  inputFile.getLocation().removeFileExtension().addFileExtension("mocl").toOSString();
			
			// read input file into a string
			InputStream inStream = inputFile.getContents();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
			String str;
			StringBuffer oclSourceText = new StringBuffer();
			while ((str = reader.readLine()) != null) {
				oclSourceText.append(str);
				oclSourceText.append("\n");
	        }
            reader.close();
            
            MyOCLParser parser = new MyOCLParser(oclSourceText.toString());
    		EObject constraint = null;
    		constraint = parser.parse();
    		if (constraint != null) {
    			// eventually patch the name of the file
    			IFile outFile = ResourceHelper.getOrCreateIFile(outOCLfile.toString());
    			URI fileURI = URI.createURI(outFile.toString());
    			ResourceSet resource_set = new ResourceSetImpl();
    			Resource resource = resource_set.createResource(fileURI);
    			//Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);
    			resource.getContents().add(constraint);
    			TestOCLParser.saveList(constraint.eCrossReferences());
    			resource.save(Collections.EMPTY_MAP);
    		
    		
            
			//TestOCLParser.run(ipath,opath);
			
			
			
			//ISTeCQLexer lexer = new ISTeCQLexer(inputFile.getContents());
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
				
			
			 //outOCLfile = inputFile.getWorkspace().getRoot().getFile(inputFile.getLocation().removeFileExtension().addFileExtension("mocl"));
				
			outOCLfile.refreshLocal(1, null);
				
			console.println(new OKMessage("Done - File " + outOCLfile + " successfully created."));
			}
			else {
				console.println(new ErrorMessage( "ERROR :  Nothing to save"));
				
				//for(String msg : parser.errors) OCLConsole.printlnMessage( msg, OCLConsole.ERROR);
			}
			
		} catch (Throwable e) {
			console.println(new ErrorMessage( "ERROR : " + e.getMessage()));
			console.println(new ThrowableMessage( e));
			e.printStackTrace();
			return false;
		}
		
		
		
		return true;
	}
	
	*/

	@Override
	public boolean canFinish() {
		if (outputPage == null){
			return false;
			
		}
		
		// TODO Auto-generated method stub
		return super.canFinish() && outputPage.getEcoreFile() != null;
	}

	
	
	@Override
	public boolean performFinish() {
		console.println(new InfoMessage("Generating KMT file from : " + inputFile.getName() + 
				" refering to metamodel " + outputPage.getEcoreFile().getName() + "..."));
		
		IFile kmtFile = outputPage.createNewFile();;
		//this.generatemOCL();
		//if (this.generatemOCL()){
		//	try{
				
		//URIConverter.URI_MAP.putAll(URIMapUtil.readMapFile(new File("uri.map")));
		inputMetaFile = outputPage.getEcoreFile();
		//IOPlugin.LOCAL_USE= true;
		String oclPath = "platform:/resource" + inputFile.getFullPath().toString();
		String ecorePath ="platform:/resource" + inputMetaFile.getFullPath().toString();
		
		String kmtPath = kmtFile.getLocation().toOSString();
		
		URI ecoreURI = URI.createURI(ecorePath);
		URI oclURI = URI.createURI(oclPath);
		URI kmtURI = URI.createURI(kmtPath);
		GenerateKMT generator = new GenerateKMT(console);
		generator.generate(ecoreURI, oclURI, kmtURI);		
				
			
			
			
			
				
			//strURI = "platform:/plugin/fr.irisa.triskell.kermeta.ocl/mmodel/OCLCST.ecore"; 
			//mmURI = URI.createURI(strURI);
			//res = rs.getResource(mmURI, true);
				
			//ePack = (EPackage) res.getContents().get(0);
			//registerPackages(ePack);
			
			
			
			//IFile outfile = inputFile.getWorkspace().getRoot().getFile(inputFile.getLocation().removeFileExtension().addFileExtension("fixed.istecq"));
			IFile tmpfile = ResourceHelper.getIFile(kmtFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString(),false);
			if (tmpfile.exists())
				try {
					tmpfile.delete(true, null);
				} catch (CoreException e1) {
					console.println(new ThrowableMessage(e1));
					e1.printStackTrace();
				}
				
			
			
			// Here I need to redirect Kermeta Console !
			
		
			
			/* File f = new File(inputFile.getLocation().removeFileExtension().addFileExtension("mocl").toString());
				if (f.exists()) {
					f.delete();
					System.err.println("delete File");
				}
				*/
			try {
				inputFile.getParent().refreshLocal(1, null);
			} catch (CoreException e) {
				console.println(new ThrowableMessage(e));
				e.printStackTrace();
			}
			//xmiFile.refreshLocal(1, null);
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
		Iterator<?> it = selection.iterator();
		IFile file = null;
		while (it.hasNext()) {
			Object next = it.next();
			if(next instanceof IFile)
				file = (IFile) next;
		}

		this.inputFile = file;
	}

}
