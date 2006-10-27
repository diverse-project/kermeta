/* $Id: KermetaDebugWrapper.java,v 1.18 2006-10-27 08:50:13 dvojtise Exp $
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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.LambdaCallFrame;
import fr.irisa.triskell.kermeta.interpreter.OperationCallFrame;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.interpreter.Variable;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableValue;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
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
	 * We reject the case where the framestack is null.?
	 * @param interpreter
	 * @return
	 */
	public static synchronized SerializableCallFrame[] createSerializableCallFrames(DebugInterpreter interpreter) {

		// Initialize the visible runtime objects of the current frame 
		interpreter.initVisibleRuntimeObjects();
		// Get the current execution context
		InterpreterContext context = interpreter.getInterpreterContext();

		int i = 0;
		SerializableCallFrame[] frames = null;
		Stack framestack = context.getFrameStack();
		if (framestack.size() > 0)
		{
			frames = new SerializableCallFrame[framestack.size()];
			
			// "Transforming" the stack into an array avoid the risks of concurrent modification access.
			// (equiv. to a copy of the content of the stack)
			// (synchronized block did not resolve the problem!)
			// List synch_list = Collections.synchronizedList(framestack);
			
			Object[] framearray = framestack.toArray();
			int fsize = framestack.size(); 
			for (i=fsize; i>0; i--)
			{
				Traceback traceback = null;
				CallFrame kframe = (CallFrame)framearray[i-1];
				// The case "operation == null" occurs for frame of the main operation 
				// since it is not executed as a "CallFeature" but as an "FOperation".
				fr.irisa.triskell.kermeta.language.structure.Object origin = getFrameObject(kframe);
				//if (operation == null)
				Tracer tracer = interpreter.getMemory().getUnit().getTracer();
				TextReference ref = tracer.getFirstTextReference(origin);
				
				// The current expression that is processed?
				//fr.irisa.triskell.kermeta.language.structure.Object current_node = (fr.irisa.triskell.kermeta.language.structure.Object)interpreter.getInterpreterContext().peekCallFrame().getExpression();
				fr.irisa.triskell.kermeta.language.structure.Object current_node = (fr.irisa.triskell.kermeta.language.structure.Object)interpreter.getDebugCondition().getCurrentNode();
				TextReference node_ref = null; 
				if (tracer != null)
					node_ref = tracer.getFirstTextReference(current_node);
				
				/*
				 Tracer tracer = null;
				 TextReference ref = null; */ 
				// FIXME Might it be null? Might the external ref do not exist?
				if (tracer == null || ref == null )
				{
					traceback = new Traceback(interpreter, origin);
					String[] frame_context = traceback.getContextForFObjectAsArray(kframe, current_node);
					int line = 1;
					if (frame_context[1] != null && frame_context[1].length() > 0 )
						line = Integer.parseInt(frame_context[1]); 
					
					frames[fsize-i] = new SerializableCallFrame(
							frame_context[0],
							line,
							frame_context[2],
							createSerializableVariables(kframe)
					);
				}
				else
				{
					int current_line = 0;
					String file_uri = "";
					if ( node_ref != null ) { 
						current_line = node_ref.getLine();
						file_uri = node_ref.getFileURI();
					}
					else if ( ref != null ) { 
						current_line = ref.getLine();
						file_uri = ref.getFileURI();
					}
					
					String frame_name = kframe.toString();
					
					if (current_node != null) frame_name+= current_node.toString();
					// current node can be null?
					frames[fsize-i] = new SerializableCallFrame(
							file_uri,
							current_line, // FIXME line is not well computed!
							frame_name,
							createSerializableVariables(kframe)
					);	
				}
			}
		}
		return frames;
	}

	/**
	 * Returns the object associated to the given CallFrame
	 * - If it is an OperationCallFrame :
	 * 	 the object type is an FOperation, or a FProperty if the call frame is linked
	 *   to a derived property
	 *  
	 * - if it is a LambdaCallFrame : TODO
	 * - if it is ...
	 * */
	protected static fr.irisa.triskell.kermeta.language.structure.Object getFrameObject(CallFrame frame)
	{
		fr.irisa.triskell.kermeta.language.structure.Object result = null;
		if (frame instanceof OperationCallFrame)
		{
			OperationCallFrame oframe = (OperationCallFrame)frame;
			if (oframe.isOperation())
				result = oframe.getOperation();
			else
				result = oframe.getProperty();
		}
		if (frame instanceof LambdaCallFrame)
		{   // the operation is the one of the nesting callframe if it is an operation call frame
			// null otherwise
			result = frame.getOperation();
		}	
		return result;
	}
	
	/**
	 * Get all the variables available from the given call frame.
	 * @return an array of IVariables
	 */
	protected static SerializableVariable[] createSerializableVariables(CallFrame kframe)
	{
		
		List variables = kframe.getVariables(); 
		SerializableVariable[] result = new SerializableVariable[variables.size()];
		// Avoid concurrent modification conflicts
		Object[] vars = variables.toArray();
		for (int i=0; i<vars.length; i++)
		{
			// It is said that it can be a "testPackage::TestClass"!!!!!
			// -> probably because I stored the Self OBJECT
			if (vars[i] instanceof Variable)
			{
				Variable v = ((Variable)vars[i]);
				RuntimeObject v_ro = v.getRuntimeObject(); 
				String name = v.getName();
				result[i] = createSerializableVariable(name, v_ro, null);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param ro
	 * @param isContextVar true if the variable is contained in the context, false if
	 *  it is a property of an instance (this way it is not directly included in the context
	 *  and we access it through the owner instance)
	 * @return
	 */
	public static SerializableVariable createSerializableVariable(String name, RuntimeObject ro, SerializableValue ownervalue)
	{
		SerializableVariable result = null;
		// TODO : call the right method that gets properly the type
		// String type = ro.getMetaclass().toString();
		String value = getValueStringFromRuntimeObject(ro)[0];
		String type = getValueStringFromRuntimeObject(ro)[1];
		// find the primitive data? -- 
		result = new SerializableVariable(name, type, null, ownervalue);
		SerializableValue svalue = new SerializableValue(value, type, result, ro.getOId());
		result.setValue(svalue);
		return result;
	}
	
	/**
	 * Returns the value of the given variable in a readable form. If the type is not a primitive
	 * type, return the oid of the runtime object linked to the variable (later we will improve it).
	 * result[0] = the string representation of the value
	 * result[1] = a constant that tell which type is the value. FIXME : we can get it directly
	 * from the type of the runtimeobject so this is quit redundant.
	 * FIXME !! an intelligent method that can retrieve easily the string value and the type directly
	 * from the runtime object
	 * @param var
	 * @return
	 */
	protected static String[] getValueStringFromRuntimeObject(RuntimeObject ro)
	{
		String[] result = new String[2];
		Hashtable data = ro.getData();
		result[1] = RunnerConstants.IVALUE_PRIMITIVE ;
		if (ro.getMetaclass()==null)
		{
			result[0] = ro.toString(); // this is always equal to : [< No metaclass ! > : RO_id ]   
		}
		else
		{
			String qname = 
				NamedElementHelper.getMangledQualifiedName((NamedElement)((fr.irisa.triskell.kermeta.language.structure.Class)ro.getMetaclass().getData().get("kcoreObject")).getTypeDefinition());
			if (qname.equals("kermeta::standard::String")) {
				result[0] = "\"" + data.get("StringValue").toString() + "\"";
			} else if (qname.equals("kermeta::standard::Integer")) {
				result[0] = data.get("NumericValue").toString();
			} else if (qname.equals("kermeta::standard::Character")) {
				result[0] = "'" + data.get("CharacterValue").toString() + "'";
			} else if (qname.equals("kermeta::standard::Boolean")) {
				result[0] = data.get("BooleanValue").toString();
			}
			// FIXME Is there a proper way to get the Kermeta type??
			else if (qname.equals("Collection") || qname.endsWith("Sequence"))
			{
				result[0] = "<"+qname.substring(qname.lastIndexOf(":")+1, qname.length())+">";
				result[1] = RunnerConstants.IVALUE_SET;
			}
		
			
			// Else : a link to the oId of the variable computed?
			
			else
			{
				result[0] = "<"+qname.substring(qname.lastIndexOf(":")+1, qname.length())+">";
				result[1] = RunnerConstants.IVALUE_NA ;//"[ " + Long.toString(var.getRuntimeObject().getOId()) + " ]";
			}
		}
		return result;
	}
	
	/**
	 * Get the elements contained in the runtimeObject, knowing that its type 
	 * is a Set/Collection/Sequence
	 */
	protected static SerializableVariable[] createPropertySetFromOID(DebugInterpreter interpreter, RuntimeObject ro, SerializableValue ownervalue) {
		ArrayList set = (ArrayList)ro.getData().get("CollectionArrayList");
		SerializableVariable[] variables = new SerializableVariable[set.size()];
		Iterator it = set.iterator();
		int i = 0;
		while (it.hasNext())
		{
			RuntimeObject next = (RuntimeObject)it.next();
			variables[i] = createSerializableVariable("["+i+"]", next, ownervalue);
			i += 1;
		}
		return variables;
	}


	public static SerializableVariable[] createSerializableVariablesOfSerializableValue(DebugInterpreter interpreter, SerializableValue ownervalue) {
		
		Hashtable rvalues = interpreter.getVisibleRuntimeObjects(ownervalue.runtimeOID);
		interpreter.updateVisibleRuntimeObjects(rvalues);
		// Get the RuntimeObject linked to this oid // todo : get
		//RuntimeObject o =  getRuntimeObjectForSerializableValue(interpreter, ownervalue.runtimeOID);
		SerializableVariable[] variables = null;
		variables = getPropertiesForRuntimeObject(rvalues, ownervalue);
		return variables;
	}
	
	protected static SerializableVariable[] getPropertiesForRuntimeObject(Hashtable runtime_objects, SerializableValue ownervalue)
	{
		SerializableVariable[] variables = null;
		variables = new SerializableVariable[runtime_objects.size()];
		int iv = 0;
		// Get the properties of the RuntimeObject
		Iterator it = runtime_objects.keySet().iterator();
		while (it.hasNext()) {
			// Get their name, value, create a SerializableVariable that embed them
			String key = (String)it.next();
			variables[iv++] = createSerializableVariable(key, (RuntimeObject)runtime_objects.get(key), ownervalue);
		}
		return variables;
	}

}
