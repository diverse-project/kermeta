

/*$Id: Load.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	Load.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.km;

import java.util.Map;

import org.kermeta.io.loader.action.KMLoadingAction;
import org.kermeta.io.loader.datas.KMLoadingDatas;

import fr.irisa.triskell.kermeta.loader.km.KMUnitLoader;

public class Load extends KMLoadingAction {

	public void performAction(KMLoadingDatas datas, Map<?, ?> options) {

		KMUnitLoader l = new KMUnitLoader( (Map<Object, Object>) options, null);
		l.load( datas.getKermetaUnit().getUri() );
		
	}

}


