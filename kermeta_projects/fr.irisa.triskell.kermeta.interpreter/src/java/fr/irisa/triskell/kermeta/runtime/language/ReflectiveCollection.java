/* Implementation of Kermeta base type ReflectiveCollection */

package fr.irisa.triskell.kermeta.runtime.language;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

/**
 * Reflective collection is the java side (wrapper for add/remove/clear base methods
 * related to collection handling) of Kermeta reflective collections. A reflective
 * Collection is only used for properties (attributes/references) which type is
 * a (or a subtype of) collection.
 */
public class ReflectiveCollection {

	/** Implementation of method add called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.add(element)
	*/
	public static RuntimeObject add(RuntimeObject self, RuntimeObject param0) {
		add(self, param0, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/**
	 * Add method that takes into account the opposite property if the 3rd 
	 * argument (handle_opposite) is set to true. This method should not be called
	 * by the Kermeta user.
	 * 
	 * @param self the RuntimeObject representation of self object -- in kermeta side -- 
	 * that is a reflective collection, to which <code>param0</code> entity is added.
	 * @param param0 the RuntimeObject to add on self collection.
	 * @param handle_opposite if true, handle the opposite property, i.e add the given element
	 * to the opposite property and remove it from the "old" opposite property, otherwise ignore
	 * opposites.
	 * A review is needed for this method : it does not contain exactly the same body
	 * as the method addAt in ReflectiveSequence
	 */	
	public static void add(RuntimeObject self, RuntimeObject param0, boolean handle_opposite) {
		// add the new object
		Collection.add(self, param0);
		// set the new objects container if needed
		if (isaContainer(self)) {
		    // FIXME : We remove from self container an object that we just precedingly added??
		    if (param0.getContainer() != null) {
		        Object.removeObjectFromItsContainer(param0);
		    }
		    
		    param0.setContainer(getObject(self));
		}
		// take care of the opposite
		if(handle_opposite) {
			RuntimeObject oproperty = getOppositeProperty(self);
			if (oproperty != null) {
				Object.handleOppositeProperySet(param0, oproperty, getObject(self));
			}
		}
	}

	/** Implementation of method remove called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.remove(element)
	 */
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
		remove(self, param0, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/**
	 * Remove method that takes into account the opposite property if the 3rd 
	 * argument (handle_opposite) is set to true. This method should not be called
	 * by the Kermeta user.
	 * 
	 * @param self the RuntimeObject representation of self object -- in kermeta side -- 
	 * that is a reflective collection, from which <code>param0</code> entity is removed.
	 * @param param0 the RuntimeObject to remove from self collection.
	 * @param handle_opposite if true, handle the opposite property, i.e remove the given element
	 * to the opposite property and remove it from the "old" opposite property, otherwise ignore
	 * opposites.
	 */
	public static void remove(RuntimeObject self, RuntimeObject param0, boolean handle_opposite) {
		// get rid of the object
		Collection.remove(self, param0);
		// update containment
		if (isaContainer(self)) param0.setContainer(null);
		// take care of the opposite
		if(handle_opposite) {
			RuntimeObject oproperty = getOppositeProperty(self);
			if (oproperty != null) {
				if (Object.getPropertyUpper(oproperty) == 1) {
					Object.unSet(param0, oproperty, false);
				}
				else {
					ReflectiveCollection.remove(Object.get(param0, oproperty), getObject(self), false);
				}
			}
		}
		
	}

	/** Implementation of method clear called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.clear() */
	public static RuntimeObject clear(RuntimeObject self) {
		clear(self, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/**
	 * Clear method that takes in account and clear the opposite property if there is one
	 * @param self RuntimeObject representation of the kermeta collection on which user 
	 * asked to call <code>clear</code> method. 
	 * @param handle_opposite if true, also clear the content of opposite property.
	 */
	public static void clear(RuntimeObject self, boolean handle_opposite) {
		Iterator it = ((ArrayList)Collection.getArrayList(self).clone()).iterator();
		while(it.hasNext()) {
			ReflectiveCollection.remove(self, (RuntimeObject)it.next(), handle_opposite);
		}
		
	}
	
	/**
	 * Create the RuntimeObject representation of a reflective collection which 
	 * type parameter is the type of the given <code>property</code> (repr. as a 
	 * RuntimeObject), which "owner" object is the given <code>object</code>.
	 * Please see the javadoc+comments in ReflectiveSequence java class, in the method 
	 * <code>createReflectiveSequence</code>.
	 * @see ReflectiveSequence#createReflectiveSequence(RuntimeObject, RuntimeObject)
	 * @param object object for which we set the property value 
	 * @param property property which value to set is the returned RuntimeObject
	 * @return the RuntimeObject representation of a reflective collection
	 */
	public static RuntimeObject createReflectiveCollection(RuntimeObject object, RuntimeObject property)
	{
		// Cache : ClassDefinition cd -> RuntimeObject of kermeta::language::ReflectiveCollection<cd>
	    Hashtable cache_reflec_coll_class = object.getFactory().cache_reflec_coll_class;
	    
	    fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)object.getMetaclass().getData().get("kcoreObject");
	    
	    Property fprop = (Property)property.getData().get("kcoreObject");
	    
	    Type prop_type = TypeVariableEnforcer.getBoundType(fprop.getType(), TypeVariableEnforcer.getTypeVariableBinding(self_class));
		
	    RuntimeObject metaClass = null;
	    
	    if (prop_type instanceof fr.irisa.triskell.kermeta.language.structure.Class && ((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeParamBinding().size() == 0) {
	        metaClass = (RuntimeObject)cache_reflec_coll_class.get(((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeDefinition());
	    }
	    
	    if (metaClass == null) {
	        
	    	fr.irisa.triskell.kermeta.language.structure.Class reflect_class = object.getFactory().getMemory().getUnit().struct_factory.createClass();
	        
		    reflect_class.setTypeDefinition( (ClassDefinition) object.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::language::ReflectiveCollection"));
		    
		    TypeVariableBinding binding = object.getFactory().getMemory().getUnit().struct_factory.createTypeVariableBinding();
		    
		    binding.setVariable((TypeVariable)reflect_class.getTypeDefinition().getTypeParameter().get(0));
		    
		    binding.setType(prop_type);
			
		    reflect_class.getTypeParamBinding().add(binding);
		    
		    metaClass = object.getFactory().createMetaClass(reflect_class);
		    
		    if (prop_type instanceof fr.irisa.triskell.kermeta.language.structure.Class && ((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeParamBinding().size() == 0) {
		        cache_reflec_coll_class.put(((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeDefinition(), metaClass);
		    }
	    }
	    
		RuntimeObject result = object.getFactory().createRuntimeObjectFromClass(metaClass);
		
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		
		return result;
	}
	
	public static RuntimeObject getObject(RuntimeObject reflective_collection) {
		return (RuntimeObject)reflective_collection.getData().get("RObject");
	}
	
	public static RuntimeObject getProperty(RuntimeObject reflective_collection) {
		return (RuntimeObject)reflective_collection.getData().get("RProperty");
	}
	
	public static int getUpper(RuntimeObject reflective_collection) {
		return Integer.getValue((RuntimeObject)((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("upper"));
	}
	
	public static boolean isaSet(RuntimeObject reflective_collection) {
		return Boolean.getValue((RuntimeObject)((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("unique"));
	}
	
	public static boolean isaContainer(RuntimeObject reflective_collection) {
	    // FIXME Bug d'outre tombe
	    // reflective_collection.getData().get("RProperty") --> null;
		return Boolean.getValue((RuntimeObject)((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("isComposite"));
	}
	/** Get the opposite property of the kermeta object hosted by the given runtime object
	 * @param reflective_collection The runtime object for which we look for the opposite. It must be a ReflectiveCollection
	 * or a ReflectiveSequence */
	public static RuntimeObject getOppositeProperty(RuntimeObject reflective_collection) {
		return (RuntimeObject)((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("opposite");
	}

}
/* END OF FILE */
