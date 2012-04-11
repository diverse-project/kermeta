/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.CLASSOP#getName <em>Name</em>}</li>
 *   <li>{@link alfDsl.CLASSOP#getStat <em>Stat</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getCLASSOP()
 * @model
 * @generated
 */
public interface CLASSOP extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alfDsl.AlfDslPackage#getCLASSOP_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alfDsl.CLASSOP#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stat</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getCLASSOP_Stat()
	 * @model type="alfDsl.Statement" containment="true"
	 * @generated
	 */
	EList getStat();

} // CLASSOP
