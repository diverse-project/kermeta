/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.group;

import art.instance.ComponentInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.group.InstanceGroup#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.group.GroupPackage#getInstanceGroup()
 * @model
 * @generated
 */
public interface InstanceGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link art.instance.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link art.instance.ComponentInstance#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see art.group.GroupPackage#getInstanceGroup_Instances()
	 * @see art.instance.ComponentInstance#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ComponentInstance> getInstances();

} // InstanceGroup
