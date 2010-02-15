/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.PortType#getImpl <em>Impl</em>}</li>
 *   <li>{@link art2.PortType#getInterface <em>Interface</em>}</li>
 *   <li>{@link art2.PortType#isSynchrone <em>Synchrone</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getPortType()
 * @model
 * @generated
 */
public interface PortType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' reference.
	 * @see #setImpl(AbstractPortImpl)
	 * @see art2.Art2Package#getPortType_Impl()
	 * @model required="true"
	 * @generated
	 */
	AbstractPortImpl getImpl();

	/**
	 * Sets the value of the '{@link art2.PortType#getImpl <em>Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(AbstractPortImpl value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(AbstractDataType)
	 * @see art2.Art2Package#getPortType_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractDataType getInterface();

	/**
	 * Sets the value of the '{@link art2.PortType#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(AbstractDataType value);

	/**
	 * Returns the value of the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchrone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchrone</em>' attribute.
	 * @see #setSynchrone(boolean)
	 * @see art2.Art2Package#getPortType_Synchrone()
	 * @model
	 * @generated
	 */
	boolean isSynchrone();

	/**
	 * Sets the value of the '{@link art2.PortType#isSynchrone <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchrone</em>' attribute.
	 * @see #isSynchrone()
	 * @generated
	 */
	void setSynchrone(boolean value);

} // PortType
