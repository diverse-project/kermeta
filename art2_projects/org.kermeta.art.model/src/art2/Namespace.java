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
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.Namespace#getChilds <em>Childs</em>}</li>
 *   <li>{@link art2.Namespace#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see art2.Art2Package#getNamespace_Childs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getChilds();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Namespace)
	 * @see art2.Art2Package#getNamespace_Parent()
	 * @model
	 * @generated
	 */
	Namespace getParent();

	/**
	 * Sets the value of the '{@link art2.Namespace#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Namespace value);

} // Namespace
