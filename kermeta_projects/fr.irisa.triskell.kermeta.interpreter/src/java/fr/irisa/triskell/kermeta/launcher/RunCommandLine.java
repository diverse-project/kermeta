/* $Id: RunCommandLine.java,v 1.6 2005-05-17 07:16:39 dvojtise Exp $
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
import java.util.Vector;

import junit.framework.TestResult;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_C;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_H;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_K;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_O;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_T;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_U;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.utils.argumentsreader.CheckOption;
import fr.irisa.triskell.utils.argumentsreader.NoOption;
import fr.irisa.triskell.utils.argumentsreader.Option;

/**
 * Start a Kermeta program from the command line
 *
 */
public class RunCommandLine {
    protected KermetaInterpreter theInterpreter;
    protected String[] theArgs;
    protected CheckOption checkOption;
    public int nbOptionErrors=0;
    protected String unitURI = null;
    protected String className = null;
    protected String operationName = null;
    protected String kermetaStandardURI = null;
    protected boolean isTestSuite = false;
    protected ArrayList interpreterParameters;
    protected boolean initialized = false;
    
    
    
	/** Logger to get the error of this launcher */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");

    
    
    public RunCommandLine(String[] args)
	{
	    super();
	    theArgs = args;
	    //	  We build the object that will check the arguments with the wanted options.
		checkOption = new CheckOption (
			new Option[] {
				new NoOption (new Vector()),
				new Option_C (new Vector()),
				new Option_H (),
				new Option_T (),
				new Option_K (new Vector()),
				new Option_O (new Vector()),
				new Option_U (new Vector())
			} 
		);
	    nbOptionErrors = checkOption.Proceed(args);
	    if (checkOption.Saw ("-C"))
		{
	        internalLog.debug ("option -C was seen with arguments: ");
			Iterator it = checkOption.getOption("-C").getParameters().iterator();			
			if (it.hasNext())
			{
			    className = it.next().toString();
			    internalLog.debug ("\t" + className);
			}
		}
	    if (checkOption.Saw ("-K"))
		{
	        internalLog.debug ("option -K was seen with arguments: ");
			Iterator it = checkOption.getOption("-K").getParameters().iterator();						
			if (it.hasNext())
			{
			    kermetaStandardURI = it.next().toString();
			    internalLog.debug ("\t" + kermetaStandardURI);
			}
		}
	    if (checkOption.Saw ("-O"))
		{
	        internalLog.debug ("option -O was seen with arguments: ");
			Iterator it = checkOption.getOption("-O").getParameters().iterator();						
			if (it.hasNext())
			{
			    operationName = it.next().toString();
			    internalLog.debug ("\t" + operationName);
			}
		}
	    if (checkOption.Saw ("-U"))
		{
	        internalLog.debug ("option -U was seen with arguments: ");
			Iterator it = checkOption.getOption("-U").getParameters().iterator();			
			if (it.hasNext())
			{
			    unitURI = it.next().toString();
			    internalLog.debug ("\t" + unitURI);
			}
		}
	    if (checkOption.Saw ("-T"))
		{
	        internalLog.debug ("option -T was seen: ");
			Iterator it = checkOption.getOption("-K").getParameters().iterator();						
			if (it.hasNext())
			{
			    kermetaStandardURI = it.next().toString();
			    internalLog.debug ("\t" + kermetaStandardURI);
			}
		}
	    
	}
    
	/**
	 * 
	 * M A I N 
	 * 
	 */	
	public static void main(String[] args) {
	    RunCommandLine theLauncherRun;				
	    theLauncherRun = new RunCommandLine(args);
	    theLauncherRun.init();
	    theLauncherRun.run();
		
	}
	
	public void init()
	{

	    internalLog.debug("init");
	    if (unitURI ==  null) {
	        internalLog.error("Cannot initialise because no Unit is know");
	        return; 
	    }
	    if (kermetaStandardURI ==  null) {
	        internalLog.error("Cannot initialise because the location of Kermeta Standard Library is not known. Please use option -K ");
	        return; 
	    }
	    else KermetaUnit.STD_LIB_URI = kermetaStandardURI;
        
        
	    theInterpreter = new KermetaInterpreter(unitURI);
	    internalLog.debug("init2");
	    internalLog.debug ("The arguments not linked to an option are: (will be passed to the interpreter)");
	    interpreterParameters =  new ArrayList();
	    Iterator it = checkOption.getOption("").getParameters().iterator();			
		while (it.hasNext())
		{		
		    String arg = it.next().toString();
		    internalLog.debug ("\t" + arg);
		    interpreterParameters.add(
		            fr.irisa.triskell.kermeta.runtime.basetypes.String.create(arg,theInterpreter.getMemory().getROFactory()));
		}
	    //		  Is there a "testOperation" tag?
	    Iterator it2 = theInterpreter.getUnit().rootPackage.getFTag().iterator();
        while(it2.hasNext()) {
            FTag tag = (FTag)it2.next();
            //          is there a tag "testOperation" -- we don't care about its value!!
            if (tag.getFName().equals("testOperation"))
                isTestSuite=true; 
        }
        initialized = true;
	}
	public void run()
	{
	    internalLog.debug("run");
	    if (!initialized)
	    {
	        internalLog.error("Cannot run because was not initialized");
	        return;
	    }
	        
		if (isTestSuite)
		{
		    runTestSuite(className);
		}
		else
		{
		    if (className != null)
		        theInterpreter.setEntryPoint(className, operationName);		    
		    theInterpreter.setEntryParameters(interpreterParameters);
		    theInterpreter.launch();
		}
	
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
	        String mainClassValue)
	{
	    RunJunitFactory testJunit = new RunJunitFactory();
	    testJunit.addTestsForUnit(mainClassValue);
	    junit.framework.TestResult tr = new TestResult();
	    testJunit.run(tr);
	    internalLog.info("Runs: "+tr.runCount());
	    internalLog.info("Errors: "+tr.errorCount());
	    internalLog.info("Failures: "+tr.failureCount());
	}
	/**
	 * 
	 * @param mainClassValue the value of the mainClass tag
	 * @param mainOperationValue the value of the operation to run (used in special cases,
	 * and when the tag "testOperation" does not exist)
	 * @param parameters The arguments given in the main java call
	 */
	public void runMainOperation(
	        String mainClassValue, 
	        String mainOperationValue,
	        ArrayList parameters)
	{	    	  
	    theInterpreter.setEntryPoint(mainClassValue, mainOperationValue);
	    theInterpreter.setEntryParameters(parameters);
	    theInterpreter.launch();
	}

}
