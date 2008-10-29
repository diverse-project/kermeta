
/*$Id: KmReflectionHelper.java,v 1.3 2008-10-29 08:29:25 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	KmReflectionHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : 
* 			Francois TANGUY	<ftanguy@irisa.fr>
* 			Cyril FAUCHER	<cfaucher@irisa.fr>
*/


package org.kermeta.compil.runtime.helper.persistence;

import kermeta.persistence.Resource;

/**
 * @generated
 */
public class KmReflectionHelper {
	
	/**
	 * @generated
	 * @param self
	 */
	public static void load(Resource self) {
		self.clear();
		org.kermeta.compil.runtime.helper.persistence.Loader.load(self.getValues(), self.getUri(), self.getMetaModelURI());
	}
}
