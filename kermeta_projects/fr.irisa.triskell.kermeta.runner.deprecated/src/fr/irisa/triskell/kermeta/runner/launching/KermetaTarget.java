/* $Id: KermetaTarget.java,v 1.2 2005-09-09 18:04:21 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaTarget.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 16, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.ui.DebugUITools;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * The base target class for Run target and Debug target
 */
public abstract class KermetaTarget implements IDebugTarget {

    public boolean isTerminated;
	protected ILaunch launch;
    protected IPath workingDir;
    protected String startFile;
	protected String startfile = null;
	protected String processName = "";
    protected String projectName;
    protected Process javaProcess;
    protected IProcess process;
    protected String className;
    protected String opName;

    protected IDebugTarget target;
    // protected IProcess process; // useful only to launch an external command
    protected IThread thread;
    protected IThread[] threads;
    
    
    public final String HOST = "localhost";
    /** The socket for debug commands */
    protected Socket requestSocket;
    protected PrintWriter requestWriter;
    protected BufferedReader requestReader;
    protected BufferedReader eventReader;
    /** The socket for debug events */
    protected Socket eventSocket;
    
    protected int requestPort;
    
    // Essentially used for KermetaDebugTarget yet
    /** true if the execution process is suspended */
    protected boolean suspended;
	
    /**
     *
     * 
     *  CUSTOM METHODS
     * 
     *  
     */
    /** 
     * Start the Kermeta process in a thread
     * If you run Kermeta in a new JVM, it is this method that you have to change. 
     * (Or inherits KermetaTarget class and overwrite it...)
     */
	public void startKermetaProcess()
	{
	    // Use this if does not work
	    final String p_startfile = startfile;
	    final String p_classname = className;
	    final String p_opname    = opName;
	    
	    new Thread() {
	        public void run() {
	    // Run in a thread
	            initPath();
	            KermetaLauncher.launch(startfile, className, opName, false);
			}
	    }.start();
	}
	
	
	/**
	 * [EPIC inspired] Initialize the path of the Kermeta program to Launch
	 *
	 */
	public void initPath()
	{

		try
		{
			startfile =
				launch.getLaunchConfiguration().getAttribute(
					KermetaLaunchConfiguration.KM_FILENAME,
					"");
			projectName =
				launch.getLaunchConfiguration().getAttribute(
					KermetaLaunchConfiguration.KM_PROJECTNAME,
					"");
			
			className = 
			    launch.getLaunchConfiguration().getAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME, "");
			
			opName = 
			    launch.getLaunchConfiguration().getAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME, "");

		} catch (Exception ce)
		{
			ce.printStackTrace();
		   // RunnerPlugin.logException(ce);
		}
		
		/*IProject prj =
			RunnerPlugin.getWorkspace().getRoot().getProject(prjName);
		mProjectDir = prj.getLocation();
		IPath path = mProjectDir.append(startfile);*/
		
		// The IPath for this file
		IPath path = RunnerPlugin.getWorkspace().getRoot().findMember(startfile).getLocation();
		projectName = RunnerPlugin.getWorkspace().getRoot().findMember(startfile).getProject().getName();
		workingDir = path.removeLastSegments(1);
		startFile = path.lastSegment();
		

	}

	
	
	
    /**
     *
     * 
     *  OVERRIDDEN METHODS
     * 
     *  
     */
	
    public KermetaTarget(ILaunch launch) {
       // super(launch);
        this.launch = launch;
        this.isTerminated = false;
    }
    

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#getProcess()
     */
    public IProcess getProcess() {
        // TODO Auto-generated method stub
        System.err.println("Get the process");
        return null;
    }


    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#getName()
     */
    public String getName() throws DebugException {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
     */
    public boolean supportsBreakpoint(IBreakpoint breakpoint) {
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
     */
    public String getModelIdentifier() {
        return null;
    }

    /**
     * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
     */
    public IDebugTarget getDebugTarget() {
        return this;
    }

    /**
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() {
        return launch;
    }

    /**
     * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
     */
    public boolean canTerminate() {
        return !isTerminated;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
     */
    public boolean isTerminated() {
        return isTerminated;
    }

    /**
     * @see org.eclipse.debug.core.model.ITerminate#terminate()
     */
    public void terminate() throws DebugException {
		isTerminated = true;
		DebugEvent event = new DebugEvent(getDebugTarget(), DebugEvent.TERMINATE);
		DebugEvent debugEvents[] = new DebugEvent[1];
		debugEvents[0] = event;
		DebugPlugin.getDefault().fireDebugEventSet(debugEvents);
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
     */
    public boolean canResume() {
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
     */
    public boolean canSuspend() {
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
     */
    public boolean isSuspended() {
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#resume()
     */
    public void resume() throws DebugException {

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
     */
    public void suspend() throws DebugException {
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
     */
    public void breakpointAdded(IBreakpoint breakpoint) {
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
     */
    public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
     */
    public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
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
    
    public void abort(String msg, Throwable e) 
    {
        try {
            System.err.println(msg);
            System.err.println(e);
            e.printStackTrace();
            terminate();
        } catch (DebugException de) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
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
    public IMemoryBlock getMemoryBlock(long startAddress, long length)
            throws DebugException {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
        return null;
    }
    
    /** This method is launched when starting the interpreter */
    public void start()
    {}

    /*
     * 
     *  Getters and setters
     * 
     *
     */
    
    
    
    
    /**
     * @return Returns the requestReader.
     */
    public BufferedReader getRequestReader() {
        return requestReader;
    }
    /**
     * @return Returns the requestWriter.
     */
    public PrintWriter getRequestWriter() {
        return requestWriter;
    }
    /**
     * @return Returns the target.
     */
    public IDebugTarget getTarget() {
        return target;
    }
}
