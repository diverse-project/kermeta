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
 * A representation of the model object '<em><b>Port Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.PortTypeRef#getRef <em>Ref</em>}</li>
 *   <li>{@link art2.PortTypeRef#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getPortTypeRef()
 * @model
 * @generated
 */
public interface PortTypeRef extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(PortType)
	 * @see art2.Art2Package#getPortTypeRef_Ref()
	 * @model required="true"
	 * @generated
	 */
	PortType getRef();

	/**
	 * Sets the value of the '{@link art2.PortTypeRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(PortType value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortTypeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see art2.Art2Package#getPortTypeRef_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeMapping> getMappings();

} // PortTypeRef
