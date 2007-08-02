

/*$Id: PackageHelper.java,v 1.3 2007-08-02 15:06:15 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.io2
* File : 	PackageHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 1 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * this class proposes various helper functions that applies to Package in the Kermeta model
 *
 */
public class PackageHelper {

	/**
	 * Never used for the moment
	 * @param p
	 * @param qualifiedName
	 * @return
	 */
	static public TypeDefinition getTypeDefinition(Package p, String qualifiedName) {
		
		for(TypeDefinition typeDefinition : p.getOwnedTypeDefinition()) {
			if ( typeDefinition.getName().equals( qualifiedName ) )
				return typeDefinition;
		}
		
		return null;
	}
	
}


