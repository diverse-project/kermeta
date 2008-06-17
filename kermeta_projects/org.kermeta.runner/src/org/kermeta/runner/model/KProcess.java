

/*$Id: KProcess.java,v 1.4 2008-06-17 14:35:46 dvojtise Exp $
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
		// Notifying the basic process that it can start
		getInterpreter().setProcess(this);
		synchronized( process ) {
			process.notify();
		}
	}

	public Interpreter getInterpreter() {
		KBasicProcess basicProcess = (KBasicProcess) getSystemProcess();
		return basicProcess != null ? basicProcess.getInterpreter(): null;			
	}

	@Override
	public boolean isTerminated() {
		Interpreter interpreter = getInterpreter();
		return interpreter != null ? interpreter.isTerminated() : false;		
	}
	
}


