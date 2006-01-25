/** $Id$
 * Project   : Kermeta Runner
 * File      : KermetaRunProcess.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan, 24 2006
 * Authors       : dvojtise
 */
package fr.irisa.triskell.kermeta.runner.launching;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaProcess;

/**
 * The thread inside which the Interpreter will be launched.
 * 
 */
public class KermetaRunProcess extends KermetaProcess {


	private String file;
	private String className;
	private String opName;
	private String args;
		
	
	
	public KermetaRunProcess(String f, String c, String o, String a, String threadName) {
		super(threadName);
		this.file = f;
		this.className = c;
		this.opName = o;
		this.args = a;
		
	}

	/**
	 * Method called when start() is called on this thread
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		
		KermetaLauncher.getDefault().runKermeta(file, className, opName, args, false);
	}
	
	

	
	
	

}
