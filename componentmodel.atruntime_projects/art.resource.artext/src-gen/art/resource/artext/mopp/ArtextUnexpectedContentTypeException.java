/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see art.resource.artext.IArtextOptions.RESOURCE_CONTENT_TYPE
public class ArtextUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  ArtextUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
