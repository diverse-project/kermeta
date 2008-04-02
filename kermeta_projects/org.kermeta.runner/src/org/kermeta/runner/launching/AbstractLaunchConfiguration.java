package org.kermeta.runner.launching;

import java.io.IOException;
import java.net.ServerSocket;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.kermeta.runner.model.KDebugTarget;
import org.kermeta.runner.model.KProcess;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

abstract public class AbstractLaunchConfiguration implements ILaunchConfigurationDelegate {

	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {

		int requestPort = findFreePort();
		int eventPort = findFreePort();

		if ( requestPort == -1 || eventPort == -1) {
			abort("Unable to find free port", null);
		}
		
		String fileName = "platform:/resource" + configuration.getAttribute( KConstants.KM_FILENAME, (String) null).replace("\\", "/");
		String mainClass = configuration.getAttribute( KConstants.KM_CLASSQNAME, (String) null);
		String mainOperation = configuration.getAttribute( KConstants.KM_OPERATIONNAME, (String) null);
		String argumentsInline = configuration.getAttribute( KConstants.KM_ARGUMENTS, (String) null);
		String[] arguments = null;
		if ( argumentsInline != null )
			arguments = argumentsInline.split(" ");
		
		try {
			if ( mode.equals(ILaunchManager.RUN_MODE) ) {
				KBasicProcess basicProcess = new KBasicProcess(fileName, isContraint(), mainClass, mainOperation, arguments);
				DebugPlugin.newProcess(launch, basicProcess, fileName + " " + mode);
			} else if ( mode.equals(ILaunchManager.DEBUG_MODE) ) {
				KBasicProcess basicProcess = new KBasicProcess(fileName, isContraint(), requestPort, eventPort, mainClass, mainOperation, arguments, this);
				String label =  fileName + " " + mode;
				KProcess process = (KProcess) DebugPlugin.newProcess(launch, basicProcess, label);
				
				while ( ! process.getInterpreter().hasStarted() ) {
					synchronized(this) {
						wait();
					}
				}
				
				IDebugTarget target = new KDebugTarget(launch, process, requestPort, eventPort);
				launch.addDebugTarget(target);
			}
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	abstract protected boolean isContraint();
	
	/**
	 * Returns a free port number on localhost, or -1 if unable to find a free port.
	 * 
	 * @return a free port number on localhost, or -1 if unable to find a free port
	 */
	private int findFreePort() {
		ServerSocket socket= null;
		try {
			socket= new ServerSocket(0);
			return socket.getLocalPort();
		} catch (IOException e) { 
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
		return -1;		
	}

	/**
	 * Throws an exception with a new status containing the given
	 * message and optional exception.
	 * 
	 * @param message error message
	 * @param e underlying exception
	 * @throws CoreException
	 */
	private void abort(String message, Throwable e) throws CoreException {
		// TODO: the plug-in code should be the example plug-in, not Perl debug model id
		throw new CoreException(new Status(IStatus.ERROR, KConstants.K_DEBUG_MODEL, 0, message, e));
	}
}
