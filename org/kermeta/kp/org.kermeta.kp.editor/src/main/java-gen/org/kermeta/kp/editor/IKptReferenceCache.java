/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

public interface IKptReferenceCache {
	public java.lang.Object get(java.lang.String identifier);
	public void put(java.lang.String identifier, java.lang.Object target);
}
