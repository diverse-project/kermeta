/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextProblem implements art.resource.artext.IArtextProblem {
	
	private java.lang.String message;
	private art.resource.artext.ArtextEProblemType type;
	
	public ArtextProblem(java.lang.String message, art.resource.artext.ArtextEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public art.resource.artext.ArtextEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
