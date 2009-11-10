package art.resource.art.mopp;

public class ArtParseResult implements art.resource.art.IArtParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>> commands = new java.util.ArrayList<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>>();
	
	public ArtParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
