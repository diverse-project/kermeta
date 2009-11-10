package art.resource.art.mopp;

public class ArtProblem implements art.resource.art.IArtProblem {
	
	private java.lang.String message;
	private art.resource.art.ArtEProblemType type;
	
	public ArtProblem(java.lang.String message, art.resource.art.ArtEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public art.resource.art.ArtEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
