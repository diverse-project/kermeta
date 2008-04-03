

/*$Id: KProcess.java,v 1.2 2008-04-03 12:54:49 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KProcess.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mars 08
* Authors : paco
*/

package org.kermeta.runner.model;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.runner.launching.KBasicProcess;

/**
 * An Eclipse process created from the fake KBasicProcess.
 * 
 * @author paco
 *
 */
public class KProcess extends RuntimeProcess {

	public KProcess(ILaunch launch, KBasicProcess process, String name, Map attributes) {
		super(launch, process, name, attributes);
		getInterpreter().setProcess(this);
	}

	public Interpreter getInterpreter() {
		KBasicProcess basicProcess = (KBasicProcess) getSystemProcess();
		return basicProcess.getInterpreter();			
	}

	@Override
	public boolean isTerminated() {
		try {
			return getInterpreter().isTerminated();
		} catch (NullPointerException e) {
			return false;
		}
	}
	
}


