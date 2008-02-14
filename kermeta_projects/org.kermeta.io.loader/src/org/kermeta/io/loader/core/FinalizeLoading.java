

/*$Id: FinalizeLoading.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	FinalizeLoading.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.core;

import java.util.Map;

import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.ILoadingAction;

import fr.irisa.triskell.kermeta.loader.kmt.AbstractBuildingState;

public class FinalizeLoading implements ILoadingAction {

	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		AbstractBuildingState state = (AbstractBuildingState) datas.getKermetaUnit().getBuildingState();
		state.loaded = true;
	}

}


