/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

public interface ILogoReferenceCache {
	public Object get(String identifier);
	public void put(String identifier, Object target);
}
