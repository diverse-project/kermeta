/* $Id: KermetaLauncher.java,v 1.30 2008-02-15 14:35:44 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaLauncher.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.error.KermetaVisitorError;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.kpm.helpers.RunnerHelper;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.process.KermetaProcess;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.traceability.helper.Tracer;


/**
 * Singleton
 * This class was created to test the run of Kermeta plugin in a new JVM. It is not
 * useful yey. 
 */
public class KermetaLauncher
{
    private static KermetaLauncher defaultLauncher = null;
    public static String startFile = "";
    public static String className = "";
    public static String opName = "";
    public static String args = "";
    // FIXME : the way this IFile is found is not very "sure" with the use of "findMember"?
    protected IFile selectedFile;
    public static final String defaultTraceExtension = "traceability";
    /** separator for the arguments given in the Run configuration */
    public static final String ARG_SEP = " ";
    
    
    protected KermetaInterpreter interpreter = null;
    
    public KermetaInterpreter getInterpreter() {
    	return interpreter;
    }
    
    public void initInterpreter(String fileNameString) throws NotRegisteredURIException, URIMalformedException, IOException, CoreException {
        IResource iresource = ResourcesPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else
	      throw (new Error("File not found! - "+ fileNameString));
	    
	    String uri = "platform:/resource" + selectedFile.getFullPath().toString();
	    
	    KermetaUnit source = KermetaUnitChecker.check(uri);
	    
	    LinkedHashSet<KermetaUnit> kermetaUnitsToMerge = new LinkedHashSet<KermetaUnit> ();
   		kermetaUnitsToMerge.add(source);
   		kermetaUnitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(source) );

		IFile sourceFile = ResourceHelper.getIFile( source.getUri() );
	   	IProject project = sourceFile.getProject();
	   	
    	String binDirectory = "platform:/resource" + project.getFullPath().toString() + "/.bin";
	   	KermetaUnit unitToExecute = null;
	   
    	KermetaProject kermetaProject = KermetaWorkspace.getInstance().getKermetaProject(project);
	   	
	   	if ( kermetaProject != null ) {
	   		unitToExecute = RunnerHelper.getKermetaUnitToExecute(binDirectory, kermetaUnitsToMerge, sourceFile, kermetaProject);
	   	} else {
   			Merger merger = new Merger();
   			String fileToExecute = merger.process(kermetaUnitsToMerge, binDirectory, null);
   			unitToExecute = KermetaUnitChecker.check( fileToExecute );
	   	}
		    
	    interpreter = new KermetaInterpreter(unitToExecute, null);
    }
        
    public static KermetaLauncher getDefault() {
        if (defaultLauncher == null)
        {
            	defaultLauncher = new KermetaLauncher();
            	defaultLauncher.selectedFile = null;
        }
        return defaultLauncher;
    }
    
    /** Prevent user to instanciate it */
    private KermetaLauncher() {}
    
    public static void main(String[] argv)
    {
        // Get the arguments, that contain the file, class qualified name, and operation to execute. 
        for (int i=0; i< argv.length; i++)
        {
            // is argv a "-file", a "-class", a "-name"?  if so, get the following argv!
            if (argv[i].equals("-file") && argv[i+1]!="")
            {   startFile = argv[i+1];i+=1; }
            if (argv[i].equals("-class") && argv[i+1]!="")
            {   className = argv[i+1];i+=1; }
            if (argv[i].equals("-operation") && argv[i+1]!="")
            {  opName = argv[i+1];i+=1;}
            if (argv[i].equals("-args") && argv[i+1]!="")
            {  args = argv[i+1];i+=1;}
        }
        getDefault().runKermeta(startFile, className, opName, args, false, false);
    }

    /**
     * This method run the Kermeta interpreter, according to the data given by
     * the user through the launch configuration window.
     * @param isDebugMode if debug mode is set to false, then the normal 
     * launch method is used for kermeta interpreter, other wise launch_debug method
     * is used (see DebugInterpreter class in fr.irisa.triskell.kermeta.interpreter)
     * @param configuration
     * @param mode
     * @param args the arguments of the given operation opName, separated by a space.
     */
    public KermetaInterpreter runKermeta(
    		String fileNameString, 
    		String classQualifiedNameString, 
    		String operationString, 
    		String argsString, boolean isDebugMode, boolean isConstraintMode)
    {
	    String shortname = fileNameString.contains("/")?fileNameString.substring(fileNameString.lastIndexOf("/")):fileNameString;
	    String consolename = shortname + ": "+ classQualifiedNameString + "::" + operationString;
	    IOConsole console = new EclipseConsole(consolename);
     
	    try
        {                
            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            ArrayList<RuntimeObject> interpreter_params =  new ArrayList<RuntimeObject>();
            
            String[] params_table = argsString.split(" ");
            
            for (int i=0; i<params_table.length; i++) { 
            	interpreter_params.add(
            			fr.irisa.triskell.kermeta.runtime.basetypes.String.create(params_table[i],interpreter.getMemory().getROFactory()));
            }
            interpreter.setEntryParameters(interpreter_params);
            interpreter.setKStream(console);     
            if (isDebugMode == false)
            {
            	if (isConstraintMode) interpreter.launchConstraint();
            	else interpreter.launch();
            	interpreter.getKStream().dispose();
    	        interpreter.freeJavaMemory();
    	       // KermetaUnitFactory.resetDefaultLoader();
    	        return null;
            }
            else  // We launch an interpreter with a special "condition"
            {
            	interpreter.launch_debug();
            }
            
		    
        }
        catch (KermetaRaisedException kerror)
        {
            console.print(kerror.getMessage());
            console.print("\n"+kerror.toString());
            console.dispose();
        }
        catch (KermetaInterpreterError ierror)
        {
            console.print("Kermeta interpreter can't be launched :\n");
            console.print(ierror.getMessage());
            console.dispose();
        }
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print("Reported java error :\n "+e);
            console.dispose();
            KermetaProcess.internalLog.error("Reported java error : ", e);
            e.printStackTrace();
            RunnerPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, RunnerPlugin.PLUGIN_ID, 0,"Interpreter internal error", (Exception)e));
            
        }
        console.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        
        // this console is not used any more
        //console.removeConsoleListener();
        return interpreter;
        
    }
    
    /** Create a tracer (from traceability module) so that we can get easier the informations
     *  relative to the elements of the program to debug. */
    protected Tracer createTracer()
    {
//   	 create Trace structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("traceability",new XMIResourceFactoryImpl());
		ResourceSet trace_resource_set = new ResourceSetImpl();
		IFile trace_file = 
			IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(selectedFile.getFullPath().removeFileExtension().addFileExtension(
					defaultTraceExtension));
		URI u = URI.createURI(trace_file.getFullPath().toString());
    	u = new URIConverterImpl().normalize(u);
		//traceFile = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(traceFile.getFullPath().removeFileExtension().addFileExtension("traceability"));				
		Resource trace_resource = trace_resource_set.createResource(u);
		return new Tracer(trace_resource);
    }
    
    
    public KermetaInterpreter runKermeta(
    		String fileNameString, 
    		String classQualifiedNameString, 
    		String operationString, 
    		String argsString, boolean isDebugMode, boolean isConstraintMode,
    		IOConsole console)
    {
         try
        {

            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            ArrayList<RuntimeObject> interpreter_params =  new ArrayList<RuntimeObject>();
            
            if(!argsString.equals("")){
            	// add only params if they are defined in the runconfiguratio
            	// DVK: maybe we should think to a better user interface that allows to set argument with other types than String ...
	            String[] params_table = argsString.split(" ");
	            
	            for (int i=0; i<params_table.length; i++) { 
	            	interpreter_params.add(
	            			fr.irisa.triskell.kermeta.runtime.basetypes.String.create(params_table[i],interpreter.getMemory().getROFactory()));
	            }
            }
            // we don't want to crash with an internal error, simply give Void for all the argument that were not set
            while( interpreter_params.size() < interpreter.getEntryOperation().getOwnedParameter().size()){
            	interpreter_params.add(interpreter.getMemory().voidINSTANCE);
            }
            interpreter.setEntryParameters(interpreter_params);

    	    // init the console
            // console.initialize();
            interpreter.setKStream(console);
            
            if (isDebugMode == false)
            {
            	if (isConstraintMode) 
            		interpreter.launchConstraint();
            	else 
            		interpreter.launch();
            	console.dispose();
    	        interpreter.freeJavaMemory();
    	        //KermetaUnitFactory.resetDefaultLoader();
    	        return null;
            }
            else  // We launch an interpreter with a special "condition"
            {
            	interpreter.launch_debug();
            }
            
		    
        }
        catch (KermetaRaisedException kerror)
        {
            console.print(kerror.getMessage());
            console.print("\n"+kerror.toString());
            console.dispose();
        }
        catch (KermetaInterpreterError ierror)
        {
            console.print("Kermeta interpreter could not be launched :\n");
            console.print(ierror.getMessage());
            console.dispose();
        }
        catch (KermetaVisitorError e){
        	console.print("\nKermetaInterpreter internal error \n" +
    		"-------------------------------------------\n");
		    console.print("Reported java error : "+e);
		    console.print(e.getMessage());
		    console.print("\n--------- Interpreter stack trace ---------\n");
		    console.print(e.kermetaStackContextString);
		    console.dispose();
		    e.printStackTrace();
		    RunnerPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, RunnerPlugin.PLUGIN_ID, 0,"Interpreter internal error", e));
        }
        catch (java.lang.NoClassDefFoundError e){
        	console.print("\nKermetaInterpreter internal error \n" +
    		"-------------------------------------------\n");
		    console.print("Reported java error : "+e+"\n");
		    console.print(e.getMessage()+"\n");
		    String additionalInfo = "";
		    ClassLoader cl = Thread.currentThread().getContextClassLoader();
        	if(cl instanceof URLClassLoader){
        		URLClassLoader ucl=(URLClassLoader)cl;
        		URL[] urls = ucl.getURLs();
        		additionalInfo += "Current URLs in the URLClassLoader : \n";
				for (int index = 0; index < urls.length; index++) {
					additionalInfo += "\t" + urls[index].toExternalForm() + "\n";
				}
        	}
        	console.print(additionalInfo+"\n");
		    console.dispose();
		    e.printStackTrace();
		    RunnerPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, RunnerPlugin.PLUGIN_ID, 0,"Interpreter internal error", e));
        }
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print("Reported java error : "+e+"\n");
            console.print(e.getMessage());
            console.dispose();
            e.printStackTrace();
            RunnerPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, RunnerPlugin.PLUGIN_ID, 0,"Interpreter internal error", (Exception)e));
        }
        console.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        // this console is not used any more
        //console.removeConsoleListener();
        return interpreter;
        
    }
}
