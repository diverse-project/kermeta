/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptParseResult implements org.kermeta.kp.editor.IKptParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> commands = new java.util.ArrayList<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>>();
	
	public KptParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
