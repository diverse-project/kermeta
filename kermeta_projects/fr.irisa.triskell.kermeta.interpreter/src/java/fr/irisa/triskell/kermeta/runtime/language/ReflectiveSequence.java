/* Implementation of Kermeta base type ReflectiveSequence */

package fr.irisa.triskell.kermeta.runtime.language;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

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
		
	    FClass self_class = (FClass)object.getMetaclass().getData().get("kcoreObject");
	    
	    FProperty fprop = (FProperty)property.getData().get("kcoreObject");
	    
	    FType prop_type = TypeVariableEnforcer.getBoundType(fprop.getFType(), TypeVariableEnforcer.getTypeVariableBinding(self_class));
		
	    FClass reflect_class = object.getFactory().getMemory().getUnit().struct_factory.createFClass();
	        
	    reflect_class.setFClassDefinition( (FClassDefinition) object.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::language::ReflectiveSequence"));
	    
	    FTypeVariableBinding binding = object.getFactory().getMemory().getUnit().struct_factory.createFTypeVariableBinding();
	    
	    binding.setFVariable((FTypeVariable)reflect_class.getFClassDefinition().getFTypeParameter().get(0));
	    
	    binding.setFType(prop_type);
		
	    reflect_class.getFTypeParamBinding().add(binding);
	    
		RuntimeObject result = object.getFactory().createRuntimeObjectFromClass(object.getFactory().createMetaClass(reflect_class));
		
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		
		return result;
	}
	
}
/* END OF FILE */
