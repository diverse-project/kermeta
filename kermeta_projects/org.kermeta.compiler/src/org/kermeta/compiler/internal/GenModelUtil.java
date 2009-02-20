

/*$Id: GenModelUtil.java,v 1.3 2009-02-20 13:27:46 dvojtise Exp $
* Project : org.kermeta.compiler
* File : 	GenModelUtil.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 juil. 2008
* Authors : paco
*/

package org.kermeta.compiler.internal;

import org.apache.commons.logging.Log;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.kermeta.log4j.util.LogConfigurationHelper;

public class GenModelUtil {
	
	final static public Log internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	static public GenPackage getGenPackage(GenModel genModel, String uri) {
		for ( GenPackage genPackage : genModel.getGenPackages() ) {
			GenPackage p = getGenpackage(genPackage, uri);
			if ( p != null )
				return p;
		}
		return null;
	}
	
	static private GenPackage getGenpackage(GenPackage genPackage, String uri) {
		if ( genPackage.getNSURI().equals(uri) )
			return genPackage;
		for ( GenPackage subPackage : genPackage.getSubGenPackages() ) {
			GenPackage p = getGenpackage(subPackage, uri);
			if ( p != null )
				return p;
		}
		return null;
	}
	
	
	/**
	 * Fixer on the genModel
	 * @param genModel
	 */
	public static void ePackageFixerAll(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			prefixFixer(_genPackage);
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
	 * To avoid the use of 'Initialization of the EMF reflection by an Ecore file loading instead of generated Java code' on a genPackage
	 * Example: for UML metamodel, the Initialization by loading must be true to avoid too large generated body in methods
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


