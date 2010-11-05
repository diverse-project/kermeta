/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed;

import art_relaxed.instance_relaxed.ComponentInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.group_relaxed.InstanceGroup#getInstances <em>Instances</em>}</li>
 *   <li>{@link art_relaxed.group_relaxed.InstanceGroup#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.group_relaxed.Group_relaxedPackage#getInstanceGroup()
 * @model
 * @generated
 */
public interface InstanceGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link art_relaxed.instance_relaxed.ComponentInstance#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see art_relaxed.group_relaxed.Group_relaxedPackage#getInstanceGroup_Instances()
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ComponentInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.group_relaxed.InstanceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see art_relaxed.group_relaxed.Group_relaxedPackage#getInstanceGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceGroup> getSubGroups();

} // InstanceGroup
