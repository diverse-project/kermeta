/* Implementation of Kermeta base type ReflectiveCollection */

package fr.irisa.triskell.kermeta.runtime.language;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public class ReflectiveCollection {

	// Implementation of method add called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.add(element)
	public static RuntimeObject add(RuntimeObject self, RuntimeObject param0) {
		add(self, param0, true);
		return Void.VOID;
	}
	
	public static void add(RuntimeObject self, RuntimeObject param0, boolean handle_opposite) {
		// add the new object
		Collection.add(self, param0);
		// set the new objects container if needed
		if (isaContainer(self)) param0.setContainer(getObject(self));
		// take care of the opposite
		if(handle_opposite) {
			RuntimeObject oproperty = getOppositeProperty(self);
			if (oproperty != null) {
				Object.handleOppositeProperySet(param0, oproperty, getObject(self));
			}
		}
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.remove(element)
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
		remove(self, param0, true);
		return Void.VOID;
	}
	
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

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.clear()
	public static RuntimeObject clear(RuntimeObject self) {
		clear(self, true);
		return Void.VOID;
	}
	
	public static void clear(RuntimeObject self, boolean handle_opposite) {
		Iterator it = ((ArrayList)Collection.getArrayList(self).clone()).iterator();
		while(it.hasNext()) {
			ReflectiveCollection.remove(self, (RuntimeObject)it.next(), handle_opposite);
		}
		
	}
	
	
	/**
	 * This is a cache of ReflectiveCollection Class object indexed by the type parameter
	 * used
	 */
	protected static Hashtable reflective_collection_classes = new Hashtable();

	public static RuntimeObject createReflectiveCollection(RuntimeObject object, RuntimeObject property) {
		RuntimeObject result;
		
		RuntimeObject rc_class = (RuntimeObject)reflective_collection_classes.get(property.getProperties().get("type"));
		
		if (rc_class == null) {
			RuntimeObject reflective_class_def = object.getFactory().getTypeDefinitionByName("kermeta::language::ReflectiveCollection");
			rc_class = object.getFactory().createClassFromClassDefinition(reflective_class_def);
			RuntimeObject binding = object.getFactory().createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
			binding.getProperties().put("type", property.getProperties().get("type"));
			binding.getProperties().put("variable", Collection.getArrayList((RuntimeObject)reflective_class_def.getProperties().get("typeParameter")).get(0));
//			ReflectiveCollection.add(Object.get(rc_class, object.getFactory().getClass_typeParamBinding_properety()), binding);
			Collection.add((RuntimeObject)rc_class.getProperties().get("typeParameterBinding"), binding);
			reflective_collection_classes.put(property.getProperties().get("type"), rc_class);
		}
		
		result = object.getFactory().createRuntimeObject(rc_class);
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
		return ((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("unique") == Boolean.TRUE;
	}
	
	public static boolean isaContainer(RuntimeObject reflective_collection) {
		return ((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("isComposite") == Boolean.TRUE;
	}
	
	public static RuntimeObject getOppositeProperty(RuntimeObject reflective_collection) {
		return (RuntimeObject)((RuntimeObject)reflective_collection.getData().get("RProperty")).getProperties().get("opposite");
	}

}
/* END OF FILE */
