/* $Id: GenerateJUnitTestSuite.java,v 1.1 2007-12-14 13:16:18 vmahe Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 févr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package org.kermeta.uml2.umlaut.tests;


/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the test folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{
	
	public static void main(String[] args) {
		String[] newfolders = {"test/kmt_testcases"} ;
		String[] newfiletypes = {"kmt"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "src/org/kermeta/uml2/umlaut/tests/loading/LoadingTestSuite.java";
		genericmain(args);
	}
}
