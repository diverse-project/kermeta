

/*$Id: SetTypesPass.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
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

import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMPass2;

public class SetTypesPass extends EcoreLoadingAction {

	public void performAction(EcoreLoadingDatas datas, Map<?, ?> options) {
		/*
		 * 
		 * Applying the pass.
		 * 
		 */
		Ecore2KMPass2 pass = new Ecore2KMPass2( datas.getKermetaUnit(), datas.ecore2kmDatas, true, null );
		for ( EObject o : datas.contents ) {
			pass.accept(o);
		}
		/*
		 * 
		 * Getting the operations processed because it can be usefull for the quick fix pass later on.
		 * 
		 */
		datas.opTable = pass.getOpTable();
	}

}


