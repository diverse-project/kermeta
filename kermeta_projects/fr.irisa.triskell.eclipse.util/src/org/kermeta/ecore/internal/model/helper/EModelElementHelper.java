

/*$Id: EModelElementHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EModelElementHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.internal.model.helper;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

public class EModelElementHelper {

	/**
	 * 
	 * @param element
	 * @param source
	 * @return
	 */
	static public EAnnotation getEAnnotation(EModelElement element, String source) {
		return getEAnnotation(element, source, false);
	}
	
	/**
	 * 
	 * @param element
	 * @param source
	 * @param create
	 * @return
	 */
	static public EAnnotation getEAnnotation(EModelElement element, String source, boolean create) {
		EAnnotation annotation = element.getEAnnotation(source);
		if ( (annotation == null) && create ) {
			annotation = EAnnotationHelper.create(source);
			element.getEAnnotations().add( annotation );
		}
		return annotation;
	}
	
}


