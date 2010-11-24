/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class KptAbstractExpectedElement implements org.kermeta.kp.editor.IKptExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public KptAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.kermeta.kp.editor.IKptExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
