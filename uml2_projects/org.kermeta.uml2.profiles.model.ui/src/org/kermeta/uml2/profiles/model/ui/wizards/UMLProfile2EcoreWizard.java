/**
 * 
 */
package org.kermeta.uml2.profiles.model.ui.wizards;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.uml2.profiles.model.ui.Activator;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.eclipse.wizard.DestFileWizardPage;



/**
 * Wizard that allows to export an UML profile into an ecore file
 *
 */
public class UMLProfile2EcoreWizard extends Wizard {

	protected IStructuredSelection selection;
    protected IWorkbench workbench;
    protected IFile inputFile;

    //public DestFileWizardPage outputPage;
    public DestFileWizardPage outputPage;
    
    public String defaultOutputExtension = "ecore";
    
    public static final String KERMETA_PROGRAM = "platform:/plugin/org.kermeta.uml2.profiles.model/src/kmt/UMLProfile2Ecore/UMLProfile2Ecore.kmt";
    
    // Constants
    /** pagenames */
    public static final String OUTPUTFILE_PAGENAME = "OutputFile";
    
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		String inputfile_uri = "file:/" + inputFile.getLocation().toOSString();
        String outputfile_uri = "platform:/resource" +outputPage.getContainerFullPath()+ "/"+outputPage.getFileName();
        
        
		Set<String> parameters = new TreeSet<String>();
		parameters.add(inputfile_uri);
		parameters.add(outputfile_uri);
		parameters.add("true");
		Set<String> requiredClassPathes = new TreeSet<String>();
		try {
			requiredClassPathes.add("file://" + FileLocator.resolve(Platform.getBundle("org.kermeta.uml2.profiles.model").getEntry("/bin/")));
			Bundle bundle = org.eclipse.core.runtime.Platform.getBundle("org.kermeta.uml2.profiles.model");
	         if(bundle != null){
	        	 requiredClassPathes.add(FileLocator.resolve(bundle.getEntry("/")).toString());
	         }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleInterpretedJob job = new SimpleInterpretedJob("UML profile 2 ecore job", 
				Activator.PLUGIN_ID, 
				KERMETA_PROGRAM, 
				"UMLProfileUtils::Main", 
				"main", 
				parameters,
				requiredClassPathes);
		job.schedule();
		/*
		IOConsole console = new EclipseConsole("UMLProfile 2 Ecore"); 
	    console.println(new InfoMessage("Exporting Ecore "+ outputPage.getFileName() +" from file : " + inputFile.getName() + "..."));
	    try {			
			
	         String inputfile_uri = "file:/" + inputFile.getLocation().toOSString();
	         String outputfile_uri = outputPage.getFileName();
	         	         
	         Interpreter interpreter = new Interpreter(KERMETA_PROGRAM, InterpreterMode.RUN, null, console);
	         interpreter.setStreams(console);		
	         interpreter.setEntryPoint("UMLProfileUtils::Main", "main");
	         String[] parameters = new String[3]; 
	         parameters[0] = inputfile_uri; 
	         parameters[1] = outputfile_uri; 
	         parameters[2] = "true";
	         interpreter.setParameters(parameters);
				
	         // Add some URL to the classloader of the interpreter : needed if your code use some extra java classes (via extern for example)
	         // use a set for building the URL (in case some may fail due to malformed URL
	         // Note : URL must end with a / if this is a directory, if not, this is considered as a jar by the classloader
	         Set<URL> urlsSet = new LinkedHashSet<URL>();
	         // URL used when run in a runtimeworkbench, this allows to debug the plugin
	         safeAddURLAsString(urlsSet, "file://" + FileLocator.resolve(Platform.getBundle("org.kermeta.uml2.profiles.model").getEntry("/bin/")));
	         // add this plugin as a deployed plugin
	         Bundle bundle = org.eclipse.core.runtime.Platform.getBundle("org.kermeta.uml2.profiles.model");
	         if(bundle != null){
	            urlsSet.add(FileLocator.resolve(bundle.getEntry("/")));
	         }
	         // convert the set into an array
	         URL[] urls = new URL[urlsSet.size()];
	         int i = 0;
	         for (URL url : urlsSet) {
	            urls[i] = url;
	            i++;
	         }
	         URLClassLoader cl = new URLClassLoader(urls, interpreter.getClass().getClassLoader());
	         Thread.currentThread().setContextClassLoader(cl);
	        		
	         interpreter.launch(); 
			
	         //outputFile.refreshLocal(1, null);
				
	         //console.println(new OKMessage("Execution terminated successfully."));
				
				
	      } catch (Throwable e) { 
	         console.println(new ErrorMessage("Runtime error : "));
	         console.println(new ThrowableMessage(e));	
	         e.printStackTrace();
	         Activator.log(e);
	      }
*/
	/*	SintaksPlugin.getDefault().getOptionManager().setSyntacticModel(outputPage.getSMdlText());
		try {
			IFile outputFile = outputPage.createNewFile();				
			SintaksPlugin.getDefault().createDebugStream (outputPage.getContainerFullPath());
			SintaksPlugin.getDefault().debugln("Loading " + inputFile.getName()  );
			SintaksPlugin.getDefault().debugln("Writing " + outputFile.getName()  );
			writeUnit(outputFile);
			outputFile.refreshLocal(1, null);
			outputFile.getParent().refreshLocal(1, null);
			SintaksPlugin.getDefault().closeDebugStream ();
		}
		catch (Throwable e)	{
				Shell theShell = this.getContainer().getShell();
	        	MessageDialog.openError(theShell,"Error writing file", "errors: "+ e.getMessage());
				e.printStackTrace();
				SintaksUIPlugin.log(e);
		}
*/
		return true;
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
			// the selection should be a single file
			@SuppressWarnings("unchecked")
			Iterator it = selection.iterator();

			while(it.hasNext()) {
				inputFile = (IFile)it.next();
			}
		}
	}
	
	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		
		//DestFileWizardPage newfilepage = new DestFileWizardPage(OUTPUTFILE_PAGENAME, selection);
		DestFileWizardPage newfilepage = new DestFileWizardPage(OUTPUTFILE_PAGENAME, selection);
		newfilepage.setTitle("Create Ecore from UML profile / Destination file selection");
		newfilepage.setDescription("This wizard exports your file into an ecore file.\nPlease specify the output file name.");
		
		// Use the input file name with the xmi extension as default
		String outputFileName = inputFile.getFullPath().removeFileExtension().addFileExtension(defaultOutputExtension).lastSegment();
		newfilepage.setFileName(outputFileName);
		outputPage = newfilepage;
		
		addPage(newfilepage);
	}

	   /**
	    * add a new URL to the set
	    * Doesn't fail if the URL is malformed, in that case, only a warning is raised, 
	    * @param urlsSet : set that will contain the URL built
	    * @param url : String of the URL to build
	    */
	   private static void safeAddURLAsString(Set<URL> urlsSet, String url){
	      try{
	         urlsSet.add(new URL(url));
	      } catch (MalformedURLException e) {
	         Activator.log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, IStatus.WARNING, "problem adding an entry of the classpath, "
	 	            + url + " cannot be added in classloader", e));
	      }
	   }

	
}
