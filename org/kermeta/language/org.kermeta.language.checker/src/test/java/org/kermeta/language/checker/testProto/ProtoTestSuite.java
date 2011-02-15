/* $Id: $
 * Project    : org.kermeta.language.checker
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 sept. 2010
 * Authors : 
 *            username <usermail@inria.fr>
 */

package org.kermeta.language.checker.testProto;

import junit.framework.Test;
import junit.framework.TestSuite;
// Some port test class in org.kermeta.language.api.tests.port
//import org.kermeta.language.api.tests.port.SomePortTestSuite;

//the art2 component created in the project
import org.kermeta.language.checker.art2.impl.Art2ComponentProto;

/**
 * The class in charge of junit test suites
 * Tests are performed from org.kermeta.language.api.tests bundle
 * In the package org.kermeta.language.api.tests.port, users should define test methods 
 * (e.g.: in SomePortTest.java and SomePortTestSuite.java)  
 * @author username
 *
 */
public class ProtoTestSuite extends TestSuite  {
	
	/**
	 * The test that should be performed
	 * @return junit Test
	 */
    public static Test suite() {
    	//Use case example
    	//SomePortTestSuite.loaderClass = Art2ComponentProto.class;
        //return SomePortTestSuite.suite();
    	
    	/*Stub to be deleted*/
    	TestSuite suite = new TestSuite("ProtoTestSuite");
    	return suite;
    }


}
