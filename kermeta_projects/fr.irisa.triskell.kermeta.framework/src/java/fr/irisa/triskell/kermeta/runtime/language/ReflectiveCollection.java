/* Implementation of Kermeta base type ReflectiveCollection */

package fr.irisa.triskell.kermeta.runtime.language;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.TRUE;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;
import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;

public class ReflectiveCollection {

	// Implementation of method add called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.add(element)
	public static KermetaObject add(KermetaObject self, KermetaObject param0) {
		add(self, param0, true);
		return Void.VOID;
	}
	
	public static void add(KermetaObject self, KermetaObject param0, boolean handle_opposite) {
		// add the new object
		Collection.add(self, param0);
		// set the new objects container if needed
		if (isaContainer(self)) param0.setContainer(getObject(self));
		// take care of the opposite
		if(handle_opposite) {
			KermetaObject oproperty = getOppositeProperty(self);
			if (oproperty != null) {
				Object.handleOppositeProperySet(param0, oproperty, getObject(self));
			}
		}
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.remove(element)
	public static KermetaObject remove(KermetaObject self, KermetaObject param0) {
		remove(self, param0, true);
		return Void.VOID;
	}
	
	public static void remove(KermetaObject self, KermetaObject param0, boolean handle_opposite) {
		// get rid of the object
		Collection.remove(self, param0);
		// update containment
		if (isaContainer(self)) param0.setContainer(null);
		// take care of the opposite
		if(handle_opposite) {
			KermetaObject oproperty = getOppositeProperty(self);
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
	public static KermetaObject clear(KermetaObject self) {
		clear(self, true);
		return Void.VOID;
	}
	
	public static void clear(KermetaObject self, boolean handle_opposite) {
		Iterator it = ((ArrayList)Collection.getArrayList(self).clone()).iterator();
		while(it.hasNext()) {
			ReflectiveCollection.remove(self, (KermetaObject)it.next(), handle_opposite);
		}
		
	}
	
	
	/**
	 * This is a cache of ReflectiveCollection Class object indexed by the type parameter
	 * used
	 */
	protected static Hashtable reflective_collection_classes = new Hashtable();

	public static KermetaObject createReflectiveCollection(KermetaObject object, KermetaObject property) {
		KermetaObject result;
		
		KermetaObject rc_class = (KermetaObject)reflective_collection_classes.get(property.getProperties().get("type"));
		
		if (rc_class == null) {
			KermetaObject reflective_class_def = object.getFactory().getTypeDefinitionByName("kermeta::language::ReflectiveCollection");
			rc_class = object.getFactory().createClassFromClassDefinition(reflective_class_def);
			KermetaObject binding = object.getFactory().createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
			binding.getProperties().put("type", property.getProperties().get("type"));
			binding.getProperties().put("variable", Collection.getArrayList((KermetaObject)reflective_class_def.getProperties().get("typeParameter")).get(0));
			ReflectiveCollection.add(Object.get(rc_class, object.getFactory().getClass_typeParamBinding_properety()), binding);
			reflective_collection_classes.put(property.getProperties().get("type"), rc_class);
		}
		
		result = object.getFactory().createKermetaObject(rc_class);
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		return result;
	}
	
	public static KermetaObject getObject(KermetaObject reflective_collection) {
		return (KermetaObject)reflective_collection.getData().get("RObject");
	}
	
	public static KermetaObject getProperty(KermetaObject reflective_collection) {
		return (KermetaObject)reflective_collection.getData().get("RProperty");
	}
	
	public static int getUpper(KermetaObject reflective_collection) {
		return Integer.getValue((KermetaObject)((KermetaObject)reflective_collection.getData().get("RProperty")).getProperties().get("upper"));
	}
	
	public static boolean isaSet(KermetaObject reflective_collection) {
		return ((KermetaObject)reflective_collection.getData().get("RProperty")).getProperties().get("unique") == TRUE.INSTANCE;
	}
	
	public static boolean isaContainer(KermetaObject reflective_collection) {
		return ((KermetaObject)reflective_collection.getData().get("RProperty")).getProperties().get("isComposite") == TRUE.INSTANCE;
	}
	
	public static KermetaObject getOppositeProperty(KermetaObject reflective_collection) {
		return (KermetaObject)((KermetaObject)reflective_collection.getData().get("RProperty")).getProperties().get("opposite");
	}

}
/* END OF FILE */
