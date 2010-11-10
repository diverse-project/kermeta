/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class SmARTextTokenResolveResult implements smartadapters4ART.resource.smARText.ISmARTextTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public SmARTextTokenResolveResult() {
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
