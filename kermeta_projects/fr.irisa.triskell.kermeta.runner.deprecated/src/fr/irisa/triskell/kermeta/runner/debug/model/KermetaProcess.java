/**
 * 
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaRemoteDebugPlatform;
import fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteDebugCondition;

/**
 * @author zdrey
 * I am not sure that implementing IProcess is meaningfull.
 */
public class KermetaProcess extends Thread {

	private String file;
	private String classname;
	private String opname;
	private String args;
	private IKermetaRemoteDebugPlatform debugPlatform;
	
	/**
	 * 
	 */
	public KermetaProcess(String f, String c, String o, String a, IKermetaRemoteDebugPlatform debug_platform) {
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
	public synchronized void run() {
		IKermetaRemoteInterpreter remote_interpreter = null;
		try
		{
			System.err.println("1) remote interpreter!");
			Registry reg = LocateRegistry.createRegistry(5002);
			remote_interpreter = new KermetaRemoteInterpreter(file, classname, opname, args);
			reg.bind("remote_interpreter", remote_interpreter);
		}
		catch (RemoteException e) {e.printStackTrace();}
		catch (AlreadyBoundException e) {e.printStackTrace();}
//		catch (MalformedURLException e) {e.printStackTrace();}
		finally
		{ 
			try {
				debugPlatform.remoteInterpreterCreated();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}

}
