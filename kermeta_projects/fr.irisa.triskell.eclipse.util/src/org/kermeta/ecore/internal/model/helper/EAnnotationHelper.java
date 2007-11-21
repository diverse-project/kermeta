

/*$Id: EAnnotationHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EAnnotationHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.internal.model.helper;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;

public class EAnnotationHelper {

	/**
	 * 
	 * Creates an annotation with the given source.
	 * 
	 * @param source The source of the annotation.
	 * @return an instance of EAnnotation
	 */
	static public EAnnotation create(String source) {
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource( source );
		return annotation;
	}

	/**
	 * 
	 * Add details to the given annotation. If the annotation is null, nothing is done.
	 * No check is done if a key already existed. Then it will be overwritten.
	 * 
	 * @param annotation The annotation to add details to.
	 * @param key The key to be associated with the value.
	 * @param value The value associated to the key.
	 */
	static public void addDetails(EAnnotation annotation, String key, String value) {
		if ( annotation != null )
			if ( key != null )
				annotation.getDetails().put(key, value);
	}
}


