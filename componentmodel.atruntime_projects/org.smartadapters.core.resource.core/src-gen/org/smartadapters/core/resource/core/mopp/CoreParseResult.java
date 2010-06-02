/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreParseResult implements org.smartadapters.core.resource.core.ICoreParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>> commands = new java.util.ArrayList<org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>>();
	
	public CoreParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
