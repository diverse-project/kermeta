

/*$Id: KDebugTarget.java,v 1.3 2008-04-14 06:48:57 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KDebugTarget.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mars 08
* Authors : paco
*/

package org.kermeta.runner.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.MessageFormat;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;
import org.kermeta.runner.RunnerPlugin;
import org.kermeta.runner.launching.KConstants;
import org.kermeta.runner.model.variable.KAbstractVariable;

/**
 * Kermeta Debug Target
 */
public class KDebugTarget extends KDebugElement implements IDebugTarget {
	
	// associated system process (VM)
	private IProcess fProcess;
	
	// containing launch object
	private ILaunch fLaunch;
	
	// program name
	private String fName;
	
	// sockets to communicate with VM
	private Socket fRequestSocket;
	private PrintWriter fRequestWriter;
	private BufferedReader fRequestReader;
	private Socket fEventSocket;
	private BufferedReader fEventReader;
	
	// suspend state
	private boolean fSuspended = true;
	
	// terminated state
	private boolean fTerminated = false;
	
	// threads
	private KThread fThread;
	private IThread[] fThreads;
	
	// event dispatch job
	private EventDispatchJob fEventDispatch;
	
	/**
	 * Listens to events from the Kermeta Interpreter and fires corresponding 
	 * debug events.
	 */
	class EventDispatchJob extends Job {
		
		public EventDispatchJob() {
			super("Kermeta Event Dispatch");
			setSystem(true);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		protected IStatus run(IProgressMonitor monitor) {
			String event = "";
			while (!isTerminated() && event != null) {
				try {
					event = fEventReader.readLine();
					RunnerPlugin.internalLog.debug("Debug Event : " + event);
					if (event != null) {
						fThread.setBreakpoints(null);
						fThread.setStepping(false);
						if (event.equals("started")) {
							started();
						} else if (event.equals("terminated")) {
							terminated();
							//sendRequest("finish");
						} else if (event.startsWith("resumed")) {
							if (event.endsWith("step")) {
								fThread.setStepping(true);
								resumed(DebugEvent.STEP_OVER);
							} else if (event.endsWith("client")) {
								resumed(DebugEvent.CLIENT_REQUEST);
							}
						} else if (event.startsWith("suspended")) {
							if (event.endsWith("client")) {
								suspended(DebugEvent.CLIENT_REQUEST);
							} else if (event.endsWith("step")) {
								suspended(DebugEvent.STEP_END);
							} else if (event.indexOf("breakpoint") >= 0) {
								breakpointHit(event);
							}
						}
					}
				} catch (IOException e) {
					terminated();
				}
			}
			return Status.OK_STATUS;
		}
		
	}
	
	/**
	 * Constructs a new debug target in the given launch for the 
	 * associated Kermeta Interpreter process.
	 * 
	 * @param launch containing launch
	 * @param process Kermeta Interpreter
	 * @param requestPort port to send requests to the VM
	 * @param eventPort port to read events from
	 * @exception CoreException if unable to connect to host
	 */
	public KDebugTarget(ILaunch launch, IProcess process, int requestPort, int eventPort) throws CoreException {
		super(null);
		fLaunch = launch;
		fTarget = this;
		fProcess = process;
		try {
			fRequestSocket = new Socket("localhost", requestPort);
			fRequestWriter = new PrintWriter(fRequestSocket.getOutputStream());
			fRequestReader = new BufferedReader(new InputStreamReader(fRequestSocket.getInputStream()));
			fEventSocket = new Socket("localhost", eventPort);
			fEventReader = new BufferedReader(new InputStreamReader(fEventSocket.getInputStream()));
			
		} catch (UnknownHostException e) {
			abort("Unable to connect to Kermeta Interpreter", e);
		} catch (IOException e) {
			abort("Unable to connect to Kermeta Interpreter", e);
		}
		fThread = new KThread(this);
		fThreads = new IThread[] {fThread};
		fEventDispatch = new EventDispatchJob();
		fEventDispatch.schedule();
		//DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#getProcess()
	 */
	public IProcess getProcess() {
		return fProcess;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
	 */
	public IThread[] getThreads() throws DebugException {
		return fThreads;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
	 */
	public boolean hasThreads() throws DebugException {
		return true; // WTB Changed per bug #138600
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#getName()
	 */
	public String getName() throws DebugException {
		if (fName == null) {
			fName = "Kermeta Program";
			try {
				fName = getLaunch().getLaunchConfiguration().getAttribute(KConstants.KM_FILENAME, "Kermeta Execution");
			} catch (CoreException e) {
			}
		}
		return fName;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		if (breakpoint.getModelIdentifier().equals(KConstants.K_DEBUG_MODEL)) {
			return true;
			/*try {
				String program = getLaunch().getLaunchConfiguration().getAttribute(KConstants.ATTR_K_PROGRAM, (String)null);
				if (program != null) {
					IMarker marker = breakpoint.getMarker();
					if (marker != null) {
						IPath p = new Path(program);
						return marker.getResource().getFullPath().equals(p);
					}
				}
			} catch (CoreException e) {
			}*/			
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
	 */
	public IDebugTarget getDebugTarget() {
		return this;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
	 */
	public ILaunch getLaunch() {
		return fLaunch;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	public boolean canTerminate() {
		return getProcess().canTerminate();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	public boolean isTerminated() {
		return fTerminated;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	public void terminate() throws DebugException {
		synchronized (fRequestSocket) {
			fRequestWriter.println("exit");
			fRequestWriter.flush();
		}		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
	 */
	public boolean canResume() {
		return !isTerminated() && isSuspended();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
	 */
	public boolean canSuspend() {
		return !isTerminated() && !isSuspended();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	public boolean isSuspended() {
		return fSuspended;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#resume()
	 */
	public void resume() throws DebugException {
		sendRequest("resume");
	}
	
	/**
	 * Notification the target has resumed for the given reason
	 * 
	 * @param detail reason for the resume
	 */
	private void resumed(int detail) {
		fSuspended = false;
		fThread.fireResumeEvent(detail);
	}
	
	/**
	 * Notification the target has suspended for the given reason
	 * 
	 * @param detail reason for the suspend
	 */
	private void suspended(int detail) {
		fSuspended = true;
		fThread.fireSuspendEvent(detail);
	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
	 */
	public void suspend() throws DebugException {
		synchronized (fRequestSocket) {
			fRequestWriter.println("suspend");
			fRequestWriter.flush();
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public void breakpointAdded(IBreakpoint breakpoint) {
	/*	if (supportsBreakpoint(breakpoint)) {
			try {
				if (breakpoint.isEnabled()) {
					try {
						sendRequest("set " + (((ILineBreakpoint)breakpoint).getLineNumber() - 1));
					} catch (CoreException e) {
					}
				}
			} catch (CoreException e) {
			}
		}*/
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		/*if (supportsBreakpoint(breakpoint)) {
			try {
				sendRequest("clear " + ((ILineBreakpoint)breakpoint).getLineNumber());
			} catch (CoreException e) {
			}
		}*/
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		/*if (supportsBreakpoint(breakpoint)) {
			try {
				if (breakpoint.isEnabled()) {
					breakpointAdded(breakpoint);
				} else {
					breakpointRemoved(breakpoint, null);
				}
			} catch (CoreException e) {
			}
		}*/
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#canDisconnect()
	 */
	public boolean canDisconnect() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#disconnect()
	 */
	public void disconnect() throws DebugException {
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#isDisconnected()
	 */
	public boolean isDisconnected() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#supportsStorageRetrieval()
	 */
	public boolean supportsStorageRetrieval() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#getMemoryBlock(long, long)
	 */
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
		return null;
	}

	/**
	 * Notification we have connected to the VM and it has started.
	 * Resume the VM.
	 */
	private void started() {
		fireCreationEvent();
		//installDeferredBreakpoints();
		try {
			resume();
		} catch (DebugException e) {
		}
	}
	
	/**
	 * Install breakpoints that are already registered with the breakpoint
	 * manager.
	 */
	/*private void installDeferredBreakpoints() {
		IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(KConstants.K_DEBUG_MODEL);
		for (int i = 0; i < breakpoints.length; i++) {
			breakpointAdded(breakpoints[i]);
		}
	}*/
	
	/**
	 * Called when this debug target terminates.
	 */
	private void terminated() {
		fTerminated = true;
		fSuspended = false;
		fThread = null;
		fThreads = new IThread[]{};
		fireTerminateEvent();
	}
	
	/**
	 * Returns the current stack frames in the target.
	 * 
	 * @return the current stack frames in the target
	 * @throws DebugException if unable to perform the request
	 */
	protected IStackFrame[] getStackFrames() throws DebugException {
		synchronized (fRequestSocket) {
			fRequestWriter.println("stack");
			fRequestWriter.flush();
			try {
				String framesData = fRequestReader.readLine();
				if ( framesData != null && ! framesData.equals("") ) {
					String[] frames = framesData.split("#");
					IStackFrame[] theFrames = new IStackFrame[frames.length];
					for (int i = 0; i < frames.length; i++) {
						String data = frames[i];
						theFrames[frames.length - i - 1] = new KStackFrame(fThread, data, i);
					}
					return theFrames;
				}
			} catch (IOException e) {
				abort("Unable to retrieve stack frames", e);
			}
		}
		return new IStackFrame[0];
	}
	
	/**
	 * Single step the interpreter.
	 * 
	 * @throws DebugException if the request fails
	 */
	protected void step() throws DebugException {
		sendRequest("step");
	}
	
	/**
	 * Single step the interpreter.
	 * 
	 * @throws DebugException if the request fails
	 */
	protected void stepInto() throws DebugException {
		sendRequest("stepInto");
	}
	
	/**
	 * Returns the current value of the given variable.
	 * 
	 * @param variable
	 * @return variable value
	 * @throws DebugException if the request fails
	 */
	public IValue getVariableValue(KAbstractVariable variable) throws DebugException {
		synchronized (fRequestSocket) {
			fRequestWriter.println( variable.getValueRequest() );
			fRequestWriter.flush();
			try {
				String data = fRequestReader.readLine();
				return new KValue(this, variable, data);
			} catch (IOException e) {
				abort(MessageFormat.format("Unable to retrieve value for variable {0}", new String[]{variable.getName()}), e);
			}
		}
		return null;
	}
	
	/**
	 * Sends a request to the PDA VM and waits for an OK.
	 * 
	 * @param request debug command
	 * @throws DebugException if the request fails
	 */
	private void sendRequest(String request) throws DebugException {
		synchronized (fRequestSocket) {
			fRequestWriter.println(request);
			fRequestWriter.flush();
			try {
				// wait for "ok"
				String response = fRequestReader.readLine();
			} catch (IOException e) {
				abort("Request failed: " + request, e);
			}
		}		
	}
	
	/**
	 * Notification a breakpoint was encountered. Determine
	 * which breakpoint was hit and fire a suspend event.
	 * 
	 * @param event debug event
	 */
	private void breakpointHit(String event) {
		// determine which breakpoint was hit, and set the thread's breakpoint
		String[] strings = event.split(" ");
		String file = strings[2].replace("platform:/resource", "");
		int lineNumber = Integer.parseInt(strings[3]);
		IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(KConstants.K_DEBUG_MODEL);
		for (int i = 0; i < breakpoints.length; i++) {
			IBreakpoint breakpoint = breakpoints[i];
			if (supportsBreakpoint(breakpoint)) {
				if (breakpoint instanceof ILineBreakpoint) {
					ILineBreakpoint lineBreakpoint = (ILineBreakpoint) breakpoint;
					try {
						if (lineBreakpoint.getLineNumber() == lineNumber && lineBreakpoint.getMarker().getResource().getFullPath().toString().equals(file)) {
							fThread.setBreakpoints(new IBreakpoint[]{breakpoint});
							break;
						}
					} catch (CoreException e) {
					}
				}
			}
		}
		suspended(DebugEvent.BREAKPOINT);
	}	
}
