

/*$Id: KpmTests.java,v 1.4 2008-06-03 07:44:01 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	KpmTests.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
	@Suite.SuiteClasses({
		/*ResourceCreationTest.class,
		ResourceDeletionTest.class,
		ResourceMoveTest.class,
		EventDispatcherTest.class,
		DependencyTest.class,
		TypeFilterTest.class,*/
		SpecialResourceHandlingTest.class
	})
public class KpmTests {

	
}


