/* Implementation of Kermeta base type ReflectiveSequence */

package fr.irisa.triskell.kermeta.runtime.language;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;

public class ReflectiveSequence {

	// Implementation of method addAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.addAt(index, element)
	public static KermetaObject addAt(KermetaObject self, KermetaObject param0, KermetaObject param1) {
//		 add the new object
		OrderedCollection.addAt(self, param0, param1);
		// set the new objects container if needed
		if (ReflectiveCollection.isaContainer(self)) param1.setContainer(ReflectiveCollection.getObject(self));
		// take care of the opposite
		KermetaObject oproperty = ReflectiveCollection.getOppositeProperty(self);
		if (oproperty != null) {
			Object.handleOppositeProperySet(param1, oproperty, ReflectiveCollection.getObject(self));
		}
		return Void.VOID;
	}

	// Implementation of method removeAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.removeAt(index)
	public static KermetaObject removeAt(KermetaObject self, KermetaObject param0) {
		KermetaObject to_remove = OrderedCollection.elementAt(self, param0);
		ReflectiveCollection.remove(self, param0);
		return Void.VOID;
	}
	
	/**
	 * This is a cache of ReflectiveCollection Class object indexed by the type parameter
	 * used
	 */
	protected static Hashtable reflective_sequence_classes = new Hashtable();

	public static KermetaObject createReflectiveSequence(KermetaObject object, KermetaObject property) {
		KermetaObject result;
		
		KermetaObject rc_class = (KermetaObject)reflective_sequence_classes.get(property.getProperties().get("type"));
		
		if (rc_class == null) {
			KermetaObject reflective_class_def = object.getFactory().getTypeDefinitionByName("kermeta::language::ReflectiveSequence");
			rc_class = object.getFactory().createClassFromClassDefinition(reflective_class_def);
			KermetaObject binding = object.getFactory().createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
			binding.getProperties().put("type", property.getProperties().get("type"));
			binding.getProperties().put("variable", Collection.getArrayList((KermetaObject)reflective_class_def.getProperties().get("typeParameter")).get(0));
			ReflectiveCollection.add(Object.get(rc_class, object.getFactory().getClass_typeParamBinding_properety()), binding);
			reflective_sequence_classes.put(property.getProperties().get("type"), rc_class);
		}
		
		result = object.getFactory().createKermetaObject(rc_class);
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		return result;
	}
	
}
/* END OF FILE */
