

/*$Id: EPackageHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EPackageHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.internal.model.helper;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

public class EPackageHelper {

	static public EPackage create(String name) {
		return create(name, null, null);
	}
	
	static public EPackage create(String name, String nsURI, String nsPrefix) {
		EPackage p = EcoreFactory.eINSTANCE.createEPackage();
		p.setName( name );
		if ( nsURI != null )
			p.setNsURI( nsURI );
		if ( nsPrefix != null )
			p.setNsPrefix( nsPrefix );
		return p;
	}
}


