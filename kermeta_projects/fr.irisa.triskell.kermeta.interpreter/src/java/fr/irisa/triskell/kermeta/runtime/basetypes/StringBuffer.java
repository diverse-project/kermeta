/* $Id: StringBuffer.java,v 1.2 2007-09-04 08:27:39 fmunoz Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : StringBuffer.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 03 September 2007
* Author : Freddy Munoz
*/ 
package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
/**
 * Basically this is a kermeta wrapper for java.lang.StringBuffer.
 * Just the operation append over String is supported
 * 
 *
 */
public class StringBuffer {

	
	public static RuntimeObject append(RuntimeObject self, RuntimeObject arg0){
		java.lang.StringBuffer buffer=getStringBuffer(self);
		buffer.append((java.lang.String)arg0.getData().get("StringValue"));
		return self;
	}
	
	/**
	 * Get the StringBuffer value of the RuntimeObject, or create a new with
	 * an initial capacity of 32 elements if it does not exist.
	 * @param self
	 * @return The StringBuffer value of the given RuntimeObject, or a new value if it does not exist.
	 */
	public static java.lang.StringBuffer getStringBuffer(RuntimeObject self){
		if(!self.getData().containsKey("StringBuffer")) self.getData().put("StringBuffer", new java.lang.StringBuffer(32));
		return (java.lang.StringBuffer) self.getData().get("StringBuffer");
	}
	
	/*public static java.lang.StringBuffer createStringBuffer(RuntimeObject self,int size){
		
		return null;
	}
	
	public static RuntimeObject createStringBuffer(RuntimeObject self, RuntimeObject arg0){
		
		return null;
	}*/
	/**
	 * convert the StringBuffer to String
	 * @param self
	 * @return the String value of the current StringBuffer
	 */
	public static RuntimeObject toString(RuntimeObject self){
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		String.setValue(result, getStringBuffer(self).toString());
		return result;
	}
}
