/* $Id: KermetaDebugTarget.java,v 1.14 2005-12-20 08:55:56 zdrey Exp $
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
import org.eclipse.debug.internal.ui.actions.ResumeActionDelegate;
import org.eclipse.update.configurator.ConfiguratorUtils;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaStepHandler;
/**
 * KermetaDebugTarget, is the object of the debug framework that communicates 
 * with the Kermeta interpreter.
 * Many source code come from the Eclipse Howto ("How to create an Eclipse
 * debugger" -- www.eclipse.org/articles/Article-Debugger/how-to.html ).
 *  
 */
public class KermetaDebugTarget extends AbstractKermetaTarget
{ 
    protected KermetaRemoteDebugUI remotePlatform;
    protected IKermetaRemoteInterpreter remoteInterpreter;
    private Registry reg;
    
    protected KermetaProcess kermeta_process;
    protected KermetaStepHandler stepHandler;
    /** Can be RunnerConstants.RESUME, TERMINATE, SUSPEND */
    protected String state;
    
    /**
     * Constructor
     * @param launch the launch handled by this debug target.
     */
    public KermetaDebugTarget(ILaunch plaunch) { 
    	
        launch = plaunch;
        target = this;
        breakpoints = new ArrayList();
        stepHandler = new KermetaStepHandler(this);
        this.name = "Kermeta Debug Target";
        // Create a default thread
		this.threads = new IThread[0];
        // Do not set to stateDisconnected
        setState(RunnerConstants.RESUME);
        

		initialize();
        
        getLaunch().addDebugTarget(this);
        DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
        DebugPlugin.getDefault().getLaunchManager().addLaunchListener(this);
    }
    
    public IDebugTarget getDebugTarget() { return this; }
    
    /**
     * Method launched by the KermetaLaunchConfigurationDelegate instance.
     * It initialize itself, creates the GUI side of the RMI comm.
     * and starts the Kermeta remote interpreter.
     */
    public synchronized void start()
    {
    	// Create the KermetaDebugPlatform that will be driven by the KermetaDebugTarget
    	try {
    		// Create the remote platform
    		createRemotePlatform();
    		
    		// Start the debug interpreter in a separate process
    		startRemoteInterpreterProcess();
    	} 
    	catch (RemoteException e) { e.printStackTrace(); }
    }
    
	/**
	 * Start the Kermeta debug interpreter in another process (here, the "process"
	 * is in fact a Thread)
	 */
	public synchronized void startRemoteInterpreterProcess()
	{
		kermeta_process = new KermetaProcess(getStartFile(), getClassName(), getOpName(), getArgs(), remotePlatform);
		kermeta_process.start();
	}
	

    /** resume command called by Eclipse when user clicks on the resume button */
    public void resume() throws DebugException {
        // suspended reset to false
        setState(RunnerConstants.RESUME);
        for (int i=0; i<threads.length; i++)
    	{
    		threads[i].resume();
    	}
        fireResumeEvent(this);
    }
    
    /** suspend command called by Eclipse when user clicks on the suspend button */
    public void suspend() throws DebugException {
    	setState(RunnerConstants.SUSPEND);
    	for (int i=0; i<threads.length; i++)
    	{
    		threads[i].suspend();
    	} 
    	fireSuspendEvent(this);
    }
    
    /** terminate command called by Eclipse when user clicks on the stop button */
	public void terminate() throws DebugException {
		setState(RunnerConstants.TERMINATE);
    	// No more thread running!
		threads = new IThread[0];
		try {
			// This call unblocks the interpreter.
			// notify is used as well by the GUI (to tell a GUI command --here, stepInto-- is run)
			// as by the RemoteInterpreter (to tell a debugInterp. command is done)
			this.getRemoteDebugUI().notify(RunnerConstants.TERMINATE, RunnerConstants.CLIENT_REQUEST);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		fireTerminateEvent();
        //launch.removeDebugTarget(this);
	}
    
    
    /** @see org.eclipse.debug.core.model.ISuspendResume#isTerminated() */
	public boolean isTerminated() {
		return (state.equals(RunnerConstants.TERMINATE));
	} 
    /** @see org.eclipse.debug.core.model.ISuspendResume#isSuspended() */
    public boolean isSuspended() { 
    	return (state.equals(RunnerConstants.SUSPEND)); 
    }
    /** @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#isDisconnected() */
	public boolean isDisconnected() { return (state.equals(RunnerConstants.DISCONNECT)); }

    
    /*
     * DELEGATORS
     */
    
    /** @see org.eclipse.debug.core.model.ISuspendResume#canResume() */
    public boolean canResume() {
    	return (kermeta_process!=null && !isDisconnected() && isSuspended());
    }

    /** @see org.eclipse.debug.core.model.ISuspendResume#canSuspend() */
    public boolean canSuspend() 
    {
    	return threads.length>0 && !isSuspended() && !isTerminated(); 
    }

	/**
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public boolean supportsBreakpoint(IBreakpoint breakpoint) { return true; }

	/** @see org.eclipse.debug.core.model.IDisconnect#canDisconnect() */
    public boolean canDisconnect() { return (kermeta_process!=null && !isDisconnected()); }

    /** @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#canTerminate() */
	public boolean canTerminate() { return (kermeta_process!=null && !isTerminated()); }
	
	/** @see org.eclipse.debug.core.model.IDisconnect#disconnect() */
    public void disconnect() throws DebugException { setState(RunnerConstants.DISCONNECT); }
  
    /*
     * Implementation of IDebugTarget
     *
     */
    
    /**
     * This method is implicitely called inside the Eclipse framework in order 
     * to display the thread nodes of this debug target in the tree view 
     * This method is not allowed to return null!
     * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
     */
    public IThread[] getThreads() throws DebugException {
    	if (threads==null) // testing length is important || threads.length==0)
    	{
    		threads = new IThread[0];
    		//fireCreationEvent(threads[0]);
    	}
    	return threads;
    }
    
    public boolean hasThreads() throws DebugException { 
    	return (threads!=null && threads.length>0); }
    
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
		setState(RunnerConstants.RESUME);
	}
	
	/**
	 * Installs all Java breakpoints that currently exist in
	 * the breakpoint manager
	 */
	protected void initializeBreakpoints()
	{
		IBreakpointManager manager= DebugPlugin.getDefault().getBreakpointManager();
		manager.addBreakpointListener(this);
		IBreakpoint[] bps = manager.getBreakpoints(getModelIdentifier());
		for (int i = 0; i < bps.length; i++) {
			if (bps[i] instanceof IBreakpoint) {
				breakpointAdded(bps[i]);
			}
		}
/*
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
		*/
	}

	/**
	 * When users sends a command via a button an event is generated, than, handled by this method.
	 */
	public void handleDebugEvents(DebugEvent[] events) {
		// TODO Auto-generated method stub
		System.err.println("Debug! : "+events.length + " -> " + events[0]);
	}
	
	/**
	 * Create the GUI side of the RMI communication
	 * @throws RemoteException
	 */
	public void createRemotePlatform() throws RemoteException
	{
		try
		{	
			System.err.println("2) the client (GUI)!");
			// This is where we can access the remote interpreter.
			remotePlatform    = new KermetaRemoteDebugUI(this);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	// Easier since we share Strings most of the time
	public String getState() { return state; }
    public void setState(String pstate) { state = pstate; }

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

	public void setRemoteInterpreter(IKermetaRemoteInterpreter remote_i)
	{
		remoteInterpreter = remote_i;
	}
	
	public KermetaProcess getKermetaProcess() { return kermeta_process; }
	public void unsetKermetaProcess() { kermeta_process = null;}

	/** Create a thread once the debugger has started */
	public void createThread() {
		threads = new KermetaDebugThread[1];
		threads[0] = new KermetaDebugThread(this, "default thread");
		fireCreationEvent(threads[0]);
		fireResumeEvent(this);
	} 
	
	
}
