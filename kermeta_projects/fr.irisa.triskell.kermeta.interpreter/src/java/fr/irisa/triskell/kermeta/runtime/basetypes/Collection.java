/* $Id: Collection.java,v 1.11 2007-08-08 13:00:01 dvojtise Exp $
 * Project : Kermeta interpreter
 * File : Collection.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mars 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr> 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;


/** Implementation of Kermeta base type Collection  
 * to be used via an extern call in Kermeta */
public class Collection {

	// Implementation of method add called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::add(element)
	public static RuntimeObject add(RuntimeObject self, RuntimeObject param0) {
	    getArrayList(self).add(param0);
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::remove(element)
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
		getArrayList(self).remove(param0);
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::clear()
	public static RuntimeObject clear(RuntimeObject self) {
		getArrayList(self).clear();
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method size called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::size()
	public static RuntimeObject size(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getArrayList(self).size());
		return result;
	}

	// Implementation of method iterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::iterator()
	public static RuntimeObject iterator(RuntimeObject self, RuntimeObject result) {
		/*
		fr.irisa.triskell.kermeta.language.structure.Class it_class = self.getFactory().getMemory().getUnit().struct_factory.createClass();
	    
	    it_class.setTypeDefinition((ClassDefinition)self.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Iterator"));
	    
	    TypeVariableBinding binding = self.getFactory().getMemory().getUnit().struct_factory.createTypeVariableBinding();
	    
	    binding.setVariable((ObjectTypeVariable)it_class.getTypeDefinition().getTypeParameter().get(0));
	    
	    fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)self.getMetaclass().getData().get("kcoreObject");
	    
	    
	    binding.setType(((TypeVariableBinding)self_class.getTypeParamBinding().get(0)).getType());
	    
	    it_class.getTypeParamBinding().add(binding);
	    
	    RuntimeObject result = self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass(it_class));
		*/
		Iterator.setValue(result, ((ArrayList)getArrayList(self).clone()).iterator());
		return result;
	}

	public static ArrayList<RuntimeObject> getArrayList(RuntimeObject collection) {
		if (!collection.getData().containsKey("CollectionArrayList"))
		{
		    collection.getData().put("CollectionArrayList", new ArrayList<RuntimeObject>());
		}
		return (ArrayList<RuntimeObject>)collection.getData().get("CollectionArrayList");
	}
	
	
	/**
	 * Creates an empty collection given a specialised type, and the type parameter
	 * @param specColl : the qualified name of the specialised type of collection among Set, OrderedSet, ...
	 * @param factory : the runtime object factory
	 * @param typeParam : the type parameter value of the Collection to create
	 */
	public static RuntimeObject create(java.lang.String specColl, RuntimeObjectFactory factory, Type typeParam) {
		
		fr.irisa.triskell.kermeta.language.structure.Class coll_class = StructureFactory.eINSTANCE.createClass();
	    
	    coll_class.setTypeDefinition((ClassDefinition)factory.getMemory().getUnit().getTypeDefinitionByName(specColl));
	    
	    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    
	    binding.setVariable((ObjectTypeVariable)coll_class.getTypeDefinition().getTypeParameter().get(0));
	    
	    // Set the param binding type
	    binding.setType(typeParam);
	    // Add to type param bindings the binding
	    coll_class.getTypeParamBinding().add(binding);
	    
	    RuntimeObject result = factory.createRuntimeObjectFromClass(factory.createMetaClass(coll_class));
		
		return result;
	}

	
}
/* END OF FILE */
