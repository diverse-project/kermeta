/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextParseResult implements smartadapters4ART.resource.smARText.ISmARTextParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextCommand<smartadapters4ART.resource.smARText.ISmARTextTextResource>> commands = new java.util.ArrayList<smartadapters4ART.resource.smARText.ISmARTextCommand<smartadapters4ART.resource.smARText.ISmARTextTextResource>>();
	
	public SmARTextParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextCommand<smartadapters4ART.resource.smARText.ISmARTextTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
