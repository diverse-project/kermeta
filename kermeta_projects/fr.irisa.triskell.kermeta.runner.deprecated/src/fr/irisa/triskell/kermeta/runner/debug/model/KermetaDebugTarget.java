/* $Id: KermetaDebugTarget.java,v 1.7 2005-11-28 18:54:35 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugTarget.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;

import org.eclipse.debug.core.ILaunch;

import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaStepHandler;
/**
 * KermetaDebugTarget, for the DEBUG_MODE.
 * Many source code come from the Eclipse Howto ("How to create an Eclipse
 * debugger" -- www.eclipse.org/articles/Article-Debugger/how-to.html ).
 * This is the object that communicates with the Kermeta interpreter.
 * 
 * This is the debuggable execution process/VM of a KermetaProgram
 * To create a DebugTarget using a new JVM to run the interpreter, user
 * should inherits AbstractKermetaTarget or this one.
 * 
 * A good part of code is strongly inspired from Pydev code & style. 
 */
public class KermetaDebugTarget extends AbstractKermetaTarget
{ 
    protected KermetaRemoteDebugUI remotePlatform;
    protected IKermetaRemoteInterpreter remoteInterpreter;
    private Registry reg;
    
    protected KermetaProcess kermeta_process;
    protected KermetaStepHandler stepHandler;
    
	/** current state of the debugger */
	private int state = -1;

	/** constant state possible for the debugger */
	public static final int stateTerminated 	= 1;
	public static final int stateRunning 		= 2;
	public static final int stateSuspended 		= 3;
	public static final int stateDisconnected 	= 4;
	
	/** Redundance.. */
	public static Hashtable debug_state_mapping;
    static {
    	debug_state_mapping = new Hashtable();
    	debug_state_mapping.put(new Integer(1), RunnerConstants.TERMINATED);
    	debug_state_mapping.put(new Integer(2), RunnerConstants.RESUMED);
    	debug_state_mapping.put(new Integer(3), RunnerConstants.SUSPENDED);
    }
	
    /**
     * Constructor
     * @param launch
     */
    public KermetaDebugTarget(ILaunch plaunch) { 
    	
        launch = plaunch;
        target = this;
        breakpoints = new ArrayList();
        stepHandler = new KermetaStepHandler(this);
        this.name = "Kermeta Debug Target";
        // Create a thread by default
   /*     this.threads = new KermetaDebugThread[1];
        threads[0] = new KermetaDebugThread(this);*/
        // Do not set to stateDisconnected
        setState(stateRunning);
        getLaunch().addDebugTarget(this);
        DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
        DebugPlugin.getDefault().getLaunchManager().addLaunchListener(this);
        //DebugPlugin.getDefault().addDebugEventListener(this);
    }
    
    public IDebugTarget getDebugTarget() { return this; }
    
    /**
     * 
     * It is launched by the KermetaLaunchConfigurationDelegate after initialization
     * and launch of the Kermeta interpreter itself.
     * TODO : here should be done the following things :
     * - the stack frame and the variables values display on UI
     * - the interpretation of the commands sent by the user
     * - the file being debugged
     * 
     */
    public synchronized void start()
    {
    	// Create the KermetaDebugPlatform that will be driven by the KermetaDebugTarget
    	try {
    		initialize();
    		// Create the remote platform
    		createRemotePlatform();
    		
    		// Start the debug interpreter in a separate process
    		startRemoteInterpreterProcess();
    	} 
    	catch (RemoteException e) { e.printStackTrace(); }
    }

    /** RESUME command */
    public void resume() throws DebugException {
        // suspended reset to false
        setState(stateRunning);
        for (int i=0; i<threads.length; i++)
    	{
    		threads[i].resume();
    	}
        fireResumeEvent(this);
    }
    
    public void suspend() throws DebugException {
    	setState(stateSuspended);
    	for (int i=0; i<threads.length; i++)
    	{
    		threads[i].suspend();
    	} 
    	fireSuspendEvent(this);
    }
    
	public void terminate() throws DebugException {
    	setState(stateTerminated);
		kermeta_process.terminate();
    	kermeta_process = null;
		fireEvent(new DebugEvent(this, DebugEvent.TERMINATE));
	}
    
    
    /** @see org.eclipse.debug.core.model.ISuspendResume#isTerminated() */
	public boolean isTerminated() {
		return (state == stateTerminated);
	} 
    /** @see org.eclipse.debug.core.model.ISuspendResume#isSuspended() */
    public boolean isSuspended()
    { 
    	return (state == stateSuspended); 
    }
    /** @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#isDisconnected() */
	public boolean isDisconnected() { return (state == stateDisconnected); }

    
    /*
     * DELEGATORS
     */
    
    /** @see org.eclipse.debug.core.model.ISuspendResume#canResume() */
    public boolean canResume() {
    	return (state != stateDisconnected && state != stateRunning);
    }

    /** @see org.eclipse.debug.core.model.ISuspendResume#canSuspend() */
    public boolean canSuspend()
    {	return !isSuspended(); }

	/**
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public boolean supportsBreakpoint(IBreakpoint breakpoint) { return true; }

	/** @see org.eclipse.debug.core.model.IDisconnect#canDisconnect() */
    public boolean canDisconnect() { return (state != stateDisconnected); }

    /** @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#canTerminate() */
	public boolean canTerminate() { return (state != stateTerminated); }
	
	/** @see org.eclipse.debug.core.model.IDisconnect#disconnect() */
    public void disconnect() throws DebugException { setState(stateDisconnected); }
  
    /*
     * Implementation of IDebugTarget
     *
     */
    
    /**
     * This method is implicitely called inside the Eclipse framework in order 
     * to display the thread nodes of this debug target in the tree view 
     * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
     */
    public IThread[] getThreads() throws DebugException {
    	// Should not be null in fact
    	if (threads==null || threads.length==0)
    	{
    		threads = new KermetaDebugThread[1];
    		threads[0] = new KermetaDebugThread(this, "default thread");
    		fireCreationEvent(threads[0]);
    	}
    	return threads;
    }
    
    /** 
     * Helper method that gets the first IThread : 
     * in the first Iteration of Kermeta and its debugger, we only have one 
     * thread that is launched (no multi-thread handling in Kermeta!), so we
     * only need to access the first thread in the array of threads!
     */
    public KermetaDebugThread getMainThread() throws DebugException
    {
    	return (KermetaDebugThread)getThreads()[0];
    }
    
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#getProcess()
	 */
	public IProcess getProcess() {
		return null;
	}

	/**
	 * Initialize event requests and state from the underlying VM.
	 * This method is synchronized to ensure that we do not start
	 * to process an events from the target until our state is
	 * initialized.
	 */
	public synchronized void initialize() {
		initPath();
		initializeBreakpoints();
		setState(stateRunning);
	}
	
	/**
	 * Installs all Java breakpoints that currently exist in
	 * the breakpoint manager
	 */
	protected void initializeBreakpoints()
	{
		IBreakpointManager manager= DebugPlugin.getDefault().getBreakpointManager();
		manager.addBreakpointListener(this);
		IBreakpoint[] bps = manager.getBreakpoints(KermetaBreakpoint.KERMETA_BREAKPOINT_ID);
		for (int i = 0; i < bps.length; i++) {
			if (bps[i] instanceof IBreakpoint) { // FIXME : KermetaBreakPoint instead of IBreakPoint
				breakpointAdded(bps[i]);
			}
		}
		IProject projects[] = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		System.out.println("I have a project : " + projects);
		
//		 now, register all the breakpoints in all projects
        projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        //for (IProject project : projects) {
        for (int i=0; i<projects.length; i++)
        {
        	IProject project = projects[i];
        	if(!project.isOpen()){
        		continue;
        	}
            
            try {
                IMarker[] markers = project.findMarkers(KermetaBreakpoint.KERMETA_BREAKPOINT_ID, true, IResource.DEPTH_INFINITE);
                IBreakpointManager breakpointManager = DebugPlugin.getDefault().getBreakpointManager();
                
                for (int marker_count=0; marker_count<markers.length; marker_count++) {
                	IMarker marker = markers[marker_count];
                    KermetaBreakpoint brk = (KermetaBreakpoint) breakpointManager.getBreakpoint(marker);
                    
                    if (brk.isEnabled()) {
                    	// send the command telling a marker is added and enabled.
                    }
                }
            } catch (Throwable t) {
                RunnerPlugin.errorDialog("Error setting breakpoints ("+ t + ")");
            }
        }
		
	}

	/**
	 * When users sends a command via a button an event is generated, than, handled by this method.
	 */
	public void handleDebugEvents(DebugEvent[] events) {
		// TODO Auto-generated method stub
		System.err.println("Debug! : "+events.length + " -> " + events[0]);
		
	}
	
	// Easier since we share Strings most of the time
	public String getStateAsString() { return (String)debug_state_mapping.get(new Integer(state)); }
	public int getState() { return state; }
    public void setState(int pstate) { state = pstate; }

	public Object getAdapter(Class adapter) {
		if (adapter == AbstractKermetaTarget.class || adapter == KermetaDebugTarget.class)
			return this;
		else
			return super.getAdapter(adapter);
	}
	
	
	/** The class to which the step action on the DebugInterpreter instance is
	 *  delegated. */
	public KermetaStepHandler getStepHandler() { return stepHandler; }

	/**
	 * @return Returns the remotePlatform.
	 */
	public KermetaRemoteDebugUI getRemoteDebugUI() {
		return remotePlatform;
	}

	/**
	 * @return Returns the interpreter.
	 */
	public IKermetaRemoteInterpreter getRemoteInterpreter() {
		return remoteInterpreter;
	}
	
	
	public void createRemotePlatform() throws RemoteException
	{
		try
		{	
			System.err.println("2) the client (GUI)!");
			// This is where we can access the remote interpreter.
			remotePlatform    = new KermetaRemoteDebugUI(this);
			System.out.println("CLIENT REGISTERED!");
		}
		catch (Exception e)
		{
			System.err.println("EXCEPTION DE LOOKUP!");
			e.printStackTrace();
		}
	}
	
	protected Object sync = "lock";
	
	/**
	 * Start the Kermeta debug interpreter in another process (here, the "process"
	 * is in fact a Thread)
	 */
	public synchronized void startRemoteInterpreterProcess()
	{
		kermeta_process = new KermetaProcess(getStartFile(), getClassName(), getOpName(), getArgs(), remotePlatform);
		kermeta_process.start();
	}
	
	public void setRemoteInterpreter(IKermetaRemoteInterpreter remote_i)
	{
		remoteInterpreter = remote_i;
	}
}
