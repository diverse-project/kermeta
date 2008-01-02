/* $Id: GenerateJUnitTestSuite.java,v 1.2 2008-01-02 10:28:14 vmahe Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 f�vr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_interpreter.jar_test;



/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the emf_test/kermeta folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{

	public static void main(String[] args) {
		String[] newfolders = {"test/interpreter/jar_testcases/kermeta"} ;
		String[] newfiletypes = {"kmt", "emf"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "test/junit/kermeta_interpreter/jar_test/JunitTestSuite.java";
		genericmain(args);
	}	
}
