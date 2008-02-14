

/*$Id: ImportKermetaUnitPass.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	ImportKermetaUnitPass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.core;

import java.util.Map;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.ILoadingAction;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class ImportKermetaUnitPass implements ILoadingAction {

	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		KermetaUnit kermetaUnit = datas.getKermetaUnit();
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) ) {
			/*
			 * 
			 * Import the unit
			 * 
			 */
			kermetaUnit.importKermetaUnit(unitToImport, true, true);
			/*
			 * 
			 * Activate the external search
			 * 
			 */
			kermetaUnit.getTypeDefinitionCache().setExternalSearchAuthorized(true);
		}
	}
	
}


