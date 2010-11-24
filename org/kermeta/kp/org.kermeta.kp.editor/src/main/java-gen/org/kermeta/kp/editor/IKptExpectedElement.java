/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IKptExpectedElement {
	
	public java.lang.String getTokenName();
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	public void addFollower(org.kermeta.kp.editor.IKptExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	public java.util.Collection<org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
}
