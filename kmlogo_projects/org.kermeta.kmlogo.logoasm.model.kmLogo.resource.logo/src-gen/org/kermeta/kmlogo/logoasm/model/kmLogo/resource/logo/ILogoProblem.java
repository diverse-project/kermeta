/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

public interface ILogoProblem {
	public String getMessage();
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType getType();
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix> getQuickFixes();
}
