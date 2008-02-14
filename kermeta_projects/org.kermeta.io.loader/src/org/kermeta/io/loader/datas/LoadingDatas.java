

/*$Id: LoadingDatas.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	LoadingDatas.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.datas;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.loader.LoadingContext;

public abstract class LoadingDatas extends EObjectImpl implements ILoadingDatas {

	public LoadingContext context = new LoadingContext();
	
	private KermetaUnit kermetaUnit;
	
	public KermetaUnit getKermetaUnit() {
		return kermetaUnit;
	}

	public void setKermetaUnit(KermetaUnit value) {
		kermetaUnit = value;
	}
	
}


