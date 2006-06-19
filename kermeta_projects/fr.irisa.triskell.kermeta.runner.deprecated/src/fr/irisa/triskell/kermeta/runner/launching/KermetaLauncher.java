/* $Id: KermetaLauncher.java,v 1.17 2006-06-19 13:36:50 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaLauncher.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.SysexMessage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.internal.ui.actions.DebugContextualLaunchAction;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
//import fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;
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
        IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else
	      throw (new Error("File not found! - "+ fileNameString));
	    
	    String shortname = fileNameString.contains("/")?fileNameString.substring(fileNameString.lastIndexOf("/")):fileNameString;
	    String consolename = shortname + ": "+ classQualifiedNameString + "::" + operationString;
	    KermetaConsole console = new KermetaConsole(consolename);
        
	    KermetaInterpreter interpreter = null;
        try
        {
        	String uri = "platform:/resource/" + selectedFile.getFullPath().toString();
            //  be sure this value is correctly set        
            KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
            
            Tracer tracer = isDebugMode?createTracer():null;
            
            interpreter = new KermetaInterpreter(uri, tracer);
                        
            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            ArrayList interpreter_params =  new ArrayList();
            
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
    	        interpreter.setKStream(null);
    	        interpreter.freeJavaMemory();
    	        KermetaUnitFactory.resetDefaultLoader();
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
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print("Reported java error : "+e);
            console.print(e.getMessage());
            console.dispose();
            e.printStackTrace();
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
    		KermetaIOStream console)
    {
        IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else
	      throw (new Error("File not found! - "+ fileNameString));
	    KermetaInterpreter interpreter = null;
        try
        {
        	String uri = "platform:/resource/" + selectedFile.getFullPath().toString();
            //  be sure this value is correctly set        
            KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
            
            Tracer tracer = isDebugMode?createTracer():null;
            
            interpreter = new KermetaInterpreter(uri, tracer);

            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            ArrayList interpreter_params =  new ArrayList();
            
            String[] params_table = argsString.split(" ");
            
            for (int i=0; i<params_table.length; i++) { 
            	interpreter_params.add(
            			fr.irisa.triskell.kermeta.runtime.basetypes.String.create(params_table[i],interpreter.getMemory().getROFactory()));
            }
            interpreter.setEntryParameters(interpreter_params);

    	    // init the console
            // console.initialize();
            interpreter.setKStream(console);
            
            if (isDebugMode == false)
            {
            	if (isConstraintMode) interpreter.launchConstraint();
            	else interpreter.launch();
    	        interpreter.setKStream(null);
    	        interpreter.freeJavaMemory();
    	        KermetaUnitFactory.resetDefaultLoader();
    	        console.dispose();
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
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print("Reported java error : "+e);
            console.print(e.getMessage());
            console.dispose();
            e.printStackTrace();
        }
        console.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        // this console is not used any more
        //console.removeConsoleListener();
        return interpreter;
        
    }
}
