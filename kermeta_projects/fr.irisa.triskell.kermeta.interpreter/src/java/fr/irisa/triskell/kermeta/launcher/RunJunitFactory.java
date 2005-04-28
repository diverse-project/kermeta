/* $Id: RunJunitFactory.java,v 1.1 2005-04-28 10:01:38 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RunJunit.java
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

import java.util.Iterator;

import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Run a kermeta program as a Junit test
 * It may return either a TestCase or a TestSuite
 *
 */
public class RunJunitFactory extends Run implements Test{

    private TestSuite theTestSuite = null;
    private TestCase theTestCase=null;
    
    /**
     * @param args
     */
    public RunJunitFactory(String[] args) {
        super(args);
		// Is there a "testOperation" tag?
        try{
            this.initializeInterpreter(args);               
			if (isTestOperation==true)
			{
			    theTestSuite= new TestSuite();
			    theTestSuite.setName(mainClassValue);
			    includeTestSuite(
			            mainClassValue,
			            builder,
			            args
			    );
			}
			else
			{
			    // Otherwise : let's add the single testcase
			    theTestCase = new RunTestCase(mainClassValue, mainOperationValue,mainArgsValue,  builder, args, this);
			}
        }
        catch (fr.irisa.triskell.kermeta.error.KermetaError e)
        {
            // we cannot determine if this is a test suite or a simple test
            // this test will fail since we haven't succeeded to load the files
            // construct a "fake" test that simply fails and return this exception
            theTestCase = new FailedTestCase(args[0],e);
            theTestSuite = null;
        }
    }

    /**
     * This special TestCase is there to keep a trace of the failure 
     * of preloading the kermeta program 
     *
     */
    public class FailedTestCase extends TestCase
    {
        public fr.irisa.triskell.kermeta.error.KermetaError cause;
        public FailedTestCase(String TestCaseName, fr.irisa.triskell.kermeta.error.KermetaError e)
        {
            super(TestCaseName);
            cause = e;
        }
        /* (non-Javadoc)
         * @see junit.framework.Test#runTest(junit.framework.TestResult)
         */
        protected void runTest()  {
            //arg0.addError(this, cause);
            throw cause;
        }
    }
    public void includeTestSuite(
	        String mainClassValue, 
	        KermetaUnit builder,
	        String[] args)
	{
	    
	    // all operations that begin by "test" inside the class
		// specified by mainClassValue are added as concrete testcases
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
	            theTestSuite.addTest(new RunTestCase(mainClassValue, mainOp.getFName(),mainArgsValue,  builder, args, this));
	        }   
	    }
	}

    /* (non-Javadoc)
     * @see junit.framework.Test#countTestCases()
     */
    public int countTestCases() {
        if( theTestSuite != null)
            return theTestSuite.countTestCases();
        if ( theTestCase != null)
            return theTestCase.countTestCases();
        // else        
        return 0;
    }

    public Test getTest() {
        if( theTestSuite != null)
            return theTestSuite;
        if ( theTestCase != null)
            return theTestCase;
        // else        
        return null;
    }
    
    /* (non-Javadoc)
     * @see junit.framework.Test#run(junit.framework.TestResult)
     */
    public void run(TestResult arg0) {
        if( theTestSuite != null)
            theTestSuite.run(arg0);
        if ( theTestCase != null)
            theTestCase.run(arg0);
        
    }
}
