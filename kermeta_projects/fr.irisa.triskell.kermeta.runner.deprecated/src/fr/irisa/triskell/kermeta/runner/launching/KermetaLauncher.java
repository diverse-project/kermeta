/* $Id: KermetaLauncher.java,v 1.3 2005-09-09 18:04:21 zdrey Exp $
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
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;

/**
 * Singleton
 * This class was created to test the run of Kermeta plugin in a new JVM. It is not
 * useful yey. 
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
        launch(startfile, className, opName,false);
    }
    
    /**
     * This method runs the Kermeta interpreter, according to the data given by
     * the user through the launch configuration window.
     * @param isDebugMode true if we are in ILaunchManager.DEBUG_MODE, false otherwise
     * @param configuration
     * @param mode
     */
    public static ExpressionInterpreter launch(String fileNameString, String classQualifiedNameString, String operationString, boolean isDebugMode)
    {
       return KermetaLaunchConfiguration.runKermeta(fileNameString, classQualifiedNameString, operationString, isDebugMode);
    }
    
}
