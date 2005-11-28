/**
 * 
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions.ResumeCondition;

/**
 * @author zdrey
 * I am not sure that implementing IProcess is meaningfull.
 */
public class KermetaProcess extends Thread {
	
	public final String REMOTE_NAME = "remote_interpreter";

	private String file;
	private String classname;
	private String opname;
	private String args;
	private Registry reg; 
	private IKermetaRemoteDebugUI debugPlatform;
	
	/**
	 * 
	 */
	public KermetaProcess(String f, String c, String o, String a, IKermetaRemoteDebugUI debug_platform) {
		super();
		this.file = f;
		this.classname = c;
		this.opname = o;
		this.args = a;
		debugPlatform = debug_platform;
	}
	
	
	/**
	 * Method called when start() is called on this thread
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		IKermetaRemoteInterpreter remote_interpreter = null;
		try
		{
			System.err.println("1) remote interpreter!");
			reg = LocateRegistry.createRegistry(5002);
			remote_interpreter = new KermetaRemoteInterpreter(file, classname, opname, args);
			reg.bind(REMOTE_NAME, remote_interpreter);
		}
		catch (RemoteException e) 
		{
			System.out.println("Exception Remote! ");
			e.printStackTrace();
			
		}
		catch (AlreadyBoundException e) {e.printStackTrace();}
//		catch (MalformedURLException e) {e.printStackTrace();}
		finally
		{ 
			try {
				debugPlatform.remoteInterpreterCreated();
				// Invoke the interpretation after RMI connections are done
				remote_interpreter.getInterpreter().invoke_debug();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}


	/** Terminates properly the execution of the remote interpreter */
	public void terminate() {
		try {
			reg.unbind(REMOTE_NAME);
			
		} catch (AccessException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
