/* $Id: CompilerUtil.java,v 1.10 2009-02-04 00:21:06 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompilerUtil.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 28, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.util;

import org.apache.commons.logging.Log;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * Provide some useful methods to manage the Kermeta Compiler
 */
public class CompilerUtil {
	
	final static public Log internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Fixer on the genModel
	 * @param genModel
	 */
	public static void ePackageFixerAll(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			prefixFixer(_genPackage);
			
			// Uncomment the following if you wish not support the initialize by loading for large ecore files
			//loadInitializationFixer(_genPackage);
			
			multipleEditorPagesFixer(_genPackage);
		}
	}
	
	/**
	 * 
	 * Fix the prefix of all the EPackages contained by a GenModel
	 * @param genModel
	 */
	public static void ePackagePrefixFixer(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			prefixFixer(_genPackage);
		}
	}
	
	/**
	 * To avoid the use of 'Initialization By Loading' on all the genPackages
	 * @param genModel
	 */
	public static void ePackageLoadInitializationFixer(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			loadInitializationFixer(_genPackage);
		}
	}
	
	/**
	 * Fixing the Prefix on a genPackage
	 * @param genPackage
	 */
	private static void prefixFixer(GenPackage genPackage) {
		genPackage.setPrefix(CodeGenUtil.capName(genPackage.getEcorePackage().getName()));
	}
	
	/**
	 * To avoid the use of 'Initialization By Loading' on a genPackage
	 * @param genPackage
	 */
	private static void loadInitializationFixer(GenPackage genPackage) {
		genPackage.setLoadInitialization(false);
	}
	
	/**
	 * To avoid the generation of 'Multiple Editor Pages' on a genPackage
	 * @param genPackage
	 */
	private static void multipleEditorPagesFixer(GenPackage genPackage) {
		genPackage.setMultipleEditorPages(false);
	}
	
}
