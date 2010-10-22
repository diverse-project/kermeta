/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ILogoParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>> getPostParseCommands();
	
}
