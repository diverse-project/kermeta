/* Implementation of Kermeta base type ReflectiveSequence */

package fr.irisa.triskell.kermeta.runtime.language;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
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
	 * Cache : ClassDefinition cd -> RuntimeObject of kermeta::language::ReflectiveCollection<cd>
	 */
	//private static Hashtable cache_reflec_seq_class = new Hashtable();
	
	/**
	 * This is a cache of ReflectiveCollection Class object indexed by the type parameter
	 * used
	 */
	//protected static Hashtable reflective_sequence_classes = new Hashtable();

	public static RuntimeObject createReflectiveSequence(RuntimeObject object, RuntimeObject property) {
		
	    Hashtable cache_reflec_seq_class = object.getFactory().cache_reflec_seq_class;
	    
	    fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)object.getMetaclass().getData().get("kcoreObject");
	    
	    Property fprop = (Property)property.getData().get("kcoreObject");
	    
	    Type prop_type = TypeVariableEnforcer.getBoundType(fprop.getType(), TypeVariableEnforcer.getTypeVariableBinding(self_class));
		
	    RuntimeObject metaClass = null;
	    
	    if (prop_type instanceof fr.irisa.triskell.kermeta.language.structure.Class && ((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeParamBinding().size() == 0) {
	        metaClass = (RuntimeObject)cache_reflec_seq_class.get(((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeDefinition());
	    }
	    
	    if (metaClass == null) {
	        
	    	fr.irisa.triskell.kermeta.language.structure.Class reflect_class = object.getFactory().getMemory().getUnit().struct_factory.createClass();
	        
		    reflect_class.setTypeDefinition( (ClassDefinition) object.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::language::ReflectiveSequence"));
		    
		    TypeVariableBinding binding = object.getFactory().getMemory().getUnit().struct_factory.createTypeVariableBinding();
		    
		    binding.setVariable((TypeVariable)reflect_class.getTypeDefinition().getTypeParameter().get(0));
		    
		    binding.setType(prop_type);
			
		    reflect_class.getTypeParamBinding().add(binding);
		    
		    metaClass = object.getFactory().createMetaClass(reflect_class);
		    
		    if (prop_type instanceof fr.irisa.triskell.kermeta.language.structure.Class && ((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeParamBinding().size() == 0) {
		        cache_reflec_seq_class.put(((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeDefinition(), metaClass);
		    }
	    }
	    
		RuntimeObject result = object.getFactory().createRuntimeObjectFromClass(metaClass);
		
		result.getData().put("RObject", object);
		result.getData().put("RProperty", property);
		
		return result;
	}
	
}
/* END OF FILE */
