/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class CoreAbstractExpectedElement implements org.smartadapters.core.resource.core.ICoreExpectedElement {
	
	private java.util.Set<org.smartadapters.core.resource.core.ICoreExpectedElement> followers = new java.util.LinkedHashSet<org.smartadapters.core.resource.core.ICoreExpectedElement>();
	
	public CoreAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(org.smartadapters.core.resource.core.ICoreExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<org.smartadapters.core.resource.core.ICoreExpectedElement> getFollowers() {
		return followers;
	}
	
}
