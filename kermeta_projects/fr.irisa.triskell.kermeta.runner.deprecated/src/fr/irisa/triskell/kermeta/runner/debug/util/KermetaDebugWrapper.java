/* $Id: KermetaDebugWrapper.java,v 1.3 2005-11-23 16:19:00 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugWrapper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 8, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteCallFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteVariable;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * This class "wraps" the KermetaInterpreter{controller} structures into the
 * structures of the KermetaDebugTarget{view} :
 * - CallFrame -> IStackFrame
 * - Variable  -> IVariable
 * - etc.
 */
public class KermetaDebugWrapper {

	
	
	/**
	 * Get all the call frames of the current context and define the IStackFrames
	 * (GUI part) accordingly.
	 * For this first version, we create 
	 * @note (not sure it has the right name)
	 * @return
	 */
	public static IStackFrame[] findStackFramesFromCallFrames(DebugInterpreter interpreter, KermetaDebugThread thread) {

		// Get the current execution context
		InterpreterContext context = interpreter.getInterpreterContext();
		
		Iterator kframe_it = context.getFrameStack().iterator();
		int i = 0;
		int kframe_size    = context.getFrameStack().size();
		// For each call frame create a stack frame corresponding to its properties.
		// - variable
		System.out.println("Number of call frames : " + kframe_size);
		// if kframe_size > 0 ??
		IStackFrame[] frames = new IStackFrame[kframe_size];
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
			// 
			KermetaStackFrame iframe = new KermetaStackFrame(
					thread, 
					frame_context[2],
					AbstractKermetaTarget.getIPathFromString(frame_context[0]),
					line);
			// if stepOver, path should be always the same and equal to the KermetaDebugTarget path attribute.
			iframe.setName("youhou? : " + frame_context[2] + "(" + frame_context[1] + ")");
			frames[i++] = iframe;
		}
		return frames;
	}
	

	// TODO : put those method in a single class
	public static RemoteCallFrame[] getRemoteCallFrames(DebugInterpreter interpreter) {

		// Get the current execution context
		InterpreterContext context = interpreter.getInterpreterContext();
		
		Iterator kframe_it = context.getFrameStack().iterator();
		int i = 0;
		int kframe_size    = context.getFrameStack().size();
		// For each call frame create a stack frame corresponding to its properties.
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
			if (source_object == null)
				source_object = kframe.getOperation();
			
			traceback = new Traceback(interpreter, source_object);
			
			String[] frame_context = traceback.getContextForFObjectAsArray(kframe, source_object);
			int line = 1;
			if (frame_context[1].length() > 0 || frame_context[1] != null)
				line = Integer.parseInt(frame_context[1]); 
			
			RemoteCallFrame iframe = new RemoteCallFrame(
					frame_context[0],
					line,
					frame_context[2],
					new RemoteVariable[1]
					);
			// if stepOver, path should be always the same and equal to the KermetaDebugTarget path attribute.
			//iframe.setName("youhou? : " + frame_context[2] + "(" + frame_context[1] + ")");
			frames[i++] = iframe;
		}
		return frames;
	}

	
	/**
	 * Get all the variables available from the given call frame.
	 * @return an array of IVariables
	 */
	protected IVariable[] findVariablesFromCallFrame(KermetaDebugTarget target, CallFrame kframe)
	{
		IVariable[] variables = null;
		return variables;
	}
	

}
