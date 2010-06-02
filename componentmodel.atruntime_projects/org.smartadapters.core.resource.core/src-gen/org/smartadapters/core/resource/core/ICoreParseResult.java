/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core;

// An interface used to access the result of parsing a
// document.
public interface ICoreParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>> getPostParseCommands();
}
