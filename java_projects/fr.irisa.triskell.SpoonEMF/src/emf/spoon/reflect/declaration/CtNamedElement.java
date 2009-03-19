/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtNamedElement.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.reflect.reference.CtReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtNamedElement#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtNamedElement#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtNamedElement()
 * @model
 * @generated
 */
public interface CtNamedElement extends CtElement, CtModifiable, spoon.reflect.declaration.CtNamedElement {
	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtNamedElement_SimpleName()
	 * @model dataType="emf.spoon.String"
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtNamedElement#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtNamedElement_Reference()
	 * @model changeable="false"
	 * @generated
	 */
	CtReference getReference();

} // CtNamedElement