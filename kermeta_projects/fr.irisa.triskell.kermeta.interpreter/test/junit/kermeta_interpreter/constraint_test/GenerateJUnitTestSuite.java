/* $Id: GenerateJUnitTestSuite.java,v 1.3 2007-07-31 12:29:51 dvojtise Exp $
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
package kermeta_interpreter.constraint_test;



/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the emf_test/kermeta folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{

	public static void main(String[] args) {
		String[] newfolders = {"test/constraint_testcases"} ;
		String[] newfiletypes = {"kmt"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "test/junit/kermeta_interpreter/constraint_testcases/JunitTestSuite.java";
		genericmain(args);
	}	
}
