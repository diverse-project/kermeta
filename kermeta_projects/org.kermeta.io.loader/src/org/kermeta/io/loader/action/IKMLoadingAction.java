

/*$Id: IKMLoadingAction.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	IKMTLoadingAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.action;

import java.util.Map;

import org.kermeta.io.loader.datas.KMLoadingDatas;


public interface IKMLoadingAction {

	public void performAction(KMLoadingDatas datas, Map<?, ?> options);
	
}


