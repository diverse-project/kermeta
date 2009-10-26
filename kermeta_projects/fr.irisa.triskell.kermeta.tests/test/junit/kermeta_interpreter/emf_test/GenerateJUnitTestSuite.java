/* $Id: GenerateJUnitTestSuite.java,v 1.1 2007-09-10 08:35:10 cfaucher Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 fevr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_interpreter.emf_test;



/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the emf_test/kermeta folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{

	public static void main(String[] args) {
		String[] newfolders = {"test/interpreter/emf_testcases/kermeta"} ;
		String[] newfiletypes = {"kmt", "emf"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "test/junit/kermeta_interpreter/emf_test/JunitTestSuite.java";
		genericmain(args);
	}	
}
