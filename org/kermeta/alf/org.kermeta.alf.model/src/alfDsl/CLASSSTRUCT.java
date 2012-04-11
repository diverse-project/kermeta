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
 * A representation of the model object '<em><b>CLASSSTRUCT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.CLASSSTRUCT#getName <em>Name</em>}</li>
 *   <li>{@link alfDsl.CLASSSTRUCT#getClsop <em>Clsop</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getCLASSSTRUCT()
 * @model
 * @generated
 */
public interface CLASSSTRUCT extends EObject {
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
	 * @see alfDsl.AlfDslPackage#getCLASSSTRUCT_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alfDsl.CLASSSTRUCT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clsop</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.CLASSOP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clsop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clsop</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getCLASSSTRUCT_Clsop()
	 * @model type="alfDsl.CLASSOP" containment="true"
	 * @generated
	 */
	EList getClsop();

} // CLASSSTRUCT
