package fr.irisa.triskell.kermeta.runtime;

import java.util.Hashtable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class FrameworkExternCommand {
	private static Hashtable commands = null;
	public static FrameworkExternCommand getCommand(String id) {
		if (commands == null) {
			commands = new Hashtable();
			commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_equals_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_equals_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_and_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_and_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_not_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_not_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_or_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_or_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_compareTo_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_compareTo_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_equals_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_equals_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_plus_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_plus_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_minus_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_minus_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_times_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_times_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_div_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_div_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_mod_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_mod_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_toReal_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_toReal_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isGreater_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isGreater_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isLower_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isLower_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isLowerOrEqual_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isLowerOrEqual_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isGreaterOrEqual_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isGreaterOrEqual_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Integer_toString_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Integer_toString_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Real_plus_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Real_plus_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Real_minus_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Real_minus_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Real_times_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Real_times_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Real_div_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Real_div_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Real_toInteger_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Real_toInteger_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Real_toString_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Real_toString_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Character_compareTo_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Character_compareTo_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Character_equals_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Character_equals_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Character_toString_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Character_toString_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_compareTo_2", new fr__irisa__triskell__kermeta__runtime__basetypes__String_compareTo_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_equals_2", new fr__irisa__triskell__kermeta__runtime__basetypes__String_equals_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_plus_2", new fr__irisa__triskell__kermeta__runtime__basetypes__String_plus_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_append_2", new fr__irisa__triskell__kermeta__runtime__basetypes__String_append_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_elementAt_2", new fr__irisa__triskell__kermeta__runtime__basetypes__String_elementAt_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_indexOf_2", new fr__irisa__triskell__kermeta__runtime__basetypes__String_indexOf_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_substring_3", new fr__irisa__triskell__kermeta__runtime__basetypes__String_substring_3Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__String_size_1", new fr__irisa__triskell__kermeta__runtime__basetypes__String_size_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Collection_add_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Collection_add_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Collection_remove_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Collection_remove_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Collection_clear_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Collection_clear_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Collection_size_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Collection_size_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Collection_iterator_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Collection_iterator_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_addAt_3", new fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_addAt_3Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_removeAt_2", new fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_removeAt_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_elementAt_2", new fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_elementAt_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Iterator_hasNext_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Iterator_hasNext_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Iterator_next_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Iterator_next_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_getMetaClass_1", new fr__irisa__triskell__kermeta__runtime__language__Object_getMetaClass_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_container_1", new fr__irisa__triskell__kermeta__runtime__language__Object_container_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_equals_2", new fr__irisa__triskell__kermeta__runtime__language__Object_equals_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_get_2", new fr__irisa__triskell__kermeta__runtime__language__Object_get_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_set_3", new fr__irisa__triskell__kermeta__runtime__language__Object_set_3Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_isSet_2", new fr__irisa__triskell__kermeta__runtime__language__Object_isSet_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_unSet_2", new fr__irisa__triskell__kermeta__runtime__language__Object_unSet_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_oid_1", new fr__irisa__triskell__kermeta__runtime__language__Object_oid_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_isFrozen_1", new fr__irisa__triskell__kermeta__runtime__language__Object_isFrozen_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Object_freeze_1", new fr__irisa__triskell__kermeta__runtime__language__Object_freeze_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Class_newObject_1", new fr__irisa__triskell__kermeta__runtime__language__Class_newObject_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Class_cloneObject_2", new fr__irisa__triskell__kermeta__runtime__language__Class_cloneObject_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Class_isInstance_2", new fr__irisa__triskell__kermeta__runtime__language__Class_isInstance_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Class_isSubType_2", new fr__irisa__triskell__kermeta__runtime__language__Class_isSubType_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__Class_equals_2", new fr__irisa__triskell__kermeta__runtime__language__Class_equals_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_add_2", new fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_add_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_remove_2", new fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_remove_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_clear_1", new fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_clear_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__ReflectiveSequence_addAt_3", new fr__irisa__triskell__kermeta__runtime__language__ReflectiveSequence_addAt_3Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__ReflectiveSequence_removeAt_2", new fr__irisa__triskell__kermeta__runtime__language__ReflectiveSequence_removeAt_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_size_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_size_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_keysIterator_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_keysIterator_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_valueIterator_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_valueIterator_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_get_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_get_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_put_3", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_put_3Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_remove_2", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_remove_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Map_clear_1", new fr__irisa__triskell__kermeta__runtime__basetypes__Map_clear_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_write_1", new fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_write_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_writeln_1", new fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_writeln_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_read_1", new fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_read_1Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__DynamicExpression_parse_2", new fr__irisa__triskell__kermeta__runtime__language__DynamicExpression_parse_2Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__language__DynamicExpression_execute_3", new fr__irisa__triskell__kermeta__runtime__language__DynamicExpression_execute_3Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Resource_save_4", new fr__irisa__triskell__kermeta__runtime__basetypes__Resource_save_4Comd());
commands.put("fr__irisa__triskell__kermeta__runtime__basetypes__Resource_load_4", new fr__irisa__triskell__kermeta__runtime__basetypes__Resource_load_4Comd());

		}
		return (FrameworkExternCommand)commands.get(id);
	}
	public abstract RuntimeObject execute(RuntimeObject[] params);
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_equals_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.equals(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_and_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.and(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_not_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.not(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Boolean_or_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.or(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_compareTo_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.compareTo(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_equals_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.equals(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_plus_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.plus(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_minus_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.minus(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_times_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.times(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_div_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.div(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_mod_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.mod(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_toReal_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.toReal(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isGreater_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.isGreater(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isLower_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.isLower(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isLowerOrEqual_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.isLowerOrEqual(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_isGreaterOrEqual_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.isGreaterOrEqual(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Integer_toString_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Integer.toString(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Real_plus_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Real.plus(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Real_minus_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Real.minus(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Real_times_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Real.times(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Real_div_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Real.div(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Real_toInteger_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Real.toInteger(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Real_toString_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Real.toString(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Character_compareTo_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Character.compareTo(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Character_equals_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Character.equals(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Character_toString_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Character.toString(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_compareTo_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.compareTo(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_equals_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.equals(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_plus_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.plus(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_append_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.append(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_elementAt_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.elementAt(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_indexOf_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.indexOf(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_substring_3Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.substring(params[0], params[1], params[2]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__String_size_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.String.size(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Collection_add_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Collection_remove_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Collection.remove(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Collection_clear_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Collection.clear(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Collection_size_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Collection.size(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Collection_iterator_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Collection.iterator(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_addAt_3Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection.addAt(params[0], params[1], params[2]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_removeAt_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection.removeAt(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__OrderedCollection_elementAt_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.OrderedCollection.elementAt(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Iterator_hasNext_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Iterator.hasNext(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Iterator_next_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Iterator.next(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_getMetaClass_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.getMetaClass(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_container_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.container(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_equals_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.equals(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_get_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.get(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_set_3Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.set(params[0], params[1], params[2]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_isSet_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.isSet(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_unSet_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.unSet(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_oid_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.oid(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_isFrozen_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.isFrozen(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Object_freeze_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Object.freeze(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Class_newObject_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Class.newObject(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Class_cloneObject_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Class.cloneObject(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Class_isInstance_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Class.isInstance(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Class_isSubType_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Class.isSubType(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__Class_equals_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.Class.equals(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_add_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.add(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_remove_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.remove(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__ReflectiveCollection_clear_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection.clear(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__ReflectiveSequence_addAt_3Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence.addAt(params[0], params[1], params[2]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__ReflectiveSequence_removeAt_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence.removeAt(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_size_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.size(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_keysIterator_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.keysIterator(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_valueIterator_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.valueIterator(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_get_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.get(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_put_3Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.put(params[0], params[1], params[2]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_remove_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.remove(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Map_clear_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Map.clear(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_write_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.StdIO.write(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_writeln_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.StdIO.writeln(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__StdIO_read_1Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.StdIO.read(params[0]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__DynamicExpression_parse_2Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.DynamicExpression.parse(params[0], params[1]);
	}
}

class fr__irisa__triskell__kermeta__runtime__language__DynamicExpression_execute_3Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.language.DynamicExpression.execute(params[0], params[1], params[2]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Resource_save_4Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Resource.save(params[0], params[1], params[2], params[3]);
	}
}

class fr__irisa__triskell__kermeta__runtime__basetypes__Resource_load_4Comd extends FrameworkExternCommand {
	public RuntimeObject execute(RuntimeObject[] params) {
		return (RuntimeObject)fr.irisa.triskell.kermeta.runtime.basetypes.Resource.load(params[0], params[1], params[2], params[3]);
	}
}
