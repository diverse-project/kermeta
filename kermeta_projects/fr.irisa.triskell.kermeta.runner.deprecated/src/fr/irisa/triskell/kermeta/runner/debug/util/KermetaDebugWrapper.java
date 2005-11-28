/* $Id: KermetaDebugWrapper.java,v 1.4 2005-11-28 18:54:35 zdrey Exp $
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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

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
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableVariable;
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
		// TODO For each call frame create a stack frame corresponding to its properties.
		// - variable
		// if kframe_size > 0 ??
		IStackFrame[] frames = new IStackFrame[kframe_size];
		while (kframe_it.hasNext())
		{	
			Traceback traceback = null;
			CallFrame kframe = (CallFrame)kframe_it.next();
			// The current expression that is attached to this call frame
			FObject source_object = kframe.getExpression();
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
	

	/**
	 * This method get the CallFrames from the interpreter context and convert it into SerializableCallFrames
	 * that can be passed through the RMI protocol.
	 * 
	 * It is declared as synchronized to avoid concurrent access to the context of the interpreter 
	 * 
	 * @param interpreter
	 * @return
	 */
	public static synchronized SerializableCallFrame[] createSerializableCallFrames(DebugInterpreter interpreter) {

		// Get the current execution context
		InterpreterContext context = interpreter.getInterpreterContext();
		int i = 0;
		Stack framestack = context.getFrameStack();
		SerializableCallFrame[] frames = new SerializableCallFrame[framestack.size()];
		
		// "Transforming" the stack into an array avoid the risks of concurrent modification access.
		// (equiv. to a copy of the content of the stack)
		// (synchronized block did not resolve the problem!)
		// List synch_list = Collections.synchronizedList(framestack);

		Object[] framearray = framestack.toArray();
		
		for (i=0; i<framestack.size(); i++)
		{
				Traceback traceback = null;
				CallFrame kframe = (CallFrame)framearray[i];
				// The current expression that is attached to this call frame
				FObject source_object = kframe.getExpression();
				// TODO : use traceability!!!!!! gnak
				// The case "source_object == null" occurs for frame of the main operation 
				// since it is not executed as a "CallFeature" but as an "FOperation" which is 
				// not an FExpression.
				if (source_object == null)
					source_object = kframe.getOperation();
				
				traceback = new Traceback(interpreter, source_object);
				
				String[] frame_context = traceback.getContextForFObjectAsArray(kframe, source_object);
				int line = 1;
				if (frame_context[1] != null && frame_context[1].length() > 0 )
					line = Integer.parseInt(frame_context[1]); 
				
				frames[i] = new SerializableCallFrame(
						frame_context[0],
						line,
						frame_context[2],
						new SerializableVariable[1]
				);
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
