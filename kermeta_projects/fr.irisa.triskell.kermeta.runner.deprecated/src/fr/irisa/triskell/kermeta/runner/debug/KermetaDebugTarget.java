/* $Id: KermetaDebugTarget.java,v 1.1 2005-09-09 17:57:41 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugTarget.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug;

import java.io.BufferedReader;
import java.io.PrintWriter;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;
import fr.irisa.triskell.kermeta.runner.launching.KermetaTarget;
/**
 * KermetaDebugTarget, for the DEBUG_MODE.
 * Many source code come from the Eclipse Howto ("How to create an Eclipse
 * debugger" -- www.eclipse.org/articles/Article-Debugger/how-to.html ).
 * This is the object that communicates with the Kermeta interpreter.
 * 
 * This is the debuggable execution process/VM of a KermetaProgram
 * To create a DebugTarget using a new JVM to run the interpreter, user
 * should inherits KermetaTarget or this one.
 */
public class KermetaDebugTarget extends KermetaTarget implements ILaunchListener {

    protected KermetaDebugElement debugger;
    
    protected KermetaRemotePort debugPort;
    
    /**
     * @param launch
     */
    public KermetaDebugTarget(ILaunch launch) {
        super(launch);
    }

    /**
     * @param launch
     * @param requestPort
     * @param eventPort
     */
    public KermetaDebugTarget(ILaunch plaunch, int prequestPort, int eventPort) {
        super(plaunch); 
        launch = plaunch;
        target = this;
        DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
        DebugPlugin.getDefault().getLaunchManager().addLaunchListener(this);
    }
    
    /**
     * @param launch
     * @param p
     * @param requestPort
     * @param eventPort
     */
    public KermetaDebugTarget(ILaunch plaunch, IProcess pprocess, int prequestPort, int eventPort) {
        super(plaunch); 
        launch = plaunch;
        target = this;
        process = pprocess;
        DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
        DebugPlugin.getDefault().getLaunchManager().addLaunchListener(this);
    }
    
    /**
     * This method is called when user is in debug mode.
     * It is launched by the KermetaLaunchConfigurationDelegate after initialization
     * and launch of the Kermeta interpreter itself.
     * TODO : here should be done the following things :
     * - the stack frame and the variables values display on UI
     * - the interpretation of the commands sent by the user
     * - the file being debugged
     */
    public void start()
    {
        System.out.println("Launch Kermeta Debug mode!");
        // Debugger waits for an event that never comes
        if (connectDebugger(true) != KermetaRemotePort.waitOK)
            try {
                terminate();
                System.out.println("connection to debugger has ended");
            } catch (DebugException e) {
                System.err.println("Y a une debug exception!!");
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
    
    /** *
     * Get the value of the variable given in parameters
     * @return
     */
    public IValue getVariableValue(KermetaVariable variable) throws DebugException
    {
    /*    synchronized (requestSocket)
        {
            requestWriter.println("var "
            + variable.getStackFrame().getModelIdentifier()
            + " " + variable.getName());
            requestWriter.flush();
            try {
                String value = requestReader.readLine();
                return new KermetaValue(this, value);
            }
            catch (IOException e)
            {
                System.err.println("IO exception occured in KermetaDebugTarget.getVariableValue : "+ e);
                abort(MessageFormat.format("Unable to retrieve value for variable {0}",
                      new String[]{variable.getName()}), e);
            }
        };*/
        return null;
    }

    
    /** RESUME command */
    public void resume() throws DebugException {
        // suspended reset to false
        suspended = false;
        //debugger.resume(this);
        // thread.fireResumeEvent
    }
    
    /**
     * @see org.eclipse.debug.core.model.IDebugTarget#getProcess()
     */
    public KermetaDebugElement getDebugger()
    {
        if (debugger == null)
        // not good
            debugger = new KermetaDebugElement(this);

        return debugger;
    }
    
    /* 
     * 
     * THE FOLLOWING METHODS IS A SET OF METHODS BORROWED FROM EPIC Perl PLUGIN.
     * THANK THEM!
     * 
     */
    
    
    /**
     * Connect the debugger via a port
     */
    public int connectDebugger(boolean timeout)
    {
        // Try to connect to the debug port
        int res = connectDebugPort(timeout);
        // If connection failed, return the error number
        if (  res != KermetaRemotePort.waitOK)
            return res;
        // Try now to create the debugger interface
        try
        {
            debugger = new KermetaDebugElement(this);
            System.err.println("debugger connected!");
        } catch (Exception e)
        {
            e.printStackTrace();
            RunnerPlugin.getDefault().logError(
                    "Failing to create the KermetaDebugElement!",
                    e);
            return KermetaRemotePort.waitError;
        }
        
        return (KermetaRemotePort.waitOK);
    }
    
    
    /** 
     * This method try to connect to the debug port by creating
     * the KermetaRemotePort connection handler
     * @param timeout
     * @return
     */
    public int connectDebugPort(boolean timeout)
    {   
        // Test this ?  if( debugPort == null ) 
        debugPort = new KermetaRemotePort();
        debugPort.startConnect();
        System.err.println("Connected to debug port!");
        // Now we can start the kermeta process!
        startKermetaProcess(debugPort);
        System.err.println("Kermeta process started!");
        // Handle a failed connection
        int res = debugPort.waitForConnect(timeout);
        if ( res  == KermetaRemotePort.waitError)
            RunnerPlugin.errorDialog("Could not connect to Debug-Port !");
        
        return res;
    }
    
    /** 
     * Start the Kermeta process in a thread
     * If you run Kermeta in a new JVM, it is this method that you have to change. 
     * (Or inherits KermetaTarget class and overwrite it...)
     */
	public void startKermetaProcess(KermetaRemotePort debugPort)
	{
	    // Use this if does not work
	    final String p_startfile = startfile;
	    final String p_classname = className;
	    final String p_opname    = opName;
	    final KermetaRemotePort f_debugPort = debugPort;
	    
	    /*new Thread() {
	        public void run() {*/
	    // Run in a thread, in debug mode!
	            initPath();
	            DebugInterpreter interpreter = (DebugInterpreter)KermetaLauncher.launch(startfile, className, opName, true);
	            // Add the interpreter to the server
	            f_debugPort.setInterpreter(interpreter);
		/*	}
	    }.start();*/
	}
	
	public PrintWriter getDebugWriteStream()
    {
        return debugPort.getWriteStream();
    }
    
    public BufferedReader getDebugReadStream()
    {
        return debugPort.getReadStream();
    }
    
    public KermetaRemotePort getKermetaRemotePort() { return debugPort; }
	
    
    /*
     * Implementation of IDebugTarget
     *
     */
    
    /**
     * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
     */
    public IThread[] getThreads() throws DebugException {
        return debugger.getThreads();
    }

    /**
     * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
     */
    public boolean hasThreads() throws DebugException {
        System.err.println("HAS THREAD METHOD CALL");
        if (debugger == null)
            return false;
        else return (debugger.getThreads() != null);
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.ILaunchListener#launchRemoved(org.eclipse.debug.core.ILaunch)
     */
    public void launchRemoved(ILaunch launch) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.ILaunchListener#launchAdded(org.eclipse.debug.core.ILaunch)
     */
    public void launchAdded(ILaunch launch) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.ILaunchListener#launchChanged(org.eclipse.debug.core.ILaunch)
     */
    public void launchChanged(ILaunch launch) {
        // TODO Auto-generated method stub
        
    }
    
    
	/**
	 * Initialize event requests and state from the underlying VM.
	 * This method is synchronized to ensure that we do not start
	 * to process an events from the target until our state is
	 * initialized.
	 */
	protected synchronized void initialize() {
		initializeBreakpoints();
		getLaunch().addDebugTarget(this);
		debugger.fireCreationEvent();
	}
	
	/**
	 * Installs all Java breakpoints that currently exist in
	 * the breakpoint manager
	 */
	protected void initializeBreakpoints() {
		IBreakpointManager manager= DebugPlugin.getDefault().getBreakpointManager();
		manager.addBreakpointListener(this);
		IBreakpoint[] bps = manager.getBreakpoints(RunnerPlugin.PLUGIN_ID);
		for (int i = 0; i < bps.length; i++) {
			if (bps[i] instanceof IBreakpoint) { // FIXME : KermetaBreakPoint instead of IBreakPoint
				breakpointAdded(bps[i]);
			}
		}
	}

    
}
