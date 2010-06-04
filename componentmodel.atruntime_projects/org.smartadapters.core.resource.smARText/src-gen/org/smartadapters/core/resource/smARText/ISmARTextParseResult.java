/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText;

// An interface used to access the result of parsing a
// document.
public interface ISmARTextParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>> getPostParseCommands();
}
