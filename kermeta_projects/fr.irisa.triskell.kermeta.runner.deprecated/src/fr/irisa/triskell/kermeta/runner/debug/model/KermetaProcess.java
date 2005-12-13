/**
 * 
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.ConnectException;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaSecurityManager;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions.ResumeCondition;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;

/**
 * The thread inside which the DebugInterpreter will be launched.
 * 
 */
public class KermetaProcess extends Thread {
	
	public final String REMOTE_NAME = "remote_interpreter";

	private String file;
	private String classname;
	private String opname;
	private String args;
	private Registry reg; 
	private IKermetaRemoteDebugUI debugPlatform;
	// the flag that controls the run/stop of the thread
	private boolean stop;
	
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
		stop = false;
/*		System.setSecurityManager (new RMISecurityManager() {
		    public void checkConnect (String host, int port) {}
		    public void checkConnect (String host, int port, Object context) {} });*/
	}
	
	
	/**
	 * Method called when start() is called on this thread
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		IKermetaRemoteInterpreter remote_interpreter = null;
		try
		{
			if (System.getSecurityManager() == null)
			{
				System.out.println("No security manager : creating one");
				System.setSecurityManager (new KermetaSecurityManager());
				//System.setSecurityManager(new RMISecurityManager());
			}
			
			System.err.println("1) remote interpreter!");
			try { 
				reg = LocateRegistry.createRegistry(5001);
			}
			catch (ExportException e)
			{
				System.err.println("Export exception : " + e);
				reg = LocateRegistry.getRegistry("localhost", 5001);
			}
			remote_interpreter = new KermetaRemoteInterpreter(file, classname, opname, args);
			reg.bind(REMOTE_NAME, remote_interpreter);
			System.out.println("Binded!" + reg.lookup(REMOTE_NAME));
		}
		catch (Exception e) 
		{
			System.out.println("Exception Remote! ");
			e.printStackTrace();
			
		}
		// FIXME : I am not sure that this is the best place to catch the Kermeta exception!!!
		//catch (AlreadyBoundException e) {e.printStackTrace();}
//		catch (MalformedURLException e) {e.printStackTrace();}
		finally
		{ 
			KermetaRemoteInterpreter kermeta_interpreter = (KermetaRemoteInterpreter)remote_interpreter; 
			// Get the stream where to display the exceptions caught externally..
			KermetaIOStream console = kermeta_interpreter.getKermetaIOStream();
			
			try {
				debugPlatform.remoteInterpreterCreated();
				// Invoke the interpretation after RMI connections are done
				System.err.println("get interpreter : " + remote_interpreter);
				remote_interpreter.getInterpreter().invoke_debug();
				
			} catch (RemoteException e) {
				e.printStackTrace();
			}

	        catch (KermetaRaisedException kerror)
	        {
	            console.print(kerror.getMessage());
	            console.print("\n"+kerror.toString());
	        }
	        catch (KermetaInterpreterError ierror)
	        {
	            console.print("Kermeta interpreter could not be launched :\n");
	            console.print(ierror.getMessage());
	        }
	        catch (Throwable e)
	        {
	            console.print("\nKermetaInterpreter internal error \n" +
	            		"-------------------------------------------\n");
	            console.print("Reported java error : "+e);
	            console.print(e.getMessage());
	            e.printStackTrace();
	        }
	        finally
	        {
	        	DebugInterpreter di = kermeta_interpreter.getInterpreter(); 
	        	di.getInterpreterContext().popCallFrame();
	    		// Remote side of the interpreter reads this attribute and act accordingly
	    		di.setCurrentState(DebugInterpreter.DEBUG_TERMINATE);
	    		// Run a last time the debug command that tests if we can interrupt.....laborious
	    		di.processDebugCommand(null);
	        }
			 
		}
	}


	/** Terminates properly the execution of the remote interpreter */
	public synchronized void terminate() {
		System.out.println("KermetaProcess terminates");
		
		try {
			// FIXME : we should not have to do it through debugPlatform. beeeek
		//	debugPlatform.unregisterRemoteInterpreter();
			//UnicastRemoteObject.unexportObject(reg.lookup(REMOTE_NAME), true);
			//UnicastRemoteObject.unexportObject(debugPlatform, true);
			reg.unbind(REMOTE_NAME);
			//reg = null;
			
		} catch (AccessException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	

}
