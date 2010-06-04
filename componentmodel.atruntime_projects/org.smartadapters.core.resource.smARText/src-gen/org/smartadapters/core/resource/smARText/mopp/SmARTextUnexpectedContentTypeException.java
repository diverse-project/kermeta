/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see org.smartadapters.core.resource.smARText.ISmARTextOptions.RESOURCE_CONTENT_TYPE
public class SmARTextUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SmARTextUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
