/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// An interface used to access the result of parsing a
// document.
public interface ILogoParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>> getPostParseCommands();
}
