/**
 * 
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;

/**
 * @author zdrey
 * I am not sure that implementing IProcess is meaning full.
 */
public class KermetaProcess implements Runnable, IProcess {

	protected KermetaDebugTarget target;
	private Thread kThread;
	private BufferedReader in;
	// We include the interpreter in this thread.
	private DebugInterpreter interpreter;
	protected Socket socket;
	
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
		 // Create the socket client that will send the request to the server (server
	    // handles the interpreter-debugger 
	    try {
			socket  = new Socket("localhost", target.getKermetaRemotePort().getServerPort());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		kThread = new Thread(this); // instanciation du thread
		kThread.start(); // demarrage du thread, la fonction run() est ici lancée
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public synchronized void run() {
		target.initPath();
		// Instanciate the debug interpreter
        interpreter = (DebugInterpreter)KermetaLauncher.launch(
        		target.getStartFile(), target.getClassName(), target.getOpName(), true);
        // Let the interpreter be available to the server
        target.getKermetaRemotePort().setInterpreter(interpreter);
        // Initialize the DebugTarget 
        target.initialize();
        try {
        	String readCommand = "";
        	System.err.println("c'est parti");
        	while ((readCommand=in.readLine())!=null)
        	{
        		System.err.println("c'est reparti ");
        		System.err.println("read : "+ readCommand);
        		// process the command : call the interpreter methods
        		target.processCommand(readCommand);
        		//Thread.sleep(5);
        	}
        /*	System.out.println(".............................................");
        	System.out.println("je sors de la boucle :( ");*/
		} catch (IOException e) {
			System.out.println("IO exception while trying to read readStream");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // catch (InterruptedException ie) { ie.printStackTrace();}
	}

	/* ------------------------------------------------------------------------
	 * 
	 *  METHODS IMPLEMENTING IPROCESS INTERFACE
	 *  
	 * ------------------------------------------------------------------------
	 */
	
	public String getLabel() {
		// TODO Auto-generated method stub
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
