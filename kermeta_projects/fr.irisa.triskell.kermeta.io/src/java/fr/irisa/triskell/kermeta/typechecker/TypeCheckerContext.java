/* $Id: TypeCheckerContext.java,v 1.3 2005-04-20 23:58:22 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : TypeCheckerContext.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 avr. 2005
* Author : Franck Fleurey
* Description :
*     This is the context of the type checker
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolInterpreterVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FMultiplicityElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeCheckerContext {

	public static void initializeTypeChecker(KermetaUnit std_lib) {
		// TODO : Assign Basic types and classdefinition here
		
	    ObjectType = createTypeForClassDefinition("kermeta::language::structure::Object", std_lib);
	    ClassType = createTypeForClassDefinition("kermeta::language::structure::Class", std_lib);
	    VoidType = createTypeForClassDefinition("kermeta::standard::Void", std_lib);
	    IntegerType = createTypeForClassDefinition("kermeta::standard::Integer", std_lib);
	    StringType = createTypeForClassDefinition("kermeta::standard::String", std_lib);
	    BooleanType = createTypeForClassDefinition("kermeta::standard::Boolean", std_lib);
	    StdIOType = createTypeForClassDefinition("kermeta::io::StdIO", std_lib);
	    
	    SetClassDef = (FClassDefinition)std_lib.typeDefinitionLookup("kermeta::standard::Set");
	    OSetClassDef = (FClassDefinition)std_lib.typeDefinitionLookup("kermeta::standard::OrderedSet");
	    SeqClassDef = (FClassDefinition)std_lib.typeDefinitionLookup("kermeta::standard::Sequence");
	    BagClassDef = (FClassDefinition)std_lib.typeDefinitionLookup("kermeta::standard::Bag");
	    
		bag_type_cache = new Hashtable();
		set_type_cache = new Hashtable();
		seq_type_cache = new Hashtable();
		oset_type_cache = new Hashtable();
	}
	
	protected static FOperation getClassNewOperation() {
	    if (classNew == null) {
	       Iterator it = ((FClass)((SimpleType)ClassType).type).getFClassDefinition().getFOwnedOperation().iterator();
	       while(it.hasNext()) {
	           FOperation op = (FOperation)it.next();
	           if (op.getFName().equals("new")) {
	               classNew = op;
	               break;
	           }
	       }
	    }
	    return classNew;
	}
	
	
	protected static Type createTypeForClassDefinition(String qualified_name, KermetaUnit unit) {
	    FClassDefinition cdef = (FClassDefinition)unit.typeDefinitionLookup(qualified_name);
	    FClass cls = unit.struct_factory.createFClass();
	    cls.setFClassDefinition(cdef);
	    return new SimpleType(cls);
	}
	
	// The base types
	protected static Type ObjectType;
	//protected static Type ReflectionObject;
	protected static Type ClassType;
	protected static Type VoidType;
	protected static Type IntegerType;
	protected static Type StringType;
	protected static Type BooleanType;
	protected static Type StdIOType;
	
	protected static FOperation classNew;
	
	// The collection classes
	protected static FClassDefinition SetClassDef;
	protected static FClassDefinition OSetClassDef;
	protected static FClassDefinition SeqClassDef;
	protected static FClassDefinition BagClassDef;
	
	// The unit to type-check
	protected KermetaUnit unit;
	
	/**
	 * The constructor
	 */
	public TypeCheckerContext(KermetaUnit unit) {
		super();
		this.unit = unit;
		interpreterCtx = new ContextFrame();
		// FIXME: put the type of the IO std lib
		interpreterCtx.addSymbol(new KMSymbolInterpreterVariable("stdio"), StdIOType);
	}
	
	/**
	 * The class that is being type-checked
	 */
	private FClassDefinition selfClass;
	private FOperation currentOperation;
	private Type selfType;
	
	/**
	 * The context of the interpreter
	 */
	private ContextFrame interpreterCtx;
	
	/**
	 * The contexts stack
	 */
	private Stack contexts;
	
	/**
	 * Initialize the context with a class definition
	 */
	public void init(FClassDefinition cls, FOperation op) {
		selfClass = cls;
		currentOperation = op;
		selfType = null;
		contexts = new Stack();
		pushContext();
		Iterator it = op.getFOwnedParameter().iterator();
		while(it.hasNext()) {
		    FParameter p = (FParameter)it.next();
		    this.addSymbol(new KMSymbolParameter(p), getTypeFromMultiplicityElement(p));
		}
	}
	
	public CallableOperation getSuperOperation() {
	    FOperation superOp = currentOperation.getFSuperOperation();
	    if (superOp == null) return null;
	    ArrayList stypes = InheritanceSearch.allSuperTypes((FClass)((SimpleType)getSelfType()).type);
	    for(int i=0; i<stypes.size(); i++) {
	        FClass c = (FClass)stypes.get(i);
	        ArrayList ops = InheritanceSearch.callableOperations(c);
	        Iterator it = ops.iterator();
	        while(it.hasNext()) {
	            CallableOperation op = (CallableOperation)it.next();
	            if (op.getOperation() == superOp) return op;
	        }
	    }
	    return null;
	}
	
	/**
	 * PUSH a context frame
	 */
	public void pushContext() {
		contexts.push(new ContextFrame());
	}
	
	/**
	 * POP the curent context frame
	 */
	public void popContext() {
		contexts.pop();
	}
	
	public ContextFrame peek() {
		return (ContextFrame)contexts.peek();
	}
	
	public void addSymbol(KMSymbol symb, Type type) {
		peek().addSymbol(symb, type);
	}
	
	/**
	 * Return the type of self.
	 * The Type parameters are bound with least derived admitable type
	 */
	public Type getSelfType() {
		if (selfType == null) 
		{
			FClass c = unit.struct_factory.createFClass();
			c.setFClassDefinition(selfClass);
			Iterator it = selfClass.getFTypeParameter().iterator();
			while(it.hasNext()) {
				FTypeVariable tv = (FTypeVariable)it.next();
				FTypeVariableBinding bind = unit.struct_factory.createFTypeVariableBinding();
				bind.setFVariable(tv);
				if (tv.getFSupertype() != null) bind.setFType(tv.getFSupertype());
				else bind.setFType(((SimpleType)TypeCheckerContext.ObjectType).getType());
			}
			selfType = new SimpleType(c);
		}
		return selfType;
	}
	
	/**
	 * Find a symbol in the symbol tables
	 * It starts from the top of the stack.
	 * returns null if the symbol was not found
	 */
	public KMSymbol symbolLookup(String id) {
		KMSymbol result = null;
		for (int i=contexts.size()-1; i >-1; i--) {
			ContextFrame context = (ContextFrame)contexts.get(i);
			result = context.getSymbol(id);
			if (result != null) break;
		}
		// search in the interpreter variables :
		if (result == null) {
			result = interpreterCtx.getSymbol(id);
		}
		return result;
	}
	
	/**
	 * Find a type of a symbol in the symbol tables
	 */
	public Type symbolTypeLookup(String id) {
		Type result = null;
		for (int i=contexts.size()-1; i >-1; i--) {
			ContextFrame context = (ContextFrame)contexts.get(i);
			result = context.getTypeOfSymbol(id);
			if (result != null) break;
		}
		// search in the interpreter variables :
		if (result == null) {
			result = interpreterCtx.getTypeOfSymbol(id);
		}
		return result;
	}
	
//	 Create a type "Set of something"
	protected static Hashtable set_type_cache = new Hashtable();
	protected static Type getSetType(FType typeParam) {
		
		Type result = (Type)set_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(SetClassDef, typeParam));
			// store result in the cache
			set_type_cache.put(typeParam, result);
		}
		return result;
	}
	
//	 Create a type "OrderedSet of something"
	protected static Hashtable oset_type_cache = new Hashtable();
	protected static Type getOrderedSetType(FType typeParam) {
		Type result = (Type)oset_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(OSetClassDef, typeParam));
			// store result in the cache
			oset_type_cache.put(typeParam, result);
		}
		return result;
	}
	
	//	 Create a type "Sequence of something"
	protected static Hashtable seq_type_cache = new Hashtable();
	protected static Type getSequenceType(FType typeParam) {
		Type result = (Type)seq_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(SeqClassDef, typeParam));
			// store result in the cache
			seq_type_cache.put(typeParam, result);
		}
		return result;
	}
	
	//	 Create a type "bag of something"
	protected static Hashtable bag_type_cache = new Hashtable();
	protected static Type getBagType(FType typeParam) {
		Type result = (Type)bag_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(OSetClassDef, typeParam));
			// store result in the cache
			bag_type_cache.put(typeParam, result);
		}
		return result;
	}
	
	// Create a Collection of something
	protected static FClass createClass(FClassDefinition collection, FType contentsType) {
		StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
		// create the class
		FClass result = struct_factory.createFClass();
		result.setFClassDefinition(collection);
		// Bind the type variable
		FTypeVariableBinding bind = struct_factory.createFTypeVariableBinding();
		bind.setFType(contentsType);
		bind.setFVariable((FTypeVariable)collection.getFTypeParameter().get(0));
		result.getFTypeParamBinding().add(bind);
		return result;
	}
	
	/**
	 * Get the type of a multiplicity element using kermeta generic collections
	 * @param element
	 * @return
	 */
	protected static Type getTypeFromMultiplicityElement(FMultiplicityElement element) {
		Type result;
		
		FType element_simple_type = element.getFType();
		if (element_simple_type == null) 
		    element_simple_type = ((SimpleType)TypeCheckerContext.VoidType).type;
		
		if (element.getFUpper() == 1) result = new SimpleType(element_simple_type);
		else {
			if (element.isFIsUnique() && element.isFIsOrdered()) 
				result = getOrderedSetType(element_simple_type);
			else if (element.isFIsUnique() && !element.isFIsOrdered()) 
				result = getSetType(element_simple_type);
			else if (!element.isFIsUnique() && element.isFIsOrdered()) 
				result = getSequenceType(element_simple_type);
			else
				result = getBagType(element_simple_type);
		}
		return result;
	}

    public FOperation getCurrentOperation() {
        return currentOperation;
    }
    public FClassDefinition getSelfClass() {
        return selfClass;
    }
}
