/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 12 aout 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.merger.binarymerger.tests.util;

import junit.framework.TestCase;

public class FailedTest extends TestCase{
	String baseName;
	String errorMessage;
	
	
	
	public FailedTest(String baseName, String errorMessage) {
		super();
		this.baseName = baseName;
		this.errorMessage = errorMessage;
	}

	@Override
    public String getName() {
        return baseName;
    }

    @Override
    public void runTest() throws Throwable  {
        fail("Incorrect test case. "+errorMessage);


    }

    @Override
    protected void tearDown() throws Exception {
        

    }
}