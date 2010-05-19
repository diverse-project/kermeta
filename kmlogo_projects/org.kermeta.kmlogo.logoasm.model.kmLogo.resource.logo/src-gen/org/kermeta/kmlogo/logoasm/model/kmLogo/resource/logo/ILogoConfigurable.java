/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// Implementors of this interface can be configured by a
// map of options (or parameters).
public interface ILogoConfigurable {
	
	// Passed the options given by the map to the configurable
	// object.
	public void setOptions(java.util.Map<?,?> options);
}
