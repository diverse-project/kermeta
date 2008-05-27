/* $Id: CompilerUtil.java,v 1.6 2008-05-27 13:29:29 cfaucher Exp $
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

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.kermeta.model.KermetaModelHelper;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * Provide some useful methods to manage the Kermeta Compiler
 */
public class CompilerUtil {
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

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
	
	
	/**
	 * Check if an EOperation is runnable via for the generation the main and
	 * class method
	 * 
	 * @param eop
	 * @return
	 */
	public static boolean isRunnable(EOperation eop) {
		boolean res = true;
		for (EParameter eparam : eop.getEParameters()) {
			if (eparam.getEType().getName().equals("String")) {
				res = true;
			} else {
				return false;
			}
		}
		return res;
	}
	
	
	/**
	 * 
	 * FIXME CF To factorize
	 * 
	 * @param annotedModelElement
	 * @param annotationName
	 * @param annotationDetailKey
	 * @param annotationDetailValue
	 * @param referedEObject
	 */
	public static void addAnnotation(EModelElement annotedModelElement,
			String annotationName, String annotationDetailKey,
			String annotationDetailValue, EObject referedEObject) {
		// find the Annotation or create a new one
		EAnnotation newEAnnotation = annotedModelElement
				.getEAnnotation(annotationName);
		if (newEAnnotation == null) {
			newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			newEAnnotation.setSource(annotationName);
			annotedModelElement.getEAnnotations().add(newEAnnotation);
		}
		// add the info in the Details map
		if (annotationDetailKey != null)
			newEAnnotation.getDetails().put(annotationDetailKey,
					annotationDetailValue);
		else {
			newEAnnotation.getDetails().put(KermetaModelHelper.Tag.KERMETA_DOCUMENTATION,
					annotationDetailValue);
		}
		// try a direct link additionnaly to the detail map.
		if (referedEObject != null) {
			internalLog.debug(" adding annotation reference for "
					+ annotationDetailKey + " = " + annotationDetailValue);
			newEAnnotation.getReferences().add(referedEObject);
		}
	}
}
