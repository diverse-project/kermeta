/* $Id: $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 déc. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.language.api.port;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.structure.ModelingUnit;

public interface PortEcore2Km {

	
	public ModelingUnit convertPackage(EPackage rootPackage );
	
	public ModelingUnit convertPackageCollection(List<EPackage> collectionOfPackage );
	
	public ModelingUnit convertFromUri(String file_uri );
}
