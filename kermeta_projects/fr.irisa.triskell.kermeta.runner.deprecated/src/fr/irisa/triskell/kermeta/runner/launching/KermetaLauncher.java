/* $Id: KermetaLauncher.java,v 1.6 2005-11-22 08:49:06 zdrey Exp $
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
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
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;
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
    
    public static KermetaLauncher getDefault() {
        if (defaultLauncher == null)
            	defaultLauncher = new KermetaLauncher();
        return defaultLauncher;
    }
    
    /** Prevent user to instanciate it himself */
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
        getDefault().runKermeta(startFile, className, opName, args, false);
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
    public KermetaInterpreter runKermeta(String fileNameString, String classQualifiedNameString, String operationString, String argsString, boolean isDebugMode)
    {
        
        selectedFile = null;
	    IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else
	    {  // TODO : throw an exception!
	    }
	    // Create a KermetaConsole where the interpreter will print the errors.
        KermetaConsole console = KermetaConsole.getSingletonConsole();
        KermetaInterpreter interpreter = null;
        if ( ! console.isInitialized())
        {            
        	// Add a MessageConsole
        	console.addConsole();
        }
        else
        {
        	System.out.println("reusing already initilized KermetaConsole");
            console.reset();
        }
        try
        {
        	String uri;
        	uri = "platform:/resource/" + selectedFile.getFullPath().toString();

            //  be sure this value is correctly set        
            KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
            
            interpreter = new KermetaInterpreter(uri);
                        
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
                interpreter.launch();
    	        interpreter.setKStream(null);
    	        interpreter.freeJavaMemory();
    	        KermetaUnitFactory.resetDefaultLoader();
    	        return null;
            }
            else 
            {
            	// TODO : use tracer! 
            	// But first we need more accessors on the class tracer, so that
            	// we can get easily the [textual] informations on the location of
            	// an element in the program in the debug process.
                // interpreter.getUnit().setTracer(defineTracer());
            	System.out.println("------------------------ Coucou! Debug Mode before lunch");
            	interpreter.launch_debug();
            	System.out.println("------------------------ After lunch");
            }
            
		    
        }
        catch (KermetaRaisedException kerror)
        {
            console.print(kerror.getMessage());
            console.print("\n"+kerror.toString());
        }
        catch (KermetaInterpreterError ierror)
        {
            console.print("Kermeta interpreter could not be launched :\n");
            console.print(ierror.getMessage());
        }
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print("Reported java error : "+e);
            console.print(e.getMessage());
            e.printStackTrace();
        }
        console.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        // this console is not used any more
        //console.removeConsoleListener();
        return interpreter;
        
    }
    
    protected Tracer defineTracer()
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
    
}
