/* Implementation of Kermeta base type Collection */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;

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
	public static RuntimeObject iterator(RuntimeObject self) {
		
	    FClass it_class = self.getFactory().getMemory().getUnit().struct_factory.createFClass();
	    
	    it_class.setFClassDefinition((FClassDefinition)self.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Iterator"));
	    
	    FTypeVariableBinding binding = self.getFactory().getMemory().getUnit().struct_factory.createFTypeVariableBinding();
	    
	    binding.setFVariable((FTypeVariable)it_class.getFClassDefinition().getFTypeParameter().get(0));
	    
	    FClass self_class = (FClass)self.getMetaclass().getData().get("kcoreObject");
	    
	    binding.setFType(((FTypeVariableBinding)self_class.getFTypeParamBinding().get(0)).getFType());
	    
	    it_class.getFTypeParamBinding().add(binding);
	    
	    RuntimeObject result = self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass(it_class));
		
		Iterator.setValue(result, ((ArrayList)getArrayList(self).clone()).iterator());
		return result;
	}

	public static ArrayList getArrayList(RuntimeObject collection) {
		if (!collection.getData().containsKey("CollectionArrayList"))
		{
		    collection.getData().put("CollectionArrayList", new ArrayList());
		}
		return (ArrayList)collection.getData().get("CollectionArrayList");
	}

	
}
/* END OF FILE */
