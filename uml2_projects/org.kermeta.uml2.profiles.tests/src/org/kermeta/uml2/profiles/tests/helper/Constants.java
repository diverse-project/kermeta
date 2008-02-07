

/*$Id: Constants.java,v 1.1 2008-02-07 09:09:00 dvojtise Exp $
* Project : org.kermeta.compiler.tests
* File : 	Constants.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.uml2.profiles.tests.helper;

import org.kermeta.uml2.profiles.tests.Activator;

public class Constants {

	final static public String SOURCE_PATH = Activator.PLUGIN_TESTS_PATH + "unit_test/";
	
	final static public String BIN_PATH = Activator.PLUGIN_TESTS_PATH + ".bin";
	
	final static public String TEST_COMP_PROFILE2ECORE_LAUNCHER = "platform:/plugin/org.kermeta.uml2.profiles.model/src/kmt/UMLProfile2Ecore/UMLProfile2Ecore.kmt";
	
	public static final String INPUT_FOLDER = "input";
	
	public static final String OUTPUT_FOLDER = "output";
	
	public static final String EXPECTED_OUTPUT_FOLDER = "expected_output";
	
	public static final String KMT_EXT = "kmt";

	public static final String STATUS_KERMETA = "Kermeta";
	
	public static final String STATUS_JAVA = "Java";
	
	public static final String STATUS_DESIGN = "Design";
	
	public static final String STATUS_JET = "Jet";
	
	public static final String STATUS_KET = "Ket";
	
	public static final String STATUS_SIMK = "Simk";
	
	public static final String IMPL_PREFIX = "Impl_";
	
	public static final String SUMMARY_PREFIX = "summary_";
	
	public static final String PROGRESS_PREFIX = "progress_";
	
	public static final String REFINES_UC_PREFIX = "refines_uc_";

	public static final String VERIFIES_UC_PREFIX = "verifies_uc_";
	
	public static final int PROGRESS_OK = 100;
	
	public static final int PROGRESS_NOK = 0;
	
}


