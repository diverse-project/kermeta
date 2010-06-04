/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText;

// An element that is expected at a given position in a resource
// stream.
public interface ISmARTextExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.smartadapters.core.resource.smARText.ISmARTextExpectedElement follower);
	public java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextExpectedElement> getFollowers();
}
