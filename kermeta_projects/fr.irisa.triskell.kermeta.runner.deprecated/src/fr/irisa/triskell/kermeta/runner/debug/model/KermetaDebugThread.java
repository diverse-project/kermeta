/* $Id: KermetaDebugThread.java,v 1.1 2005-11-04 17:01:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaThread.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IStep;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.internal.ui.actions.StepActionDelegate;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.tasklist.ITaskListResourceAdapter;

import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * A thread in the eclipse debug meaning... This class delegates all its
 * operation to KermetaDebugTarget The IThread interface implements the step
 * etc. commands Herite de KermetaDebugElement aurait eviter de recreer les
 * methodes fire pour chaque implementation d'un objet de type IDebugElement
 * (IThread, IDebugTarget, et les autres heritent tous de la class
 * IDebugElement. C'est pas clair????)
 */
public class KermetaDebugThread extends DebugElement implements IThread//, IDebugEventSetListener 
{
	// protected KermetaDebugTarget target; // si extends KermetaDebugElement,
	// alors pas utile.
	protected String name;
	
	protected KermetaDebugTarget target;
	private IStackFrame[] stackFrames;
	protected boolean isSuspended ;
	protected boolean isStepping ;

	/**
	 * The constructor
	 */
	public KermetaDebugThread(KermetaDebugTarget ptarget) {
		super(ptarget);
		target = ptarget;
		name = "keeek";
	}
	
	/** 
	 * @see org.eclipse.debug.core.model.IThread#getStackFrames()
	 */
	public IStackFrame[] getStackFrames() throws DebugException {
		if(isSuspended && stackFrames != null){
			return stackFrames;
		}
		return new IStackFrame[0];
	}

	public void setStackFrames(IStackFrame[] frames) {
		stackFrames = frames;
	}

	/** 
	 * @see org.eclipse.debug.core.model.IThread#hasStackFrames()
	 */
	public boolean hasStackFrames() throws DebugException {
		System.out.println("------------------->  Has stack frames?");
		return (getStackFrames() != null && isSuspended());
	}

	/** @see org.eclipse.debug.core.model.IThread#getPriority() */
	public int getPriority() throws DebugException {
		return 0;
	}

	/** @see org.eclipse.debug.core.model.IThread#getTopStackFrame() */
	public IStackFrame getTopStackFrame() throws DebugException {
		System.out.println("Call to getTopStackFrame! : " + getStackFrames()[0]);
		return getStackFrames()[0];
	}

	/** @see org.eclipse.debug.core.model.IThread#getName() */
	public String getName() throws DebugException {
		return "Les bidochons" ;
	}

	/** @see org.eclipse.debug.core.model.IThread#getBreakpoints() */
	public IBreakpoint[] getBreakpoints() {
		// Pydev Comment : should return breakpoint that caused this thread to suspend
		// not implementing this seems to cause no harm
		System.err.println("getBreakPoints (KermetaDzebugThread)");
		KermetaBreakpoint[] breaks = new KermetaBreakpoint[0];
		return breaks;
	}

	/** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
	public String getModelIdentifier() {
		return target.getModelIdentifier();
	}

	
	 /** @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget() */
	public IDebugTarget getDebugTarget() {
		return target;
	}

	/** @see org.eclipse.debug.core.model.IDebugElement#getLaunch() */
	public ILaunch getLaunch() {
		return target.getLaunch();
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#canResume() */
	public boolean canResume() {
		return isSuspended;
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#canSuspend() */
	public boolean canSuspend() {
		return (!isSuspended);
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#isSuspended() */
	public boolean isSuspended() {
		return isSuspended;
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#resume() */
	public void resume() throws DebugException {
		setSuspended(false);
		// Pydev implemented the command pattern to post commands that are
		// then posted to the writer thread through a commandQueue that is 
		// then listened by the server who
		//AbstractRemoteDebugger d = target.getDebugger();
		//d.postCommand(new ThreadRunCommand(d, id));
		// then processes the command.
		// target.getDebugger() <-
		target.getKermetaRemotePort().sendKermetaDebugCommand("resume");
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#suspend() */
	public synchronized void suspend() throws DebugException {
		System.out.println("kermeta debugger thread : suspending\n");
		setSuspended(true);
		System.err.println("stack : "+ stackFrames.length);
		target.getKermetaRemotePort().sendKermetaDebugCommand("suspend");
		System.err.println("toto est dans l'eau");
	}

	/** @see org.eclipse.debug.core.model.IStep#canStepInto() */
	public boolean canStepInto() {
		return (isSuspended());
	}

	/** @see org.eclipse.debug.core.model.IStep#canStepOver() */
	public boolean canStepOver() {
		return (isSuspended());
	}

	/** @see org.eclipse.debug.core.model.IStep#canStepReturn() */
	public boolean canStepReturn() {
		return (isSuspended());
	}

	 /** @see org.eclipse.debug.core.model.IStep#isStepping() */
	public boolean isStepping() {
		return isStepping;
	}
	
	/**
	 * 1st step : create a "false" frame
	 * 2nd step : get it intelligently
	 * @param suspend
	 */
	public void setSuspended(boolean suspend)
	{
		KermetaStackFrame[] frames = new KermetaStackFrame[1];
		frames[0] = new KermetaStackFrame(this);
		stackFrames = frames;
		isSuspended = suspend;
	}

	/** @see org.eclipse.debug.core.model.IStep#stepInto() */
	public void stepInto() throws DebugException {
		target.setState(KermetaDebugTarget.stateRunning);
		isStepping = true;
		target.getKermetaRemotePort().sendKermetaDebugCommand(KermetaDebugElement.STEP_INTO);
	}

	/** @see org.eclipse.debug.core.model.IStep#stepOver() */
	public void stepOver() throws DebugException {
		isStepping = true;
		target.setState(KermetaDebugTarget.stateRunning);
		target.getKermetaRemotePort().sendKermetaDebugCommand(KermetaDebugElement.STEP_OVER);
	}

	/** @see org.eclipse.debug.core.model.IStep#stepReturn() */
	public void stepReturn() throws DebugException {
		target.setState(KermetaDebugTarget.stateRunning);
		target.getKermetaRemotePort().sendKermetaDebugCommand(KermetaDebugElement.STEP_RETURN);
	}

	/** @see org.eclipse.debug.core.model.ITerminate#canTerminate() */
	public boolean canTerminate() { return target.canTerminate(); }

	/** @see org.eclipse.debug.core.model.ITerminate#isTerminated() */
	public boolean isTerminated() { return target.isTerminated(); }

	/** @see org.eclipse.debug.core.model.ITerminate#terminate() */
	public void terminate() throws DebugException { target.terminate();}

	public void setBreakpoints(String something) {

	}
}
