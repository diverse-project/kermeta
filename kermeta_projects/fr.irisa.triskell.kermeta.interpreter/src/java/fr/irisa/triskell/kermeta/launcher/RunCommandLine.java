/* $Id: RunCommandLine.java,v 1.2 2005-04-28 13:36:15 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RunCommandLine.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        <desription.text> 
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;

/**
 * Start a Kermeta program from the command line
 *
 */
public class RunCommandLine extends Run{
    protected String[] theArgs;
    public RunCommandLine(String[] args)
	{
	    super(args);
	    theArgs = args;
	    
	}
    
	/*
	 * 
	 * M A I N 
	 * 
	 */	
	public static void main(String[] args) {
	    RunCommandLine theLauncherRun;
	    theLauncherRun = new RunCommandLine(args);
	    theLauncherRun.initializeInterpreter(args);
	    theLauncherRun.run();
		
	}
	public void run()
	{
//	  Is there a "testOperation" tag?
		if (isTestOperation==true)
		{
		    runTestSuite(
		            mainClassValue,
		            builder  );
		}
		else
		    // Otherwise : let's execute the mainClass.mainOperation
		    runMainOperation(
		       mainClassValue, mainOperationValue, mainArgsValue, builder,
		       theArgs);
	
	}  
	
	/**
	 * Run a test suite : all operations that begin by "test" inside the class
	 * specified by mainClassValue are executed
	 * TODO (bis but important) : create a test suite handler, but in Kermeta!! 
	 * @param mainClassValue
	 * @param builder
	 * @param stdioFClass
	 * @param args
	 */
	public void runTestSuite(
	        String mainClassValue, 
	        KermetaUnit builder)
	{
	    // Create the RuntimeObject of main class, of its instance, and 
	    // its FClassDefinition so that we can get its operations in order to run them
	    RuntimeObject roMainClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(mainClassValue);
	    if (roMainClass == null)
	    {
	        // the indicated mainclass doesn't exist in the given context
	        throw new KermetaLoaderError(mainClassValue + " doesn't exist in "+args[0]);
	    }	    
	    RuntimeObject roMainClassInstance=Run.koFactory.createRuntimeObject(roMainClass);
	    FClassDefinition mainClassDef=((FClass)roMainClass.getData().get("kcoreObject")).getFClassDefinition();
	    Iterator it=mainClassDef.getFOwnedOperation().iterator();
	    
	    // Get each operation which name begins by "test",
	    // and run it.
	    while (it.hasNext())
	    {
//	      We can now launch the operation found in mainOperation through the BaseInterpreter
	        FOperation mainOp = (FOperation)it.next();
	        if (mainOp.getFName().startsWith("test"))
	        {
	        // TODO : throw an exception if FOperation contains params.
	        // But this should be tested inside the Kermeta library!
	            runOperation(builder, roMainClassInstance, mainOp, new ArrayList());
	        }   
	    }
	}
	/**
	 * TODO : move testMainOperation in a special class, like "TestHandler"
	 * This method is used for a kermeta program when it does not contain the tag "testOperation".
	 * But when the tag "testOperation" is defined, it means that we have to execute all the operation prefixed by <code>test</code>.
	 * Otherwise, there should be a "mainOperation" to launch (which name is defined in the <code>mainOperation</code> tag
	 * @param mainClassValue the value of the mainClass tag
	 * @param mainOperationValue the value of the operation to run (used in special cases,
	 * and when the tag "testOperation" does not exist)
	 * @param mainArgsValue the value of the arguments list in the mainArgsValue tag (optional tag)
	 * @param builder The kermetaUnit for the main Kermeta program (usually, a kmt file)
	 * @param args The arguments given in the main java call
	 */
	public void runMainOperation(
	        String mainClassValue, 
	        String mainOperationValue, 
	        String mainArgsValue,
	        KermetaUnit builder,
	        String[] args)
	{
	    RuntimeObject roMainClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(mainClassValue);
	    RuntimeObject roMainClassInstance=Run.koFactory.createRuntimeObject(roMainClass);
	    FClassDefinition mainClassDef=((FClass)roMainClass.getData().get("kcoreObject")).getFClassDefinition();
	    Iterator it=mainClassDef.getFOwnedOperation().iterator();
	    boolean found=false;
	    
	    // Parse the list of operations in mainClass, until we find the operation
	    while (it.hasNext() && !found)
	    {
	        FOperation mainOp=(FOperation)it.next();
	        // Have we find the operation?
	        if (mainOp.getFName().equals(mainOperationValue))
	        {
	            found=true;
	            ArrayList arguments=new ArrayList();
	            if (mainArgsValue!=null || args.length>3)
	            {//set a collection of arguments for the operation
	                internalLog.error("Arguments to main operation : TODO adapt args to operation parameters types.");
	                //TODO manage the arguments conversion to kermeta types of parameters
	                //assume the first parameter of mainOp is a ref(0,*) StringLiteral
	                for (int i=3;i<args.length;i++) {
	                    RuntimeObject arg=fr.irisa.triskell.kermeta.runtime.basetypes.String.create(args[i],koFactory);
	                    arguments.add(arg);
	                }
	            }
	            // We can now launch the operation found in mainOperation through the BaseInterpreter
	            runOperation(builder, roMainClassInstance, mainOp, arguments);
	            
	        }
	    }
	}

}
