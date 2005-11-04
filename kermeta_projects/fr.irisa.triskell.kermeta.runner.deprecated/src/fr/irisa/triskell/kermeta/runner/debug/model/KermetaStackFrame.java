/* $Id: KermetaStackFrame.java,v 1.1 2005-11-04 17:01:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaStackFrame.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;


/**
 * This is the specific stack frame for Kermeta debugging mode.
 * 
 */
public class KermetaStackFrame implements IStackFrame {

	/** The thread being debugged */
	public KermetaDebugThread thread;
    /**
     * 
     */
    public KermetaStackFrame(KermetaDebugThread pthread) {
        thread = pthread; 
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getThread()
     */
    public IThread getThread() {
    	System.out.println("In which thread is this frame contained?");
        return thread;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getVariables()
     */
    public IVariable[] getVariables() throws DebugException {
    	System.out.println("Get variables?");
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#hasVariables()
     */
    public boolean hasVariables() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getLineNumber()
     */
    public int getLineNumber() throws DebugException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getCharStart()
     */
    public int getCharStart() throws DebugException {
        // TODO Auto-generated method stub
        return -1;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getCharEnd()
     */
    public int getCharEnd() throws DebugException {
        // TODO Auto-generated method stub
        return -1;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getName()
     */
    public String getName() throws DebugException {
        // TODO Auto-generated method stub
        return "titi plop toto";
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#getRegisterGroups()
     */
    public IRegisterGroup[] getRegisterGroups() throws DebugException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#hasRegisterGroups()
     */
    public boolean hasRegisterGroups() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
     */
    public String getModelIdentifier() {
        return thread.getModelIdentifier();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
     */
    public IDebugTarget getDebugTarget() {
        return thread.getDebugTarget();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() {
        return thread.getLaunch();
    }

    /** @see org.eclipse.debug.core.model.IStep#canStepInto() */
    public boolean canStepInto() {
    	System.out.println("step into (KermetaStackFrame)");        
        return thread.canStepInto();
    }

    /** @see org.eclipse.debug.core.model.IStep#canStepOver() */
    public boolean canStepOver() {
    	System.out.println("step over (KermetaStackFrame)");        
        return thread.canStepOver();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStep#canStepReturn()
     */
    public boolean canStepReturn() {
    	System.out.println("step return (KermetaStackFrame)");        
        return thread.canStepReturn();
    }

    /* (non-Javadoc)
     *  TODO / ou FIXME : deleguer isStepping à la class KermetaDebugElement
     * @see org.eclipse.debug.core.model.IStep#isStepping()
     */
    public boolean isStepping() {
    	System.out.println("IS STEPPING IN (KermetaStackFrame)?");
        return thread.isStepping();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStep#stepInto()
     */
    public void stepInto() throws DebugException {
    	System.out.println("le step into qui est appelé ben il est dans KermetaStackFrame");
    	thread.stepInto();

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStep#stepOver()
     */
    public void stepOver() throws DebugException { thread.stepOver();    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStep#stepReturn()
     */
    public void stepReturn() throws DebugException { thread.stepReturn(); }
    
    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
     */
    public boolean canResume() {
    	System.out.println("Can resume in KermetaStackFrame");
        // TODO Auto-generated method stub
        return thread.canResume();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
     */
    public boolean canSuspend() {
        // TODO Auto-generated method stub
        return thread.canSuspend();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
     */
    public boolean isSuspended() {
        // TODO Auto-generated method stub
    	System.out.println("kermeta debugger stack frame : IS SUSPENDED?\n");
        return thread.isSuspended();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#resume()
     */
    public void resume() throws DebugException {
    	System.out.println("kermeta debugger stack frame : resuming\n");
    	thread.resume();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
     */
    public void suspend() throws DebugException { thread.suspend();}

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
     */
    public boolean canTerminate() { return thread.canTerminate(); }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
     */
    public boolean isTerminated() { return thread.isTerminated(); }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ITerminate#terminate()
     */
    public void terminate() throws DebugException { thread.terminate(); }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
    	System.out.println("get adapter (KermetaStackFrame)?:" + adapter);
		if( adapter == this.getClass() )
			return this;
		else
			return null;
    }

}
