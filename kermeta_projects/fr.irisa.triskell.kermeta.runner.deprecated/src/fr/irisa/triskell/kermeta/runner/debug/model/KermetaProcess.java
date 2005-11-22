/**
 * 
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;

/**
 * @author zdrey
 * I am not sure that implementing IProcess is meaningfull.
 */
public class KermetaProcess implements Runnable, IProcess {

	protected KermetaDebugTarget target;
	// We include the interpreter in this thread.
	private DebugInterpreter interpreter;
	
	/** true if the debug has ended or debugger disconnected, false otherwise
	 *  for the moment it will always false 
	 * */
	private boolean done = false;
	/**
	 * 
	 */
	public KermetaProcess(KermetaDebugTarget p_target) {
		super();
		target = p_target;

	}

	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public synchronized void run() {
		// Initialize the DebugTarget 
        target.initialize();
        
        // Create the Interpreter
        createKermetaInterpreter();
		System.err.println("****************************************************");
	}

	/**
	 * Creates the Kermeta interpreter and sets it to the KermetaDebugTarget.
	 * If the interpreter is launched under a separate process, it is this method
	 * that you need to redefine.
	 *
	 */
	public void createKermetaInterpreter()
	{
		//Instanciate the debug interpreter
        KermetaInterpreter global_interpreter = KermetaLauncher.getDefault().runKermeta(
        		target.getStartFile(), target.getClassName(), target.getOpName(), target.getArgs(), true);
        
        interpreter = (DebugInterpreter)global_interpreter.getMemory().getCurrentInterpreter();
        
        target.setKermetaInterpreter(global_interpreter);
        
        interpreter.invoke_debug();
	}
	
	
	
	/*
	 * 
	 * (methods initially located in KermetaDebugTarget)
	 * command that is dedicated to the 
	 * 
	 */
	
	/* ------------------------------------------------------------------------
	 * 
	 *  METHODS IMPLEMENTING IPROCESS INTERFACE
	 *  
	 * ------------------------------------------------------------------------
	 */
	
	public String getLabel() {
		return "Salut mon pote";
	}

	public ILaunch getLaunch() {
		return target.getLaunch();
	}

	public IStreamsProxy getStreamsProxy() {
		return null;
	}

	public void setAttribute(String key, String value) {
		System.err.println("Whoose attribute??? (KermetaProcess)");
	}

	public String getAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getExitValue() throws DebugException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean canTerminate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTerminated() {
		// TODO Auto-generated method stub
		return false;
	}

	public void terminate() throws DebugException {
		// TODO Auto-generated method stub
	}
	
	public DebugInterpreter getDebugInterpreter() {
		return interpreter;
	}

	public OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getErrorStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public int waitFor() throws InterruptedException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int exitValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
