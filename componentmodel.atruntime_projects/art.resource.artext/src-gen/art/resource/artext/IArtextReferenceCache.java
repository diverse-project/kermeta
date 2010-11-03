/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

public interface IArtextReferenceCache {
	public java.lang.Object get(java.lang.String identifier);
	public void put(java.lang.String identifier, java.lang.Object target);
}
