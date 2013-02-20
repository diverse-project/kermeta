/* $Id: $
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 jab. 2011
 * Authors : 
 *            Arnaud Blouin
 */
package org.kermeta.language.loader.km.api;

import org.kermeta.language.structure.ModelingUnit;

public interface KmLoader {
	/**
	 * Loads an Kermeta model.
	 * @param uriKmModel The path of the model to load.
	 * @return The loaded model.
	 */
	ModelingUnit load(final String uriKmModel);
}
