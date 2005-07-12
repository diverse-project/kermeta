/* $Id: RuntimeObjectFactory.java,v 1.8 2005-07-12 15:12:58 fchauvel Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : GPL
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
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.runtime.language.Class;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
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
	 * Set the metaclass Class : it creates a new runtime object specific
	 * to the class Class
	 * @param classdef the FClassDefinition corresponding to this class
	 */
	public void setClassClassFromFClass(FClass fclass) {
		class_class = new RuntimeObject(this, null);
		class_class.setMetaclass(class_class);
		class_class.setData(new Hashtable());
		class_class.getData().put("kcoreObject",fclass);
	}
	
	
	public RuntimeObject getClassClass() {
		return class_class;
	}
	
	
	private RuntimeObject classReflectiveSequenceOtTypeParamBinding = null;
	private RuntimeObject getClassReflectiveSequenceOtTypeParamBinding() 
	{
	    if (classReflectiveSequenceOtTypeParamBinding == null) {
		    FClass fc = memory.getUnit().struct_factory.createFClass();
		    fc.setFClassDefinition((FClassDefinition)memory.getUnit().typeDefinitionLookup("kermeta::language::ReflectiveSequence"));
		    
		    FClass tpb_class = memory.getUnit().struct_factory.createFClass();
		    tpb_class.setFClassDefinition((FClassDefinition)memory.getUnit().typeDefinitionLookup("kermeta::language::structure::TypeVariableBinding"));
		    
		    FTypeVariableBinding binding = memory.getUnit().struct_factory.createFTypeVariableBinding();
		    binding.setFVariable((FTypeVariable)fc.getFClassDefinition().getFTypeParameter().get(0));
		    binding.setFType(tpb_class);
		    
		    fc.getFTypeParamBinding().add(binding);
		    
		    classReflectiveSequenceOtTypeParamBinding = new RuntimeObject(this, getClassClass());
		    classReflectiveSequenceOtTypeParamBinding.getData().put("kcoreObject", fc);
		    
		    classReflectiveSequenceOtTypeParamBinding.getProperties().put("classDefinition", memory.getRuntimeObjectForFObject(fc.getFClassDefinition()));
		    
		    RuntimeObject ro_bindings = new RuntimeObject(this, classReflectiveSequenceOtTypeParamBinding);
		    
		    classReflectiveSequenceOtTypeParamBinding.getProperties().put("typeParamBinding", ro_bindings);
		    
		    RuntimeObject ro_binding = createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
		    
		    RuntimeObject ro_tpb_class = new RuntimeObject(this, getClassClass());
		    ro_tpb_class.getData().put("kcoreObject", tpb_class);
		    ro_tpb_class.getProperties().put("classDefinition", memory.getRuntimeObjectForFObject(tpb_class.getFClassDefinition()));
		    
		    ro_binding.getProperties().put("variable", memory.getRuntimeObjectForFObject((FObject)fc.getFClassDefinition().getFTypeParameter().get(0)));
		    
	        ro_binding.getProperties().put("type", ro_tpb_class);
	        
	        Collection.getArrayList(ro_bindings).add(ro_binding);
		    
	    }
	    return classReflectiveSequenceOtTypeParamBinding;
	}
	
	private Hashtable non_parametric_metaclass_cache = new Hashtable();
	
	public RuntimeObject createMetaClass(FClass fclass) {
	    
	    if (fclass.getFTypeParamBinding().size() == 0) {
	        RuntimeObject result = (RuntimeObject)non_parametric_metaclass_cache.get(fclass.getFClassDefinition());
	        if (result != null) return result;
	    }
	    
	    // precondition
	    if (fclass.getFTypeParamBinding().size() != fclass.getFClassDefinition().getFTypeParameter().size()) {
	        throw new Error("INTERNAL ERROR : invalid FClass : all type variable should be bound.");
	    }
	    
	    RuntimeObject meta_class = new RuntimeObject(this, getClassClass());
	    meta_class.getData().put("kcoreObject", fclass);
	    meta_class.getProperties().put("classDefinition", memory.getRuntimeObjectForFObject(fclass.getFClassDefinition()));
	    
	    RuntimeObject ro_bindings = new RuntimeObject(this, getClassReflectiveSequenceOtTypeParamBinding());
	    meta_class.getProperties().put("typeParamBinding", ro_bindings);
	    
	    for(int i=0; i<fclass.getFTypeParamBinding().size(); i++ ) {
	        FTypeVariableBinding binding = (FTypeVariableBinding)fclass.getFTypeParamBinding().get(i);

	        FType binding_type = binding.getFType();
	        
	        while (binding_type instanceof FPrimitiveType) {
	            binding_type = ((FPrimitiveType)binding_type).getFInstanceType();
	        }
	        
	        RuntimeObject ro_var = (RuntimeObject)memory.getRuntimeObjectForFObject((FObject)fclass.getFClassDefinition().getFTypeParameter().get(i));
	        RuntimeObject ro_type = null;
	        if (binding_type instanceof FClass) {
	            ro_type = createMetaClass((FClass)binding_type);
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
	    
	    if (fclass.getFTypeParamBinding().size() == 0) {
	        non_parametric_metaclass_cache.put(fclass.getFClassDefinition(), meta_class);
	    }
	    
	    return meta_class;
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
//		TODO : take care of default values here ?
		//result.setData(new Hashtable());
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
	    String theMetaClassName = ((FClass) meta_class.getData().get("kcoreObject")).getFClassDefinition().getFName();
		System.out.println("J'ai trouvé un : " + theMetaClassName);
	 
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
				resultContents.add(Class.cloneObject(elementMetaClass, element));
			}
			result.getData().put("CollectionArrayList", resultContents);
			
		} else {				    						    		
		
		    // Get the list of attribute of the meta-class
		    EList metaClassAttribute = ((FClass) meta_class.getData().get("kcoreObject")).getFClassDefinition().getFOwnedAttributes();
		    
		    // Foreach property of the meta-class, deep or shallow clone 
		    Iterator metaClassAttributeIterator = metaClassAttribute.iterator();
		    while ( metaClassAttributeIterator.hasNext() ) {
		    	FProperty theMetaClassAttribute = (FProperty) metaClassAttributeIterator.next();
			    	    	
		    	String theAttributeName = theMetaClassAttribute.getFName();
			 
		    	RuntimeObject theAttributeValue = (RuntimeObject) objectToClone.getProperties().get(theAttributeName);
	    		
		    	// If the property has no yet been used, then its does not exist !
		    	if ( theAttributeValue != null ){
	    		
			    	RuntimeObject theAttributeMetaClass = theAttributeValue.getMetaclass();
			    	System.out.println("J'ai trouvé un : " + theAttributeMetaClass);
			    	System.out.println("J'ai trouvé un : " + theMetaClassAttribute.getFType());
			    	
			    	String theAttributeTypeName = null;
			    	if (theMetaClassAttribute.getFType() instanceof FClass) {
		    			theAttributeTypeName = ((FClass) theMetaClassAttribute.getFType()).getFClassDefinition().getFName();   		
		    		} else if (theMetaClassAttribute.getFType() instanceof FEnumeration) { 
		    			theAttributeTypeName = ((FEnumeration) theMetaClassAttribute.getFType()).getFName();
		    		} else {
		    			System.err.println("-----------------------------------------------");
		    			System.err.println("Err while cloning object : " + objectToClone);
		    			System.err.println("Trying to clone a property on an unknown type ! ");
		    			System.err.println("-----------------------------------------------");
		    		}
			    	
			    	if ( theMetaClassAttribute.isFIsComposite() ) { 	// ************ DEEP CLONE ************
			    	
			    		result.getProperties().put(theAttributeName, Class.cloneObject(theAttributeMetaClass, theAttributeValue));	
	
			    		String theAttributeMetaClassName = ((FClass) theAttributeMetaClass.getData().get("kcoreObject")).getFClassDefinition().getFName();
			    		
			    		// For each element in the collection, we nee to add an opposite 
			    		if ( theAttributeMetaClassName.equals("ReflectiveCollection") )
			    		{	
			    			// Build a new reflective Collection
			    			RuntimeObject resultAttribute = new RuntimeObject(this, theAttributeMetaClass);
			    			    		    			
			    			ArrayList attributeContents = (ArrayList) theAttributeValue.getData().get("CollectionArrayList");
			    			ArrayList resultAttributeContents = new ArrayList();
		    				
			    			FProperty oppositeProperty = ((FProperty) ((RuntimeObject) theAttributeValue.getData().get("RProperty")).getData().get("kcoreObject")).getFOpposite(); 
			    			String oppositeName = oppositeProperty.getFName();
			    			
			    			// Manage opposite for each object contained in the reflective Collections
			    			Iterator elementIterator = attributeContents.iterator();
			    			while ( elementIterator.hasNext() ){
			    				RuntimeObject element = (RuntimeObject) elementIterator.next();
			    				RuntimeObject cloneElement = Class.cloneObject(element.getMetaclass(), element);
			    				
			    				// Get the opposite property and add the result of our current clone operation
			    				RuntimeObject elementProperty = (RuntimeObject) cloneElement.getProperties().get(oppositeName);
			    				
			    				// test if the opposite is a Collection or an simple attribute
			    				if (oppositeProperty.getFUpper() == 1){
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
			    		System.out.println("C'est une propriété reference");	
	
			    		String theAttributeMetaClassName = ((FClass) theAttributeMetaClass.getData().get("kcoreObject")).getFClassDefinition().getFName();
			    		
			    		// For each element in the collection, we nee to add an opposite 
			    		if ( theAttributeMetaClassName.equals("ReflectiveCollection") ) 
			    		{			    			
			    			// Build a new refelctive Collection
			    			RuntimeObject resultAttribute = new RuntimeObject(this, theAttributeMetaClass);
			    			    		    			
			    			ArrayList attributeContents = (ArrayList) theAttributeValue.getData().get("CollectionArrayList");
			    			ArrayList resultAttributeContents = new ArrayList();
		    				
			    			FProperty oppositeProperty = ((FProperty) ((RuntimeObject) theAttributeValue.getData().get("RProperty")).getData().get("kcoreObject")).getFOpposite(); 
			    			String oppositeName = oppositeProperty.getFName();
			    			
			    			// Manage opposite for each object contains in the reflective Collections
			    			Iterator elementIterator = attributeContents.iterator();
			    			while ( elementIterator.hasNext() ){
			    				RuntimeObject element = (RuntimeObject) elementIterator.next();
			    				
			    				// get the opposite property and add the result of our current clone operation
			    				RuntimeObject elementProperty = (RuntimeObject) element.getProperties().get(oppositeName);
			    				
			    				// test if the opposite is a Collection or an simple attribute
			    				if (oppositeProperty.getFUpper() == 1){
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
	 * This only work for classes that have no type parameters
	 * @param roclassdef
	 * @return
	 */
	public RuntimeObject getClassForClassDefinition(RuntimeObject roclassdef) {
	    
	    FClassDefinition class_def = (FClassDefinition)roclassdef.getData().get("kcoreObject");
	    
	    // The precondition
	    if (class_def == null || class_def.getFTypeParameter().size() > 0) {
	        throw new Error("INTERNAL ERROR : method getClassForClassDefinition can only create classes for non parametric class definitions");
	    }
	    
	    RuntimeObject result = (RuntimeObject)non_parametric_metaclass_cache.get(class_def);
	    
	    if(result != null) return result;
	    
        result = createRuntimeObjectFromClass(getClassClass());
        result.getProperties().put("classDefinition", roclassdef);
        FClass fclass = struct_factory.createFClass();
        fclass.setFClassDefinition((FClassDefinition)roclassdef.getData().get("kcoreObject"));
        result.getData().put("kcoreObject", fclass);
        
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
