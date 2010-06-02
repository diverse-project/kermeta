/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core;

// An element that is expected at a given position in a resource
// stream.
public interface ICoreExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.smartadapters.core.resource.core.ICoreExpectedElement follower);
	public java.util.Collection<org.smartadapters.core.resource.core.ICoreExpectedElement> getFollowers();
}
