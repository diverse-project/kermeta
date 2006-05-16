/** $Id$
 * Project   : Kermeta Runner
 * File      : KermetaRunProcess.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan, 24 2006
 * Authors       : dvojtise, jmottu
 */
package fr.irisa.triskell.kermeta.runner.launching;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaProcess;

/**
 * The thread inside which the Interpreter will be launched.
 */
public class KermetaRunProcess extends KermetaProcess {


	private String file;
	private String className;
	private String opName;
	private String args;
	
	private boolean isConstraintMode;
		
	
	/**
	 * Constructor
	 * @param f file that contains the program to launch
	 * @param c the class that contains the operation to launch
	 * @param o the operation to launch
	 * @param a the list of arguments (as a String of token separated by a whitespace) 
	 * @param threadName the name of the thread inside which the interpreter is launched
	 * @param isConstraintMode specific kermeta launch mode. Set to true if constraints are evaluated
	 * during the execution of the program, false otherwise
	 */
	public KermetaRunProcess(String f, String c, String o, String a, String threadName, boolean isConstraintMode) {
		super(threadName);
		this.file = f;
		this.className = c;
		this.opName = o;
		this.args = a;
		this.isConstraintMode = isConstraintMode;
	}

	/**
	 * Method called when start() is called on this thread
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		
		KermetaLauncher.getDefault().runKermeta(file, className, opName, args, false, isConstraintMode);
	}
	
	

	
	
	

}
