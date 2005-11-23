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

/**
 * @author zdrey
 * I am not sure that implementing IProcess is meaningfull.
 */
public class KermetaProcess extends Thread {

	public String f;
	public String c;
	public String o;
	public String a;
	public IKermetaRemoteDebugPlatform debugPlatform;
	
	/**
	 * 
	 */
	public KermetaProcess(String f, String c, String o, String a, IKermetaRemoteDebugPlatform debug_platform) {
		super();
		this.f = f;
		this.c = c;
		this.o = o;
		this.a = a;
		debugPlatform = debug_platform;
	}
	
	
	/**
	 * Method called when start() is called on this thread
	 * @see java.lang.Runnable#run()
	 */
	public synchronized void run() {
		try
		{
			System.err.println("1) remote interpreter!");
			Registry reg = LocateRegistry.createRegistry(5002);
			IKermetaRemoteInterpreter remote_interpreter = new KermetaRemoteInterpreter(f, c, o, a);
			
			reg.bind("remote_interpreter", remote_interpreter);
			System.err.println("bound!");
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
