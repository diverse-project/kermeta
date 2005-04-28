/* $Id: RunTestCase.java,v 1.1 2005-04-28 10:01:37 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : RunTestCase.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		dvojtise	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 * 		- interpreterInstance has become a static attribute of Run 
 * 		- splitted main method in smaller ones
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;



/**
 * Launcher for Kermeta interpreter. 
 * It can be run from the command line or as a test case for JUnit.
 */
public class RunTestCase extends TestCase {
	

	/** Logger to get the error of this launcher */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");


	// these values from the Run object are saved so they can be restored 
	//when a testcase run
	private String mainClassValue;
    private String mainOperationValue; 
    private String mainArgsValue;
    private KermetaUnit builder;
    private String[] args;

    private Run containerTestSuite;

    // workaround about static fileds in Run.java
    private static Run containerTestSuitePreviouslyRun=null;
	
	public RunTestCase(
	        String themainClassValue, 
	        String themainOperationValue, 
	        String themainArgsValue,
	        KermetaUnit thebuilder,
	        String[] theargs,
	        Run thecontainerTestSuite
	        )
	
	{
	    super(themainClassValue+"."+themainOperationValue);
	    mainClassValue = themainClassValue;
	    mainOperationValue = themainOperationValue;
	    mainArgsValue = themainArgsValue;
	    builder = thebuilder;
	    args = theargs;
        containerTestSuite = thecontainerTestSuite;
	}
	

	
	
	/**
	 * This method is used for a kermeta program when it does not contain the tag "testOperation".
	 * But when the tag "testOperation" is defined, it means that we have to execute all the operation prefixed by <code>test</code>.
	 * Otherwise, there should be a "mainOperation" to launch (which name is defined in the <code>mainOperation</code> tag
	 */
	public void runTest()
	{	        
	    // if this test does not belong to the same test suite as the preceding
	    // then reinitialize the interpreter
	    //  This is due to the use of public static value of "Run"
	    // this workaround will not be neede when we will remove those static in Run
	    if (containerTestSuite != containerTestSuitePreviouslyRun)
	    {
	        containerTestSuite.initializeInterpreter(args);
	    }
	    containerTestSuitePreviouslyRun = containerTestSuite;
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
	                    RuntimeObject arg=fr.irisa.triskell.kermeta.runtime.basetypes.String.create(args[i],Run.koFactory);
	                    arguments.add(arg);
	                }
	            }
	            // We can now launch the operation found in mainOperation through the BaseInterpreter
	            containerTestSuite.runOperation(builder, roMainClassInstance, mainOp, arguments);
	            
	        }
	    }
	}
	
}
