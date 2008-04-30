/*$Id: KProcessFactory.java,v 1.4 2008-04-30 13:58:47 ftanguy Exp $
* Project : org.kermeta.runner
* File : 	KProcessFactory.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;
import org.kermeta.runner.model.KProcess;

public class KProcessFactory implements IProcessFactory {

	public IProcess newProcess(ILaunch launch, Process process, String label, Map attributes) {
		return new KProcess(launch, (KBasicProcess) process, label, attributes);
	}

}
