/*$Id : LogoUnexpectedContentTypeException.java v 1.3 May 8, 2010 9:17:55 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoUnexpectedContentTypeException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoOptions.RESOURCE_CONTENT_TYPE
public class LogoUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  LogoUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
