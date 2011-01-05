/* $Id: $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 déc. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 *            Arnaud Blouin
 */

package org.kermeta.language.api.port;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.structure.ModelingUnit;

public interface PortEcore2Km {
	/**
	 * Converts the given ecore package into a kermeta modeling unit.
	 * @param rootPackage The package to convert.
	 * @param namespacePrefix The namespace prefix to set to the generated modeling unit.
	 * @return The created modeling unit.
	 */
	public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix);
}
