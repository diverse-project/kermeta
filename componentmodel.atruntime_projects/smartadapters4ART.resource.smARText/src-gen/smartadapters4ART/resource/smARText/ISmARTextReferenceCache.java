/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText;

public interface ISmARTextReferenceCache {
	public Object get(String identifier);
	public void put(String identifier, Object target);
}
