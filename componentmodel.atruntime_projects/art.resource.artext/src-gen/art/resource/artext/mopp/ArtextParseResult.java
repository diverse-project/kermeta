/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextParseResult implements art.resource.artext.IArtextParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>> commands = new java.util.ArrayList<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>>();
	
	public ArtextParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
