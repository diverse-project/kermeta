/*$Id: $
* Project : org.kermeta.utils.logger.stdout
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.logger.standalone.tests;

import org.junit.Assert;
import org.junit.Test;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.utils.logger.stdout.SimpleSystemOutLogger;

public class SimpleSystemOutLoggerTestSuite  {

	@Test
	public void testInfoMessage(){
		SimpleSystemOutLogger logger = new SimpleSystemOutLogger();
		logger.log(UnifiedMessageFactory.getInstance().createInfoMessage("TestInfo message", this.getClass().getName()));
		Assert.assertTrue(true);
	}
	@Test
	public void testDebugMessage(){
		SimpleSystemOutLogger logger = new SimpleSystemOutLogger();
		logger.log(UnifiedMessageFactory.getInstance().createDebugMessage("TestDebug message", this.getClass().getName()));
		Assert.assertTrue(true);
	}
}
