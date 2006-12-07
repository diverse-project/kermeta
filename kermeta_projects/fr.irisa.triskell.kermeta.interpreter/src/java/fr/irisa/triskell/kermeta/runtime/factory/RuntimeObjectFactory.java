/* $Id: RuntimeObjectFactory.java,v 1.15 2006-12-07 09:39:08 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mars 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr>
 */
package fr.irisa.triskell.kermeta.runtime.factory;


import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
//import fr.irisa.triskell.kermeta.language.structure.Enumeration; // conflict here ...
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.runtime.language.Class;
import fr.irisa.triskell.kermeta.typechecker.FTypePrettyPrinter;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * @author Franck Fleurey
 * 
 * Contains a set of convenient methods to create RuntimeObjects.
 */
public class RuntimeObjectFactory {

	protected RuntimeMemory memory;
	
	protected KermetaIOStream stream = null;
	
	/**
	 * These are caches of classes
	 */
	public Hashtable cache_reflec_seq_class = new Hashtable();
	public Hashtable cache_reflec_coll_class = new Hashtable();
	
	
	
	StructureFactory struct_factory;
	
	/**
	 * The constructor
	 */
	public RuntimeObjectFactory(RuntimeMemory memory) {
	    super();
	    this.memory = memory;
	    // Set by default
	    this.stream = new SystemIOStream();
	    struct_factory = StructurePackageImpl.init().getStructureFactory();
	}
	
	/**
	 * Load the specified KCoreRuntimeObject in memory (the root call in the call graph
	 * is a method call in the RuntimeMemoryLoader)
	 * @param obj
	 */
	public void loadKCoreRuntimeObject(KCoreRuntimeObject obj) {
	    memory.loadKCoreRuntimeObject(obj);
	}
	
	
	public RuntimeObject getTypeDefinitionByName(String qname) {
		return memory.getTypeDefinitionAsRuntimeObject(qname);
	}
	
	/**
	 * The meta-class Class (bootstrap)
	 */
	private RuntimeObject class_class;
	
	/**
	 * The meta-class ModelType
	 */
	private RuntimeObject modelType_class;
	
	/**
	 * Set the metaclass Class : it creates a new runtime object specific
	 * to the class Class
	 * @param classdef the ClassDefinition corresponding to this class
	 */
	public void setClassClassFromFClass(fr.irisa.triskell.kermeta.language.structure.Class fclass) {
		class_class = new RuntimeObject(this, null);
		class_class.setMetaclass(class_class);
		class_class.setData(new Hashtable());
		class_class.getData().put("kcoreObject",fclass);
	}
	
	/**
	 * Set the metaclass ModelType : it creates a new runtime object specific
	 * to the class ModelType
	 * @param classdef the ClassDefinition corresponding to this class
	 */
	public void setModelTypeClassFromFClass(fr.irisa.triskell.kermeta.language.structure.Class fclass) {
		modelType_class = new RuntimeObject(this, null);
		modelType_class.setMetaclass(modelType_class);
		modelType_class.setData(new Hashtable());
		modelType_class.getData().put("kcoreObject", fclass);
	}
	
	public RuntimeObject getClassClass() {
		return class_class;
	}
	
	
	private RuntimeObject classReflectiveSequenceOtTypeParamBinding = null;
	private RuntimeObject getClassReflectiveSequenceOtTypeParamBinding() 
	{
	    if (classReflectiveSequenceOtTypeParamBinding == null) {
	    	fr.irisa.triskell.kermeta.language.structure.Class fc = memory.getUnit().struct_factory.createClass();
		    fc.setTypeDefinition((ClassDefinition)memory.getUnit().typeDefinitionLookup("kermeta::language::ReflectiveSequence"));
		    
		    fr.irisa.triskell.kermeta.language.structure.Class tpb_class = memory.getUnit().struct_factory.createClass();
		    tpb_class.setTypeDefinition((ClassDefinition)memory.getUnit().typeDefinitionLookup("kermeta::language::structure::TypeVariableBinding"));
		    
		    TypeVariableBinding binding = memory.getUnit().struct_factory.createTypeVariableBinding();
		    binding.setVariable((TypeVariable)fc.getTypeDefinition().getTypeParameter().get(0));
		    binding.setType(tpb_class);
		    
		    fc.getTypeParamBinding().add(binding);
		    
		    classReflectiveSequenceOtTypeParamBinding = new RuntimeObject(this, getClassClass());
		    classReflectiveSequenceOtTypeParamBinding.getData().put("kcoreObject", fc);
		    
		    classReflectiveSequenceOtTypeParamBinding.getProperties().put("typeDefinition", memory.getRuntimeObjectForFObject(fc.getTypeDefinition()));
		    
		    RuntimeObject ro_bindings = new RuntimeObject(this, classReflectiveSequenceOtTypeParamBinding);
		    
		    classReflectiveSequenceOtTypeParamBinding.getProperties().put("typeParamBinding", ro_bindings);
		    
		    RuntimeObject ro_binding = createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
		    
		    RuntimeObject ro_tpb_class = new RuntimeObject(this, getClassClass());
		    ro_tpb_class.getData().put("kcoreObject", tpb_class);
		    ro_tpb_class.getProperties().put("typeDefinition", memory.getRuntimeObjectForFObject(tpb_class.getTypeDefinition()));
		    
		    ro_binding.getProperties().put("variable", memory.getRuntimeObjectForFObject((fr.irisa.triskell.kermeta.language.structure.Object)fc.getTypeDefinition().getTypeParameter().get(0)));
		    
	        ro_binding.getProperties().put("type", ro_tpb_class);
	        
	        Collection.getArrayList(ro_bindings).add(ro_binding);
		    
	    }
	    return classReflectiveSequenceOtTypeParamBinding;
	}
	
	private Hashtable non_parametric_metaclass_cache = new Hashtable();
	private Hashtable<TypeDefinition, RuntimeObject> non_parametric_modeltype_cache = new Hashtable();

	public RuntimeObject createMetaClass(fr.irisa.triskell.kermeta.language.structure.Class fclass) {
	    
	    if (fclass.getTypeParamBinding().size() == 0) {
	        RuntimeObject result = (RuntimeObject)non_parametric_metaclass_cache.get(fclass.getTypeDefinition());
	        if (result != null) return result;
	    }
	    
	    // precondition
	    if (fclass.getTypeParamBinding().size() != fclass.getTypeDefinition().getTypeParameter().size()) {
	        throw new Error("INTERNAL ERROR : invalid FClass : all type variables should be bound.");
	    }
	    
	    RuntimeObject meta_class = new RuntimeObject(this, getClassClass());
	    meta_class.getData().put("kcoreObject", fclass);
	    meta_class.getProperties().put("typeDefinition", memory.getRuntimeObjectForFObject(fclass.getTypeDefinition()));
	    
	    RuntimeObject ro_bindings = new RuntimeObject(this, getClassReflectiveSequenceOtTypeParamBinding());
	    meta_class.getProperties().put("typeParamBinding", ro_bindings);
	    
	    for(int i=0; i<fclass.getTypeParamBinding().size(); i++ ) {
	        TypeVariableBinding binding = (TypeVariableBinding)fclass.getTypeParamBinding().get(i);

	        Type binding_type = binding.getType();
	        
	        while (binding_type instanceof PrimitiveType) {
	            binding_type = ((PrimitiveType)binding_type).getInstanceType();
	        }
	        
	        RuntimeObject ro_var = (RuntimeObject)memory.getRuntimeObjectForFObject((fr.irisa.triskell.kermeta.language.structure.Object)fclass.getTypeDefinition().getTypeParameter().get(i));
	        RuntimeObject ro_type = null;
	        if (binding_type instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
	            ro_type = createMetaClass((fr.irisa.triskell.kermeta.language.structure.Class)binding_type);
	        } else if (binding_type instanceof ModelType) {
	        	ro_type = createModelType((ModelType) binding_type);
	        }
	        else {
	            // it is an enum
	            ro_type = memory.getRuntimeObjectForFObject(binding_type);
	        }
	        
	        RuntimeObject ro_binding = createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
	        ro_binding.getData().put("kcoreObject", binding);
	        ro_binding.getProperties().put("variable", ro_var);
	        ro_binding.getProperties().put("type", ro_type);
	        Collection.getArrayList(ro_bindings).add(ro_binding);
	    }
	    
	    if (fclass.getTypeParamBinding().size() == 0) {
	        non_parametric_metaclass_cache.put(fclass.getTypeDefinition(), meta_class);
	    }
	    
	    return meta_class;
	}
	
	public RuntimeObject createModelType(ModelType fModelType) {
		if (fModelType.getTypeParamBinding().isEmpty()) {
			RuntimeObject result = (RuntimeObject) non_parametric_modeltype_cache.get(fModelType.getTypeDefinition());
			if (result != null) return result;
		}
		
		if (fModelType.getTypeParamBinding().size() != fModelType.getTypeDefinition().getTypeParameter().size()) {
			throw new Error("INTERNAL ERROR : invalid Model Type : all type variables should be bound.");
		}
		
		RuntimeObject model_type = new RuntimeObject(this, getModelTypeClass());
		model_type.getData().put("kcoreObject", fModelType);
		model_type.getProperties().put("typeDefinition", memory.getRuntimeObjectForFObject(fModelType.getTypeDefinition()));
		
		RuntimeObject ro_bindings = new RuntimeObject(this, getClassReflectiveSequenceOtTypeParamBinding());
		model_type.getProperties().put("typeParamBinding", ro_bindings);
		
		for (int i=0; i<fModelType.getTypeParamBinding().size(); i++) {
			TypeVariableBinding binding = (TypeVariableBinding) fModelType.getTypeParamBinding().get(i);
			
			Type binding_type = binding.getType();
			while (binding_type instanceof PrimitiveType) {
				binding_type = ((PrimitiveType) binding_type).getInstanceType();
			}
			
			RuntimeObject ro_var = (RuntimeObject) memory.getRuntimeObjectForFObject((TypeVariable)fModelType.getTypeDefinition().getTypeParameter().get(i));
			RuntimeObject ro_type = null;
			if (binding_type instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
				ro_type = createMetaClass((fr.irisa.triskell.kermeta.language.structure.Class)binding_type);
			} else if (binding_type instanceof ModelType) {
				ro_type = createModelType((ModelType) binding_type);
			} else {
				ro_type = memory.getRuntimeObjectForFObject(binding_type);
			}
			
			RuntimeObject ro_binding = createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
			ro_binding.getData().put("kcoreObject", binding);
			ro_binding.getProperties().put("variable", ro_var);
			ro_binding.getProperties().put("type", ro_type);
			Collection.getArrayList(ro_bindings).add(ro_binding);
		}
		
		if (fModelType.getTypeParamBinding().isEmpty()) {
			non_parametric_modeltype_cache.put(fModelType.getTypeDefinition(), model_type);
		}
		
		return model_type;
	}
	
	private RuntimeObject getModelTypeClass() {
		return modelType_class;
	}

	public static int createRuntimeObjectFromClass_count = 0;
	
	/**
	 * Create a new RuntimeObject given its meta_class.
	 * @param meta_class the RuntimeObject repr. of the meta class to instanciate
	 * @return a RuntimeObject which is an "instance" of meta_class.
	 */
	public RuntimeObject createRuntimeObjectFromClass(RuntimeObject meta_class) {
	    createRuntimeObjectFromClass_count++;
		RuntimeObject result = new RuntimeObject(this, meta_class);
		if(meta_class.getData().get("kcoreObject") instanceof fr.irisa.triskell.kermeta.language.structure.Class){
			fr.irisa.triskell.kermeta.language.structure.Class the_class = (fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject");
			SimpleType t = (new SimpleType(the_class)); 
			if (t.isSemanticallyAbstract()) {
				//throw new Error("Kermeta Runtime Error: Unable to instantiate semantically abstract class " + FTypePrettyPrinter.getInstance().accept(the_class));
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::AbstractClassInstantiationError",
						"Unable to instantiate semantically abstract class " + FTypePrettyPrinter.getInstance().accept(the_class) + "; " +t.getSemanticallyAbstractCause(),
						meta_class.getFactory().memory.getCurrentInterpreter(),
						meta_class.getFactory().memory,
						the_class,
						null);
				/*
				RuntimeObject ex = createObjectFromClassName("kermeta::exceptions::AbstractClassInstantiationError");
				memory.getCurrentInterpreter().raiseKermetaException(ex, memory.getCurrentInterpreter().getInterpreterContext().peekCallFrame().getOperation());
				*/
			}
			ClassDefinition class_def = (ClassDefinition)the_class.getTypeDefinition();
			//		 if this comes from a jar unit, create it in a special way
	        if(RuntimeHelper.isJarProxy(class_def)){
	        	result.getData().put("isJarProxy", true);
	        }
		}
//		TODO : take care of default values here ?
		//result.setData(new Hashtable());
		return result;
	}
	
	/**
	 * Create a new RuntimeObject representing a model, given its model type.
	 * @param modelType the RuntimeObject representing the model type to instantiate
	 * @return a RuntimeObject which is an "instance" of kermeta::language::structure::Model and typed by modelType.
	 */
	public RuntimeObject createRuntimeObjectFromModelType(RuntimeObject modelType) {
		//We'll count models as objects, shall we?
		createRuntimeObjectFromClass_count++;
		RuntimeObject model_typedef = getTypeDefinitionByName("kermeta::language::structure::Model");
		RuntimeObject model_class = getClassForClassDefinition(model_typedef);
		RuntimeObject result = new RuntimeObject(this, model_class);
		result.getData().put("modelType", modelType);
		return result;
	}
	
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public RuntimeObject createObjectFromClassName(String class_name) {
	    
		RuntimeObject roclassdef = memory.getTypeDefinitionAsRuntimeObject(class_name);

		RuntimeObject result = createObjectFromClassDefinition(roclassdef);

		return result;
	}
	
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public RuntimeObject createObjectFromClassDefinition(RuntimeObject roclassdef) {
	    RuntimeObject roclass = getClassForClassDefinition(roclassdef);	
		RuntimeObject result = createRuntimeObjectFromClass(roclass);
		return result;
	}
	
	
	/**
	 * Create a new RuntimeObject from another runtime object
	 * Implement the "clone" feature. We do a "deep clone" for attribute and a "shallow clone" for references

	 * @param meta_class the class of the object to clone
	 * @param objectToClone the object we want to clone
	 * @return the clone of the objectToClone 
	 */
	public RuntimeObject cloneRuntimeObjectFromObject(RuntimeObject meta_class, RuntimeObject objectToClone)
	{    
	    // Build a new empty object (default constructor) 
	    RuntimeObject result = new RuntimeObject(this, meta_class);
	    createRuntimeObjectFromClass_count++;
	    
	    // Check if it is a primitive type
	    String theMetaClassName = ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition().getName();
		System.out.println("J'ai trouv� un : " + theMetaClassName);
	 
		if (theMetaClassName.equals("String") ){
			result.getData().put("StringValue", objectToClone.getData().get("StringValue"));
	    
		} else if ( theMetaClassName.equals("Integer") ) {
			result.getData().put("NumericValue", objectToClone.getData().get("NumericValue"));
		
		} else if ( theMetaClassName.equals("Boolean") ) {
			result.getData().put("BooleanValue", objectToClone.getData().get("BooleanValue"));
		
		} else if ( theMetaClassName.equals("Collection") || theMetaClassName.equals("OrderedCollection") ||
					theMetaClassName.equals("Set") || theMetaClassName.equals("OrderedSet") || // tests if theMetaClassName is Set, Bag, OrderedSet or Sequence to fix bug #1550
					theMetaClassName.equals("Bag") || theMetaClassName.equals("Sequence")) {
			ArrayList objectToCloneContents = (ArrayList) objectToClone.getData().get("CollectionArrayList");
			ArrayList resultContents = new ArrayList();
			
			// we clone each value in the collection
			Iterator elementIterator = objectToCloneContents.iterator();
			while ( elementIterator.hasNext() ){
				RuntimeObject element = (RuntimeObject) elementIterator.next();
				RuntimeObject elementMetaClass = element.getMetaclass();
				resultContents.add(Class.cloneObject(elementMetaClass, element));
			}
			result.getData().put("CollectionArrayList", resultContents);
			
		} else {				    						    		
		
		    // Get the list of attribute of the meta-class
		    EList metaClassAttribute = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition()).getOwnedAttribute();
		    
		    // Foreach property of the meta-class, deep or shallow clone 
		    Iterator metaClassAttributeIterator = metaClassAttribute.iterator();
		    while ( metaClassAttributeIterator.hasNext() ) {
		    	Property theMetaClassAttribute = (Property) metaClassAttributeIterator.next();
			    	    	
		    	String theAttributeName = theMetaClassAttribute.getName();
			 
		    	RuntimeObject theAttributeValue = (RuntimeObject) objectToClone.getProperties().get(theAttributeName);
	    		
		    	// If the property has no yet been used, then its does not exist !
		    	if ( theAttributeValue != null ){
	    		
			    	RuntimeObject theAttributeMetaClass = theAttributeValue.getMetaclass();
			    	System.out.println("J'ai trouv� un : " + theAttributeMetaClass);
			    	System.out.println("J'ai trouv� un : " + theMetaClassAttribute.getType());
			    	
			    	String theAttributeTypeName = null;
			    	if (theMetaClassAttribute.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
		    			theAttributeTypeName = ((fr.irisa.triskell.kermeta.language.structure.Class) theMetaClassAttribute.getType()).getTypeDefinition().getName();   		
		    		} else if (theMetaClassAttribute.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Enumeration) { 
		    			theAttributeTypeName = ((fr.irisa.triskell.kermeta.language.structure.Enumeration) theMetaClassAttribute.getType()).getName();
		    		} else {
		    			System.err.println("-----------------------------------------------");
		    			System.err.println("Err while cloning object : " + objectToClone);
		    			System.err.println("Trying to clone a property on an unknown type ! ");
		    			System.err.println("-----------------------------------------------");
		    		}
			    	
			    	if ( theMetaClassAttribute.isIsComposite() ) { 	// ************ DEEP CLONE ************
			    	
			    		result.getProperties().put(theAttributeName, Class.cloneObject(theAttributeMetaClass, theAttributeValue));	
	
			    		String theAttributeMetaClassName = ((fr.irisa.triskell.kermeta.language.structure.Class) theAttributeMetaClass.getData().get("kcoreObject")).getTypeDefinition().getName();
			    		
			    		// For each element in the collection, we nee to add an opposite 
			    		if ( theAttributeMetaClassName.equals("ReflectiveCollection") )
			    		{	
			    			// Build a new reflective Collection
			    			RuntimeObject resultAttribute = new RuntimeObject(this, theAttributeMetaClass);
			    			    		    			
			    			ArrayList attributeContents = (ArrayList) theAttributeValue.getData().get("CollectionArrayList");
			    			ArrayList resultAttributeContents = new ArrayList();
		    				
			    			Property oppositeProperty = ((Property) ((RuntimeObject) theAttributeValue.getData().get("RProperty")).getData().get("kcoreObject")).getOpposite(); 
			    			String oppositeName = oppositeProperty.getName();
			    			
			    			// Manage opposite for each object contained in the reflective Collections
			    			Iterator elementIterator = attributeContents.iterator();
			    			while ( elementIterator.hasNext() ){
			    				RuntimeObject element = (RuntimeObject) elementIterator.next();
			    				RuntimeObject cloneElement = Class.cloneObject(element.getMetaclass(), element);
			    				
			    				// Get the opposite property and add the result of our current clone operation
			    				RuntimeObject elementProperty = (RuntimeObject) cloneElement.getProperties().get(oppositeName);
			    				
			    				// test if the opposite is a Collection or an simple attribute
			    				if (oppositeProperty.getUpper() == 1){
									cloneElement.getProperties().put(oppositeName, result);
								} else { 	
									ArrayList elementPropertyCollection = ((ArrayList) elementProperty.getData().get("CollectionArrayList"));
									elementPropertyCollection.add(result); 
								}
											    				
			    				// Put the Object in the collection but cloning it before !
			    				resultAttributeContents.add(cloneElement);
			    			}
			    			
			    			resultAttribute.getData().put("CollectionArrayList", resultAttributeContents);
	
			    			result.getProperties().put(theAttributeName, resultAttribute);
							
			    		} else { 
			    		
			    			result.getProperties().put(theAttributeName, Class.cloneObject(theAttributeMetaClass,theAttributeValue));
			    		}
	
			    		
			    	} else { 
			    		// ********* SHALLOW CLONE ***********
			    		System.out.println("C'est une propri�t� reference");	
	
			    		String theAttributeMetaClassName = ((fr.irisa.triskell.kermeta.language.structure.Class) theAttributeMetaClass.getData().get("kcoreObject")).getTypeDefinition().getName();
			    		
			    		// For each element in the collection, we nee to add an opposite 
			    		if ( theAttributeMetaClassName.equals("ReflectiveCollection") ) 
			    		{			    			
			    			// Build a new refelctive Collection
			    			RuntimeObject resultAttribute = new RuntimeObject(this, theAttributeMetaClass);
			    			    		    			
			    			ArrayList attributeContents = (ArrayList) theAttributeValue.getData().get("CollectionArrayList");
			    			ArrayList resultAttributeContents = new ArrayList();
		    				
			    			Property oppositeProperty = ((Property) ((RuntimeObject) theAttributeValue.getData().get("RProperty")).getData().get("kcoreObject")).getOpposite(); 
			    			String oppositeName = oppositeProperty.getName();
			    			
			    			// Manage opposite for each object contains in the reflective Collections
			    			Iterator elementIterator = attributeContents.iterator();
			    			while ( elementIterator.hasNext() ){
			    				RuntimeObject element = (RuntimeObject) elementIterator.next();
			    				
			    				// get the opposite property and add the result of our current clone operation
			    				RuntimeObject elementProperty = (RuntimeObject) element.getProperties().get(oppositeName);
			    				
			    				// test if the opposite is a Collection or an simple attribute
			    				if (oppositeProperty.getUpper() == 1){
									element.getProperties().put(oppositeName, result);
								} else { 	
									ArrayList elementPropertyCollection = ((ArrayList) elementProperty.getData().get("CollectionArrayList"));
									elementPropertyCollection.add(result); 
								}
			    							    				
			    				// Put the Object in the collection without cloning it !
			    				resultAttributeContents.add(element);
			    			}
			    			
			    			resultAttribute.getData().put("CollectionArrayList", resultAttributeContents);
	
			    			result.getProperties().put(theAttributeName, resultAttribute);
							
			    		} else { 
			    		
			    			result.getProperties().put(theAttributeName, theAttributeValue);
			    		
			    		}
			    		
		    		} // if isComposite
		    	
		    	} // if the AttributeValue is Null
		  
		    }  
		
		} 
		
		return result;
	    
	}
	
	
	
	
	/**
	 * This Hashtable is used bey the deepclone operation
	 * It's allow to remeber which object have been already cloned. Avoid cycles in the deep cloning process
	 * --> Key is the OID of the runtimeobject
	 * --> Value is the runtimeObject (result of the clone operation)
	 */
	public Hashtable cloneObjectTable = new Hashtable();
	
	
	/**
	 * Create a new RuntimeObject from another runtime object
	 * Implement the "deep clone" feature.

	 * @param meta_class the class of the object to clone
	 * @param objectToClone the object we want to clone
	 * @return the clone of the objectToClone 
	 */
	public RuntimeObject deepCloneRuntimeObjectFromObject(RuntimeObject meta_class, RuntimeObject objectToClone)
	{    
	    // Build a new empty object (default constructor) 
	    RuntimeObject result = new RuntimeObject(this, meta_class);
	    createRuntimeObjectFromClass_count++;
	    
	    // Check that we have not already clone this object
	    if ( cloneObjectTable.containsKey(objectToClone.getOId()) )
	    {
	    	System.out.println(" Objet d�j� clon� !!!");
	    	
	    	// Look in the hashtable to find the result ! 
	    	result = (RuntimeObject) cloneObjectTable.get(objectToClone.getOId());
	
	    } else {
	      	System.out.println("Je clone un nouvel objet : " + objectToClone.getOId());
		    
	      	// Remerer that we have cloned this object
	    	cloneObjectTable.put(objectToClone.getOId(), result);
	    
	    	// And we clone it ...
	    	
		    // Check if it is a primitive type
		    String theMetaClassName = ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition().getName();
			System.out.println("J'ai trouv� un : " + theMetaClassName);
		 
			if (theMetaClassName.equals("String") ){
				result.getData().put("StringValue", objectToClone.getData().get("StringValue"));
		    
			} else if ( theMetaClassName.equals("Integer") ) {
				result.getData().put("NumericValue", objectToClone.getData().get("NumericValue"));
			
			} else if ( theMetaClassName.equals("Boolean") ) {
				result.getData().put("BooleanValue", objectToClone.getData().get("BooleanValue"));
			
			} else if ( theMetaClassName.equals("Collection") || theMetaClassName.equals("OrderedCollection") ) {				    						    		
				ArrayList objectToCloneContents = (ArrayList) objectToClone.getData().get("CollectionArrayList");
				ArrayList resultContents = new ArrayList();
				
				// we clone each value in the collection
				Iterator elementIterator = objectToCloneContents.iterator();
				while ( elementIterator.hasNext() ){
					RuntimeObject element = (RuntimeObject) elementIterator.next();
					RuntimeObject elementMetaClass = element.getMetaclass();
					resultContents.add(deepCloneRuntimeObjectFromObject(elementMetaClass, element));
				}
				result.getData().put("CollectionArrayList", resultContents);
				
			} else {				    						    		
				// It doesn't be a primitive type
				
			    // Get the list of attribute of the meta-class
			    EList metaClassAttribute = ((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition()).getOwnedAttribute();
			    
			    // Foreach property of found in the meta-class, do a deep clone 
			    // We look in the meta-class to find the name of each properties
			    Iterator metaClassAttributeIterator = metaClassAttribute.iterator();
			    while ( metaClassAttributeIterator.hasNext() ) {
			    	Property theMetaClassAttribute = (Property) metaClassAttributeIterator.next();
				    	    	
			    	String theAttributeName = theMetaClassAttribute.getName();
			    	System.out.println(" ---> cloning property \"" + theAttributeName + "\"");
				   	RuntimeObject theAttributeValue = (RuntimeObject) objectToClone.getProperties().get(theAttributeName);
		    		
			    	// If the property has no yet been used, then its does not exist !
			    	if ( theAttributeValue != null ){
		    		
				    	RuntimeObject theAttributeMetaClass = theAttributeValue.getMetaclass();
				    	System.out.println("J'ai trouv� un : " + theAttributeMetaClass);
				    	System.out.println("J'ai trouv� un : " + theMetaClassAttribute.getType());
				    	
				    	String theAttributeTypeName = null;
				    	
				    	// We get the name of the meta class of the attribute
				    	if (theMetaClassAttribute.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
			    			theAttributeTypeName = ((fr.irisa.triskell.kermeta.language.structure.Class) theMetaClassAttribute.getType()).getTypeDefinition().getName();   		
			    		
				    	} else if (theMetaClassAttribute.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Enumeration) { 
			    			theAttributeTypeName = ((fr.irisa.triskell.kermeta.language.structure.Enumeration) theMetaClassAttribute.getType()).getName();
			    		
			    		} else {
			    			System.err.println("-----------------------------------------------");
			    			System.err.println("Err while cloning object : " + objectToClone);
			    			System.err.println("Trying to clone a property on an unknown type ! ");
			    			System.err.println("-----------------------------------------------");
			    		}
				    	
				    	
				       	// If the attribute we clone is a ReflectiveSequence
				    	String theAttributeMetaClassName = ((fr.irisa.triskell.kermeta.language.structure.Class) theAttributeMetaClass.getData().get("kcoreObject")).getTypeDefinition().getName();
			    		// For each element in the collection, we need to add an opposite 
			    		if ( theAttributeMetaClassName.equals("ReflectiveSequence") )
			    		{	
			    			
			    			// Build a new reflective Collection
			    			RuntimeObject resultAttribute = new RuntimeObject(this, theAttributeMetaClass);
			    			    		    			
			    			ArrayList attributeContents = (ArrayList) theAttributeValue.getData().get("CollectionArrayList");
			    			ArrayList resultAttributeContents = new ArrayList();
		    				
			    			Property oppositeProperty = ((Property) ((RuntimeObject) theAttributeValue.getData().get("RProperty")).getData().get("kcoreObject")).getOpposite(); 
			    			String oppositeName = oppositeProperty.getName();
			    			
			    			
			    			Iterator elementIterator = attributeContents.iterator();
			    			
			    			// Manage each object contained in the reflective Colletion
			    			while ( elementIterator.hasNext() )
			    			{
			    				RuntimeObject element = (RuntimeObject) elementIterator.next();
			    				System.out.println(" Essai de cloner l'objet : " + element.getOId());
			    				RuntimeObject clonedElement = deepCloneRuntimeObjectFromObject(element.getMetaclass(), element);
			    				
			    				// Manage opposite properties
			    				// Get the opposite property of "cloned element" and set it with the result of our current clone operation
			    				//RuntimeObject elementProperty = (RuntimeObject) clonedElement.getProperties().get(oppositeName);
			    				
			    				// test if the opposite is a Collection or a simple attribute
			    				if (oppositeProperty.getUpper() == 1){
									clonedElement.getProperties().put(oppositeName, result);
									
								} else { 	
									ArrayList elementPropertyCollection = new ArrayList();
									//elementProperty.getData().put("CollectionArrayList", elementPropertyCollection);
									clonedElement.getData().put("CollectionArrayList", elementPropertyCollection);
									elementPropertyCollection.add(result); 
								}
											    				
			    				// Put the Object in the our new collection !
			    				resultAttributeContents.add(clonedElement);
			    			}
			    			
			    			resultAttribute.getData().put("CollectionArrayList", resultAttributeContents);
			    			result.getProperties().put(theAttributeName, resultAttribute);
						
			    		} else {
			    			// Here we faced a simple attribute
			    			// Deep cloning the value of the attribute
			    			result.getProperties().put(theAttributeName, deepCloneRuntimeObjectFromObject(theAttributeMetaClass, theAttributeValue));	
			    		}
			    	
			    	} else {
			    		
			    		// if the AttributeValue is Null
			    		System.out.println("\t warning : attribute has no value");
			    	}
			  
			    }  
			
			} 
			
		} // HashTable contains ...
		
		return result;
	    
	}
	
	/**
	 * This only work for classes that have no type parameters
	 * @param roclassdef
	 * @return
	 */
	public RuntimeObject getClassForClassDefinition(RuntimeObject roclassdef) {
	    
	    ClassDefinition class_def = (ClassDefinition)roclassdef.getData().get("kcoreObject");
	    
	    // The precondition
	    if (class_def == null || class_def.getTypeParameter().size() > 0) {
	        throw new Error("INTERNAL ERROR : method getClassForClassDefinition can only create classes for non parametric class definitions");
	    }
	    
	    RuntimeObject result = (RuntimeObject)non_parametric_metaclass_cache.get(class_def);
	    
	    if(result != null) return result;
	    
        result = createRuntimeObjectFromClass(getClassClass());
        result.getProperties().put("typeDefinition", roclassdef);
        fr.irisa.triskell.kermeta.language.structure.Class fclass = struct_factory.createClass();
        fclass.setTypeDefinition(class_def);
        result.getData().put("kcoreObject", fclass);
        
        // if this comes from a jar unit, create it in a special way
        if(RuntimeHelper.isJarProxy(class_def)){
        	result.getData().put("isJarProxy", true);
        }
        
        non_parametric_metaclass_cache.put(class_def, result);
        
	    return result;
	}
	
	protected  RuntimeObject class_typeParamBinding_property = null;
	

	public KermetaIOStream getKermetaIOStream()
	{
	    return stream;
	}
	
	public void setKermetaIOStream(KermetaIOStream pStream)
	{
	    stream = pStream;
	}
	
    public RuntimeMemory getMemory() {
        return memory;
    }
}
