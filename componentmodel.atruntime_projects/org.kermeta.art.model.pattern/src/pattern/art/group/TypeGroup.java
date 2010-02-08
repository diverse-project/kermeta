/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.group;

import org.eclipse.emf.common.util.EList;

import pattern.art.type.ComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.group.TypeGroup#getTypes <em>Types</em>}</li>
 *   <li>{@link pattern.art.group.TypeGroup#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.group.GroupPackage#getTypeGroup()
 * @model
 * @generated
 */
public interface TypeGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.type.ComponentType}.
	 * It is bidirectional and its opposite is '{@link pattern.art.type.ComponentType#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see pattern.art.group.GroupPackage#getTypeGroup_Types()
	 * @see pattern.art.type.ComponentType#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ComponentType> getTypes();

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.group.TypeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see pattern.art.group.GroupPackage#getTypeGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeGroup> getSubGroups();

} // TypeGroup
