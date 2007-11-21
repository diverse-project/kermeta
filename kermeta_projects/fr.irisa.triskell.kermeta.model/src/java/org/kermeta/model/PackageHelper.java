

/*$Id: PackageHelper.java,v 1.1 2007-11-21 13:14:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	PackageHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.model;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class PackageHelper extends NamedElementHelper {

	static public Package create(String name) {
		return create(name, null);
	}
	
	static public Package create(String name, String uri) {
		Package p = StructureFactory.eINSTANCE.createPackage();
		p.setName( name );
		if ( uri != null )
			p.setUri( uri );
		return p;
	}
	
}


