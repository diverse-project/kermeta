

/*$Id: LoadingStructurePass.java,v 1.3 2008-03-05 07:52:42 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	LoadingStructurePass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.ecore;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.loader.action.EcoreLoadingAction;
import org.kermeta.io.loader.datas.EcoreLoadingDatas;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMPass1;

public class LoadingStructurePass extends EcoreLoadingAction {

	public void performAction(EcoreLoadingDatas datas, Map<?, ?> options) {
		Resource resource = null;
		try {
			resource = datas.contents.get(0).eResource();
		} catch (NullPointerException e) {}
		Ecore2KMPass1 pass = new Ecore2KMPass1( datas.getKermetaUnit(), datas.ecore2kmDatas, true, resource, null );
		for ( EObject o : datas.contents ) {
			pass.accept(o);
		}
		
	}

}


