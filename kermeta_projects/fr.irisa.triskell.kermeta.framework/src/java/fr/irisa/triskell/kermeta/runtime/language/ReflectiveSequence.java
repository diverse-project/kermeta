/* Implementation of Kermeta base type ReflectiveSequence */

package fr.irisa.triskell.kermeta.runtime.language;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;

public class ReflectiveSequence {

	// Implementation of method addAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.addAt(index, element)
	public static RuntimeObject addAt(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
//		 add the new object
		OrderedCollection.addAt(self, param0, param1);
		// set the new objects container if needed
		if (ReflectiveCollection.isaContainer(self)) param1.setContainer(ReflectiveCollection.getObject(self));
		// take care of the opposite
		RuntimeObject oproperty = ReflectiveCollection.getOppositeProperty(self);
		if (oproperty != null) {
			Object.handleOppositeProperySet(param1, oproperty, ReflectiveCollection.getObject(self));
		}
		return Void.VOID;
	}

	// Implementation of method removeAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.removeAt(index)
	public static RuntimeObject removeAt(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject to_remove = OrderedCollection.elementAt(self, param0);
		ReflectiveCollection.remove(self, param0);
		return Void.VOID;
	}
	
	/**
	 * This is a cache of ReflectiveCollection Class object indexed by the type parameter
	 * used
	 */
	protected static Hashtable reflective_sequence_classes = new Hashtable();

	public static RuntimeObject createReflectiveSequence(RuntimeObject object, RuntimeObject property) {
		RuntimeObject result;
		
		RuntimeObject rc_class = (RuntimeObject)reflective_sequence_classes.get(property.getProperties().get("type"));
		
		if (rc_class == null)
		{
			RuntimeObject reflective_class_def = object.getFactory().getTypeDefinitionByName("kermeta::language::ReflectiveSequence");
			rc_class = object.getFactory().createClassFromClassDefinition(reflective_class_def);
			RuntimeObject binding = object.getFactory().createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
			binding.getProperties().put("type", property.getProperties().get("type"));
			binding.getProperties().put("variable", Collection.getArrayList((RuntimeObject)reflective_class_def.getProperties().get("typeParameter")).get(0));
			/** FIXME :  NullPointerException here! try and launch it, than follow
			 * the stack trace... : "RProperty" seems to be not properly set*/
			// Set to the first position the property "typeParameterBinding"
			// We want 
	/*		RuntimeObject ro_position = 
			    fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(
			            0,
			            object.getFactory());
			ReflectiveSequence.addAt(
			        (RuntimeObject)rc_class.getProperties().get("typeParameterBinding"),
			        ro_position,
			        binding
			        );*/
			Collection.add((RuntimeObject)rc_class.getProperties().get("typeParameterBinding"), binding);
			reflective_sequence_classes.put(property.getProperties().get("type"), rc_class);
		}
		// set the kcoreObject for rc_class?
		result = object.getFactory().createRuntimeObject(rc_class);
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		return result;
	}
	
}
/* END OF FILE */
