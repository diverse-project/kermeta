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
	   public static RuntimeObject insert(RuntimeObject string,RuntimeObject toInsert,RuntimeObject pos) {
       	java.lang.String s = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(string); 
       	java.lang.String toI = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(toInsert); 
       	java.lang.Integer pos1 = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(pos); 
       	RuntimeObject result = string.getFactory().createObjectFromClassName("kermeta::standard::String");
       	StringBuilder res = new StringBuilder(s);
       	res =res.insert(pos1, toI);
       	System.err.println(res.toString());
       	fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(result, res.toString());
      	return result; 
  
}

}
