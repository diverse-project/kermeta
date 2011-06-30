/* $Id: $
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 jab. 2011
 * Authors : 
 *            Arnaud Blouin
 */
package org.kermeta.language.loader.ecore.api;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public interface EcoreLoader {
	/**
	 * Loads an Ecore model.
	 * @param uriEcoreModel The path of the model to load.
	 * @return The loaded model.
	 */
	List<EPackage> load(final String uriEcoreModel);
}