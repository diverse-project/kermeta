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
import org.kermeta.utils.logger.stdout.art2.impl.Art2ComponentStdOutLogger;

public class Art2ComponentStdOutLoggerTestSuite  {

	@Test
	public void testInfoMessage(){
		Art2ComponentStdOutLogger logger = new Art2ComponentStdOutLogger();
		logger.start();
		logger.process(UnifiedMessageFactory.getInstance().createInfoMessage("TestInfo message", this.getClass().getName()));
		Assert.assertTrue(true);
	}
}
