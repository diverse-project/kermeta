/* $Id: GenerateJUnitTestSuite.java,v 1.1 2007-09-10 08:35:15 cfaucher Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 f�vr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_interpreter.test;


/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the test folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{
	
	public static void main(String[] args) {
		String[] newfolders = {"test/interpreter/kmt_testcases"} ;
		String[] newfiletypes = {"kmt", "emf"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "test/junit/kermeta_interpreter/test/JunitTestSuite.java";
		genericmain(args);
	}
}
