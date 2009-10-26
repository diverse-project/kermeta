/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.group;

import art.type.ComponentType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.group.TypeGroup#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.group.GroupPackage#getTypeGroup()
 * @model
 * @generated
 */
public interface TypeGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link art.type.ComponentType}.
	 * It is bidirectional and its opposite is '{@link art.type.ComponentType#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see art.group.GroupPackage#getTypeGroup_Types()
	 * @see art.type.ComponentType#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ComponentType> getTypes();

} // TypeGroup
