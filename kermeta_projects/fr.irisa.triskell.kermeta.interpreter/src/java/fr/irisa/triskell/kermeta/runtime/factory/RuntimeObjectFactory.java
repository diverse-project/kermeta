/* $Id: RuntimeObjectFactory.java,v 1.4 2005-05-25 17:43:32 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
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
public class RuntimeObjectFactory {

	protected RuntimeMemory memory;
	
	protected KermetaIOStream stream = null;
	
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
	        
	        if (!(binding_type instanceof FClass)) {
	            throw new Error("INTERNAL ERROR : parametric classes should only be parametrized by classes.");
	        }
	        
	        RuntimeObject ro_var = (RuntimeObject)memory.getRuntimeObjectForFObject((FObject)fclass.getFClassDefinition().getFTypeParameter().get(i));
	        RuntimeObject ro_type = createMetaClass((FClass)binding_type);
	        
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
