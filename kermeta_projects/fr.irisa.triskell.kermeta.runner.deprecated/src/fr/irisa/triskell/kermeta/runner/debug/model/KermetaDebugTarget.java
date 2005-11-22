/* $Id: KermetaDebugTarget.java,v 1.4 2005-11-22 09:28:22 zdrey Exp $
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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.IDebugEventSetListener;

import org.eclipse.debug.core.ILaunch;

import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

import fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteDebugPlatform;
import fr.irisa.triskell.kermeta.runner.debug.remote.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.ServerProcess;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaStepHandler;
import fr.irisa.triskell.kermeta.runner.debug.util.ResumeCommand;
import fr.irisa.triskell.kermeta.runner.debug.util.StepIntoCommand;
import fr.irisa.triskell.kermeta.runner.debug.util.StepOverCommand;
import fr.irisa.triskell.kermeta.runner.debug.util.SuspendCommand;
import fr.irisa.triskell.kermeta.runner.debug.util.TerminateCommand;
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
    protected KermetaRemoteDebugPlatform remotePlatform;
    protected IKermetaRemoteInterpreter remoteInterpreter;
    
    protected KermetaProcess kermeta_process;
    protected KermetaStepHandler stepHandler;
    
	/** current state of the debugger */
	private int state = -1;

	/** constant state possible for the debugger */
	public static final int stateTerminated 	= 1;
	public static final int stateRunning 		= 2;
	public static final int stateSuspended 		= 3;
	public static final int stateDisconnected 	= 4;
	
    /**
     * Constructor
     * @param launch
     */
    public KermetaDebugTarget(ILaunch plaunch) { 
    	
        launch = plaunch;
        target = this;
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
//    	try {
    		System.out.println("START");
    		
    		initialize();
    		// First, create and run the remoteInterpreter. The method automatically start
    		// it (thread inside!)
    		// Start the debug interpreter
    		startRemoteInterpreterProcess();
    		
//    		 Dirty patch, but necessary since here we want to run the KermetaInterpreter
    		// in a thread, not the interpreter listener -- created by "registerClient" method
    		// call (which is linked to this target).
    		// For this purpose we need to start 
    		try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		// Second, Register the remote platform
			try {
				registerClient();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} 
    /*	catch (RemoteException e) { e.printStackTrace(); }
		catch (InterruptedException e) { e.printStackTrace();}*/
    }
    
    /** *
     * Get the value of the variable given in parameters
     * @return
     */
    public IValue getVariableValue(KermetaVariable variable) throws DebugException
    {
        return null;
    }

    
    /** RESUME command */
    public void resume() throws DebugException {
        System.err.println("Resume event (KermetaDebugTarget.java)");
        // suspended reset to false
        setState(stateRunning);
        for (int i=0; i<threads.length; i++)
    	{
    		threads[i].resume();
    	}
        fireResumeEvent(this);
    }
    
    public void suspend() throws DebugException {
    	System.out.println("Suspend event (KermetaDebugTarget)");
    	setState(stateSuspended);
    	for (int i=0; i<threads.length; i++)
    	{
    		threads[i].suspend();
    	} 
    	fireSuspendEvent(this);
    }
    
	public void terminate() throws DebugException {
    	System.err.println("Call terminate on debug target");
		// TODO Auto-generated method stub
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
    	if (state != stateDisconnected && state != stateRunning) System.err.println("Can Resume (KDTarget)");
    	return (state != stateDisconnected && state != stateRunning);
    }

    /** @see org.eclipse.debug.core.model.ISuspendResume#canSuspend() */
    public boolean canSuspend()
    {
    	System.out.println("Can Suspend? : " );
		return !isSuspended(); 
    }

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		// TODO Auto-generated method stub
		return true;
	}

	/** @see org.eclipse.debug.core.model.IDisconnect#canDisconnect() */
    public boolean canDisconnect() { return (state != stateDisconnected); }

    /** @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#canTerminate() */
	public boolean canTerminate() { return (state != stateTerminated); }
	
	/** @see org.eclipse.debug.core.model.IDisconnect#disconnect() */
    public void disconnect() throws DebugException { setState(stateDisconnected); }
  
    /* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public void breakpointAdded(IBreakpoint breakpoint) {
		System.out.println("breakpoint added");
		super.breakpointAdded(breakpoint);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		System.out.println("breakpoint changed");
		super.breakpointChanged(breakpoint, delta);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		System.out.println("breakpoint removed");
		super.breakpointRemoved(breakpoint, delta);
	}
	
    /*
     * Implementation of IDebugTarget
     *
     */
    
    /**
     * This method is called by the graphically interface to display the thread
     * nodes of this debug target in the tree view 
     * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
     */
    public IThread[] getThreads() throws DebugException {
    	// Should not be null in fact
    	if (threads==null || threads.length==0)
    	{
    		threads = new KermetaDebugThread[1];
    		threads[0] = new KermetaDebugThread(this, "default thread");
    		// Firing should be done via a command pattern which would handle this
    		// properly and homogenely
    		fireCreationEvent(threads[0]);
    	}
    	return threads;
    }
    
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.launching.AbstractKermetaTarget#getProcess()
	 */
	public IProcess getProcess() {
		//System.err.println("getProcess in (KermetaDebugTarget) : " + kermeta_process.getDebugInterpreter());
		return kermeta_process;
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
	
	public int getState() { return state; }
    public void setState(int pstate) { state = pstate; }

	public Object getAdapter(Class adapter) {
		if (adapter == AbstractKermetaTarget.class || adapter == KermetaDebugTarget.class)
			return this;
		else
			return super.getAdapter(adapter);
	}
	
	/**
	 * process the command expressed as a string.
	 * This directly calls the method associated to this command on the
	 * DebugInterpreter instance (since it is launched in a simple java thread
	 * that we can access such). 
	 * If DebugInterpreter was run outside -- i.e 
	 * 
	 * Pydev delegates the command to specific methods. It what we should also do
	 * processThreadRun (handle the stepxxx)/processThreadSuspend
	 * TODO : a real command implementation?
	 * argument "String cmd" would become "AbstractDebugCommand cmd"
	 * @note We have only one thread for our debugger.
	 * @pattern "pseudo-command"
	 * @param cmd
	 */
	public void processCommand(String cmd)
	{
		KermetaDebugThread t = (KermetaDebugThread)threads[0];
		if ( cmd.equals(KermetaDebugElement.STEP_INTO) ) {	
			processStepIntoCommand(t);
		}
		else if ( cmd.equals(KermetaDebugElement.STEP_OVER) ) {	
			processStepOverCommand(t);
		}
		else if ( cmd.equals(KermetaDebugElement.SUSPEND) ) {
			processSuspendCommand(t, KermetaDebugElement.SUSPEND);
			
		}	
		else if ( cmd.equals(KermetaDebugElement.RESUME) ) {
			processResumeCommand(t, KermetaDebugElement.RESUME);
		}
		else if ( cmd.equals(KermetaDebugElement.TERMINATE) ) {
			processTerminateCommand(t, KermetaDebugElement.TERMINATE);
		}
		// else : do nothing
		else
		{
			System.err.println("command not understood : " + cmd);
		}
	}
	// Hem this is bavard-code.
	public void processStepOverCommand(KermetaDebugThread t) {
		new StepOverCommand(t).execute();
	}
	public void processStepIntoCommand(KermetaDebugThread t) {
		new StepIntoCommand(t).execute();
	}
	public void processTerminateCommand(KermetaDebugThread t, String str_cause) {
		new TerminateCommand(t, str_cause).execute();
	}
	public void processResumeCommand(KermetaDebugThread t, String str_cause) {
		new ResumeCommand(t, str_cause).execute();
	}
	public void processSuspendCommand(KermetaDebugThread t, String str_cause) {
		new SuspendCommand(t, str_cause).execute();
	}
	public DebugInterpreter getDebugInterpreter() {
		DebugInterpreter di = null;
		try {
			di = getRemoteInterpreter().getInterpreter();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return di;
		
	}
	
	/** The class to which the step action on the DebugInterpreter instance is
	 *  delegated. */
	public KermetaStepHandler getStepHandler() { return stepHandler; }

	/**
	 * @return Returns the remotePlatform.
	 */
	public KermetaRemoteDebugPlatform getRemotePlatform() {
		return remotePlatform;
	}

	/**
	 * @return Returns the remoteInterpreter.
	 */
	public IKermetaRemoteInterpreter getRemoteInterpreter() {
		return remoteInterpreter;
	}
	
	
	public void registerClient() throws RemoteException
	{
/*		new Thread() { public void run() { */
		try
		{	
			System.err.println("2) the client (GUI)!");
			Registry reg = LocateRegistry.getRegistry("localhost", 5002);
			
			// Proper way to wait for the server side to be "bound"
			while (reg.list().length == 0);
			// This is where we can access the remote interpreter.
			remoteInterpreter = (IKermetaRemoteInterpreter)reg.lookup("remote_interpreter");
			
			remoteInterpreter.registerKermetaRemoteDebugPlatform(new KermetaRemoteDebugPlatform(this));
			
			remoteInterpreter.execute("toto");
			System.out.println("CLIENT REGISTERED!");
		}
		catch (Exception e)
		{
			System.err.println("EXCEPTION DE LOOKUP!");
			e.printStackTrace();
		}
/*		} }.start(); */
	}
	
	/**
	 * Start the Kermeta debug interpreter in another process (here, the "process"
	 * is in fact a Thread)
	 */
	public synchronized void startRemoteInterpreterProcess()
	{
		new Thread() {
			public synchronized void run()
			{
				try
				{
					System.err.println("1) remote interpreter!");
					Registry reg = LocateRegistry.createRegistry(5002);
					IKermetaRemoteInterpreter remote_interpreter = new KermetaRemoteInterpreter(getStartFile(), getClassName(), getOpName(), getArgs());
					
					reg.bind("remote_interpreter", remote_interpreter);
					System.err.println("BOUND!");
				}
				catch (RemoteException e) {e.printStackTrace();}
				catch (AlreadyBoundException e) {e.printStackTrace();}
//				catch (MalformedURLException e) {e.printStackTrace();}
			}
		}.start();
		
	}
	
}
