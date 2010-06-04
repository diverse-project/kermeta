/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class SmARTextAbstractExpectedElement implements org.smartadapters.core.resource.smARText.ISmARTextExpectedElement {
	
	private java.util.Set<org.smartadapters.core.resource.smARText.ISmARTextExpectedElement> followers = new java.util.LinkedHashSet<org.smartadapters.core.resource.smARText.ISmARTextExpectedElement>();
	
	public SmARTextAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(org.smartadapters.core.resource.smARText.ISmARTextExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextExpectedElement> getFollowers() {
		return followers;
	}
	
}
