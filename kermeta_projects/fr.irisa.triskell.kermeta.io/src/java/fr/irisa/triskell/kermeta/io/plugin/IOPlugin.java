

/*$Id: IOPlugin.java,v 1.2 2007-04-13 15:56:37 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	IOPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 févr. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.io.plugin;

import org.eclipse.core.runtime.Plugin;

import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

public class IOPlugin extends Plugin {

	public IOPlugin() {
		if(StdLibKermetaUnitHelper.STD_LIB_URI == null) StdLibKermetaUnitHelper.setURItoDefault();
		StdLibKermetaUnitHelper.getKermetaUnit();
	}
}


