/* Implementation of Kermeta base type Object */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;

public class Object {

	// Implementation of method getMetaClass called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.getMetaClass()
	public static KermetaObject getMetaClass(KermetaObject self) {
		return self.getMetaclass();
	}

	// Implementation of method container called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.container()
	public static KermetaObject container(KermetaObject self) {
		if (self.getContainer() == null) return Void.VOID;
		return self.getContainer();
	}

	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.equals(element)
	public static KermetaObject equals(KermetaObject self, KermetaObject param0) {
		if(self == param0) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.get(~property)
	public static KermetaObject get(KermetaObject self, KermetaObject param0) {
		KermetaObject result = null;
		result = (KermetaObject)self.getProperties().get(getPropertyName(param0));
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
	public static KermetaObject set(KermetaObject self, KermetaObject param0, KermetaObject param1) {
		set(self, param0, param1, true);
		return Void.VOID;
	}
	
	public static void set(KermetaObject self, KermetaObject param0, KermetaObject param1, boolean handle_opposite) {
		// Unset first if there is an object
		if (isSet(self, param0) == Boolean.TRUE)  unSet(self, param0);
		// set the new object
		self.getProperties().put(getPropertyName(param0), param1);
		// set containement
		if (isPropertyContainment(param0)) param1.setContainer(self);
		// handle opposite
		if(handle_opposite) {
			KermetaObject oproperty = getPropertyOpposite(param0);
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
	public static void handleOppositeProperySet(KermetaObject object, KermetaObject property, KermetaObject value) {
		if (getPropertyUpper(property) == 1) {
			Object.set(object, property, value, false);
		}
		else {
			ReflectiveCollection.add(Object.get(object, property), value, false);
		}
	}

	// Implementation of method isSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.isSet(~property)
	public static KermetaObject isSet(KermetaObject self, KermetaObject param0) {
		if (self.getProperties().get(getPropertyName(param0)) != null) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method unSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.unSet(~property)
	public static KermetaObject unSet(KermetaObject self, KermetaObject param0) {
		unSet(self,param0, true);
		return Void.VOID;
	}
	
	public static void unSet(KermetaObject self, KermetaObject param0, boolean handle_opposite) {
		if (isSet(self, param0) == Boolean.FALSE) return;
		KermetaObject value = (KermetaObject)self.getProperties().get(getPropertyName(param0));
		if (getPropertyUpper(param0) == 1) {
			if (isPropertyContainment(param0)) value.setContainer(null);
			self.getProperties().remove(getPropertyName(param0));
		}
		else {
			ReflectiveCollection.clear(value);
		}
		if (handle_opposite) {
			KermetaObject oproperty = getPropertyOpposite(param0);
			if (oproperty != null) {
				handleOppositeProperyUnSet(value, oproperty);
			}
		}
	}
	
	public static void handleOppositeProperyUnSet(KermetaObject object, KermetaObject property) {
		if (getPropertyUpper(property) == 1) {
			Object.unSet(object, property, false);
		}
		else {
			ReflectiveCollection.clear(object, false);
		}
	}
	

	public static int getPropertyUpper(KermetaObject property) {
		return Integer.getValue((KermetaObject)property.getProperties().get("upper"));
	}
	
	public static KermetaObject getPropertyOpposite(KermetaObject property) {
		return (KermetaObject)property.getProperties().get("opposite");
	}
	
	public static boolean isPropertyContainment(KermetaObject property) {
		return property.getProperties().get("upper") == Boolean.TRUE;
	}
	
	public static boolean isPropertyOrdered(KermetaObject property) {
		return property.getProperties().get("upper") == Boolean.TRUE;
	}
	
	public static boolean isPropertyUnique(KermetaObject property) {
		return property.getProperties().get("upper") == Boolean.TRUE;
	}
	
	public static java.lang.String getPropertyName(KermetaObject property) {
		return String.getValue((KermetaObject)property.getProperties().get("name"));
	}
}
/* END OF FILE */
