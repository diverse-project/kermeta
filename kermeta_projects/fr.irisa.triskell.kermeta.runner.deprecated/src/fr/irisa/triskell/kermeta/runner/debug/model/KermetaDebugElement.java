/* $Id: KermetaDebugElement.java,v 1.5 2005-12-06 18:53:15 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugElement.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 * NOTE : see Java debugger source code
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStep;
import org.eclipse.debug.core.model.IStepFilters;
import org.eclipse.debug.core.model.ISuspendResume;
import org.eclipse.debug.core.model.ITerminate;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;


/**
 * TODO remove KermetaDebugElement!
 * FIXME : We should use EClipse 3.1 helper class instead of this one (DebugElement, already
 * used by KermetaDebugThread as an inherited class) 
 * This is equivalent to PerlDB of Epic
 * 
 * Contains the commands to launch (stepInto, stepOver, etc.).
 * 
 * This class is a helper method. Using the Eclipse howto documentation,
 * it is a component of KermetaDebugTarget.
 * Pattern : Adapter? Controller?
 *  // exactly the interfaces needed by IThread!!!
 */
public abstract class KermetaDebugElement implements IDebugElement {//, ITerminate, IStep, ISuspendResume {

    public IDebugTarget target;
    
    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
     */
    public String getModelIdentifier() {
        // TODO Auto-generated method stub
        System.err.println("model identifier!");
        return  RunnerPlugin.getUniqueIdentifier();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
     */
    public IDebugTarget getDebugTarget() {
        return target.getDebugTarget();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() {
        return target.getLaunch();
    }


    /*
     * Convenience methods 
     *
     */
    
    /**
     * Fire a debug event
     * @param event the event to be fired by the listeners : after the debug event occured, it has to be fired
     * by the listener who caught it....
     * debugElement is a kind of observer
     */
    public void fireEvent(DebugEvent event) {
        DebugPlugin.getDefault().fireDebugEventSet(new DebugEvent[] {event});
        
        }
    
    public void fireCreationEvent(Object eventSource) {
        System.err.println("creation event");
        fireEvent(new DebugEvent(eventSource, DebugEvent.CREATE));
        }
    
    /**
     * The fire<action>Event methods 
     * @param eventSource the UI element that generated/caused this event.
     */
    public void fireResumeEvent(Object eventSource) 
    {	fireEvent(new DebugEvent(eventSource, DebugEvent.RESUME, DebugEvent.CLIENT_REQUEST)); }
    
    public void fireSuspendEvent(Object eventSource) throws DebugException {
    	fireEvent(new DebugEvent(eventSource, DebugEvent.SUSPEND, DebugEvent.CLIENT_REQUEST));
    }
	
	/** Fires a debug event marking the termination of this element. */
	public void fireTerminateEvent() {
		System.err.println("Terminate event");
		fireEvent(new DebugEvent(this, DebugEvent.TERMINATE));}

	/**
	 * Fires a debug event marking the CHANGE of this element
	 * with the specifed detail code.
	 * @param detail one of <code>STATE</code> or <code>CONTENT</code>
	 */
	public void fireChangeEvent(Object eventSource) { 
	    fireEvent(new DebugEvent(eventSource, DebugEvent.CHANGE, DebugEvent.CONTENT));}
    
    /*
     * 
     * Delegators
     * 
     */
     
    /*
     * Accessors
     *
     */
	
    /**
     * Delegator. (Simply calls target.getThreads)
     * @return Returns the threads.
     * @throws DebugException 
     */
    public IThread[] getThreads() throws DebugException {
        return null; //target.getThreads();
    }

    /**
     * Identical to DebugElement and PlatformObject
     */
  	public Object getAdapter(Class adapter) {
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
    
    
}
