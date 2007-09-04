/* $Id: RuntimeObject.java,v 1.31 2007-09-04 13:01:29 cfaucher Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 * Description : This is the java representation of the Kermeta objects during the execution
 * of a kermeta source code. Typically, a RuntimeObject corresponds to 
 * a Kermeta object during its "life" execution. 
 */
package fr.irisa.triskell.kermeta.runtime;

import java.util.ArrayList;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 * @author Franck Fleurey
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * This is the java (runtime) implementation of a Kermeta object. Important properties :
 *  - data : contain special informations, like the model element corresponding to the runtime object
 *  - properties : contain the RuntimeObject representations of the value of the properties of
 *    the runtime object
 *  - metaclass : the metaclass of the runtime object
 *  (see detailed doc. in member functions)
 */
public class RuntimeObject {
    
    public static int getInstanceCounter() {
        return oid_cpt;
    }
    
    /**
     * Object id counted for RuntimeObject
     */
    private static int oid_cpt = 0;
	
    private int oId = oid_cpt++;
    
	/**
	 * The meta class 
	 */
	private RuntimeObject metaclass;
	
	/**
	 * The container
	 */
	private RuntimeObject container = null;
	
	/**
	 * The values of properties. 
	 * Indexed by the name of the property : { a_string : a_runtime_object }
	 */
	private Hashtable<String, RuntimeObject> properties = new Hashtable<String, RuntimeObject>();
	
	/**
	 * Data contained in the object
	 * The key is a String, it can contains any object
	 */
	private Hashtable<String,Object> data;
	
	/**
	 * Is the object modifiable
	 */
	private boolean frozen = false;
	
	/**
	 * The kermeta object factory used to create this object 
	 */
	private RuntimeObjectFactory factory;
	
	public static final String STRING_VALUE = "StringValue";
	public static final String STRING_BUFFER_VALUE = "StringBufferValue";
	public static final String BOOLEAN_VALUE = "BooleanValue";
		public static final String NUMERIC_VALUE = "NumericValue";
	
	/**
	 * The constructor
	 */
	public RuntimeObject(RuntimeObjectFactory factory, RuntimeObject metaclass) {
		super();
		this.metaclass = metaclass;
		this.factory = factory;
		data = new Hashtable<String,Object>();
	}
	
	/**
	 * Properly clears this RuntimeObject on garbage collecting time. 
	 */
    protected void finalize() throws Throwable {
        //System.err.println("finalize RuntimeObject : " + oId);
        fr.irisa.triskell.kermeta.language.structure.Object fobj = (fr.irisa.triskell.kermeta.language.structure.Object)getData().get("kcoreObject");
        if (fobj != null) {
          //  System.err.println("           -> free km object " + fobj);
            factory.getMemory().clearFObjectFromCache(fobj);
        }
        
        super.finalize();
        // clear as much ref as possible
        container = null;
        metaclass = null;
        properties = null;
        data = null;
        factory = null;
    }
    
    
	/**
	 * This is a hack to make hastable implementation work
	 */
    public int hashCode() {
    	// try with a StringValue
    	Object val = getData().get(STRING_VALUE);
        if (val != null) return val.hashCode();
        // try with a numericValue
        val = getData().get(NUMERIC_VALUE);
        if (val != null) return val.hashCode();
        // if the object defines a hashcode method (other than the default one deined on object), use it
        fr.irisa.triskell.kermeta.language.structure.Class t_target =(fr.irisa.triskell.kermeta.language.structure.Class)(getMetaclass()).getData().get("kcoreObject");
        SimpleType target_type = new SimpleType(t_target);
        ExpressionInterpreter interpreter = getFactory().getMemory().getCurrentInterpreter();
        InterpreterContext interpretercontext = interpreter.getInterpreterContext();
        CallableOperation  op = interpretercontext.typeCache.getOperationByName(target_type, "hashcode");
        String name = NamedElementHelper.getQualifiedName(op.getFclass().getTypeDefinition());
        if(!name.equals("kermeta::language::structure::Object")){
        	/*DynamicExpressionUnit deu = new DynamicExpressionUnit(getFactory().getMemory().getUnit().getPackages(), exp, getMetaclass());
    		ExpressionInterpreter interp = getFactory().getMemory().getCurrentInterpreter();
    		ExpressionCallFrame ecf = new ExpressionCallFrame(interp.getInterpreterContext(), deu, this, true);
    		
    		return ecf.eval(interp) == getFactory().getMemory().trueINSTANCE;
    		*/
        	// Create a context for this operation call, setting self object to ro_target
        	ArrayList<RuntimeObject> parameters = new ArrayList<RuntimeObject>();
        	interpretercontext.pushOperationCallFrame(this, op, parameters, null);
        	int result = 0;
			try {
				// Resolve this operation call
				RuntimeObject roResult = (RuntimeObject)interpreter.accept(op.getOperation());
				result = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(roResult);
				//System.err.println("hascode = " + result);
				// After operation has been evaluated, pop its context
			} finally {
				interpretercontext.popCallFrame();
			}
			return result;
        }
        else
        	// use the standard java hashcode for objects that doesn't redefine the hascode
        	return super.hashCode();
    }
    
    
    /**
     * Overrides the classic equals in order to evaluate properly equality between
     * RuntimeObject representations of the primitive types.
     * @return true if arg0 equals this RuntimeObject, false otherwise.
     */
    public boolean equals(Object arg0) {
        if (arg0 instanceof RuntimeObject) {
            RuntimeObject other = (RuntimeObject)arg0;
            
            // optimisation : do not use the kermeta version of equals on some types ...
            RuntimeObject selfString = (RuntimeObject) getData().get(STRING_VALUE);
            RuntimeObject otherString = (RuntimeObject) other.getData().get(STRING_VALUE);
            if (selfString != null || otherString != null) {
            	if (selfString != null && otherString != null) {
                    return selfString.equals(otherString);
                }
            	else return false;
            }
            
            RuntimeObject selfStringBuffer = (RuntimeObject) getData().get(STRING_BUFFER_VALUE);
            RuntimeObject otherStringBuffer = (RuntimeObject) other.getData().get(STRING_BUFFER_VALUE);
            if (selfStringBuffer != null || otherStringBuffer != null) {
            	if (selfStringBuffer != null && otherStringBuffer != null) {
                    return selfStringBuffer.equals(otherStringBuffer);
                }
            	else return false;
            }
            
            RuntimeObject selfNumeric = (RuntimeObject) getData().get(NUMERIC_VALUE);
            RuntimeObject otherNumeric = (RuntimeObject) other.getData().get(NUMERIC_VALUE);
            if (selfNumeric != null || otherNumeric != null) {
            	if (selfNumeric != null && otherNumeric != null) {
                    return selfNumeric.equals(otherNumeric);
                }
            	else return false;
            }
            
            RuntimeObject selfBoolean = (RuntimeObject) getData().get(BOOLEAN_VALUE);
            RuntimeObject otherBoolean = (RuntimeObject) other.getData().get(BOOLEAN_VALUE);
            if (selfBoolean != null || otherBoolean != null) {
            	if (selfBoolean != null && otherBoolean != null) {
                    return selfBoolean.equals(otherBoolean);
                }
            	else return false;
            }
            
            // if any of the element is void the other must be void too
            RuntimeObject voidInstance = getFactory().getMemory().voidINSTANCE;
            if(this == voidInstance){
            	return other == voidInstance;
            }
            if(other == voidInstance){
            	return this == voidInstance;
            }
            // if this is the class Class 
            // 		do not fall to kermeta and directly use the typeequality checker
            if(getData().get("emfObject") instanceof fr.irisa.triskell.kermeta.language.structure.Class){
            	if (this == other) return true;
        		
        		fr.irisa.triskell.kermeta.language.structure.Class req = (fr.irisa.triskell.kermeta.language.structure.Class)this.getData().get("kcoreObject");
        		
        		fr.irisa.triskell.kermeta.language.structure.Object obj = (fr.irisa.triskell.kermeta.language.structure.Object)other.getData().get("kcoreObject");
        		fr.irisa.triskell.kermeta.language.structure.Class pro = null;
        		if(obj instanceof fr.irisa.triskell.kermeta.language.structure.Class)
        			pro = (fr.irisa.triskell.kermeta.language.structure.Class) obj;
        		else
        			return false;        		
        		
        		if (pro == null || req == null) return false;
        		
        		return TypeEqualityChecker.equals(req, pro);
            }
            // if the object defines a equals method (other than the default one defined on object), use it
	        fr.irisa.triskell.kermeta.language.structure.Class t_target =(fr.irisa.triskell.kermeta.language.structure.Class)(getMetaclass()).getData().get("kcoreObject");
	        SimpleType target_type = new SimpleType(t_target);
	        ExpressionInterpreter interpreter = getFactory().getMemory().getCurrentInterpreter();
	        InterpreterContext interpretercontext = interpreter.getInterpreterContext();
	        CallableOperation  op = interpretercontext.typeCache.getOperationByName(target_type, "equals");
	        String name = NamedElementHelper.getQualifiedName(op.getFclass().getTypeDefinition());
	        if(!name.equals("kermeta::language::structure::Object")){
	        	
	        	// Create a context for this operation call, setting self object to ro_target
	        	ArrayList<RuntimeObject> parameters = new ArrayList<RuntimeObject>();
	        	parameters.add(other);
	        	interpretercontext.pushOperationCallFrame(this, op, parameters, null);
	        	boolean result = false;
				try {
					// Resolve this operation call
					RuntimeObject roResult = (RuntimeObject)interpreter.accept(op.getOperation());
					result = fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(roResult);

					//if(!result) System.err.println(this + " " + other);
					// After operation has been evaluated, pop its context
				} finally {
					interpretercontext.popCallFrame();
				}
				return result;
	        }
	        else
	            return super.equals(arg0);
        }
        else
        	return super.equals(arg0);
    }
    
	/**
	 * quick fix patch for #bug 137 
	 * see http://gforge.inria.fr/tracker/index.php?func=detail&aid=137&group_id=32&atid=205
	 * @return Returns the container in the mof meaning (black diamond).
	 */
	public RuntimeObject getContainer() {
		fr.irisa.triskell.kermeta.language.structure.Class self_cls = ((fr.irisa.triskell.kermeta.language.structure.Class)metaclass.getData().get("kcoreObject"));
		// FIXME: this is just a quick fix, we should check that self_cls inherits from ValueType
		String name = NamedElementHelper.getQualifiedName(self_cls.getTypeDefinition());
		if (name.equals("kermeta::standard::Boolean")) return null;
		if (name.equals("kermeta::standard::Integer")) return null;
		if (name.equals("kermeta::standard::String")) return null;
		// FIXME : itou, except that Enumeration type does not inherits from ValueType in metamodel
		// Well, actually, Enumeration is a big exception : enumerationLiteral is an instance-like of Enumeartion,
		// but its metaclass is set as "EnumerationLiteral"
		if (name.equals("kermeta::language::structure::EnumerationLiteral")) return null;
		return container;
	}
	/**
	 * @param container The container to set.
	 */
	public void setContainer(RuntimeObject container) {
		this.container = container;
	}
	/**
	 * Returns the data, which contains different kinds of objects according to
	 * the Kermeta type that is represented.
	 * Here is the currently exhaustive list of available keys in this hashtable, and a description
	 * of the corresponding values: 
	 * (i.e : How to access the internal structure of a RuntimeObject):
	 *  
	 *   - <b>kcoreObject</b> : the Kermeta Object represented by this runtime object. Note that if the runtime object is an 
	 *     <em>instance</em> (by opposition to a model) then there is no kcoreObject.<br>
	 *     Common uses of data :<br>
	 *     - <code>Class a_fclass = (Class)a_runtimeobject.getMetaclass().getData().get("kcoreObject")</code>;
	 *     gets the class (in its "model representation") of which the given runtimeobject is an instance.
	 *     - <cod0e>Property a_fprop = (Property)a_ro_property.getData().get("kcoreObject")</code>;
	 *     gets the model representation of the given runtime property.
	 *   - <b>[String|Numeric|Boolean|Character]Value</b> : the java primitive type corresponding to this
	 *     RuntimeObject. Only provided for runtime object that represents primitive types!
	 *   - <b>CollectionArrayList</b> : if the RuntimeObject represents a Collection (Set, OrderedSet or any inheriting
	 *   class of Collection in kermeta side), then this entry's value is a java Collection of RuntimeObjects.
	 *   (Collection&lt;RuntimeObject&gt;)
	 *   - <b>Hashtable</b> : used to store a java Hashtable in a RuntimeObject representing a Kermeta hashtable
	 *   - <b>r2e.emfResource</b> : used to store an EMF Resource in a RuntimeObject representing a Kermeta EMFResource
	 *   Typically used while loading a model
	 *   - <b>r2e.emfResourceset</b> : used to store EMF ResourceSet in the kermeta RuntimeObject representing an EMFRepository
	 *   - <b>emfObject</b> : used to store the EObject that this RuntimeObject represents; may not be present if the object was created from kermeta
	 *   in this case, the Runtime2EMF class is in charge to fill it when saving the Runtime Object
	 *   - <b>r2e.emfObject</b> : used when serializing RuntimeObject to EObject: As far as I know it is used only in Runtime2EMF class, but I am not able to explain its full purpose :-(
	 * @return Returns the data represented by this runtime object.
	 */
	public Hashtable<String,Object> getData() {
		return data;
	}
	/**
	 * @param data The data to set.
	 */
	public void setData(Hashtable<String,Object> data) {
		this.data = data;
	}
	/**
	 * @return Returns true if the RuntimeObject is not modifiable, false otherwise.
	 */
	public boolean isFrozen() {
		return frozen;
	}
	/**
	 * @param frozen The frozen to set.
	 */
	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}
	/**
	 * @return Returns the metaclass of this runtime object.
	 */
	public RuntimeObject getMetaclass() {
		return metaclass;
	}
	
	/**
	 * @param metaclass The metaclass to set.
	 */
	public void setMetaclass(RuntimeObject metaclass) {
		this.metaclass = metaclass;
	}
	
	/**
	 * Returns the properties of this runtime object.
	 * Indexed by the name (a String) of the property
	 * <pre>class X
	 * { 
	 *    attribute y : Y 
	 *    attribute z : Z
	 * }
	 * </pre>
	 * 
	 * The properties hashtable of the RuntimeObject representation of an instance of X : 
	 * <pre>{ "y" : a_RuntimeObject_as_instance_of_Y, "z" : a_RuntimeObject_as_instance_of_z }</pre>
	 * @return Returns the properties.
	 */
	public Hashtable<String, RuntimeObject> getProperties() {
		return properties;
	}
	

	/**
	 * @return Returns the factory used to create RuntimeObjects.
	 */
	public RuntimeObjectFactory getFactory() {
		return factory;
	}

	/**
	 * @return A string representation of this runtime object : <code>[ class_name : oId ]</code>, or
	 * <code>[ class_name : oId = &lt;a_printable_value&gt;</code> for primitive types.
	 */
	public String toString() {
	    String class_name = "< No Metaclass ! >";
	    try {
	        class_name = NamedElementHelper.getQualifiedName(((fr.irisa.triskell.kermeta.language.structure.Class)metaclass.getData().get("kcoreObject")).getTypeDefinition());
		    String sValue = (String)getData().get(STRING_VALUE);
		    if(sValue != null)
		    	return "[" + class_name + " : "+ oId +" = \"" +sValue+"\"]";
		    
		    String sbValue = ((fr.irisa.triskell.kermeta.runtime.basetypes.StringBuffer)getData().get(STRING_BUFFER_VALUE)).toString();
		    if(sbValue != null)
		    	return "[" + class_name + " : "+ oId +" = \"" +sbValue+"\"]";
		    
		    Boolean bValue = (Boolean)getData().get(BOOLEAN_VALUE);
		    if(bValue != null)
		    	return "[" + class_name + " : "+ oId +" = " +bValue+"]";
		    
		    Object nValue = getData().get(NUMERIC_VALUE);
		    if(nValue != null)
		    	return "[" + class_name + " : "+ oId +" = " +nValue+"]";
	    }
	    catch(Exception e) { 
	        // NOTHING
	    }
	    	    
	    return "[" + class_name + " : "+ oId +"]";
	}
	
	/**
	 * @return A simplified string representation of this runtime object : <code>[ class_name : oId ]</code>,
	 * or a printable value for primitive types..
	 */
	public String toUserString() {
	    String class_name = "< No Metaclass ! >";
	    try {
	        class_name = NamedElementHelper.getQualifiedName(((fr.irisa.triskell.kermeta.language.structure.Class)metaclass.getData().get("kcoreObject")).getTypeDefinition());
		    String sValue = (String)getData().get(STRING_VALUE);
		    if(sValue != null)
		    	return "\"" +sValue+"\"";
		    
		    String sbValue = ((fr.irisa.triskell.kermeta.runtime.basetypes.StringBuffer)getData().get(STRING_BUFFER_VALUE)).toString();
		    if(sbValue != null)
		    	return "\"" +sbValue+"\"";
		    
		    Boolean bValue = (Boolean)getData().get(BOOLEAN_VALUE);
		    if(bValue != null)
		    	return "" + bValue;
		    
		    Object nValue = getData().get(NUMERIC_VALUE);
		    if(nValue != null)
		    	return "" +nValue;
	    }
	    catch(Exception e) { 
	        // NOTHING
	    }
	    	    
	    return "[" + class_name + " : "+ oId +"]";
	}
	
	/** @return the ID of this runtime object */
    public long getOId() {
        return oId;
    }
}
