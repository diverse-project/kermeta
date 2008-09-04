
package org.kermeta.compil.runtime.helper.basetypes;

/**
 * Basically this is a kermeta wrapper for java.lang.StringBuffer.
 * Just the operation append over String is supported
 * 
 *
 */
public class StringBufferUtil {

	
	public static kermeta.utils.StringBuffer append(kermeta.utils.StringBuffer self, java.lang.String arg0){
		return null;
	}
	
	public static java.lang.Integer length(kermeta.utils.StringBuffer self){
		return self.length();
	}	
	
	/**
	 * convert the StringBuffer to String
	 * @param self
	 * @return the String value of the current StringBuffer
	 */
	public static java.lang.String toString(kermeta.utils.StringBuffer self){
		return self.toString();
	}
	
	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::StringBuffer::equals(element)
	 */
	public static java.lang.Boolean equals(kermeta.utils.StringBuffer self, kermeta.utils.StringBuffer param0) {
		return self.toString().equals(param0.toString());
	}
	
	

}
