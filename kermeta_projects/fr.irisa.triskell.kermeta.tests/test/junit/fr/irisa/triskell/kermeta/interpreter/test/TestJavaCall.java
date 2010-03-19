/* $Id: TestJavaCall.java,v 1.3 2008-05-28 13:38:04 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : TestJavaCall.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 18 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *   see : fr.irisa.triskell.kermeta.interpreter/test/kmt_testcases/014_testExternJavaCall.main.kmt  
 */
package fr.irisa.triskell.kermeta.interpreter.test;

import junit.framework.TestCase;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the java part for an extern JavaCall from Kermeta.
 * Related test : fr.irisa.triskell.kermeta.interpreter/test/kmt_testcases/014_testExternJavaCall.main.kmt
 *   important note:
 *		In this test suite, some of the java call change the original value or the passed parameter.
 *		On integer, and String this still work but according to their type (primitive),
 *		this is normally impossible in kermeta. (see test suit 052) 
 *		But here, as we change the literal itself this works (however I'm not sure there isn't any side effect ...).
 *		On Boolean, even that hack cannot work, because boolean values are singleton
 * 
 * @author dvojtise
 */
public class TestJavaCall extends TestCase{
    
    final static public Logger internalLog = LoggerFactory.getLogger("test.JavaCall");
	
    static private int callCounter = 0;
    static private int lastCallCounter = 0;
    
    // FIXME : should not be static!
    public static RuntimeObjectFactory roFactory;
    
    public TestJavaCall(RuntimeObjectFactory pFactory)
    {
        roFactory = pFactory;
    }
    
    public static void initialize(RuntimeObject param0){
    	roFactory = param0.getFactory();
    }
    
    /**  Implementation of method simple called as : <br>
	 * extern fr::irisa::triskell::kermeta::interpreter::test::TestJavaCall.simpleCall();
	 */
    public static void simpleCall() {
        internalLog.info("simpleCall was called");
        callCounter++;
	}
    
    // it cal bee called without parameter if the roFactory was initialized first
    public static RuntimeObject callBooleanReturn() {
        internalLog.info("callBooleanReturn was called");

        callCounter++;
        return roFactory.getMemory().getRuntimeObjectForBoolean(true);
        //return fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(true,roFactory);
	}
	
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
    
    /** 
     * 
     * @param intparam1 will be incremented by 1
     * @param intparam2 will be incremented by 1
     * @param intparam3 will be incremented by 1
     * @param stringparam1 will be appended with "1"
     * @param stringparam2 will be appended with "1"
     * @param boolparam1 must be true in all case
     * @return
     */
    public static RuntimeObject call3Integers2Strings1BooleanParams(
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
      
        // As Boolean values are singleton in the system, we cannot hack a change of the value
        // so we test only one thing : that we correctly receive true
        // all the following commented code doesn't work
        //fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.setValue(boolparam1, true);
        //boolparam1 = roFactory.getMemory().getRuntimeObjectForBoolean(true);
        //fr.irisa.triskell.kermeta.runtime.language.Object.set(ro_target,ro_property,rhs_value);
        assert(fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(boolparam1));
        
        callCounter++;
        return roFactory.getMemory().getRuntimeObjectForBoolean(true);
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
        internalLog.info("callOneCollectionParam was called");
	}
    public static void callOneSetParam() {
        internalLog.info("callOneSetParam was called");
	}
    
    public static void callTwoParams() {
        internalLog.info("callTwoParams was called");
	}
    
    public static void callOneParamAndReturn() {
        internalLog.info("callOneParamAndReturn was called");
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
