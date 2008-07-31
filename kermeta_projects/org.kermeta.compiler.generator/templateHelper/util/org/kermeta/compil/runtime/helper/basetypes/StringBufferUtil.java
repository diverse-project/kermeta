
package org.kermeta.compil.runtime.helper.basetypes;

/**
 * Basically this is a kermeta wrapper for java.lang.StringBuffer.
 * Just the operation append over String is supported
 * 
 *
 */
public class StringBufferUtil {

	
	public static StringBuffer append(StringBuffer self, java.lang.String arg0){
		return self.append(arg0);
	}
	
	public static java.lang.Integer length(StringBuffer self){
		return self.length();
	}	
	
	/**
	 * convert the StringBuffer to String
	 * @param self
	 * @return the String value of the current StringBuffer
	 */
	public static java.lang.String toString(StringBuffer self){
		return self.toString();
	}
	
	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::StringBuffer::equals(element)
	 */
	public static java.lang.Boolean equals(StringBuffer self, StringBuffer param0) {
		return self.toString().equals(param0.toString());
	}

}
