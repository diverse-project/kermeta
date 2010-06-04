/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextParseResult implements org.smartadapters.core.resource.smARText.ISmARTextParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>> commands = new java.util.ArrayList<org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>>();
	
	public SmARTextParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
