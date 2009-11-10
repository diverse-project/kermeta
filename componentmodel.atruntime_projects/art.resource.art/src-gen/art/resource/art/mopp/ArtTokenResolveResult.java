package art.resource.art.mopp;

// A basic implementation of the ITokenResolveResult interface.
//
public class ArtTokenResolveResult implements art.resource.art.IArtTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public ArtTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
}
