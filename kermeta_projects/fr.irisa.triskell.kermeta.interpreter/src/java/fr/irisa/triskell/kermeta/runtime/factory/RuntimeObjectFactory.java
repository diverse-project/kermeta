/* $Id: RuntimeObjectFactory.java,v 1.23 2007-08-01 07:18:13 ftanguy Exp $
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
import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence;
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
		
		// I (Franck F) think bug #2157 comes from here.
		// The class definition for the class class should be assigned
		// not sure how to get it from here
		
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
	    	fr.irisa.triskell.kermeta.language.structure.Class fc = StructureFactory.eINSTANCE.createClass();
		    fc.setTypeDefinition((ClassDefinition)memory.getUnit().getTypeDefinitionByQualifiedName("kermeta::language::ReflectiveSequence"));
		    
		    fr.irisa.triskell.kermeta.language.structure.Class tpb_class = StructureFactory.eINSTANCE.createClass();
		    tpb_class.setTypeDefinition((ClassDefinition)memory.getUnit().getTypeDefinitionByQualifiedName("kermeta::language::structure::TypeVariableBinding"));
		    
		    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
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
	private Hashtable<TypeDefinition, RuntimeObject> modeltype_cache = new Hashtable();

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
	        	ro_type = memory.getRuntimeObjectForFObject(binding_type);
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
	
	
	/**
	 * This should never be called, if I guess correctly.
	 * @param fModelType
	 * @return
	 */
	public RuntimeObject createModelType(ModelType fModelType) {
		RuntimeObject result = (RuntimeObject) modeltype_cache.get(fModelType);
		if (result != null) return result;
				
		RuntimeObject model_type = new RuntimeObject(this, getModelTypeClass());
		model_type.getData().put("kcoreObject", fModelType);
		//model_type.getProperties().put("typeDefinition", memory.getRuntimeObjectForFObject(fModelType.getTypeDefinition()));		
		
		modeltype_cache.put(fModelType, model_type);
		
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
			SimpleType t = new SimpleType(the_class); 
			if (t.isSemanticallyAbstract()) {
				//throw new Error("Kermeta Runtime Error: Unable to instantiate semantically abstract class " + FTypePrettyPrinter.getInstance().accept(the_class));
				SimpleType t1 = new SimpleType(the_class);
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
	 * Look the class definition for a property
	 * If not found, look in the supertypes
	 */
	private Property getProperty(ClassDefinition metaclass,String propertyName) {
		Iterator it = ClassDefinitionHelper.getAllProperties(metaclass).iterator();//metaclass.getOwnedAttribute().iterator();
		while(it.hasNext()) {
			Property property = (Property)it.next();
			if(property.getName().equals(propertyName))
				return property;
		}
		/*it = metaclass.getSuperType().iterator();
		while(it.hasNext()) {
			Property property = getProperty((ClassDefinition)((fr.irisa.triskell.kermeta.language.structure.Class)it.next()).getTypeDefinition(),propertyName);
			if(property!=null)
				return property;
		}*/
		return null;
	}

	/**
	 * Create a new RuntimeObject from another runtime object
	 * Implement the "clone" feature. There is two step in the cloning process
	 * First, all the attributes are cloned (but references are not handled)
	 * Then, references are considered : those which reference an object that has been
	 * cloned in the previous step are set to reference the clone.
	 * 
	 * @param meta_class the class of the object to clone
	 * @param objectToClone the object we want to clone
	 * @return the clone of the objectToClone 
	 */
	public RuntimeObject cloneRuntimeObjectFromObject(RuntimeObject meta_class, RuntimeObject objectToClone)  {
		// First we clone the attributes
		RuntimeObject result = cloneAttributesFromRuntimeObject(objectToClone);

		// Then we handle references
		Enumeration<RuntimeObject> keys = cloneObjectTable.keys();
		while(keys.hasMoreElements())
			cloneReferencesFromRuntimeObject(keys.nextElement());

		cloneObjectTable.clear();
		return result;
	}

	/**
	 * Create a new RuntimeObject by cloning the attributes of another RuntimeObject
	 * 
	 * @param objectToClone the object to clone
	 * @return a RuntimeObject where the attributes of objectToClone have been cloned
	 */
	public RuntimeObject cloneAttributesFromRuntimeObject(RuntimeObject objectToClone) {
		RuntimeObject meta_class = objectToClone.getMetaclass();
		// Handles enumeration literal 
		if (((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition().getName().equals("EnumerationLiteral"))
			return objectToClone;

		// Builds a new empty object (default constructor)
		RuntimeObject result = createRuntimeObjectFromClass(meta_class);

		// Handles primitive value data
		if (objectToClone.getData().containsKey("StringValue"))
			result.getData().put("StringValue", objectToClone.getData().get("StringValue"));
		if (objectToClone.getData().containsKey("NumericValue"))
			result.getData().put("NumericValue", objectToClone.getData().get("NumericValue"));
		if (objectToClone.getData().containsKey("BooleanValue"))
			result.getData().put("BooleanValue", objectToClone.getData().get("BooleanValue"));
		if (objectToClone.getData().containsKey("CharacterValue"))
			result.getData().put("CharacterValue", objectToClone.getData().get("CharacterValue"));
		
		// Handles collections
		if (objectToClone.getData().containsKey("CollectionArrayList")) {
			ArrayList objectToCloneContents = (ArrayList) objectToClone.getData().get("CollectionArrayList");
			ArrayList resultContents = new ArrayList();

            // Clones each value in the collection
			Iterator elementIterator = objectToCloneContents.iterator();
			while ( elementIterator.hasNext() ){
				RuntimeObject element = (RuntimeObject) elementIterator.next();
				resultContents.add(cloneAttributesFromRuntimeObject(element));
			}
			result.getData().put("CollectionArrayList", resultContents);
		}

		Enumeration<String> objectToCloneProperties = objectToClone.getProperties().keys();
		while(objectToCloneProperties.hasMoreElements()) {
			String propertyName = objectToCloneProperties.nextElement();
			RuntimeObject propertyValue = objectToClone.getProperties().get(propertyName);
			String propertyMetaclassName = ((fr.irisa.triskell.kermeta.language.structure.Class) propertyValue.getMetaclass().getData().get("kcoreObject")).getTypeDefinition().getName();
			Property property = getProperty((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition(), propertyName);
			RuntimeObject roProperty = getMemory().getRuntimeObjectForFObject(property);
			if (property.isIsComposite()) {
				// Property is an attribute

				// Handles reflective sequence and reflective collection
				if (propertyMetaclassName.equals("ReflectiveSequence")) {
					RuntimeObject resultProperty = fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence.createReflectiveSequence(result,roProperty);

					// Handles each object in the reflective sequence
					Iterator elementIterator = ((ArrayList) propertyValue.getData().get("CollectionArrayList")).iterator();
					for(int i=0;elementIterator.hasNext();i++) {
						RuntimeObject cloneElement = cloneAttributesFromRuntimeObject((RuntimeObject)elementIterator.next());
						ReflectiveSequence.addAt(resultProperty, fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i,this), cloneElement);
					}
					fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, resultProperty, false);
				}
				else if (propertyMetaclassName.equals("ReflectiveCollection")) {
					RuntimeObject resultProperty = fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.createReflectiveCollection(result,roProperty);

					// Handles each object in the reflective collection
					Iterator elementIterator = ((ArrayList) propertyValue.getData().get("CollectionArrayList")).iterator();
					while(elementIterator.hasNext()) {
						RuntimeObject cloneElement = cloneAttributesFromRuntimeObject((RuntimeObject) elementIterator.next());
						ReflectiveCollection.add(resultProperty, cloneElement, true);
					}
					fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, resultProperty, false);
				}
				else {
					RuntimeObject propertyClone = cloneAttributesFromRuntimeObject(propertyValue); 
					fr.irisa.triskell.kermeta.runtime.language.Object.set(result, getMemory().getRuntimeObjectForFObject(property), propertyClone, true);
				}
			}
		}
		cloneObjectTable.put(objectToClone, result);
		return result;
	}

	public void cloneReferencesFromRuntimeObject(RuntimeObject objectToClone) {
		RuntimeObject result = cloneObjectTable.get(objectToClone);
		RuntimeObject meta_class = objectToClone.getMetaclass();
		
		Enumeration<String> objectToCloneProperties = objectToClone.getProperties().keys();
		while(objectToCloneProperties.hasMoreElements()) {
			String propertyName = objectToCloneProperties.nextElement();
			RuntimeObject propertyValue = objectToClone.getProperties().get(propertyName);
			RuntimeObject propertyMetaclass = propertyValue.getMetaclass();
			String propertyMetaclassName = ((fr.irisa.triskell.kermeta.language.structure.Class) propertyMetaclass.getData().get("kcoreObject")).getTypeDefinition().getName();
			Property property = getProperty((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition(), propertyName);
			RuntimeObject roProperty = getMemory().getRuntimeObjectForFObject(property);
			if (!property.isIsComposite()) {
				// Property is a reference 
			
				// Handles reflective sequence and reflective collection
				if (propertyMetaclassName.equals("ReflectiveSequence")) {
					RuntimeObject resultProperty = fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence.createReflectiveSequence(result,roProperty);

					// Handles each object in the reflective sequence
					Iterator elementIterator = ((ArrayList) propertyValue.getData().get("CollectionArrayList")).iterator();
					for(int i=0;elementIterator.hasNext();i++) {
						RuntimeObject element = (RuntimeObject) elementIterator.next();
						if(cloneObjectTable.containsKey(element))
							ReflectiveSequence.addAt(resultProperty, fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, this), cloneObjectTable.get(element));
						else if(property.getOpposite() == null)
							ReflectiveSequence.addAt(resultProperty, fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, this), element);
					}
					fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, resultProperty, false);
				}
				else if (propertyMetaclassName.equals("ReflectiveCollection")) {
					RuntimeObject resultProperty = fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.createReflectiveCollection(result, roProperty);

					// Handles each object in the reflective collection
					Iterator elementIterator = ((ArrayList) propertyValue.getData().get("CollectionArrayList")).iterator();
					while(elementIterator.hasNext()) {
						RuntimeObject element = (RuntimeObject) elementIterator.next();
						if(cloneObjectTable.containsKey(element))
							ReflectiveCollection.add(resultProperty, cloneObjectTable.get(element), true);
						else if(property.getOpposite() == null)
							ReflectiveCollection.add(resultProperty, element, true);
					}
					fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, resultProperty, false);
				}
				else {
					if(cloneObjectTable.containsKey(propertyValue))
						fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, cloneObjectTable.get(propertyValue),true);
					else if(property.getOpposite() == null)
						fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, propertyValue, true);
				}
			}
		}
	}
	
	
	
	/**
	 * This Hashtable is used by the clone and deepClone operations
	 * It allows to remember which objects have been already cloned.
	 */
	public Hashtable<RuntimeObject,RuntimeObject> cloneObjectTable = new Hashtable<RuntimeObject,RuntimeObject>();
	
	
	/**
	 * Create a new RuntimeObject from another runtime object
	 * Implement the "deep clone" feature.

	 * @param meta_class the class of the object to clone
	 * @param objectToClone the object we want to clone
	 * @return the clone of the objectToClone 
	 */
	public RuntimeObject deepCloneRuntimeObjectFromObject(RuntimeObject meta_class, RuntimeObject objectToClone)
	{    
		RuntimeObject metaClass = objectToClone.getMetaclass();
		// Handles enumeration literal 
		if (((fr.irisa.triskell.kermeta.language.structure.Class) metaClass.getData().get("kcoreObject")).getTypeDefinition().getName().equals("EnumerationLiteral"))
			return objectToClone;

		// if the object has already been cloned, then return the clone
		if (cloneObjectTable.containsKey(objectToClone))
			return cloneObjectTable.get(objectToClone);

		// Builds a new empty object (default constructor)
		RuntimeObject result = createRuntimeObjectFromClass(meta_class);
		cloneObjectTable.put(objectToClone, result);

		// Handles primitive value data
		if (objectToClone.getData().containsKey("StringValue"))
			result.getData().put("StringValue", objectToClone.getData().get("StringValue"));
		if (objectToClone.getData().containsKey("NumericValue"))
			result.getData().put("NumericValue", objectToClone.getData().get("NumericValue"));
		if (objectToClone.getData().containsKey("NumericValue"))
			result.getData().put("BooleanValue", objectToClone.getData().get("BooleanValue"));
		if (objectToClone.getData().containsKey("CharacterValue"))
			result.getData().put("CharacterValue", objectToClone.getData().get("CharacterValue"));
		
		// Handles collections
		if (objectToClone.getData().containsKey("CollectionArrayList")) {
			ArrayList<RuntimeObject> resultContents = new ArrayList<RuntimeObject>();

            // Clones each value in the collection
			Iterator elementIterator = ((ArrayList) objectToClone.getData().get("CollectionArrayList")).iterator();
			while ( elementIterator.hasNext() ){
				RuntimeObject element = (RuntimeObject) elementIterator.next();
				resultContents.add(deepCloneRuntimeObjectFromObject(element.getMetaclass(), element));
			}
			result.getData().put("CollectionArrayList", resultContents);
		}

		Enumeration<String> objectToCloneProperties = objectToClone.getProperties().keys();
		while(objectToCloneProperties.hasMoreElements()) {
			String propertyName = objectToCloneProperties.nextElement();
			RuntimeObject propertyValue = objectToClone.getProperties().get(propertyName);
			String propertyMetaclassName = ((fr.irisa.triskell.kermeta.language.structure.Class) propertyValue.getMetaclass().getData().get("kcoreObject")).getTypeDefinition().getName();
			Property property = getProperty((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) meta_class.getData().get("kcoreObject")).getTypeDefinition(), propertyName);
			RuntimeObject roProperty = getMemory().getRuntimeObjectForFObject(property);
			
			// Handles reflective sequence and reflective collection
			if (propertyMetaclassName.equals("ReflectiveSequence")) {
				RuntimeObject resultProperty = fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence.createReflectiveSequence(result,roProperty);

				// Handles each object in the reflective sequence
				Iterator elementIterator = ((ArrayList) propertyValue.getData().get("CollectionArrayList")).iterator();
				for(int i=0;elementIterator.hasNext();i++) {
					RuntimeObject element = (RuntimeObject) elementIterator.next();
					ReflectiveSequence.addAt(resultProperty, fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, this), deepCloneRuntimeObjectFromObject(element.getMetaclass(), element));
				}
				fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, resultProperty, false);
			}
			else if (propertyMetaclassName.equals("ReflectiveCollection")) {
				RuntimeObject resultProperty = fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.createReflectiveCollection(result, roProperty);

				// Handles each object in the reflective collection
				Iterator elementIterator = ((ArrayList) propertyValue.getData().get("CollectionArrayList")).iterator();
				while(elementIterator.hasNext()) {
					RuntimeObject element = (RuntimeObject) elementIterator.next();
					ReflectiveCollection.add(resultProperty, deepCloneRuntimeObjectFromObject(element.getMetaclass(), element), true);
				}
				fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, resultProperty, false);
			}
			else {
				fr.irisa.triskell.kermeta.runtime.language.Object.set(result, roProperty, deepCloneRuntimeObjectFromObject(propertyValue.getMetaclass(), propertyValue), true);
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


    /**
     * This method allocates a RO for a kermeta::persistence::EMFResource element.
     * @param emfRes  - EMF Resource
     * @param repRO   - RO for the Repository that contains the resource to be created
     * @param mmUriRO - RO for the metamodel URI of the resource to be allocated
     * @return        - RO for the created resource
     */
    public RuntimeObject createRuntimeObjectFromResource(Resource emfRes, RuntimeObject repRO, RuntimeObject mmUriRO) {
    	// Allocate RO for the resource to be created
    	GenericTypeDefinition resClassDef  = (GenericTypeDefinition) this.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::persistence::EMFResource");
	    fr.irisa.triskell.kermeta.language.structure.Class resClass = StructureFactory.eINSTANCE.createClass();
	    resClass.setTypeDefinition(resClassDef);
	    RuntimeObject metaclassRO = repRO.getFactory().getMemory().getRuntimeObjectForFObject(resClass);

    	RuntimeObject resRO = new RuntimeObject(this, metaclassRO);

    	// Set "uri" property of resource RO (from emf resource uri)
    	resRO.getProperties().put(
    		"uri",
    		fr.irisa.triskell.kermeta.runtime.basetypes.String.create(emfRes.getURI().toString(), this)
    	);

    	// Set "metaModelURI" property of resource RO
    	resRO.getProperties().put("metaModelURI", mmUriRO);
    	
    	// Set "repository" property of resource RO
    	resRO.getProperties().put("repository", repRO);
    	
    	// Associate EMF resource to resource RO 
    	resRO.getData().put("r2e.emfResource", emfRes);
    	
    	return resRO;
    }
}
