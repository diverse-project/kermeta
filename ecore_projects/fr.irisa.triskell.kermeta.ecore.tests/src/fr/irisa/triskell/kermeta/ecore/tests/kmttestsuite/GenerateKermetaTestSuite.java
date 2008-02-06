/* $Id: GenerateKermetaTestSuite.java,v 1.1 2008-02-06 10:00:59 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 févr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package fr.irisa.triskell.kermeta.ecore.tests.kmttestsuite;



/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the emf_test/kermeta folder.
 * @author Franck Fleurey
 */
public class GenerateKermetaTestSuite extends kermeta_interpreter.jutils.GenerateJUnitTestSuite{

	public static void main(String[] args) {
		String[] newfolders = {"test/kmt_testcases"} ;
		String[] newfiletypes = {"kmt"};
		folders = newfolders;
		filetypes = newfiletypes;
		junitfile = "src/fr/irisa/triskell/kermeta/ecore/tests/kmttestsuite/KermetaTestSuite.java";
		genericmain(args);
	}	
}
