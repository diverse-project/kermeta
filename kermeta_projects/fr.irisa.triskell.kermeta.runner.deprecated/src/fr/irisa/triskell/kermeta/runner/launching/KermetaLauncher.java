/* $Id: KermetaLauncher.java,v 1.2 2005-08-26 16:01:16 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaLauncher.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;

/**
 * Singleton 
 */
public class KermetaLauncher
{
    private static KermetaLauncher defaultLauncher = null;
    public static String startfile = "";
    public static String className = "";
    public static String opName = "";
    
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
            {   startfile = argv[i+1];i+=1; }
            if (argv[i].equals("-class") && argv[i+1]!="")
            {   className = argv[i+1];i+=1; }
            if (argv[i].equals("-operation") && argv[i+1]!="")
            {  opName = argv[i+1];i+=1;}
        }
        launch(startfile, className, opName);
/*        System.out.println("memory : "+Runtime.getRuntime().totalMemory());
        
        test25Hello();
        System.out.println("memory after launch : "+Runtime.getRuntime().totalMemory());
        */
    }
    
    public static void test25Hello() {
        for (int i=0; i<1000; i++) {
          //  String root_uri = "platform:/plugin/fr.irisa.triskell.kermeta/lib";
            String root_uri = "/udd/zdrey/Workspaces/KMWorkspace/fr.irisa.triskell.kermeta/lib";
            KermetaUnit.STD_LIB_URI = root_uri+"/framework.km";
            KermetaInterpreter inter = new KermetaInterpreter("/udd/zdrey/Workspaces/runtime-workbench-workspace/sanfami/src/qupl.kmt");
            inter.launch();
            System.err.println(" > Execution " + i + " memory used : " + Runtime.getRuntime().freeMemory());
        }
        
    }
    
    /**
     * This method runs the Kermeta interpreter, according to the data given by
     * the user through the launch configuration window.
     * @param configuration
     * @param mode
     */
    public static void launch(String fileNameString, String classQualifiedNameString, String operationString)
    {
        IFile selectedFile = null;
/*
        System.out.println("Root : "+ RunnerPlugin.getWorkspace());
        IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
        if (iresource instanceof IFile)
            selectedFile = (IFile) iresource;
        else
        {  // TODO : throw an exception!
        }
  */      
        SystemIOStream console = new SystemIOStream(); //new KermetaConsole();
        // Remove the preceding consoles
   /*     console.removeCurrentConsole();
        // Add a MessageConsole
        console.addConsole();*/	
        try
        {
            //System.out.println("platform loc : "+Platform.getLocation());
            System.out.println(RunnerPlugin.getWorkspace());
            //Platform.asLocalURL(new URL(url, "runner_kermeta.jar")).getFile()
            //String uri = "platform:/resource/" + fileNameString; //selectedFile.getFullPath().toString();
            //String uri = "/udd/zdrey/Workspaces/runtime-workbench-workspace/"+fileNameString;
            String uri = "/udd/zdrey/Workspaces/runtime-workbench-workspace/sanfami/src/qupl.kmt";
            // 	Get the values given by the user in the runPopupDialog
            KermetaInterpreter interpreter = new KermetaInterpreter(uri);
            System.out.println("Platform kermeta :"+ Platform.getBundle("fr.irisa.triskell.kermeta"));
            //String root_uri = Platform.getBundle("fr.irisa.triskell.kermeta");//KermetaPlugin.getDefault().getBundle().getEntry("/").toExternalForm()+"/lib/";//"/udd/zdrey/Workspaces/KMWorkspace/fr.irisa.triskell.kermeta/lib";
            String root_uri = "platform:/plugin/fr.irisa.triskell.kermeta/lib";
            KermetaUnit.STD_LIB_URI = root_uri+"/framework.km";
            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            interpreter.setKStream(console);
            interpreter.launch();
            interpreter = null;
            
        }
        catch (KermetaRaisedException kerror)
        {
            console.print("Uncaught exception in Kermeta program\n");
            console.print(kerror.getMessage());
            console.print("Cause : " + kerror.getCause());
        }
        catch (KermetaInterpreterError ierror)
        {
            console.print("Uncaught exception in Kermeta interpreter:\n");
            console.print(ierror.getMessage());
            ierror.printStackTrace();
        }
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error:\n");
            console.print(e.getMessage());
            e.printStackTrace();
        }
        
        
    }
    
}
