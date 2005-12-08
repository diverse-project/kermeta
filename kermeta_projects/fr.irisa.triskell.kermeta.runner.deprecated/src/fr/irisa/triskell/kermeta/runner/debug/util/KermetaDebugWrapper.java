/* $Id: KermetaDebugWrapper.java,v 1.8 2005-12-08 08:55:51 zdrey Exp $
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
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.debug.internal.ui.elements.adapters.DeferredVariable;

import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.interpreter.Variable;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaValue;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaVariable;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableValue;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
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
	 * We reject the case where the framestack is null.?
	 * @param interpreter
	 * @return
	 */
	public static synchronized SerializableCallFrame[] createSerializableCallFrames(DebugInterpreter interpreter) {

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
		String qname = 
		KMTHelper.getQualifiedName((FNamedElement)((FClass)ro.getMetaclass().getData().get("kcoreObject")).getFClassDefinition());
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
		// Get the RuntimeObject linked to this oid // todo : get
		RuntimeObject o =  getRuntimeObjectForSerializableValue(interpreter, ownervalue);
		SerializableVariable[] variables = null;
		// if the RO has properties (and is not a collection)
		if (o != null && o.getProperties() != null 
				&& (o.getData().get("CollectionArrayList")==null
				|| ((ArrayList)o.getData().get("CollectionArrayList")).isEmpty()	)) // can getProperties be null or only emprty?
		{
			variables = getPropertiesForRuntimeObject(o, ownervalue);
		}
		// If the RuntimeObject type is in fact a Set:
		// TODO : set a special icon for them!
		else if (o != null && o.getData().get("CollectionArrayList") != null)
		{
			variables = createPropertySetFromOID(interpreter, o, ownervalue);
		}
		else
		{
			System.out.println("unknown type : " + o  + ": "+ ownervalue.valueString + ownervalue.runtimeOID);
			 
		}
		
		return variables;
	}
	
	protected static SerializableVariable[] getPropertiesForRuntimeObject(RuntimeObject o, SerializableValue ownervalue)
	{
		SerializableVariable[] variables = null;
		variables = new SerializableVariable[o.getProperties().size()];
		int iv = 0;
		// Get the properties of the RuntimeObject
		Enumeration e = o.getProperties().keys();
		while (e.hasMoreElements()) {
			// Get their name, value, create a SerializableVariable that embed them
			String nkey = (String)e.nextElement();
			RuntimeObject rovalue = (RuntimeObject)o.getProperties().get(nkey);
			
			variables[iv] = createSerializableVariable(nkey, rovalue, ownervalue);
			iv+=1;
			
		}
		
		return variables;
	}
	
	
	/**
	 * Find and return the RuntimeObject that belongs to the interpreter context,
	 * and to which is linked (as a property or a property of the property) the 
	 * RO given by runtimeOID.
	 * 
	 * @return
	 * @deprecated
	 * Does not work since the SerializableVariable/Value always change (we recreate 
	 * them at each access of the context)
	 */
	public static RuntimeObject getContextVariableOwnerForSerializableValue(DebugInterpreter interpreter, SerializableValue svalue)
	{
		// Get the ownerOID of given
		System.out.println("var : " + svalue  );
		RuntimeObject result = interpreter.getRuntimeObjectByOID(svalue.runtimeOID);
		// If the svalue does not reference to a variable in the interpreter context,
		// Then, try to find its owner
		if (result == null) {
			System.out.println("ref var : " + svalue.refVar + "- oid :"+ svalue.runtimeOID);
			System.out.println(interpreter.getRuntimeObjectByOID(svalue.runtimeOID));
			result = getContextVariableOwnerForSerializableValue(interpreter, svalue.refVar.ownerValue);
			if (result != null) return result;
		}
		
		return result; 
	}
	
	/** Return the list of OID corresponding to the given list of RuntimeObjects */
	public static RuntimeObject getRuntimeObjectFromOID(Collection ro_set, long oid)
	{
		Iterator ro_it = ro_set.iterator();
		RuntimeObject result = null;
		while (ro_it.hasNext() && result == null)
		{
			RuntimeObject o = (RuntimeObject)ro_it.next();
			if (oid == o.getOId()) 
				result = o;
			else if (o.getProperties()!=null)
			{
				result = getRuntimeObjectFromOID(o.getProperties().values(), oid);
				// if result is still null, perhaps the searched object is contained
				// in a collection (that is : "o" would be a collection)
				ArrayList contents = (ArrayList)o.getData().get("CollectionArrayList");
				if (result == null && contents!=null && !contents.isEmpty()) 
					result = getRuntimeObjectFromOID(contents, oid);
			}
		}
		return result;
	}

	/** 
	 * Get the runtime object linked to this serailizable value. Since the expected RO is not
	 * always in the interpreter context if it is a property of the RO, we have to get the main runtimeObject to which the
	 * researched one is linked by a "property-owned" or a "collection-contained" relationship. 
	 */
	public static RuntimeObject getRuntimeObjectForSerializableValue(DebugInterpreter interpreter, SerializableValue value)
	{
		RuntimeObject result = null;
		// First, get the first RuntimeObject that is indirectly linked to this value in the int. context
		// RuntimeObject ro = getContextVariableOwnerForSerializableValue(interpreter, value);
		Iterator context_vars_it = interpreter.getContextRuntimeObjects().iterator();
		// Then parse the RuntimeObject structure, until we found a property which OID is
		// the runtimeOID referenced in the serializable value given in arguments
		while (context_vars_it.hasNext() && result == null)
		{
			RuntimeObject ro = (RuntimeObject)context_vars_it.next();
			if (ro.getOId() !=  value.runtimeOID)
			{
				Collection properties = ro.getProperties().values();
				// try to find the object in the properties?
				result = getRuntimeObjectFromOID(properties, value.runtimeOID);
				// if result is still null, it may be found in a collection?
				if (result==null && ro.getData().get("CollectionArrayList") !=null)
				{
					result = getRuntimeObjectFromOID(
					(Collection)ro.getData().get("CollectionArrayList"), value.runtimeOID);
				}
			}
			else
			{
				result = ro;
			}
		}
		if (result == null) System.out.println("no ro found : " + value.runtimeOID + "; " + value.valueString);
		return result;
	}
	
}
