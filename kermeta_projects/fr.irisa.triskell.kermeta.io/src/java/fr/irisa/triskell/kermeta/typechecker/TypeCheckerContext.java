/* $Id: TypeCheckerContext.java,v 1.23 2007-09-19 12:15:03 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : TypeCheckerContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
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


import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolInterpreterVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * @author Franck Fleurey
 * This is the context of the type checker
 */
public class TypeCheckerContext {

	final static private Logger internalLog = LogConfigurationHelper.getLogger("TypeCheckerContext");
	
	public static void initializeTypeChecker(KermetaUnit std_lib, IProgressMonitor monitor) {
	
		if ( monitor.isCanceled() )
			return;
		
	    objectAsType = null;
	    robjectAsType = null;
		classNew = null;
	    classClone = null;
	    modelTypeNew = null;
	    objectTypeVariableNew = null;
	    modelTypeVariableNew = null;
	    
	    modelAdd = null;
	    modelRemove = null;
	    modelFilter = null;
	    
		// TODO : Assign Basic types and classdefinition here
	    internalLog.info("Initializing type checker with standard lib...");
	    ObjectType = createTypeForClassDefinition("kermeta::language::structure::Object", std_lib);
	    RObjectType = createTypeForClassDefinition("kermeta::reflection::Object", std_lib);
	    ModelType = createTypeForClassDefinition("kermeta::language::structure::Model", std_lib);
	    
	    ClassType = createTypeForClassDefinition("kermeta::language::structure::Class", std_lib);
	    EnumType = createTypeForClassDefinition("kermeta::reflection::Enumeration", std_lib);
	    ModelTypeType = createTypeForClassDefinition("kermeta::language::structure::ModelType", std_lib);
	    ObjectTypeVariableType = createTypeForClassDefinition("kermeta::language::structure::ObjectTypeVariable", std_lib);
	    ModelTypeVariableType = createTypeForClassDefinition("kermeta::language::structure::ModelTypeVariable", std_lib);
	    VirtualTypeType = createTypeForClassDefinition("kermeta::language::structure::VirtualType", std_lib);
	    EnumLitType = createTypeForClassDefinition("kermeta::reflection::EnumerationLiteral", std_lib);
	    VoidType = createTypeForClassDefinition("kermeta::standard::Void", std_lib);
	    IntegerType = createTypeForClassDefinition("kermeta::standard::Integer", std_lib);
	    StringType = createTypeForClassDefinition("kermeta::standard::String", std_lib);
	    BooleanType = createTypeForClassDefinition("kermeta::standard::Boolean", std_lib);
	    StdIOType = createTypeForClassDefinition("kermeta::io::StdIO", std_lib);
	    
	    SetClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::Set", monitor);
	    OSetClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::OrderedSet", monitor);
	    SeqClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::Sequence", monitor);
	    BagClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::Bag", monitor);
	    
		bag_type_cache = new Hashtable();
		set_type_cache = new Hashtable();
		seq_type_cache = new Hashtable();
		oset_type_cache = new Hashtable();
		
		if (ObjectType == null || SetClassDef == null) {
		    internalLog.error("Error initializing type checker. The standard library may not be loaded corectly.");
		} else {
		    internalLog.info("Type checker initialized.");
		}
		
	}
	
	protected static Operation getObjectAsTypeOperation() {
	    if (objectAsType == null) {
	       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ObjectType).type).getTypeDefinition()).getOwnedOperation().iterator();
	       while(it.hasNext()) {
	           Operation op = (Operation)it.next();
	           if (op.getName().equals("asType")) {
	        	   objectAsType = op;
	               break;
	           }
	       }
	    }
	    return objectAsType;
	}
	
	protected static Operation getRObjectAsTypeOperation() {
	    if (robjectAsType == null) {
	       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)RObjectType).type).getTypeDefinition()).getOwnedOperation().iterator();
	       while(it.hasNext()) {
	           Operation op = (Operation)it.next();
	           if (op.getName().equals("asType")) {
	        	   robjectAsType = op;
	               break;
	           }
	       }
	    }
	    return robjectAsType;
	}
	
	protected static Operation getClassNewOperation() {
	    if (classNew == null) {
	       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ClassType).type).getTypeDefinition()).getOwnedOperation().iterator();
	       while(it.hasNext()) {
	           Operation op = (Operation)it.next();
	           if (op.getName().equals("new")) {
	               classNew = op;
	               break;
	           }
	       }
	    }
	    return classNew;
	}
	
	protected static Operation getModelTypeNewOperation() {
	    if (modelTypeNew == null) {
	       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelTypeType).type).getTypeDefinition()).getOwnedOperation().iterator();
	       while(it.hasNext()) {
	           Operation op = (Operation)it.next();
	           if (op.getName().equals("new")) {
	               modelTypeNew = op;
	               break;
	           }
	       }
	    }
	    return modelTypeNew;
	}

	protected static Operation getModelTypeVariableNewOperation() {
	    if (modelTypeVariableNew == null) {
	       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelTypeVariableType).type).getTypeDefinition()).getOwnedOperation().iterator();
	       while(it.hasNext()) {
	           Operation op = (Operation)it.next();
	           if (op.getName().equals("new")) {
	               modelTypeVariableNew = op;
	               break;
	           }
	       }
	    }
	    return modelTypeVariableNew;
	}

	protected static Operation getObjectTypeVariableNewOperation() {
	    if (objectTypeVariableNew == null) {
	       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ObjectTypeVariableType).type).getTypeDefinition()).getOwnedOperation().iterator();
	       while(it.hasNext()) {
	           Operation op = (Operation)it.next();
	           if (op.getName().equals("new")) {
	               objectTypeVariableNew = op;
	               break;
	           }
	       }
	    }
	    return objectTypeVariableNew;
	}
	
	protected static Operation getModelFilterOperation() {
		if (modelFilter == null) {
		       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelType).type).getTypeDefinition()).getOwnedOperation().iterator();
		       while(it.hasNext()) {
		           Operation op = (Operation)it.next();
		           if (op.getName().equals("filter")) {
		               modelFilter = op;
		               break;
		           }
		       }
		    }
		    return modelFilter;
	}
	
	protected static Operation getModelAddOperation() {
		if (modelAdd == null) {
		       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelType).type).getTypeDefinition()).getOwnedOperation().iterator();
		       while(it.hasNext()) {
		           Operation op = (Operation)it.next();
		           if (op.getName().equals("add")) {
		               modelAdd = op;
		               break;
		           }
		       }
		    }
		    return modelAdd;
	}
	
	protected static Operation getModelRemoveOperation() {
		if (modelRemove == null) {
		       Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelType).type).getTypeDefinition()).getOwnedOperation().iterator();
		       while(it.hasNext()) {
		           Operation op = (Operation)it.next();
		           if (op.getName().equals("remove")) {
		               modelRemove = op;
		               break;
		           }
		       }
		    }
		    return modelRemove;
	}
	
	protected static Operation getClassCloneOperation() {
		
		if (classClone == null) {
			boolean found = false;
			Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType) ClassType).type).getTypeDefinition()).getOwnedOperation().iterator();
			   while(it.hasNext() && !found) {
			       Operation op = (Operation) it.next();
			       if (op.getName().equals("clone")) {
			           classClone = op;
			           found = true;
			       }
			   }
			   if ( !found ) {
				   System.err.println("-------------------------------------------------------");
				   System.err.println("Error in typechecking, Unable to find the clone operation");
				   System.err.println("-------------------------------------------------------");
			   }
		}
	    return classClone;
	}
	
	
	protected static Type createTypeForClassDefinition(String qualified_name, KermetaUnit unit) {
	    ClassDefinition cdef = (ClassDefinition)unit.getTypeDefinitionByQualifiedName(qualified_name);
	    fr.irisa.triskell.kermeta.language.structure.Class cls = StructureFactory.eINSTANCE.createClass();
	    cls.setTypeDefinition(cdef);
	    return new SimpleType(cls);
	}
	
	/**
	 * Returns the canonical type of the given type, i.e :  
	 * - for a product type, the single type of the product type if there is only one type
	 * - for a primitive type, the "instance type" corresponding to this type :
	 * if you look at Kermeta metamodel, PrimitiveType inherits the DataType
	 * type, that is directly attached to an existing Java type, which is called 
	 * the "instance type".
	 * @param t
	 * @return the canonical type of t
	 */
    public static fr.irisa.triskell.kermeta.language.structure.Type getCanonicalType(fr.irisa.triskell.kermeta.language.structure.Type t) {
        fr.irisa.triskell.kermeta.language.structure.Type result = t;
        if (result instanceof ProductType) {
            ProductType r  = (ProductType)result;
            if (r.getType().size() == 1) {
                result = (fr.irisa.triskell.kermeta.language.structure.Type)r.getType().get(0);
            }
        }
        result = PrimitiveTypeResolver.getResolvedType(result);
        return result;
    }
	
	// The base types
	protected static Type ObjectType;
	protected static Type RObjectType;
	protected static Type ModelType;
	//protected static Type ReflectionObject;
	protected static Type ClassType;
	protected static Type EnumType;
	protected static Type ModelTypeType;
	protected static Type ObjectTypeVariableType;
	protected static Type ModelTypeVariableType;
	protected static Type VirtualTypeType;
	protected static Type EnumLitType;
	protected static Type VoidType;
	protected static Type IntegerType;
	protected static Type StringType;
	protected static Type BooleanType;
	protected static Type StdIOType;
	
	protected static Operation objectAsType;
	protected static Operation robjectAsType;
	
	protected static Operation classNew;
	protected static Operation classClone;
	
	protected static Operation modelTypeNew;
	protected static Operation modelTypeVariableNew;
	protected static Operation objectTypeVariableNew;

	protected static Operation modelFilter;
	protected static Operation modelAdd;
	protected static Operation modelRemove;
	
	// The collection classes
	protected static ClassDefinition SetClassDef;
	protected static ClassDefinition OSetClassDef;
	protected static ClassDefinition SeqClassDef;
	protected static ClassDefinition BagClassDef;
	
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
	private ClassDefinition selfClass;
	/** A derived property or an operation */
	private Operation currentOperation;
	private MultiplicityElement currentCallable;
	
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
	public void init(ClassDefinition cls, Operation op) {
		selfClass = cls;
		currentCallable = currentOperation = op;
		selfType = null;
		contexts = new Stack();
		pushContext();
		Iterator it = op.getOwnedParameter().iterator();
		while(it.hasNext()) {
		    Parameter p = (Parameter)it.next();
		    this.addSymbol(new KMSymbolParameter(p), getTypeFromMultiplicityElement(p));
		}
	}
	
	/**
	 * Initialize the context with a class definition, for
	 * derived property setter method
	 */
	public void init(ClassDefinition cls, Property op) {
		selfClass = cls;
		currentCallable = op; 
		selfType = null;
		contexts = new Stack();
		pushContext();
	}
	
	/**
	 * Initialize the context with a class definition
	 */
	public void init(ClassDefinition cls) {
		selfClass = cls;
		selfType = null;
		contexts = new Stack();
		pushContext();
	}
	
	/**
	 * Initialize the context with a DynamicExpressionUnit
	 */
	public void init(DynamicExpressionUnit deu) {
		selfClass = deu.getContext();
		selfType = null;
		contexts = new Stack();
		pushContext();
		Iterator it = deu.getVariables().iterator();
		while(it.hasNext()) {
		    VariableDecl p = (VariableDecl)it.next();
		    this.addSymbol(new KMSymbolVariable(p), getTypeFromMultiplicityElement(p.getType()));
		}
	}
	
	public CallableOperation getSuperOperation() {
	    Operation superOp = currentOperation.getSuperOperation();
	    if (superOp == null) return null;
	    ArrayList stypes = InheritanceSearch.allSuperTypes((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)getSelfType()).type);
	    for(int i=0; i<stypes.size(); i++) {
	    	fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)stypes.get(i);
	        ArrayList ops = InheritanceSearch.callableOperations(c);
	        Iterator it = ops.iterator();
	        while(it.hasNext()) {
	            CallableOperation op = (CallableOperation)it.next();
	            if (op.getOperation() == superOp) 
	            	return op;
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
			fr.irisa.triskell.kermeta.language.structure.Class c = StructureFactory.eINSTANCE.createClass();
			c.setTypeDefinition(selfClass);
			Iterator it = selfClass.getTypeParameter().iterator();
			while(it.hasNext()) {
				TypeVariable tv = (TypeVariable)it.next();
				TypeVariableBinding bind = StructureFactory.eINSTANCE.createTypeVariableBinding();
				bind.setVariable(tv);
				if (tv.getSupertype() != null) bind.setType(tv.getSupertype());
				else bind.setType(((SimpleType)TypeCheckerContext.ObjectType).getType());
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
	protected static Type getSetType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
		
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
	protected static Type getOrderedSetType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
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
	protected static Type getSequenceType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
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
	protected static Type getBagType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
		Type result = (Type)bag_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(BagClassDef, typeParam));
			// store result in the cache
			bag_type_cache.put(typeParam, result);
		}
		return result;
	}
	
	// Create a Collection of something
	protected static fr.irisa.triskell.kermeta.language.structure.Class createClass(ClassDefinition collection, fr.irisa.triskell.kermeta.language.structure.Type contentsType) {
		StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
		// create the class
		fr.irisa.triskell.kermeta.language.structure.Class result = struct_factory.createClass();
		result.setTypeDefinition(collection);
		// Bind the type variable
		TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
		bind.setType(contentsType);
		bind.setVariable((ObjectTypeVariable)collection.getTypeParameter().get(0));
		result.getTypeParamBinding().add(bind);
		return result;
	}
	
	/**
	 * Get the type of a multiplicity element using kermeta generic collections
	 * @param element
	 * @return
	 */
	public static Type getTypeFromMultiplicityElement(MultiplicityElement element) {
		Type result;
		
		fr.irisa.triskell.kermeta.language.structure.Type element_simple_type = element.getType();
		if (element_simple_type == null) {
		    element_simple_type = ((SimpleType)TypeCheckerContext.VoidType).type;
		    return new SimpleType(element_simple_type);
		}
		
		if (element.getUpper() == 1) result = new SimpleType(element_simple_type);
		else {
			if (element.isIsUnique() && element.isIsOrdered()) 
				result = getOrderedSetType(element_simple_type);
			else if (element.isIsUnique() && !element.isIsOrdered()) 
				result = getSetType(element_simple_type);
			else if (!element.isIsUnique() && element.isIsOrdered()) 
				result = getSequenceType(element_simple_type);
			else
				result = getBagType(element_simple_type);
		}
		return result;
	}
	
	/** Return current feature (an FOperation or a Property -- only derived 
	 * property)
	 */
    public MultiplicityElement getCurrentCallable() {
        return currentCallable;
    }
    
    public ClassDefinition getSelfClass() {
        return selfClass;
    }
}
