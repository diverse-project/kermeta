package kermeta.standard;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public class String {
	   public static RuntimeObject lastIndexOf(RuntimeObject prompt, RuntimeObject tok) {
	        	java.lang.String s = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(prompt); 
	        	java.lang.String tok1 = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tok); 
	        	RuntimeObject result = prompt.getFactory().createObjectFromClassName("kermeta::standard::Integer");
	        	Integer.setValue(result, s.lastIndexOf(tok1));
	        	return result; 
	   }
}
