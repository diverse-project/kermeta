/* Implementation of Kermeta base type ReflectiveSequence */

package fr.irisa.triskell.kermeta.runtime.language;

import java.util.Hashtable;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;

public class ReflectiveSequence {

	/** Implementation of method addAt called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.addAt(index, element)
	 */
	public static RuntimeObject addAt(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		// add the new object
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

	/** Implementation of method removeAt called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.removeAt(index)
	 */
	public static RuntimeObject removeAt(RuntimeObject self, RuntimeObject param0) {
		ReflectiveCollection.remove(self, param0);
		return self.getFactory().getMemory().voidINSTANCE;
	}
		
	/**
	 * Create the RuntimeObject representation of a reflective sequence which 
	 * type parameter is the type of the given <code>property</code> (repr. as a 
	 * RuntimeObject), which "owner" object is the given <code>object</code>.
	 * Example :
	 * <pre>
	 * class X {}
	 * class Object { reference r : seq X[0..*] }
	 * [...]
	 * </pre>
	 * From the above piece of code : let <code>object</code> be an instance of <code>Object</code>.
	 * Then, <code>object</code> has a property <code>r</property>, of type Y, which value 
	 * is a reflective sequence (==returned object) of elements of type Y.
	 * @param object the object that owns the property given in parameters
	 * @param property the property to which is associated the returned reflective
	 * sequence
	 * @return the RuntimeObject representation of a reflective sequence
	 */
	public static RuntimeObject createReflectiveSequence(RuntimeObject object, RuntimeObject property) {
		// Cache : ClassDefinition cd -> RuntimeObject of kermeta::language::ReflectiveCollection<cd>
	    Hashtable<GenericTypeDefinition,RuntimeObject> cache_reflec_seq_class = object.getFactory().cache_reflec_seq_class;
	    // Get the object representation of the Class of *object*
	    fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)object.getMetaclass().getKCoreObject();
	    // Get the object representation of *property*
	    Property fprop = (Property)property.getKCoreObject();
	    // Get the resolved type of *property* (as a "resolved parameterized type") 
	    Type prop_type = TypeVariableEnforcer.getBoundType(fprop.getType(), TypeVariableEnforcer.getTypeVariableBinding(self_class));
		
	    RuntimeObject metaClass = null;
	    // Try to get the RuntimeObject representation of prop_type in the cache
	    if (prop_type instanceof fr.irisa.triskell.kermeta.language.structure.Class && ((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeParamBinding().size() == 0) {
	        metaClass = cache_reflec_seq_class.get(((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeDefinition());
	    }
	    // If not found in the cache, then let's construct it.
	    if (metaClass == null) {
	        // Create a Class element, with it's type definition=ReflectiveSequence, 
	    	// and type variable binding=property.getType().
	    	fr.irisa.triskell.kermeta.language.structure.Class reflect_class = StructureFactory.eINSTANCE.createClass();
	        
		    reflect_class.setTypeDefinition( (ClassDefinition) object.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::language::ReflectiveSequence"));
		    
		    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
		    binding.setVariable((TypeVariable)reflect_class.getTypeDefinition().getTypeParameter().get(0));
		    binding.setType(prop_type);
		   
		    reflect_class.getTypeParamBinding().add(binding);
		    // Create the runtime object represenattion of reflect_class
		    metaClass = object.getFactory().createMetaClass(reflect_class);
		    // If the property's type is a Class has no type variable binding
		    // (like set X<Y>[0..*]?), add it to the cache. 
		    if (prop_type instanceof fr.irisa.triskell.kermeta.language.structure.Class && ((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeParamBinding().size() == 0) {
		        cache_reflec_seq_class.put(((fr.irisa.triskell.kermeta.language.structure.Class)prop_type).getTypeDefinition(), metaClass);
		    }
	    }

		RuntimeObject result = object.getFactory().createRuntimeObjectFromClass(metaClass);
		
		result.setRObject(object);
		result.setRProperty( property);
		
		return result;
	}
	
}
/* END OF FILE */
