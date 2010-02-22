/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.CompositeType#getChilds <em>Childs</em>}</li>
 *   <li>{@link art2.CompositeType#getChildPortTypes <em>Child Port Types</em>}</li>
 *   <li>{@link art2.CompositeType#getWires <em>Wires</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getCompositeType()
 * @model
 * @generated
 */
public interface CompositeType extends ComponentType {
	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link art2.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see art2.Art2Package#getCompositeType_Childs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getChilds();

	/**
	 * Returns the value of the '<em><b>Child Port Types</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Port Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Port Types</em>' containment reference list.
	 * @see art2.Art2Package#getCompositeType_ChildPortTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getChildPortTypes();

	/**
	 * Returns the value of the '<em><b>Wires</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wires</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wires</em>' reference.
	 * @see #setWires(Wire)
	 * @see art2.Art2Package#getCompositeType_Wires()
	 * @model
	 * @generated
	 */
	Wire getWires();

	/**
	 * Sets the value of the '{@link art2.CompositeType#getWires <em>Wires</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wires</em>' reference.
	 * @see #getWires()
	 * @generated
	 */
	void setWires(Wire value);

} // CompositeType
