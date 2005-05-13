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
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method removeAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.removeAt(index)
	public static RuntimeObject removeAt(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject to_remove = OrderedCollection.elementAt(self, param0);
		ReflectiveCollection.remove(self, param0);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/**
	 * This is a cache of ReflectiveCollection Class object indexed by the type parameter
	 * used
	 */
	//protected static Hashtable reflective_sequence_classes = new Hashtable();

	public static RuntimeObject createReflectiveSequence(RuntimeObject object, RuntimeObject property) {
		
	    /*
	    RuntimeObject result;
		
		// FIXME: This is not finished. The metaClass is not set correctely
		
		RuntimeObject rc_class = null; //(RuntimeObject)reflective_sequence_classes.get(property.getProperties().get("type"));
		// If the rc_class does not exist yet in the stored RS classes
		if (rc_class == null)
		{
		    // Create the RuntimeObject for the type "ReflectiveSequence" (and later
		    // set specific bindings)
			RuntimeObject reflective_class_def = object.getFactory().getTypeDefinitionByName("kermeta::language::ReflectiveSequence");
			rc_class = object.getFactory().createObjectFromClassName("kermeta::language::structure::Class");
			rc_class.getData().put("kcoreObject", reflective_class_def.getData().get("kcoreObject"));
			
			//
			rc_class.getProperties().put(
				     "typeParamBinding",
				     Collection.createCollection(
				             (RuntimeObject)object.getFactory().getClassDefTable().get(
				                     "kermeta::language::structure::TypeVariableBinding")));
			
			
			// Create the RuntimeObject for the type "TypeVariableBinding"
			RuntimeObject binding = object.getFactory().createObjectFromClassName("kermeta::language::structure::TypeVariableBinding");
			//binding.getProperties().put("type", property.getProperties().get("type"));
			//binding.getProperties().put("variable", Collection.getArrayList((RuntimeObject)reflective_class_def.getProperties().get("typeParameter")).get(0));
			
			
			
			/** FIXME :  NullPointerException here! try and launch it, than follow
			 * the stack trace... : "RProperty" seems to be not properly set*/
			// Set to the first position the property "typeParamBinding"
			// We want 
	/*		RuntimeObject ro_position = 
			    fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(
			            0,
			            object.getFactory());
			ReflectiveSequence.addAt(
			        (RuntimeObject)rc_class.getProperties().get("typeParameterBinding"),
			        ro_position,
			        binding
			        );
			// Add a "binding" in the collection of "typeParamBindings" for the type "ReflectiveSequence"
			Collection.add((RuntimeObject)rc_class.getProperties().get("typeParamBinding"), binding);
			//reflective_sequence_classes.put(property.getProperties().get("type"), rc_class);
		}
		
		// If the class parametrized does already exist, do not "recreate" it : only "reuse" it to
		// create a new RuntimeObject instance of it
		result = object.getFactory().createRuntimeObject(rc_class);
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		return result;
		*/
		
		RuntimeObject result;
		RuntimeObject reflective_class_def = object.getFactory().getTypeDefinitionByName("kermeta::language::ReflectiveSequence");
		result = object.getFactory().createObjectFromClassDefinition(reflective_class_def);
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		return result;
	}
	
}
/* END OF FILE */
