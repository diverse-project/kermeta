package art.resource.art.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see art.resource.art.IArtOptions.RESOURCE_CONTENT_TYPE
public class ArtUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  ArtUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
