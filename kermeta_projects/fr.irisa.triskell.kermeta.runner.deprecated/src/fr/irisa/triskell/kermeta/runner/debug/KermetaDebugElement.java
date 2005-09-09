/* $Id: KermetaDebugElement.java,v 1.1 2005-09-09 17:57:41 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugElement.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 * NOTE : see Java debugger source code
 */
package fr.irisa.triskell.kermeta.runner.debug;

import java.io.PrintWriter;
import java.util.Hashtable;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ITerminate;
import org.eclipse.debug.core.model.IThread;


/**
 * TODO remove KermetaDebugElement! 
 * This is equivalent to PerlDB of Epic
 * 
 * Contains the commands to launch (stepInto, stepOver, etc.).
 * 
 * This class is a helper method. Using the Eclipse howto documentation,
 * it is a component of KermetaDebugTarget.
 * Pattern : Adapter? Controller?
 */
public class KermetaDebugElement implements IDebugElement, ITerminate {

    protected KermetaDebugTarget target; // Contains the useful informations for this class
    
    /** TODO : document */
    protected PrintWriter debugIn;
    
    public static final int step_into_int = 0;
    public static final int step_over_int = 1;
    protected static Hashtable command_mapping;

    private KermetaDebugThread thread;

    private IThread[] threads;
 
    static {
        	command_mapping = new Hashtable();
        	command_mapping.put("stepInto", new Integer(step_into_int));
        	command_mapping.put("stepOver", new Integer(step_over_int));
        }
    /**
     * This is the "debugger" that is started and handle the debug commands
     */
    public KermetaDebugElement(KermetaDebugTarget pTarget) {
        target = pTarget;
        thread = new KermetaDebugThread(target);
        threads = new IThread[] {thread};
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
     */
    public String getModelIdentifier() {
        // TODO Auto-generated method stub
        System.err.println("model identifier!");
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
     */
    public IDebugTarget getDebugTarget() {
        return target;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() {
        return target.getLaunch();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
     */
    public boolean canTerminate() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
     */
    public boolean isTerminated() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#terminate()
     */
    public void terminate() throws DebugException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *  
     * */
	public void generateDebugInitEvent() throws DebugException {
		DebugEvent event = null;

		event = new DebugEvent(target.getThreads()[0], DebugEvent.SUSPEND,
				DebugEvent.STEP_END);
		DebugEvent debugEvents[] = new DebugEvent[1];
		debugEvents[0] = event;
		DebugPlugin.getDefault().fireDebugEventSet(debugEvents);
	}
	
    /** 
     * The step by step command
     * @param dest_thread the destination thread
     *
     */
    public void stepOver(Object dest_thread) throws DebugException 
    {
        System.err.println("User tried to step over");
        thread = (KermetaDebugThread)dest_thread;
        startKermetaDebugCommand("stepOver", true);
        //sendRequest("step");
    }
    
    /** 
     * Pseudo-command pattern implementation.
     * 
     */
    protected boolean startKermetaDebugCommand(String cmd, boolean spawn) {
		int command = ((Integer)command_mapping.get(cmd)).intValue();
		switch (command) {
			case step_into_int : //
			    System.err.println("step into command!");
				target.getDebugWriteStream().println("stepInto\n");
				target.getKermetaRemotePort().getInterpreter().stepOver();
				break;

			case step_over_int :
			    System.err.println("step over command!");
			    target.getDebugWriteStream().println("stepOver\n");
			    
				break;
			default :
			    System.err.println("NO COMMAND!!!");
				return (false);
		}
		
		generateDebugEvent(command, true, target);
		
		return true;
    }
    
    /** Generate a debug event so that Eclipse debugger is aware of it */
    public void generateDebugEvent(int command, boolean start, Object commandDest) {
        System.err.println("Generate Debug event");
		DebugEvent event = null;
		int stepEventKind;
		int stepEventEndDetail;
		
		switch (command) {
		case step_into_int :
		    event = new DebugEvent(commandDest, DebugEvent.RESUME,
		            DebugEvent.STEP_INTO);
		    break;
		    
		case step_over_int :
		    System.err.println("STEP OVER");
		    event = new DebugEvent(commandDest, DebugEvent.RESUME,
		            DebugEvent.STEP_OVER);
		    break;
		}
		
		if (event != null) {
		    DebugEvent debugEvents[] = new DebugEvent[1];
		    debugEvents[0] = event;
		    DebugPlugin.getDefault().fireDebugEventSet(debugEvents);
		}
	}
    
    /*
     * Convenience methods 
     *
     */
    
    /**
     * Fire a debug event 
     * @param event the event to be fired by the listeners
     */
    public void fireEvent(DebugEvent event) {
        DebugPlugin.getDefault().fireDebugEventSet(new DebugEvent[] {event});
        }
    
    public void fireCreationEvent() {
        System.err.println("creation event");
        fireEvent(new DebugEvent(this, DebugEvent.CREATE));
        }
    
    public void fireResumeEvent(int detail) 
    {	fireEvent(new DebugEvent(this, DebugEvent.RESUME, detail)); }
    
    public void fireSuspendEvent(int detail) {
	fireEvent(new DebugEvent(this, DebugEvent.SUSPEND, detail)); }
	
	/** Fires a debug event marking the termination of this element. */
	protected void fireTerminateEvent() {
		fireEvent(new DebugEvent(this, DebugEvent.TERMINATE));}

	/**
	 * Fires a debug event marking the CHANGE of this element
	 * with the specifed detail code.
	 * @param detail one of <code>STATE</code> or <code>CONTENT</code>
	 */
	public void fireChangeEvent(int detail) { 
	    fireEvent(new DebugEvent(this, DebugEvent.CHANGE, detail));}
    
    /*
     * 
     * Delegators
     * 
     */
    public boolean canStepOver() { return true;}
    
    /*
     * Accessors
     *
     */
    

    /**
     * @return Returns the debugIn.
     */
    public PrintWriter getDebugIn() {
        return debugIn;
    }
    /**
     * @return Returns the target.
     */
    public KermetaDebugTarget getTarget() {
        return target;
    }
    /**
     * @return Returns the thread.
     */
    public KermetaDebugThread getThread() {
        return thread;
    }
    /**
     * @return Returns the threads.
     */
    public IThread[] getThreads() {
        return threads;
    }

    /**
     * @param thread2
     */
    public void suspend(KermetaDebugThread thread2) {
        startKermetaDebugCommand("suspend", true);
    }
}
