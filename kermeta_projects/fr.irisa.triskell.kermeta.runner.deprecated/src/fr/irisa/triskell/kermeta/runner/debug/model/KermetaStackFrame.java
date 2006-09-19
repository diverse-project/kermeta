/* $Id: KermetaStackFrame.java,v 1.8 2006-09-19 14:38:55 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaStackFrame.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.tasklist.ITaskListResourceAdapter;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.traceability.helper.Tracer;


/**
 * Eclipse doc : a stack frame represents an execution context in a suspended thread.
 * A stack frame contains variables representing visible locals and arguments at
 * the current execution location.
 * 
 * Important note for developers : quite all the elements extend the Eclipse 
 * 3.1 "DebugElement". DebugElement defines a method, called "getAdapter" that
 * must be implemented for all the elements in debug.model package, since it is 
 * used to layout properly those elements in the debug view. In the particular 
 * exemple of KermetaStackFrame, "getAdapter" definition is
 * used to layout the variables contained by the stack frame, in the Variables view.
 * 
 * <em>GUI<->Interpreter : KermetaStackFrame<->CallFrame</em>
 */
public class KermetaStackFrame extends DebugElement implements IStackFrame {
	
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
	protected String filepath; // path of the file where the operation associated to the stack frame is located
	
    /**
     * 
     * @param p_thread the thread to which this frame belongs
     * @param p_line the position in the file of the debug state
     */
    public KermetaStackFrame(KermetaDebugThread p_thread, String p_name, IPath p_path, int p_line) {
        super(p_thread.getDebugTarget());
    	thread = p_thread;
        line   = p_line;
        name   = p_name;
        path = p_path;
        variables = new KermetaVariable[0];
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

    /**
     * @see org.eclipse.debug.core.model.IStackFrame#hasVariables()
     */
    public boolean hasVariables() throws DebugException {
       return (variables != null && variables.length > 0);
    }

    /** @see org.eclipse.debug.core.model.IStackFrame#getLineNumber() */
    public int getLineNumber() throws DebugException {
    	return line;
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
        return name + "   line " + line;
    }

    /** (don't know what it is used for)
     * @see org.eclipse.debug.core.model.IStackFrame#getRegisterGroups()
     */
    public IRegisterGroup[] getRegisterGroups() throws DebugException {
        return null;
    }

    /** @see org.eclipse.debug.core.model.IStackFrame#hasRegisterGroups() */
    public boolean hasRegisterGroups() throws DebugException {
        return false;
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
    public String getModelIdentifier() {
        return thread.getModelIdentifier();
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget() */
    public IDebugTarget getDebugTarget() {
        return thread.getDebugTarget();
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getLaunch() */
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

    /** @see org.eclipse.debug.core.model.IStep#canStepReturn() */
    public boolean canStepReturn() {        
        return thread.canStepReturn();
    }

    /** TODO / ou FIXME : deleguer isStepping à la class KermetaDebugElement
     * @see org.eclipse.debug.core.model.IStep#isStepping() */
    public boolean isStepping() {
    	System.out.println("IS STEPPING IN (KermetaStackFrame)?");
        return thread.isStepping();
    }

    /** @see org.eclipse.debug.core.model.IStep#stepInto() */
    public void stepInto() throws DebugException { thread.stepInto(); }

    /** @see org.eclipse.debug.core.model.IStep#stepOver() */
    public void stepOver() throws DebugException { thread.stepOver();    }

    /** @see org.eclipse.debug.core.model.IStep#stepReturn() */
    public void stepReturn() throws DebugException { thread.stepReturn(); }
    
    /** @see org.eclipse.debug.core.model.ISuspendResume#canResume() */
    public boolean canResume() { return thread.canResume(); }

    /** @see org.eclipse.debug.core.model.ISuspendResume#canSuspend() */
    public boolean canSuspend() { return thread.canSuspend(); }

    /** @see org.eclipse.debug.core.model.ISuspendResume#isSuspended() */
    public boolean isSuspended() { return thread.isSuspended(); }

    /** @see org.eclipse.debug.core.model.ISuspendResume#resume() */
    public void resume() throws DebugException { thread.resume(); }

    /** @see org.eclipse.debug.core.model.ISuspendResume#suspend() */
    public void suspend() throws DebugException { thread.suspend();}

    /** @see org.eclipse.debug.core.model.ITerminate#canTerminate() */
    public boolean canTerminate() { return thread.canTerminate(); }

    /** @see org.eclipse.debug.core.model.ITerminate#isTerminated() */
    public boolean isTerminated() { return thread.isTerminated(); }

    /** @see org.eclipse.debug.core.model.ITerminate#terminate() */
    public void terminate() throws DebugException { thread.terminate(); }

    /*
     * 
     *  G E T T E R S   A N D   S E T T E R S
     * 
     * 
     */
    public void setPath(IPath p_path)  { path = p_path; }
    public void setLine(int p_line)  { line = p_line; }
    public void setName(String p_name) {name = p_name; }
    public void setVariables(IVariable[] p_vars) { variables = p_vars; }
    /**
     * This path is used by the KermetaSourceLocator.getEditorInput method, which
     * is itself called somewhere in the DebugFramework to locate the editor to "point" 
     * to on debug mode (like for highlighting line number )
     * FIXME : the path should change according..
     */
	public IPath getPath() { 
		//return path;
		if (path == null)
			return AbstractKermetaTarget.getIPathFromString(
			((KermetaDebugTarget)getDebugTarget()).getStartFile()
		);
		return path;
	}
	

}
