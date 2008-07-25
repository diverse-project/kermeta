/* $Id: GenerateJUnitTestSuite.java,v 1.1 2008-07-25 12:38:04 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.ocl.tests.ocl2kmt;



/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the emf_test/kermeta folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{

	public static void main(String[] args) {
		String[] newfolders = {"kermeta/tests/ocl2kmt"} ;
		String[] newfiletypes = {"kmt"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "src/fr/irisa/triskell/kermeta/ocl/tests/ocl2kmt/OCL2KermetaTestSuite.java";
		genericmain(args);
	}	
}
