

/*$Id: ReportRequireError.java,v 1.3 2008-05-28 09:25:14 ftanguy Exp $
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
		
		if ( kermetaUnit.isErroneous() ) {

			for ( KermetaUnit importer : kermetaUnit.getImporters() ) {
				KermetaUnitRequire r = findRequire(kermetaUnit, importer);
				if ( r != null ) {
					String message = "File " + kermetaUnit.getUri() + " contains errors.\n\n";
					message = message + KermetaUnitHelper.getErrorsAsString( kermetaUnit );
					kermetaUnit.error( message, r.getRequire() );
				}
			}
		}
		
		
/*		for ( KermetaUnitRequire require : kermetaUnit.getKermetaUnitRequires() ) {
			
			if ( require.getKermetaUnit().isErroneous() ) {
				String message = "File " + require.getKermetaUnit().getUri() + " contains errors.\n\n";
				message = message + KermetaUnitHelper.getErrorsAsString(require.getKermetaUnit() );
				kermetaUnit.error( message, require.getRequire() );
			}		
		}*/
				
	}
	
	private KermetaUnitRequire findRequire(KermetaUnit importedUnit, KermetaUnit importerUnit) {
		for ( KermetaUnitRequire r : importerUnit.getKermetaUnitRequires() ) {
			if ( r.getKermetaUnit() == importedUnit )
				return r;
		}
		return null;
	}
	
}


