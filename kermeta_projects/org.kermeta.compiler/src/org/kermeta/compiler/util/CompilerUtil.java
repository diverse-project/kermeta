/* $Id: CompilerUtil.java,v 1.3 2007-10-19 16:34:13 cfaucher Exp $
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
import org.eclipse.emf.codegen.util.CodeGenUtil;

/**
 * Provide some useful methods to manage the Kermeta Compiler
 */
public class CompilerUtil {

	/**
	 * 
	 * Fix the prefix of all the EPackages contained by a GenModel
	 * @param genModel
	 */
	public static void ePackagePrefixFixer(GenModel genModel) {
		for (Iterator<GenPackage> it_genpack = genModel.getAllGenPackagesWithClassifiers().iterator(); it_genpack.hasNext();) {
			GenPackage _genPackage = it_genpack.next();
			_genPackage.setPrefix(CodeGenUtil.capName(_genPackage.getEcorePackage().getName()));
		}
	}
	
}
