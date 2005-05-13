/* Implementation of Kermeta base type Object */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;

public class Object {

	// Implementation of method getMetaClass called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.getMetaClass()
	public static RuntimeObject getMetaClass(RuntimeObject self) {
		return self.getMetaclass();
	}

	// Implementation of method container called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.container()
	public static RuntimeObject container(RuntimeObject self) {
		if (self.getContainer() == null) return self.getFactory().getMemory().voidINSTANCE;
		return self.getContainer();
	}

	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(self == param0) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(self == param0) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.get(~property)
	public static RuntimeObject get(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = null;
		result = (RuntimeObject)self.getProperties().get(getPropertyName(param0));
		if (getPropertyUpper(param0) == 1) {
			if (result == null) result = self.getFactory().getMemory().voidINSTANCE;
		}
		else {
			if (result == null) {
				// TODO : Find something to manage uniqueness of properties
				if (isPropertyOrdered(param0)) result =  ReflectiveCollection.createReflectiveCollection(self, param0);
				else result =  ReflectiveSequence.createReflectiveSequence(self, param0);
				self.getProperties().put(getPropertyName(param0), result);
			}
		}
		return result;
	}

	// Implementation of method set called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.~set(~property, element)
	// param0 : this RuntimeObject corresponds to a FProperty : 
	// param1 : this RuntimeObject corresponds to the value of the property for self instance (self.getProperties().get(name_of_param0))
	public static RuntimeObject set(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		set(self, param0, param1, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	public static void set(RuntimeObject self, RuntimeObject param0, RuntimeObject param1, boolean handle_opposite) {
	    
		// Unset first if there is an object
		if (isSet(self, param0) == self.getFactory().getMemory().trueINSTANCE)  unSet(self, param0);

		// set the new object
		self.getProperties().put(getPropertyName(param0), param1);
		// set containement
		if (isPropertyContainment(param0)) param1.setContainer(self);
		// handle opposite
		if(handle_opposite) {
			RuntimeObject oproperty = getPropertyOpposite(param0);
			if (oproperty != null) {
				handleOppositeProperySet(param1, oproperty, self);
			}
		}
		
	}

	/**
	 * @param param1
	 * @param oproperty
	 * @param self
	 */
	public static void handleOppositeProperySet(RuntimeObject object, RuntimeObject property, RuntimeObject value) {
		if (getPropertyUpper(property) == 1) {
			Object.set(object, property, value, false);
		}
		else {
			ReflectiveCollection.add(Object.get(object, property), value, false);
		}
	}

	// Implementation of method isSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.isSet(~property)
	public static RuntimeObject isSet(RuntimeObject self, RuntimeObject param0) {
	    
		if (self.getProperties().get(getPropertyName(param0)) != null) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method unSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.unSet(~property)
	public static RuntimeObject unSet(RuntimeObject self, RuntimeObject param0) {
		unSet(self,param0, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	public static void unSet(RuntimeObject self, RuntimeObject param0, boolean handle_opposite) {
		if (isSet(self, param0) == self.getFactory().getMemory().falseINSTANCE) return;
		RuntimeObject value = (RuntimeObject)self.getProperties().get(getPropertyName(param0));
		
		if (getPropertyUpper(param0) == 1) {
			if (isPropertyContainment(param0)) value.setContainer(null);
			self.getProperties().remove(getPropertyName(param0));
		}
		else {
			ReflectiveCollection.clear(value);
		}
		if (handle_opposite) {
			RuntimeObject oproperty = getPropertyOpposite(param0);
			if (oproperty != null) {
				handleOppositeProperyUnSet(value, oproperty);
			}
		}
	}
	
	public static void handleOppositeProperyUnSet(RuntimeObject object, RuntimeObject property) {
		if (getPropertyUpper(property) == 1) {
			Object.unSet(object, property, false);
		}
		else {
			ReflectiveCollection.clear(object, false);
		}
	}
	

	public static int getPropertyUpper(RuntimeObject property) {
		return Integer.getValue((RuntimeObject)property.getProperties().get("upper"));
	}
	
	public static RuntimeObject getPropertyOpposite(RuntimeObject property) {
		return (RuntimeObject)property.getProperties().get("opposite");
	}
	
	public static boolean isPropertyContainment(RuntimeObject property) {
		return Boolean.getValue((RuntimeObject)property.getProperties().get("isComposite"));
	}
	
	public static boolean isPropertyOrdered(RuntimeObject property) {
		return Boolean.getValue((RuntimeObject)property.getProperties().get("isOrdered"));
	}
	
	public static boolean isPropertyUnique(RuntimeObject property) {
		return Boolean.getValue((RuntimeObject)property.getProperties().get("isUnique"));
	}
	
	public static java.lang.String getPropertyName(RuntimeObject property) {
		return String.getValue((RuntimeObject)property.getProperties().get("name"));
	}
}
/* END OF FILE */
