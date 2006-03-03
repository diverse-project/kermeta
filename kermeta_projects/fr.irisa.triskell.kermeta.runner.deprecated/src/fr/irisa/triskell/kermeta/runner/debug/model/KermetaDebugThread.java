/* $Id: KermetaDebugThread.java,v 1.14 2006-03-03 15:23:35 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaThread.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.rmi.RemoteException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Stack;

//import org.eclipse.core.resources.IResource;
//import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
//import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
//import org.eclipse.debug.core.model.IStep;
import org.eclipse.debug.core.model.IThread;
//import org.eclipse.debug.core.model.IVariable;
//import org.eclipse.debug.internal.ui.actions.StepActionDelegate;
//import org.eclipse.ui.views.properties.IPropertySource;
//import org.eclipse.ui.views.tasklist.ITaskListResourceAdapter;

//import fr.irisa.triskell.kermeta.interpreter.CallFrame;
//import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
//import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
//import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
//import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

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
	public KermetaDebugThread(KermetaDebugTarget p_target, String p_name) {
		super(p_target);
		target = p_target;
		name = p_name!=null?p_name:"default thread";
	}
	
	/** 
	 * @see org.eclipse.debug.core.model.IThread#getStackFrames()
	 */
	public IStackFrame[] getStackFrames() throws DebugException {
		if(isSuspended && stackFrames != null){
			return stackFrames;
		}
		/** The debugger does not like when there are no frame (it seems)?*/
		return new IStackFrame[0];
	}

	public void setStackFrames(IStackFrame[] frames) {
		stackFrames = frames;
	}

	/** 
	 * @see org.eclipse.debug.core.model.IThread#hasStackFrames()
	 */
	public boolean hasStackFrames() throws DebugException {
		return (getStackFrames() != null && isSuspended());
	}

	/** @see org.eclipse.debug.core.model.IThread#getPriority() */
	public int getPriority() throws DebugException {
		return 0;
	}

	/** @see org.eclipse.debug.core.model.IThread#getTopStackFrame() */
	// This method is called when we suspend.
	public IStackFrame getTopStackFrame() throws DebugException {
		// Debug framework sometimes does not want that this method return null.
		// I have not understood yet why.
		return stackFrames == null ? null : stackFrames[0];
	}

	/** @see org.eclipse.debug.core.model.IThread#getName() */
	public String getName() throws DebugException {
		return "Kermeta thread" ;
	}

	/** @see org.eclipse.debug.core.model.IThread#getBreakpoints() */
	public IBreakpoint[] getBreakpoints() {
		// Pydev Comment : should return breakpoint that caused this thread to suspend
		// not implementing this seems to cause no harm
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

	/** @see org.eclipse.debug.core.model.ISuspendResume#isSuspended() */
	public boolean isSuspended() {
		return isSuspended;
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#canResume() */
	public boolean canResume() {
		return isSuspended();
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#canSuspend() */
	public boolean canSuspend() {
		return (!isSuspended());
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
		isSuspended = suspend;
		// Thread control the target since there is only one thread yet!
		target.setState(((suspend==false)?RunnerConstants.RESUME:RunnerConstants.SUSPEND));
			
		// Debug framework does not want that stackFrames is null...
		if (stackFrames == null || stackFrames.length == 0)
		{
			stackFrames = new KermetaStackFrame[1];
			stackFrames[0] = new KermetaStackFrame(this, "default", null, 1);
		}			
	}



	/** @see org.eclipse.debug.core.model.ISuspendResume#resume() */
	public void resume() throws DebugException {
		setSuspended(false);
		fireResumeEvent(DebugEvent.CLIENT_REQUEST);
		try {
			// direct notification on the remote platform : the remoteInterpreter's thread
			// should be blocked! 
			target.getRemoteDebugUI().notify(RunnerConstants.RESUME, RunnerConstants.CLIENT_REQUEST);
		} catch (RemoteException e) {
			e.printStackTrace();
		} 
	}

	/** @see org.eclipse.debug.core.model.ISuspendResume#suspend() */
	public void suspend() throws DebugException {
		setSuspended(true);
		// Tell the interface that an event was sent.
		fireSuspendEvent(DebugEvent.CLIENT_REQUEST);
		try {
			// notify the remote interface that a command has been sent
			target.getRemoteDebugUI().notify(RunnerConstants.SUSPEND,RunnerConstants.CLIENT_REQUEST);
		} catch (RemoteException e) {
			System.out.println("Remote exception error!");
			e.printStackTrace();
		}
	}
	
	/** @see org.eclipse.debug.core.model.IStep#stepInto() */
	public void stepInto() throws DebugException {
		step(RunnerConstants.STEP_INTO, DebugEvent.STEP_INTO);
	}

	/** @see org.eclipse.debug.core.model.IStep#stepOver() */
	public void stepOver() throws DebugException {
		step(RunnerConstants.STEP_OVER, DebugEvent.STEP_OVER);
	}

	/** @see org.eclipse.debug.core.model.IStep#stepReturn() */
	public void stepReturn() throws DebugException {
		step(RunnerConstants.STEP_RETURN, DebugEvent.STEP_RETURN);
	}

	protected void step(String stepType, int stepEvent) throws DebugException 
	{ 
		target.setState(RunnerConstants.RESUME);
		fireResumeEvent(stepEvent);
		isStepping = true;
		try {
			// This call unblocks the interpreter.
			// notify is used as well by the GUI (to tell a GUI command --here, stepInto-- is run)
			// as by the RemoteInterpreter (to tell a debugInterp. command is done)
			target.getRemoteDebugUI().notify(RunnerConstants.RESUME, stepType);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	/** @see org.eclipse.debug.core.model.ITerminate#canTerminate() */
	public boolean canTerminate() { return target.canTerminate(); }

	/** @see org.eclipse.debug.core.model.ITerminate#isTerminated() */
	public boolean isTerminated() { return target.isTerminated(); }

	/** @see org.eclipse.debug.core.model.ITerminate#terminate() */
	public void terminate() throws DebugException 
	{
		target.terminate();
		fireTerminateEvent();
	}

	public void setBreakpoints(String something) {
	}
	
}
