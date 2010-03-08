/* $Id: TypeCheckerContext.java,v 1.32 2008-07-08 13:32:24 ftanguy Exp $
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
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.logging.Log;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.cachemanager.CallableFeaturesStore;
import org.kermeta.io.cachemanager.TypeDefinitionContextStore;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolInterpreterVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolVariable;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * @author Franck Fleurey
 * This is the context of the type checker
 */
public class TypeCheckerContext {

	final static private Log internalLog = LogConfigurationHelper.getLogger("TypeCheckerContext");
	
	protected List<Operation> specialOperations = new ArrayList<Operation>();
	
	/**
	 * list of unit being check or having been check by the same context
	 * This is used to make sure that the gargabe collector won't collect it unless the context is withdrawn
	 */
	protected Set<KermetaUnit> unitsCheckedInThisContext = new HashSet<KermetaUnit>();
	public void addUnitCheckedInThisContext(KermetaUnit ku){
		unitsCheckedInThisContext.add(ku);
	}
	
	private void initializeSpecialOperations() {
		specialOperations.add( getObjectAsTypeOperation() );
		specialOperations.add( getClassNewOperation() );
		specialOperations.add( getModelTypeNewOperation() );
		specialOperations.add( getClassCloneOperation() );
		specialOperations.add( getModelFilterOperation() );
		specialOperations.add( getModelAddOperation() );
		specialOperations.add( getModelRemoveOperation() );	
	}
	
	/**
	 * Initialize the default/implicit objects and operations 
	 * Mainly the one defined on Object, void, collections, ...
	 */
	public void initializeForTypeChecking( KermetaUnit std_lib) {
	
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
	    internalLog.debug("Initializing type checker with standard lib...");
	    ObjectType = createTypeForClassDefinition("kermeta::language::structure::Object", std_lib);
	    //RObjectType = createTypeForClassDefinition("kermeta::reflection::Object", std_lib);
	    ModelType = createTypeForClassDefinition("kermeta::language::structure::Model", std_lib);
	    
	    ClassType = createTypeForClassDefinition("kermeta::language::structure::Class", std_lib);
	    EnumType = createTypeForClassDefinition("kermeta::language::structure::Enumeration", std_lib);
	    ModelTypeType = createTypeForClassDefinition("kermeta::language::structure::ModelType", std_lib);
	    ObjectTypeVariableType = createTypeForClassDefinition("kermeta::language::structure::ObjectTypeVariable", std_lib);
	    ModelTypeVariableType = createTypeForClassDefinition("kermeta::language::structure::ModelTypeVariable", std_lib);
	    VirtualTypeType = createTypeForClassDefinition("kermeta::language::structure::VirtualType", std_lib);
	    EnumLitType = createTypeForClassDefinition("kermeta::language::structure::EnumerationLiteral", std_lib);
	    VoidType = createTypeForClassDefinition("kermeta::standard::Void", std_lib);
	    IntegerType = createTypeForClassDefinition("kermeta::standard::Integer", std_lib);
	    StringType = createTypeForClassDefinition("kermeta::standard::String", std_lib);
	    BooleanType = createTypeForClassDefinition("kermeta::standard::Boolean", std_lib);
	    StdIOType = createTypeForClassDefinition("kermeta::io::StdIO", std_lib);
	    
	    SetClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::Set");
	    OSetClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::OrderedSet");
	    SeqClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::Sequence");
	    BagClassDef = (ClassDefinition)std_lib.getTypeDefinitionByQualifiedName("kermeta::standard::Bag");
	    
		bag_type_cache = new Hashtable();
		set_type_cache = new Hashtable();
		seq_type_cache = new Hashtable();
		oset_type_cache = new Hashtable();
		
		if (ObjectType == null || SetClassDef == null) {
		    internalLog.error("Error initializing type checker. The standard library may not be loaded corectly.");
		} else {
		    internalLog.debug("Type checker initialized.");
		}
		
		initializeSpecialOperations();
	}
	
	protected Operation getObjectAsTypeOperation() {
	    if (objectAsType == null) {
	    	Class c = (Class) ((SimpleType) ObjectType).type;
	    	ClassDefinition classDefinition = (ClassDefinition) c.getTypeDefinition();
	    	Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext(classDefinition);
	    	for ( TypeDefinition td : context ) {
	    		if ( td instanceof ClassDefinition ) {
	    			
	    			for ( Operation operation : ((ClassDefinition) td).getOwnedOperation() ) {
	    				if ( operation.getName().equals("asType") ) {
	    					objectAsType = operation;
	    					return objectAsType;
	    				}
	    			}
	    			
	    		}
	    	}
	    }
	    return objectAsType;
	}
	
	protected Operation getClassNewOperation() {
	    if (classNew == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ClassType).type).getTypeDefinition();
	    	classNew = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "new");
	    }
	    return classNew;
	}
	
	protected  Operation getModelTypeNewOperation() {
	    if (modelTypeNew == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelTypeType).type).getTypeDefinition();
	    	modelTypeNew = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "new");
	    }
	    return modelTypeNew;
	}

	protected  Operation getModelTypeVariableNewOperation() {
	    if (modelTypeVariableNew == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelTypeVariableType).type).getTypeDefinition();
	    	modelTypeVariableNew = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "new");
	    }
	    return modelTypeVariableNew;
	}

	protected Operation getObjectTypeVariableNewOperation() {
	    if (objectTypeVariableNew == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ObjectTypeVariableType).type).getTypeDefinition();
	    	objectTypeVariableNew = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "new");
	    }
	    return objectTypeVariableNew;
	}
	
	protected Operation getModelFilterOperation() {
	    if (modelFilter == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelType).type).getTypeDefinition();
	    	modelFilter = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "filter");
	    }
	    return modelFilter;
	}
	
	protected Operation getModelAddOperation() {
	    if (modelAdd == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelType).type).getTypeDefinition();
	    	modelAdd = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "add");
	    }
	    return modelAdd;
	}
	
	protected Operation getModelRemoveOperation() {
	    if (modelRemove == null) {
	    	ClassDefinition cd = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)ModelType).type).getTypeDefinition();
	    	modelRemove = KermetaModelHelper.ClassDefinition.getOperationByName(cd, "remove");
	    }
	    return modelRemove;
	}
	
	protected Operation getClassCloneOperation() {
		
		if (classClone == null) {
			boolean found = false;
			
			Iterator<CallableOperation> it = ClassType.callableOperations(null).iterator();
			
//			Iterator it = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType) ClassType).type).getTypeDefinition()).getOwnedOperation().iterator();
			   while(it.hasNext() && !found) {
			       CallableOperation op = it.next();
			       if (op.operation.getName().equals("clone")) {
			           classClone = op.operation;
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
	
	
	protected SimpleType createTypeForClassDefinition(String qualified_name, KermetaUnit unit) {
	    ClassDefinition cdef = (ClassDefinition)unit.getTypeDefinitionByQualifiedName(qualified_name);
	    fr.irisa.triskell.kermeta.language.structure.Class cls = StructureFactory.eINSTANCE.createClass();
	    cls.setTypeDefinition(cdef);
	    return new SimpleType(cls, this);
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
        
        if ( result instanceof PrimitiveType )
        	result = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) result);
        return result;
    }
	
	// The base types
	protected Type ObjectType;
	//protected static Type RObjectType;
	protected Type ModelType;
	//protected static Type ReflectionObject;
	protected Type ClassType;
	protected Type EnumType;
	protected  Type ModelTypeType;
	protected  Type ObjectTypeVariableType;
	protected  Type ModelTypeVariableType;
	protected  Type VirtualTypeType;
	protected  Type EnumLitType;
	protected Type VoidType;
	protected  Type IntegerType;
	protected  Type StringType;
	protected  SimpleType BooleanType;
	protected  Type StdIOType;
	
	protected  Operation objectAsType;
	protected  Operation robjectAsType;
	
	protected  Operation classNew;
	protected  Operation classClone;
	
	protected  Operation modelTypeNew;
	protected  Operation modelTypeVariableNew;
	protected  Operation objectTypeVariableNew;

	protected  Operation modelFilter;
	protected  Operation modelAdd;
	protected  Operation modelRemove;
	
	// The collection classes
	protected  ClassDefinition SetClassDef;
	protected  ClassDefinition OSetClassDef;
	protected  ClassDefinition SeqClassDef;
	protected  ClassDefinition BagClassDef;
	
	// The unit to type-check
	protected KermetaUnit unit;
	
	/**
	 * The constructor
	 * @throws ContextNotInitializedOnAFrameworkError 
	 */
	public TypeCheckerContext(KermetaUnit unit) throws ContextNotInitializedOnAFrameworkError {
		super();
		this.unit = unit;
		addUnitCheckedInThisContext(unit);
		//if ( ! unit.isTypeChecked() ) {        	
        	if (unit.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object") != null){
        		initializeForTypeChecking(unit);
	    		interpreterCtx = new ContextFrame();
	    		// FIXME: put the type of the IO std lib
	    		interpreterCtx.addSymbol(new KMSymbolInterpreterVariable("stdio"), StdIOType);
        	}
        	else {
        		unit.error("Cannot find kermeta::language::structure::Object, check your require statements.");
        		//throw new ContextNotInitializedOnAFrameworkError(unit.getUri());
        	}
        //}
		
		
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
	    return InheritanceSearch.getSuperOperation((Class)((SimpleType)getSelfType()).type, currentOperation, this);    
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
				else bind.setType(((SimpleType)ObjectType).getType());
			}
			selfType = new SimpleType(c, this);
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
	protected Hashtable set_type_cache = new Hashtable();
	protected Type getSetType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
		
		Type result = (Type)set_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(SetClassDef, typeParam), this);
			// store result in the cache
			set_type_cache.put(typeParam, result);
		}
		return result;
	}
	
//	 Create a type "OrderedSet of something"
	protected  Hashtable oset_type_cache = new Hashtable();
	protected  Type getOrderedSetType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
		Type result = (Type)oset_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(OSetClassDef, typeParam), this);
			// store result in the cache
			oset_type_cache.put(typeParam, result);
		}
		return result;
	}
	
	//	 Create a type "Sequence of something"
	protected  Hashtable seq_type_cache = new Hashtable();
	protected  Type getSequenceType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
		Type result = (Type)seq_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(SeqClassDef, typeParam),this);
			// store result in the cache
			seq_type_cache.put(typeParam, result);
		}
		return result;
	}
	
	//	 Create a type "bag of something"
	protected  Hashtable bag_type_cache = new Hashtable();
	protected  Type getBagType(fr.irisa.triskell.kermeta.language.structure.Type typeParam) {
		Type result = (Type)bag_type_cache.get(typeParam);
		// not in the cache ?
		if (result == null) {
			// create the class
			result = new SimpleType(createClass(BagClassDef, typeParam),this);
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
	public Type getTypeFromMultiplicityElement(MultiplicityElement element) {
		Type result;
		
		fr.irisa.triskell.kermeta.language.structure.Type element_simple_type = element.getType();
		if (element_simple_type == null) {
		    element_simple_type = ((SimpleType)this.VoidType).type;
		    return new SimpleType(element_simple_type, this);
		}
		
		if (element.getUpper() == 1) result = new SimpleType(element_simple_type, this);
		else {
			if (element.isIsUnique() && element.isIsOrdered()) 
				result = getOrderedSetType(element_simple_type);
			else if (element.isIsUnique() && !element.isIsOrdered()) {
				result = getSetType( element_simple_type);
			}
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

    protected TypeDefinitionContextStore typeDefintionContextCache = new TypeDefinitionContextStore();
	public TypeDefinitionContextStore getTypeDefinitionContextCache() {
		return typeDefintionContextCache;
	}

	protected CallableFeaturesStore callableFeaturesCache =  new CallableFeaturesStore();
	public CallableFeaturesStore getCallableFeaturesCache() {
		return callableFeaturesCache;
	}
}
