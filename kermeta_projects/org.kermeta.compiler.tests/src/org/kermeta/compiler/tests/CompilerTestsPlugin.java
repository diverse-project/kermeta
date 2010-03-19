/*$Id: CompilerTestsPlugin.java,v 1.3 2008-11-05 16:26:15 dvojtise Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompilerTestsPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.tests;

import org.eclipse.core.runtime.Plugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompilerTestsPlugin extends Plugin {

	public static final String PLUGIN_TESTS_PATH = "platform:/plugin/org.kermeta.compiler.tests/";
	
	public static final String PLUGIN_ID = "org.kermeta.compiler.tests";
	
	/** Logger to get the error of this interpreter */
	final static public Logger internalLog = LoggerFactory.getLogger("compiler.tests");

	public CompilerTestsPlugin() {
		// TODO Auto-generated constructor stub
	}

}
