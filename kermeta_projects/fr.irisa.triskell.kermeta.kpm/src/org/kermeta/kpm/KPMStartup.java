/*$Id: KPMStartup.java,v 1.1 2008-05-28 09:26:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm;

import org.eclipse.ui.IStartup;
import org.kermeta.io.plugin.IOPlugin;

public class KPMStartup implements IStartup {

	public void earlyStartup() {
		IOPlugin.getDefault();
		KpmManager.getDefault();
	}

}
