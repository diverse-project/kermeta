/* $Id: AbstractKermetaTarget.java,v 1.12 2006-06-15 13:03:22 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : AbstractKermetaTarget.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 2, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.process.KermetaProcess;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLaunchConfiguration;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;


/**
 * Abstract Kermeta Target 
 */
public abstract class AbstractKermetaTarget extends DebugElement implements
		IDebugTarget, ILaunchListener {
	 
    public AbstractKermetaTarget(IDebugTarget target) {
		super(target);
	}
    

    protected IDebugTarget target;
	protected ILaunch launch;
    protected IPath workingDir;
    protected String startFile;
	protected String processName = "";
    protected String projectName;
    protected IProcess process;
    protected String className;
    protected String opName;
    protected String args;
    protected List   javaClassPathAttribute;
    
    /** The Thread that run the Kermeta interpreter */
    protected KermetaProcess kermeta_process;
    
    protected KermetaInterpreter kermetaInterpreter;
    protected KermetaLauncher kermetaLauncher;
    
    /** The path of the edited file that we are debugging */
    protected IPath path;

    /** the name of the target */
    protected String name; 
    // protected IProcess process; // useful only to launch an external command
    protected IThread[] threads;
    public final String HOST = "localhost";
    protected int requestPort;
    
    protected ArrayList breakpoints;
    /*
     *
     * 
     *  CUSTOM METHODS
     * 
     *  
     */
    /** 
     * Start the Kermeta process in a thread. This is the default start
     * If you run Kermeta in a new JVM, it is this method that you have to change. 
     * (Or inherits AbstractKermetaTarget class and overwrite it...)
     */
	/*public void startKermetaProcess()
	{
	    new Thread() {
	        public void run() {
	            this.setName("Kermeta Run Thread");
	        	// Run in a thread --> is it really useful??
	            initPath();
	            ClassLoader cl = this.getContextClassLoader();
	           // cl.getResourceAsStream()
	            KermetaLauncher.getDefault().runKermeta(startFile, className, opName, args, false);
			}
	    }.start();
	}*/
	
	
	/**
	 * [EPIC inspired] Initialize the path of the Kermeta program to Launch
	 *
	 */
	public void initPath()
	{

		try
		{
			startFile =
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
			
			args = 
				launch.getLaunchConfiguration().getAttribute(KermetaLaunchConfiguration.KM_ARGUMENTS, "");
			
			// retrieve java classPath
			javaClassPathAttribute = launch.getLaunchConfiguration().getAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, //"org.eclipse.jdt.launching.CLASSPATH"
					new java.util.ArrayList());

		} catch (Exception ce)
		{
			ce.printStackTrace();
		    //RunnerPlugin.logError("Problem loading LaunchConfiguration attributes.",ce);
		}
		
		// The IPath for this file
		path = getIPathFromString(startFile);
		projectName = RunnerPlugin.getWorkspace().getRoot().findMember(startFile).getProject().getName();
		workingDir = path.removeLastSegments(1);
		//startFile = path.lastSegment();
		startFile = RunnerPlugin.getWorkspace().getRoot().findMember(startFile).getFullPath().toString();
	}

	/*public void updateClassLoader(List pathAttribute){
		for (int i = 0; i < pathAttribute.size(); i++) {
            String memento1 = (String)pathAttribute.get(i);
            try {
                IRuntimeClasspathEntry entry1 = 
                   JavaRuntime.newRuntimeClasspathEntry(memento1);                
                // resolve this classpath entry
                org.eclipse.jdt.launching.StandardClasspathProvider resolver;
                try {
					URL url = new URL(entry1.getLocation());
				} catch (MalformedURLException e) {
					RunnerPlugin.pluginLog.warn("problem with an entry of the classpath",e);
				}
                // IRuntimeClasspathEntryResolver
              //  this.getIPathFromString()
            } catch (CoreException e) {
            	RunnerPlugin.pluginLog.warn("Problem reading classpath entry", e);
                RunnerPlugin.log(e);
            	return ;
            }
        }
    }*/
	/*
	private void processClassPathAttribute(List pathAttribute){
		for (int i = 0; i < pathAttribute.size(); i++) {
            String memento1 = (String)pathAttribute.get(i);
            try {
                IRuntimeClasspathEntry entry1 = 
                   JavaRuntime.newRuntimeClasspathEntry(memento1);
                org.eclipse.jdt.launching.StandardClasspathProvider resolver;
                
                // resolve this classpath entry
                // IRuntimeClasspathEntryResolver
              //  this.getIPathFromString()
            } catch (CoreException e) {
            	RunnerPlugin.pluginLog.warn("Problem reading classpath entry", e);
                RunnerPlugin.log(e);
            	return ;
            }
        }
	}*/

	/**
	 * @return the thread that runs the interpreter
	 */
	public KermetaProcess getKermetaProcess() { return kermeta_process; }
	public void unsetKermetaProcess() { kermeta_process = null;}
	
	/**
     *
     * 
     *  OVERRIDDEN METHODS
     * 
     *  
     */

    /** (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#getProcess()
     */
    public IProcess getProcess()
    {
    	if (process == null)
    	{
    		//process = DebugPlugin.newProcess(getLaunch(), getKermetaProcess(), "Kermeta");
    		//process = new KermetaRuntimeProcess(getLaunch(), getKermetaProcess(), "Kermeta", null);
    	}
    	return process;
    }

    /** @see org.eclipse.debug.core.model.IDebugTarget#getName() */
    public String getName() throws DebugException { return name; }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
     */
    public boolean supportsBreakpoint(IBreakpoint breakpoint) {
        if (breakpoint instanceof KermetaBreakpoint) return true;
        return false;
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
    public String getModelIdentifier() { return KermetaDebugModelPresentation.KERMETA_DEBUG_MODEL_ID; }

    /**
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() { return launch; }

    /**
     * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
     */
    public boolean canTerminate() { return false; }

    /**
     * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
     */
    public boolean isTerminated() { return false; }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#terminate()
     */
    public void terminate() throws DebugException {
    	System.err.println("TODO : implement (AbstractKermetaTarget.java)");
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#resume()
     */
    public void resume() throws DebugException {
    	System.err.println("TODO : implement (AbstractKermetaTarget.java)");
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
     */
    public void suspend() throws DebugException { 
    	System.err.println("TODO : implement (AbstractKermetaTarget.java)");
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
     */
    public void breakpointAdded(IBreakpoint breakpoint) 
    {
    	System.err.println("A breakpoint is added");
    	try {
    		if (breakpoint instanceof KermetaBreakpoint && ((KermetaBreakpoint)breakpoint).isEnabled()) {
    			KermetaBreakpoint b = (KermetaBreakpoint)breakpoint;
    			breakpoints.add(b);
    		}
    	} catch (CoreException e) {
    		e.printStackTrace();
    	}
    }
    

    /**
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
     */
    public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta)
    {
    	System.err.println("Remove a breakpoint");
		if (breakpoint instanceof KermetaBreakpoint) {
			KermetaBreakpoint b = (KermetaBreakpoint)breakpoint;
			breakpoints.remove(b);
		}
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
     */
    public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta)
    {
    	if (breakpoint instanceof KermetaBreakpoint)
    	{
    		breakpointRemoved(breakpoint, null);
    		breakpointAdded(breakpoint);
    	}
    }

    /** Return the added breakpoints */
    public ArrayList getBreakpoints() {
    	return breakpoints;
    }
   
    
    public void abort(String msg, Throwable e) 
    {
        try {
            System.err.println("My Message : " + msg);
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
    	System.err.println("getMemoryBlock (AKT)");
        return null;
    }
    
    /** This method is launched when starting the interpreter */
    public void start() { }

    /*
     * 
     *  Getters and setters
     * 
     *
     */
    
    /**
     * This method is called by the graphical interface (specifically, in the
     * "Debug" TreeView of the debug mode interface).
     * @return true if this debug target has threads, false otherwise. We set
     * it to always true since a debug with no thread has no sense.
     * @note client does not have to call it.
     * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
     */
    public boolean hasThreads() throws DebugException { return false; }
	public boolean canResume() { return false; }
	public boolean canSuspend() { return false; }
	public boolean isSuspended() { return false; }
	public boolean canDisconnect() { return false; }
	public void disconnect() throws DebugException { }

	/**
	 * @return Returns the opName.
	 */
	public String getOpName() {
		return opName;
	}
	
	/**
	 * @return Returns the projectName.
	 */
	public String getProjectName() {
		return projectName;
	}
	
	public KermetaLauncher getKermetaLauncher() {
		return kermetaLauncher;
	}
	
	public void setKermetaLauncher(KermetaLauncher klaunch) { kermetaLauncher = klaunch; }
	/**
	 * @return Returns the startFile.
	 */
	public String getStartFile() {
		return startFile;
	}
	
	/**
	 * @return Returns the path.
	 */
	public IPath getPath() {
		return path;
	}


	/**
	 * @return Returns the className.
	 */
	public String getClassName() {
		return className;
	}
	
	
	/**
	 * @return Returns the args of the operation to execute.
	 */
	public String getArgs() {
		return args;
	}


	/** @return return the KermetaInterpreter instance linked to this target */
	public KermetaInterpreter getKermetaInterpreter() {
		return kermetaInterpreter;
	}

	/** @param set the KermetaInterpreter instance */
	public void setKermetaInterpreter(KermetaInterpreter k) {
		kermetaInterpreter = k;
	}
	
	/** Custom helper method */
	public static IPath getIPathFromString(String filestring) {
		if (filestring != null)
		{
			
			IResource r = RunnerPlugin.getWorkspace().getRoot().findMember(filestring);
			// It appears that : putting in findMember method call "platform:/resource/blabla/blu"
			// returns null, but /blabla/blu returns null
			if (r == null && filestring.startsWith("platform:/resource"))
			{ // dirty patch : try to remove the prefix "platform:/resource/" in the filestring
				String subfilepath = filestring.substring("platform:/resource".length(), filestring.length());
				r = ResourcesPlugin.getWorkspace().getRoot().findMember(subfilepath);
			}
			if (r != null) return r.getLocation();
		}
		else
		{
			System.err.println("Problem when getting path of the file that is currently executed");
		}
		return null;
	}
	

	/**
	 * @see org.eclipse.debug.core.ILaunchListener#launchAdded(org.eclipse.debug.core.ILaunch)
	 */
	public void launchAdded(ILaunch launch) { 
		System.err.println("A new Launch is added");
	}
	/**
	 * @see org.eclipse.debug.core.ILaunchListener#launchChanged(org.eclipse.debug.core.ILaunch)
	 */
	public void launchChanged(ILaunch launch) {
		System.err.println("A new Launch has changed");
	}
	/**
	 * @see org.eclipse.debug.core.ILaunchListener#launchRemoved(org.eclipse.debug.core.ILaunch)
	 */
	public void launchRemoved(ILaunch launch) {
		if (launch == this.launch)
		{
			IBreakpointManager breakpointManager = DebugPlugin.getDefault().getBreakpointManager();
			breakpointManager.removeBreakpointListener(this);
		}
	}

	public Object getAdapter(Class adapter)
	{
		return super.getAdapter(adapter);
	}
}
