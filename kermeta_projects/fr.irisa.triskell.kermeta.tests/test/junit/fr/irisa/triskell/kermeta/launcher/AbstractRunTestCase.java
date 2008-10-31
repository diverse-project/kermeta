/* $Id: AbstractRunTestCase.java,v 1.1 2008-10-31 13:57:06 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.test
 * File       : AbstractRunTestCase.java
 * License    : EPL
 * Copyright  : IRISA / INRIA
 * -------------------------------------------------------------------
 * Creation date : 27 Oct. 2008
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr> 
 */
package fr.irisa.triskell.kermeta.launcher;


import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * Launcher for Kermeta interpreter. It can be run from the command line or as a
 * test case for JUnit.
 */
public abstract class AbstractRunTestCase extends TestCase {

    /** Logger to get the error of this launcher */
    final static public Log internalLog = LogConfigurationHelper.getLogger("KMT.launcher");

    protected String mainClassValue;
    protected String mainOperationValue;

    protected AbstractRunJunitFactory containerTestSuite;
    
   // protected Interpreter interpreter = null;

    protected boolean constraintExecution = false;
    
    protected boolean isFirstOfSerie =  true;
    protected boolean isLastOfSerie =  false;
    
    /**
     * 
     * @param themainClassValue
     * @param themainOperationValue
     * @param thecontainerTestSuite 
     * @param constraintExecution true if the interpreter much run with pre/post checking
     * @param isLastOfSerie true if this is the last of the test suite
     */
    public AbstractRunTestCase(String themainClassValue, 
    		String themainOperationValue, AbstractRunJunitFactory thecontainerTestSuite, 
    		boolean constraintExecution, boolean isFirstOfSerie, boolean isLastOfSerie)
    {
        super(themainClassValue + "." + themainOperationValue);
        mainClassValue = themainClassValue;
        mainOperationValue = themainOperationValue;
        containerTestSuite = thecontainerTestSuite;
        this.constraintExecution = constraintExecution;
        this.isLastOfSerie = isLastOfSerie;
        this.isFirstOfSerie = isFirstOfSerie;
    }

    

}