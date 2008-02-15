/** $Id: KermetaRunProcess.java,v 1.8 2008-02-15 14:35:44 dvojtise Exp $
 * Project   : Kermeta Runner
 * File      : KermetaRunProcess.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan, 24 2006
 * Authors       : dvojtise, jmottu
 */
package fr.irisa.triskell.kermeta.runner.debug.process;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;

/**
 * The thread inside which the Interpreter will be launched.
 */
public class KermetaRunProcess extends KermetaProcess {


	private String file;
	private String className;
	private String opName;
	private String args;
	private boolean isConstraintMode;
	
	public IOConsole console;
	
	protected AbstractKermetaTarget target = null;
	
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
	public KermetaRunProcess(String f, String c, String o, String a, String threadName, boolean isConstraintMode, AbstractKermetaTarget target) {
		super(threadName);
		this.file = f;
		this.className = c;
		this.opName = o;
		this.args = a;
		this.isConstraintMode = isConstraintMode;
		this.target = target;
		try {
			KermetaLauncher.getDefault().initInterpreter(f);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public KermetaRunProcess(String f, String c, String o, String a, String threadName, boolean isConstraintMode, IOConsole console, AbstractKermetaTarget target) {
		this(f, c, o, a, threadName, isConstraintMode, target);
		this.console = console;
	}
	
	public KermetaInterpreter getInterpreter() {
		return KermetaLauncher.getDefault().getInterpreter();
	}
	
	/**
	 * Method called when start() is called on this thread
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		KermetaUnit kermetaUnit = KermetaLauncher.getDefault().getInterpreter().getUnit();
		kermetaUnit.setLocked(true);
		KermetaLauncher.getDefault().runKermeta(file, className, opName, args, false, isConstraintMode, console);
		RunnerPlugin.getDefault().stopExecution(target);
		kermetaUnit.setLocked(false);
	}
	
	
	/**
	 * @see java.lang.Process#getErrorStream()
	 */
	/*public InputStream getErrorStream() {
		System.out.println("Someone calls getErrorStream");
		return console.getInputStream();
	}*/

	/**
	 * @see java.lang.Process#getInputStream()
	 */
	/*public InputStream getInputStream() {
		System.out.println("Someone calls getInputStream (krp)" + console.getInputStream());
		if (console.getInputStream() != null)
			return console.getInputStream();
		else
		{
			return System.in;
		}
	}*/

	/**
	 * Must not be null
	 * @see java.lang.Process#getOutputStream()
	 */
	/*public OutputStream getOutputStream() {
		System.err.println("Someone calls getOutputStream (krp)");
		if (console.getOutputStream() != null)
			return console.getOutputStream();
		return System.out;
	}*/
	
	/**
	 * @see java.lang.Process#exitValue()
	 * It should be forbidden to call this method before the process is finished.
	 * This method is called by IProcess when user clicks on "Stop" button
	 */
	public int exitValue() {
		synchronized (this)
	     {
			System.out.println("Someone calls exit value: " + state);
			//console.getTarget().fireTerminateEvent();
			//	if (! hasExited())
			
			if (state != STATE_TERMINATED)
				throw new IllegalThreadStateException("Process has not exited");
			else
				try {
					System.err.println("TCan : " + target.canTerminate());
					System.err.println("PCan : " + target.getProcess().canTerminate());
					target.terminate();
				} catch (DebugException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	     }
		return status;
	}

}
