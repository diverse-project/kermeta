

/*$Id: PackageHelper.java,v 1.2 2007-07-20 15:08:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io2
* File : 	PackageHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 1 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class PackageHelper {

	static public TypeDefinition getTypeDefinition(Package p, String qualifiedName) {
		
		Iterator <TypeDefinition> iterator = p.getOwnedTypeDefinition().iterator();
		while ( iterator.hasNext() ) {
			TypeDefinition typeDefinition = iterator.next();
			if ( typeDefinition.getName().equals( qualifiedName ) )
				return typeDefinition;
		}
		
		return null;
	}
	
}


