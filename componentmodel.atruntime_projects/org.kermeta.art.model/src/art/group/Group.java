/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.group;

import art.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.group.Group#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.group.GroupPackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link art.group.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see art.group.GroupPackage#getGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getSubGroups();

} // Group
