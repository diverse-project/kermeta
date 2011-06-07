/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.ecore2km.api;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.structure.ModelingUnit;

public interface Ecore2KM {
	
	/**
	 * Converts the given ecore package into a kermeta modeling unit.
	 * @param rootPackage The package to convert.
	 * @param namespacePrefix The namespace prefix to set to the generated modeling unit.
	 * @return The created modeling unit.
	 */
	public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix);

}
