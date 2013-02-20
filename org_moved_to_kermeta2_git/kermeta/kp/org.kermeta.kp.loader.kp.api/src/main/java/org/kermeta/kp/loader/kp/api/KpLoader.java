/* $Id: $
 * Project    : org.kermeta.kp.loader.kp
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 22 févr. 2011
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.kp.loader.kp.api;

import org.eclipse.emf.common.util.URI;
import org.kermeta.kp.KermetaProject;

public interface KpLoader {

	/**
	 * @param uriKpResource
	 */
	public KermetaProject loadKp(String uriKpResource);
	
	public KermetaProject loadKp(URI uriKpResource);
	
}
