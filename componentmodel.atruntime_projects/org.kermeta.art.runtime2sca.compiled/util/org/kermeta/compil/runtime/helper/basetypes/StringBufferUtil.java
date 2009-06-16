
package org.kermeta.compil.runtime.helper.basetypes;

import java.lang.StringBuffer;

/**
 * Basically this is a kermeta wrapper for java.lang.StringBuffer.
 * Just the operation append over String is supported
 * 
 *
 */
public class StringBufferUtil {

	
	public static kermeta.utils.StringBuffer append(kermeta.utils.StringBuffer self, java.lang.String str){
		if( self.getContent() == null ) {
			self.setContent(new StringBuffer());
		}
		self.getContent().append(str);
		return self;
	}
	
	public static java.lang.Integer length(kermeta.utils.StringBuffer self){
		if( self.getContent() == null ) {
			self.setContent(new StringBuffer());
		}
		return self.getContent().length();
	}	
	
	/**
	 * convert the StringBuffer to String
	 * @param self
	 * @return the String value of the current StringBuffer
	 */
	public static java.lang.String toString(kermeta.utils.StringBuffer self){
		if( self.getContent() == null ) {
			self.setContent(new StringBuffer());
		}
		return self.getContent().toString();
	}
	
	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::StringBuffer::equals(element)
	 */
	public static java.lang.Boolean equals(kermeta.utils.StringBuffer self, kermeta.utils.StringBuffer param0) {
		if( self.getContent() == null ) {
			self.setContent(new StringBuffer());
		}
		return self.toString().equals(param0.toString());
	}
	
	

}
