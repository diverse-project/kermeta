/* $Id: KermetaDebugWrapper.java,v 1.5 2005-12-01 18:29:07 zdrey Exp $
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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.interpreter.Variable;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaValue;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaVariable;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableValue;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableVariable;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * This class "wraps" the KermetaInterpreter{controller} structures into the
 * structures of the KermetaDebugTarget{view} :
 * - CallFrame -> IStackFrame
 * - Variable  -> IVariable
 * - etc.
 */
public class KermetaDebugWrapper {

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
				// The case "operation == null" occurs for frame of the main operation 
				// since it is not executed as a "CallFeature" but as an "FOperation".
				FObject operation = kframe.getOperation();
				Tracer tracer = interpreter.getMemory().getUnit().getTracer();
				TextReference ref = tracer.getFirstTextReference(operation);
				
				// The current expression that is processed?
				//FObject current_node = (FObject)interpreter.getInterpreterContext().peekCallFrame().getExpression();
				FObject current_node = (FObject)interpreter.getDebugCondition().getCurrentNode();
				TextReference node_ref = tracer.getFirstTextReference(current_node);
				
				/*
				Tracer tracer = null;
				TextReference ref = null; */ 
				// Might it be null? Might the external ref do not exist?
				if (tracer == null || ref == null)
				{
					traceback = new Traceback(interpreter, operation);
					String[] frame_context = traceback.getContextForFObjectAsArray(kframe, operation);
					int line = 1;
					if (frame_context[1] != null && frame_context[1].length() > 0 )
						line = Integer.parseInt(frame_context[1]); 
					
					frames[i] = new SerializableCallFrame(
							frame_context[0],
							line,
							frame_context[2],
							createSerializableVariables(kframe)
					);
				}
				else
				{
					int current_line = node_ref!=null?node_ref.getLine():ref.getLine();
					String frame_name = current_node!=null?kframe.toString() + current_node.toString():kframe.toString();
						
					frames[i] = new SerializableCallFrame(
							ref.getFileURI(),
							current_line, // FIXME line is not well computed!
							frame_name,
							createSerializableVariables(kframe)
					);	
				}
		}
		return frames;
	}

	
	
	
	/**
	 * Get all the variables available from the given call frame.
	 * @return an array of IVariables
	 */
	protected static SerializableVariable[] createSerializableVariables(CallFrame kframe)
	{
		
		Hashtable variables = kframe.getVariables();
		SerializableVariable[] result = new SerializableVariable[variables.size()];
		// Avoid concurrent modification conflicts
		Object[] vars = variables.values().toArray();
		for (int i=0; i<vars.length; i++)
		{
			Variable v = ((Variable)vars[i]);
			String name = v.getName();
			// TODO : call the right method that gets properly the type
			String type = v.getRuntimeObject().getMetaclass().toString();
			String value = getValueStringFromVariable(v);
			// find the primitive data? -- 
			result[i] = new SerializableVariable(name, type, new SerializableValue(value));
		}
		return result;
	}
	
	/**
	 * Returns the value of the given variable in a readable form. If the type is not a primitive
	 * type, return the oid of the runtime object linked to the variable (later we will improve it). 
	 * @param var
	 * @return
	 */
	protected static String getValueStringFromVariable(Variable var )
	{
		String result = null;
		Hashtable data = var.getRuntimeObject().getData();
		
		String qname = 
		KMTHelper.getQualifiedName((FNamedElement)((FClass)var.getRuntimeObject().getMetaclass().getData().get("kcoreObject")).getFClassDefinition());
		if (qname.endsWith("String")) result = data.get("StringValue").toString();
		else if (qname.endsWith("Integer")) result = data.get("NumericValue").toString();
		else if (qname.endsWith("Character")) result = data.get("CharacterValue").toString();
		else if (qname.endsWith("Boolean")) result = data.get("BooleanValue").toString();
		// Else : a link to the oId of the variable computed?
		else result = "[ " + Long.toString(var.getRuntimeObject().getOId()) + " ]";
		//v.getRuntim
		return result;
	}

}
