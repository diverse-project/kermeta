/* $Id: StringBuffer.java,v 1.3 2007-09-04 13:01:29 cfaucher Exp $
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
		java.lang.StringBuffer buffer=getValue(self);
		buffer.append((java.lang.String)arg0.getData().get("StringValue"));
		return self;
	}
	
	/**
	 * Get the StringBuffer value of the RuntimeObject
	 * @param str
	 * @return The StringBuffer value of the given RuntimeObject, or a new value if it does not exist.
	 */
	public static java.lang.StringBuffer getValue(RuntimeObject str) {
		if (!str.getData().containsKey("StringBufferValue")) setValue(str, null);
		return (java.lang.StringBuffer)str.getData().get("StringBufferValue");
	}
	
	/** method used to set a RuntimeObject StringBuffer with a java value
	 * @param str
	 * @param value
	 */
	public static void setValue(RuntimeObject str, java.lang.StringBuffer value) {
		if(value==null) {
			value = new java.lang.StringBuffer(32); //create a new with an initial capacity of 32 elements if it does not exist.
		}
	    str.getData().put("StringBufferValue", value);
	}
	
	/**
	 * convert the StringBuffer to String
	 * @param self
	 * @return the String value of the current StringBuffer
	 */
	public static RuntimeObject toString(RuntimeObject self){
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		String.setValue(result, getValue(self).toString());
		return result;
	}
	
	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::StringBuffer::equals(element)
	 */
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self).toString().equals(getValue(param0).toString())) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	/**
	 * TODO Not implemented yet
	 * @param self
	 * @param size
	 * @return
	 */
	private static java.lang.StringBuffer createStringBuffer(RuntimeObject self,int size){
	
	return null;
	}
	
	/**
	 * TODO Not implemented yet
	 * @param self
	 * @param arg0
	 * @return
	 */
	private static RuntimeObject createStringBuffer(RuntimeObject self, RuntimeObject arg0){
		
		return null;
	}
}
