

/*$Id: LoadBodiesAndSetOppositesPass.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	SetTypesPass.java
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

import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMPass3;

public class LoadBodiesAndSetOppositesPass extends EcoreLoadingAction {

	public void performAction(EcoreLoadingDatas datas, Map<?, ?> options) {
		Ecore2KMPass3 pass = new Ecore2KMPass3( datas.getKermetaUnit(), datas.ecore2kmDatas, true, null );
		for ( EObject o : datas.contents ) {
			pass.accept(o);
		}
	}

}


