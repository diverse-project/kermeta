/* $Id: TestJavaCall.java,v 1.7 2005-05-25 17:42:54 ffleurey Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : TestJavaCall.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 18 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        see javadoc  
 */
package fr.irisa.triskell.kermeta.interpreter.test;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Implementation of the java prt for a JavaCall from Kermeta
 * @author dvojtise
 *
 */
public class TestJavaCall extends TestCase{
    
    final static public Logger internalLog = LogConfigurationHelper.getLogger("test.JavaCall");
	
    static private int callCounter = 0;
    static private int lastCallCounter = 0;
    
    // FIXME : should not be static!
    public static RuntimeObjectFactory roFactory;
    
    public TestJavaCall(RuntimeObjectFactory pFactory)
    {
        roFactory = pFactory;
    }
    
    /**  Implementation of method simple called as : <br>
	 * extern fr::irisa::triskell::kermeta::interpreter::test::TestJavaCall.simpleCall();
	 */
    public static void simpleCall() {
        internalLog.info("simpleCall was called");
        callCounter++;
	}
    /*
    public static RuntimeObject callBooleanReturn() {
        internalLog.info("callBooleanReturn was called");

        callCounter++;
        return fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(true,roFactory);
	}
	*/
    public static RuntimeObject callIntegerReturn() {
        internalLog.info("callIntegerReturn was called");
        //  Long way
        // RuntimeObject result = roFactory.createObjectFromClassName("kermeta::standard::Integer");
        // fr.irisa.triskell.kermeta.runtime.basetypes.Integer.setValue(result, 777);
        // return result;
        
        // short way
        callCounter++;
        return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(777,roFactory);
	}

    public static RuntimeObject callStringReturn() {
        internalLog.info("callStringReturn was called");
        callCounter++;
        return fr.irisa.triskell.kermeta.runtime.basetypes.String.create("Hello world",roFactory);
	}

    public static RuntimeObject callOneIntegerParam(RuntimeObject param0) {
        internalLog.info("callOneIntegerParam was called");
        Integer.setValue(param0, Integer.getValue(param0)+1);
        callCounter++;
        return param0;
	}
    
    public static RuntimeObject call2IntegersParams(
            RuntimeObject intparam1,
            RuntimeObject intparam2)
    {
        Integer.setValue(intparam1, Integer.getValue(intparam1)+1);
        Integer.setValue(intparam2, Integer.getValue(intparam2)+1);

        callCounter++;
        return intparam1;
    }

    public static RuntimeObject call3IntegersParams(
            RuntimeObject intparam1,
            RuntimeObject intparam2,
            RuntimeObject intparam3)
    {
        Integer.setValue(intparam1, Integer.getValue(intparam1)+1);
        Integer.setValue(intparam2, Integer.getValue(intparam2)+1);
        Integer.setValue(intparam3, Integer.getValue(intparam3)+1);

        callCounter++;
        return intparam1;
    }
    
    public static RuntimeObject call3Integers2Strings1BooleanParams(
            RuntimeObject self,
            RuntimeObject intparam1,
            RuntimeObject intparam2,
            RuntimeObject intparam3,
            RuntimeObject stringparam1,
            RuntimeObject stringparam2,
            RuntimeObject boolparam1)
    {
        
        Integer.setValue(intparam1, Integer.getValue(intparam1)+1);
        Integer.setValue(intparam2, Integer.getValue(intparam2)+1);
        Integer.setValue(intparam3, Integer.getValue(intparam3)+1);
     
        String.setValue(stringparam1, String.getValue(stringparam1).concat("1"));
        String.setValue(stringparam2, String.getValue(stringparam2).concat("1"));
      
        //Boolean.setValue(boolparam1, true);
        callCounter++;
        return boolparam1;
    }
    
    public static RuntimeObject callCollectionReturn() {
        internalLog.info("simpleCallReturn was called");
        callCounter++;
        return null; // shoud be Void
	}
    
    public static RuntimeObject callSetReturn() {
        internalLog.info("simpleCallReturn was called");
        return null; // shoud be Void
	}

    
    public static void callOneCollectionParam() {
        internalLog.info("simpleCall was called");
	}
    public static void callOneSetParam() {
        internalLog.info("simpleCall was called");
	}
    
    public static void callTwoParams() {
        internalLog.info("simpleCall was called");
	}
    
    public static void callOneParamAndReturn() {
        internalLog.info("simpleCall was called");
	}
    
    
    /**  Implementation of method assertMethodWasCalled called as : <br>
	 * extern fr::irisa::triskell::kermeta::interpreter::test::TestJavaCall.simpleCall();
	 * It raises an assertion if the CallCounter was not incremented since previous call
	 */
	public static void assertMethodWasCalled() {
		assertTrue("Method was not called (callCounter="+callCounter+"; lastcallCounter="+lastCallCounter+")", callCounter > lastCallCounter);
		lastCallCounter = callCounter;
	}
}
