package kermeta.language.behavior;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public class TypeLiteral {
	public static RuntimeObject getTypeParametersSize(RuntimeObject prompt) {
		// classname from compilo
    	java.lang.String s = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(prompt);
    	int size = 0;
    	try {
			size = java.lang.Class.forName(s).getTypeParameters().length;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	RuntimeObject result = prompt.getFactory().createObjectFromClassName("kermeta::standard::Integer");
    	Integer.setValue(result, size);
    	return result; 
	}
}
