/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.group;

import org.eclipse.emf.common.util.EList;

import pattern.art.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.group.InstanceGroup#getInstances <em>Instances</em>}</li>
 *   <li>{@link pattern.art.group.InstanceGroup#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.group.GroupPackage#getInstanceGroup()
 * @model
 * @generated
 */
public interface InstanceGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.instance.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link pattern.art.instance.ComponentInstance#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see pattern.art.group.GroupPackage#getInstanceGroup_Instances()
	 * @see pattern.art.instance.ComponentInstance#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ComponentInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.group.InstanceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see pattern.art.group.GroupPackage#getInstanceGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceGroup> getSubGroups();

} // InstanceGroup
