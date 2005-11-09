/* $Id: KermetaStackFrame.java,v 1.2 2005-11-09 15:31:35 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaStackFrame.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.traceability.helper.Tracer;


/**
 * Eclipse doc : a stack frame represents an execution context in a suspended thread.
 * A stack frame contains variables representing visible locals and arguments at
 * the current execution location.
 * 
 * <em>GUI<->Interpreter : KermetaStackFrame is linked to CallFrame</em>
 */
public class KermetaStackFrame implements IStackFrame {
	
	/*
	 * custom properties 
	 */
	
	/** The path of the file where the stackframe of our debug state is located */
	protected IPath path;
	
	/*
	 * mandatory properties
	 */
	/** The thread being debugged */
	public KermetaDebugThread thread;
	/** The position of the debug in the file that we debug */
	protected int line;
	protected String name; // name of the stack frame 
	protected IVariable[] variables;
	
    /**
     * 
     * @param p_thread the thread to which this frame belongs
     * @param p_line the position in the file of the debug state
     */
    public KermetaStackFrame(KermetaDebugThread p_thread, int p_line) {
        thread = p_thread;
        line   = p_line;
    }

    /**
     * @see org.eclipse.debug.core.model.IStackFrame#getThread()
     */
    public IThread getThread() {
        return thread;
    }

    /**
     * @see org.eclipse.debug.core.model.IStackFrame#getVariables()
     */
    public IVariable[] getVariables() throws DebugException {
        return variables;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStackFrame#hasVariables()
     */
    public boolean hasVariables() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /** @see org.eclipse.debug.core.model.IStackFrame#getLineNumber() */
    public int getLineNumber() throws DebugException {
    	System.err.println("LINE : "+ line);
    	return 5; //line;
    }

    /** @see org.eclipse.debug.core.model.IStackFrame#getCharStart() */
    public int getCharStart() throws DebugException {
        return -1;
    }

    /** @see org.eclipse.debug.core.model.IStackFrame#getCharEnd() */
    public int getCharEnd() throws DebugException {
        return -1;
    }

    /** @see org.eclipse.debug.core.model.IStackFrame#getName() */
    public String getName() throws DebugException {
        return name;
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
        return thread.canStepInto();
    }

    /** @see org.eclipse.debug.core.model.IStep#canStepOver() */
    public boolean canStepOver() {        
        return thread.canStepOver();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IStep#canStepReturn()
     */
    public boolean canStepReturn() {        
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

    /** @see org.eclipse.debug.core.model.ITerminate#isTerminated() */
    public boolean isTerminated() { return thread.isTerminated(); }

    /** @see org.eclipse.debug.core.model.ITerminate#terminate() */
    public void terminate() throws DebugException { thread.terminate(); }

    /** @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class) */
    public Object getAdapter(Class adapter) {
    	if( adapter == this.getClass() )
			return this;
		else
			return null;
    }
    
    
    /*
     * 
     *  G E T T E R S   A N D   S E T T E R S
     * 
     * 
     */
    
    public void setPath(IPath p_path)  { path = p_path; }
    public void setName(String p_name) {name = p_name; }

    // "Custom" getter
	public IPath getPath() { 
		//return path;
		return ((KermetaDebugTarget)getDebugTarget()).getIPathFromString(
			((KermetaDebugTarget)getDebugTarget()).getStartFile()
		);
		
	}
	
	protected int findLineNumberFromUnit()
	{
		KermetaInterpreter kinterpreter = ((KermetaDebugTarget)getDebugTarget()).getKermetaInterpreter();
		Tracer tracer = kinterpreter.getUnit().getTracer();
		if (tracer != null)
		{
			// I should work with the tracer.
		}
		
		return -1;
	}
	
	

}
