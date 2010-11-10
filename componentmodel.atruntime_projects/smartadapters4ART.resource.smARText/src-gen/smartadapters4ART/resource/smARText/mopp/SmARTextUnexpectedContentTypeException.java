/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see smartadapters4ART.resource.smARText.ISmARTextOptions.RESOURCE_CONTENT_TYPE
 */
public class SmARTextUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SmARTextUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
