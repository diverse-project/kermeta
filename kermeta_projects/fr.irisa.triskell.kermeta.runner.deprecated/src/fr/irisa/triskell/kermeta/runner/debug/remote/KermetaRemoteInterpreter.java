/* $Id: KermetaRemoteInterpreter.java,v 1.1 2005-11-22 09:31:35 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Stack;

import org.eclipse.debug.core.model.IStackFrame;

import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteCallFrame;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;
import fr.irisa.triskell.kermeta.structure.FObject;


public class KermetaRemoteInterpreter extends UnicastRemoteObject implements IKermetaRemoteInterpreter {

	
	/** The client that ask requests to the interpreter */
	public IKermetaRemoteDebugPlatform remoteDebugPlatform;
	public DebugInterpreter interpreter;
	public String startfile;
	public String classname;
	public String opname;
	public String args;
	
	// "degraded" Objects that represent the interpreter context
	public RemoteCallFrame[] frames; 
	 
	
	public KermetaRemoteInterpreter(String p_startfile, String p_classname, String p_opname, String p_args) throws RemoteException {
		super(); 
		startfile = p_startfile;
		classname = p_classname;
		opname    = p_opname;
		args      = p_args;
		createKermetaInterpreter();
		
	}

	/**
	 * Execute the command defined by the given argument
	 */
	public Object execute(String command) throws RemoteException {
		// Memory access
		
		if (command.equals("suspend"))
		{
			System.out.println("suspend");
			// setFrames(interpreter.getContext())
			// frames = interpreter.findStackFramesFromCallFrames();
			Stack frame_stack = interpreter.getInterpreterContext().getFrameStack();
			frames = findStackFramesFromCallFrames(interpreter);
			
		}
		if (command.equals("stepInto"))
		{
			System.out.println("salut toto");
			interpreter.invoke_debug();
			
		}
		remoteDebugPlatform.notify(command);
		return null;
	}
	
	/** Register the client which is the KermetaDebugPlatform*/
	public void registerKermetaRemoteDebugPlatform(IKermetaRemoteDebugPlatform p_debugplatform) throws RemoteException {
		remoteDebugPlatform = p_debugplatform;
	}
	
	
	/**
	 * Creates the Kermeta interpreter and sets it to the KermetaDebugTarget.
	 * If the interpreter is launched under a separate process, it is this method
	 * that you need to redefine.
	 *
	 */
	public void createKermetaInterpreter()
	{
		//Instanciate the debug interpreter
		System.err.println("START FILE : " + startfile);
        KermetaInterpreter global_interpreter = KermetaLauncher.getDefault().runKermeta(
        		startfile, classname, opname, args, true);
        
        interpreter = (DebugInterpreter)global_interpreter.getMemory().getCurrentInterpreter();
        
       // interpreter.invoke_debug();
	}
	


	/**
	 * @return Returns the interpreter.
	 */
	public DebugInterpreter getInterpreter() {
		return interpreter;
	}

	/**
	 * @param interpreter The interpreter to set.
	 */
	public void setInterpreter(DebugInterpreter interpreter) {
		this.interpreter = interpreter;
	}
	

	/**
	 * @return Returns the remoteDebugPlatform.
	 */
	public IKermetaRemoteDebugPlatform getRemoteDebugPlatform() {
		return remoteDebugPlatform;
	}
	
	public void setFrames(RemoteCallFrame[] frame)
	{
		
	}
	
	public RemoteCallFrame[] getFrames()
	{
		return frames;
	}

	// TODO : put those method in a single class
	public RemoteCallFrame[] findStackFramesFromCallFrames(DebugInterpreter interpreter) {

		// Get the current execution context
		InterpreterContext context = interpreter.getInterpreterContext();
		
		Iterator kframe_it = context.getFrameStack().iterator();
		int i = 0;
		int kframe_size    = context.getFrameStack().size();
		// For each call frame create a stack frame corresponding to its properties.
		// - variable
		System.out.println("Number of call frames : " + kframe_size );
		// if kframe_size > 0 ??
		RemoteCallFrame[] frames = new RemoteCallFrame[kframe_size];
		while (kframe_it.hasNext())
		{	
			Traceback traceback = null;
			CallFrame kframe = (CallFrame)kframe_it.next();
			// The current expression that is attached to this call frame
			FObject source_object = kframe.getExpression();
			System.out.println("expression : " + kframe.getExpression() );
			// TODO : use traceability!!!!!! gnak
			// The case "expression == null" occurs for frame of the main operation 
			// since it is not executed as a "CallFeature" but as an "FOperation" which is 
			// not an FExpression.
			// Thus, here is an "astuce" to work around this problem. Not sure it is the best one.
			if (source_object == null)
				source_object = kframe.getOperation();
			
			traceback = new Traceback(interpreter, source_object);
			String[] frame_context = traceback.getContextForFObjectAsArray(kframe, source_object);
			int line;
			if (frame_context[1].equals("") || frame_context[1] == null)
				line = 1;
			else
				line = Integer.parseInt(frame_context[1]); 
			System.err.println("iframe : " + frame_context[0]);
			// 
			RemoteCallFrame iframe = new RemoteCallFrame(
					line,
					frame_context[2],
					new RemoteVariable[1],
					frame_context[0]
					);
			// if stepOver, path should be always the same and equal to the KermetaDebugTarget path attribute.
			//iframe.setName("youhou? : " + frame_context[2] + "(" + frame_context[1] + ")");
			frames[i++] = iframe;
		}
		return frames;
	}

	
	/*
	 * 
	 *  A C C E S S O R S
	 * 
	 */
	

}
