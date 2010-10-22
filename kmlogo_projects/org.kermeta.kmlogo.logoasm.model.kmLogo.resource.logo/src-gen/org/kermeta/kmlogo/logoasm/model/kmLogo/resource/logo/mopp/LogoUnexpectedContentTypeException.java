/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoOptions.RESOURCE_CONT
 * ENT_TYPE
 */
public class LogoUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  LogoUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
