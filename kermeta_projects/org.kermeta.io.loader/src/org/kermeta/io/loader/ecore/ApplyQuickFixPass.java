

/*$Id: ApplyQuickFixPass.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
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
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMPass6;

public class ApplyQuickFixPass extends EcoreLoadingAction {

	public void performAction(EcoreLoadingDatas datas, Map<?, ?> options) {
		boolean mustApply = false;
		if ( options != null && options.get( LoadingOptions.ECORE_QuickFixEnabled ) != null )
			mustApply = (Boolean) options.get( LoadingOptions.ECORE_QuickFixEnabled );
		
		if ( mustApply ) {
			Ecore2KMPass6 pass = new Ecore2KMPass6( datas.getKermetaUnit(), datas.ecore2kmDatas, true, datas.opTable, null );
			for ( EObject o : datas.contents ) {
				pass.accept(o);
			}
		}
	}

}


