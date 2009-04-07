/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import org.eclipse.emf.common.util.EList;

import art.AddElement;
import art.ModelElement;
import art.RemoveElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.ComponentType#getPort <em>Port</em>}</li>
 *   <li>{@link art.type.ComponentType#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends ModelElement, AddElement, RemoveElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see art.type.TypePackage#getComponentType_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see art.type.TypePackage#getComponentType_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // ComponentType
