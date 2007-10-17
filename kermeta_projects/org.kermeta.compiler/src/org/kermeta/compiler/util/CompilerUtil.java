/* $Id: CompilerUtil.java,v 1.1 2007-10-17 08:56:19 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompilerUtil.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 28, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.util;

import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

/**
 * Provide some useful methods to manage the Kermeta Compiler
 */
public class CompilerUtil {

	public static void ePackagePrefixFixer(GenModel genModel) {
		for (Iterator<GenPackage> it_genpack = genModel.getAllGenPackagesWithClassifiers().iterator(); it_genpack.hasNext();) {
			GenPackage _genPackage = it_genpack.next();
			_genPackage.setPrefix(upperCaseFirstLetter(_genPackage.getEcorePackage().getName()));
		}
	}
	
	public static String upperCaseFirstLetter(String str) {
		try {
		return str.substring(0, 1).toUpperCase().concat(str.substring(1));
		} catch (Exception e) {
			System.out.println();
		}
		return null;
	}
}
