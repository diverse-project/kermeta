/*$Id : ILogoCommand.java v 1.3 May 8, 2010 9:17:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoCommand.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface ILogoCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
