/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

public interface IKpReferenceCache {
	public Object get(String identifier);
	public void put(String identifier, Object target);
}
