/* $Id:$ 
 * Creation : 8 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.simple.assembly.services;

import java.util.Collection;
import java.util.List;

import org.kermeta.language.api.port.option.ServiceOption;
import org.kermeta.language.simple.assembly.services.art2.impl.Art2ComponentSimpleAssembly;
import org.kermeta.language.structure.ModelingUnit;

public class SimpleURIs2KmMerger {
	Art2ComponentSimpleAssembly art2Component;
	
	public SimpleURIs2KmMerger(
			Art2ComponentSimpleAssembly art2ComponentSimpleAssembly) {
		art2Component = art2ComponentSimpleAssembly;
	}

	public void mergeIntoURI(List<String> uRIs, String destURI,
			Collection<ServiceOption> options) {
		// TODO Auto-generated method stub
		
	}

	public ModelingUnit merge(List<String> uRIs,
			Collection<ServiceOption> options) {
		// TODO Auto-generated method stub
		return null;
	}

}
