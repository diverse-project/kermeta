/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IKptParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> getPostParseCommands();
	
}
