

/*$Id: CompilerTestSuite.java,v 1.1 2008-01-31 09:06:24 ftanguy Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompilerTestSuite.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.kermeta.compiler.tests.structure.CompilerStructureTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CompilerStructureTestSuite.class
})
public class CompilerTestSuite {

}


