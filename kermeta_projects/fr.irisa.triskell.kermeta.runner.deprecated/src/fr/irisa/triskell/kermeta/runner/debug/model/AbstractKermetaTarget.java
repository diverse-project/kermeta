/* $Id: AbstractKermetaTarget.java,v 1.24 2008-02-15 14:34:39 dvojtise Exp $
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

import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStepFilters;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.console.RunnerConsole;
import fr.irisa.triskell.kermeta.runner.debug.process.KermetaProcess;
import fr.irisa.triskell.kermeta.runner.launching.ConstraintRunTarget;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLaunchConfiguration;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;


/**
 * Abstract Kermeta Target 
 */
public abstract class AbstractKermetaTarget implements IDebugElement,
		IDebugTarget, ILaunchListener, IStepFilters {

	protected IOConsole console;
	
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
    protected List<String>   javaClassPathAttribute;
    
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
    
    protected ArrayList<IBreakpoint> breakpoints;
    
    public AbstractKermetaTarget(ILaunch launch) {
		this.launch = launch;
        target = this;
	}
	
	/**
	 * [EPIC inspired] Initialize the path of the Kermeta program to Launch
	 *
	 */
	public void initPath() throws KermetaInterpreterError {

		try {
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
					new java.util.ArrayList<String>());

		} catch (Exception ce) {
			ce.printStackTrace();
		    //RunnerPlugin.logError("Problem loading LaunchConfiguration attributes.",ce);
		}
		
		// The IPath for this file
		path = getIPathFromString(startFile);
		if ( path == null )
			throw new KermetaInterpreterError("File Path from Launch Configuration is invalid. Please correct it before running the file.");
		
		projectName = ResourcesPlugin.getWorkspace().getRoot().findMember(startFile).getProject().getName();
		workingDir = path.removeLastSegments(1);
		//startFile = path.lastSegment();
		startFile = ResourcesPlugin.getWorkspace().getRoot().findMember(startFile).getFullPath().toString();
	}
	/** retrieve the path of the project if this is a java project */ 
	protected String getCurrentProjectOutputPath() {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
    	IProject theProject = myWorkspaceRoot.getProject(this.getProjectName());
    	
    	String currentProjectPath = null;
    	if(theProject != null)
    		if (theProject.exists() && theProject.isOpen())
    		{
    			try {
					if(theProject.getNature(org.eclipse.jdt.core.JavaCore.NATURE_ID) != null){
						//currentProjectPath = theProject.getLocation().toString();
						
						currentProjectPath = ResourceHelper.root.getLocation().toString();
						IJavaProject javaProj = JavaCore.create(theProject);
						currentProjectPath += javaProj.getOutputLocation().toString();
						
					}
				} catch (CoreException e) {
					// we don't care, just ignore this project for the class path
				}
    		}
		return currentProjectPath;
	}
	
	/** retreives the requires pathes used by the current project */
	protected IClasspathEntry[] getCurrentProjectRequiredEntries() {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
    	IProject theProject = myWorkspaceRoot.getProject(this.getProjectName());
    	
    	if(theProject != null)
    		if (theProject.exists() && theProject.isOpen())
    		{
    			try {
					if(theProject.getNature(org.eclipse.jdt.core.JavaCore.NATURE_ID) != null){
						
						IJavaProject javaProj = JavaCore.create(theProject);
						return javaProj.getResolvedClasspath(true);
						
					}
				} catch (CoreException e) {
					// we don't care, just ignore this project for the class path
				}
    		}
		return null;
	}
	
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

    /**
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
     */
    public void breakpointAdded(IBreakpoint breakpoint) 
    {
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
    public ArrayList<IBreakpoint> getBreakpoints() {
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
			
			IResource r = ResourcesPlugin.getWorkspace().getRoot().findMember(filestring);
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
	/*
	 *  Some custom initializations
	 * 
	 */
	
	/** Initialize the run console for the Run mode. This method is not 
	 * defined in AbstractKermetaTarget, since we only need to create a specific console in Run mode.
	 */
	public void initConsole(AbstractKermetaTarget target)
	{
		String shortname = startFile.contains("/")?startFile.substring(startFile.lastIndexOf("/")+1):startFile;
	    String consolename = shortname + " - "+ className + "::" + opName;
	    if(this instanceof ConstraintRunTarget) consolename += " (pre/post activated)";
	    //console = new KermetaConsole(consolename, this);
	    RunnerConsole runnerConsole = new RunnerConsole(consolename, null);
	    runnerConsole.setTarget( target );
	    console = new EclipseConsole( runnerConsole );
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

	/* -------------------------------------------------------------------------
	 * 
	 * IDebugElement related stuffs
	 * 
	 * -------------------------------------------------------------------------
	 */

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
		if (adapter == IDebugElement.class) {
			return this;
		}
		if (adapter == IStepFilters.class) {
			return getDebugTarget();
		}
		if (adapter == IDebugTarget.class) {
			return getDebugTarget();
		}
		if (adapter == ILaunch.class) {
		    return getLaunch();
		}
		if (adapter == IProcess.class) {
		    return getDebugTarget().getProcess();
		}
		if (adapter == IDebugElement.class) {
  			return this;
  		}
		return
  		InternalPlatform.getDefault().getAdapterManager().getAdapter(this, adapter);
    }

	/**
	 * Fires a debug event.
	 * 
	 * @param event debug event to fire
	 */
	public void fireEvent(DebugEvent event) {
		DebugPlugin.getDefault().fireDebugEventSet(new DebugEvent[] {event});
	}    

	/**
	 * Fires a change event for this debug element
	 * with the specified detail code.
	 * 
	 * @param detail detail code for the change event,
	 *  such as <code>DebugEvent.STATE</code> or <code>DebugEvent.CONTENT</code>
	 */
	public void fireChangeEvent(int detail) {
		fireEvent(new DebugEvent(this, DebugEvent.CHANGE, detail));
	}
	
	/**
	 * Fires a creation event for this debug element.
	 */
    public void fireCreationEvent() {
		fireEvent(new DebugEvent(this, DebugEvent.CREATE));
	}	
	
	/**
	 * Fires a resume for this debug element with
	 * the specified detail code.
	 * 
	 * @param detail detail code for the resume event, such 
	 *  as <code>DebugEvent.STEP_OVER</code>
	 */
    public void fireResumeEvent(int detail) {
		fireEvent(new DebugEvent(this, DebugEvent.RESUME, detail));
	}
	
	/**
	 * Fires a suspend event for this debug element with
	 * the specified detail code.
	 * 
	 * @param detail detail code for the suspend event, such
	 *  as <code>DebugEvent.BREAKPOINT</code>
	 */
    public void fireSuspendEvent(int detail) {
		fireEvent(new DebugEvent(this, DebugEvent.SUSPEND, detail));
	}	
	
	/**
	 * Fires a terminate event for this debug element.
	 */
    public void fireTerminateEvent() {
		fireEvent(new DebugEvent(this, DebugEvent.TERMINATE));
	}
    
    /** Weird method but mandatory.. */
	public IDebugTarget getDebugTarget() {
		return this;
	}
	
	/**
	 * Throws a debug exception with a status code of <code>TARGET_REQUEST_FAILED</code>.
	 * 
	 * @param message exception message
	 * @param e underlying exception or <code>null</code>
	 * @throws DebugException
	 */
	protected void requestFailed(String message, Throwable e) throws DebugException {
		throw new DebugException(new Status(IStatus.ERROR, DebugPlugin.getUniqueIdentifier(), 
				DebugException.TARGET_REQUEST_FAILED, message, e));
	}
	
	/**
	 * Throws a debug exception with a status code of <code>NOT_SUPPORTED</code>.
	 * 
	 * @param message exception message
	 * @param e underlying exception or <code>null</code>
	 * @throws DebugException
	 */
	protected void notSupported(String message, Throwable e) throws DebugException {
		throw new DebugException(new Status(IStatus.ERROR, DebugPlugin.getUniqueIdentifier(), 
				DebugException.NOT_SUPPORTED, message, e));
	}
	protected boolean stepFilter  =false;
	
	public boolean isStepFiltersEnabled() {
	
		return stepFilter;
	}


	public void setStepFiltersEnabled(boolean enabled) {
		stepFilter = enabled;
		
	}


	public boolean supportsStepFilters() {
		
		return stepFilter;
	}

	/**
	 * @return the console
	 */
	public IOConsole getConsole() {
		return console;
	}

	/**
	 * @param console the console to set
	 */
	public void setConsole(IOConsole console) {
		this.console = console;
	}

	
}
