/* Implementation of Kermeta base type Object */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.FALSE;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.basetypes.TRUE;
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
		if (self.getContainer() == null) return Void.VOID;
		return self.getContainer();
	}

	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(self == param0) return TRUE.INSTANCE;
		else return FALSE.INSTANCE;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.get(~property)
	public static RuntimeObject get(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = null;
		result = (RuntimeObject)self.getProperties().get(getPropertyName(param0));
		if (getPropertyUpper(param0) == 1) {
			if (result == null) result = Void.VOID;
		}
		else {
			if (result == null) {
				// TODO : There is an error here
				if (isPropertyUnique(param0)) result =  ReflectiveCollection.createReflectiveCollection(self, param0);
				else result =  ReflectiveSequence.createReflectiveSequence(self, param0);
				self.getProperties().put(getPropertyName(param0), result);
			}
		}
		return result;
	}

	// Implementation of method set called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.~set(~property, element)
	public static RuntimeObject set(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		set(self, param0, param1, true);
		return Void.VOID;
	}
	
	public static void set(RuntimeObject self, RuntimeObject param0, RuntimeObject param1, boolean handle_opposite) {
		// Unset first if there is an object
		if (isSet(self, param0) == TRUE.INSTANCE)  unSet(self, param0);
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
		if (self.getProperties().get(getPropertyName(param0)) != null) return TRUE.INSTANCE;
		else return FALSE.INSTANCE;
	}

	// Implementation of method unSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.unSet(~property)
	public static RuntimeObject unSet(RuntimeObject self, RuntimeObject param0) {
		unSet(self,param0, true);
		return Void.VOID;
	}
	
	public static void unSet(RuntimeObject self, RuntimeObject param0, boolean handle_opposite) {
		if (isSet(self, param0) == FALSE.INSTANCE) return;
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
		return property.getProperties().get("upper") == TRUE.INSTANCE;
	}
	
	public static boolean isPropertyOrdered(RuntimeObject property) {
		return property.getProperties().get("upper") == TRUE.INSTANCE;
	}
	
	public static boolean isPropertyUnique(RuntimeObject property) {
		return property.getProperties().get("upper") == TRUE.INSTANCE;
	}
	
	public static java.lang.String getPropertyName(RuntimeObject property) {
		return String.getValue((RuntimeObject)property.getProperties().get("name"));
	}
}
/* END OF FILE */
