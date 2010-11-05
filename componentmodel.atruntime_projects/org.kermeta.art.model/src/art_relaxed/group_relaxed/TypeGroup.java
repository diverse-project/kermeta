/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed;

import art_relaxed.type_relaxed.ComponentType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.group_relaxed.TypeGroup#getTypes <em>Types</em>}</li>
 *   <li>{@link art_relaxed.group_relaxed.TypeGroup#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.group_relaxed.Group_relaxedPackage#getTypeGroup()
 * @model
 * @generated
 */
public interface TypeGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.ComponentType}.
	 * It is bidirectional and its opposite is '{@link art_relaxed.type_relaxed.ComponentType#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see art_relaxed.group_relaxed.Group_relaxedPackage#getTypeGroup_Types()
	 * @see art_relaxed.type_relaxed.ComponentType#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ComponentType> getTypes();

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.group_relaxed.TypeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see art_relaxed.group_relaxed.Group_relaxedPackage#getTypeGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeGroup> getSubGroups();

} // TypeGroup
