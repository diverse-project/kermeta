

/*$Id: GenModelUtil.java,v 1.1 2008-07-23 08:49:15 ftanguy Exp $
* Project : org.kermeta.compiler
* File : 	GenModelUtil.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 juil. 2008
* Authors : paco
*/

package org.kermeta.compiler.ui.internal;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

public class GenModelUtil {

	static public GenPackage getGenPackage(GenModel genModel, String uri) {
		for ( GenPackage genPackage : genModel.getGenPackages() ) {
			GenPackage p = getGenpackage(genPackage, uri);
			if ( p != null )
				return p;
		}
		return null;
	}
	
	static private GenPackage getGenpackage(GenPackage genPackage, String uri) {
		if ( genPackage.getNSURI().equals(uri) )
			return genPackage;
		for ( GenPackage subPackage : genPackage.getSubGenPackages() ) {
			GenPackage p = getGenpackage(subPackage, uri);
			if ( p != null )
				return p;
		}
		return null;
	}
	
}


