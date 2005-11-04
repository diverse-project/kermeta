package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLaunchConfiguration;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;

public abstract class AbstractKermetaTarget extends KermetaDebugElement implements
		IDebugTarget, ILaunchListener {
	 
    protected ILaunch launch;
    protected IPath workingDir;
    protected String startFile;
	protected String processName = "";
    protected String projectName;
    protected IProcess process;
    protected String className;
    protected String opName;

    protected String name; // the name of the target
    // protected IProcess process; // useful only to launch an external command
    // protected KermetaDebugThread thread;
    protected IThread[] threads;
    public final String HOST = "localhost";
    protected int requestPort;
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
     * (Or inherits AbstractKermetaTarget class and overwrite it...)
     */
	public void startKermetaProcess()
	{
	    System.out.println("Run kermeta process");
	    new Thread() {
	        public void run() {
	    // Run in a thread
	            initPath();
	            KermetaLauncher.launch(startFile, className, opName, false);
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
		IPath path = RunnerPlugin.getWorkspace().getRoot().findMember(startFile).getLocation();
		projectName = RunnerPlugin.getWorkspace().getRoot().findMember(startFile).getProject().getName();
		workingDir = path.removeLastSegments(1);
		//startFile = path.lastSegment();
		startFile = RunnerPlugin.getWorkspace().getRoot().findMember(startFile).getFullPath().toString();
	}

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
    	return process; 
    }

    /** @see org.eclipse.debug.core.model.IDebugTarget#getName() */
    public String getName() throws DebugException { return name; }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
     */
    public boolean supportsBreakpoint(IBreakpoint breakpoint) {
        return true;
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
    public String getModelIdentifier() { return RunnerPlugin.getUniqueIdentifier(); }

    /**
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() { return launch; }

    /**
     * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
     */
    public boolean canTerminate() { return false; }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
     */
    public boolean isTerminated() {
        return false;
    }

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
    public void breakpointAdded(IBreakpoint breakpoint) { }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
     */
    public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) { }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
     */
    public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) { }

   
    
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
        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#getMemoryBlock(long, long)
     */
    public IMemoryBlock getMemoryBlock(long startAddress, long length)
            throws DebugException {
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
    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
     */
    public boolean hasThreads() throws DebugException {
    	System.err.println("Has tread in abstract class?");
        return true;
    }


	public boolean canResume() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean canSuspend() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean isSuspended() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean canDisconnect() {
		// TODO Auto-generated method stub
		return false;
	}


	public void disconnect() throws DebugException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return Returns the opName.
	 */
	public String getOpName() {
		return opName;
	}	/**
	 * @return Returns the projectName.
	 */
	public String getProjectName() {
		return projectName;
	}	/**
	 * @return Returns the startFile.
	 */
	public String getStartFile() {
		return startFile;
	}
	/**
	 * @return Returns the className.
	 */
	public String getClassName() {
		return className;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.ILaunchListener#launchAdded(org.eclipse.debug.core.ILaunch)
	 */
	public void launchAdded(ILaunch launch) {
		// TODO Auto-generated method stub
		System.err.println("A new Launch is added");
		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.ILaunchListener#launchChanged(org.eclipse.debug.core.ILaunch)
	 */
	public void launchChanged(ILaunch launch) {
		// TODO Auto-generated method stub
		System.err.println("A new Launch has changed");
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.ILaunchListener#launchRemoved(org.eclipse.debug.core.ILaunch)
	 */
	public void launchRemoved(ILaunch launch) {
		// TODO Auto-generated method stub
		System.err.println("A new Launch is removed");
		
	}

	public Object getAdapter(Class adapter)
	{
		return super.getAdapter(adapter);
	}
	

	
}
