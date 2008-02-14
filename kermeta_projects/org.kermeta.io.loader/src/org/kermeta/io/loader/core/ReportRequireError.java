

/*$Id: ReportRequireError.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	RequireResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.core;

import java.util.Map;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.ILoadingAction;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class ReportRequireError implements ILoadingAction {

	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		
		KermetaUnit kermetaUnit = datas.getKermetaUnit();
		
		for ( KermetaUnitRequire require : kermetaUnit.getKermetaUnitRequires() ) {
			
			if ( require.getKermetaUnit().isErroneous() ) {
				String message = "File " + require.getKermetaUnit().getUri() + " contains errors.\n\n";
				message = message + KermetaUnitHelper.getErrorsAsString(require.getKermetaUnit() );
				kermetaUnit.error( message, require.getRequire() );
			}		
		}
				
	}
	
}


